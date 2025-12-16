package com.avito.android.passport.profile_add;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.ProfileCreateExtendedLink;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ProfileCreateExtendedFlow.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow;", "Landroid/os/Parcelable;", "a", "Passport", "Profile", "Verification", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Passport;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Profile;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class ProfileCreateExtendedFlow implements Parcelable {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f211169c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f211170b;

    /* compiled from: ProfileCreateExtendedFlow.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Passport;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow;", "BusinessVrf", "Create", "Merge", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Passport$BusinessVrf;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Passport$Create;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Passport$Merge;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Passport extends ProfileCreateExtendedFlow {

        /* compiled from: ProfileCreateExtendedFlow.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Passport$BusinessVrf;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Passport;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BusinessVrf extends Passport {

            @Y61.k
            public static final Parcelable.Creator<BusinessVrf> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f211171d;

            /* compiled from: ProfileCreateExtendedFlow.kt */
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
                super("merge", null);
                this.f211171d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BusinessVrf) && L.f(this.f211171d, ((BusinessVrf) obj).f211171d);
            }

            public final int hashCode() {
                return this.f211171d.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("BusinessVrf(userIdFrom="), this.f211171d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f211171d);
            }
        }

        /* compiled from: ProfileCreateExtendedFlow.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Passport$Create;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Passport;", "<init>", "()V", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Create extends Passport {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public static final Create f211172d = new Create();

            @Y61.k
            public static final Parcelable.Creator<Create> CREATOR = new a();

            /* compiled from: ProfileCreateExtendedFlow.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Create> {
                @Override // android.os.Parcelable.Creator
                public final Create createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Create.f211172d;
                }

                @Override // android.os.Parcelable.Creator
                public final Create[] newArray(int i12) {
                    return new Create[i12];
                }
            }

            public Create() {
                super("create", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Create);
            }

            public final int hashCode() {
                return 93297186;
            }

            @Y61.k
            public final String toString() {
                return "Create";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ProfileCreateExtendedFlow.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Passport$Merge;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Passport;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Merge extends Passport {

            @Y61.k
            public static final Parcelable.Creator<Merge> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final String f211173d;

            /* compiled from: ProfileCreateExtendedFlow.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Merge> {
                @Override // android.os.Parcelable.Creator
                public final Merge createFromParcel(Parcel parcel) {
                    return new Merge(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Merge[] newArray(int i12) {
                    return new Merge[i12];
                }
            }

            public Merge(@Y61.k String str) {
                super("merge", null);
                this.f211173d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Merge) && L.f(this.f211173d, ((Merge) obj).f211173d);
            }

            public final int hashCode() {
                return this.f211173d.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Merge(profileToConvertId="), this.f211173d, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f211173d);
            }
        }

        public Passport(String str, C42822w c42822w) {
            super(str, null);
        }
    }

    /* compiled from: ProfileCreateExtendedFlow.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Profile;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow;", "BusinessRegistrationUpgrade", "Upgrade", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Profile$BusinessRegistrationUpgrade;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Profile$Upgrade;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Profile extends ProfileCreateExtendedFlow {

        /* compiled from: ProfileCreateExtendedFlow.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Profile$BusinessRegistrationUpgrade;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Profile;", "<init>", "()V", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class BusinessRegistrationUpgrade extends Profile {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public static final BusinessRegistrationUpgrade f211174d = new BusinessRegistrationUpgrade();

            @Y61.k
            public static final Parcelable.Creator<BusinessRegistrationUpgrade> CREATOR = new a();

            /* compiled from: ProfileCreateExtendedFlow.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<BusinessRegistrationUpgrade> {
                @Override // android.os.Parcelable.Creator
                public final BusinessRegistrationUpgrade createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return BusinessRegistrationUpgrade.f211174d;
                }

                @Override // android.os.Parcelable.Creator
                public final BusinessRegistrationUpgrade[] newArray(int i12) {
                    return new BusinessRegistrationUpgrade[i12];
                }
            }

            public BusinessRegistrationUpgrade() {
                super("businessRegistration", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof BusinessRegistrationUpgrade);
            }

            public final int hashCode() {
                return 337778440;
            }

            @Y61.k
            public final String toString() {
                return "BusinessRegistrationUpgrade";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: ProfileCreateExtendedFlow.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Profile$Upgrade;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Profile;", "<init>", "()V", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Upgrade extends Profile {

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public static final Upgrade f211175d = new Upgrade();

            @Y61.k
            public static final Parcelable.Creator<Upgrade> CREATOR = new a();

            /* compiled from: ProfileCreateExtendedFlow.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Upgrade> {
                @Override // android.os.Parcelable.Creator
                public final Upgrade createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Upgrade.f211175d;
                }

                @Override // android.os.Parcelable.Creator
                public final Upgrade[] newArray(int i12) {
                    return new Upgrade[i12];
                }
            }

            public Upgrade() {
                super("upgrade", null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof Upgrade);
            }

            public final int hashCode() {
                return 1683447393;
            }

            @Y61.k
            public final String toString() {
                return "Upgrade";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        public Profile(String str, C42822w c42822w) {
            super(str, null);
        }
    }

    /* compiled from: ProfileCreateExtendedFlow.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow;", "AlfaID", "INN", "SberID", "TinkoffID", "TochkaID", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification$AlfaID;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification$INN;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification$SberID;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification$TinkoffID;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification$TochkaID;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Verification extends ProfileCreateExtendedFlow {

        /* compiled from: ProfileCreateExtendedFlow.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification$AlfaID;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class AlfaID extends Verification {

            @Y61.k
            public static final Parcelable.Creator<AlfaID> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final Map<String, String> f211176d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f211177e;

            /* compiled from: ProfileCreateExtendedFlow.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<AlfaID> {
                @Override // android.os.Parcelable.Creator
                public final AlfaID createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    return new AlfaID(linkedHashMap, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final AlfaID[] newArray(int i12) {
                    return new AlfaID[i12];
                }
            }

            public AlfaID(@Y61.k Map<String, String> map, @Y61.l String str) {
                super("verificationAlfaID", null);
                this.f211176d = map;
                this.f211177e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AlfaID)) {
                    return false;
                }
                AlfaID alfaID = (AlfaID) obj;
                return L.f(this.f211176d, alfaID.f211176d) && L.f(this.f211177e, alfaID.f211177e);
            }

            public final int hashCode() {
                int iHashCode = this.f211176d.hashCode() * 31;
                String str = this.f211177e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("AlfaID(verificationQueryParams=");
                sb2.append(this.f211176d);
                sb2.append(", verificationToken=");
                return C22026a.c(sb2, this.f211177e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                Iterator itI = C0.i(parcel, this.f211176d);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                parcel.writeString(this.f211177e);
            }
        }

        /* compiled from: ProfileCreateExtendedFlow.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification$INN;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class INN extends Verification {

            @Y61.k
            public static final Parcelable.Creator<INN> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final Map<String, String> f211178d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f211179e;

            /* compiled from: ProfileCreateExtendedFlow.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<INN> {
                @Override // android.os.Parcelable.Creator
                public final INN createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    return new INN(linkedHashMap, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final INN[] newArray(int i12) {
                    return new INN[i12];
                }
            }

            public INN(@Y61.k Map<String, String> map, @Y61.l String str) {
                super("verificationInn", null);
                this.f211178d = map;
                this.f211179e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof INN)) {
                    return false;
                }
                INN inn = (INN) obj;
                return L.f(this.f211178d, inn.f211178d) && L.f(this.f211179e, inn.f211179e);
            }

            public final int hashCode() {
                int iHashCode = this.f211178d.hashCode() * 31;
                String str = this.f211179e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("INN(verificationQueryParams=");
                sb2.append(this.f211178d);
                sb2.append(", verificationToken=");
                return C22026a.c(sb2, this.f211179e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                Iterator itI = C0.i(parcel, this.f211178d);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                parcel.writeString(this.f211179e);
            }
        }

        /* compiled from: ProfileCreateExtendedFlow.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification$SberID;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class SberID extends Verification {

            @Y61.k
            public static final Parcelable.Creator<SberID> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final Map<String, String> f211180d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f211181e;

            /* compiled from: ProfileCreateExtendedFlow.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SberID> {
                @Override // android.os.Parcelable.Creator
                public final SberID createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    return new SberID(linkedHashMap, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SberID[] newArray(int i12) {
                    return new SberID[i12];
                }
            }

            public SberID(@Y61.k Map<String, String> map, @Y61.l String str) {
                super("verificationSberID", null);
                this.f211180d = map;
                this.f211181e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SberID)) {
                    return false;
                }
                SberID sberID = (SberID) obj;
                return L.f(this.f211180d, sberID.f211180d) && L.f(this.f211181e, sberID.f211181e);
            }

            public final int hashCode() {
                int iHashCode = this.f211180d.hashCode() * 31;
                String str = this.f211181e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SberID(verificationQueryParams=");
                sb2.append(this.f211180d);
                sb2.append(", verificationToken=");
                return C22026a.c(sb2, this.f211181e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                Iterator itI = C0.i(parcel, this.f211180d);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                parcel.writeString(this.f211181e);
            }
        }

        /* compiled from: ProfileCreateExtendedFlow.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification$TinkoffID;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TinkoffID extends Verification {

            @Y61.k
            public static final Parcelable.Creator<TinkoffID> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final Map<String, String> f211182d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f211183e;

            /* compiled from: ProfileCreateExtendedFlow.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<TinkoffID> {
                @Override // android.os.Parcelable.Creator
                public final TinkoffID createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    return new TinkoffID(linkedHashMap, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TinkoffID[] newArray(int i12) {
                    return new TinkoffID[i12];
                }
            }

            public TinkoffID(@Y61.k Map<String, String> map, @Y61.l String str) {
                super("verificationTinkoffID", null);
                this.f211182d = map;
                this.f211183e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TinkoffID)) {
                    return false;
                }
                TinkoffID tinkoffID = (TinkoffID) obj;
                return L.f(this.f211182d, tinkoffID.f211182d) && L.f(this.f211183e, tinkoffID.f211183e);
            }

            public final int hashCode() {
                int iHashCode = this.f211182d.hashCode() * 31;
                String str = this.f211183e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("TinkoffID(verificationQueryParams=");
                sb2.append(this.f211182d);
                sb2.append(", verificationToken=");
                return C22026a.c(sb2, this.f211183e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                Iterator itI = C0.i(parcel, this.f211182d);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                parcel.writeString(this.f211183e);
            }
        }

        /* compiled from: ProfileCreateExtendedFlow.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification$TochkaID;", "Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$Verification;", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class TochkaID extends Verification {

            @Y61.k
            public static final Parcelable.Creator<TochkaID> CREATOR = new a();

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final Map<String, String> f211184d;

            /* renamed from: e, reason: collision with root package name */
            @Y61.l
            public final String f211185e;

            /* compiled from: ProfileCreateExtendedFlow.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<TochkaID> {
                @Override // android.os.Parcelable.Creator
                public final TochkaID createFromParcel(Parcel parcel) {
                    int i12 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i12);
                    int iA2 = 0;
                    while (iA2 != i12) {
                        iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                    }
                    return new TochkaID(linkedHashMap, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TochkaID[] newArray(int i12) {
                    return new TochkaID[i12];
                }
            }

            public TochkaID(@Y61.k Map<String, String> map, @Y61.l String str) {
                super("verificationTochkaID", null);
                this.f211184d = map;
                this.f211185e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TochkaID)) {
                    return false;
                }
                TochkaID tochkaID = (TochkaID) obj;
                return L.f(this.f211184d, tochkaID.f211184d) && L.f(this.f211185e, tochkaID.f211185e);
            }

            public final int hashCode() {
                int iHashCode = this.f211184d.hashCode() * 31;
                String str = this.f211185e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("TochkaID(verificationQueryParams=");
                sb2.append(this.f211184d);
                sb2.append(", verificationToken=");
                return C22026a.c(sb2, this.f211185e, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                Iterator itI = C0.i(parcel, this.f211184d);
                while (itI.hasNext()) {
                    Map.Entry entry = (Map.Entry) itI.next();
                    parcel.writeString((String) entry.getKey());
                    parcel.writeString((String) entry.getValue());
                }
                parcel.writeString(this.f211185e);
            }
        }

        public Verification(String str, C42822w c42822w) {
            super(str, null);
        }
    }

    /* compiled from: ProfileCreateExtendedFlow.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/ProfileCreateExtendedFlow$a;", "", "<init>", "()V", "_avito_extended-profile-creation_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ProfileCreateExtendedFlow a(@Y61.k ProfileCreateExtendedLink profileCreateExtendedLink) {
            ProfileCreateExtendedFlow tochkaID;
            ProfileCreateExtendedLink.Flow flow = profileCreateExtendedLink.f133594b;
            if (flow instanceof ProfileCreateExtendedLink.Flow.PassportCreate) {
                return Passport.Create.f211172d;
            }
            if (flow instanceof ProfileCreateExtendedLink.Flow.PassportMerge) {
                tochkaID = new Passport.Merge(((ProfileCreateExtendedLink.Flow.PassportMerge) flow).f133600b);
            } else if (flow instanceof ProfileCreateExtendedLink.Flow.BusinessVrf) {
                tochkaID = new Passport.BusinessVrf(((ProfileCreateExtendedLink.Flow.BusinessVrf) flow).f133598b);
            } else {
                if (flow instanceof ProfileCreateExtendedLink.Flow.ProfileUpgrade) {
                    return Profile.Upgrade.f211175d;
                }
                if (flow instanceof ProfileCreateExtendedLink.Flow.BusinessRegistrationProfileUpgrade) {
                    return Profile.BusinessRegistrationUpgrade.f211174d;
                }
                if (flow instanceof ProfileCreateExtendedLink.Flow.VerificationINN) {
                    ProfileCreateExtendedLink.Flow.VerificationINN verificationINN = (ProfileCreateExtendedLink.Flow.VerificationINN) flow;
                    tochkaID = new Verification.INN(verificationINN.f133604b, verificationINN.f133605c);
                } else if (flow instanceof ProfileCreateExtendedLink.Flow.VerificationTinkoffID) {
                    ProfileCreateExtendedLink.Flow.VerificationTinkoffID verificationTinkoffID = (ProfileCreateExtendedLink.Flow.VerificationTinkoffID) flow;
                    tochkaID = new Verification.TinkoffID(verificationTinkoffID.f133608b, verificationTinkoffID.f133609c);
                } else if (flow instanceof ProfileCreateExtendedLink.Flow.VerificationSberID) {
                    ProfileCreateExtendedLink.Flow.VerificationSberID verificationSberID = (ProfileCreateExtendedLink.Flow.VerificationSberID) flow;
                    tochkaID = new Verification.SberID(verificationSberID.f133606b, verificationSberID.f133607c);
                } else if (flow instanceof ProfileCreateExtendedLink.Flow.VerificationAlfaID) {
                    ProfileCreateExtendedLink.Flow.VerificationAlfaID verificationAlfaID = (ProfileCreateExtendedLink.Flow.VerificationAlfaID) flow;
                    tochkaID = new Verification.AlfaID(verificationAlfaID.f133602b, verificationAlfaID.f133603c);
                } else {
                    if (!(flow instanceof ProfileCreateExtendedLink.Flow.VerificationTochkaID)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ProfileCreateExtendedLink.Flow.VerificationTochkaID verificationTochkaID = (ProfileCreateExtendedLink.Flow.VerificationTochkaID) flow;
                    tochkaID = new Verification.TochkaID(verificationTochkaID.f133610b, verificationTochkaID.f133611c);
                }
            }
            return tochkaID;
        }

        public a() {
        }
    }

    public ProfileCreateExtendedFlow(String str, C42822w c42822w) {
        this.f211170b = str;
    }
}
