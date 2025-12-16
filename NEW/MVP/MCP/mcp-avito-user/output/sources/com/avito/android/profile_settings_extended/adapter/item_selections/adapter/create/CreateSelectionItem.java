package com.avito.android.profile_settings_extended.adapter.item_selections.adapter.create;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsConfig;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.SelectionsRecyclerItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreateSelectionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/create/CreateSelectionItem;", "Lcom/avito/android/profile_settings_extended/adapter/item_selections/adapter/SelectionsRecyclerItem;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CreateSelectionItem implements SelectionsRecyclerItem {

    @k
    public static final Parcelable.Creator<CreateSelectionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f229535b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f229536c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f229537d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final SelectionsConfig f229538e;

    /* compiled from: CreateSelectionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreateSelectionItem> {
        @Override // android.os.Parcelable.Creator
        public final CreateSelectionItem createFromParcel(Parcel parcel) {
            return new CreateSelectionItem(parcel.readString(), parcel.readString(), parcel.readString(), SelectionsConfig.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CreateSelectionItem[] newArray(int i12) {
            return new CreateSelectionItem[i12];
        }
    }

    public CreateSelectionItem(@k String str, @l String str2, @k String str3, @k SelectionsConfig selectionsConfig) {
        this.f229535b = str;
        this.f229536c = str2;
        this.f229537d = str3;
        this.f229538e = selectionsConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateSelectionItem)) {
            return false;
        }
        CreateSelectionItem createSelectionItem = (CreateSelectionItem) obj;
        return L.f(this.f229535b, createSelectionItem.f229535b) && L.f(this.f229536c, createSelectionItem.f229536c) && L.f(this.f229537d, createSelectionItem.f229537d) && L.f(this.f229538e, createSelectionItem.f229538e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF428153b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF229535b() {
        return this.f229535b;
    }

    public final int hashCode() {
        int iHashCode = this.f229535b.hashCode() * 31;
        String str = this.f229536c;
        return this.f229538e.hashCode() + H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f229537d);
    }

    @k
    public final String toString() {
        return "CreateSelectionItem(stringId=" + this.f229535b + ", createNewText=" + this.f229536c + ", fieldName=" + this.f229537d + ", config=" + this.f229538e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f229535b);
        parcel.writeString(this.f229536c);
        parcel.writeString(this.f229537d);
        this.f229538e.writeToParcel(parcel, i12);
    }

    public /* synthetic */ CreateSelectionItem(String str, String str2, String str3, SelectionsConfig selectionsConfig, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "create_selection_item" : str, str2, str3, selectionsConfig);
    }
}
