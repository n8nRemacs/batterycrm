package com.avito.android.user_advert.advert.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserAdvertService.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/user_advert/advert/service/UserAdvertServiceAction;", "Landroid/os/Parcelable;", "()V", "Activate", "AutoPublish", "Close", "Lcom/avito/android/user_advert/advert/service/UserAdvertServiceAction$Activate;", "Lcom/avito/android/user_advert/advert/service/UserAdvertServiceAction$AutoPublish;", "Lcom/avito/android/user_advert/advert/service/UserAdvertServiceAction$Close;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class UserAdvertServiceAction implements Parcelable {

    /* compiled from: UserAdvertService.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/service/UserAdvertServiceAction$Activate;", "Lcom/avito/android/user_advert/advert/service/UserAdvertServiceAction;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Activate extends UserAdvertServiceAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Activate f310619b = new Activate();

        @Y61.k
        public static final Parcelable.Creator<Activate> CREATOR = new a();

        /* compiled from: UserAdvertService.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Activate> {
            @Override // android.os.Parcelable.Creator
            public final Activate createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Activate.f310619b;
            }

            @Override // android.os.Parcelable.Creator
            public final Activate[] newArray(int i12) {
                return new Activate[i12];
            }
        }

        public Activate() {
            super(null);
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

    /* compiled from: UserAdvertService.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/service/UserAdvertServiceAction$AutoPublish;", "Lcom/avito/android/user_advert/advert/service/UserAdvertServiceAction;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AutoPublish extends UserAdvertServiceAction {

        @Y61.k
        public static final Parcelable.Creator<AutoPublish> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f310620b;

        /* compiled from: UserAdvertService.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AutoPublish> {
            @Override // android.os.Parcelable.Creator
            public final AutoPublish createFromParcel(Parcel parcel) {
                return new AutoPublish(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final AutoPublish[] newArray(int i12) {
                return new AutoPublish[i12];
            }
        }

        public AutoPublish(boolean z12) {
            super(null);
            this.f310620b = z12;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f310620b ? 1 : 0);
        }
    }

    /* compiled from: UserAdvertService.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/service/UserAdvertServiceAction$Close;", "Lcom/avito/android/user_advert/advert/service/UserAdvertServiceAction;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Close extends UserAdvertServiceAction {

        @Y61.k
        public static final Parcelable.Creator<Close> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f310621b;

        /* compiled from: UserAdvertService.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Close> {
            @Override // android.os.Parcelable.Creator
            public final Close createFromParcel(Parcel parcel) {
                return new Close(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Close[] newArray(int i12) {
                return new Close[i12];
            }
        }

        public Close(@Y61.k String str) {
            super(null);
            this.f310621b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f310621b);
        }
    }

    public /* synthetic */ UserAdvertServiceAction(C42822w c42822w) {
        this();
    }

    public UserAdvertServiceAction() {
    }
}
