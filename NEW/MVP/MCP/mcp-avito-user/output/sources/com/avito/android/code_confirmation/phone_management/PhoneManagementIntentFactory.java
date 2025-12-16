package com.avito.android.code_confirmation.phone_management;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: PhoneManagementIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_confirmation/phone_management/PhoneManagementIntentFactory;", "", "CallSource", "_avito_code-confirmation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PhoneManagementIntentFactory {

    /* compiled from: PhoneManagementIntentFactory.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/code_confirmation/phone_management/PhoneManagementIntentFactory$CallSource;", "Landroid/os/Parcelable;", "Deeplink", "Messenger", "Lcom/avito/android/code_confirmation/phone_management/PhoneManagementIntentFactory$CallSource$Deeplink;", "Lcom/avito/android/code_confirmation/phone_management/PhoneManagementIntentFactory$CallSource$Messenger;", "_avito_code-confirmation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface CallSource extends Parcelable {

        /* compiled from: PhoneManagementIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_confirmation/phone_management/PhoneManagementIntentFactory$CallSource$Deeplink;", "Lcom/avito/android/code_confirmation/phone_management/PhoneManagementIntentFactory$CallSource;", "<init>", "()V", "_avito_code-confirmation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Deeplink implements CallSource {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Deeplink f119664b = new Deeplink();

            @Y61.k
            public static final Parcelable.Creator<Deeplink> CREATOR = new a();

            /* compiled from: PhoneManagementIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Deeplink> {
                @Override // android.os.Parcelable.Creator
                public final Deeplink createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Deeplink.f119664b;
                }

                @Override // android.os.Parcelable.Creator
                public final Deeplink[] newArray(int i12) {
                    return new Deeplink[i12];
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

        /* compiled from: PhoneManagementIntentFactory.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/code_confirmation/phone_management/PhoneManagementIntentFactory$CallSource$Messenger;", "Lcom/avito/android/code_confirmation/phone_management/PhoneManagementIntentFactory$CallSource;", "<init>", "()V", "_avito_code-confirmation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Messenger implements CallSource {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final Messenger f119665b = new Messenger();

            @Y61.k
            public static final Parcelable.Creator<Messenger> CREATOR = new a();

            /* compiled from: PhoneManagementIntentFactory.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Messenger> {
                @Override // android.os.Parcelable.Creator
                public final Messenger createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Messenger.f119665b;
                }

                @Override // android.os.Parcelable.Creator
                public final Messenger[] newArray(int i12) {
                    return new Messenger[i12];
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

    @Y61.k
    Intent a(@Y61.k String str);

    @Y61.k
    Intent b(@Y61.k CallSource.Messenger messenger);
}
