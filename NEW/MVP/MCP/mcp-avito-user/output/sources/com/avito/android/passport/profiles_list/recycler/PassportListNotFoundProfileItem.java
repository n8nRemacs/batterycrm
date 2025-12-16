package com.avito.android.passport.profiles_list.recycler;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.profile_list_item.PassportListItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ProfileListNotFoundItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profiles_list/recycler/PassportListNotFoundProfileItem;", "Lcom/avito/android/passport/profile_list_item/PassportListItem;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportListNotFoundProfileItem implements PassportListItem {

    @Y61.k
    public static final Parcelable.Creator<PassportListNotFoundProfileItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f213862b;

    /* compiled from: ProfileListNotFoundItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportListNotFoundProfileItem> {
        @Override // android.os.Parcelable.Creator
        public final PassportListNotFoundProfileItem createFromParcel(Parcel parcel) {
            return new PassportListNotFoundProfileItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportListNotFoundProfileItem[] newArray(int i12) {
            return new PassportListNotFoundProfileItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassportListNotFoundProfileItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269899b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF208170b() {
        return this.f213862b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f213862b);
    }

    public PassportListNotFoundProfileItem(@Y61.k String str) {
        this.f213862b = str;
    }

    public /* synthetic */ PassportListNotFoundProfileItem(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "PassportListNotFoundProfileItem" : str);
    }
}
