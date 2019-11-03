package name.brucephillips.conferencedemo.repositories;

import name.brucephillips.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
