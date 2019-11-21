/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author k00194902
 */
@Entity
@Table(name = "guests")
@XmlRootElement
@NamedQueries(
{
    @NamedQuery(name = "Guests.findAll", query = "SELECT g FROM Guests g")
    , @NamedQuery(name = "Guests.findByGuestId", query = "SELECT g FROM Guests g WHERE g.guestId = :guestId")
    , @NamedQuery(name = "Guests.findByGuestFname", query = "SELECT g FROM Guests g WHERE g.guestFname = :guestFname")
    , @NamedQuery(name = "Guests.findByGuestLname", query = "SELECT g FROM Guests g WHERE g.guestLname = :guestLname")
    , @NamedQuery(name = "Guests.findByGuestPhoneNum", query = "SELECT g FROM Guests g WHERE g.guestPhoneNum = :guestPhoneNum")
    , @NamedQuery(name = "Guests.findByGuestRoomNum", query = "SELECT g FROM Guests g WHERE g.guestRoomNum = :guestRoomNum")
})
public class Guests implements Serializable
{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "GUEST_ID")
    private Integer guestId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "GUEST_FNAME")
    private String guestFname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "GUEST_LNAME")
    private String guestLname;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GUEST_PHONE_NUM")
    private int guestPhoneNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GUEST_ROOM_NUM")
    private int guestRoomNum;

    public Guests()
    {
    }

    public Guests(Integer guestId)
    {
	this.guestId = guestId;
    }

    public Guests(Integer guestId, String guestFname, String guestLname, int guestPhoneNum, int guestRoomNum)
    {
	this.guestId = guestId;
	this.guestFname = guestFname;
	this.guestLname = guestLname;
	this.guestPhoneNum = guestPhoneNum;
	this.guestRoomNum = guestRoomNum;
    }

    public Integer getGuestId()
    {
	return guestId;
    }

    public void setGuestId(Integer guestId)
    {
	this.guestId = guestId;
    }

    public String getGuestFname()
    {
	return guestFname;
    }

    public void setGuestFname(String guestFname)
    {
	this.guestFname = guestFname;
    }

    public String getGuestLname()
    {
	return guestLname;
    }

    public void setGuestLname(String guestLname)
    {
	this.guestLname = guestLname;
    }

    public int getGuestPhoneNum()
    {
	return guestPhoneNum;
    }

    public void setGuestPhoneNum(int guestPhoneNum)
    {
	this.guestPhoneNum = guestPhoneNum;
    }

    public int getGuestRoomNum()
    {
	return guestRoomNum;
    }

    public void setGuestRoomNum(int guestRoomNum)
    {
	this.guestRoomNum = guestRoomNum;
    }

    @Override
    public int hashCode()
    {
	int hash = 0;
	hash += (guestId != null ? guestId.hashCode() : 0);
	return hash;
    }

    @Override
    public boolean equals(Object object)
    {
	// TODO: Warning - this method won't work in the case the id fields are not set
	if (!(object instanceof Guests))
	{
	    return false;
	}
	Guests other = (Guests) object;
	if ((this.guestId == null && other.guestId != null) || (this.guestId != null && !this.guestId.equals(other.guestId)))
	{
	    return false;
	}
	return true;
    }

    @Override
    public String toString()
    {
	return "entities.Guests[ guestId=" + guestId + " ]";
    }
    
}
