package com.avito.android.service_booking_user_profile.view.item;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlockActionItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/item/ServiceBookingBlockActionItem;", "Lcom/avito/conveyor_item/a;", "ActionType", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceBookingBlockActionItem implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f278162b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Image f278163c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f278164d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final PrintableText f278165e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final PrintableText f278166f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f278167g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final ActionType f278168h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServiceBookingBlockActionItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_user_profile/view/item/ServiceBookingBlockActionItem$ActionType;", "", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionType {

        /* renamed from: b, reason: collision with root package name */
        public static final ActionType f278169b;

        /* renamed from: c, reason: collision with root package name */
        public static final ActionType f278170c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ActionType[] f278171d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f278172e;

        static {
            ActionType actionType = new ActionType("REMINDER", 0);
            f278169b = actionType;
            ActionType actionType2 = new ActionType("LISTING", 1);
            f278170c = actionType2;
            ActionType[] actionTypeArr = {actionType, actionType2};
            f278171d = actionTypeArr;
            f278172e = kotlin.enums.c.a(actionTypeArr);
        }

        public ActionType() {
            throw null;
        }

        public static ActionType valueOf(String str) {
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }

        public static ActionType[] values() {
            return (ActionType[]) f278171d.clone();
        }
    }

    public ServiceBookingBlockActionItem(@k String str, @l Image image, @k DeepLink deepLink, @k PrintableText printableText, @k PrintableText printableText2, @l AttributedText attributedText, @k ActionType actionType) {
        this.f278162b = str;
        this.f278163c = image;
        this.f278164d = deepLink;
        this.f278165e = printableText;
        this.f278166f = printableText2;
        this.f278167g = attributedText;
        this.f278168h = actionType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingBlockActionItem)) {
            return false;
        }
        ServiceBookingBlockActionItem serviceBookingBlockActionItem = (ServiceBookingBlockActionItem) obj;
        return L.f(this.f278162b, serviceBookingBlockActionItem.f278162b) && L.f(this.f278163c, serviceBookingBlockActionItem.f278163c) && L.f(this.f278164d, serviceBookingBlockActionItem.f278164d) && L.f(this.f278165e, serviceBookingBlockActionItem.f278165e) && L.f(this.f278166f, serviceBookingBlockActionItem.f278166f) && L.f(this.f278167g, serviceBookingBlockActionItem.f278167g) && this.f278168h == serviceBookingBlockActionItem.f278168h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79989b() {
        return getF79990c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF79990c() {
        return this.f278162b;
    }

    public final int hashCode() {
        int iHashCode = this.f278162b.hashCode() * 31;
        Image image = this.f278163c;
        int iF2 = com.avito.android.actions_sheet.a.f(this.f278166f, com.avito.android.actions_sheet.a.f(this.f278165e, com.avito.android.actions_sheet.a.e(this.f278164d, (iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31), 31), 31);
        AttributedText attributedText = this.f278167g;
        return this.f278168h.hashCode() + ((iF2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ServiceBookingBlockActionItem(stringId=" + this.f278162b + ", image=" + this.f278163c + ", uri=" + this.f278164d + ", title=" + this.f278165e + ", subtitle=" + this.f278166f + ", additionalText=" + this.f278167g + ", actionType=" + this.f278168h + ')';
    }
}
