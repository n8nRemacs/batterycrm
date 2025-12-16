package com.avito.android.passport.profile_add.merge.business_vrf_duplication.recycler;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.network.model.PassportUserDialogWithProfile;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PassportVrfActionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/business_vrf_duplication/recycler/PassportVrfActionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportVrfActionItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<PassportVrfActionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f212576b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f212577c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f212578d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f212579e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final DeepLink f212580f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final PassportUserDialogWithProfile f212581g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f212582h = String.valueOf(hashCode());

    /* compiled from: PassportVrfActionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportVrfActionItem> {
        @Override // android.os.Parcelable.Creator
        public final PassportVrfActionItem createFromParcel(Parcel parcel) {
            return new PassportVrfActionItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(PassportVrfActionItem.class.getClassLoader()), (PassportUserDialogWithProfile) parcel.readParcelable(PassportVrfActionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PassportVrfActionItem[] newArray(int i12) {
            return new PassportVrfActionItem[i12];
        }
    }

    public PassportVrfActionItem(@k String str, @k String str2, @k String str3, @k String str4, @k DeepLink deepLink, @l PassportUserDialogWithProfile passportUserDialogWithProfile) {
        this.f212576b = str;
        this.f212577c = str2;
        this.f212578d = str3;
        this.f212579e = str4;
        this.f212580f = deepLink;
        this.f212581g = passportUserDialogWithProfile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportVrfActionItem)) {
            return false;
        }
        PassportVrfActionItem passportVrfActionItem = (PassportVrfActionItem) obj;
        return L.f(this.f212576b, passportVrfActionItem.f212576b) && L.f(this.f212577c, passportVrfActionItem.f212577c) && L.f(this.f212578d, passportVrfActionItem.f212578d) && L.f(this.f212579e, passportVrfActionItem.f212579e) && L.f(this.f212580f, passportVrfActionItem.f212580f) && L.f(this.f212581g, passportVrfActionItem.f212581g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF117182c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281466b() {
        return this.f212582h;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f212580f, H.d(H.d(H.d(this.f212576b.hashCode() * 31, 31, this.f212577c), 31, this.f212578d), 31, this.f212579e), 31);
        PassportUserDialogWithProfile passportUserDialogWithProfile = this.f212581g;
        return iE2 + (passportUserDialogWithProfile == null ? 0 : passportUserDialogWithProfile.hashCode());
    }

    @k
    public final String toString() {
        return "PassportVrfActionItem(actionName=" + this.f212576b + ", title=" + this.f212577c + ", subtitle=" + this.f212578d + ", iconId=" + this.f212579e + ", deeplink=" + this.f212580f + ", passportUserDialogWithProfile=" + this.f212581g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f212576b);
        parcel.writeString(this.f212577c);
        parcel.writeString(this.f212578d);
        parcel.writeString(this.f212579e);
        parcel.writeParcelable(this.f212580f, i12);
        parcel.writeParcelable(this.f212581g, i12);
    }
}
