package com.avito.android.async_phone.public_module.phone_request_link;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData;", "Landroid/os/Parcelable;", "<init>", "()V", "Advert", "a", "Comparison", "Default", "ExtendedProfile", "Favorites", "IacGsmFallback", "MyApplies", "ResidentialComplex", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$Advert;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$Comparison;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$Default;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$ExtendedProfile;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$Favorites;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$IacGsmFallback;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$MyApplies;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$ResidentialComplex;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class PhoneRequestDeepLinkAnalyticsData implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f92253b = new a(null);

    /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$Advert;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Advert extends PhoneRequestDeepLinkAnalyticsData {

        @k
        public static final Parcelable.Creator<Advert> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f92254c;

        /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Advert> {
            @Override // android.os.Parcelable.Creator
            public final Advert createFromParcel(Parcel parcel) {
                return new Advert(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Advert[] newArray(int i12) {
                return new Advert[i12];
            }
        }

        public Advert(@k String str) {
            super(null);
            this.f92254c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f92254c);
        }
    }

    /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$Default;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default extends PhoneRequestDeepLinkAnalyticsData {

        @k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f92259c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f92260d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f92261e;

        /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                return new Default(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        public Default(@k String str, @l String str2, @l String str3) {
            super(null);
            this.f92259c = str;
            this.f92260d = str2;
            this.f92261e = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f92259c);
            parcel.writeString(this.f92260d);
            parcel.writeString(this.f92261e);
        }
    }

    /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$ExtendedProfile;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ExtendedProfile extends PhoneRequestDeepLinkAnalyticsData {

        @k
        public static final Parcelable.Creator<ExtendedProfile> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f92262c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f92263d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f92264e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f92265f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f92266g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Integer f92267h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final String f92268i;

        /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ExtendedProfile> {
            @Override // android.os.Parcelable.Creator
            public final ExtendedProfile createFromParcel(Parcel parcel) {
                return new ExtendedProfile(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ExtendedProfile[] newArray(int i12) {
                return new ExtendedProfile[i12];
            }
        }

        public /* synthetic */ ExtendedProfile(String str, String str2, String str3, String str4, String str5, Integer num, String str6, int i12, C42822w c42822w) {
            this(num, str, str2, str3, str4, str5, (i12 & 64) != 0 ? null : str6);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f92262c);
            parcel.writeString(this.f92263d);
            parcel.writeString(this.f92264e);
            parcel.writeString(this.f92265f);
            parcel.writeString(this.f92266g);
            Integer num = this.f92267h;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                com.avito.android.actions_sheet.a.C(parcel, 1, num);
            }
            parcel.writeString(this.f92268i);
        }

        public ExtendedProfile(@l Integer num, @k String str, @k String str2, @l String str3, @l String str4, @l String str5, @l String str6) {
            super(null);
            this.f92262c = str;
            this.f92263d = str2;
            this.f92264e = str3;
            this.f92265f = str4;
            this.f92266g = str5;
            this.f92267h = num;
            this.f92268i = str6;
        }
    }

    /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$Favorites;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Favorites extends PhoneRequestDeepLinkAnalyticsData {

        @k
        public static final Parcelable.Creator<Favorites> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f92269c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f92270d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f92271e;

        /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Favorites> {
            @Override // android.os.Parcelable.Creator
            public final Favorites createFromParcel(Parcel parcel) {
                return new Favorites(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Favorites[] newArray(int i12) {
                return new Favorites[i12];
            }
        }

        public Favorites(@k String str, @l String str2, @l String str3) {
            super(null);
            this.f92269c = str;
            this.f92270d = str2;
            this.f92271e = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f92269c);
            parcel.writeString(this.f92270d);
            parcel.writeString(this.f92271e);
        }
    }

    /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$IacGsmFallback;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IacGsmFallback extends PhoneRequestDeepLinkAnalyticsData {

        @k
        public static final Parcelable.Creator<IacGsmFallback> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f92272c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f92273d;

        /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<IacGsmFallback> {
            @Override // android.os.Parcelable.Creator
            public final IacGsmFallback createFromParcel(Parcel parcel) {
                return new IacGsmFallback(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IacGsmFallback[] newArray(int i12) {
                return new IacGsmFallback[i12];
            }
        }

        public IacGsmFallback(@k String str, @l String str2) {
            super(null);
            this.f92272c = str;
            this.f92273d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f92272c);
            parcel.writeString(this.f92273d);
        }
    }

    /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$MyApplies;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MyApplies extends PhoneRequestDeepLinkAnalyticsData {

        @k
        public static final Parcelable.Creator<MyApplies> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f92274c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f92275d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f92276e;

        /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MyApplies> {
            @Override // android.os.Parcelable.Creator
            public final MyApplies createFromParcel(Parcel parcel) {
                return new MyApplies(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MyApplies[] newArray(int i12) {
                return new MyApplies[i12];
            }
        }

        public MyApplies(@k String str, @l String str2, @l String str3) {
            super(null);
            this.f92274c = str;
            this.f92275d = str2;
            this.f92276e = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f92274c);
            parcel.writeString(this.f92275d);
            parcel.writeString(this.f92276e);
        }
    }

    /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$ResidentialComplex;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResidentialComplex extends PhoneRequestDeepLinkAnalyticsData {

        @k
        public static final Parcelable.Creator<ResidentialComplex> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f92277c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f92278d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final String f92279e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f92280f;

        /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ResidentialComplex> {
            @Override // android.os.Parcelable.Creator
            public final ResidentialComplex createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iD2 = 0;
                while (iD2 != i12) {
                    iD2 = com.avito.android.advert.item.delivery_suggests.l.d(parcel, arrayList, iD2, 1);
                }
                return new ResidentialComplex(string, parcel.readString(), parcel.readString(), arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final ResidentialComplex[] newArray(int i12) {
                return new ResidentialComplex[i12];
            }
        }

        public ResidentialComplex(@k String str, @l String str2, @l String str3, @k ArrayList arrayList) {
            super(null);
            this.f92277c = str;
            this.f92278d = arrayList;
            this.f92279e = str2;
            this.f92280f = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f92277c);
            Iterator itZ = com.avito.android.actions_sheet.a.z(this.f92278d, parcel);
            while (itZ.hasNext()) {
                parcel.writeInt(((Number) itZ.next()).intValue());
            }
            parcel.writeString(this.f92279e);
            parcel.writeString(this.f92280f);
        }
    }

    /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$a;", "", "<init>", "()V", "", "BUNDLE_KEY", "Ljava/lang/String;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static Bundle a(a aVar, PhoneRequestDeepLinkAnalyticsData phoneRequestDeepLinkAnalyticsData) {
            Bundle bundle = new Bundle();
            aVar.getClass();
            bundle.putParcelable("PhoneRequestAnalyticsData", phoneRequestDeepLinkAnalyticsData);
            return bundle;
        }

        public a() {
        }
    }

    public /* synthetic */ PhoneRequestDeepLinkAnalyticsData(C42822w c42822w) {
        this();
    }

    /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
    @d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData$Comparison;", "Lcom/avito/android/async_phone/public_module/phone_request_link/PhoneRequestDeepLinkAnalyticsData;", "_avito_async-phone_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Comparison extends PhoneRequestDeepLinkAnalyticsData {

        @k
        public static final Parcelable.Creator<Comparison> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f92255c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f92256d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final String f92257e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f92258f;

        /* compiled from: PhoneRequestDeepLinkAnalyticsData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Comparison> {
            @Override // android.os.Parcelable.Creator
            public final Comparison createFromParcel(Parcel parcel) {
                return new Comparison(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Comparison[] newArray(int i12) {
                return new Comparison[i12];
            }
        }

        public /* synthetic */ Comparison(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
            this(str, str2, str3, (i12 & 8) != 0 ? "comparison" : str4);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f92255c);
            parcel.writeString(this.f92256d);
            parcel.writeString(this.f92257e);
            parcel.writeString(this.f92258f);
        }

        public Comparison(@k String str, @k String str2, @k String str3, @k String str4) {
            super(null);
            this.f92255c = str;
            this.f92256d = str2;
            this.f92257e = str3;
            this.f92258f = str4;
        }
    }

    public PhoneRequestDeepLinkAnalyticsData() {
    }
}
