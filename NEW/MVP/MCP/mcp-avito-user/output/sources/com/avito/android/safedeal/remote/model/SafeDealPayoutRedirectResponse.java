package com.avito.android.safedeal.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SafeDealPayoutRedirectResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/safedeal/remote/model/SafeDealPayoutRedirectResponse;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "payoutUrl", "<init>", "(Landroid/net/Uri;)V", "Landroid/net/Uri;", "c", "()Landroid/net/Uri;", "_avito-discouraged_avito-api_safedeal"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SafeDealPayoutRedirectResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<SafeDealPayoutRedirectResponse> CREATOR = new a();

    @c("payoutUrl")
    @k
    private final Uri payoutUrl;

    /* compiled from: SafeDealPayoutRedirectResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SafeDealPayoutRedirectResponse> {
        @Override // android.os.Parcelable.Creator
        public final SafeDealPayoutRedirectResponse createFromParcel(Parcel parcel) {
            return new SafeDealPayoutRedirectResponse((Uri) parcel.readParcelable(SafeDealPayoutRedirectResponse.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SafeDealPayoutRedirectResponse[] newArray(int i12) {
            return new SafeDealPayoutRedirectResponse[i12];
        }
    }

    public SafeDealPayoutRedirectResponse(@k Uri uri) {
        this.payoutUrl = uri;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Uri getPayoutUrl() {
        return this.payoutUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SafeDealPayoutRedirectResponse) && L.f(this.payoutUrl, ((SafeDealPayoutRedirectResponse) obj).payoutUrl);
    }

    public final int hashCode() {
        return this.payoutUrl.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.t(new StringBuilder("SafeDealPayoutRedirectResponse(payoutUrl="), this.payoutUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.payoutUrl, i12);
    }
}
