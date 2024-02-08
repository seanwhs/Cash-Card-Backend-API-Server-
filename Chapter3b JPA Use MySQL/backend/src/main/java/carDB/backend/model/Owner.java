//Owner.java
package carDB.backend.model;
import java.util.List;
import java.util.Objects;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Owner {
    
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long ownerId;
	private String firstname, lastname;

	public Owner() {
	}

	public Owner(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
	private List<Car> cars;

    @Override
    public int hashCode() {
        return Objects.hash(ownerId); 
    }
}
