package UW0;

import I41.h;
import androidx.appcompat.app.r;
import com.facebook.common.internal.o;
import com.facebook.infer.annotation.Nullsafe;
import java.util.regex.Pattern;

/* compiled from: BytesRange.java */
@J41.b
@Nullsafe
/* loaded from: classes12.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    @h
    public static Pattern f16404c;

    /* renamed from: a, reason: collision with root package name */
    public final int f16405a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16406b;

    public a(int i12, int i13) {
        this.f16405a = i12;
        this.f16406b = i13;
    }

    @h
    public static a a(@h String str) throws NumberFormatException {
        if (str == null) {
            return null;
        }
        if (f16404c == null) {
            f16404c = Pattern.compile("[-/ ]");
        }
        try {
            String[] strArrSplit = f16404c.split(str);
            o.a(Boolean.valueOf(strArrSplit.length == 4));
            o.a(Boolean.valueOf(strArrSplit[0].equals("bytes")));
            int i12 = Integer.parseInt(strArrSplit[1]);
            int i13 = Integer.parseInt(strArrSplit[2]);
            int i14 = Integer.parseInt(strArrSplit[3]);
            o.a(Boolean.valueOf(i13 > i12));
            o.a(Boolean.valueOf(i14 > i13));
            return i13 < i14 - 1 ? new a(i12, i13) : new a(i12, Integer.MAX_VALUE);
        } catch (IllegalArgumentException e12) {
            throw new IllegalArgumentException(AK.c.k("Invalid Content-Range header value: \"", str, "\""), e12);
        }
    }

    public final boolean equals(@h Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16405a == aVar.f16405a && this.f16406b == aVar.f16406b;
    }

    public final int hashCode() {
        return ((this.f16405a + 31) * 31) + this.f16406b;
    }

    public final String toString() {
        int i12 = this.f16405a;
        String string = i12 == Integer.MAX_VALUE ? "" : Integer.toString(i12);
        int i13 = this.f16406b;
        return r.r(string, "-", i13 != Integer.MAX_VALUE ? Integer.toString(i13) : "");
    }
}
