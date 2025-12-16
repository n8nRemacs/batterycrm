package com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_management_core.moderation.ModerationStatus;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsConfig;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsRecyclerItem;
import com.avito.android.remote.model.Image;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/selection/SelectionItem;", "Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/SelectionsRecyclerItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SelectionItem implements SelectionsRecyclerItem {

    @k
    public static final Parcelable.Creator<SelectionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229556b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229557c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Image> f229558d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f229559e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f229560f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f229561g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Long f229562h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Long f229563i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f229564j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final DeepLink f229565k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final ModerationStatus f229566l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f229567m;

    /* renamed from: n, reason: collision with root package name */
    @l
    public final Boolean f229568n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final SelectionsConfig f229569o;

    /* compiled from: SelectionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectionItem> {
        @Override // android.os.Parcelable.Creator
        public final SelectionItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(SelectionItem.class, parcel, arrayList, iL2, 1);
            }
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string6 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(SelectionItem.class.getClassLoader());
            ModerationStatus moderationStatus = (ModerationStatus) parcel.readParcelable(SelectionItem.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SelectionItem(string, string2, arrayList, string3, string4, string5, lValueOf, lValueOf2, string6, deepLink, moderationStatus, z12, boolValueOf, SelectionsConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SelectionItem[] newArray(int i12) {
            return new SelectionItem[i12];
        }
    }

    public SelectionItem(@k String str, @l String str2, @k List<Image> list, @l String str3, @k String str4, @k String str5, @l Long l12, @l Long l13, @l String str6, @l DeepLink deepLink, @l ModerationStatus moderationStatus, boolean z12, @l Boolean bool, @k SelectionsConfig selectionsConfig) {
        this.f229556b = str;
        this.f229557c = str2;
        this.f229558d = list;
        this.f229559e = str3;
        this.f229560f = str4;
        this.f229561g = str5;
        this.f229562h = l12;
        this.f229563i = l13;
        this.f229564j = str6;
        this.f229565k = deepLink;
        this.f229566l = moderationStatus;
        this.f229567m = z12;
        this.f229568n = bool;
        this.f229569o = selectionsConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionItem)) {
            return false;
        }
        SelectionItem selectionItem = (SelectionItem) obj;
        return L.f(this.f229556b, selectionItem.f229556b) && L.f(this.f229557c, selectionItem.f229557c) && L.f(this.f229558d, selectionItem.f229558d) && L.f(this.f229559e, selectionItem.f229559e) && L.f(this.f229560f, selectionItem.f229560f) && L.f(this.f229561g, selectionItem.f229561g) && L.f(this.f229562h, selectionItem.f229562h) && L.f(this.f229563i, selectionItem.f229563i) && L.f(this.f229564j, selectionItem.f229564j) && L.f(this.f229565k, selectionItem.f229565k) && L.f(this.f229566l, selectionItem.f229566l) && this.f229567m == selectionItem.f229567m && L.f(this.f229568n, selectionItem.f229568n) && L.f(this.f229569o, selectionItem.f229569o);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF225422b() {
        return this.f229556b;
    }

    public final int hashCode() {
        int iHashCode = this.f229556b.hashCode() * 31;
        String str = this.f229557c;
        int iE2 = H.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f229558d);
        String str2 = this.f229559e;
        int iD2 = H.d(H.d((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f229560f), 31, this.f229561g);
        Long l12 = this.f229562h;
        int iHashCode2 = (iD2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f229563i;
        int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str3 = this.f229564j;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DeepLink deepLink = this.f229565k;
        int iHashCode5 = (iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ModerationStatus moderationStatus = this.f229566l;
        int i12 = r.i((iHashCode5 + (moderationStatus == null ? 0 : moderationStatus.hashCode())) * 31, 31, this.f229567m);
        Boolean bool = this.f229568n;
        return this.f229569o.hashCode() + ((i12 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "SelectionItem(stringId=" + this.f229556b + ", title=" + this.f229557c + ", images=" + this.f229558d + ", description=" + this.f229559e + ", fieldName=" + this.f229560f + ", valueId=" + this.f229561g + ", itemListId=" + this.f229562h + ", coverImageId=" + this.f229563i + ", shareLink=" + this.f229564j + ", viewDeepLink=" + this.f229565k + ", moderationStatus=" + this.f229566l + ", hasError=" + this.f229567m + ", isPublic=" + this.f229568n + ", config=" + this.f229569o + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229556b);
        parcel.writeString(this.f229557c);
        Iterator itJ = C0.j(this.f229558d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f229559e);
        parcel.writeString(this.f229560f);
        parcel.writeString(this.f229561g);
        Long l12 = this.f229562h;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f229563i;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        parcel.writeString(this.f229564j);
        parcel.writeParcelable(this.f229565k, i12);
        parcel.writeParcelable(this.f229566l, i12);
        parcel.writeInt(this.f229567m ? 1 : 0);
        Boolean bool = this.f229568n;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        this.f229569o.writeToParcel(parcel, i12);
    }
}
