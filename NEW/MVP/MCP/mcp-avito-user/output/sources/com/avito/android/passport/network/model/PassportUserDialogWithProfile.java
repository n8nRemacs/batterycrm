package com.avito.android.passport.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MergeAccountsProfilesListResult.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/passport/network/model/PassportUserDialogWithProfile;", "Landroid/os/Parcelable;", "Lcom/avito/android/passport/network/model/MergeAccountsProfile;", "profile", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "Lcom/avito/android/passport/network/model/PassportUserDialogWithProfileListItem;", "list", "<init>", "(Lcom/avito/android/passport/network/model/MergeAccountsProfile;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/passport/network/model/MergeAccountsProfile;", "d", "()Lcom/avito/android/passport/network/model/MergeAccountsProfile;", "Lcom/avito/android/remote/model/text/AttributedText;", "e", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportUserDialogWithProfile implements Parcelable {

    @k
    public static final Parcelable.Creator<PassportUserDialogWithProfile> CREATOR = new a();

    @c("list")
    @k
    private final List<PassportUserDialogWithProfileListItem> list;

    @c("profile")
    @k
    private final MergeAccountsProfile profile;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: MergeAccountsProfilesListResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportUserDialogWithProfile> {
        @Override // android.os.Parcelable.Creator
        public final PassportUserDialogWithProfile createFromParcel(Parcel parcel) {
            MergeAccountsProfile mergeAccountsProfileCreateFromParcel = MergeAccountsProfile.CREATOR.createFromParcel(parcel);
            AttributedText attributedText = (AttributedText) parcel.readParcelable(PassportUserDialogWithProfile.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(PassportUserDialogWithProfileListItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new PassportUserDialogWithProfile(mergeAccountsProfileCreateFromParcel, attributedText, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PassportUserDialogWithProfile[] newArray(int i12) {
            return new PassportUserDialogWithProfile[i12];
        }
    }

    public PassportUserDialogWithProfile(@k MergeAccountsProfile mergeAccountsProfile, @k AttributedText attributedText, @k List<PassportUserDialogWithProfileListItem> list) {
        this.profile = mergeAccountsProfile;
        this.title = attributedText;
        this.list = list;
    }

    @k
    public final List<PassportUserDialogWithProfileListItem> c() {
        return this.list;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final MergeAccountsProfile getProfile() {
        return this.profile;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportUserDialogWithProfile)) {
            return false;
        }
        PassportUserDialogWithProfile passportUserDialogWithProfile = (PassportUserDialogWithProfile) obj;
        return L.f(this.profile, passportUserDialogWithProfile.profile) && L.f(this.title, passportUserDialogWithProfile.title) && L.f(this.list, passportUserDialogWithProfile.list);
    }

    public final int hashCode() {
        return this.list.hashCode() + com.avito.android.actions_sheet.a.b(this.profile.hashCode() * 31, 31, this.title);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportUserDialogWithProfile(profile=");
        sb2.append(this.profile);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", list=");
        return H.p(sb2, this.list, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.profile.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.title, i12);
        Iterator itJ = C0.j(this.list, parcel);
        while (itJ.hasNext()) {
            ((PassportUserDialogWithProfileListItem) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
