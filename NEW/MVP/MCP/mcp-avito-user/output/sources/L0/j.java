package l0;

import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l0.g;
import l0.n;

/* compiled from: Rect.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ll0/j;", "", "a", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class j {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f413388e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final j f413389f = new j(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f413390a;

    /* renamed from: b, reason: collision with root package name */
    public final float f413391b;

    /* renamed from: c, reason: collision with root package name */
    public final float f413392c;

    /* renamed from: d, reason: collision with root package name */
    public final float f413393d;

    /* compiled from: Rect.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll0/j$a;", "", "<init>", "()V", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public j(float f12, float f13, float f14, float f15) {
        this.f413390a = f12;
        this.f413391b = f13;
        this.f413392c = f14;
        this.f413393d = f15;
    }

    public static j b(j jVar, float f12, float f13, float f14, int i12) {
        if ((i12 & 1) != 0) {
            f12 = jVar.f413390a;
        }
        float f15 = jVar.f413391b;
        if ((i12 & 4) != 0) {
            f13 = jVar.f413392c;
        }
        if ((i12 & 8) != 0) {
            f14 = jVar.f413393d;
        }
        jVar.getClass();
        return new j(f12, f15, f13, f14);
    }

    public final boolean a(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        return (fIntBitsToFloat >= this.f413390a) & (fIntBitsToFloat < this.f413392c) & (fIntBitsToFloat2 >= this.f413391b) & (fIntBitsToFloat2 < this.f413393d);
    }

    public final long c() {
        float f12 = this.f413392c;
        float f13 = this.f413390a;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13) << 32) | (Float.floatToRawIntBits(this.f413393d) & 4294967295L);
        g.a aVar = g.f413384b;
        return jFloatToRawIntBits;
    }

    public final long d() {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(this.f413390a) << 32) | (Float.floatToRawIntBits(this.f413393d) & 4294967295L);
        g.a aVar = g.f413384b;
        return jFloatToRawIntBits;
    }

    public final long e() {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(this.f413392c) << 32) | (Float.floatToRawIntBits(this.f413393d) & 4294967295L);
        g.a aVar = g.f413384b;
        return jFloatToRawIntBits;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Float.compare(this.f413390a, jVar.f413390a) == 0 && Float.compare(this.f413391b, jVar.f413391b) == 0 && Float.compare(this.f413392c, jVar.f413392c) == 0 && Float.compare(this.f413393d, jVar.f413393d) == 0;
    }

    public final long f() {
        float f12 = this.f413392c;
        float f13 = this.f413390a;
        float f14 = ((f12 - f13) / 2.0f) + f13;
        float f15 = this.f413393d;
        float f16 = this.f413391b;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(((f15 - f16) / 2.0f) + f16) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
        g.a aVar = g.f413384b;
        return jFloatToRawIntBits;
    }

    public final long g() {
        float f12 = this.f413392c - this.f413390a;
        float f13 = this.f413393d - this.f413391b;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32);
        n.a aVar = n.f413402b;
        return jFloatToRawIntBits;
    }

    public final long h() {
        float f12 = this.f413392c;
        float f13 = this.f413390a;
        long jFloatToRawIntBits = (Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13) << 32) | (Float.floatToRawIntBits(this.f413391b) & 4294967295L);
        g.a aVar = g.f413384b;
        return jFloatToRawIntBits;
    }

    public final int hashCode() {
        return Float.hashCode(this.f413393d) + r.d(this.f413392c, r.d(this.f413391b, Float.hashCode(this.f413390a) * 31, 31), 31);
    }

    public final long i() {
        long jFloatToRawIntBits = (Float.floatToRawIntBits(this.f413390a) << 32) | (Float.floatToRawIntBits(this.f413391b) & 4294967295L);
        g.a aVar = g.f413384b;
        return jFloatToRawIntBits;
    }

    @F3
    @Y61.k
    public final j j(@Y61.k j jVar) {
        return new j(Math.max(this.f413390a, jVar.f413390a), Math.max(this.f413391b, jVar.f413391b), Math.min(this.f413392c, jVar.f413392c), Math.min(this.f413393d, jVar.f413393d));
    }

    public final boolean k() {
        return (this.f413390a >= this.f413392c) | (this.f413391b >= this.f413393d);
    }

    public final boolean l(@Y61.k j jVar) {
        return (this.f413390a < jVar.f413392c) & (jVar.f413390a < this.f413392c) & (this.f413391b < jVar.f413393d) & (jVar.f413391b < this.f413393d);
    }

    @F3
    @Y61.k
    public final j m(float f12, float f13) {
        return new j(this.f413390a + f12, this.f413391b + f13, this.f413392c + f12, this.f413393d + f13);
    }

    @F3
    @Y61.k
    public final j n(long j12) {
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        return new j(Float.intBitsToFloat(i12) + this.f413390a, Float.intBitsToFloat(i13) + this.f413391b, Float.intBitsToFloat(i12) + this.f413392c, Float.intBitsToFloat(i13) + this.f413393d);
    }

    @Y61.k
    public final String toString() {
        return "Rect.fromLTRB(" + c.a(this.f413390a) + ", " + c.a(this.f413391b) + ", " + c.a(this.f413392c) + ", " + c.a(this.f413393d) + ')';
    }
}
