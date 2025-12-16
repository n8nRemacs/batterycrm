package com.avito.android.profile.user_profile.cards.active_orders;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.L3;
import com.avito.conveyor_item.ParcelableItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ActiveOrdersCardPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/active_orders/c;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L3<String> f224647a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L3<String> f224648b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final L3<List<ParcelableItem>> f224649c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final L3<DeepLink> f224650d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final L3<DeepLink> f224651e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final L3<String> f224652f;

    public c(@Y61.k L3<String> l32, @Y61.k L3<String> l33, @Y61.k L3<List<ParcelableItem>> l34, @Y61.k L3<DeepLink> l35, @Y61.k L3<DeepLink> l36, @Y61.k L3<String> l37) {
        this.f224647a = l32;
        this.f224648b = l33;
        this.f224649c = l34;
        this.f224650d = l35;
        this.f224651e = l36;
        this.f224652f = l37;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f224647a, cVar.f224647a) && L.f(this.f224648b, cVar.f224648b) && L.f(this.f224649c, cVar.f224649c) && L.f(this.f224650d, cVar.f224650d) && L.f(this.f224651e, cVar.f224651e) && L.f(this.f224652f, cVar.f224652f);
    }

    public final int hashCode() {
        return this.f224652f.hashCode() + com.avito.android.actions_sheet.a.k(this.f224651e, com.avito.android.actions_sheet.a.k(this.f224650d, com.avito.android.actions_sheet.a.k(this.f224649c, com.avito.android.actions_sheet.a.k(this.f224648b, this.f224647a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        return "ActiveOrdersCardPayload(title=" + this.f224647a + ", badgeText=" + this.f224648b + ", items=" + this.f224649c + ", onTapDeepLink=" + this.f224650d + ", onShowDeepLink=" + this.f224651e + ", actionButtonText=" + this.f224652f + ')';
    }
}
