package com.avito.android.advert_core.item_showed_observer;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ItemShowedObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/item_showed_observer/a;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<Integer> f83703a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N f83704b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f83705c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k Y41.a aVar, @k List list) {
        this.f83703a = list;
        this.f83704b = (N) aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f83703a.equals(aVar.f83703a) && this.f83704b.equals(aVar.f83704b);
    }

    public final int hashCode() {
        return this.f83704b.hashCode() + r.i(this.f83703a.hashCode() * 31, 31, true);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemShowedAction(itemPositions=");
        sb2.append(this.f83703a);
        sb2.append(", runOnce=true, action=");
        return C22026a.d(sb2, this.f83704b, ')');
    }
}
