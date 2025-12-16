package com.avito.android.select.item_with_iconbutton;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.ParcelableEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemWithIconButtonRightEntity.kt */
@d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select/item_with_iconbutton/ItemWithIconButtonRightEntity;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_select_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ItemWithIconButtonRightEntity implements ParcelableEntity<String> {

    @k
    public static final Parcelable.Creator<ItemWithIconButtonRightEntity> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f265545b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f265546c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f265547d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f265548e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f265549f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f265550g;

    /* compiled from: ItemWithIconButtonRightEntity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemWithIconButtonRightEntity> {
        @Override // android.os.Parcelable.Creator
        public final ItemWithIconButtonRightEntity createFromParcel(Parcel parcel) {
            return new ItemWithIconButtonRightEntity(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemWithIconButtonRightEntity[] newArray(int i12) {
            return new ItemWithIconButtonRightEntity[i12];
        }
    }

    public ItemWithIconButtonRightEntity(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6) {
        this.f265545b = str;
        this.f265546c = str2;
        this.f265547d = str3;
        this.f265548e = str4;
        this.f265549f = str5;
        this.f265550g = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemWithIconButtonRightEntity)) {
            return false;
        }
        ItemWithIconButtonRightEntity itemWithIconButtonRightEntity = (ItemWithIconButtonRightEntity) obj;
        return L.f(this.f265545b, itemWithIconButtonRightEntity.f265545b) && L.f(this.f265546c, itemWithIconButtonRightEntity.f265546c) && L.f(this.f265547d, itemWithIconButtonRightEntity.f265547d) && L.f(this.f265548e, itemWithIconButtonRightEntity.f265548e) && L.f(this.f265549f, itemWithIconButtonRightEntity.f265549f) && L.f(this.f265550g, itemWithIconButtonRightEntity.f265550g);
    }

    @Override // com.avito.android.remote.model.Entity
    public final Object getId() {
        return this.f265545b;
    }

    @Override // com.avito.android.remote.model.Entity
    @l
    /* renamed from: getName, reason: from getter */
    public final String getF265546c() {
        return this.f265546c;
    }

    public final int hashCode() {
        int iHashCode = this.f265545b.hashCode() * 31;
        String str = this.f265546c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f265547d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f265548e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f265549f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f265550g;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemWithIconButtonRightEntity(id=");
        sb2.append(this.f265545b);
        sb2.append(", name=");
        sb2.append(this.f265546c);
        sb2.append(", leftIconName=");
        sb2.append(this.f265547d);
        sb2.append(", rightIconName=");
        sb2.append(this.f265548e);
        sb2.append(", rightIconItemId=");
        sb2.append(this.f265549f);
        sb2.append(", rightIconColor=");
        return C22026a.c(sb2, this.f265550g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f265545b);
        parcel.writeString(this.f265546c);
        parcel.writeString(this.f265547d);
        parcel.writeString(this.f265548e);
        parcel.writeString(this.f265549f);
        parcel.writeString(this.f265550g);
    }

    public /* synthetic */ ItemWithIconButtonRightEntity(String str, String str2, String str3, String str4, String str5, String str6, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) == 0 ? str6 : null);
    }
}
