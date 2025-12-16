package com.avito.android.iac_dialer.impl_module.audio.audio_devices.hardware;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HardwareAudioDeviceManager.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioState;", "LdL/d;", "<init>", "()V", "Activated", "NotActivated", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioState$Activated;", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioState$NotActivated;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class HardwareAudioState implements d {
    public static final int $stable = 0;

    /* compiled from: HardwareAudioDeviceManager.kt */
    @P
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioState$Activated;", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioState;", "availableDevices", "", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;", "activeDevice", "(Ljava/util/Set;Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;)V", "getActiveDevice", "()Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioDevice;", "getAvailableDevices", "()Ljava/util/Set;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Activated extends HardwareAudioState {
        public static final int $stable = 8;

        @k
        private final HardwareAudioDevice activeDevice;

        @k
        private final Set<HardwareAudioDevice> availableDevices;

        /* JADX WARN: Multi-variable type inference failed */
        public Activated(@k Set<? extends HardwareAudioDevice> set, @k HardwareAudioDevice hardwareAudioDevice) {
            super(null);
            this.availableDevices = set;
            this.activeDevice = hardwareAudioDevice;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activated copy$default(Activated activated, Set set, HardwareAudioDevice hardwareAudioDevice, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                set = activated.availableDevices;
            }
            if ((i12 & 2) != 0) {
                hardwareAudioDevice = activated.activeDevice;
            }
            return activated.copy(set, hardwareAudioDevice);
        }

        @k
        public final Set<HardwareAudioDevice> component1() {
            return this.availableDevices;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final HardwareAudioDevice getActiveDevice() {
            return this.activeDevice;
        }

        @k
        public final Activated copy(@k Set<? extends HardwareAudioDevice> availableDevices, @k HardwareAudioDevice activeDevice) {
            return new Activated(availableDevices, activeDevice);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Activated)) {
                return false;
            }
            Activated activated = (Activated) other;
            return L.f(this.availableDevices, activated.availableDevices) && this.activeDevice == activated.activeDevice;
        }

        @k
        public final HardwareAudioDevice getActiveDevice() {
            return this.activeDevice;
        }

        @k
        public final Set<HardwareAudioDevice> getAvailableDevices() {
            return this.availableDevices;
        }

        public int hashCode() {
            return this.activeDevice.hashCode() + (this.availableDevices.hashCode() * 31);
        }

        @k
        public String toString() {
            return "Activated(availableDevices=" + this.availableDevices + ", activeDevice=" + this.activeDevice + ')';
        }
    }

    /* compiled from: HardwareAudioDeviceManager.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioState$NotActivated;", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/hardware/HardwareAudioState;", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class NotActivated extends HardwareAudioState {
        public static final int $stable = 0;

        @k
        public static final NotActivated INSTANCE = new NotActivated();

        private NotActivated() {
            super(null);
        }
    }

    public /* synthetic */ HardwareAudioState(C42822w c42822w) {
        this();
    }

    private HardwareAudioState() {
    }
}
