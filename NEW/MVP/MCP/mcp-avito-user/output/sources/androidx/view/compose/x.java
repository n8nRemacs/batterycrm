package androidx.view.compose;

import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.snapshots.C22166k;
import androidx.compose.runtime.snapshots.H;
import androidx.view.s;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Effects.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class x implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f21210a;

    public x(p pVar) {
        this.f21210a = pVar;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        boolean z12;
        p pVar = this.f21210a;
        pVar.f21203d.c(pVar.f21202c);
        s sVar = pVar.f21201b;
        synchronized (sVar.f21277c) {
            z12 = sVar.f21280f;
        }
        if (!z12) {
            sVar.b();
        }
        H h12 = pVar.f21203d;
        h12.b();
        C22166k c22166k = h12.f38634h;
        if (c22166k != null) {
            c22166k.dispose();
        }
    }
}
