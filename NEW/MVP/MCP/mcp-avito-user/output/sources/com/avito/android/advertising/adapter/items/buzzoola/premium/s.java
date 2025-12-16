package com.avito.android.advertising.adapter.items.buzzoola.premium;

import com.avito.android.util.Kundle;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CommercialStateSaver.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/premium/s;", "Lcom/avito/android/advertising/adapter/items/buzzoola/premium/r;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<q> f87447a;

    @Inject
    public s(@Y61.k Set<q> set) {
        this.f87447a = set;
    }

    @Override // com.avito.android.advertising.adapter.items.buzzoola.premium.r
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        Iterator<T> it = this.f87447a.iterator();
        while (it.hasNext()) {
            ((q) it.next()).P6(kundle);
        }
        return kundle;
    }
}
