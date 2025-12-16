package androidx.compose.ui.window;

import androidx.compose.runtime.InterfaceC22118l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Effects.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.window.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22715b implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f43074a;

    public C22715b(J j12) {
        this.f43074a = j12;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        J j12 = this.f43074a;
        j12.dismiss();
        j12.f43031h.d();
    }
}
