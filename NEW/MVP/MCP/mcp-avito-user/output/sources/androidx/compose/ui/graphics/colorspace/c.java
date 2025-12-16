package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.graphics.V;
import androidx.compose.ui.graphics.colorspace.b;
import j.F;
import j.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ColorSpace.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0001\u000bB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/c;", "", "", "name", "Landroidx/compose/ui/graphics/colorspace/b;", "model", "", "id", "<init>", "(Ljava/lang/String;JILkotlin/jvm/internal/w;)V", "(Ljava/lang/String;JLkotlin/jvm/internal/w;)V", "a", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f39386a;

    /* renamed from: b, reason: collision with root package name */
    public final long f39387b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39388c;

    /* compiled from: ColorSpace.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/c$a;", "", "<init>", "()V", "", "MaxId", "I", "MinId", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public c(String str, long j12, int i12, C42822w c42822w) {
        this.f39386a = str;
        this.f39387b = j12;
        this.f39388c = i12;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i12 < -1 || i12 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    @c0
    @Y61.k
    public abstract float[] a(@c0 @Y61.k float[] fArr);

    public abstract float b(@F int i12);

    public abstract float c(@F int i12);

    /* renamed from: d */
    public boolean getF39461q() {
        return false;
    }

    public long e(float f12, float f13, float f14) {
        float[] fArrF = f(new float[]{f12, f13, f14});
        return (Float.floatToRawIntBits(fArrF[0]) << 32) | (Float.floatToRawIntBits(fArrF[1]) & 4294967295L);
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f39388c == cVar.f39388c && L.f(this.f39386a, cVar.f39386a)) {
            return b.a(this.f39387b, cVar.f39387b);
        }
        return false;
    }

    @c0
    @Y61.k
    public abstract float[] f(@c0 @Y61.k float[] fArr);

    public float g(float f12, float f13, float f14) {
        return f(new float[]{f12, f13, f14})[2];
    }

    public long h(float f12, float f13, float f14, float f15, @Y61.k c cVar) {
        b.a aVar = b.f39380b;
        float[] fArr = new float[(int) (this.f39387b >> 32)];
        fArr[0] = f12;
        fArr[1] = f13;
        fArr[2] = f14;
        float[] fArrA = a(fArr);
        return V.a(fArrA[0], fArrA[1], fArrA[2], f15, cVar);
    }

    public int hashCode() {
        int iHashCode = this.f39386a.hashCode() * 31;
        b.a aVar = b.f39380b;
        return androidx.appcompat.app.r.g(iHashCode, 31, this.f39387b) + this.f39388c;
    }

    @Y61.k
    public final String toString() {
        return this.f39386a + " (id=" + this.f39388c + ", model=" + ((Object) b.b(this.f39387b)) + ')';
    }

    public c(String str, long j12, C42822w c42822w) {
        this(str, j12, -1, null);
    }
}
