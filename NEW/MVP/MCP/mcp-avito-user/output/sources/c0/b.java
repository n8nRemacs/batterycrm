package C0;

import Y61.k;
import Y61.l;
import androidx.annotation.RestrictTo;
import androidx.collection.q1;
import androidx.collection.r1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.p;
import j.InterfaceC42148d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FontScaleConverterFactory.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LC0/b;", "", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final b f1851a = new b();

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final float[] f1852b = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: c, reason: collision with root package name */
    @k
    @RestrictTo
    public static volatile q1<a> f1853c = new q1<>(0, 1, null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final Object[] f1854d;

    static {
        Object[] objArr = new Object[0];
        f1854d = objArr;
        synchronized (objArr) {
            f1853c.i((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f1853c.i((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f1853c.i((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f1853c.i((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f1853c.i((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            G0 g02 = G0.f406611a;
        }
        if ((f1853c.g(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        p.b("You should only apply non-linear scaling to font scales > 1");
    }

    @l
    @InterfaceC42148d
    public static a a(float f12) {
        float fG2;
        a aVarK;
        if (f12 < 1.03f) {
            return null;
        }
        f1851a.getClass();
        int i12 = (int) (f12 * 100.0f);
        a aVarF = f1853c.f(i12);
        if (aVarF != null) {
            return aVarF;
        }
        q1<a> q1Var = f1853c;
        if (q1Var.f25800b) {
            r1.a(q1Var);
        }
        int iA2 = K.a.a(q1Var.f25803e, i12, q1Var.f25801c);
        if (iA2 >= 0) {
            return f1853c.k(iA2);
        }
        int i13 = -(iA2 + 1);
        int i14 = i13 - 1;
        if (i13 >= f1853c.j()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f12});
            b(f12, cVar);
            return cVar;
        }
        if (i14 < 0) {
            float[] fArr = f1852b;
            aVarK = new c(fArr, fArr);
            fG2 = 1.0f;
        } else {
            fG2 = f1853c.g(i14) / 100.0f;
            aVarK = f1853c.k(i14);
        }
        float fG3 = f1853c.g(i13) / 100.0f;
        d.f1858a.getClass();
        float fMax = (Math.max(0.0f, Math.min(1.0f, fG2 == fG3 ? 0.0f : (f12 - fG2) / (fG3 - fG2))) * 1.0f) + 0.0f;
        a aVarK2 = f1853c.k(i13);
        float[] fArr2 = f1852b;
        float[] fArr3 = new float[fArr2.length];
        int length = fArr2.length;
        for (int i15 = 0; i15 < length; i15++) {
            float f13 = fArr2[i15];
            float fA2 = aVarK.a(f13);
            float fA3 = aVarK2.a(f13);
            d.f1858a.getClass();
            fArr3[i15] = ((fA3 - fA2) * fMax) + fA2;
        }
        c cVar2 = new c(fArr2, fArr3);
        b(f12, cVar2);
        return cVar2;
    }

    public static void b(float f12, c cVar) {
        synchronized (f1854d) {
            q1<a> q1VarClone = f1853c.clone();
            f1851a.getClass();
            q1VarClone.i((int) (f12 * 100.0f), cVar);
            f1853c = q1VarClone;
            G0 g02 = G0.f406611a;
        }
    }
}
