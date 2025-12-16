package com.avito.android.remote.model.advert_details;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SellerOnlineStatus.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/advert_details/SellerOnlineStatus;", "Landroid/os/Parcelable;", "", "isOnline", "", "replySpeed", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/avito/android/remote/model/advert_details/SellerOnlineStatus;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/lang/String;", "getReplySpeed", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SellerOnlineStatus implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerOnlineStatus> CREATOR = new Creator();
    private final boolean isOnline;

    @l
    private final String replySpeed;

    /* compiled from: SellerOnlineStatus.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SellerOnlineStatus> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerOnlineStatus createFromParcel(@k Parcel parcel) {
            return new SellerOnlineStatus(parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerOnlineStatus[] newArray(int i12) {
            return new SellerOnlineStatus[i12];
        }
    }

    public SellerOnlineStatus(boolean z12, @l String str) {
        this.isOnline = z12;
        this.replySpeed = str;
    }

    public static /* synthetic */ SellerOnlineStatus copy$default(SellerOnlineStatus sellerOnlineStatus, boolean z12, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z12 = sellerOnlineStatus.isOnline;
        }
        if ((i12 & 2) != 0) {
            str = sellerOnlineStatus.replySpeed;
        }
        return sellerOnlineStatus.copy(z12, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsOnline() {
        return this.isOnline;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getReplySpeed() {
        return this.replySpeed;
    }

    @k
    public final SellerOnlineStatus copy(boolean isOnline, @l String replySpeed) {
        return new SellerOnlineStatus(isOnline, replySpeed);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerOnlineStatus)) {
            return false;
        }
        SellerOnlineStatus sellerOnlineStatus = (SellerOnlineStatus) other;
        return this.isOnline == sellerOnlineStatus.isOnline && L.f(this.replySpeed, sellerOnlineStatus.replySpeed);
    }

    @l
    public final String getReplySpeed() {
        return this.replySpeed;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isOnline) * 31;
        String str = this.replySpeed;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isOnline() {
        return this.isOnline;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SellerOnlineStatus(isOnline=");
        sb2.append(this.isOnline);
        sb2.append(", replySpeed=");
        return C22026a.c(sb2, this.replySpeed, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.isOnline ? 1 : 0);
        parcel.writeString(this.replySpeed);
    }

    public /* synthetic */ SellerOnlineStatus(boolean z12, String str, int i12, C42822w c42822w) {
        this(z12, (i12 & 2) != 0 ? null : str);
    }
}
