package com.avito.android.user_advert.advert.items.service_booking_reminder;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.text.AttributedText;
import j.InterfaceC42150f;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingReminderItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/service_booking_reminder/c;", "Lcom/avito/conveyor_item/a;", "a", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f310149b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f310150c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f310151d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f310152e;

    /* renamed from: f, reason: collision with root package name */
    public final int f310153f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a f310154g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AttributedText f310155h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final MyAdvertDetails.SbStatusBlock.Event f310156i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final MyAdvertDetails.ServiceBookingReminderBlock.SbReminderBannerType f310157j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Long f310158k;

    /* compiled from: ServiceBookingReminderItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/service_booking_reminder/c$a;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f310159a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f310160b;

        /* renamed from: c, reason: collision with root package name */
        public final int f310161c;

        public a(@InterfaceC42150f int i12, @Y61.k DeepLink deepLink, @Y61.k String str) {
            this.f310159a = str;
            this.f310160b = deepLink;
            this.f310161c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f310159a, aVar.f310159a) && L.f(this.f310160b, aVar.f310160b) && this.f310161c == aVar.f310161c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f310161c) + com.avito.android.actions_sheet.a.e(this.f310160b, this.f310159a.hashCode() * 31, 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(title=");
            sb2.append(this.f310159a);
            sb2.append(", uri=");
            sb2.append(this.f310160b);
            sb2.append(", styleAttr=");
            return r.t(sb2, this.f310161c, ')');
        }
    }

    public c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @InterfaceC42150f int i12, @Y61.k a aVar, @Y61.k AttributedText attributedText, @Y61.l MyAdvertDetails.SbStatusBlock.Event event, @Y61.k MyAdvertDetails.ServiceBookingReminderBlock.SbReminderBannerType sbReminderBannerType, @Y61.l Long l12) {
        this.f310149b = str;
        this.f310150c = str2;
        this.f310151d = str3;
        this.f310152e = str4;
        this.f310153f = i12;
        this.f310154g = aVar;
        this.f310155h = attributedText;
        this.f310156i = event;
        this.f310157j = sbReminderBannerType;
        this.f310158k = l12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f310149b, cVar.f310149b) && L.f(this.f310150c, cVar.f310150c) && L.f(this.f310151d, cVar.f310151d) && L.f(this.f310152e, cVar.f310152e) && this.f310153f == cVar.f310153f && L.f(this.f310154g, cVar.f310154g) && L.f(this.f310155h, cVar.f310155h) && L.f(this.f310156i, cVar.f310156i) && this.f310157j == cVar.f310157j && L.f(this.f310158k, cVar.f310158k);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269930b() {
        return getF309410b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309410b() {
        return this.f310149b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f310149b.hashCode() * 31, 31, this.f310150c), 31, this.f310151d);
        String str = this.f310152e;
        int iB2 = com.avito.android.actions_sheet.a.b((this.f310154g.hashCode() + r.e(this.f310153f, (iD2 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31, 31, this.f310155h);
        MyAdvertDetails.SbStatusBlock.Event event = this.f310156i;
        int iHashCode = (this.f310157j.hashCode() + ((iB2 + (event == null ? 0 : event.hashCode())) * 31)) * 31;
        Long l12 = this.f310158k;
        return iHashCode + (l12 != null ? l12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingReminderItem(stringId=");
        sb2.append(this.f310149b);
        sb2.append(", status=");
        sb2.append(this.f310150c);
        sb2.append(", subtitle=");
        sb2.append(this.f310151d);
        sb2.append(", description=");
        sb2.append(this.f310152e);
        sb2.append(", styleAttr=");
        sb2.append(this.f310153f);
        sb2.append(", action=");
        sb2.append(this.f310154g);
        sb2.append(", details=");
        sb2.append(this.f310155h);
        sb2.append(", event=");
        sb2.append(this.f310156i);
        sb2.append(", bannerType=");
        sb2.append(this.f310157j);
        sb2.append(", closeDayTimeGap=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.f310158k, ')');
    }
}
