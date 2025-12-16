package com.avito.android.comparison.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonListResponse.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/comparison/remote/model/ComparisonCategoryItem;", "Landroid/os/Parcelable;", "", "id", "title", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "link", "", "Lcom/avito/android/remote/model/Image;", "images", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ComparisonCategoryItem implements Parcelable {

    @k
    public static final Parcelable.Creator<ComparisonCategoryItem> CREATOR = new a();

    @c("id")
    @k
    private final String id;

    @c("images")
    @l
    private final List<Image> images;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink link;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("name")
    @k
    private final String title;

    /* compiled from: ComparisonListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComparisonCategoryItem> {
        @Override // android.os.Parcelable.Creator
        public final ComparisonCategoryItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ComparisonCategoryItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ComparisonCategoryItem.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new ComparisonCategoryItem(string, string2, string3, deepLink, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ComparisonCategoryItem[] newArray(int i12) {
            return new ComparisonCategoryItem[i12];
        }
    }

    public ComparisonCategoryItem(@k String str, @k String str2, @l String str3, @k DeepLink deepLink, @l List<Image> list) {
        this.id = str;
        this.title = str2;
        this.subtitle = str3;
        this.link = deepLink;
        this.images = list;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final DeepLink getLink() {
        return this.link;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparisonCategoryItem)) {
            return false;
        }
        ComparisonCategoryItem comparisonCategoryItem = (ComparisonCategoryItem) obj;
        return L.f(this.id, comparisonCategoryItem.id) && L.f(this.title, comparisonCategoryItem.title) && L.f(this.subtitle, comparisonCategoryItem.subtitle) && L.f(this.link, comparisonCategoryItem.link) && L.f(this.images, comparisonCategoryItem.images);
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final List<Image> getImages() {
        return this.images;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int iE2 = com.avito.android.actions_sheet.a.e(this.link, (iD2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        List<Image> list = this.images;
        return iE2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComparisonCategoryItem(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", link=");
        sb2.append(this.link);
        sb2.append(", images=");
        return H.p(sb2, this.images, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.link, i12);
        List<Image> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            parcel.writeParcelable((Parcelable) itA.next(), i12);
        }
    }
}
