package com.avito.android.rubricator.list.category.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.H0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.rubricator.list.category.mvi.entity.CategoriesList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryListItem.kt */
@d
@H0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/rubricator/list/category/model/CategoryListItem;", "Landroid/os/Parcelable;", "", "stringId", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/rubricator/list/category/mvi/entity/CategoriesList;", "subcategories", "Landroid/net/Uri;", "iconUri", "description", "Lcom/avito/android/remote/model/Image;", "icon", "", "isSearchEnabled", "isChildrenVisible", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Landroid/net/Uri;Ljava/lang/String;Lcom/avito/android/remote/model/Image;ZZLkotlin/jvm/internal/w;)V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CategoryListItem implements Parcelable {

    @k
    public static final Parcelable.Creator<CategoryListItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f255918b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f255919c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f255920d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<? extends CategoryListItem> f255921e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Uri f255922f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f255923g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Image f255924h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f255925i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f255926j;

    /* compiled from: CategoryListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryListItem> {
        @Override // android.os.Parcelable.Creator
        public final CategoryListItem createFromParcel(Parcel parcel) {
            return new CategoryListItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(CategoryListItem.class.getClassLoader()), CategoriesList.CREATOR.createFromParcel(parcel).f255931b, (Uri) parcel.readParcelable(CategoryListItem.class.getClassLoader()), parcel.readString(), (Image) parcel.readParcelable(CategoryListItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, null);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryListItem[] newArray(int i12) {
            return new CategoryListItem[i12];
        }
    }

    public CategoryListItem() {
        throw null;
    }

    public CategoryListItem(String str, String str2, DeepLink deepLink, List list, Uri uri, String str3, Image image, boolean z12, boolean z13, C42822w c42822w) {
        this.f255918b = str;
        this.f255919c = str2;
        this.f255920d = deepLink;
        this.f255921e = list;
        this.f255922f = uri;
        this.f255923g = str3;
        this.f255924h = image;
        this.f255925i = z12;
        this.f255926j = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryListItem)) {
            return false;
        }
        CategoryListItem categoryListItem = (CategoryListItem) obj;
        if (!L.f(this.f255918b, categoryListItem.f255918b) || !L.f(this.f255919c, categoryListItem.f255919c) || !L.f(this.f255920d, categoryListItem.f255920d)) {
            return false;
        }
        Parcelable.Creator<CategoriesList> creator = CategoriesList.CREATOR;
        return L.f(this.f255921e, categoryListItem.f255921e) && L.f(this.f255922f, categoryListItem.f255922f) && L.f(this.f255923g, categoryListItem.f255923g) && L.f(this.f255924h, categoryListItem.f255924h) && this.f255925i == categoryListItem.f255925i && this.f255926j == categoryListItem.f255926j;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f255920d, H.d(this.f255918b.hashCode() * 31, 31, this.f255919c), 31);
        Parcelable.Creator<CategoriesList> creator = CategoriesList.CREATOR;
        int iE3 = H.e(iE2, 31, this.f255921e);
        Uri uri = this.f255922f;
        int iHashCode = (iE3 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.f255923g;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Image image = this.f255924h;
        return Boolean.hashCode(this.f255926j) + r.i((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31, 31, this.f255925i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryListItem(stringId=");
        sb2.append(this.f255918b);
        sb2.append(", text=");
        sb2.append(this.f255919c);
        sb2.append(", deepLink=");
        sb2.append(this.f255920d);
        sb2.append(", subcategories=");
        sb2.append((Object) CategoriesList.b(this.f255921e));
        sb2.append(", iconUri=");
        sb2.append(this.f255922f);
        sb2.append(", description=");
        sb2.append(this.f255923g);
        sb2.append(", icon=");
        sb2.append(this.f255924h);
        sb2.append(", isSearchEnabled=");
        sb2.append(this.f255925i);
        sb2.append(", isChildrenVisible=");
        return r.x(sb2, this.f255926j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f255918b);
        parcel.writeString(this.f255919c);
        parcel.writeParcelable(this.f255920d, i12);
        CategoriesList.c(this.f255921e, parcel, i12);
        parcel.writeParcelable(this.f255922f, i12);
        parcel.writeString(this.f255923g);
        parcel.writeParcelable(this.f255924h, i12);
        parcel.writeInt(this.f255925i ? 1 : 0);
        parcel.writeInt(this.f255926j ? 1 : 0);
    }

    public /* synthetic */ CategoryListItem(String str, String str2, DeepLink deepLink, List list, Uri uri, String str3, Image image, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, deepLink, list, (i12 & 16) != 0 ? null : uri, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : image, (i12 & 128) != 0 ? true : z12, (i12 & 256) != 0 ? false : z13, null);
    }
}
