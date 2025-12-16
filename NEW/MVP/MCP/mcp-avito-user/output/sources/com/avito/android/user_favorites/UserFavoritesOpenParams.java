package com.avito.android.user_favorites;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserFavoritesOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/UserFavoritesOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserFavoritesOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<UserFavoritesOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f316826b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f316827c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Integer f316828d;

    /* compiled from: UserFavoritesOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserFavoritesOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final UserFavoritesOpenParams createFromParcel(Parcel parcel) {
            return new UserFavoritesOpenParams(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserFavoritesOpenParams[] newArray(int i12) {
            return new UserFavoritesOpenParams[i12];
        }
    }

    public UserFavoritesOpenParams() {
        this(0, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserFavoritesOpenParams)) {
            return false;
        }
        UserFavoritesOpenParams userFavoritesOpenParams = (UserFavoritesOpenParams) obj;
        return this.f316826b == userFavoritesOpenParams.f316826b && kotlin.jvm.internal.L.f(this.f316827c, userFavoritesOpenParams.f316827c) && kotlin.jvm.internal.L.f(this.f316828d, userFavoritesOpenParams.f316828d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f316826b) * 31;
        String str = this.f316827c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f316828d;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserFavoritesOpenParams(startTab=");
        sb2.append(this.f316826b);
        sb2.append(", subscriptionId=");
        sb2.append(this.f316827c);
        sb2.append(", categoryId=");
        return com.akita.compose.component.accordion.s.j(sb2, this.f316828d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f316826b);
        parcel.writeString(this.f316827c);
        Integer num = this.f316828d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public UserFavoritesOpenParams(int i12, @Y61.l Integer num, @Y61.l String str) {
        this.f316826b = i12;
        this.f316827c = str;
        this.f316828d = num;
    }

    public /* synthetic */ UserFavoritesOpenParams(int i12, String str, Integer num, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? -1 : i12, (i13 & 4) != 0 ? null : num, (i13 & 2) != 0 ? null : str);
    }
}
