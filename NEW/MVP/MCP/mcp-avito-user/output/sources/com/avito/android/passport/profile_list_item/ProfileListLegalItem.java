package com.avito.android.passport.profile_list_item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.profile_add.merge.profiles_list.recycler.v;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: ProfileListLegalItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_list_item/ProfileListLegalItem;", "Lcom/avito/android/passport/profile_list_item/PassportListItem;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/recycler/v;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProfileListLegalItem implements PassportListItem, v {

    @Y61.k
    public static final Parcelable.Creator<ProfileListLegalItem> CREATOR = new a();

    /* compiled from: ProfileListLegalItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfileListLegalItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfileListLegalItem createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new ProfileListLegalItem();
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileListLegalItem[] newArray(int i12) {
            return new ProfileListLegalItem[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF186010b() {
        return "ProfileListLegalItemItem";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
