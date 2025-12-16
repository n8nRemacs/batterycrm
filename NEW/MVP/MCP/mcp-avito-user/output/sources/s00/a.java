package S00;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PreApprovalDiffCallback.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"LS00/a;", "Landroidx/recyclerview/widget/o$f;", "LT00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends C23424o.f<T00.a> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<com.avito.android.recycler.data_aware.a> f14786a;

    @Inject
    public a(@k Set<com.avito.android.recycler.data_aware.a> set) {
        this.f14786a = set;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(T00.a aVar, T00.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(T00.a aVar, T00.a aVar2) {
        return aVar.getF269930b() == aVar2.getF269930b();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(T00.a aVar, T00.a aVar2) {
        T00.a aVar3 = aVar;
        T00.a aVar4 = aVar2;
        Set<com.avito.android.recycler.data_aware.a> set = this.f14786a;
        ArrayList arrayList = new ArrayList(C42745f0.q(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.android.recycler.data_aware.a) it.next()).a(aVar3, aVar4));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next != null) {
                return next;
            }
        }
        return null;
    }
}
