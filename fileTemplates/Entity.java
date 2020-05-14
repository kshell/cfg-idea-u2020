#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
#parse("File Header.java")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ${NAME} {
}
