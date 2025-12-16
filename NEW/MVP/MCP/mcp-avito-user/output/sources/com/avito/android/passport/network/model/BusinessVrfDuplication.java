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
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/passport/network/model/BusinessVrfDuplication;", "Landroid/os/Parcelable;", "Lcom/avito/android/passport/network/model/MergeAccountsProfile;", "profile", "", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "", "Lcom/avito/android/passport/network/model/BusinessVrfDuplicationAction;", "actions", "<init>", "(Lcom/avito/android/passport/network/model/MergeAccountsProfile;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/passport/network/model/MergeAccountsProfile;", "c", "()Lcom/avito/android/passport/network/model/MergeAccountsProfile;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "getActions", "()Ljava/util/List;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BusinessVrfDuplication implements Parcelable {

    @k
    public static final Parcelable.Creator<BusinessVrfDuplication> CREATOR = new a();

    @c("actions")
    @k
    private final List<BusinessVrfDuplicationAction> actions;

    @c("profile")
    @k
    private final MergeAccountsProfile profile;

    @c("text")
    @k
    private final AttributedText text;

    @c("title")
    @k
    private final String title;

    /* compiled from: MergeAccountsProfilesListResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BusinessVrfDuplication> {
        @Override // android.os.Parcelable.Creator
        public final BusinessVrfDuplication createFromParcel(Parcel parcel) {
            MergeAccountsProfile mergeAccountsProfileCreateFromParcel = MergeAccountsProfile.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(BusinessVrfDuplication.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(BusinessVrfDuplicationAction.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new BusinessVrfDuplication(mergeAccountsProfileCreateFromParcel, string, attributedText, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final BusinessVrfDuplication[] newArray(int i12) {
            return new BusinessVrfDuplication[i12];
        }
    }

    public BusinessVrfDuplication(@k MergeAccountsProfile mergeAccountsProfile, @k String str, @k AttributedText attributedText, @k List<BusinessVrfDuplicationAction> list) {
        this.profile = mergeAccountsProfile;
        this.title = str;
        this.text = attributedText;
        this.actions = list;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final MergeAccountsProfile getProfile() {
        return this.profile;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BusinessVrfDuplication)) {
            return false;
        }
        BusinessVrfDuplication businessVrfDuplication = (BusinessVrfDuplication) obj;
        return L.f(this.profile, businessVrfDuplication.profile) && L.f(this.title, businessVrfDuplication.title) && L.f(this.text, businessVrfDuplication.text) && L.f(this.actions, businessVrfDuplication.actions);
    }

    @k
    public final List<BusinessVrfDuplicationAction> getActions() {
        return this.actions;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.actions.hashCode() + com.avito.android.actions_sheet.a.b(H.d(this.profile.hashCode() * 31, 31, this.title), 31, this.text);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BusinessVrfDuplication(profile=");
        sb2.append(this.profile);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", actions=");
        return H.p(sb2, this.actions, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.profile.writeToParcel(parcel, i12);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.text, i12);
        Iterator itJ = C0.j(this.actions, parcel);
        while (itJ.hasNext()) {
            ((BusinessVrfDuplicationAction) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
