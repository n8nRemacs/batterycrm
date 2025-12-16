package androidx.compose.material3;

import android.view.View;
import androidx.compose.runtime.InterfaceC22118l0;
import kotlin.Metadata;

/* compiled from: Effects.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21880t7 implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC21902u7 f37311a;

    public C21880t7(ViewOnAttachStateChangeListenerC21902u7 viewOnAttachStateChangeListenerC21902u7) {
        this.f37311a = viewOnAttachStateChangeListenerC21902u7;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        ViewOnAttachStateChangeListenerC21902u7 viewOnAttachStateChangeListenerC21902u7 = this.f37311a;
        boolean z12 = viewOnAttachStateChangeListenerC21902u7.f37412b;
        View view = viewOnAttachStateChangeListenerC21902u7.f37413c;
        if (z12) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewOnAttachStateChangeListenerC21902u7);
            viewOnAttachStateChangeListenerC21902u7.f37412b = false;
        }
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC21902u7);
    }
}
