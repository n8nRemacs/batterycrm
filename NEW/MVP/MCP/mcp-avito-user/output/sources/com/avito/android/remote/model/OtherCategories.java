package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OtherCategories.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u0012R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0014¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/OtherCategories;", "Landroid/os/Parcelable;", "", "title", "", "showTitleArrow", "Lcom/avito/android/deep_linking/links/DeepLink;", "titleDeepLink", "", "Lcom/avito/android/remote/model/OtherCategory;", "list", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;)Lcom/avito/android/remote/model/OtherCategories;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Ljava/lang/Boolean;", "getShowTitleArrow", "Lcom/avito/android/deep_linking/links/DeepLink;", "getTitleDeepLink", "Ljava/util/List;", "getList", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OtherCategories implements Parcelable {

    @k
    public static final Parcelable.Creator<OtherCategories> CREATOR = new Creator();

    @c("list")
    @k
    private final List<OtherCategory> list;

    @c("showTitleArrow")
    @l
    private final Boolean showTitleArrow;

    @c("title")
    @k
    private final String title;

    @c("titleDeepLink")
    @l
    private final DeepLink titleDeepLink;

    /* compiled from: OtherCategories.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OtherCategories> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OtherCategories createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            DeepLink deepLink = (DeepLink) parcel.readParcelable(OtherCategories.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = a.c(OtherCategory.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new OtherCategories(string, boolValueOf, deepLink, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OtherCategories[] newArray(int i12) {
            return new OtherCategories[i12];
        }
    }

    public OtherCategories(@k String str, @l Boolean bool, @l DeepLink deepLink, @k List<OtherCategory> list) {
        this.title = str;
        this.showTitleArrow = bool;
        this.titleDeepLink = deepLink;
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtherCategories copy$default(OtherCategories otherCategories, String str, Boolean bool, DeepLink deepLink, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = otherCategories.title;
        }
        if ((i12 & 2) != 0) {
            bool = otherCategories.showTitleArrow;
        }
        if ((i12 & 4) != 0) {
            deepLink = otherCategories.titleDeepLink;
        }
        if ((i12 & 8) != 0) {
            list = otherCategories.list;
        }
        return otherCategories.copy(str, bool, deepLink, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Boolean getShowTitleArrow() {
        return this.showTitleArrow;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getTitleDeepLink() {
        return this.titleDeepLink;
    }

    @k
    public final List<OtherCategory> component4() {
        return this.list;
    }

    @k
    public final OtherCategories copy(@k String title, @l Boolean showTitleArrow, @l DeepLink titleDeepLink, @k List<OtherCategory> list) {
        return new OtherCategories(title, showTitleArrow, titleDeepLink, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherCategories)) {
            return false;
        }
        OtherCategories otherCategories = (OtherCategories) other;
        return L.f(this.title, otherCategories.title) && L.f(this.showTitleArrow, otherCategories.showTitleArrow) && L.f(this.titleDeepLink, otherCategories.titleDeepLink) && L.f(this.list, otherCategories.list);
    }

    @k
    public final List<OtherCategory> getList() {
        return this.list;
    }

    @l
    public final Boolean getShowTitleArrow() {
        return this.showTitleArrow;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final DeepLink getTitleDeepLink() {
        return this.titleDeepLink;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Boolean bool = this.showTitleArrow;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        DeepLink deepLink = this.titleDeepLink;
        return this.list.hashCode() + ((iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OtherCategories(title=");
        sb2.append(this.title);
        sb2.append(", showTitleArrow=");
        sb2.append(this.showTitleArrow);
        sb2.append(", titleDeepLink=");
        sb2.append(this.titleDeepLink);
        sb2.append(", list=");
        return H.p(sb2, this.list, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        Boolean bool = this.showTitleArrow;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.titleDeepLink, flags);
        Iterator itJ = C0.j(this.list, parcel);
        while (itJ.hasNext()) {
            ((OtherCategory) itJ.next()).writeToParcel(parcel, flags);
        }
    }
}
