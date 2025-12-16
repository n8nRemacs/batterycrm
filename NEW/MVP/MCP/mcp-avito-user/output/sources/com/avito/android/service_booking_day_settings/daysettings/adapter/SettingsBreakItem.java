package com.avito.android.service_booking_day_settings.daysettings.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SettingsBreakItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/adapter/SettingsBreakItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "Lcom/avito/android/service_booking_day_settings/breaks/e;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SettingsBreakItem implements ParcelableItem, com.avito.android.service_booking_day_settings.breaks.e {

    @Y61.k
    public static final Parcelable.Creator<SettingsBreakItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f276723b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TimeSelect f276724c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TimeSelect f276725d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f276726e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f276727f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final BreakDescription f276728g;

    /* compiled from: SettingsBreakItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SettingsBreakItem> {
        @Override // android.os.Parcelable.Creator
        public final SettingsBreakItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Parcelable.Creator<TimeSelect> creator = TimeSelect.CREATOR;
            return new SettingsBreakItem(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : BreakDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SettingsBreakItem[] newArray(int i12) {
            return new SettingsBreakItem[i12];
        }
    }

    public SettingsBreakItem(@Y61.k String str, @Y61.k TimeSelect timeSelect, @Y61.k TimeSelect timeSelect2, boolean z12, boolean z13, @Y61.l BreakDescription breakDescription) {
        this.f276723b = str;
        this.f276724c = timeSelect;
        this.f276725d = timeSelect2;
        this.f276726e = z12;
        this.f276727f = z13;
        this.f276728g = breakDescription;
    }

    public static SettingsBreakItem a(SettingsBreakItem settingsBreakItem, TimeSelect timeSelect, TimeSelect timeSelect2, BreakDescription breakDescription, int i12) {
        String str = settingsBreakItem.f276723b;
        if ((i12 & 2) != 0) {
            timeSelect = settingsBreakItem.f276724c;
        }
        TimeSelect timeSelect3 = timeSelect;
        if ((i12 & 4) != 0) {
            timeSelect2 = settingsBreakItem.f276725d;
        }
        TimeSelect timeSelect4 = timeSelect2;
        boolean z12 = (i12 & 8) != 0 ? settingsBreakItem.f276726e : true;
        boolean z13 = settingsBreakItem.f276727f;
        if ((i12 & 32) != 0) {
            breakDescription = settingsBreakItem.f276728g;
        }
        settingsBreakItem.getClass();
        return new SettingsBreakItem(str, timeSelect3, timeSelect4, z12, z13, breakDescription);
    }

    @Override // com.avito.android.service_booking_day_settings.breaks.e
    @Y61.l
    public final Integer L() {
        org.threeten.bp.g gVar = this.f276725d.f276729b;
        if (gVar != null) {
            return Integer.valueOf(gVar.J());
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingsBreakItem)) {
            return false;
        }
        SettingsBreakItem settingsBreakItem = (SettingsBreakItem) obj;
        return L.f(this.f276723b, settingsBreakItem.f276723b) && L.f(this.f276724c, settingsBreakItem.f276724c) && L.f(this.f276725d, settingsBreakItem.f276725d) && this.f276726e == settingsBreakItem.f276726e && this.f276727f == settingsBreakItem.f276727f && L.f(this.f276728g, settingsBreakItem.f276728g);
    }

    @Override // com.avito.android.service_booking_day_settings.breaks.e
    @Y61.l
    public final Integer f() {
        org.threeten.bp.g gVar = this.f276724c.f276729b;
        if (gVar != null) {
            return Integer.valueOf(gVar.J());
        }
        return null;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269930b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF278173b() {
        return this.f276723b;
    }

    public final int hashCode() {
        int i12 = r.i(r.i((this.f276725d.hashCode() + ((this.f276724c.hashCode() + (this.f276723b.hashCode() * 31)) * 31)) * 31, 31, this.f276726e), 31, this.f276727f);
        BreakDescription breakDescription = this.f276728g;
        return i12 + (breakDescription == null ? 0 : breakDescription.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "SettingsBreakItem(stringId=" + this.f276723b + ", start=" + this.f276724c + ", end=" + this.f276725d + ", isDeleteVisible=" + this.f276726e + ", enabled=" + this.f276727f + ", description=" + this.f276728g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f276723b);
        this.f276724c.writeToParcel(parcel, i12);
        this.f276725d.writeToParcel(parcel, i12);
        parcel.writeInt(this.f276726e ? 1 : 0);
        parcel.writeInt(this.f276727f ? 1 : 0);
        BreakDescription breakDescription = this.f276728g;
        if (breakDescription == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            breakDescription.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ SettingsBreakItem(String str, TimeSelect timeSelect, TimeSelect timeSelect2, boolean z12, boolean z13, BreakDescription breakDescription, int i12, C42822w c42822w) {
        this(str, timeSelect, timeSelect2, z12, (i12 & 16) != 0 ? true : z13, (i12 & 32) != 0 ? null : breakDescription);
    }
}
