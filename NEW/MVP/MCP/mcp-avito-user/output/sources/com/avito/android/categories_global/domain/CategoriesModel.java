package com.avito.android.categories_global.domain;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoriesModel.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/categories_global/domain/CategoriesModel;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/categories_global/domain/CategoriesModel$Category;", "categories", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "c", "()Ljava/util/List;", "Category", "ProceedButton", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CategoriesModel implements Parcelable {

    @k
    public static final Parcelable.Creator<CategoriesModel> CREATOR = new a();

    @c("categories")
    @l
    private final List<Category> categories;

    /* compiled from: CategoriesModel.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/categories_global/domain/CategoriesModel$Category;", "Landroid/os/Parcelable;", "", "id", "parentId", "name", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "Lcom/avito/android/remote/model/Image;", "image", "Lcom/avito/android/categories_global/domain/CategoriesModel$ProceedButton;", "proceedButton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/Image;Lcom/avito/android/categories_global/domain/CategoriesModel$ProceedButton;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getParentId", "getName", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Image;", "getImage", "()Lcom/avito/android/remote/model/Image;", "Lcom/avito/android/categories_global/domain/CategoriesModel$ProceedButton;", "d", "()Lcom/avito/android/categories_global/domain/CategoriesModel$ProceedButton;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Category implements Parcelable {

        @k
        public static final Parcelable.Creator<Category> CREATOR = new a();

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
        @l
        private final List<Category> children;

        @c("id")
        @k
        private final String id;

        @c("images")
        @l
        private final Image image;

        @c("name")
        @k
        private final String name;

        @c("parentId")
        @l
        private final String parentId;

        @c("proceedButton")
        @l
        private final ProceedButton proceedButton;

        /* compiled from: CategoriesModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Category> {
            @Override // android.os.Parcelable.Creator
            public final Category createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i12 = parcel.readInt();
                    arrayList = new ArrayList(i12);
                    int iC2 = 0;
                    while (iC2 != i12) {
                        iC2 = com.avito.android.actions_sheet.a.c(Category.CREATOR, parcel, arrayList, iC2, 1);
                    }
                }
                return new Category(string, string2, string3, arrayList, (Image) parcel.readParcelable(Category.class.getClassLoader()), parcel.readInt() != 0 ? ProceedButton.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Category[] newArray(int i12) {
                return new Category[i12];
            }
        }

        public Category(@k String str, @l String str2, @k String str3, @l List<Category> list, @l Image image, @l ProceedButton proceedButton) {
            this.id = str;
            this.parentId = str2;
            this.name = str3;
            this.children = list;
            this.image = image;
            this.proceedButton = proceedButton;
        }

        @l
        public final List<Category> c() {
            return this.children;
        }

        @l
        /* renamed from: d, reason: from getter */
        public final ProceedButton getProceedButton() {
            return this.proceedButton;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Category)) {
                return false;
            }
            Category category = (Category) obj;
            return L.f(this.id, category.id) && L.f(this.parentId, category.parentId) && L.f(this.name, category.name) && L.f(this.children, category.children) && L.f(this.image, category.image) && L.f(this.proceedButton, category.proceedButton);
        }

        @k
        public final String getId() {
            return this.id;
        }

        @l
        public final Image getImage() {
            return this.image;
        }

        @k
        public final String getName() {
            return this.name;
        }

        public final int hashCode() {
            int iHashCode = this.id.hashCode() * 31;
            String str = this.parentId;
            int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.name);
            List<Category> list = this.children;
            int iHashCode2 = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
            Image image = this.image;
            int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
            ProceedButton proceedButton = this.proceedButton;
            return iHashCode3 + (proceedButton != null ? proceedButton.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Category(id=" + this.id + ", parentId=" + this.parentId + ", name=" + this.name + ", children=" + this.children + ", image=" + this.image + ", proceedButton=" + this.proceedButton + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.id);
            parcel.writeString(this.parentId);
            parcel.writeString(this.name);
            List<Category> list = this.children;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
                while (itA.hasNext()) {
                    ((Category) itA.next()).writeToParcel(parcel, i12);
                }
            }
            parcel.writeParcelable(this.image, i12);
            ProceedButton proceedButton = this.proceedButton;
            if (proceedButton == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                proceedButton.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: CategoriesModel.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/categories_global/domain/CategoriesModel$ProceedButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-global_categories-global_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ProceedButton implements Parcelable {

        @k
        public static final Parcelable.Creator<ProceedButton> CREATOR = new a();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deepLink;

        @c("title")
        @k
        private final String title;

        /* compiled from: CategoriesModel.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ProceedButton> {
            @Override // android.os.Parcelable.Creator
            public final ProceedButton createFromParcel(Parcel parcel) {
                return new ProceedButton(parcel.readString(), (DeepLink) parcel.readParcelable(ProceedButton.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ProceedButton[] newArray(int i12) {
                return new ProceedButton[i12];
            }
        }

        public ProceedButton(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.deepLink = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProceedButton)) {
                return false;
            }
            ProceedButton proceedButton = (ProceedButton) obj;
            return L.f(this.title, proceedButton.title) && L.f(this.deepLink, proceedButton.deepLink);
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.deepLink.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProceedButton(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, i12);
        }
    }

    /* compiled from: CategoriesModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoriesModel> {
        @Override // android.os.Parcelable.Creator
        public final CategoriesModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Category.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new CategoriesModel(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoriesModel[] newArray(int i12) {
            return new CategoriesModel[i12];
        }
    }

    public CategoriesModel(@l List<Category> list) {
        this.categories = list;
    }

    @l
    public final List<Category> c() {
        return this.categories;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CategoriesModel) && L.f(this.categories, ((CategoriesModel) obj).categories);
    }

    public final int hashCode() {
        List<Category> list = this.categories;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("CategoriesModel(categories="), this.categories, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        List<Category> list = this.categories;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((Category) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
