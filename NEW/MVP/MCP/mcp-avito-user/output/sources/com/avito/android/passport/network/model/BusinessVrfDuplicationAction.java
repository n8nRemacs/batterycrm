package com.avito.android.passport.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MergeAccountsProfilesListResult.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/passport/network/model/BusinessVrfDuplicationAction;", "Landroid/os/Parcelable;", "", "actionName", "title", "subtitle", "iconId", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/passport/network/model/PassportUserDialogWithProfile;", "passportUserDialogWithProfile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/passport/network/model/PassportUserDialogWithProfile;)V", "Ljava/lang/String;", "m3", "()Ljava/lang/String;", "getTitle", "getSubtitle", "c", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/passport/network/model/PassportUserDialogWithProfile;", "d", "()Lcom/avito/android/passport/network/model/PassportUserDialogWithProfile;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BusinessVrfDuplicationAction implements Parcelable {

    @k
    public static final Parcelable.Creator<BusinessVrfDuplicationAction> CREATOR = new a();

    @c("actionName")
    @k
    private final String actionName;

    @c(ContextActionHandler.Link.URL)
    @k
    private final DeepLink deeplink;

    @c("iconId")
    @k
    private final String iconId;

    @c("passportUserDialogWithProfile")
    @l
    private final PassportUserDialogWithProfile passportUserDialogWithProfile;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: MergeAccountsProfilesListResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BusinessVrfDuplicationAction> {
        @Override // android.os.Parcelable.Creator
        public final BusinessVrfDuplicationAction createFromParcel(Parcel parcel) {
            return new BusinessVrfDuplicationAction(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(BusinessVrfDuplicationAction.class.getClassLoader()), parcel.readInt() == 0 ? null : PassportUserDialogWithProfile.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessVrfDuplicationAction[] newArray(int i12) {
            return new BusinessVrfDuplicationAction[i12];
        }
    }

    public BusinessVrfDuplicationAction(@k String str, @k String str2, @k String str3, @k String str4, @k DeepLink deepLink, @l PassportUserDialogWithProfile passportUserDialogWithProfile) {
        this.actionName = str;
        this.title = str2;
        this.subtitle = str3;
        this.iconId = str4;
        this.deeplink = deepLink;
        this.passportUserDialogWithProfile = passportUserDialogWithProfile;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getIconId() {
        return this.iconId;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final PassportUserDialogWithProfile getPassportUserDialogWithProfile() {
        return this.passportUserDialogWithProfile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessVrfDuplicationAction)) {
            return false;
        }
        BusinessVrfDuplicationAction businessVrfDuplicationAction = (BusinessVrfDuplicationAction) obj;
        return L.f(this.actionName, businessVrfDuplicationAction.actionName) && L.f(this.title, businessVrfDuplicationAction.title) && L.f(this.subtitle, businessVrfDuplicationAction.subtitle) && L.f(this.iconId, businessVrfDuplicationAction.iconId) && L.f(this.deeplink, businessVrfDuplicationAction.deeplink) && L.f(this.passportUserDialogWithProfile, businessVrfDuplicationAction.passportUserDialogWithProfile);
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.deeplink, H.d(H.d(H.d(this.actionName.hashCode() * 31, 31, this.title), 31, this.subtitle), 31, this.iconId), 31);
        PassportUserDialogWithProfile passportUserDialogWithProfile = this.passportUserDialogWithProfile;
        return iE2 + (passportUserDialogWithProfile == null ? 0 : passportUserDialogWithProfile.hashCode());
    }

    @k
    /* renamed from: m3, reason: from getter */
    public final String getActionName() {
        return this.actionName;
    }

    @k
    public final String toString() {
        return "BusinessVrfDuplicationAction(actionName=" + this.actionName + ", title=" + this.title + ", subtitle=" + this.subtitle + ", iconId=" + this.iconId + ", deeplink=" + this.deeplink + ", passportUserDialogWithProfile=" + this.passportUserDialogWithProfile + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.actionName);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.iconId);
        parcel.writeParcelable(this.deeplink, i12);
        PassportUserDialogWithProfile passportUserDialogWithProfile = this.passportUserDialogWithProfile;
        if (passportUserDialogWithProfile == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            passportUserDialogWithProfile.writeToParcel(parcel, i12);
        }
    }
}
