package com.avito.android.widget_filters.remote.model.widgets;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: WidgetFiltersCategoryWidget.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\n\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/widget_filters/remote/model/widgets/Category;", "Landroid/os/Parcelable;", "", "id", "title", "Lcom/avito/android/remote/model/UniversalImage;", "imageActive", "imageInactive", "", "isSelected", "isDefault", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getTitle", "Lcom/avito/android/remote/model/UniversalImage;", "c", "()Lcom/avito/android/remote/model/UniversalImage;", "d", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Category implements Parcelable {

    @k
    public static final Parcelable.Creator<Category> CREATOR = new a();

    @c("id")
    @l
    private final String id;

    @c("imageActive")
    @l
    private final UniversalImage imageActive;

    @c("imageInactive")
    @l
    private final UniversalImage imageInactive;

    @c("isDefault")
    @l
    private final Boolean isDefault;

    @c("isSelected")
    @l
    private final Boolean isSelected;

    @c("title")
    @l
    private final String title;

    /* compiled from: WidgetFiltersCategoryWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Category> {
        @Override // android.os.Parcelable.Creator
        public final Category createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(Category.class.getClassLoader());
            UniversalImage universalImage2 = (UniversalImage) parcel.readParcelable(Category.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Category(string, string2, universalImage, universalImage2, boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final Category[] newArray(int i12) {
            return new Category[i12];
        }
    }

    public Category(@l String str, @l String str2, @l UniversalImage universalImage, @l UniversalImage universalImage2, @l Boolean bool, @l Boolean bool2) {
        this.id = str;
        this.title = str2;
        this.imageActive = universalImage;
        this.imageInactive = universalImage2;
        this.isSelected = bool;
        this.isDefault = bool2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final UniversalImage getImageActive() {
        return this.imageActive;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final UniversalImage getImageInactive() {
        return this.imageInactive;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Category)) {
            return false;
        }
        Category category = (Category) obj;
        return L.f(this.id, category.id) && L.f(this.title, category.title) && L.f(this.imageActive, category.imageActive) && L.f(this.imageInactive, category.imageInactive) && L.f(this.isSelected, category.isSelected) && L.f(this.isDefault, category.isDefault);
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.imageActive;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.imageInactive;
        int iHashCode4 = (iHashCode3 + (universalImage2 == null ? 0 : universalImage2.hashCode())) * 31;
        Boolean bool = this.isSelected;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDefault;
        return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Category(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", imageActive=");
        sb2.append(this.imageActive);
        sb2.append(", imageInactive=");
        sb2.append(this.imageInactive);
        sb2.append(", isSelected=");
        sb2.append(this.isSelected);
        sb2.append(", isDefault=");
        return C0.g(sb2, this.isDefault, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.imageActive, i12);
        parcel.writeParcelable(this.imageInactive, i12);
        Boolean bool = this.isSelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isDefault;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }
}
