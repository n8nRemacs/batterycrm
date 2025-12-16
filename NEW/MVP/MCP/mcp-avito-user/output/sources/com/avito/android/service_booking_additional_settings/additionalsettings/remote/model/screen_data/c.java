package com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.ServiceBookingAdditionalSettingsElement;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BottomsheetTimeGap.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/screen_data/c;", "", "", "hasCloseButton", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/screen_data/ServiceBookingAdditionalSettingsElement$IconType;", "iconType", "", "LRs0/b;", "options", "", "resetTitle", "subtitle", "title", "bottomSheetTitle", "value", "<init>", "(ZLcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/screen_data/ServiceBookingAdditionalSettingsElement$IconType;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Z", "b", "()Z", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/screen_data/ServiceBookingAdditionalSettingsElement$IconType;", "c", "()Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/screen_data/ServiceBookingAdditionalSettingsElement$IconType;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "g", "a", "h", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c {

    @com.google.gson.annotations.c("bottomsheetTitle")
    @k
    private final String bottomSheetTitle;

    @com.google.gson.annotations.c("hasCloseButton")
    private final boolean hasCloseButton;

    @com.google.gson.annotations.c("iconType")
    @k
    private final ServiceBookingAdditionalSettingsElement.IconType iconType;

    @com.google.gson.annotations.c("options")
    @k
    private final List<Rs0.b> options;

    @com.google.gson.annotations.c("resetTitle")
    @k
    private final String resetTitle;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    @l
    private final String value;

    public c(boolean z12, @k ServiceBookingAdditionalSettingsElement.IconType iconType, @k List<Rs0.b> list, @k String str, @k String str2, @k String str3, @k String str4, @l String str5) {
        this.hasCloseButton = z12;
        this.iconType = iconType;
        this.options = list;
        this.resetTitle = str;
        this.subtitle = str2;
        this.title = str3;
        this.bottomSheetTitle = str4;
        this.value = str5;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getBottomSheetTitle() {
        return this.bottomSheetTitle;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHasCloseButton() {
        return this.hasCloseButton;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final ServiceBookingAdditionalSettingsElement.IconType getIconType() {
        return this.iconType;
    }

    @k
    public final List<Rs0.b> d() {
        return this.options;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getResetTitle() {
        return this.resetTitle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.hasCloseButton == cVar.hasCloseButton && this.iconType == cVar.iconType && L.f(this.options, cVar.options) && L.f(this.resetTitle, cVar.resetTitle) && L.f(this.subtitle, cVar.subtitle) && L.f(this.title, cVar.title) && L.f(this.bottomSheetTitle, cVar.bottomSheetTitle) && L.f(this.value, cVar.value);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(H.d(H.e((this.iconType.hashCode() + (Boolean.hashCode(this.hasCloseButton) * 31)) * 31, 31, this.options), 31, this.resetTitle), 31, this.subtitle), 31, this.title), 31, this.bottomSheetTitle);
        String str = this.value;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BottomsheetTimeGap(hasCloseButton=");
        sb2.append(this.hasCloseButton);
        sb2.append(", iconType=");
        sb2.append(this.iconType);
        sb2.append(", options=");
        sb2.append(this.options);
        sb2.append(", resetTitle=");
        sb2.append(this.resetTitle);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", bottomSheetTitle=");
        sb2.append(this.bottomSheetTitle);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }
}
