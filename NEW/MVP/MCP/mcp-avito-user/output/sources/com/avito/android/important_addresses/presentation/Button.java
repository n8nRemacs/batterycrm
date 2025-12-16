package com.avito.android.important_addresses.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesState.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/presentation/Button;", "Landroid/os/Parcelable;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Button implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Button> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f169579b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f169580c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final DeepLink f169581d;

    /* compiled from: ImportantAddressesState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Button> {
        @Override // android.os.Parcelable.Creator
        public final Button createFromParcel(Parcel parcel) {
            return new Button(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Button[] newArray(int i12) {
            return new Button[i12];
        }
    }

    public Button(@Y61.k String str, @Y61.l String str2, @Y61.k DeepLink deepLink) {
        this.f169579b = str;
        this.f169580c = str2;
        this.f169581d = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Button)) {
            return false;
        }
        Button button = (Button) obj;
        return L.f(this.f169579b, button.f169579b) && L.f(this.f169580c, button.f169580c) && L.f(this.f169581d, button.f169581d);
    }

    public final int hashCode() {
        int iHashCode = this.f169579b.hashCode() * 31;
        String str = this.f169580c;
        return this.f169581d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Button(text=");
        sb2.append(this.f169579b);
        sb2.append(", style=");
        sb2.append(this.f169580c);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f169581d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f169579b);
        parcel.writeString(this.f169580c);
        parcel.writeParcelable(this.f169581d, i12);
    }
}
