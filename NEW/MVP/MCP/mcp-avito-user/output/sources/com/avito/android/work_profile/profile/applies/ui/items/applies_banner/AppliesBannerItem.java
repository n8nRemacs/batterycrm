package com.avito.android.work_profile.profile.applies.ui.items.applies_banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kQ0.InterfaceC42620a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AppliesBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/items/applies_banner/AppliesBannerItem;", "LkQ0/a;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AppliesBannerItem implements InterfaceC42620a, ParcelableItem {

    @k
    public static final Parcelable.Creator<AppliesBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f330930b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f330931c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f330932d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final UniversalImage f330933e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AppliesBannerItemButton f330934f;

    /* compiled from: AppliesBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AppliesBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final AppliesBannerItem createFromParcel(Parcel parcel) {
            return new AppliesBannerItem(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(AppliesBannerItem.class.getClassLoader()), AppliesBannerItemButton.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppliesBannerItem[] newArray(int i12) {
            return new AppliesBannerItem[i12];
        }
    }

    public AppliesBannerItem(@k String str, @k String str2, @k String str3, @k UniversalImage universalImage, @k AppliesBannerItemButton appliesBannerItemButton) {
        this.f330930b = str;
        this.f330931c = str2;
        this.f330932d = str3;
        this.f330933e = universalImage;
        this.f330934f = appliesBannerItemButton;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppliesBannerItem)) {
            return false;
        }
        AppliesBannerItem appliesBannerItem = (AppliesBannerItem) obj;
        return L.f(this.f330930b, appliesBannerItem.f330930b) && L.f(this.f330931c, appliesBannerItem.f330931c) && L.f(this.f330932d, appliesBannerItem.f330932d) && L.f(this.f330933e, appliesBannerItem.f330933e) && L.f(this.f330934f, appliesBannerItem.f330934f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78710b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF250470b() {
        return this.f330930b;
    }

    public final int hashCode() {
        return this.f330934f.hashCode() + com.avito.android.actions_sheet.a.a(H.d(H.d(this.f330930b.hashCode() * 31, 31, this.f330931c), 31, this.f330932d), 31, this.f330933e);
    }

    @k
    public final String toString() {
        return "AppliesBannerItem(stringId=" + this.f330930b + ", title=" + this.f330931c + ", subtitle=" + this.f330932d + ", image=" + this.f330933e + ", button=" + this.f330934f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f330930b);
        parcel.writeString(this.f330931c);
        parcel.writeString(this.f330932d);
        parcel.writeParcelable(this.f330933e, i12);
        this.f330934f.writeToParcel(parcel, i12);
    }

    public /* synthetic */ AppliesBannerItem(String str, String str2, String str3, UniversalImage universalImage, AppliesBannerItemButton appliesBannerItemButton, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "APPLIES_BANNER_ITEM" : str, str2, str3, universalImage, appliesBannerItemButton);
    }
}
