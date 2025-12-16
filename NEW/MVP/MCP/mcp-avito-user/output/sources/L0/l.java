package l0;

import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l0.C43522a;

/* compiled from: RoundRect.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Ll0/l;", "", "", "left", "top", "right", "bottom", "Ll0/a;", "topLeftCornerRadius", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "<init>", "(FFFFJJJJLkotlin/jvm/internal/w;)V", "a", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class l {

    /* renamed from: a, reason: collision with root package name */
    public final float f413394a;

    /* renamed from: b, reason: collision with root package name */
    public final float f413395b;

    /* renamed from: c, reason: collision with root package name */
    public final float f413396c;

    /* renamed from: d, reason: collision with root package name */
    public final float f413397d;

    /* renamed from: e, reason: collision with root package name */
    public final long f413398e;

    /* renamed from: f, reason: collision with root package name */
    public final long f413399f;

    /* renamed from: g, reason: collision with root package name */
    public final long f413400g;

    /* renamed from: h, reason: collision with root package name */
    public final long f413401h;

    /* compiled from: RoundRect.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll0/l$a;", "", "<init>", "()V", "ui-geometry_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        C43522a.f413378b.getClass();
        m.b(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public l(float f12, float f13, float f14, float f15, long j12, long j13, long j14, long j15, C42822w c42822w) {
        this.f413394a = f12;
        this.f413395b = f13;
        this.f413396c = f14;
        this.f413397d = f15;
        this.f413398e = j12;
        this.f413399f = j13;
        this.f413400g = j14;
        this.f413401h = j15;
    }

    public static l a(l lVar, float f12, float f13, float f14, int i12) {
        float f15 = (i12 & 1) != 0 ? lVar.f413394a : f12;
        float f16 = lVar.f413395b;
        long j12 = lVar.f413398e;
        long j13 = lVar.f413399f;
        long j14 = lVar.f413400g;
        long j15 = lVar.f413401h;
        lVar.getClass();
        return new l(f15, f16, f13, f14, j12, j13, j14, j15, null);
    }

    public final float b() {
        return this.f413397d - this.f413395b;
    }

    public final float c() {
        return this.f413396c - this.f413394a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return Float.compare(this.f413394a, lVar.f413394a) == 0 && Float.compare(this.f413395b, lVar.f413395b) == 0 && Float.compare(this.f413396c, lVar.f413396c) == 0 && Float.compare(this.f413397d, lVar.f413397d) == 0 && C43522a.a(this.f413398e, lVar.f413398e) && C43522a.a(this.f413399f, lVar.f413399f) && C43522a.a(this.f413400g, lVar.f413400g) && C43522a.a(this.f413401h, lVar.f413401h);
    }

    public final int hashCode() {
        int iD2 = r.d(this.f413397d, r.d(this.f413396c, r.d(this.f413395b, Float.hashCode(this.f413394a) * 31, 31), 31), 31);
        C43522a.C11768a c11768a = C43522a.f413378b;
        return Long.hashCode(this.f413401h) + r.g(r.g(r.g(iD2, 31, this.f413398e), 31, this.f413399f), 31, this.f413400g);
    }

    @Y61.k
    public final String toString() {
        String str = c.a(this.f413394a) + ", " + c.a(this.f413395b) + ", " + c.a(this.f413396c) + ", " + c.a(this.f413397d);
        long j12 = this.f413398e;
        long j13 = this.f413399f;
        boolean zA2 = C43522a.a(j12, j13);
        long j14 = this.f413400g;
        long j15 = this.f413401h;
        if (!zA2 || !C43522a.a(j13, j14) || !C43522a.a(j14, j15)) {
            StringBuilder sbA = r.A("RoundRect(rect=", str, ", topLeft=");
            sbA.append((Object) C43522a.b(j12));
            sbA.append(", topRight=");
            sbA.append((Object) C43522a.b(j13));
            sbA.append(", bottomRight=");
            sbA.append((Object) C43522a.b(j14));
            sbA.append(", bottomLeft=");
            sbA.append((Object) C43522a.b(j15));
            sbA.append(')');
            return sbA.toString();
        }
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        if (Float.intBitsToFloat(i12) == Float.intBitsToFloat(i13)) {
            StringBuilder sbA2 = r.A("RoundRect(rect=", str, ", radius=");
            sbA2.append(c.a(Float.intBitsToFloat(i12)));
            sbA2.append(')');
            return sbA2.toString();
        }
        StringBuilder sbA3 = r.A("RoundRect(rect=", str, ", x=");
        sbA3.append(c.a(Float.intBitsToFloat(i12)));
        sbA3.append(", y=");
        sbA3.append(c.a(Float.intBitsToFloat(i13)));
        sbA3.append(')');
        return sbA3.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public l(float f12, float f13, float f14, float f15, long j12, long j13, long j14, long j15, int i12, C42822w c42822w) {
        long j16;
        long j17;
        long j18;
        long j19;
        if ((i12 & 16) != 0) {
            C43522a.f413378b.getClass();
            j16 = 0;
        } else {
            j16 = j12;
        }
        if ((i12 & 32) != 0) {
            C43522a.f413378b.getClass();
            j17 = 0;
        } else {
            j17 = j13;
        }
        if ((i12 & 64) != 0) {
            C43522a.f413378b.getClass();
            j18 = 0;
        } else {
            j18 = j14;
        }
        if ((i12 & 128) != 0) {
            C43522a.f413378b.getClass();
            j19 = 0;
        } else {
            j19 = j15;
        }
        this(f12, f13, f14, f15, j16, j17, j18, j19, null);
    }
}
