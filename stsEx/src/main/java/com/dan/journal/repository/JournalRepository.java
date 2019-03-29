package com.dan.journal.repository;

import com.dan.journal.domain.JournalEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<JournalEntry, Long> {
}
