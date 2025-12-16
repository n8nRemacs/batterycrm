package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.core.view.C22823h0;
import kotlin.Metadata;

/* compiled from: WindowInsets.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class F2 extends kotlin.jvm.internal.N implements Y41.l<C22128n0, InterfaceC22118l0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G2 f28252l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f28253m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F2(G2 g22, View view) {
        super(1);
        this.f28252l = g22;
        this.f28253m = view;
    }

    @Override // Y41.l
    public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
        G2 g22 = this.f28252l;
        int i12 = g22.f28297v;
        View view = this.f28253m;
        if (i12 == 0) {
            RunnableC20626u1 runnableC20626u1 = g22.f28298w;
            C22823h0.K(view, runnableC20626u1);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(runnableC20626u1);
            C22823h0.R(view, runnableC20626u1);
        }
        g22.f28297v++;
        return new E2(g22, view);
    }
}
