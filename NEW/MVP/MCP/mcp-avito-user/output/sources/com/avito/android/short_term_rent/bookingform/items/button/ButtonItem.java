package com.avito.android.short_term_rent.bookingform.items.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ButtonItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/button/ButtonItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<ButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f281466b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f281467c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f281468d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ParametrizedEvent f281469e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ParametrizedEvent f281470f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final DeepLink f281471g;

    /* compiled from: ButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final ButtonItem createFromParcel(Parcel parcel) {
            return new ButtonItem(parcel.readString(), parcel.readString(), parcel.readString(), (ParametrizedEvent) parcel.readParcelable(ButtonItem.class.getClassLoader()), (ParametrizedEvent) parcel.readParcelable(ButtonItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(ButtonItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ButtonItem[] newArray(int i12) {
            return new ButtonItem[i12];
        }
    }

    public ButtonItem(@k String str, @k String str2, @l String str3, @l ParametrizedEvent parametrizedEvent, @l ParametrizedEvent parametrizedEvent2, @l DeepLink deepLink) {
        this.f281466b = str;
        this.f281467c = str2;
        this.f281468d = str3;
        this.f281469e = parametrizedEvent;
        this.f281470f = parametrizedEvent2;
        this.f281471g = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ButtonItem)) {
            return false;
        }
        ButtonItem buttonItem = (ButtonItem) obj;
        return L.f(this.f281466b, buttonItem.f281466b) && L.f(this.f281467c, buttonItem.f281467c) && L.f(this.f281468d, buttonItem.f281468d) && L.f(this.f281469e, buttonItem.f281469e) && L.f(this.f281470f, buttonItem.f281470f) && L.f(this.f281471g, buttonItem.f281471g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF117182c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217937b() {
        return this.f281466b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f281466b.hashCode() * 31, 31, this.f281467c);
        String str = this.f281468d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.f281469e;
        int iHashCode2 = (iHashCode + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent2 = this.f281470f;
        int iHashCode3 = (iHashCode2 + (parametrizedEvent2 == null ? 0 : parametrizedEvent2.hashCode())) * 31;
        DeepLink deepLink = this.f281471g;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonItem(stringId=");
        sb2.append(this.f281466b);
        sb2.append(", title=");
        sb2.append(this.f281467c);
        sb2.append(", style=");
        sb2.append(this.f281468d);
        sb2.append(", onShow=");
        sb2.append(this.f281469e);
        sb2.append(", onClick=");
        sb2.append(this.f281470f);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f281471g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f281466b);
        parcel.writeString(this.f281467c);
        parcel.writeString(this.f281468d);
        parcel.writeParcelable(this.f281469e, i12);
        parcel.writeParcelable(this.f281470f, i12);
        parcel.writeParcelable(this.f281471g, i12);
    }
}
