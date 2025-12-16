package com.avito.android.delivery_tarifikator.presentation.konveyor.item.tariffcard.onboarding;

import Ov.C14740c;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCardOnboardingItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/tariffcard/onboarding/c;", "Lcom/avito/conveyor_item/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f135490b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C14740c f135491c;

    public c(@k String str, @k C14740c c14740c) {
        this.f135490b = str;
        this.f135491c = c14740c;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f135490b, cVar.f135490b) && L.f(this.f135491c, cVar.f135491c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83798f() {
        return getF135490b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF135507b() {
        return this.f135490b;
    }

    public final int hashCode() {
        return this.f135491c.hashCode() + (this.f135490b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "TariffCardOnboardingItem(stringId=" + this.f135490b + ", data=" + this.f135491c + ')';
    }
}
