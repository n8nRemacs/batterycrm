package com.avito.android.delivery_tarifikator.presentation.konveyor.item.titletext;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TitleTextItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/titletext/d;", "Lcom/avito/conveyor_item/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f135507b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final c f135508c;

    public d(@k String str, @k c cVar) {
        this.f135507b = str;
        this.f135508c = cVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f135507b, dVar.f135507b) && L.f(this.f135508c, dVar.f135508c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83798f() {
        return getF135507b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF135507b() {
        return this.f135507b;
    }

    public final int hashCode() {
        return this.f135508c.hashCode() + (this.f135507b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "TitleTextItem(stringId=" + this.f135507b + ", data=" + this.f135508c + ')';
    }
}
