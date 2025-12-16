package com.avito.android.extended_profile_ui_components;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FloatingButton.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_ui_components/FloatingButton;", "Landroid/os/Parcelable;", "_avito_extended-profile-ui-components_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FloatingButton implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<FloatingButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f153295b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final DeepLink f153296c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final FloatingButtonType f153297d;

    /* compiled from: FloatingButton.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FloatingButton> {
        @Override // android.os.Parcelable.Creator
        public final FloatingButton createFromParcel(Parcel parcel) {
            return new FloatingButton(parcel.readString(), (DeepLink) parcel.readParcelable(FloatingButton.class.getClassLoader()), FloatingButtonType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final FloatingButton[] newArray(int i12) {
            return new FloatingButton[i12];
        }
    }

    public FloatingButton(@Y61.k String str, @Y61.k DeepLink deepLink, @Y61.k FloatingButtonType floatingButtonType) {
        this.f153295b = str;
        this.f153296c = deepLink;
        this.f153297d = floatingButtonType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatingButton)) {
            return false;
        }
        FloatingButton floatingButton = (FloatingButton) obj;
        return L.f(this.f153295b, floatingButton.f153295b) && L.f(this.f153296c, floatingButton.f153296c) && this.f153297d == floatingButton.f153297d;
    }

    public final int hashCode() {
        return this.f153297d.hashCode() + com.avito.android.actions_sheet.a.e(this.f153296c, this.f153295b.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        return "FloatingButton(text=" + this.f153295b + ", deeplink=" + this.f153296c + ", type=" + this.f153297d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f153295b);
        parcel.writeParcelable(this.f153296c, i12);
        parcel.writeString(this.f153297d.name());
    }
}
