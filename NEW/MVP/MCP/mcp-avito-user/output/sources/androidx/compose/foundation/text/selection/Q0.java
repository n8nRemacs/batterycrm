package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.M0;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: SelectionManager.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/g;", "invoke-F1C5BW0", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class Q0 extends kotlin.jvm.internal.N implements Y41.a<l0.g> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L0 f31863l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.unit.u> f31864m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(L0 l02, InterfaceC22204y1<androidx.compose.ui.unit.u> interfaceC22204y1) {
        super(0);
        this.f31863l = l02;
        this.f31864m = interfaceC22204y1;
    }

    @Override // Y41.a
    public final l0.g invoke() {
        long jB2;
        long j12 = this.f31864m.getF42167b().f42872a;
        int i12 = M0.f31854a;
        L0 l02 = this.f31863l;
        C21045x c21045xE = l02.e();
        if (c21045xE == null) {
            l0.g.f413384b.getClass();
            jB2 = l0.g.f413386d;
        } else {
            Handle handleD = l02.d();
            int i13 = handleD == null ? -1 : M0.a.f31855a[handleD.ordinal()];
            if (i13 == -1) {
                l0.g.f413384b.getClass();
                jB2 = l0.g.f413386d;
            } else if (i13 == 1) {
                jB2 = M0.b(l02, j12, c21045xE.f32156a);
            } else {
                if (i13 != 2) {
                    if (i13 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("SelectionContainer does not support cursor");
                }
                jB2 = M0.b(l02, j12, c21045xE.f32157b);
            }
        }
        return l0.g.a(jB2);
    }
}
