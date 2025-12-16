package com.avito.android.service_booking_day_settings.daysettings.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SettingsBreakItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_day_settings/daysettings/adapter/BreakDescription;", "Landroid/os/Parcelable;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BreakDescription implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BreakDescription> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f276720b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f276721c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f276722d;

    /* compiled from: SettingsBreakItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BreakDescription> {
        @Override // android.os.Parcelable.Creator
        public final BreakDescription createFromParcel(Parcel parcel) {
            return new BreakDescription((PrintableText) parcel.readParcelable(BreakDescription.class.getClassLoader()), (UniversalColor) parcel.readParcelable(BreakDescription.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BreakDescription[] newArray(int i12) {
            return new BreakDescription[i12];
        }
    }

    public BreakDescription(@Y61.k PrintableText printableText, @Y61.l UniversalColor universalColor, boolean z12) {
        this.f276720b = printableText;
        this.f276721c = universalColor;
        this.f276722d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BreakDescription)) {
            return false;
        }
        BreakDescription breakDescription = (BreakDescription) obj;
        return L.f(this.f276720b, breakDescription.f276720b) && L.f(this.f276721c, breakDescription.f276721c) && this.f276722d == breakDescription.f276722d;
    }

    public final int hashCode() {
        int iHashCode = this.f276720b.hashCode() * 31;
        UniversalColor universalColor = this.f276721c;
        return Boolean.hashCode(this.f276722d) + ((iHashCode + (universalColor == null ? 0 : universalColor.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BreakDescription(text=");
        sb2.append(this.f276720b);
        sb2.append(", textColor=");
        sb2.append(this.f276721c);
        sb2.append(", isOccupiedError=");
        return r.x(sb2, this.f276722d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f276720b, i12);
        parcel.writeParcelable(this.f276721c, i12);
        parcel.writeInt(this.f276722d ? 1 : 0);
    }
}
