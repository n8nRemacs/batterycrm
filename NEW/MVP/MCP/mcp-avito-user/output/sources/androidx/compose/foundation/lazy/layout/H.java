package androidx.compose.foundation.lazy.layout;

import androidx.collection.Y0;
import androidx.compose.ui.layout.a1;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: LazyLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/layout/H;", "Landroidx/compose/ui/layout/a1;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class H implements a1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final B f29296a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.collection.M0<Object> f29297b = Y0.a();

    public H(@Y61.k B b12) {
        this.f29296a = b12;
    }

    @Override // androidx.compose.ui.layout.a1
    public final void a(@Y61.k a1.a aVar) {
        androidx.collection.M0<Object> m02 = this.f29297b;
        m02.c();
        Iterator<Object> it = aVar.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object objB = this.f29296a.b(next);
            int iA2 = m02.a(objB);
            int i12 = iA2 >= 0 ? m02.f25649c[iA2] : 0;
            if (i12 == 7) {
                aVar.remove(next);
            } else {
                m02.h(i12 + 1, objB);
            }
        }
    }

    @Override // androidx.compose.ui.layout.a1
    public final boolean b(@Y61.l Object obj, @Y61.l Object obj2) {
        B b12 = this.f29296a;
        return kotlin.jvm.internal.L.f(b12.b(obj), b12.b(obj2));
    }
}
