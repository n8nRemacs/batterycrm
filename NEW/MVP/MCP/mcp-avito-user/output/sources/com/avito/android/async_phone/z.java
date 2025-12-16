package com.avito.android.async_phone;

import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AsyncPhonePresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/z;", "", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* data */ class z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final AsyncPhoneItem f92299a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Q81.a f92300b;

    public z(@Y61.l AsyncPhoneItem asyncPhoneItem, @Y61.l Q81.a aVar) {
        this.f92299a = asyncPhoneItem;
        this.f92300b = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return L.f(this.f92299a, zVar.f92299a) && L.f(this.f92300b, zVar.f92300b);
    }

    public final int hashCode() {
        AsyncPhoneItem asyncPhoneItem = this.f92299a;
        int iHashCode = (asyncPhoneItem == null ? 0 : asyncPhoneItem.hashCode()) * 31;
        Q81.a aVar = this.f92300b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "PhoneLoadingPair(item=" + this.f92299a + ", itemView=" + this.f92300b + ')';
    }
}
