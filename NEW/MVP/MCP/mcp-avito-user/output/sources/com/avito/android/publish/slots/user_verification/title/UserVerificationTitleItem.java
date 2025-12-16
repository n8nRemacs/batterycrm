package com.avito.android.publish.slots.user_verification.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserVerificationTitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/user_verification/title/UserVerificationTitleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserVerificationTitleItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<UserVerificationTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245139b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f245140c;

    /* compiled from: UserVerificationTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserVerificationTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final UserVerificationTitleItem createFromParcel(Parcel parcel) {
            return new UserVerificationTitleItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UserVerificationTitleItem[] newArray(int i12) {
            return new UserVerificationTitleItem[i12];
        }
    }

    public UserVerificationTitleItem(@k String str, @k String str2) {
        this.f245139b = str;
        this.f245140c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserVerificationTitleItem)) {
            return false;
        }
        UserVerificationTitleItem userVerificationTitleItem = (UserVerificationTitleItem) obj;
        return L.f(this.f245139b, userVerificationTitleItem.f245139b) && L.f(this.f245140c, userVerificationTitleItem.f245140c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF243977b() {
        return this.f245139b;
    }

    public final int hashCode() {
        return this.f245140c.hashCode() + (this.f245139b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserVerificationTitleItem(stringId=");
        sb2.append(this.f245139b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f245140c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f245139b);
        parcel.writeString(this.f245140c);
    }
}
