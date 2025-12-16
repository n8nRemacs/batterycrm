package com.avito.android.profile.user_profile.cards.service_booking.items;

import androidx.recyclerview.widget.C23424o;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile.user_profile.cards.service_booking.items.detailed_info.ServiceBookingsDetailedInfoItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.L3;
import com.avito.android.util.M3;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingDiffCallback.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0005\u0006B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/d;", "Landroidx/recyclerview/widget/o$f;", "LTV0/a;", "<init>", "()V", "a", "b", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d extends C23424o.f<TV0.a> {

    /* compiled from: ServiceBookingDiffCallback.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/d$a;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final L3<String> f225414a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final L3<DeepLink> f225415b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final L3<ServiceBookingsDetailedInfoItem.Icon> f225416c;

        public a(@Y61.k L3<String> l32, @Y61.k L3<DeepLink> l33, @Y61.k L3<ServiceBookingsDetailedInfoItem.Icon> l34) {
            this.f225414a = l32;
            this.f225415b = l33;
            this.f225416c = l34;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f225414a, aVar.f225414a) && L.f(this.f225415b, aVar.f225415b) && L.f(this.f225416c, aVar.f225416c);
        }

        public final int hashCode() {
            return this.f225416c.hashCode() + com.avito.android.actions_sheet.a.k(this.f225415b, this.f225414a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            return "AllOrdersItemPayload(title=" + this.f225414a + ", deepLink=" + this.f225415b + ", icon=" + this.f225416c + ')';
        }
    }

    /* compiled from: ServiceBookingDiffCallback.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/items/d$b;", "", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final L3<String> f225417a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final L3<String> f225418b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final L3<AttributedText> f225419c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final L3<Image> f225420d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final L3<DeepLink> f225421e;

        public b(@Y61.k L3<String> l32, @Y61.k L3<String> l33, @Y61.k L3<AttributedText> l34, @Y61.k L3<Image> l35, @Y61.k L3<DeepLink> l36) {
            this.f225417a = l32;
            this.f225418b = l33;
            this.f225419c = l34;
            this.f225420d = l35;
            this.f225421e = l36;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f225417a, bVar.f225417a) && L.f(this.f225418b, bVar.f225418b) && L.f(this.f225419c, bVar.f225419c) && L.f(this.f225420d, bVar.f225420d) && L.f(this.f225421e, bVar.f225421e);
        }

        public final int hashCode() {
            return this.f225421e.hashCode() + com.avito.android.actions_sheet.a.k(this.f225420d, com.avito.android.actions_sheet.a.k(this.f225419c, com.avito.android.actions_sheet.a.k(this.f225418b, this.f225417a.hashCode() * 31, 31), 31), 31);
        }

        @Y61.k
        public final String toString() {
            return "SbOrderSnippetItemPayload(title=" + this.f225417a + ", subtitle=" + this.f225418b + ", additionalText=" + this.f225419c + ", image=" + this.f225420d + ", deepLink=" + this.f225421e + ')';
        }
    }

    @Inject
    public d() {
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean a(TV0.a aVar, TV0.a aVar2) {
        return aVar.equals(aVar2);
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final boolean b(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        return aVar3.getId() == aVar4.getId() && aVar3.getClass().equals(aVar4.getClass());
    }

    @Override // androidx.recyclerview.widget.C23424o.f
    public final Object c(TV0.a aVar, TV0.a aVar2) {
        TV0.a aVar3 = aVar;
        TV0.a aVar4 = aVar2;
        if (aVar3.getId() != aVar4.getId()) {
            return null;
        }
        if ((aVar3 instanceof com.avito.android.profile.user_profile.cards.service_booking.items.order.ServiceBookingItem) && (aVar4 instanceof com.avito.android.profile.user_profile.cards.service_booking.items.order.ServiceBookingItem)) {
            com.avito.android.profile.user_profile.cards.service_booking.items.order.ServiceBookingItem serviceBookingItem = (com.avito.android.profile.user_profile.cards.service_booking.items.order.ServiceBookingItem) aVar4;
            return new b(M3.a(new k(aVar3), serviceBookingItem.f225455c), M3.a(new j(aVar3), serviceBookingItem.f225456d), M3.a(new e(aVar3), serviceBookingItem.f225457e), M3.a(new i(aVar3), serviceBookingItem.f225458f), M3.a(new f(aVar3), serviceBookingItem.f225459g));
        }
        if (!(aVar3 instanceof ServiceBookingsDetailedInfoItem) || !(aVar4 instanceof ServiceBookingsDetailedInfoItem)) {
            return null;
        }
        ServiceBookingsDetailedInfoItem serviceBookingsDetailedInfoItem = (ServiceBookingsDetailedInfoItem) aVar4;
        return new a(M3.a(new l(aVar3), serviceBookingsDetailedInfoItem.f225423c), M3.a(new g(aVar3), serviceBookingsDetailedInfoItem.f225424d), M3.a(new h(aVar3), serviceBookingsDetailedInfoItem.f225425e));
    }
}
