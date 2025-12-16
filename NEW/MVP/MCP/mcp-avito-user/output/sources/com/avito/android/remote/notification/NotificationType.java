package com.avito.android.remote.notification;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: NotificationType.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/notification/NotificationType;", "Landroid/os/Parcelable;", "MissedCall", "NewMessage", "Other", "Lcom/avito/android/remote/notification/NotificationType$MissedCall;", "Lcom/avito/android/remote/notification/NotificationType$NewMessage;", "Lcom/avito/android/remote/notification/NotificationType$Other;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface NotificationType extends Parcelable {

    /* compiled from: NotificationType.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/notification/NotificationType$MissedCall;", "Lcom/avito/android/remote/notification/NotificationType;", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MissedCall implements NotificationType {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final MissedCall f253969b = new MissedCall();

        @Y61.k
        public static final Parcelable.Creator<MissedCall> CREATOR = new a();

        /* compiled from: NotificationType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MissedCall> {
            @Override // android.os.Parcelable.Creator
            public final MissedCall createFromParcel(Parcel parcel) {
                parcel.readInt();
                return MissedCall.f253969b;
            }

            @Override // android.os.Parcelable.Creator
            public final MissedCall[] newArray(int i12) {
                return new MissedCall[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NotificationType.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/notification/NotificationType$NewMessage;", "Lcom/avito/android/remote/notification/NotificationType;", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NewMessage implements NotificationType {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final NewMessage f253970b = new NewMessage();

        @Y61.k
        public static final Parcelable.Creator<NewMessage> CREATOR = new a();

        /* compiled from: NotificationType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NewMessage> {
            @Override // android.os.Parcelable.Creator
            public final NewMessage createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NewMessage.f253970b;
            }

            @Override // android.os.Parcelable.Creator
            public final NewMessage[] newArray(int i12) {
                return new NewMessage[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: NotificationType.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/notification/NotificationType$Other;", "Lcom/avito/android/remote/notification/NotificationType;", "<init>", "()V", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Other implements NotificationType {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Other f253971b = new Other();

        @Y61.k
        public static final Parcelable.Creator<Other> CREATOR = new a();

        /* compiled from: NotificationType.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Other> {
            @Override // android.os.Parcelable.Creator
            public final Other createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Other.f253971b;
            }

            @Override // android.os.Parcelable.Creator
            public final Other[] newArray(int i12) {
                return new Other[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }
}
