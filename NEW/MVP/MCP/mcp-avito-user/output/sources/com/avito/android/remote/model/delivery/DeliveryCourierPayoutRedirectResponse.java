package com.avito.android.remote.model.delivery;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryCourierPayoutRedirectResponse.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0007¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/delivery/DeliveryCourierPayoutRedirectResponse;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "payoutUrl", "<init>", "(Landroid/net/Uri;)V", "component1", "()Landroid/net/Uri;", "copy", "(Landroid/net/Uri;)Lcom/avito/android/remote/model/delivery/DeliveryCourierPayoutRedirectResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "getPayoutUrl", "_avito-discouraged_avito-api_delivery"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeliveryCourierPayoutRedirectResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<DeliveryCourierPayoutRedirectResponse> CREATOR = new Creator();

    @c("payoutUrl")
    @k
    private final Uri payoutUrl;

    /* compiled from: DeliveryCourierPayoutRedirectResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeliveryCourierPayoutRedirectResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryCourierPayoutRedirectResponse createFromParcel(@k Parcel parcel) {
            return new DeliveryCourierPayoutRedirectResponse((Uri) parcel.readParcelable(DeliveryCourierPayoutRedirectResponse.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DeliveryCourierPayoutRedirectResponse[] newArray(int i12) {
            return new DeliveryCourierPayoutRedirectResponse[i12];
        }
    }

    public DeliveryCourierPayoutRedirectResponse(@k Uri uri) {
        this.payoutUrl = uri;
    }

    public static /* synthetic */ DeliveryCourierPayoutRedirectResponse copy$default(DeliveryCourierPayoutRedirectResponse deliveryCourierPayoutRedirectResponse, Uri uri, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri = deliveryCourierPayoutRedirectResponse.payoutUrl;
        }
        return deliveryCourierPayoutRedirectResponse.copy(uri);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Uri getPayoutUrl() {
        return this.payoutUrl;
    }

    @k
    public final DeliveryCourierPayoutRedirectResponse copy(@k Uri payoutUrl) {
        return new DeliveryCourierPayoutRedirectResponse(payoutUrl);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DeliveryCourierPayoutRedirectResponse) && L.f(this.payoutUrl, ((DeliveryCourierPayoutRedirectResponse) other).payoutUrl);
    }

    @k
    public final Uri getPayoutUrl() {
        return this.payoutUrl;
    }

    public int hashCode() {
        return this.payoutUrl.hashCode();
    }

    @k
    public String toString() {
        return a.t(new StringBuilder("DeliveryCourierPayoutRedirectResponse(payoutUrl="), this.payoutUrl, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.payoutUrl, flags);
    }
}
