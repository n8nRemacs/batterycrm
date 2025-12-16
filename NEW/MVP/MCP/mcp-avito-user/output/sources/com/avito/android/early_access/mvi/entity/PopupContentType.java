package com.avito.android.early_access.mvi.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessState.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType;", "Landroid/os/Parcelable;", "Bundles", "Default", "Fakedoor", "LongPackage", "SecretItems", "ShortPackage", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$Bundles;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$Default;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$Fakedoor;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$LongPackage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$SecretItems;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$ShortPackage;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface PopupContentType extends Parcelable {

    /* compiled from: EarlyAccessState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$Bundles;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType;", "FirstPage", "SecondPage", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$Bundles$FirstPage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$Bundles$SecondPage;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public interface Bundles extends PopupContentType {

        /* compiled from: EarlyAccessState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$Bundles$FirstPage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$Bundles;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class FirstPage implements Bundles {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final FirstPage f145480b = new FirstPage();

            @k
            public static final Parcelable.Creator<FirstPage> CREATOR = new a();

            /* compiled from: EarlyAccessState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<FirstPage> {
                @Override // android.os.Parcelable.Creator
                public final FirstPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return FirstPage.f145480b;
                }

                @Override // android.os.Parcelable.Creator
                public final FirstPage[] newArray(int i12) {
                    return new FirstPage[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof FirstPage);
            }

            public final int hashCode() {
                return -1187842827;
            }

            @k
            public final String toString() {
                return "FirstPage";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: EarlyAccessState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$Bundles$SecondPage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$Bundles;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SecondPage implements Bundles {

            @k
            public static final Parcelable.Creator<SecondPage> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f145481b;

            /* compiled from: EarlyAccessState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SecondPage> {
                @Override // android.os.Parcelable.Creator
                public final SecondPage createFromParcel(Parcel parcel) {
                    return new SecondPage(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SecondPage[] newArray(int i12) {
                    return new SecondPage[i12];
                }
            }

            public SecondPage(@k String str) {
                this.f145481b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SecondPage) && L.f(this.f145481b, ((SecondPage) obj).f145481b);
            }

            public final int hashCode() {
                return this.f145481b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("SecondPage(selectedPackage="), this.f145481b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f145481b);
            }
        }
    }

    /* compiled from: EarlyAccessState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$Default;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Default implements PopupContentType {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Default f145482b = new Default();

        @k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* compiled from: EarlyAccessState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Default.f145482b;
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Default);
        }

        public final int hashCode() {
            return 1168294708;
        }

        @k
        public final String toString() {
            return "Default";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: EarlyAccessState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$Fakedoor;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Fakedoor implements PopupContentType {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final Fakedoor f145483b = new Fakedoor();

        @k
        public static final Parcelable.Creator<Fakedoor> CREATOR = new a();

        /* compiled from: EarlyAccessState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Fakedoor> {
            @Override // android.os.Parcelable.Creator
            public final Fakedoor createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Fakedoor.f145483b;
            }

            @Override // android.os.Parcelable.Creator
            public final Fakedoor[] newArray(int i12) {
                return new Fakedoor[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof Fakedoor);
        }

        public final int hashCode() {
            return 1939339760;
        }

        @k
        public final String toString() {
            return "Fakedoor";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: EarlyAccessState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$LongPackage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType;", "FirstPage", "SecondPage", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$LongPackage$FirstPage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$LongPackage$SecondPage;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public interface LongPackage extends PopupContentType {

        /* compiled from: EarlyAccessState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$LongPackage$FirstPage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$LongPackage;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class FirstPage implements LongPackage {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final FirstPage f145484b = new FirstPage();

            @k
            public static final Parcelable.Creator<FirstPage> CREATOR = new a();

            /* compiled from: EarlyAccessState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<FirstPage> {
                @Override // android.os.Parcelable.Creator
                public final FirstPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return FirstPage.f145484b;
                }

                @Override // android.os.Parcelable.Creator
                public final FirstPage[] newArray(int i12) {
                    return new FirstPage[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof FirstPage);
            }

            public final int hashCode() {
                return 1337254446;
            }

            @k
            public final String toString() {
                return "FirstPage";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: EarlyAccessState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$LongPackage$SecondPage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$LongPackage;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SecondPage implements LongPackage {

            @k
            public static final Parcelable.Creator<SecondPage> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f145485b;

            /* compiled from: EarlyAccessState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SecondPage> {
                @Override // android.os.Parcelable.Creator
                public final SecondPage createFromParcel(Parcel parcel) {
                    return new SecondPage(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SecondPage[] newArray(int i12) {
                    return new SecondPage[i12];
                }
            }

            public SecondPage(@k String str) {
                this.f145485b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SecondPage) && L.f(this.f145485b, ((SecondPage) obj).f145485b);
            }

            public final int hashCode() {
                return this.f145485b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("SecondPage(selectedPackage="), this.f145485b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f145485b);
            }
        }
    }

    /* compiled from: EarlyAccessState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$SecretItems;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType;", "FirstPage", "SecondPage", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$SecretItems$FirstPage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$SecretItems$SecondPage;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public interface SecretItems extends PopupContentType {

        /* compiled from: EarlyAccessState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$SecretItems$FirstPage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$SecretItems;", "<init>", "()V", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class FirstPage implements SecretItems {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final FirstPage f145486b = new FirstPage();

            @k
            public static final Parcelable.Creator<FirstPage> CREATOR = new a();

            /* compiled from: EarlyAccessState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<FirstPage> {
                @Override // android.os.Parcelable.Creator
                public final FirstPage createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return FirstPage.f145486b;
                }

                @Override // android.os.Parcelable.Creator
                public final FirstPage[] newArray(int i12) {
                    return new FirstPage[i12];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof FirstPage);
            }

            public final int hashCode() {
                return 1887532916;
            }

            @k
            public final String toString() {
                return "FirstPage";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeInt(1);
            }
        }

        /* compiled from: EarlyAccessState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$SecretItems$SecondPage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType$SecretItems;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SecondPage implements SecretItems {

            @k
            public static final Parcelable.Creator<SecondPage> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f145487b;

            /* compiled from: EarlyAccessState.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SecondPage> {
                @Override // android.os.Parcelable.Creator
                public final SecondPage createFromParcel(Parcel parcel) {
                    return new SecondPage(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SecondPage[] newArray(int i12) {
                    return new SecondPage[i12];
                }
            }

            public SecondPage(@k String str) {
                this.f145487b = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SecondPage) && L.f(this.f145487b, ((SecondPage) obj).f145487b);
            }

            public final int hashCode() {
                return this.f145487b.hashCode();
            }

            @k
            public final String toString() {
                return C22026a.c(new StringBuilder("SecondPage(selectedPackage="), this.f145487b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f145487b);
            }
        }
    }

    /* compiled from: EarlyAccessState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/mvi/entity/PopupContentType$ShortPackage;", "Lcom/avito/android/early_access/mvi/entity/PopupContentType;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class ShortPackage implements PopupContentType {

        @k
        public static final Parcelable.Creator<ShortPackage> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f145488b;

        /* compiled from: EarlyAccessState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ShortPackage> {
            @Override // android.os.Parcelable.Creator
            public final ShortPackage createFromParcel(Parcel parcel) {
                return new ShortPackage(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ShortPackage[] newArray(int i12) {
                return new ShortPackage[i12];
            }
        }

        public ShortPackage(@k String str) {
            this.f145488b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShortPackage) && L.f(this.f145488b, ((ShortPackage) obj).f145488b);
        }

        public final int hashCode() {
            return this.f145488b.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShortPackage(selectedPackage="), this.f145488b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f145488b);
        }
    }
}
