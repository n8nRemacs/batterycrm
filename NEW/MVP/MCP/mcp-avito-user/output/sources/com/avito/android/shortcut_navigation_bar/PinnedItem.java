package com.avito.android.shortcut_navigation_bar;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SellerElement;
import kotlin.Metadata;

/* compiled from: PinnedItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/PinnedItem;", "Landroid/os/Parcelable;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PinnedItem implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PinnedItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Image f283167b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f283168c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final SellerElement.DeveloperInfo f283169d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final DeepLink f283170e;

    /* compiled from: PinnedItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PinnedItem> {
        @Override // android.os.Parcelable.Creator
        public final PinnedItem createFromParcel(Parcel parcel) {
            return new PinnedItem((Image) parcel.readParcelable(PinnedItem.class.getClassLoader()), parcel.readString(), (SellerElement.DeveloperInfo) parcel.readParcelable(PinnedItem.class.getClassLoader()), (DeepLink) parcel.readParcelable(PinnedItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PinnedItem[] newArray(int i12) {
            return new PinnedItem[i12];
        }
    }

    public PinnedItem(@Y61.l Image image, @Y61.k String str, @Y61.l SellerElement.DeveloperInfo developerInfo, @Y61.l DeepLink deepLink) {
        this.f283167b = image;
        this.f283168c = str;
        this.f283169d = developerInfo;
        this.f283170e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PinnedItem)) {
            return false;
        }
        PinnedItem pinnedItem = (PinnedItem) obj;
        return kotlin.jvm.internal.L.f(this.f283167b, pinnedItem.f283167b) && kotlin.jvm.internal.L.f(this.f283168c, pinnedItem.f283168c) && kotlin.jvm.internal.L.f(this.f283169d, pinnedItem.f283169d) && kotlin.jvm.internal.L.f(this.f283170e, pinnedItem.f283170e);
    }

    public final int hashCode() {
        Image image = this.f283167b;
        int iD2 = androidx.compose.foundation.H.d((image == null ? 0 : image.hashCode()) * 31, 31, this.f283168c);
        SellerElement.DeveloperInfo developerInfo = this.f283169d;
        int iHashCode = (iD2 + (developerInfo == null ? 0 : developerInfo.hashCode())) * 31;
        DeepLink deepLink = this.f283170e;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PinnedItem(preview=");
        sb2.append(this.f283167b);
        sb2.append(", title=");
        sb2.append(this.f283168c);
        sb2.append(", developer=");
        sb2.append(this.f283169d);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f283170e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f283167b, i12);
        parcel.writeString(this.f283168c);
        parcel.writeParcelable(this.f283169d, i12);
        parcel.writeParcelable(this.f283170e, i12);
    }
}
