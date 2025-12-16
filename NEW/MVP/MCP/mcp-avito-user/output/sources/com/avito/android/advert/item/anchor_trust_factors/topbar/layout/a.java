package com.avito.android.advert.item.anchor_trust_factors.topbar.layout;

import Y41.l;
import Y61.k;
import androidx.compose.foundation.H;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import r4.C47486a;

/* compiled from: TopBarAnchorsContainer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/anchor_trust_factors/topbar/layout/a;", "Lkotlin/Function0;", "Lkotlin/G0;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class a implements Y41.a<G0> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C47486a.C12352a f72872b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<C47486a.C12352a, G0> f72873c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k C47486a.C12352a c12352a, @k l<? super C47486a.C12352a, G0> lVar) {
        this.f72872b = c12352a;
        this.f72873c = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f72872b, aVar.f72872b) && L.f(this.f72873c, aVar.f72873c);
    }

    public final int hashCode() {
        return this.f72873c.hashCode() + (this.f72872b.hashCode() * 31);
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f72873c.invoke(this.f72872b);
        return G0.f406611a;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonClickListener(button=");
        sb2.append(this.f72872b);
        sb2.append(", listener=");
        return H.l(sb2, this.f72873c, ')');
    }
}
