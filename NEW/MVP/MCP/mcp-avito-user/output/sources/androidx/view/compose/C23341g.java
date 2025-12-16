package androidx.view.compose;

import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.snapshots.D;
import androidx.view.C23395u;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Effects.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23341g implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C23348n f52956a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C23395u f52957b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D f52958c;

    public C23341g(D d12, C23395u c23395u, C23348n c23348n) {
        this.f52956a = c23348n;
        this.f52957b = c23395u;
        this.f52958c = d12;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        C23348n c23348n = this.f52956a;
        C23395u c23395u = this.f52957b;
        c23348n.b().b(c23395u);
        this.f52958c.remove(c23395u);
    }
}
