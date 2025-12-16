package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class p9g implements lw0 {
    public static final Object B0 = new Object();
    public static final Object C0 = new Object();
    public static final i09 D0;
    public long A0;
    public long X;
    public long Y;
    public boolean Z;
    public Object b;
    public Object d;
    public long o;
    public boolean s0;
    public boolean t0;
    public xz8 u0;
    public boolean v0;
    public long w0;
    public long x0;
    public int y0;
    public int z0;
    public Object a = B0;
    public i09 c = D0;

    static {
        nz8 nz8Var = new nz8();
        t76 t76Var = wg7.b;
        zjd zjdVar = zjd.o;
        List list = Collections.EMPTY_LIST;
        zjd zjdVar2 = zjd.o;
        Uri uri = Uri.EMPTY;
        D0 = new i09("com.google.android.exoplayer2.Timeline", new rz8(nz8Var), uri != null ? new c09(uri, null, zjdVar2) : null, new xz8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), v19.R0);
    }

    public final boolean a() {
        fsi.d(this.t0 == (this.u0 != null));
        return this.u0 != null;
    }

    public final void b(Object obj, i09 i09Var, Object obj2, long j, long j2, long j3, boolean z, boolean z2, xz8 xz8Var, long j4, long j5, int i, int i2, long j6) {
        this.a = obj;
        this.c = i09Var != null ? i09Var : D0;
        if (i09Var != null) {
            c09 c09Var = i09Var.b;
        }
        this.b = null;
        this.d = obj2;
        this.o = j;
        this.X = j2;
        this.Y = j3;
        this.Z = z;
        this.s0 = z2;
        this.t0 = xz8Var != null;
        this.u0 = xz8Var;
        this.w0 = j4;
        this.x0 = j5;
        this.y0 = i;
        this.z0 = i2;
        this.A0 = j6;
        this.v0 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p9g.class.equals(obj.getClass())) {
            p9g p9gVar = (p9g) obj;
            if (xxg.a(this.a, p9gVar.a) && xxg.a(this.c, p9gVar.c) && xxg.a(this.d, p9gVar.d) && xxg.a(this.u0, p9gVar.u0) && this.o == p9gVar.o && this.X == p9gVar.X && this.Y == p9gVar.Y && this.Z == p9gVar.Z && this.s0 == p9gVar.s0 && this.v0 == p9gVar.v0 && this.w0 == p9gVar.w0 && this.x0 == p9gVar.x0 && this.y0 == p9gVar.y0 && this.z0 == p9gVar.z0 && this.A0 == p9gVar.A0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        xz8 xz8Var = this.u0;
        int iHashCode3 = (iHashCode2 + (xz8Var != null ? xz8Var.hashCode() : 0)) * 31;
        long j = this.o;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.X;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.Y;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.Z ? 1 : 0)) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.v0 ? 1 : 0)) * 31;
        long j4 = this.w0;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.x0;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.y0) * 31) + this.z0) * 31;
        long j6 = this.A0;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
