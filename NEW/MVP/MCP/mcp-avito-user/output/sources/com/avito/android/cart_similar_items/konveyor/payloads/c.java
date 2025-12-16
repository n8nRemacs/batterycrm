package com.avito.android.cart_similar_items.konveyor.payloads;

import Y61.k;
import Y61.l;
import com.avito.android.cart_snippet_actions.models.ui.Stepper;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SnippetItemPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cart_similar_items/konveyor/payloads/c;", "", "_avito_cart-similar-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Boolean f115865a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Stepper f115866b;

    public c(@l Boolean bool, @l Stepper stepper) {
        this.f115865a = bool;
        this.f115866b = stepper;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f115865a, cVar.f115865a) && L.f(this.f115866b, cVar.f115866b);
    }

    public final int hashCode() {
        Boolean bool = this.f115865a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Stepper stepper = this.f115866b;
        return iHashCode + (stepper != null ? stepper.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "SnippetItemPayload(isFavorite=" + this.f115865a + ", stepper=" + this.f115866b + ')';
    }
}
