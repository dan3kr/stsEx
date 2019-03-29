package com.dan.journal;

import com.dan.journal.domain.JournalEntry;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NewClassTests{

    @Test
    public void t1() throws ParseException {
        JournalEntry journalEntry = new JournalEntry("으미", "으미 계획대로 안되네", "2019-03-29");
        NewClass<JournalEntry> newClassString = new NewClass<>();
        newClassString.setData(journalEntry);
        Assert.assertEquals(newClassString.getData().getTitle(), "aaa");
    }

}
