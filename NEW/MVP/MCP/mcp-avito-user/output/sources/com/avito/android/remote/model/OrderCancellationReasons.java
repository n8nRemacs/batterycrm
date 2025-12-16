package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.component.accordion.s;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderCancelationReasons.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ:\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b!\u0010\"R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u000f¨\u0006)"}, d2 = {"Lcom/avito/android/remote/model/OrderCancellationReasons;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/ReasonRds;", "reasons", "otherReason", "", "commentMaxLength", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/ReasonRds;Ljava/lang/Integer;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/ReasonRds;", "component3", "()Ljava/lang/Integer;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/ReasonRds;Ljava/lang/Integer;)Lcom/avito/android/remote/model/OrderCancellationReasons;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getReasons", "Lcom/avito/android/remote/model/ReasonRds;", "getOtherReason", "Ljava/lang/Integer;", "getCommentMaxLength", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class OrderCancellationReasons implements Parcelable {

    @k
    public static final Parcelable.Creator<OrderCancellationReasons> CREATOR = new Creator();

    @c("commentMaxLength")
    @l
    private final Integer commentMaxLength;

    @c("otherReason")
    @l
    private final ReasonRds otherReason;

    @c("reasons")
    @l
    private final List<ReasonRds> reasons;

    /* compiled from: OrderCancelationReasons.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OrderCancellationReasons> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OrderCancellationReasons createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(ReasonRds.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new OrderCancellationReasons(arrayList, parcel.readInt() == 0 ? null : ReasonRds.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final OrderCancellationReasons[] newArray(int i12) {
            return new OrderCancellationReasons[i12];
        }
    }

    public OrderCancellationReasons(@l List<ReasonRds> list, @l ReasonRds reasonRds, @l Integer num) {
        this.reasons = list;
        this.otherReason = reasonRds;
        this.commentMaxLength = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderCancellationReasons copy$default(OrderCancellationReasons orderCancellationReasons, List list, ReasonRds reasonRds, Integer num, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = orderCancellationReasons.reasons;
        }
        if ((i12 & 2) != 0) {
            reasonRds = orderCancellationReasons.otherReason;
        }
        if ((i12 & 4) != 0) {
            num = orderCancellationReasons.commentMaxLength;
        }
        return orderCancellationReasons.copy(list, reasonRds, num);
    }

    @l
    public final List<ReasonRds> component1() {
        return this.reasons;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ReasonRds getOtherReason() {
        return this.otherReason;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getCommentMaxLength() {
        return this.commentMaxLength;
    }

    @k
    public final OrderCancellationReasons copy(@l List<ReasonRds> reasons, @l ReasonRds otherReason, @l Integer commentMaxLength) {
        return new OrderCancellationReasons(reasons, otherReason, commentMaxLength);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderCancellationReasons)) {
            return false;
        }
        OrderCancellationReasons orderCancellationReasons = (OrderCancellationReasons) other;
        return L.f(this.reasons, orderCancellationReasons.reasons) && L.f(this.otherReason, orderCancellationReasons.otherReason) && L.f(this.commentMaxLength, orderCancellationReasons.commentMaxLength);
    }

    @l
    public final Integer getCommentMaxLength() {
        return this.commentMaxLength;
    }

    @l
    public final ReasonRds getOtherReason() {
        return this.otherReason;
    }

    @l
    public final List<ReasonRds> getReasons() {
        return this.reasons;
    }

    public int hashCode() {
        List<ReasonRds> list = this.reasons;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        ReasonRds reasonRds = this.otherReason;
        int iHashCode2 = (iHashCode + (reasonRds == null ? 0 : reasonRds.hashCode())) * 31;
        Integer num = this.commentMaxLength;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OrderCancellationReasons(reasons=");
        sb2.append(this.reasons);
        sb2.append(", otherReason=");
        sb2.append(this.otherReason);
        sb2.append(", commentMaxLength=");
        return s.j(sb2, this.commentMaxLength, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        List<ReasonRds> list = this.reasons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((ReasonRds) itA.next()).writeToParcel(parcel, flags);
            }
        }
        ReasonRds reasonRds = this.otherReason;
        if (reasonRds == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            reasonRds.writeToParcel(parcel, flags);
        }
        Integer num = this.commentMaxLength;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
    }
}
