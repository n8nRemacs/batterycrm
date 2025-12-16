package com.avito.android.publish.slots.contact_info;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.PeerConnectionFactory;

/* compiled from: ContactsData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/ContactsData;", "Landroid/os/Parcelable;", "AnonymousNumber", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ContactsData implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ContactsData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f243206b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f243207c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f243208d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f243209e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Image f243210f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f243211g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f243212h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f243213i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f243214j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final AddressParameter f243215k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f243216l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final AnonymousNumber f243217m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final SellerRating f243218n;

    /* compiled from: ContactsData.kt */
    @P
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/ContactsData$AnonymousNumber;", "Landroid/os/Parcelable;", "()V", "Empty", PeerConnectionFactory.TRIAL_ENABLED, "Lcom/avito/android/publish/slots/contact_info/ContactsData$AnonymousNumber$Empty;", "Lcom/avito/android/publish/slots/contact_info/ContactsData$AnonymousNumber$Enabled;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AnonymousNumber implements Parcelable {

        /* compiled from: ContactsData.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/ContactsData$AnonymousNumber$Empty;", "Lcom/avito/android/publish/slots/contact_info/ContactsData$AnonymousNumber;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Empty extends AnonymousNumber {

            @Y61.k
            public static final Parcelable.Creator<Empty> CREATOR = new a();

            /* compiled from: ContactsData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Empty> {
                @Override // android.os.Parcelable.Creator
                public final Empty createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return new Empty();
                }

                @Override // android.os.Parcelable.Creator
                public final Empty[] newArray(int i12) {
                    return new Empty[i12];
                }
            }

            public Empty() {
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

        /* compiled from: ContactsData.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/contact_info/ContactsData$AnonymousNumber$Enabled;", "Lcom/avito/android/publish/slots/contact_info/ContactsData$AnonymousNumber;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @K51.d
        public static final class Enabled extends AnonymousNumber {

            @Y61.k
            public static final Parcelable.Creator<Enabled> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final AttributedText f243219b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f243220c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f243221d;

            /* compiled from: ContactsData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Enabled> {
                @Override // android.os.Parcelable.Creator
                public final Enabled createFromParcel(Parcel parcel) {
                    return new Enabled((AttributedText) parcel.readParcelable(Enabled.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Enabled[] newArray(int i12) {
                    return new Enabled[i12];
                }
            }

            public Enabled(@Y61.k AttributedText attributedText, @Y61.k String str, boolean z12) {
                super(null);
                this.f243219b = attributedText;
                this.f243220c = str;
                this.f243221d = z12;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f243219b, i12);
                parcel.writeString(this.f243220c);
                parcel.writeInt(this.f243221d ? 1 : 0);
            }
        }

        public /* synthetic */ AnonymousNumber(C42822w c42822w) {
            this();
        }

        public AnonymousNumber() {
        }
    }

    /* compiled from: ContactsData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ContactsData> {
        @Override // android.os.Parcelable.Creator
        public final ContactsData createFromParcel(Parcel parcel) {
            return new ContactsData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Image) parcel.readParcelable(ContactsData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, (AddressParameter) parcel.readParcelable(ContactsData.class.getClassLoader()), parcel.readInt() != 0, (AnonymousNumber) parcel.readParcelable(ContactsData.class.getClassLoader()), (SellerRating) parcel.readParcelable(ContactsData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ContactsData[] newArray(int i12) {
            return new ContactsData[i12];
        }
    }

    public ContactsData() {
        this(null, null, null, null, null, false, false, false, false, null, false, null, null, 8191, null);
    }

    public static ContactsData a(ContactsData contactsData, String str, String str2, String str3, String str4, int i12) {
        String str5 = (i12 & 1) != 0 ? contactsData.f243206b : str;
        String str6 = (i12 & 2) != 0 ? contactsData.f243207c : str2;
        String str7 = (i12 & 4) != 0 ? contactsData.f243208d : str3;
        String str8 = (i12 & 8) != 0 ? contactsData.f243209e : str4;
        Image image = contactsData.f243210f;
        boolean z12 = contactsData.f243211g;
        boolean z13 = contactsData.f243212h;
        boolean z14 = contactsData.f243213i;
        boolean z15 = contactsData.f243214j;
        AddressParameter addressParameter = contactsData.f243215k;
        boolean z16 = contactsData.f243216l;
        AnonymousNumber anonymousNumber = contactsData.f243217m;
        SellerRating sellerRating = contactsData.f243218n;
        contactsData.getClass();
        return new ContactsData(str5, str6, str7, str8, image, z12, z13, z14, z15, addressParameter, z16, anonymousNumber, sellerRating);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactsData)) {
            return false;
        }
        ContactsData contactsData = (ContactsData) obj;
        return L.f(this.f243206b, contactsData.f243206b) && L.f(this.f243207c, contactsData.f243207c) && L.f(this.f243208d, contactsData.f243208d) && L.f(this.f243209e, contactsData.f243209e) && L.f(this.f243210f, contactsData.f243210f) && this.f243211g == contactsData.f243211g && this.f243212h == contactsData.f243212h && this.f243213i == contactsData.f243213i && this.f243214j == contactsData.f243214j && L.f(this.f243215k, contactsData.f243215k) && this.f243216l == contactsData.f243216l && L.f(this.f243217m, contactsData.f243217m) && L.f(this.f243218n, contactsData.f243218n);
    }

    public final int hashCode() {
        String str = this.f243206b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f243207c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f243208d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f243209e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Image image = this.f243210f;
        int i12 = r.i(r.i(r.i(r.i((iHashCode4 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f243211g), 31, this.f243212h), 31, this.f243213i), 31, this.f243214j);
        AddressParameter addressParameter = this.f243215k;
        int i13 = r.i((i12 + (addressParameter == null ? 0 : addressParameter.hashCode())) * 31, 31, this.f243216l);
        AnonymousNumber anonymousNumber = this.f243217m;
        int iHashCode5 = (i13 + (anonymousNumber == null ? 0 : anonymousNumber.hashCode())) * 31;
        SellerRating sellerRating = this.f243218n;
        return iHashCode5 + (sellerRating != null ? sellerRating.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ContactsData(phone=" + this.f243206b + ", name=" + this.f243207c + ", email=" + this.f243208d + ", manager=" + this.f243209e + ", avatar=" + this.f243210f + ", isShop=" + this.f243211g + ", isCompany=" + this.f243212h + ", isIncomplete=" + this.f243213i + ", isPro=" + this.f243214j + ", addressParameter=" + this.f243215k + ", canHidePhone=" + this.f243216l + ", anonymousNumber=" + this.f243217m + ", rating=" + this.f243218n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f243206b);
        parcel.writeString(this.f243207c);
        parcel.writeString(this.f243208d);
        parcel.writeString(this.f243209e);
        parcel.writeParcelable(this.f243210f, i12);
        parcel.writeInt(this.f243211g ? 1 : 0);
        parcel.writeInt(this.f243212h ? 1 : 0);
        parcel.writeInt(this.f243213i ? 1 : 0);
        parcel.writeInt(this.f243214j ? 1 : 0);
        parcel.writeParcelable(this.f243215k, i12);
        parcel.writeInt(this.f243216l ? 1 : 0);
        parcel.writeParcelable(this.f243217m, i12);
        parcel.writeParcelable(this.f243218n, i12);
    }

    public ContactsData(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Image image, boolean z12, boolean z13, boolean z14, boolean z15, @Y61.l AddressParameter addressParameter, boolean z16, @Y61.l AnonymousNumber anonymousNumber, @Y61.l SellerRating sellerRating) {
        this.f243206b = str;
        this.f243207c = str2;
        this.f243208d = str3;
        this.f243209e = str4;
        this.f243210f = image;
        this.f243211g = z12;
        this.f243212h = z13;
        this.f243213i = z14;
        this.f243214j = z15;
        this.f243215k = addressParameter;
        this.f243216l = z16;
        this.f243217m = anonymousNumber;
        this.f243218n = sellerRating;
    }

    public /* synthetic */ ContactsData(String str, String str2, String str3, String str4, Image image, boolean z12, boolean z13, boolean z14, boolean z15, AddressParameter addressParameter, boolean z16, AnonymousNumber anonymousNumber, SellerRating sellerRating, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : image, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & 128) != 0 ? false : z14, (i12 & 256) != 0 ? false : z15, (i12 & 512) != 0 ? null : addressParameter, (i12 & 1024) == 0 ? z16 : false, (i12 & 2048) != 0 ? null : anonymousNumber, (i12 & 4096) == 0 ? sellerRating : null);
    }
}
