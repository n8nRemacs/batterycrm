package com.avito.android.category.element;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CategoryWidgetElementItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category/element/CategoryWidgetElementItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_bx-content_widget_category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CategoryWidgetElementItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<CategoryWidgetElementItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f116595b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f116596c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final DeepLink f116597d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Boolean f116598e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ActionedImage f116599f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final List<CategoryItemAction> f116600g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f116601h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final ItemDisplayParams f116602i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f116603j;

    /* compiled from: CategoryWidgetElementItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CategoryWidgetElementItem> {
        @Override // android.os.Parcelable.Creator
        public final CategoryWidgetElementItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(CategoryWidgetElementItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            ActionedImage actionedImageCreateFromParcel = parcel.readInt() == 0 ? null : ActionedImage.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(CategoryItemAction.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new CategoryWidgetElementItem(string, string2, deepLink, boolValueOf, actionedImageCreateFromParcel, arrayList, parcel.readInt() != 0, parcel.readInt() != 0 ? ItemDisplayParams.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryWidgetElementItem[] newArray(int i12) {
            return new CategoryWidgetElementItem[i12];
        }
    }

    public CategoryWidgetElementItem(@Y61.k String str, @Y61.l String str2, @Y61.l DeepLink deepLink, @Y61.l Boolean bool, @Y61.l ActionedImage actionedImage, @Y61.l List<CategoryItemAction> list, boolean z12, @Y61.l ItemDisplayParams itemDisplayParams, boolean z13) {
        this.f116595b = str;
        this.f116596c = str2;
        this.f116597d = deepLink;
        this.f116598e = bool;
        this.f116599f = actionedImage;
        this.f116600g = list;
        this.f116601h = z12;
        this.f116602i = itemDisplayParams;
        this.f116603j = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryWidgetElementItem)) {
            return false;
        }
        CategoryWidgetElementItem categoryWidgetElementItem = (CategoryWidgetElementItem) obj;
        return L.f(this.f116595b, categoryWidgetElementItem.f116595b) && L.f(this.f116596c, categoryWidgetElementItem.f116596c) && L.f(this.f116597d, categoryWidgetElementItem.f116597d) && L.f(this.f116598e, categoryWidgetElementItem.f116598e) && L.f(this.f116599f, categoryWidgetElementItem.f116599f) && L.f(this.f116600g, categoryWidgetElementItem.f116600g) && this.f116601h == categoryWidgetElementItem.f116601h && L.f(this.f116602i, categoryWidgetElementItem.f116602i) && this.f116603j == categoryWidgetElementItem.f116603j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF95530b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF106500f() {
        return this.f116595b;
    }

    public final int hashCode() {
        int iHashCode = this.f116595b.hashCode() * 31;
        String str = this.f116596c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f116597d;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Boolean bool = this.f116598e;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        ActionedImage actionedImage = this.f116599f;
        int iHashCode5 = (iHashCode4 + (actionedImage == null ? 0 : actionedImage.hashCode())) * 31;
        List<CategoryItemAction> list = this.f116600g;
        int i12 = androidx.appcompat.app.r.i((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31, 31, this.f116601h);
        ItemDisplayParams itemDisplayParams = this.f116602i;
        return Boolean.hashCode(this.f116603j) + ((i12 + (itemDisplayParams != null ? itemDisplayParams.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryWidgetElementItem(stringId=");
        sb2.append(this.f116595b);
        sb2.append(", title=");
        sb2.append(this.f116596c);
        sb2.append(", titleAction=");
        sb2.append(this.f116597d);
        sb2.append(", isAutoHeight=");
        sb2.append(this.f116598e);
        sb2.append(", actionedImage=");
        sb2.append(this.f116599f);
        sb2.append(", actions=");
        sb2.append(this.f116600g);
        sb2.append(", removeImage=");
        sb2.append(this.f116601h);
        sb2.append(", displayParams=");
        sb2.append(this.f116602i);
        sb2.append(", isSingleItem=");
        return androidx.appcompat.app.r.x(sb2, this.f116603j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f116595b);
        parcel.writeString(this.f116596c);
        parcel.writeParcelable(this.f116597d, i12);
        Boolean bool = this.f116598e;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        ActionedImage actionedImage = this.f116599f;
        if (actionedImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionedImage.writeToParcel(parcel, i12);
        }
        List<CategoryItemAction> list = this.f116600g;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((CategoryItemAction) itA.next()).writeToParcel(parcel, i12);
            }
        }
        parcel.writeInt(this.f116601h ? 1 : 0);
        ItemDisplayParams itemDisplayParams = this.f116602i;
        if (itemDisplayParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            itemDisplayParams.writeToParcel(parcel, i12);
        }
        parcel.writeInt(this.f116603j ? 1 : 0);
    }

    public /* synthetic */ CategoryWidgetElementItem(String str, String str2, DeepLink deepLink, Boolean bool, ActionedImage actionedImage, List list, boolean z12, ItemDisplayParams itemDisplayParams, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, deepLink, bool, actionedImage, list, (i12 & 64) != 0 ? false : z12, itemDisplayParams, (i12 & 256) != 0 ? false : z13);
    }
}
