package com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.service_booking_additional_settings.additionalsettings.remote.model.screen_data.ServiceBookingAdditionalSettingsElement;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingToggle.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/screen_data/a;", "", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/screen_data/ServiceBookingAdditionalSettingsElement$IconType;", "iconType", "", "subtitle", "title", "", "value", "<init>", "(Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/screen_data/ServiceBookingAdditionalSettingsElement$IconType;Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/screen_data/ServiceBookingAdditionalSettingsElement$IconType;", "a", "()Lcom/avito/android/service_booking_additional_settings/additionalsettings/remote/model/screen_data/ServiceBookingAdditionalSettingsElement$IconType;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "Z", "d", "()Z", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a {

    @com.google.gson.annotations.c("iconType")
    @k
    private final ServiceBookingAdditionalSettingsElement.IconType iconType;

    @com.google.gson.annotations.c("subtitle")
    @k
    private final String subtitle;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    private final boolean value;

    public a(@k ServiceBookingAdditionalSettingsElement.IconType iconType, @k String str, @k String str2, boolean z12) {
        this.iconType = iconType;
        this.subtitle = str;
        this.title = str2;
        this.value = z12;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final ServiceBookingAdditionalSettingsElement.IconType getIconType() {
        return this.iconType;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.iconType == aVar.iconType && L.f(this.subtitle, aVar.subtitle) && L.f(this.title, aVar.title) && this.value == aVar.value;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.value) + H.d(H.d(this.iconType.hashCode() * 31, 31, this.subtitle), 31, this.title);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingToggle(iconType=");
        sb2.append(this.iconType);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", value=");
        return r.x(sb2, this.value, ')');
    }
}
