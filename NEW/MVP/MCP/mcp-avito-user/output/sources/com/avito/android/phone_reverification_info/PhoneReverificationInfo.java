package com.avito.android.phone_reverification_info;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhoneReverificationInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/phone_reverification_info/PhoneReverificationInfo;", "Landroid/os/Parcelable;", "<init>", "()V", "Allow", "Disallow", "Lcom/avito/android/phone_reverification_info/PhoneReverificationInfo$Allow;", "Lcom/avito/android/phone_reverification_info/PhoneReverificationInfo$Disallow;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class PhoneReverificationInfo implements Parcelable {

    /* compiled from: PhoneReverificationInfo.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_reverification_info/PhoneReverificationInfo$Allow;", "Lcom/avito/android/phone_reverification_info/PhoneReverificationInfo;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Allow extends PhoneReverificationInfo {

        @Y61.k
        public static final Parcelable.Creator<Allow> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f216034b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f216035c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f216036d;

        /* compiled from: PhoneReverificationInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Allow> {
            @Override // android.os.Parcelable.Creator
            public final Allow createFromParcel(Parcel parcel) {
                return new Allow(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Allow[] newArray(int i12) {
                return new Allow[i12];
            }
        }

        public Allow(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
            super(null);
            this.f216034b = str;
            this.f216035c = str2;
            this.f216036d = str3;
        }

        @Override // com.avito.android.phone_reverification_info.PhoneReverificationInfo
        public final boolean c() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f216034b);
            parcel.writeString(this.f216035c);
            parcel.writeString(this.f216036d);
        }
    }

    /* compiled from: PhoneReverificationInfo.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/phone_reverification_info/PhoneReverificationInfo$Disallow;", "Lcom/avito/android/phone_reverification_info/PhoneReverificationInfo;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Disallow extends PhoneReverificationInfo {

        @Y61.k
        public static final Parcelable.Creator<Disallow> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f216037b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f216038c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f216039d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f216040e;

        /* compiled from: PhoneReverificationInfo.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Disallow> {
            @Override // android.os.Parcelable.Creator
            public final Disallow createFromParcel(Parcel parcel) {
                return new Disallow(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Disallow[] newArray(int i12) {
                return new Disallow[i12];
            }
        }

        public Disallow(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k String str4) {
            super(null);
            this.f216037b = str;
            this.f216038c = str2;
            this.f216039d = str3;
            this.f216040e = str4;
        }

        @Override // com.avito.android.phone_reverification_info.PhoneReverificationInfo
        public final boolean c() {
            return false;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f216037b);
            parcel.writeString(this.f216038c);
            parcel.writeString(this.f216039d);
            parcel.writeString(this.f216040e);
        }
    }

    public /* synthetic */ PhoneReverificationInfo(C42822w c42822w) {
        this();
    }

    public abstract boolean c();

    public PhoneReverificationInfo() {
    }
}
