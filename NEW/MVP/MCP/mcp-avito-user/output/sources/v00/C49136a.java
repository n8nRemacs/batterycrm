package v00;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.C23424o;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: LandingPayloadProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lv00/a;", "Landroidx/recyclerview/widget/o$f;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49136a extends C23424o.f<LandingItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Set<com.avito.android.recycler.data_aware.a> f440362a;

    @Inject
    public C49136a(@k Set<com.avito.android.recycler.data_aware.a> set) {
        this.f440362a = set;
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(LandingItem landingItem, LandingItem landingItem2) {
        return landingItem.equals(landingItem2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(LandingItem landingItem, LandingItem landingItem2) {
        return landingItem.getF272437b() == landingItem2.getF272437b();
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(LandingItem landingItem, LandingItem landingItem2) {
        LandingItem landingItem3 = landingItem;
        LandingItem landingItem4 = landingItem2;
        Set<com.avito.android.recycler.data_aware.a> set = this.f440362a;
        ArrayList arrayList = new ArrayList(C42745f0.q(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.avito.android.recycler.data_aware.a) it.next()).a(landingItem3, landingItem4));
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
