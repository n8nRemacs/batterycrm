package com.avito.android;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: SxAddressListLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/SxAddressVideoVerificationLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Arguments", "a", "c", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes10.dex */
public final class SxAddressVideoVerificationLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    public final long f67565b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f67564c = new a(null);

    @Y61.k
    public static final Parcelable.Creator<SxAddressVideoVerificationLink> CREATOR = new b();

    /* compiled from: SxAddressListLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/SxAddressVideoVerificationLink$Arguments;", "Landroid/os/Parcelable;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Arguments implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Arguments> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f67566b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f67567c;

        /* compiled from: SxAddressListLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Arguments> {
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                return new Arguments(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i12) {
                return new Arguments[i12];
            }
        }

        public Arguments(@Y61.l String str, @Y61.l String str2) {
            this.f67566b = str;
            this.f67567c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) obj;
            return kotlin.jvm.internal.L.f(this.f67566b, arguments.f67566b) && kotlin.jvm.internal.L.f(this.f67567c, arguments.f67567c);
        }

        public final int hashCode() {
            String str = this.f67566b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f67567c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Arguments(addressStatus=");
            sb2.append(this.f67566b);
            sb2.append(", addressStatusAction=");
            return C22026a.c(sb2, this.f67567c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f67566b);
            parcel.writeString(this.f67567c);
        }
    }

    /* compiled from: SxAddressListLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/SxAddressVideoVerificationLink$a;", "", "<init>", "()V", "", "SX_ADDRESS_VIDEO_VERIFICATION_ARGUMENTS_KEY", "Ljava/lang/String;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SxAddressListLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SxAddressVideoVerificationLink> {
        @Override // android.os.Parcelable.Creator
        public final SxAddressVideoVerificationLink createFromParcel(Parcel parcel) {
            return new SxAddressVideoVerificationLink(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final SxAddressVideoVerificationLink[] newArray(int i12) {
            return new SxAddressVideoVerificationLink[i12];
        }
    }

    /* compiled from: SxAddressListLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/SxAddressVideoVerificationLink$c;", "LJu/c$b;", "a", "b", "Lcom/avito/android/SxAddressVideoVerificationLink$c$a;", "Lcom/avito/android/SxAddressVideoVerificationLink$c$b;", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends InterfaceC14249c.b {

        /* compiled from: SxAddressListLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/SxAddressVideoVerificationLink$c$a;", "Lcom/avito/android/SxAddressVideoVerificationLink$c;", "<init>", "()V", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f67568b = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -913184920;
            }

            @Y61.k
            public final String toString() {
                return "Canceled";
            }
        }

        /* compiled from: SxAddressListLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/SxAddressVideoVerificationLink$c$b;", "Lcom/avito/android/SxAddressVideoVerificationLink$c;", "<init>", "()V", "_avito_sx-address_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements c {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f67569b = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1061370028;
            }

            @Y61.k
            public final String toString() {
                return "Success";
            }
        }
    }

    public SxAddressVideoVerificationLink(long j12) {
        this.f67565b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f67565b);
    }
}
