package com.avito.android.iac_dialer.impl_module.device_status.connection_status;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;

/* compiled from: IacConnectionStatusProvider.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0006\u0007\b\t\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "Landroid/os/Parcelable;", "LdL/d;", "", "isVpnActive", "()Ljava/lang/Boolean;", "Error", "Known", "NoActiveNetwork", "NoCapabilitiesInActiveNetwork", "Transport", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$Error;", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$Known;", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$NoActiveNetwork;", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$NoCapabilitiesInActiveNetwork;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacConnectionStatus extends Parcelable, dL.d {

    /* compiled from: IacConnectionStatusProvider.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$Error;", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "isVpnActive", "Ljava/lang/Void;", "()Ljava/lang/Void;", "isVpnActive$annotations", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Error implements IacConnectionStatus {

        @l
        private static final Void isVpnActive = null;

        @k
        public static final Error INSTANCE = new Error();
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* compiled from: IacConnectionStatusProvider.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Error.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        private Error() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.iac_dialer.impl_module.device_status.connection_status.IacConnectionStatus
        public /* bridge */ /* synthetic */ Boolean isVpnActive() {
            return (Boolean) m48isVpnActive();
        }

        @k
        public String toString() {
            return Error.class.getSimpleName();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }

        @l
        /* renamed from: isVpnActive, reason: collision with other method in class */
        public Void m48isVpnActive() {
            return isVpnActive;
        }

        public static /* synthetic */ void isVpnActive$annotations() {
        }
    }

    /* compiled from: IacConnectionStatusProvider.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b\u0003\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u000b¨\u0006#"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$Known;", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "", "isVpnActive", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$Transport;", "transport", "<init>", "(ZLcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$Transport;)V", "component1", "()Z", "component2", "()Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$Transport;", "copy", "(ZLcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$Transport;)Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$Known;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "()Ljava/lang/Boolean;", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$Transport;", "getTransport", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Known implements IacConnectionStatus {
        public static final int $stable = 0;

        @k
        public static final Parcelable.Creator<Known> CREATOR = new a();
        private final boolean isVpnActive;

        @k
        private final Transport transport;

        /* compiled from: IacConnectionStatusProvider.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Known> {
            @Override // android.os.Parcelable.Creator
            public final Known createFromParcel(Parcel parcel) {
                return new Known(parcel.readInt() != 0, Transport.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Known[] newArray(int i12) {
                return new Known[i12];
            }
        }

        public Known(boolean z12, @k Transport transport) {
            this.isVpnActive = z12;
            this.transport = transport;
        }

        public static /* synthetic */ Known copy$default(Known known, boolean z12, Transport transport, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                z12 = known.isVpnActive;
            }
            if ((i12 & 2) != 0) {
                transport = known.transport;
            }
            return known.copy(z12, transport);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsVpnActive() {
            return this.isVpnActive;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final Transport getTransport() {
            return this.transport;
        }

        @k
        public final Known copy(boolean isVpnActive, @k Transport transport) {
            return new Known(isVpnActive, transport);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Known)) {
                return false;
            }
            Known known = (Known) other;
            return this.isVpnActive == known.isVpnActive && this.transport == known.transport;
        }

        @k
        public final Transport getTransport() {
            return this.transport;
        }

        public int hashCode() {
            return this.transport.hashCode() + (Boolean.hashCode(this.isVpnActive) * 31);
        }

        @Override // com.avito.android.iac_dialer.impl_module.device_status.connection_status.IacConnectionStatus
        @k
        public Boolean isVpnActive() {
            return Boolean.valueOf(this.isVpnActive);
        }

        @k
        public String toString() {
            return "Known(isVpnActive=" + this.isVpnActive + ", transport=" + this.transport + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.isVpnActive ? 1 : 0);
            parcel.writeString(this.transport.name());
        }
    }

    /* compiled from: IacConnectionStatusProvider.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$NoActiveNetwork;", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "isVpnActive", "Ljava/lang/Void;", "()Ljava/lang/Void;", "isVpnActive$annotations", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class NoActiveNetwork implements IacConnectionStatus {

        @l
        private static final Void isVpnActive = null;

        @k
        public static final NoActiveNetwork INSTANCE = new NoActiveNetwork();
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<NoActiveNetwork> CREATOR = new a();

        /* compiled from: IacConnectionStatusProvider.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NoActiveNetwork> {
            @Override // android.os.Parcelable.Creator
            public final NoActiveNetwork createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NoActiveNetwork.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final NoActiveNetwork[] newArray(int i12) {
                return new NoActiveNetwork[i12];
            }
        }

        private NoActiveNetwork() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.iac_dialer.impl_module.device_status.connection_status.IacConnectionStatus
        public /* bridge */ /* synthetic */ Boolean isVpnActive() {
            return (Boolean) m49isVpnActive();
        }

        @k
        public String toString() {
            return NoActiveNetwork.class.getSimpleName();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }

        @l
        /* renamed from: isVpnActive, reason: collision with other method in class */
        public Void m49isVpnActive() {
            return isVpnActive;
        }

        public static /* synthetic */ void isVpnActive$annotations() {
        }
    }

    /* compiled from: IacConnectionStatusProvider.kt */
    @P
    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$NoCapabilitiesInActiveNetwork;", "Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "isVpnActive", "Ljava/lang/Void;", "()Ljava/lang/Void;", "isVpnActive$annotations", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class NoCapabilitiesInActiveNetwork implements IacConnectionStatus {

        @l
        private static final Void isVpnActive = null;

        @k
        public static final NoCapabilitiesInActiveNetwork INSTANCE = new NoCapabilitiesInActiveNetwork();
        public static final int $stable = 8;

        @k
        public static final Parcelable.Creator<NoCapabilitiesInActiveNetwork> CREATOR = new a();

        /* compiled from: IacConnectionStatusProvider.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<NoCapabilitiesInActiveNetwork> {
            @Override // android.os.Parcelable.Creator
            public final NoCapabilitiesInActiveNetwork createFromParcel(Parcel parcel) {
                parcel.readInt();
                return NoCapabilitiesInActiveNetwork.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final NoCapabilitiesInActiveNetwork[] newArray(int i12) {
                return new NoCapabilitiesInActiveNetwork[i12];
            }
        }

        private NoCapabilitiesInActiveNetwork() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.avito.android.iac_dialer.impl_module.device_status.connection_status.IacConnectionStatus
        public /* bridge */ /* synthetic */ Boolean isVpnActive() {
            return (Boolean) m50isVpnActive();
        }

        @k
        public String toString() {
            return NoCapabilitiesInActiveNetwork.class.getSimpleName();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(1);
        }

        @l
        /* renamed from: isVpnActive, reason: collision with other method in class */
        public Void m50isVpnActive() {
            return isVpnActive;
        }

        public static /* synthetic */ void isVpnActive$annotations() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IacConnectionStatusProvider.kt */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/device_status/connection_status/IacConnectionStatus$Transport;", "", "(Ljava/lang/String;I)V", "WIFI", "CELLULAR", GrsBaseInfo.CountryCodeSource.UNKNOWN, "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Transport {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Transport[] $VALUES;

        @Keep
        public static final Transport WIFI = new Transport("WIFI", 0);

        @Keep
        public static final Transport CELLULAR = new Transport("CELLULAR", 1);

        @Keep
        public static final Transport UNKNOWN = new Transport(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);

        private static final /* synthetic */ Transport[] $values() {
            return new Transport[]{WIFI, CELLULAR, UNKNOWN};
        }

        static {
            Transport[] transportArr$values = $values();
            $VALUES = transportArr$values;
            $ENTRIES = kotlin.enums.c.a(transportArr$values);
        }

        private Transport(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<Transport> getEntries() {
            return $ENTRIES;
        }

        public static Transport valueOf(String str) {
            return (Transport) Enum.valueOf(Transport.class, str);
        }

        public static Transport[] values() {
            return (Transport[]) $VALUES.clone();
        }
    }

    @l
    Boolean isVpnActive();
}
