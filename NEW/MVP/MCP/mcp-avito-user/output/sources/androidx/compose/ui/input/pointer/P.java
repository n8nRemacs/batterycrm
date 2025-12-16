package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.A;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PointerInteropFilter.android.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/v;", "invoke", "(Landroidx/compose/ui/v;Landroidx/compose/runtime/A;I)Landroidx/compose/ui/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class P extends kotlin.jvm.internal.N implements Y41.q<androidx.compose.ui.v, androidx.compose.runtime.A, Integer, androidx.compose.ui.v> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MotionEvent, Boolean> f40172l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(Y41.l lVar) {
        super(3);
        this.f40172l = lVar;
    }

    @Override // Y41.q
    public final androidx.compose.ui.v invoke(androidx.compose.ui.v vVar, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        num.intValue();
        a13.C(374375707);
        Object objT = a13.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = new M();
            a13.H(objT);
        }
        M m12 = (M) objT;
        m12.f40155b = (kotlin.jvm.internal.N) this.f40172l;
        X x12 = m12.f40156c;
        if (x12 != null) {
            x12.f40196b = null;
        }
        m12.f40156c = null;
        a13.h();
        return m12;
    }
}
