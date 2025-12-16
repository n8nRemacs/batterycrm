package com.avito.android.work_profile.profile.applies.ui.items.applies_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AppliesBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/items/applies_banner/AppliesBannerItemButton;", "Landroid/os/Parcelable;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AppliesBannerItemButton implements Parcelable {

    @k
    public static final Parcelable.Creator<AppliesBannerItemButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f330935b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DeepLink f330936c;

    /* compiled from: AppliesBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppliesBannerItemButton> {
        @Override // android.os.Parcelable.Creator
        public final AppliesBannerItemButton createFromParcel(Parcel parcel) {
            return new AppliesBannerItemButton(parcel.readString(), (DeepLink) parcel.readParcelable(AppliesBannerItemButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppliesBannerItemButton[] newArray(int i12) {
            return new AppliesBannerItemButton[i12];
        }
    }

    public AppliesBannerItemButton(@k String str, @k DeepLink deepLink) {
        this.f330935b = str;
        this.f330936c = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppliesBannerItemButton)) {
            return false;
        }
        AppliesBannerItemButton appliesBannerItemButton = (AppliesBannerItemButton) obj;
        return L.f(this.f330935b, appliesBannerItemButton.f330935b) && L.f(this.f330936c, appliesBannerItemButton.f330936c);
    }

    public final int hashCode() {
        return this.f330936c.hashCode() + (this.f330935b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppliesBannerItemButton(text=");
        sb2.append(this.f330935b);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f330936c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f330935b);
        parcel.writeParcelable(this.f330936c, i12);
    }
}
