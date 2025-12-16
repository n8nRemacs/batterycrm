package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;
import l0.g;

/* compiled from: Matrix.kt */
@X41.g
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/A0;", "", "a", "values", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f39215b = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final float[] f39216a;

    /* compiled from: Matrix.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/A0$a;", "", "<init>", "()V", "", "Perspective0", "I", "Perspective1", "Perspective2", "ScaleX", "ScaleY", "ScaleZ", "SkewX", "SkewY", "TranslateX", "TranslateY", "TranslateZ", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    private /* synthetic */ A0(float[] fArr) {
        this.f39216a = fArr;
    }

    public static final /* synthetic */ A0 a(float[] fArr) {
        return new A0(fArr);
    }

    public static float[] b() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long c(long j12, float[] fArr) {
        if (fArr.length < 16) {
            return j12;
        }
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[7];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f22 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j12 & 4294967295L));
        float f23 = 1 / (((f17 * fIntBitsToFloat2) + (f14 * fIntBitsToFloat)) + f22);
        if ((Float.floatToRawIntBits(f23) & Integer.MAX_VALUE) >= 2139095040) {
            f23 = 0.0f;
        }
        float f24 = f16 * fIntBitsToFloat2;
        long jFloatToRawIntBits = (Float.floatToRawIntBits((((f15 * fIntBitsToFloat2) + (f12 * fIntBitsToFloat)) + f18) * f23) << 32) | (Float.floatToRawIntBits((f24 + (f13 * fIntBitsToFloat) + f19) * f23) & 4294967295L);
        g.a aVar = l0.g.f413384b;
        return jFloatToRawIntBits;
    }

    public static final void d(float[] fArr, @Y61.k l0.e eVar) {
        if (fArr.length < 16) {
            return;
        }
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[7];
        float f18 = fArr[12];
        float f19 = fArr[13];
        float f22 = fArr[15];
        float f23 = eVar.f413380a;
        float f24 = eVar.f413381b;
        float f25 = eVar.f413382c;
        float f26 = eVar.f413383d;
        float f27 = f14 * f23;
        float f28 = f17 * f24;
        float f29 = 1.0f / ((f27 + f28) + f22);
        if ((Float.floatToRawIntBits(f29) & Integer.MAX_VALUE) >= 2139095040) {
            f29 = 0.0f;
        }
        float f32 = f12 * f23;
        float f33 = f15 * f24;
        float f34 = (f32 + f33 + f18) * f29;
        float f35 = f23 * f13;
        float f36 = f24 * f16;
        float f37 = (f35 + f36 + f19) * f29;
        float f38 = f17 * f26;
        float f39 = 1.0f / ((f27 + f38) + f22);
        float f42 = (Float.floatToRawIntBits(f39) & Integer.MAX_VALUE) < 2139095040 ? f39 : 0.0f;
        float f43 = f15 * f26;
        float f44 = (f32 + f43 + f18) * f42;
        float f45 = f16 * f26;
        float f46 = (f35 + f45 + f19) * f42;
        float f47 = f14 * f25;
        float f48 = 1.0f / ((f47 + f28) + f22);
        if ((Float.floatToRawIntBits(f48) & Integer.MAX_VALUE) >= 2139095040) {
            f48 = 0.0f;
        }
        float f49 = f12 * f25;
        float f52 = (f49 + f33 + f18) * f48;
        float f53 = f13 * f25;
        float f54 = (f36 + f53 + f19) * f48;
        float f55 = 1.0f / ((f47 + f38) + f22);
        float f56 = (Float.floatToRawIntBits(f55) & Integer.MAX_VALUE) < 2139095040 ? f55 : 0.0f;
        float f57 = (f49 + f43 + f18) * f56;
        float f58 = (f53 + f45 + f19) * f56;
        eVar.f413380a = Math.min(f34, Math.min(f44, Math.min(f52, f57)));
        eVar.f413381b = Math.min(f37, Math.min(f46, Math.min(f54, f58)));
        eVar.f413382c = Math.max(f34, Math.max(f44, Math.max(f52, f57)));
        eVar.f413383d = Math.max(f37, Math.max(f46, Math.max(f54, f58)));
    }

    public static final void e(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void f(float[] fArr, float f12) {
        if (fArr.length < 16) {
            return;
        }
        double d12 = f12 * 0.017453292519943295d;
        float fSin = (float) Math.sin(d12);
        float fCos = (float) Math.cos(d12);
        float f13 = fArr[0];
        float f14 = fArr[4];
        float f15 = (fSin * f14) + (fCos * f13);
        float f16 = -fSin;
        float f17 = fArr[1];
        float f18 = fArr[5];
        float f19 = (fSin * f18) + (fCos * f17);
        float f22 = fArr[2];
        float f23 = fArr[6];
        float f24 = (fSin * f23) + (fCos * f22);
        float f25 = fArr[3];
        float f26 = fArr[7];
        fArr[0] = f15;
        fArr[1] = f19;
        fArr[2] = f24;
        fArr[3] = (fSin * f26) + (fCos * f25);
        fArr[4] = (f14 * fCos) + (f13 * f16);
        fArr[5] = (f18 * fCos) + (f17 * f16);
        fArr[6] = (f23 * fCos) + (f22 * f16);
        fArr[7] = (fCos * f26) + (f16 * f25);
    }

    public static final void g(float[] fArr, float f12, float f13) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f12;
        fArr[1] = fArr[1] * f12;
        fArr[2] = fArr[2] * f12;
        fArr[3] = fArr[3] * f12;
        fArr[4] = fArr[4] * f13;
        fArr[5] = fArr[5] * f13;
        fArr[6] = fArr[6] * f13;
        fArr[7] = fArr[7] * f13;
        fArr[8] = fArr[8] * 1.0f;
        fArr[9] = fArr[9] * 1.0f;
        fArr[10] = fArr[10] * 1.0f;
        fArr[11] = fArr[11] * 1.0f;
    }

    public static final void h(float[] fArr, @Y61.k float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f12 = fArr[0];
            float f13 = fArr2[0];
            float f14 = fArr[1];
            float f15 = fArr2[4];
            float f16 = fArr[2];
            float f17 = fArr2[8];
            float f18 = f16 * f17;
            float f19 = fArr[3];
            float f22 = fArr2[12];
            float f23 = f19 * f22;
            float f24 = f23 + f18 + (f14 * f15) + (f12 * f13);
            float f25 = fArr2[1];
            float f26 = fArr2[5];
            float f27 = fArr2[9];
            float f28 = f16 * f27;
            float f29 = fArr2[13];
            float f32 = f19 * f29;
            float f33 = f32 + f28 + (f14 * f26) + (f12 * f25);
            float f34 = fArr2[2];
            float f35 = fArr2[6];
            float f36 = fArr2[10];
            float f37 = f16 * f36;
            float f38 = fArr2[14];
            float f39 = f19 * f38;
            float f42 = f39 + f37 + (f14 * f35) + (f12 * f34);
            float f43 = fArr2[3];
            float f44 = fArr2[7];
            float f45 = fArr2[11];
            float f46 = f16 * f45;
            float f47 = fArr2[15];
            float f48 = f19 * f47;
            float f49 = f48 + f46 + (f14 * f44) + (f12 * f43);
            float f52 = fArr[4];
            float f53 = fArr[5];
            float f54 = fArr[6];
            float f55 = (f54 * f17) + (f53 * f15) + (f52 * f13);
            float f56 = fArr[7];
            float f57 = (f56 * f22) + f55;
            float f58 = (f56 * f29) + (f54 * f27) + (f53 * f26) + (f52 * f25);
            float f59 = (f56 * f38) + (f54 * f36) + (f53 * f35) + (f52 * f34);
            float f62 = f54 * f45;
            float f63 = f56 * f47;
            float f64 = f63 + f62 + (f53 * f44) + (f52 * f43);
            float f65 = fArr[8];
            float f66 = fArr[9];
            float f67 = fArr[10];
            float f68 = (f67 * f17) + (f66 * f15) + (f65 * f13);
            float f69 = fArr[11];
            float f72 = (f69 * f22) + f68;
            float f73 = (f69 * f29) + (f67 * f27) + (f66 * f26) + (f65 * f25);
            float f74 = (f69 * f38) + (f67 * f36) + (f66 * f35) + (f65 * f34);
            float f75 = f67 * f45;
            float f76 = f69 * f47;
            float f77 = f76 + f75 + (f66 * f44) + (f65 * f43);
            float f78 = fArr[12];
            float f79 = fArr[13];
            float f82 = (f15 * f79) + (f13 * f78);
            float f83 = fArr[14];
            float f84 = (f17 * f83) + f82;
            float f85 = fArr[15];
            float f86 = (f22 * f85) + f84;
            float f87 = f27 * f83;
            float f88 = f29 * f85;
            float f89 = f88 + f87 + (f26 * f79) + (f25 * f78);
            float f92 = f36 * f83;
            float f93 = f38 * f85;
            float f94 = f93 + f92 + (f35 * f79) + (f34 * f78);
            float f95 = f83 * f45;
            float f96 = f85 * f47;
            fArr[0] = f24;
            fArr[1] = f33;
            fArr[2] = f42;
            fArr[3] = f49;
            fArr[4] = f57;
            fArr[5] = f58;
            fArr[6] = f59;
            fArr[7] = f64;
            fArr[8] = f72;
            fArr[9] = f73;
            fArr[10] = f74;
            fArr[11] = f77;
            fArr[12] = f86;
            fArr[13] = f89;
            fArr[14] = f94;
            fArr[15] = f96 + f95 + (f79 * f44) + (f78 * f43);
        }
    }

    public static final void i(float[] fArr, float f12, float f13) {
        if (fArr.length < 16) {
            return;
        }
        float f14 = (fArr[8] * 0.0f) + (fArr[4] * f13) + (fArr[0] * f12) + fArr[12];
        float f15 = (fArr[9] * 0.0f) + (fArr[5] * f13) + (fArr[1] * f12) + fArr[13];
        float f16 = (fArr[10] * 0.0f) + (fArr[6] * f13) + (fArr[2] * f12) + fArr[14];
        float f17 = (fArr[11] * 0.0f) + (fArr[7] * f13) + (fArr[3] * f12) + fArr[15];
        fArr[12] = f14;
        fArr[13] = f15;
        fArr[14] = f16;
        fArr[15] = f17;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof A0) {
            return kotlin.jvm.internal.L.f(this.f39216a, ((A0) obj).f39216a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f39216a);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |");
        float[] fArr = this.f39216a;
        sb2.append(fArr[0]);
        sb2.append(' ');
        sb2.append(fArr[1]);
        sb2.append(' ');
        sb2.append(fArr[2]);
        sb2.append(' ');
        sb2.append(fArr[3]);
        sb2.append("|\n            |");
        sb2.append(fArr[4]);
        sb2.append(' ');
        sb2.append(fArr[5]);
        sb2.append(' ');
        sb2.append(fArr[6]);
        sb2.append(' ');
        sb2.append(fArr[7]);
        sb2.append("|\n            |");
        sb2.append(fArr[8]);
        sb2.append(' ');
        sb2.append(fArr[9]);
        sb2.append(' ');
        sb2.append(fArr[10]);
        sb2.append(' ');
        sb2.append(fArr[11]);
        sb2.append("|\n            |");
        sb2.append(fArr[12]);
        sb2.append(' ');
        sb2.append(fArr[13]);
        sb2.append(' ');
        sb2.append(fArr[14]);
        sb2.append(' ');
        sb2.append(fArr[15]);
        sb2.append("|\n        ");
        return C43066x.E0(sb2.toString());
    }
}
