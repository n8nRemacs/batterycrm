package com.avito.android.passport.network.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfilesListResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/passport/network/model/PassportListAvatar;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(Landroid/net/Uri;)V", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class PassportListAvatar implements Parcelable {

    @k
    public static final Parcelable.Creator<PassportListAvatar> CREATOR = new a();

    @c("default")
    @l
    private final Uri uri;

    /* compiled from: ProfilesListResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportListAvatar> {
        @Override // android.os.Parcelable.Creator
        public final PassportListAvatar createFromParcel(Parcel parcel) {
            return new PassportListAvatar((Uri) parcel.readParcelable(PassportListAvatar.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PassportListAvatar[] newArray(int i12) {
            return new PassportListAvatar[i12];
        }
    }

    public PassportListAvatar(@l Uri uri) {
        this.uri = uri;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Uri getUri() {
        return this.uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PassportListAvatar) && L.f(this.uri, ((PassportListAvatar) obj).uri);
    }

    public final int hashCode() {
        Uri uri = this.uri;
        if (uri == null) {
            return 0;
        }
        return uri.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.t(new StringBuilder("PassportListAvatar(uri="), this.uri, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.uri, i12);
    }
}
