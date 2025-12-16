package com.avito.android.passport.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.passport.network.model.PassportUserDialogWithProfile;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/deeplinks/PassportAccountsProfileErrorLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final class PassportAccountsProfileErrorLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PassportAccountsProfileErrorLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public PassportUserDialogWithProfile f211118b;

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportAccountsProfileErrorLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportAccountsProfileErrorLink createFromParcel(Parcel parcel) {
            return new PassportAccountsProfileErrorLink(parcel.readInt() == 0 ? null : PassportUserDialogWithProfile.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PassportAccountsProfileErrorLink[] newArray(int i12) {
            return new PassportAccountsProfileErrorLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PassportAccountsProfileErrorLink() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        PassportUserDialogWithProfile passportUserDialogWithProfile = this.f211118b;
        if (passportUserDialogWithProfile == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            passportUserDialogWithProfile.writeToParcel(parcel, i12);
        }
    }

    public /* synthetic */ PassportAccountsProfileErrorLink(PassportUserDialogWithProfile passportUserDialogWithProfile, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : passportUserDialogWithProfile);
    }

    public PassportAccountsProfileErrorLink(@l PassportUserDialogWithProfile passportUserDialogWithProfile) {
        this.f211118b = passportUserDialogWithProfile;
    }
}
