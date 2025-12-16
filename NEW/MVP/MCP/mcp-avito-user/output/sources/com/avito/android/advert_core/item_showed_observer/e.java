package com.avito.android.advert_core.item_showed_observer;

import Y61.l;
import kotlin.Metadata;

/* compiled from: ItemShowedObserver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/item_showed_observer/e;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f83716a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83717b;

    public e(int i12, int i13) {
        this.f83716a = i12;
        this.f83717b = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !e.class.equals(obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        return this.f83716a == eVar.f83716a && this.f83717b == eVar.f83717b;
    }

    public final int hashCode() {
        return (this.f83716a * 31) + this.f83717b;
    }
}
