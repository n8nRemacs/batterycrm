package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.graphics.C22271m;
import kotlin.Metadata;

/* compiled from: LayerMatrixCache.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/C1;", "T", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C1<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f41084a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Matrix f41085b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41088e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41089f;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final float[] f41086c = androidx.compose.ui.graphics.A0.b();

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final float[] f41087d = androidx.compose.ui.graphics.A0.b();

    /* renamed from: g, reason: collision with root package name */
    public boolean f41090g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41091h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C1(@Y61.k Y41.p<? super T, ? super Matrix, kotlin.G0> pVar) {
        this.f41084a = (kotlin.jvm.internal.N) pVar;
    }

    @Y61.l
    public final float[] a(T t12) {
        boolean z12 = this.f41089f;
        float[] fArr = this.f41087d;
        if (z12) {
            this.f41090g = A1.a(b(t12), fArr);
            this.f41089f = false;
        }
        if (this.f41090g) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Y61.k
    public final float[] b(T t12) {
        boolean z12 = this.f41088e;
        float[] fArr = this.f41086c;
        if (!z12) {
            return fArr;
        }
        Matrix matrix = this.f41085b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f41085b = matrix;
        }
        this.f41084a.invoke(t12, matrix);
        C22271m.b(matrix, fArr);
        this.f41088e = false;
        this.f41091h = androidx.compose.ui.graphics.B0.a(fArr);
        return fArr;
    }

    public final void c() {
        this.f41088e = true;
        this.f41089f = true;
    }
}
