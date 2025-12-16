package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class hs2 implements t98, j37 {
    public final Long A0;
    public final long B0;
    public final CharSequence C0;
    public final long D0;
    public final int E0;
    public final long F0;
    public final CharSequence X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final long a;
    public final Uri b;
    public final CharSequence c;
    public final CharSequence d;
    public final u4g o;
    public final int s0;
    public final u4g t0;
    public final boolean u0;
    public final String v0;
    public final long w0;
    public final gs2 x0;
    public final int y0;
    public final long z0;

    public hs2(long j, Uri uri, CharSequence charSequence, CharSequence charSequence2, u4g u4gVar, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, int i, u4g u4gVar2, boolean z, String str, long j2, gs2 gs2Var, int i2, long j3, Long l, long j4, CharSequence charSequence6, long j5) {
        this.a = j;
        this.b = uri;
        this.c = charSequence;
        this.d = charSequence2;
        this.o = u4gVar;
        this.X = charSequence3;
        this.Y = charSequence4;
        this.Z = charSequence5;
        this.s0 = i;
        this.t0 = u4gVar2;
        this.u0 = z;
        this.v0 = str;
        this.w0 = j2;
        this.x0 = gs2Var;
        this.y0 = i2;
        this.z0 = j3;
        this.A0 = l;
        this.B0 = j4;
        this.C0 = charSequence6;
        this.D0 = j5;
        this.E0 = j3 != 0 ? c03.b : c03.a;
        this.F0 = j;
    }

    public static hs2 l(hs2 hs2Var, u4g u4gVar, CharSequence charSequence, int i, u4g u4gVar2, boolean z, int i2) {
        return new hs2(hs2Var.a, hs2Var.b, hs2Var.c, hs2Var.d, (i2 & 16) != 0 ? hs2Var.o : u4gVar, hs2Var.X, hs2Var.Y, (i2 & 128) != 0 ? hs2Var.Z : charSequence, (i2 & 256) != 0 ? hs2Var.s0 : i, u4gVar2, z, hs2Var.v0, hs2Var.w0, hs2Var.x0, hs2Var.y0, hs2Var.z0, hs2Var.A0, hs2Var.B0, hs2Var.C0, hs2Var.D0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs2)) {
            return false;
        }
        hs2 hs2Var = (hs2) obj;
        return this.a == hs2Var.a && fni.a(this.b, hs2Var.b) && fni.a(this.c, hs2Var.c) && fni.a(this.d, hs2Var.d) && fni.a(this.o, hs2Var.o) && fni.a(this.X, hs2Var.X) && fni.a(this.Y, hs2Var.Y) && fni.a(this.Z, hs2Var.Z) && this.s0 == hs2Var.s0 && fni.a(this.t0, hs2Var.t0) && this.u0 == hs2Var.u0 && fni.a(this.v0, hs2Var.v0) && this.w0 == hs2Var.w0 && this.x0 == hs2Var.x0 && this.y0 == hs2Var.y0 && this.z0 == hs2Var.z0 && fni.a(this.A0, hs2Var.A0) && this.B0 == hs2Var.B0 && fni.a(this.C0, hs2Var.C0) && this.D0 == hs2Var.D0;
    }

    @Override // defpackage.j37
    /* renamed from: getId */
    public final long getA() {
        return this.a;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.F0;
    }

    @Override // defpackage.j37
    /* renamed from: getTime */
    public final long getC() {
        return this.w0;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return this.F0 == t98Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Uri uri = this.b;
        int iG = u45.g(this.c, (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31);
        CharSequence charSequence = this.d;
        int iHashCode2 = (iG + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        u4g u4gVar = this.o;
        int iG2 = u45.g(this.X, (iHashCode2 + (u4gVar == null ? 0 : u4gVar.hashCode())) * 31, 31);
        CharSequence charSequence2 = this.Y;
        int iHashCode3 = (iG2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        CharSequence charSequence3 = this.Z;
        int iHashCode4 = (iHashCode3 + (charSequence3 == null ? 0 : charSequence3.hashCode())) * 31;
        int i = this.s0;
        int iV = (iHashCode4 + (i == 0 ? 0 : az1.v(i))) * 31;
        u4g u4gVar2 = this.t0;
        int iB = a9h.b((iV + (u4gVar2 == null ? 0 : u4gVar2.hashCode())) * 31, 31, this.u0);
        String str = this.v0;
        int iA = a9h.a(xrf.k(this.y0, (this.x0.hashCode() + a9h.a((iB + (str == null ? 0 : str.hashCode())) * 31, 31, this.w0)) * 31, 31), 31, this.z0);
        Long l = this.A0;
        return Long.hashCode(this.D0) + u45.g(this.C0, a9h.a((iA + (l != null ? l.hashCode() : 0)) * 31, 31, this.B0), 31);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        hs2 hs2Var = t98Var instanceof hs2 ? (hs2) t98Var : null;
        if (hs2Var == null) {
            return null;
        }
        fs2 fs2Var = new fs2(9);
        BitSet bitSet = (BitSet) fs2Var.b;
        bitSet.set(0, y() != hs2Var.y());
        bitSet.set(1, (fni.a(this.b, hs2Var.b) && this.B0 == hs2Var.B0 && fni.a(this.C0, hs2Var.C0)) ? false : true);
        bitSet.set(2, !fni.a(this.c, hs2Var.c));
        bitSet.set(3, !fni.a(this.d, hs2Var.d));
        bitSet.set(15, this.o != hs2Var.o);
        bitSet.set(4, (fni.a(this.X, hs2Var.X) && fni.a(this.Y, hs2Var.Y)) ? false : true);
        bitSet.set(5, (fni.a(this.Z, hs2Var.Z) && this.s0 == hs2Var.s0) ? false : true);
        bitSet.set(16, this.t0 != hs2Var.t0);
        bitSet.set(6, !fni.a(this.v0, hs2Var.v0));
        bitSet.set(7, this.w0 != hs2Var.w0);
        bitSet.set(8, this.x0 != hs2Var.x0);
        bitSet.set(9, this.y0 != hs2Var.y0);
        bitSet.set(10, x() != hs2Var.x());
        bitSet.set(11, o() != hs2Var.o());
        bitSet.set(12, p() != hs2Var.p());
        bitSet.set(13, this.z0 != hs2Var.z0);
        bitSet.set(14, n() != hs2Var.n());
        return fs2Var;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.E0;
    }

    public final boolean n() {
        return (this.D0 & PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) != 0;
    }

    public final boolean o() {
        return (this.D0 & 16) != 0;
    }

    public final boolean p() {
        return (this.D0 & 32) != 0;
    }

    public final String toString() {
        boolean zA = wqi.a();
        CharSequence charSequenceH = this.c;
        if (!zA) {
            charSequenceH = uog.h(charSequenceH);
        }
        StringBuilder sb = new StringBuilder("ChatModel(chatId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) charSequenceH);
        return u45.i(this.w0, ", time=", ")", sb);
    }

    public final boolean x() {
        return (this.D0 & 8) != 0;
    }

    public final boolean y() {
        return (this.D0 & 2) != 0;
    }

    public /* synthetic */ hs2(long j, Uri uri, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, boolean z, String str, long j2, gs2 gs2Var, int i, long j3, Long l, long j4, CharSequence charSequence6, long j5, int i2) {
        this(j, uri, charSequence, charSequence2, null, charSequence3, charSequence4, charSequence5, 0, null, (i2 & 1024) != 0 ? true : z, str, j2, gs2Var, i, j3, l, j4, charSequence6, j5);
    }
}
