package com.avito.android.advert_collection;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.ParcelableEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MenuEntity.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection/MenuEntity;", "Lcom/avito/android/remote/model/ParcelableEntity;", "", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MenuEntity implements ParcelableEntity<String> {

    @Y61.k
    public static final Parcelable.Creator<MenuEntity> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f81236b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f81237c;

    /* compiled from: MenuEntity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MenuEntity> {
        @Override // android.os.Parcelable.Creator
        public final MenuEntity createFromParcel(Parcel parcel) {
            return new MenuEntity(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MenuEntity[] newArray(int i12) {
            return new MenuEntity[i12];
        }
    }

    public MenuEntity(@Y61.k String str, @Y61.k String str2) {
        this.f81236b = str;
        this.f81237c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuEntity)) {
            return false;
        }
        MenuEntity menuEntity = (MenuEntity) obj;
        return L.f(this.f81236b, menuEntity.f81236b) && L.f(this.f81237c, menuEntity.f81237c);
    }

    @Override // com.avito.android.remote.model.Entity
    public final Object getId() {
        return this.f81236b;
    }

    @Override // com.avito.android.remote.model.Entity
    @Y61.k
    /* renamed from: getName, reason: from getter */
    public final String getF81237c() {
        return this.f81237c;
    }

    public final int hashCode() {
        return this.f81237c.hashCode() + (this.f81236b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MenuEntity(id=");
        sb2.append(this.f81236b);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f81237c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f81236b);
        parcel.writeString(this.f81237c);
    }
}
