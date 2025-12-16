package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrUxFeedbackInfoResponse.kt */
@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u000f¨\u0006'"}, d2 = {"Lcom/avito/android/remote/model/StrUxFeedbackInfoResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/StrUxFeedbackItem;", "item", "", "trxItemsCount", "", "userIdHash", "<init>", "(Lcom/avito/android/remote/model/StrUxFeedbackItem;Ljava/lang/Integer;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/StrUxFeedbackItem;", "component2", "()Ljava/lang/Integer;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/StrUxFeedbackItem;Ljava/lang/Integer;Ljava/lang/String;)Lcom/avito/android/remote/model/StrUxFeedbackInfoResponse;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/StrUxFeedbackItem;", "getItem", "Ljava/lang/Integer;", "getTrxItemsCount", "Ljava/lang/String;", "getUserIdHash", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrUxFeedbackInfoResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<StrUxFeedbackInfoResponse> CREATOR = new Creator();

    @c("item")
    @l
    private final StrUxFeedbackItem item;

    @c("trxItemsCount")
    @l
    private final Integer trxItemsCount;

    @c("userIdHash")
    @l
    private final String userIdHash;

    /* compiled from: StrUxFeedbackInfoResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrUxFeedbackInfoResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrUxFeedbackInfoResponse createFromParcel(@k Parcel parcel) {
            return new StrUxFeedbackInfoResponse(parcel.readInt() == 0 ? null : StrUxFeedbackItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrUxFeedbackInfoResponse[] newArray(int i12) {
            return new StrUxFeedbackInfoResponse[i12];
        }
    }

    public StrUxFeedbackInfoResponse(@l StrUxFeedbackItem strUxFeedbackItem, @l Integer num, @l String str) {
        this.item = strUxFeedbackItem;
        this.trxItemsCount = num;
        this.userIdHash = str;
    }

    public static /* synthetic */ StrUxFeedbackInfoResponse copy$default(StrUxFeedbackInfoResponse strUxFeedbackInfoResponse, StrUxFeedbackItem strUxFeedbackItem, Integer num, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            strUxFeedbackItem = strUxFeedbackInfoResponse.item;
        }
        if ((i12 & 2) != 0) {
            num = strUxFeedbackInfoResponse.trxItemsCount;
        }
        if ((i12 & 4) != 0) {
            str = strUxFeedbackInfoResponse.userIdHash;
        }
        return strUxFeedbackInfoResponse.copy(strUxFeedbackItem, num, str);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final StrUxFeedbackItem getItem() {
        return this.item;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Integer getTrxItemsCount() {
        return this.trxItemsCount;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getUserIdHash() {
        return this.userIdHash;
    }

    @k
    public final StrUxFeedbackInfoResponse copy(@l StrUxFeedbackItem item, @l Integer trxItemsCount, @l String userIdHash) {
        return new StrUxFeedbackInfoResponse(item, trxItemsCount, userIdHash);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrUxFeedbackInfoResponse)) {
            return false;
        }
        StrUxFeedbackInfoResponse strUxFeedbackInfoResponse = (StrUxFeedbackInfoResponse) other;
        return L.f(this.item, strUxFeedbackInfoResponse.item) && L.f(this.trxItemsCount, strUxFeedbackInfoResponse.trxItemsCount) && L.f(this.userIdHash, strUxFeedbackInfoResponse.userIdHash);
    }

    @l
    public final StrUxFeedbackItem getItem() {
        return this.item;
    }

    @l
    public final Integer getTrxItemsCount() {
        return this.trxItemsCount;
    }

    @l
    public final String getUserIdHash() {
        return this.userIdHash;
    }

    public int hashCode() {
        StrUxFeedbackItem strUxFeedbackItem = this.item;
        int iHashCode = (strUxFeedbackItem == null ? 0 : strUxFeedbackItem.hashCode()) * 31;
        Integer num = this.trxItemsCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.userIdHash;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrUxFeedbackInfoResponse(item=");
        sb2.append(this.item);
        sb2.append(", trxItemsCount=");
        sb2.append(this.trxItemsCount);
        sb2.append(", userIdHash=");
        return C22026a.c(sb2, this.userIdHash, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        StrUxFeedbackItem strUxFeedbackItem = this.item;
        if (strUxFeedbackItem == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strUxFeedbackItem.writeToParcel(parcel, flags);
        }
        Integer num = this.trxItemsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.userIdHash);
    }
}
