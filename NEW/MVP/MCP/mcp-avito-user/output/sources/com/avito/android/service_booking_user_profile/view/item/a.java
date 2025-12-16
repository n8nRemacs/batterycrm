package com.avito.android.service_booking_user_profile.view.item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.media3.common.C23088b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlockItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/item/a;", "Lcom/avito/conveyor_item/a;", "a", "b", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f278173b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PrintableText f278174c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f278175d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final b f278176e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C8261a f278177f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f278178g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f278179h;

    /* compiled from: ServiceBookingBlockItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/item/a$a;", "", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.service_booking_user_profile.view.item.a$a, reason: collision with other inner class name */
    public static final /* data */ class C8261a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f278180a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AttributedText f278181b;

        public C8261a(@l DeepLink deepLink, @k AttributedText attributedText) {
            this.f278180a = deepLink;
            this.f278181b = attributedText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C8261a)) {
                return false;
            }
            C8261a c8261a = (C8261a) obj;
            return L.f(this.f278180a, c8261a.f278180a) && L.f(this.f278181b, c8261a.f278181b);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f278180a;
            return this.f278181b.hashCode() + ((deepLink == null ? 0 : deepLink.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Action(deepLink=");
            sb2.append(this.f278180a);
            sb2.append(", value=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f278181b, ')');
        }
    }

    /* compiled from: ServiceBookingBlockItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/item/a$b;", "", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f278182a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final DeepLink f278183b;

        public b(@k String str, @k DeepLink deepLink) {
            this.f278182a = str;
            this.f278183b = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f278182a, bVar.f278182a) && L.f(this.f278183b, bVar.f278183b);
        }

        public final int hashCode() {
            return this.f278183b.hashCode() + (this.f278182a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Icon(name=");
            sb2.append(this.f278182a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f278183b, ')');
        }
    }

    public a(@k String str, @k PrintableText printableText, @k PrintableText printableText2, @l b bVar, @l C8261a c8261a, @k List<ServiceBookingBlockActionItem> list, boolean z12) {
        this.f278173b = str;
        this.f278174c = printableText;
        this.f278175d = printableText2;
        this.f278176e = bVar;
        this.f278177f = c8261a;
        this.f278178g = list;
        this.f278179h = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f278173b.equals(aVar.f278173b) && this.f278174c.equals(aVar.f278174c) && this.f278175d.equals(aVar.f278175d) && L.f(this.f278176e, aVar.f278176e) && L.f(this.f278177f, aVar.f278177f) && L.f(this.f278178g, aVar.f278178g) && this.f278179h == aVar.f278179h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return getF236903b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF236903b() {
        return this.f278173b;
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f278175d, com.avito.android.actions_sheet.a.f(this.f278174c, this.f278173b.hashCode() * 31, 31), 31);
        b bVar = this.f278176e;
        int iHashCode = (iF2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        C8261a c8261a = this.f278177f;
        return Boolean.hashCode(this.f278179h) + C23088b.a((iHashCode + (c8261a != null ? c8261a.hashCode() : 0)) * 31, 31, this.f278178g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceBookingBlockItem(stringId=");
        sb2.append(this.f278173b);
        sb2.append(", title=");
        sb2.append(this.f278174c);
        sb2.append(", titleBadge=");
        sb2.append(this.f278175d);
        sb2.append(", titleIcon=");
        sb2.append(this.f278176e);
        sb2.append(", action=");
        sb2.append(this.f278177f);
        sb2.append(", actionItems=");
        sb2.append(this.f278178g);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f278179h, ')');
    }
}
