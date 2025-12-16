package com.avito.android.delivery_combined_buttons_public;

import Ev.InterfaceC13530a;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CombinedButtons.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_combined_buttons_public/BuyButton;", "LEv/a;", "Landroid/os/Parcelable;", "_avito_delivery-combined-buttons_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BuyButton implements InterfaceC13530a, Parcelable {

    @k
    public static final Parcelable.Creator<BuyButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f134929b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f134930c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f134931d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f134932e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f134933f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Boolean f134934g;

    /* compiled from: CombinedButtons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BuyButton> {
        @Override // android.os.Parcelable.Creator
        public final BuyButton createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            DeepLink deepLink = (DeepLink) parcel.readParcelable(BuyButton.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BuyButton(deepLink, string, string2, string3, string4, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BuyButton[] newArray(int i12) {
            return new BuyButton[i12];
        }
    }

    public BuyButton(@k DeepLink deepLink, @k String str, @k String str2, @k String str3, @l String str4, @l Boolean bool) {
        this.f134929b = deepLink;
        this.f134930c = str;
        this.f134931d = str2;
        this.f134932e = str3;
        this.f134933f = str4;
        this.f134934g = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuyButton)) {
            return false;
        }
        BuyButton buyButton = (BuyButton) obj;
        return L.f(this.f134929b, buyButton.f134929b) && L.f(this.f134930c, buyButton.f134930c) && L.f(this.f134931d, buyButton.f134931d) && L.f(this.f134932e, buyButton.f134932e) && L.f(this.f134933f, buyButton.f134933f) && L.f(this.f134934g, buyButton.f134934g);
    }

    @Override // Ev.InterfaceC13530a
    @k
    /* renamed from: getStyle, reason: from getter */
    public final String getF134944b() {
        return this.f134930c;
    }

    @Override // Ev.InterfaceC13530a
    @l
    /* renamed from: getSubtitle, reason: from getter */
    public final String getF134947e() {
        return this.f134933f;
    }

    @Override // Ev.InterfaceC13530a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF134946d() {
        return this.f134932e;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f134929b.hashCode() * 31, 31, this.f134930c), 31, this.f134931d), 31, this.f134932e);
        String str = this.f134933f;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f134934g;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // Ev.InterfaceC13530a
    @l
    /* renamed from: isLoading, reason: from getter */
    public final Boolean getF134948f() {
        return this.f134934g;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuyButton(onTapDeepLink=");
        sb2.append(this.f134929b);
        sb2.append(", style=");
        sb2.append(this.f134930c);
        sb2.append(", theme=");
        sb2.append(this.f134931d);
        sb2.append(", title=");
        sb2.append(this.f134932e);
        sb2.append(", subtitle=");
        sb2.append(this.f134933f);
        sb2.append(", isLoading=");
        return C0.g(sb2, this.f134934g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f134929b, i12);
        parcel.writeString(this.f134930c);
        parcel.writeString(this.f134931d);
        parcel.writeString(this.f134932e);
        parcel.writeString(this.f134933f);
        Boolean bool = this.f134934g;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
