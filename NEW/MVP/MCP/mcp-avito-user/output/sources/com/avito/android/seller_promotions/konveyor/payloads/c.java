package com.avito.android.seller_promotions.konveyor.payloads;

import Y61.k;
import Y61.l;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SnippetItemPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/konveyor/payloads/c;", "", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Boolean f267826a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Stepper f267827b;

    public c(@l Boolean bool, @l Stepper stepper) {
        this.f267826a = bool;
        this.f267827b = stepper;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f267826a, cVar.f267826a) && L.f(this.f267827b, cVar.f267827b);
    }

    public final int hashCode() {
        Boolean bool = this.f267826a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Stepper stepper = this.f267827b;
        return iHashCode + (stepper != null ? stepper.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SnippetItemPayload(isFavorite=" + this.f267826a + ", stepper=" + this.f267827b + ')';
    }
}
