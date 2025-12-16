package Ga1;

import androidx.appcompat.app.r;
import java.util.Calendar;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f6572a;

    /* renamed from: b, reason: collision with root package name */
    public int f6573b;

    /* renamed from: c, reason: collision with root package name */
    public int f6574c;

    /* renamed from: d, reason: collision with root package name */
    public long f6575d;

    public a() {
        this.f6572a = 0;
        this.f6573b = 0;
        this.f6574c = 0;
    }

    public final void a(long j12) {
        this.f6575d = j12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j12);
        this.f6574c = calendar.get(5);
        long j13 = this.f6575d;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j13);
        this.f6573b = calendar2.get(2);
        long j14 = this.f6575d;
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTimeInMillis(j14);
        this.f6572a = calendar3.get(1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6572a == aVar.f6572a && this.f6573b == aVar.f6573b && this.f6574c == aVar.f6574c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6574c) + r.e(this.f6573b, Integer.hashCode(this.f6572a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DateModel(year=");
        sb2.append(this.f6572a);
        sb2.append(", month=");
        sb2.append(this.f6573b);
        sb2.append(", day=");
        return r.t(sb2, this.f6574c, ')');
    }

    public a(long j12) {
        this();
        a(j12);
    }
}
