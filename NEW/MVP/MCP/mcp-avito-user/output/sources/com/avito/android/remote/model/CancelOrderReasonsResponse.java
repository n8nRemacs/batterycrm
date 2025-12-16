package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CancelOrderReasonsResponse.kt */
@d
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/avito/android/remote/model/CancelOrderReasonsResponse;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/Reason;", "reasons", "otherReason", "", "commentMaxLength", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/Reason;Ljava/lang/Integer;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getReasons", "()Ljava/util/List;", "Lcom/avito/android/remote/model/Reason;", "getOtherReason", "()Lcom/avito/android/remote/model/Reason;", "Ljava/lang/Integer;", "getCommentMaxLength", "()Ljava/lang/Integer;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CancelOrderReasonsResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<CancelOrderReasonsResponse> CREATOR = new Creator();

    @c("commentMaxLength")
    @l
    private final Integer commentMaxLength;

    @c("otherReason")
    @l
    private final Reason otherReason;

    @c("reasons")
    @l
    private final List<Reason> reasons;

    /* compiled from: CancelOrderReasonsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<CancelOrderReasonsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CancelOrderReasonsResponse createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Reason.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new CancelOrderReasonsResponse(arrayList, parcel.readInt() == 0 ? null : Reason.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final CancelOrderReasonsResponse[] newArray(int i12) {
            return new CancelOrderReasonsResponse[i12];
        }
    }

    public CancelOrderReasonsResponse(@l List<Reason> list, @l Reason reason, @l Integer num) {
        this.reasons = list;
        this.otherReason = reason;
        this.commentMaxLength = num;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Integer getCommentMaxLength() {
        return this.commentMaxLength;
    }

    @l
    public final Reason getOtherReason() {
        return this.otherReason;
    }

    @l
    public final List<Reason> getReasons() {
        return this.reasons;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<Reason> list = this.reasons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Reason) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Reason reason = this.otherReason;
        if (reason == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reason.writeToParcel(parcel, flags);
        }
        Integer num = this.commentMaxLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
    }
}
