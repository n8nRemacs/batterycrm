package com.avito.android.remote.model.category_tree;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryTreeResponse.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0088\u0001\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u00062\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010&J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u00101R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b9\u0010\u0014R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b;\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b<\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b=\u0010\u001cR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010 R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b@\u0010\u001c¨\u0006A"}, d2 = {"Lcom/avito/android/remote/model/category_tree/CategoryTreeNode;", "Landroid/os/Parcelable;", "", "categoryId", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "default", "id", "microCategoryId", "", "title", "parentId", "iconUrl", "Lcom/avito/android/remote/model/UniversalImage;", "categoryImage", "categoryImageBackgroundColor", "<init>", "(Ljava/lang/Integer;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "()Ljava/lang/String;", "component7", "component8", "component9", "()Lcom/avito/android/remote/model/UniversalImage;", "component10", "copy", "(Ljava/lang/Integer;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;)Lcom/avito/android/remote/model/category_tree/CategoryTreeNode;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getCategoryId", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Ljava/lang/Boolean;", "getDefault", "getId", "getMicroCategoryId", "Ljava/lang/String;", "getTitle", "getParentId", "getIconUrl", "Lcom/avito/android/remote/model/UniversalImage;", "getCategoryImage", "getCategoryImageBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CategoryTreeNode implements Parcelable {

    @k
    public static final Parcelable.Creator<CategoryTreeNode> CREATOR = new Creator();

    @c("categoryId")
    @l
    private final Integer categoryId;

    @c("categoryImage")
    @l
    private final UniversalImage categoryImage;

    @c("categoryImageBackgroundColor")
    @l
    private final String categoryImageBackgroundColor;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("default")
    @l
    private final Boolean default;

    @c("iconUrl")
    @l
    private final String iconUrl;

    @c("id")
    @l
    private final Integer id;

    @c(Navigation.MICRO_CATEGORY_ID)
    @l
    private final Integer microCategoryId;

    @c("parentId")
    @l
    private final Integer parentId;

    @c("name")
    @l
    private final String title;

    /* compiled from: CategoryTreeResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategoryTreeNode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategoryTreeNode createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(CategoryTreeNode.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CategoryTreeNode(numValueOf, deepLink, boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), (UniversalImage) parcel.readParcelable(CategoryTreeNode.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategoryTreeNode[] newArray(int i12) {
            return new CategoryTreeNode[i12];
        }
    }

    public CategoryTreeNode(@l Integer num, @l DeepLink deepLink, @l Boolean bool, @l Integer num2, @l Integer num3, @l String str, @l Integer num4, @l String str2, @l UniversalImage universalImage, @l String str3) {
        this.categoryId = num;
        this.deeplink = deepLink;
        this.default = bool;
        this.id = num2;
        this.microCategoryId = num3;
        this.title = str;
        this.parentId = num4;
        this.iconUrl = str2;
        this.categoryImage = universalImage;
        this.categoryImageBackgroundColor = str3;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final String getCategoryImageBackgroundColor() {
        return this.categoryImageBackgroundColor;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getDefault() {
        return this.default;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Integer getMicroCategoryId() {
        return this.microCategoryId;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Integer getParentId() {
        return this.parentId;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final UniversalImage getCategoryImage() {
        return this.categoryImage;
    }

    @k
    public final CategoryTreeNode copy(@l Integer categoryId, @l DeepLink deeplink, @l Boolean bool, @l Integer id2, @l Integer microCategoryId, @l String title, @l Integer parentId, @l String iconUrl, @l UniversalImage categoryImage, @l String categoryImageBackgroundColor) {
        return new CategoryTreeNode(categoryId, deeplink, bool, id2, microCategoryId, title, parentId, iconUrl, categoryImage, categoryImageBackgroundColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CategoryTreeNode)) {
            return false;
        }
        CategoryTreeNode categoryTreeNode = (CategoryTreeNode) other;
        return L.f(this.categoryId, categoryTreeNode.categoryId) && L.f(this.deeplink, categoryTreeNode.deeplink) && L.f(this.default, categoryTreeNode.default) && L.f(this.id, categoryTreeNode.id) && L.f(this.microCategoryId, categoryTreeNode.microCategoryId) && L.f(this.title, categoryTreeNode.title) && L.f(this.parentId, categoryTreeNode.parentId) && L.f(this.iconUrl, categoryTreeNode.iconUrl) && L.f(this.categoryImage, categoryTreeNode.categoryImage) && L.f(this.categoryImageBackgroundColor, categoryTreeNode.categoryImageBackgroundColor);
    }

    @l
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @l
    public final UniversalImage getCategoryImage() {
        return this.categoryImage;
    }

    @l
    public final String getCategoryImageBackgroundColor() {
        return this.categoryImageBackgroundColor;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final Boolean getDefault() {
        return this.default;
    }

    @l
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @l
    public final Integer getId() {
        return this.id;
    }

    @l
    public final Integer getMicroCategoryId() {
        return this.microCategoryId;
    }

    @l
    public final Integer getParentId() {
        return this.parentId;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Integer num = this.categoryId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Boolean bool = this.default;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.id;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.microCategoryId;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.title;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num4 = this.parentId;
        int iHashCode7 = (iHashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str2 = this.iconUrl;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.categoryImage;
        int iHashCode9 = (iHashCode8 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str3 = this.categoryImageBackgroundColor;
        return iHashCode9 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryTreeNode(categoryId=");
        sb2.append(this.categoryId);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", default=");
        sb2.append(this.default);
        sb2.append(", id=");
        sb2.append(this.id);
        sb2.append(", microCategoryId=");
        sb2.append(this.microCategoryId);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", parentId=");
        sb2.append(this.parentId);
        sb2.append(", iconUrl=");
        sb2.append(this.iconUrl);
        sb2.append(", categoryImage=");
        sb2.append(this.categoryImage);
        sb2.append(", categoryImageBackgroundColor=");
        return C22026a.c(sb2, this.categoryImageBackgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Integer num = this.categoryId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.deeplink, flags);
        Boolean bool = this.default;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Integer num2 = this.id;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num2);
        }
        Integer num3 = this.microCategoryId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num3);
        }
        parcel.writeString(this.title);
        Integer num4 = this.parentId;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num4);
        }
        parcel.writeString(this.iconUrl);
        parcel.writeParcelable(this.categoryImage, flags);
        parcel.writeString(this.categoryImageBackgroundColor);
    }
}
