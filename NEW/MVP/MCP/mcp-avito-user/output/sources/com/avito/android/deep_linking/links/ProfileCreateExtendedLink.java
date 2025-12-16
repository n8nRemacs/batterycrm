package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: ProfileCreateExtendedLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "Flow", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class ProfileCreateExtendedLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<ProfileCreateExtendedLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Flow f133594b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133595c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f133596d;

    /* compiled from: ProfileCreateExtendedLink.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow;", "Landroid/os/Parcelable;", "BusinessRegistrationProfileUpgrade", "BusinessVrf", "PassportCreate", "PassportMerge", "ProfileUpgrade", "VerificationAlfaID", "VerificationINN", "VerificationSberID", "VerificationTinkoffID", "VerificationTochkaID", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$BusinessRegistrationProfileUpgrade;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$BusinessVrf;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$PassportCreate;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$PassportMerge;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$ProfileUpgrade;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$VerificationAlfaID;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$VerificationINN;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$VerificationSberID;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$VerificationTinkoffID;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$VerificationTochkaID;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Flow extends Parcelable {

        /* compiled from: ProfileCreateExtendedLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$BusinessRegistrationProfileUpgrade;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BusinessRegistrationProfileUpgrade implements Flow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final BusinessRegistrationProfileUpgrade f133597b = new BusinessRegistrationProfileUpgrade();

            @Y61.k
            public static final Parcelable.Creator<BusinessRegistrationProfileUpgrade> CREATOR = new a();

            /* compiled from: ProfileCreateExtendedLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<BusinessRegistrationProfileUpgrade> {
                @Override // android.os.Parcelable.Creator
                public final BusinessRegistrationProfileUpgrade createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return BusinessRegistrationProfileUpgrade.f133597b;
                }

                @Override // android.os.Parcelable.Creator
                public final BusinessRegistrationProfileUpgrade[] newArray(int i12) {
                    return new BusinessRegistrationProfileUpgrade[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof BusinessRegistrationProfileUpgrade);
            }

            public final int hashCode() {
                return 1436918195;
            }

            @Y61.k
            public final String toString() {
                return "BusinessRegistrationProfileUpgrade";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ProfileCreateExtendedLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$BusinessVrf;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BusinessVrf implements Flow {

            @Y61.k
            public static final Parcelable.Creator<BusinessVrf> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f133598b;

            /* compiled from: ProfileCreateExtendedLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<BusinessVrf> {
                @Override // android.os.Parcelable.Creator
                public final BusinessVrf createFromParcel(Parcel parcel) {
                    return new BusinessVrf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final BusinessVrf[] newArray(int i12) {
                    return new BusinessVrf[i12];
                }
            }

            public BusinessVrf(@Y61.k String str) {
                this.f133598b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BusinessVrf) && kotlin.jvm.internal.L.f(this.f133598b, ((BusinessVrf) obj).f133598b);
            }

            public final int hashCode() {
                return this.f133598b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("BusinessVrf(userIdFrom="), this.f133598b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f133598b);
            }
        }

        /* compiled from: ProfileCreateExtendedLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$PassportCreate;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PassportCreate implements Flow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final PassportCreate f133599b = new PassportCreate();

            @Y61.k
            public static final Parcelable.Creator<PassportCreate> CREATOR = new a();

            /* compiled from: ProfileCreateExtendedLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<PassportCreate> {
                @Override // android.os.Parcelable.Creator
                public final PassportCreate createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return PassportCreate.f133599b;
                }

                @Override // android.os.Parcelable.Creator
                public final PassportCreate[] newArray(int i12) {
                    return new PassportCreate[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof PassportCreate);
            }

            public final int hashCode() {
                return 855137717;
            }

            @Y61.k
            public final String toString() {
                return "PassportCreate";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ProfileCreateExtendedLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$PassportMerge;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class PassportMerge implements Flow {

            @Y61.k
            public static final Parcelable.Creator<PassportMerge> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f133600b;

            /* compiled from: ProfileCreateExtendedLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<PassportMerge> {
                @Override // android.os.Parcelable.Creator
                public final PassportMerge createFromParcel(Parcel parcel) {
                    return new PassportMerge(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final PassportMerge[] newArray(int i12) {
                    return new PassportMerge[i12];
                }
            }

            public PassportMerge(@Y61.k String str) {
                this.f133600b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PassportMerge) && kotlin.jvm.internal.L.f(this.f133600b, ((PassportMerge) obj).f133600b);
            }

            public final int hashCode() {
                return this.f133600b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("PassportMerge(profileToConvertId="), this.f133600b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f133600b);
            }
        }

        /* compiled from: ProfileCreateExtendedLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$ProfileUpgrade;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ProfileUpgrade implements Flow {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final ProfileUpgrade f133601b = new ProfileUpgrade();

            @Y61.k
            public static final Parcelable.Creator<ProfileUpgrade> CREATOR = new a();

            /* compiled from: ProfileCreateExtendedLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ProfileUpgrade> {
                @Override // android.os.Parcelable.Creator
                public final ProfileUpgrade createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return ProfileUpgrade.f133601b;
                }

                @Override // android.os.Parcelable.Creator
                public final ProfileUpgrade[] newArray(int i12) {
                    return new ProfileUpgrade[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof ProfileUpgrade);
            }

            public final int hashCode() {
                return -1906490822;
            }

            @Y61.k
            public final String toString() {
                return "ProfileUpgrade";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ProfileCreateExtendedLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$VerificationAlfaID;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class VerificationAlfaID implements Flow {

            @Y61.k
            public static final Parcelable.Creator<VerificationAlfaID> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Map<String, String> f133602b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f133603c;

            /* compiled from: ProfileCreateExtendedLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<VerificationAlfaID> {
                @Override // android.os.Parcelable.Creator
                public final VerificationAlfaID createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    return new VerificationAlfaID(linkedHashMap, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final VerificationAlfaID[] newArray(int i12) {
                    return new VerificationAlfaID[i12];
                }
            }

            public VerificationAlfaID(@Y61.k Map<String, String> map, @Y61.l String str) {
                this.f133602b = map;
                this.f133603c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerificationAlfaID)) {
                    return false;
                }
                VerificationAlfaID verificationAlfaID = (VerificationAlfaID) obj;
                return kotlin.jvm.internal.L.f(this.f133602b, verificationAlfaID.f133602b) && kotlin.jvm.internal.L.f(this.f133603c, verificationAlfaID.f133603c);
            }

            public final int hashCode() {
                int iHashCode = this.f133602b.hashCode() * 31;
                String str = this.f133603c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("VerificationAlfaID(verificationQueryParams=");
                sb2.append(this.f133602b);
                sb2.append(", verificationToken=");
                return C22026a.c(sb2, this.f133603c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                Iterator itI = C0.i(parcel, this.f133602b);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                parcel.writeString(this.f133603c);
            }
        }

        /* compiled from: ProfileCreateExtendedLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$VerificationINN;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class VerificationINN implements Flow {

            @Y61.k
            public static final Parcelable.Creator<VerificationINN> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Map<String, String> f133604b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f133605c;

            /* compiled from: ProfileCreateExtendedLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<VerificationINN> {
                @Override // android.os.Parcelable.Creator
                public final VerificationINN createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    return new VerificationINN(linkedHashMap, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final VerificationINN[] newArray(int i12) {
                    return new VerificationINN[i12];
                }
            }

            public VerificationINN(@Y61.k Map<String, String> map, @Y61.l String str) {
                this.f133604b = map;
                this.f133605c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerificationINN)) {
                    return false;
                }
                VerificationINN verificationINN = (VerificationINN) obj;
                return kotlin.jvm.internal.L.f(this.f133604b, verificationINN.f133604b) && kotlin.jvm.internal.L.f(this.f133605c, verificationINN.f133605c);
            }

            public final int hashCode() {
                int iHashCode = this.f133604b.hashCode() * 31;
                String str = this.f133605c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("VerificationINN(verificationQueryParams=");
                sb2.append(this.f133604b);
                sb2.append(", verificationToken=");
                return C22026a.c(sb2, this.f133605c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                Iterator itI = C0.i(parcel, this.f133604b);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                parcel.writeString(this.f133605c);
            }
        }

        /* compiled from: ProfileCreateExtendedLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$VerificationSberID;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class VerificationSberID implements Flow {

            @Y61.k
            public static final Parcelable.Creator<VerificationSberID> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Map<String, String> f133606b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f133607c;

            /* compiled from: ProfileCreateExtendedLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<VerificationSberID> {
                @Override // android.os.Parcelable.Creator
                public final VerificationSberID createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    return new VerificationSberID(linkedHashMap, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final VerificationSberID[] newArray(int i12) {
                    return new VerificationSberID[i12];
                }
            }

            public VerificationSberID(@Y61.k Map<String, String> map, @Y61.l String str) {
                this.f133606b = map;
                this.f133607c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerificationSberID)) {
                    return false;
                }
                VerificationSberID verificationSberID = (VerificationSberID) obj;
                return kotlin.jvm.internal.L.f(this.f133606b, verificationSberID.f133606b) && kotlin.jvm.internal.L.f(this.f133607c, verificationSberID.f133607c);
            }

            public final int hashCode() {
                int iHashCode = this.f133606b.hashCode() * 31;
                String str = this.f133607c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("VerificationSberID(verificationQueryParams=");
                sb2.append(this.f133606b);
                sb2.append(", verificationToken=");
                return C22026a.c(sb2, this.f133607c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                Iterator itI = C0.i(parcel, this.f133606b);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                parcel.writeString(this.f133607c);
            }
        }

        /* compiled from: ProfileCreateExtendedLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$VerificationTinkoffID;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class VerificationTinkoffID implements Flow {

            @Y61.k
            public static final Parcelable.Creator<VerificationTinkoffID> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Map<String, String> f133608b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f133609c;

            /* compiled from: ProfileCreateExtendedLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<VerificationTinkoffID> {
                @Override // android.os.Parcelable.Creator
                public final VerificationTinkoffID createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    return new VerificationTinkoffID(linkedHashMap, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final VerificationTinkoffID[] newArray(int i12) {
                    return new VerificationTinkoffID[i12];
                }
            }

            public VerificationTinkoffID(@Y61.k Map<String, String> map, @Y61.l String str) {
                this.f133608b = map;
                this.f133609c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerificationTinkoffID)) {
                    return false;
                }
                VerificationTinkoffID verificationTinkoffID = (VerificationTinkoffID) obj;
                return kotlin.jvm.internal.L.f(this.f133608b, verificationTinkoffID.f133608b) && kotlin.jvm.internal.L.f(this.f133609c, verificationTinkoffID.f133609c);
            }

            public final int hashCode() {
                int iHashCode = this.f133608b.hashCode() * 31;
                String str = this.f133609c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("VerificationTinkoffID(verificationQueryParams=");
                sb2.append(this.f133608b);
                sb2.append(", verificationToken=");
                return C22026a.c(sb2, this.f133609c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                Iterator itI = C0.i(parcel, this.f133608b);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                parcel.writeString(this.f133609c);
            }
        }

        /* compiled from: ProfileCreateExtendedLink.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow$VerificationTochkaID;", "Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$Flow;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class VerificationTochkaID implements Flow {

            @Y61.k
            public static final Parcelable.Creator<VerificationTochkaID> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Map<String, String> f133610b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.l
            public final String f133611c;

            /* compiled from: ProfileCreateExtendedLink.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<VerificationTochkaID> {
                @Override // android.os.Parcelable.Creator
                public final VerificationTochkaID createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    return new VerificationTochkaID(linkedHashMap, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final VerificationTochkaID[] newArray(int i12) {
                    return new VerificationTochkaID[i12];
                }
            }

            public VerificationTochkaID(@Y61.k Map<String, String> map, @Y61.l String str) {
                this.f133610b = map;
                this.f133611c = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerificationTochkaID)) {
                    return false;
                }
                VerificationTochkaID verificationTochkaID = (VerificationTochkaID) obj;
                return kotlin.jvm.internal.L.f(this.f133610b, verificationTochkaID.f133610b) && kotlin.jvm.internal.L.f(this.f133611c, verificationTochkaID.f133611c);
            }

            public final int hashCode() {
                int iHashCode = this.f133610b.hashCode() * 31;
                String str = this.f133611c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("VerificationTochkaID(verificationQueryParams=");
                sb2.append(this.f133610b);
                sb2.append(", verificationToken=");
                return C22026a.c(sb2, this.f133611c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                Iterator itI = C0.i(parcel, this.f133610b);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                parcel.writeString(this.f133611c);
            }
        }
    }

    /* compiled from: ProfileCreateExtendedLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/deep_linking/links/ProfileCreateExtendedLink$a;", "", "<init>", "()V", "", "RE_AGENT_SHORT_FLOW_CREATION_ARGS_TAG", "Ljava/lang/String;", "SELECTED_SPECIFIC_ID_ARG_TAG", "SELECTED_VERTICAL_ID_ARG_TAG", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProfileCreateExtendedLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ProfileCreateExtendedLink> {
        @Override // android.os.Parcelable.Creator
        public final ProfileCreateExtendedLink createFromParcel(Parcel parcel) {
            return new ProfileCreateExtendedLink((Flow) parcel.readParcelable(ProfileCreateExtendedLink.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ProfileCreateExtendedLink[] newArray(int i12) {
            return new ProfileCreateExtendedLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public ProfileCreateExtendedLink(@Y61.k Flow flow, @Y61.l String str, boolean z12) {
        this.f133594b = flow;
        this.f133595c = str;
        this.f133596d = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileCreateExtendedLink)) {
            return false;
        }
        ProfileCreateExtendedLink profileCreateExtendedLink = (ProfileCreateExtendedLink) obj;
        return kotlin.jvm.internal.L.f(this.f133594b, profileCreateExtendedLink.f133594b) && kotlin.jvm.internal.L.f(this.f133595c, profileCreateExtendedLink.f133595c) && this.f133596d == profileCreateExtendedLink.f133596d;
    }

    public final int hashCode() {
        int iHashCode = this.f133594b.hashCode() * 31;
        String str = this.f133595c;
        return Boolean.hashCode(this.f133596d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileCreateExtendedLink(flow=");
        sb2.append(this.f133594b);
        sb2.append(", source=");
        sb2.append(this.f133595c);
        sb2.append(", onlySelectVerticalAndSpecific=");
        return androidx.appcompat.app.r.x(sb2, this.f133596d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f133594b, i12);
        parcel.writeString(this.f133595c);
        parcel.writeInt(this.f133596d ? 1 : 0);
    }
}
