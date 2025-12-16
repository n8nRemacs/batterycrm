package androidx.graphics.path;

import Y61.k;
import kotlin.Metadata;

/* compiled from: ConicConverter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/graphics/path/ConicConverter;", "", "<init>", "()V", "", "conicPoints", "", "offset", "quadraticPoints", "", "weight", "tolerance", "internalConicToQuadratics", "([FI[FFF)I", "graphics-path_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ConicConverter {

    /* renamed from: a, reason: collision with root package name */
    public int f46616a;

    /* renamed from: b, reason: collision with root package name */
    public int f46617b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public float[] f46618c = new float[130];

    private final native int internalConicToQuadratics(float[] conicPoints, int offset, float[] quadraticPoints, float weight, float tolerance);

    public final void a(@k float[] fArr, float f12, float f13) {
        int iInternalConicToQuadratics = internalConicToQuadratics(fArr, 0, this.f46618c, f12, f13);
        this.f46616a = iInternalConicToQuadratics;
        int i12 = (iInternalConicToQuadratics * 4) + 2;
        if (i12 > this.f46618c.length) {
            float[] fArr2 = new float[i12];
            this.f46618c = fArr2;
            this.f46616a = internalConicToQuadratics(fArr, 0, fArr2, f12, f13);
        }
        this.f46617b = 0;
    }

    public final void b(@k float[] fArr) {
        int i12 = this.f46617b;
        if (i12 < this.f46616a) {
            int i13 = i12 * 4;
            float[] fArr2 = this.f46618c;
            fArr[0] = fArr2[i13];
            fArr[1] = fArr2[i13 + 1];
            fArr[2] = fArr2[i13 + 2];
            fArr[3] = fArr2[i13 + 3];
            fArr[4] = fArr2[i13 + 4];
            fArr[5] = fArr2[i13 + 5];
            this.f46617b = i12 + 1;
        }
    }
}
