package defpackage;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class jha implements lha {
    public final long b;
    public final long c;

    public jha(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final Date a(Date date) {
        int year = date.getYear();
        int month = date.getMonth();
        int date2 = date.getDate();
        int i = s65.d;
        y65 y65Var = y65.HOURS;
        long j = this.c;
        return new Date(year, month, date2, (int) s65.m(j, y65Var), (int) (s65.m(j, y65.MINUTES) % 60));
    }

    public final boolean b() {
        Date time = Calendar.getInstance().getTime();
        Date dateC = c(time);
        Date dateA = a(time);
        if ((time.compareTo(dateC) < 0 || time.compareTo(dateA) > 0) && dateC.compareTo(dateA) > 0) {
            dateC.setTime(dateC.getTime() - TimeUnit.DAYS.toMillis(1L));
        } else if (dateA.compareTo(dateC) < 0) {
            dateA.setTime(TimeUnit.DAYS.toMillis(1L) + dateA.getTime());
        }
        return time.compareTo(dateC) >= 0 && time.compareTo(dateA) < 0;
    }

    public final Date c(Date date) {
        int year = date.getYear();
        int month = date.getMonth();
        int date2 = date.getDate();
        int i = s65.d;
        y65 y65Var = y65.HOURS;
        long j = this.b;
        return new Date(year, month, date2, (int) s65.m(j, y65Var), (int) (s65.m(j, y65.MINUTES) % 60));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jha)) {
            return false;
        }
        jha jhaVar = (jha) obj;
        return s65.e(this.b, jhaVar.b) && s65.e(this.c, jhaVar.c);
    }

    public final int hashCode() {
        int i = s65.d;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return wy1.j("Schedule(startTime=", s65.n(this.b), ", endTime=", s65.n(this.c), ")");
    }
}
