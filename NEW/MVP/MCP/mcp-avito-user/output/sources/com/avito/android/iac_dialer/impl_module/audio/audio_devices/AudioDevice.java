package com.avito.android.iac_dialer.impl_module.audio.audio_devices;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.text.C43066x;

/* compiled from: AudioState.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001)B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0011¨\u0006*"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice;", "LdL/d;", "Landroid/os/Parcelable;", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice$Type;", "type", "", "name", "Ljava/util/UUID;", "id", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice$Type;Ljava/lang/String;Ljava/util/UUID;)V", "toString", "()Ljava/lang/String;", "component1", "()Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice$Type;", "component2", "component3", "()Ljava/util/UUID;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice$Type;Ljava/lang/String;Ljava/util/UUID;)Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice$Type;", "getType", "Ljava/lang/String;", "getName", "Ljava/util/UUID;", "getId", "Type", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AudioDevice implements dL.d, Parcelable {
    public static final int $stable = 8;

    @k
    public static final Parcelable.Creator<AudioDevice> CREATOR = new a();

    @k
    private final UUID id;

    @l
    private final String name;

    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AudioState.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice$Type;", "", "LdL/d;", "<init>", "(Ljava/lang/String;I)V", "WIRED_HEADSET", "BLUETOOTH", "SPEAKER", "EARPIECE", "STREAMING", GrsBaseInfo.CountryCodeSource.UNKNOWN, "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type implements dL.d {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type WIRED_HEADSET = new Type("WIRED_HEADSET", 0);
        public static final Type BLUETOOTH = new Type("BLUETOOTH", 1);
        public static final Type SPEAKER = new Type("SPEAKER", 2);
        public static final Type EARPIECE = new Type("EARPIECE", 3);
        public static final Type STREAMING = new Type("STREAMING", 4);
        public static final Type UNKNOWN = new Type(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{WIRED_HEADSET, BLUETOOTH, SPEAKER, EARPIECE, STREAMING, UNKNOWN};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = kotlin.enums.c.a(typeArr$values);
        }

        private Type(String str, int i12) {
        }

        @k
        public static kotlin.enums.a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: AudioState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AudioDevice> {
        @Override // android.os.Parcelable.Creator
        public final AudioDevice createFromParcel(Parcel parcel) {
            return new AudioDevice(Type.valueOf(parcel.readString()), parcel.readString(), (UUID) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final AudioDevice[] newArray(int i12) {
            return new AudioDevice[i12];
        }
    }

    public AudioDevice(@k Type type, @l String str, @k UUID uuid) {
        this.type = type;
        this.name = str;
        this.id = uuid;
    }

    public static /* synthetic */ AudioDevice copy$default(AudioDevice audioDevice, Type type, String str, UUID uuid, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            type = audioDevice.type;
        }
        if ((i12 & 2) != 0) {
            str = audioDevice.name;
        }
        if ((i12 & 4) != 0) {
            uuid = audioDevice.id;
        }
        return audioDevice.copy(type, str, uuid);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    @k
    public final AudioDevice copy(@k Type type, @l String name, @k UUID id2) {
        return new AudioDevice(type, name, id2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioDevice)) {
            return false;
        }
        AudioDevice audioDevice = (AudioDevice) other;
        return this.type == audioDevice.type && L.f(this.name, audioDevice.name) && L.f(this.id, audioDevice.id);
    }

    @k
    public final UUID getId() {
        return this.id;
    }

    @l
    public final String getName() {
        return this.name;
    }

    @k
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.name;
        return this.id.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        C43066x.j(sb2, "Device(type=", this.type, ", ");
        String str = this.name;
        if (str != null) {
            C43066x.k(sb2, "name=", str, ", ");
        }
        C43066x.k(sb2, "id=", C43066x.t0(3, this.id.toString()), ")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type.name());
        parcel.writeString(this.name);
        parcel.writeSerializable(this.id);
    }
}
