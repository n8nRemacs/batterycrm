package androidx.view.compose;

import Y61.k;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.S;
import androidx.compose.runtime.Y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.r;
import androidx.compose.runtime.saveable.l;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.C23395u;
import androidx.view.InterfaceC22969B;
import androidx.view.M0;
import androidx.view.T0;
import androidx.view.viewmodel.compose.a;
import androidx.view.viewmodel.compose.j;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: NavBackStackEntryProvider.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23352r {
    @InterfaceC22132o
    public static final void a(@k C23395u c23395u, @k l lVar, @k C22096n c22096n, @Y61.l A a12, int i12) {
        B bE2 = a12.E(-1579360880);
        a.f46897a.getClass();
        S.b(new Y1[]{a.f46898b.b(c23395u), AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().b(c23395u), AndroidCompositionLocals_androidKt.f41072e.b(c23395u)}, r.b(bE2, -52928304, new C23349o(lVar, c22096n, i12)), bE2, 56);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C23350p(c23395u, lVar, c22096n, i12);
    }

    public static final void b(l lVar, C22096n c22096n, A a12, int i12) {
        B bE2 = a12.E(1211832233);
        bE2.I(1729797275);
        a.f46897a.getClass();
        T0 t0A = a.a(bE2);
        if (t0A == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        M0 m0A = j.a(C23335a.class, t0A, null, null, t0A instanceof InterfaceC22969B ? ((InterfaceC22969B) t0A).getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b, bE2, 0);
        bE2.X(false);
        C23335a c23335a = (C23335a) m0A;
        c23335a.f52935J = new WeakReference<>(lVar);
        lVar.b(c23335a.f52934E, c22096n, bE2, (i12 & 112) | 520);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C23351q(lVar, c22096n, i12);
    }
}
