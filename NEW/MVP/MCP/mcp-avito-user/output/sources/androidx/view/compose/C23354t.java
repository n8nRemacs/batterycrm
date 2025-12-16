package androidx.view.compose;

import androidx.compose.runtime.internal.C22096n;
import androidx.view.C23302N;
import androidx.view.C23303N0;
import androidx.view.C23326c0;
import androidx.view.C23375k;
import androidx.view.compose.C23339e;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: NavGraphBuilder.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23354t {
    public static void a(C23326c0 c23326c0, String str, C22096n c22096n) {
        C42784z0<C23375k> c42784z0 = C42784z0.f406748b;
        C23303N0 c23303n0 = c23326c0.f52912g;
        c23303n0.getClass();
        C23303N0.f52846b.getClass();
        C23339e.b bVar = new C23339e.b((C23339e) c23303n0.b(C23303N0.a.a(C23339e.class)), new C22096n(484185514, new C23353s(c22096n), true));
        bVar.t(str);
        for (C23375k c23375k : c42784z0) {
            bVar.f52885h.put(c23375k.f53166a, c23375k.f53167b);
        }
        Iterator<E> it = c42784z0.iterator();
        while (it.hasNext()) {
            bVar.a((C23302N) it.next());
        }
        c23326c0.f52914i.add(bVar);
    }
}
