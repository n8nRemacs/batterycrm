package androidx.compose.foundation.gestures;

import android.content.Context;
import androidx.compose.foundation.gestures.J;
import androidx.compose.runtime.C22032b0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;

/* compiled from: BringIntoViewSpec.android.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22032b0 f27301a = new C22032b0(a.f27303l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final b f27302b = new b();

    /* compiled from: BringIntoViewSpec.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/P;", "Landroidx/compose/foundation/gestures/J;", "invoke", "(Landroidx/compose/runtime/P;)Landroidx/compose/foundation/gestures/J;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.runtime.P, J> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f27303l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final J invoke(androidx.compose.runtime.P p12) {
            if (((Context) p12.i(AndroidCompositionLocals_androidKt.f41069b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                return K.f27302b;
            }
            J.f27277a.getClass();
            return J.a.f27280c;
        }
    }

    /* compiled from: BringIntoViewSpec.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/K$b", "Landroidx/compose/foundation/gestures/J;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements J {
        @Override // androidx.compose.foundation.gestures.J
        public final float a(float f12, float f13, float f14) {
            float fAbs = Math.abs((f13 + f12) - f12);
            float f15 = (0.3f * f14) - (0.0f * fAbs);
            float f16 = f14 - f15;
            if ((fAbs <= f14) && f16 < fAbs) {
                f15 = f14 - fAbs;
            }
            return f12 - f15;
        }
    }
}
