package com.avito.android.profile.user_profile.cards.service_booking;

import com.avito.android.remote.model.user_profile.items.ServiceBookingItem;
import com.avito.android.util.L3;
import com.avito.conveyor_item.ParcelableItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/o;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L3<String> f225486a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L3<String> f225487b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final L3<String> f225488c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final L3<List<ParcelableItem>> f225489d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final L3<ServiceBookingItem.Action> f225490e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final L3<Boolean> f225491f;

    public o(@Y61.k L3<String> l32, @Y61.k L3<String> l33, @Y61.k L3<String> l34, @Y61.k L3<List<ParcelableItem>> l35, @Y61.k L3<ServiceBookingItem.Action> l36, @Y61.k L3<Boolean> l37) {
        this.f225486a = l32;
        this.f225487b = l33;
        this.f225488c = l34;
        this.f225489d = l35;
        this.f225490e = l36;
        this.f225491f = l37;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f225486a, oVar.f225486a) && L.f(this.f225487b, oVar.f225487b) && L.f(this.f225488c, oVar.f225488c) && L.f(this.f225489d, oVar.f225489d) && L.f(this.f225490e, oVar.f225490e) && L.f(this.f225491f, oVar.f225491f);
    }

    public final int hashCode() {
        return this.f225491f.hashCode() + com.avito.android.actions_sheet.a.k(this.f225490e, com.avito.android.actions_sheet.a.k(this.f225489d, com.avito.android.actions_sheet.a.k(this.f225488c, com.avito.android.actions_sheet.a.k(this.f225487b, this.f225486a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        return "ServiceBookingPayload(title=" + this.f225486a + ", subtitle=" + this.f225487b + ", badgeText=" + this.f225488c + ", items=" + this.f225489d + ", action=" + this.f225490e + ", isLoading=" + this.f225491f + ')';
    }
}
