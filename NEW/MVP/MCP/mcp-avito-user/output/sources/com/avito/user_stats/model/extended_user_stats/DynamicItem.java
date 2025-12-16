package com.avito.user_stats.model.extended_user_stats;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsDynamicItems.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/avito/user_stats/model/extended_user_stats/DynamicItem;", "Landroid/os/Parcelable;", "", "id", "", "isDeleted", "title", "price", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "Lcom/avito/user_stats/model/extended_user_stats/MetricDynamicItem;", "metrics", "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/user_stats/model/extended_user_stats/Location;", "location", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Lcom/avito/android/remote/model/Image;Lcom/avito/user_stats/model/extended_user_stats/Location;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Z", "e", "()Z", "getTitle", "getPrice", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/user_stats/model/extended_user_stats/Location;", "c", "()Lcom/avito/user_stats/model/extended_user_stats/Location;", "_avito-discouraged_avito-api_user-stats"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class DynamicItem implements Parcelable {

    @k
    public static final Parcelable.Creator<DynamicItem> CREATOR = new a();

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("id")
    @k
    private final String id;

    @c("image")
    @l
    private final Image image;

    @c("isDeleted")
    private final boolean isDeleted;

    @c("location")
    @l
    private final Location location;

    @c("metrics")
    @k
    private final List<MetricDynamicItem> metrics;

    @c("price")
    @l
    private final String price;

    @c("title")
    @l
    private final String title;

    /* compiled from: StatsDynamicItems.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DynamicItem> {
        @Override // android.os.Parcelable.Creator
        public final DynamicItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(DynamicItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(MetricDynamicItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new DynamicItem(string, z12, string2, string3, deepLink, arrayList, (Image) parcel.readParcelable(DynamicItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Location.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final DynamicItem[] newArray(int i12) {
            return new DynamicItem[i12];
        }
    }

    public DynamicItem(@k String str, boolean z12, @l String str2, @l String str3, @l DeepLink deepLink, @k List<MetricDynamicItem> list, @l Image image, @l Location location) {
        this.id = str;
        this.isDeleted = z12;
        this.title = str2;
        this.price = str3;
        this.deeplink = deepLink;
        this.metrics = list;
        this.image = image;
        this.location = location;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    @k
    public final List<MetricDynamicItem> d() {
        return this.metrics;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsDeleted() {
        return this.isDeleted;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicItem)) {
            return false;
        }
        DynamicItem dynamicItem = (DynamicItem) obj;
        return L.f(this.id, dynamicItem.id) && this.isDeleted == dynamicItem.isDeleted && L.f(this.title, dynamicItem.title) && L.f(this.price, dynamicItem.price) && L.f(this.deeplink, dynamicItem.deeplink) && L.f(this.metrics, dynamicItem.metrics) && L.f(this.image, dynamicItem.image) && L.f(this.location, dynamicItem.location);
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final Image getImage() {
        return this.image;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int i12 = r.i(this.id.hashCode() * 31, 31, this.isDeleted);
        String str = this.title;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.price;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        int iE2 = H.e((iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.metrics);
        Image image = this.image;
        int iHashCode3 = (iE2 + (image == null ? 0 : image.hashCode())) * 31;
        Location location = this.location;
        return iHashCode3 + (location != null ? location.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DynamicItem(id=" + this.id + ", isDeleted=" + this.isDeleted + ", title=" + this.title + ", price=" + this.price + ", deeplink=" + this.deeplink + ", metrics=" + this.metrics + ", image=" + this.image + ", location=" + this.location + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeString(this.title);
        parcel.writeString(this.price);
        parcel.writeParcelable(this.deeplink, i12);
        Iterator itJ = C0.j(this.metrics, parcel);
        while (itJ.hasNext()) {
            ((MetricDynamicItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.image, i12);
        Location location = this.location;
        if (location == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            location.writeToParcel(parcel, i12);
        }
    }
}
