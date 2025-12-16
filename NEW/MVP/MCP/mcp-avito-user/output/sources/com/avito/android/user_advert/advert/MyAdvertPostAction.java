package com.avito.android.user_advert.advert;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: MyAdvertPostAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/user_advert/advert/MyAdvertPostAction;", "Landroid/os/Parcelable;", "Activate", "Allow", "None", "Reserve", "Restore", "Lcom/avito/android/user_advert/advert/MyAdvertPostAction$Activate;", "Lcom/avito/android/user_advert/advert/MyAdvertPostAction$Allow;", "Lcom/avito/android/user_advert/advert/MyAdvertPostAction$None;", "Lcom/avito/android/user_advert/advert/MyAdvertPostAction$Reserve;", "Lcom/avito/android/user_advert/advert/MyAdvertPostAction$Restore;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MyAdvertPostAction extends Parcelable {

    /* compiled from: MyAdvertPostAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/MyAdvertPostAction$Activate;", "Lcom/avito/android/user_advert/advert/MyAdvertPostAction;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Activate implements MyAdvertPostAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Activate f308366b = new Activate();

        @Y61.k
        public static final Parcelable.Creator<Activate> CREATOR = new a();

        /* compiled from: MyAdvertPostAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Activate> {
            @Override // android.os.Parcelable.Creator
            public final Activate createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Activate.f308366b;
            }

            @Override // android.os.Parcelable.Creator
            public final Activate[] newArray(int i12) {
                return new Activate[i12];
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

    /* compiled from: MyAdvertPostAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/MyAdvertPostAction$Allow;", "Lcom/avito/android/user_advert/advert/MyAdvertPostAction;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Allow implements MyAdvertPostAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Allow f308367b = new Allow();

        @Y61.k
        public static final Parcelable.Creator<Allow> CREATOR = new a();

        /* compiled from: MyAdvertPostAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Allow> {
            @Override // android.os.Parcelable.Creator
            public final Allow createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Allow.f308367b;
            }

            @Override // android.os.Parcelable.Creator
            public final Allow[] newArray(int i12) {
                return new Allow[i12];
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

    /* compiled from: MyAdvertPostAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/MyAdvertPostAction$None;", "Lcom/avito/android/user_advert/advert/MyAdvertPostAction;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class None implements MyAdvertPostAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final None f308368b = new None();

        @Y61.k
        public static final Parcelable.Creator<None> CREATOR = new a();

        /* compiled from: MyAdvertPostAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<None> {
            @Override // android.os.Parcelable.Creator
            public final None createFromParcel(Parcel parcel) {
                parcel.readInt();
                return None.f308368b;
            }

            @Override // android.os.Parcelable.Creator
            public final None[] newArray(int i12) {
                return new None[i12];
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

    /* compiled from: MyAdvertPostAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/MyAdvertPostAction$Reserve;", "Lcom/avito/android/user_advert/advert/MyAdvertPostAction;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Reserve implements MyAdvertPostAction {

        @Y61.k
        public static final Parcelable.Creator<Reserve> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f308369b;

        /* compiled from: MyAdvertPostAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Reserve> {
            @Override // android.os.Parcelable.Creator
            public final Reserve createFromParcel(Parcel parcel) {
                return new Reserve(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Reserve[] newArray(int i12) {
                return new Reserve[i12];
            }
        }

        public Reserve(@Y61.k String str) {
            this.f308369b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Reserve) && kotlin.jvm.internal.L.f(this.f308369b, ((Reserve) obj).f308369b);
        }

        public final int hashCode() {
            return this.f308369b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Reserve(status="), this.f308369b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f308369b);
        }
    }

    /* compiled from: MyAdvertPostAction.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/MyAdvertPostAction$Restore;", "Lcom/avito/android/user_advert/advert/MyAdvertPostAction;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Restore implements MyAdvertPostAction {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Restore f308370b = new Restore();

        @Y61.k
        public static final Parcelable.Creator<Restore> CREATOR = new a();

        /* compiled from: MyAdvertPostAction.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Restore> {
            @Override // android.os.Parcelable.Creator
            public final Restore createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Restore.f308370b;
            }

            @Override // android.os.Parcelable.Creator
            public final Restore[] newArray(int i12) {
                return new Restore[i12];
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
