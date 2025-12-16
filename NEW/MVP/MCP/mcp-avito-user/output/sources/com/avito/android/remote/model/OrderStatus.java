package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: OrderStatus.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/remote/model/OrderStatus;", "Landroid/os/Parcelable;", "isDone", "", "orderMessage", "Lcom/avito/android/remote/model/OrderMessage;", "(ZLcom/avito/android/remote/model/OrderMessage;)V", "()Z", "getOrderMessage", "()Lcom/avito/android/remote/model/OrderMessage;", "Done", "Success", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class OrderStatus implements Parcelable {
    private final boolean isDone;

    @l
    private final OrderMessage orderMessage;

    /* compiled from: OrderStatus.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/OrderStatus$Done;", "Lcom/avito/android/remote/model/OrderStatus;", "", "isDone", "Lcom/avito/android/remote/model/OrderMessage;", "orderMessage", "<init>", "(ZLcom/avito/android/remote/model/OrderMessage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "Lcom/avito/android/remote/model/OrderMessage;", "getOrderMessage", "()Lcom/avito/android/remote/model/OrderMessage;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Done extends OrderStatus {

        @k
        public static final Parcelable.Creator<Done> CREATOR = new Creator();
        private final boolean isDone;

        @l
        private final OrderMessage orderMessage;

        /* compiled from: OrderStatus.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Done> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Done createFromParcel(@k Parcel parcel) {
                return new Done(parcel.readInt() != 0, parcel.readInt() == 0 ? null : OrderMessage.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Done[] newArray(int i12) {
                return new Done[i12];
            }
        }

        public Done(boolean z12, @l OrderMessage orderMessage) {
            super(z12, orderMessage);
            this.isDone = z12;
            this.orderMessage = orderMessage;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.OrderStatus
        @l
        public OrderMessage getOrderMessage() {
            return this.orderMessage;
        }

        @Override // com.avito.android.remote.model.OrderStatus
        /* renamed from: isDone, reason: from getter */
        public boolean getIsDone() {
            return this.isDone;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.isDone ? 1 : 0);
            OrderMessage orderMessage = this.orderMessage;
            if (orderMessage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                orderMessage.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: OrderStatus.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/remote/model/OrderStatus$Success;", "Lcom/avito/android/remote/model/OrderStatus;", "", "isDone", "Lcom/avito/android/remote/model/OrderMessage;", "orderMessage", "<init>", "(ZLcom/avito/android/remote/model/OrderMessage;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Z", "Lcom/avito/android/remote/model/OrderMessage;", "getOrderMessage", "()Lcom/avito/android/remote/model/OrderMessage;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Success extends OrderStatus {

        @k
        public static final Parcelable.Creator<Success> CREATOR = new Creator();

        @c("success")
        private final boolean isDone;

        @c("message")
        @l
        private final OrderMessage orderMessage;

        /* compiled from: OrderStatus.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Success createFromParcel(@k Parcel parcel) {
                return new Success(parcel.readInt() != 0, parcel.readInt() == 0 ? null : OrderMessage.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Success[] newArray(int i12) {
                return new Success[i12];
            }
        }

        public Success(boolean z12, @l OrderMessage orderMessage) {
            super(z12, orderMessage);
            this.isDone = z12;
            this.orderMessage = orderMessage;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.remote.model.OrderStatus
        @l
        public OrderMessage getOrderMessage() {
            return this.orderMessage;
        }

        @Override // com.avito.android.remote.model.OrderStatus
        /* renamed from: isDone, reason: from getter */
        public boolean getIsDone() {
            return this.isDone;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.isDone ? 1 : 0);
            OrderMessage orderMessage = this.orderMessage;
            if (orderMessage == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                orderMessage.writeToParcel(parcel, flags);
            }
        }
    }

    public OrderStatus(boolean z12, @l OrderMessage orderMessage) {
        this.isDone = z12;
        this.orderMessage = orderMessage;
    }

    @l
    public OrderMessage getOrderMessage() {
        return this.orderMessage;
    }

    /* renamed from: isDone, reason: from getter */
    public boolean getIsDone() {
        return this.isDone;
    }
}
