package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileCategory.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJJ\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\rJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0019J \u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b\u0006\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b*\u0010\r¨\u0006+"}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileCategory;", "Landroid/os/Parcelable;", "", "title", "", "isCollapsed", "isCollapsible", "Lcom/avito/android/remote/model/ExtendedProfileCategoryAdverts;", "items", "loadUri", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/ExtendedProfileCategoryAdverts;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "component4", "()Lcom/avito/android/remote/model/ExtendedProfileCategoryAdverts;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/ExtendedProfileCategoryAdverts;Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileCategory;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/Boolean;", "Lcom/avito/android/remote/model/ExtendedProfileCategoryAdverts;", "getItems", "getLoadUri", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileCategory implements Parcelable {

    @k
    public static final Parcelable.Creator<ExtendedProfileCategory> CREATOR = new Creator();

    @c("collapsed")
    @l
    private final Boolean isCollapsed;

    @c("isCollapsible")
    @l
    private final Boolean isCollapsible;

    @c("items")
    @l
    private final ExtendedProfileCategoryAdverts items;

    @c("loadUri")
    @l
    private final String loadUri;

    @c("title")
    @k
    private final String title;

    /* compiled from: ExtendedProfileCategory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileCategory> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileCategory createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
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
            return new ExtendedProfileCategory(string, boolValueOf, boolValueOf2, parcel.readInt() != 0 ? ExtendedProfileCategoryAdverts.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileCategory[] newArray(int i12) {
            return new ExtendedProfileCategory[i12];
        }
    }

    public ExtendedProfileCategory(@k String str, @l Boolean bool, @l Boolean bool2, @l ExtendedProfileCategoryAdverts extendedProfileCategoryAdverts, @l String str2) {
        this.title = str;
        this.isCollapsed = bool;
        this.isCollapsible = bool2;
        this.items = extendedProfileCategoryAdverts;
        this.loadUri = str2;
    }

    public static /* synthetic */ ExtendedProfileCategory copy$default(ExtendedProfileCategory extendedProfileCategory, String str, Boolean bool, Boolean bool2, ExtendedProfileCategoryAdverts extendedProfileCategoryAdverts, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = extendedProfileCategory.title;
        }
        if ((i12 & 2) != 0) {
            bool = extendedProfileCategory.isCollapsed;
        }
        Boolean bool3 = bool;
        if ((i12 & 4) != 0) {
            bool2 = extendedProfileCategory.isCollapsible;
        }
        Boolean bool4 = bool2;
        if ((i12 & 8) != 0) {
            extendedProfileCategoryAdverts = extendedProfileCategory.items;
        }
        ExtendedProfileCategoryAdverts extendedProfileCategoryAdverts2 = extendedProfileCategoryAdverts;
        if ((i12 & 16) != 0) {
            str2 = extendedProfileCategory.loadUri;
        }
        return extendedProfileCategory.copy(str, bool3, bool4, extendedProfileCategoryAdverts2, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getIsCollapsible() {
        return this.isCollapsible;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final ExtendedProfileCategoryAdverts getItems() {
        return this.items;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getLoadUri() {
        return this.loadUri;
    }

    @k
    public final ExtendedProfileCategory copy(@k String title, @l Boolean isCollapsed, @l Boolean isCollapsible, @l ExtendedProfileCategoryAdverts items, @l String loadUri) {
        return new ExtendedProfileCategory(title, isCollapsed, isCollapsible, items, loadUri);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileCategory)) {
            return false;
        }
        ExtendedProfileCategory extendedProfileCategory = (ExtendedProfileCategory) other;
        return L.f(this.title, extendedProfileCategory.title) && L.f(this.isCollapsed, extendedProfileCategory.isCollapsed) && L.f(this.isCollapsible, extendedProfileCategory.isCollapsible) && L.f(this.items, extendedProfileCategory.items) && L.f(this.loadUri, extendedProfileCategory.loadUri);
    }

    @l
    public final ExtendedProfileCategoryAdverts getItems() {
        return this.items;
    }

    @l
    public final String getLoadUri() {
        return this.loadUri;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Boolean bool = this.isCollapsed;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isCollapsible;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        ExtendedProfileCategoryAdverts extendedProfileCategoryAdverts = this.items;
        int iHashCode4 = (iHashCode3 + (extendedProfileCategoryAdverts == null ? 0 : extendedProfileCategoryAdverts.hashCode())) * 31;
        String str = this.loadUri;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @l
    public final Boolean isCollapsed() {
        return this.isCollapsed;
    }

    @l
    public final Boolean isCollapsible() {
        return this.isCollapsible;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileCategory(title=");
        sb2.append(this.title);
        sb2.append(", isCollapsed=");
        sb2.append(this.isCollapsed);
        sb2.append(", isCollapsible=");
        sb2.append(this.isCollapsible);
        sb2.append(", items=");
        sb2.append(this.items);
        sb2.append(", loadUri=");
        return C22026a.c(sb2, this.loadUri, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Boolean bool = this.isCollapsed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isCollapsible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        ExtendedProfileCategoryAdverts extendedProfileCategoryAdverts = this.items;
        if (extendedProfileCategoryAdverts == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            extendedProfileCategoryAdverts.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.loadUri);
    }
}
