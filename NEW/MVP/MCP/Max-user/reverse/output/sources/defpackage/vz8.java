package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class vz8 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final UUID a;
    public final Uri b;
    public final ah7 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final wg7 g;
    public final byte[] h;

    static {
        String str = zxg.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public vz8(uz8 uz8Var) {
        hsi.g((uz8Var.f && uz8Var.b == null) ? false : true);
        UUID uuid = uz8Var.a;
        uuid.getClass();
        this.a = uuid;
        this.b = uz8Var.b;
        this.c = uz8Var.c;
        this.d = uz8Var.d;
        this.f = uz8Var.f;
        this.e = uz8Var.e;
        this.g = uz8Var.g;
        byte[] bArr = uz8Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vz8)) {
            return false;
        }
        vz8 vz8Var = (vz8) obj;
        return this.a.equals(vz8Var.a) && Objects.equals(this.b, vz8Var.b) && Objects.equals(this.c, vz8Var.c) && this.d == vz8Var.d && this.f == vz8Var.f && this.e == vz8Var.e && this.g.equals(vz8Var.g) && Arrays.equals(this.h, vz8Var.h);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
