package defpackage;

import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class tl {
    public static final tl e = new tl(null, null, null, null);
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public tl(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final tl a(String str) {
        String str2 = this.c;
        if (str2 != null) {
            throw new IllegalStateException("Some session key");
        }
        String str3 = this.b;
        if (str3 == null) {
            return str.equals(this.a) ? this : new tl(str, str3, str2, this.d);
        }
        throw new IllegalStateException("Some auth token");
    }

    public final tl b(String str, String str2) {
        String str3 = this.a;
        if (str3 != null) {
            return (str.equals(this.c) && str2.equals(this.d)) ? this : new tl(str3, this.b, str, str2);
        }
        throw new IllegalStateException("No app key");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tl)) {
            return false;
        }
        tl tlVar = (tl) obj;
        return fni.a(this.d, tlVar.d) && fni.a(this.c, tlVar.c) && fni.a(this.b, tlVar.b) && fni.a(this.a, tlVar.a);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 961;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiConfig{appKey='");
        sb.append(this.a);
        sb.append("', userId='null', token='");
        sb.append(this.b);
        sb.append("', sessionKey='");
        sb.append(this.c);
        sb.append("', sessionSecret='");
        Locale locale = Locale.US;
        String str = this.d;
        sb.append(String.format(locale, "0x%08x", Arrays.copyOf(new Object[]{Integer.valueOf(str != null ? str.hashCode() : 0)}, 1)));
        sb.append("'}");
        return sb.toString();
    }
}
