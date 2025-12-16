package com.avito.android.autoteka.deeplinks;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaChoosingPurchaseLink.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/autoteka/deeplinks/ChoosingPurchaseDetails;", "Landroid/os/Parcelable;", "", "searchKey", "autotekaX", "", "fromBlock", "actionType", "", "isRepurchase", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Z)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "c", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "getActionType", "Z", "f", "()Z", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ChoosingPurchaseDetails implements Parcelable {

    @k
    public static final Parcelable.Creator<ChoosingPurchaseDetails> CREATOR = new a();

    @c("actionType")
    @l
    private final String actionType;

    @c("autotekaX")
    @k
    private final String autotekaX;

    @c("fromBlock")
    @l
    private final Long fromBlock;

    @c("isRepurchase")
    private final boolean isRepurchase;

    @c("searchKey")
    @l
    private final String searchKey;

    /* compiled from: AutotekaChoosingPurchaseLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChoosingPurchaseDetails> {
        @Override // android.os.Parcelable.Creator
        public final ChoosingPurchaseDetails createFromParcel(Parcel parcel) {
            return new ChoosingPurchaseDetails(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ChoosingPurchaseDetails[] newArray(int i12) {
            return new ChoosingPurchaseDetails[i12];
        }
    }

    public ChoosingPurchaseDetails(@l String str, @k String str2, @l Long l12, @l String str3, boolean z12) {
        this.searchKey = str;
        this.autotekaX = str2;
        this.fromBlock = l12;
        this.actionType = str3;
        this.isRepurchase = z12;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAutotekaX() {
        return this.autotekaX;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getFromBlock() {
        return this.fromBlock;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getSearchKey() {
        return this.searchKey;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChoosingPurchaseDetails)) {
            return false;
        }
        ChoosingPurchaseDetails choosingPurchaseDetails = (ChoosingPurchaseDetails) obj;
        return L.f(this.searchKey, choosingPurchaseDetails.searchKey) && L.f(this.autotekaX, choosingPurchaseDetails.autotekaX) && L.f(this.fromBlock, choosingPurchaseDetails.fromBlock) && L.f(this.actionType, choosingPurchaseDetails.actionType) && this.isRepurchase == choosingPurchaseDetails.isRepurchase;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsRepurchase() {
        return this.isRepurchase;
    }

    public final int hashCode() {
        String str = this.searchKey;
        int iD2 = H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.autotekaX);
        Long l12 = this.fromBlock;
        int iHashCode = (iD2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.actionType;
        return Boolean.hashCode(this.isRepurchase) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChoosingPurchaseDetails(searchKey=");
        sb2.append(this.searchKey);
        sb2.append(", autotekaX=");
        sb2.append(this.autotekaX);
        sb2.append(", fromBlock=");
        sb2.append(this.fromBlock);
        sb2.append(", actionType=");
        sb2.append(this.actionType);
        sb2.append(", isRepurchase=");
        return r.x(sb2, this.isRepurchase, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.searchKey);
        parcel.writeString(this.autotekaX);
        Long l12 = this.fromBlock;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.actionType);
        parcel.writeInt(this.isRepurchase ? 1 : 0);
    }
}
