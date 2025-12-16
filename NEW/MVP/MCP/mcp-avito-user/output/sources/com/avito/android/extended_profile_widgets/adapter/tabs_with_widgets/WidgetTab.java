package com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetTab.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/tabs_with_widgets/WidgetTab;", "Landroid/os/Parcelable;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WidgetTab implements Parcelable {

    @k
    public static final Parcelable.Creator<WidgetTab> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f154939b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f154940c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ExtendedProfileWidgetItem f154941d;

    /* compiled from: WidgetTab.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WidgetTab> {
        @Override // android.os.Parcelable.Creator
        public final WidgetTab createFromParcel(Parcel parcel) {
            return new WidgetTab(parcel.readString(), parcel.readString(), (ExtendedProfileWidgetItem) parcel.readParcelable(WidgetTab.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final WidgetTab[] newArray(int i12) {
            return new WidgetTab[i12];
        }
    }

    public WidgetTab(@k String str, @l String str2, @k ExtendedProfileWidgetItem extendedProfileWidgetItem) {
        this.f154939b = str;
        this.f154940c = str2;
        this.f154941d = extendedProfileWidgetItem;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetTab)) {
            return false;
        }
        WidgetTab widgetTab = (WidgetTab) obj;
        return L.f(this.f154939b, widgetTab.f154939b) && L.f(this.f154940c, widgetTab.f154940c) && L.f(this.f154941d, widgetTab.f154941d);
    }

    public final int hashCode() {
        int iHashCode = this.f154939b.hashCode() * 31;
        String str = this.f154940c;
        return this.f154941d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "WidgetTab(tabTitle=" + this.f154939b + ", widgetName=" + this.f154940c + ", widget=" + this.f154941d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f154939b);
        parcel.writeString(this.f154940c);
        parcel.writeParcelable(this.f154941d, i12);
    }
}
