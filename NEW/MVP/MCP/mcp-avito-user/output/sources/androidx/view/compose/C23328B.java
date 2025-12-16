package androidx.view.compose;

import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.view.C23395u;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Effects.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23328B implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I3 f52917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C23339e f52918b;

    public C23328B(I3 i32, C23339e c23339e) {
        this.f52917a = i32;
        this.f52918b = c23339e;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        Iterator it = ((List) this.f52917a.getF42167b()).iterator();
        while (it.hasNext()) {
            this.f52918b.b().b((C23395u) it.next());
        }
    }
}
