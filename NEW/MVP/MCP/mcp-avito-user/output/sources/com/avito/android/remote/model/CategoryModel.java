package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryModel.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b!\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b\t\u0010$¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/CategoryModel;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/Navigation;", "navigation", "", "title", "description", "rootNavigation", "", "isVerticalChange", "<init>", "(Lcom/avito/android/remote/model/Navigation;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/Navigation;Z)V", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/Navigation;", "getNavigation", "()Lcom/avito/android/remote/model/Navigation;", "Ljava/lang/String;", "getTitle", "getDescription", "getRootNavigation", "Z", "()Z", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class CategoryModel implements Parcelable {

    @k
    public static final Parcelable.Creator<CategoryModel> CREATOR = new Creator();

    @c(alternate = {"subtitle"}, value = "description")
    @l
    private final String description;

    @c("isCrossVertical")
    private final boolean isVerticalChange;

    @c("navigation")
    @k
    private final Navigation navigation;

    @c("rootNavigation")
    @l
    private final Navigation rootNavigation;

    @c("title")
    @k
    private final String title;

    /* compiled from: CategoryModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CategoryModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategoryModel createFromParcel(@k Parcel parcel) {
            Parcelable.Creator<Navigation> creator = Navigation.CREATOR;
            return new CategoryModel(creator.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CategoryModel[] newArray(int i12) {
            return new CategoryModel[i12];
        }
    }

    public CategoryModel(@k Navigation navigation2, @k String str, @l String str2, @l Navigation navigation3, boolean z12) {
        this.navigation = navigation2;
        this.title = str;
        this.description = str2;
        this.rootNavigation = navigation3;
        this.isVerticalChange = z12;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CategoryModel) && L.f(getNavigation(), ((CategoryModel) other).getNavigation());
    }

    @l
    public String getDescription() {
        return this.description;
    }

    @k
    public Navigation getNavigation() {
        return this.navigation;
    }

    @l
    public Navigation getRootNavigation() {
        return this.rootNavigation;
    }

    @k
    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return getNavigation().hashCode();
    }

    /* renamed from: isVerticalChange, reason: from getter */
    public boolean getIsVerticalChange() {
        return this.isVerticalChange;
    }

    @k
    public String toString() {
        return "CategoryModel(navigation=" + getNavigation() + ", title='" + getTitle() + "', isCrossVertical=" + getIsVerticalChange() + ", rootNavigation=" + getRootNavigation() + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        this.navigation.writeToParcel(parcel, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        Navigation navigation2 = this.rootNavigation;
        if (navigation2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            navigation2.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isVerticalChange ? 1 : 0);
    }

    public /* synthetic */ CategoryModel(Navigation navigation2, String str, String str2, Navigation navigation3, boolean z12, int i12, C42822w c42822w) {
        this(navigation2, str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : navigation3, (i12 & 16) != 0 ? false : z12);
    }
}
