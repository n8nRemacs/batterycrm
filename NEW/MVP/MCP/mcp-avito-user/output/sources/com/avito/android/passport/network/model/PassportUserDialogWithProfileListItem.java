package com.avito.android.passport.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MergeAccountsProfilesListResult.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/passport/network/model/PassportUserDialogWithProfileListItem;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "iconId", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportUserDialogWithProfileListItem implements Parcelable {

    @k
    public static final Parcelable.Creator<PassportUserDialogWithProfileListItem> CREATOR = new a();

    @c("iconId")
    @k
    private final String iconId;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: MergeAccountsProfilesListResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportUserDialogWithProfileListItem> {
        @Override // android.os.Parcelable.Creator
        public final PassportUserDialogWithProfileListItem createFromParcel(Parcel parcel) {
            return new PassportUserDialogWithProfileListItem((AttributedText) parcel.readParcelable(PassportUserDialogWithProfileListItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportUserDialogWithProfileListItem[] newArray(int i12) {
            return new PassportUserDialogWithProfileListItem[i12];
        }
    }

    public PassportUserDialogWithProfileListItem(@k AttributedText attributedText, @k String str) {
        this.title = attributedText;
        this.iconId = str;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getIconId() {
        return this.iconId;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassportUserDialogWithProfileListItem)) {
            return false;
        }
        PassportUserDialogWithProfileListItem passportUserDialogWithProfileListItem = (PassportUserDialogWithProfileListItem) obj;
        return L.f(this.title, passportUserDialogWithProfileListItem.title) && L.f(this.iconId, passportUserDialogWithProfileListItem.iconId);
    }

    public final int hashCode() {
        return this.iconId.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PassportUserDialogWithProfileListItem(title=");
        sb2.append(this.title);
        sb2.append(", iconId=");
        return C22026a.c(sb2, this.iconId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        parcel.writeString(this.iconId);
    }
}
