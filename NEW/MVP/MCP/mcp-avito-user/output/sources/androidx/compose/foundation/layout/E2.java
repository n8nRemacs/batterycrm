package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.core.view.C22823h0;
import kotlin.Metadata;

/* compiled from: Effects.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E2 implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G2 f28240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f28241b;

    public E2(G2 g22, View view) {
        this.f28240a = g22;
        this.f28241b = view;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        G2 g22 = this.f28240a;
        int i12 = g22.f28297v - 1;
        g22.f28297v = i12;
        if (i12 == 0) {
            View view = this.f28241b;
            C22823h0.K(view, null);
            C22823h0.R(view, null);
            view.removeOnAttachStateChangeListener(g22.f28298w);
        }
    }
}
