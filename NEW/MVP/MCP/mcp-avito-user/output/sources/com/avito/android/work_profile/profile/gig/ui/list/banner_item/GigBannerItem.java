package com.avito.android.work_profile.profile.gig.ui.list.banner_item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.work_profile.profile.gig.ui.list.button_item.GigButtonItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GigBannerItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/banner_item/GigBannerItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class GigBannerItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<GigBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f331175b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f331176c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f331177d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f331178e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f331179f;

    /* compiled from: GigBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final GigBannerItem createFromParcel(Parcel parcel) {
            return new GigBannerItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(GigBannerItem.class.getClassLoader()), parcel.readString(), (AttributedText) parcel.readParcelable(GigBannerItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigBannerItem[] newArray(int i12) {
            return new GigBannerItem[i12];
        }
    }

    public GigBannerItem(@k String str, @k String str2, @l DeepLink deepLink, @k String str3, @k AttributedText attributedText) {
        this.f331175b = str;
        this.f331176c = attributedText;
        this.f331177d = str2;
        this.f331178e = deepLink;
        this.f331179f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GigBannerItem)) {
            return false;
        }
        GigBannerItem gigBannerItem = (GigBannerItem) obj;
        return L.f(this.f331175b, gigBannerItem.f331175b) && L.f(this.f331176c, gigBannerItem.f331176c) && L.f(this.f331177d, gigBannerItem.f331177d) && L.f(this.f331178e, gigBannerItem.f331178e) && L.f(this.f331179f, gigBannerItem.f331179f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75315b() {
        return getF231617b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231617b() {
        return this.f331179f;
    }

    public final int hashCode() {
        int iD2 = H.d(com.avito.android.actions_sheet.a.b(this.f331175b.hashCode() * 31, 31, this.f331176c), 31, this.f331177d);
        DeepLink deepLink = this.f331178e;
        return this.f331179f.hashCode() + ((iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GigBannerItem(title=");
        sb2.append(this.f331175b);
        sb2.append(", description=");
        sb2.append(this.f331176c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f331177d);
        sb2.append(", buttonDeepLink=");
        sb2.append(this.f331178e);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f331179f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f331175b);
        parcel.writeParcelable(this.f331176c, i12);
        parcel.writeString(this.f331177d);
        parcel.writeParcelable(this.f331178e, i12);
        parcel.writeString(this.f331179f);
    }

    public /* synthetic */ GigBannerItem(String str, AttributedText attributedText, String str2, DeepLink deepLink, String str3, int i12, C42822w c42822w) {
        this(str, str2, deepLink, (i12 & 16) != 0 ? GigButtonItem.class.getName() : str3, attributedText);
    }
}
