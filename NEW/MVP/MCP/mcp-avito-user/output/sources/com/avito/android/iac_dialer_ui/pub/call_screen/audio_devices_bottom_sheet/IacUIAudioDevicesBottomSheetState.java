package com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIAudioDevicesBottomSheet.kt */
@P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState;", "LdL/d;", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState$Device;", "current", "", "available", "<init>", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState$Device;Ljava/util/List;)V", "component1", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState$Device;", "component2", "()Ljava/util/List;", "copy", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState$Device;Ljava/util/List;)Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState$Device;", "getCurrent", "Ljava/util/List;", "getAvailable", "Device", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacUIAudioDevicesBottomSheetState implements dL.d {
    public static final int $stable = 8;

    @Y61.l
    private final List<Device> available;

    @Y61.l
    private final Device current;

    /* compiled from: IacUIAudioDevicesBottomSheet.kt */
    @P
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState$Device;", "LdL/d;", "", "name", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/iac_dialer_ui/pub/call_screen/audio_devices_bottom_sheet/IacUIAudioDevicesBottomSheetState$Device;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getId", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Device implements dL.d {
        public static final int $stable = 0;

        @Y61.k
        private final String id;

        @Y61.k
        private final String name;

        public Device(@Y61.k String str, @Y61.k String str2) {
            this.name = str;
            this.id = str2;
        }

        public static /* synthetic */ Device copy$default(Device device, String str, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = device.name;
            }
            if ((i12 & 2) != 0) {
                str2 = device.id;
            }
            return device.copy(str, str2);
        }

        @Y61.k
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Y61.k
        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Y61.k
        public final Device copy(@Y61.k String name, @Y61.k String id2) {
            return new Device(name, id2);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Device)) {
                return false;
            }
            Device device = (Device) other;
            return L.f(this.name, device.name) && L.f(this.id, device.id);
        }

        @Y61.k
        public final String getId() {
            return this.id;
        }

        @Y61.k
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            return this.id.hashCode() + (this.name.hashCode() * 31);
        }

        @Y61.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("Device(name=");
            sb2.append(this.name);
            sb2.append(", id=");
            return C22026a.c(sb2, this.id, ')');
        }
    }

    public IacUIAudioDevicesBottomSheetState(@Y61.l Device device, @Y61.l List<Device> list) {
        this.current = device;
        this.available = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IacUIAudioDevicesBottomSheetState copy$default(IacUIAudioDevicesBottomSheetState iacUIAudioDevicesBottomSheetState, Device device, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            device = iacUIAudioDevicesBottomSheetState.current;
        }
        if ((i12 & 2) != 0) {
            list = iacUIAudioDevicesBottomSheetState.available;
        }
        return iacUIAudioDevicesBottomSheetState.copy(device, list);
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final Device getCurrent() {
        return this.current;
    }

    @Y61.l
    public final List<Device> component2() {
        return this.available;
    }

    @Y61.k
    public final IacUIAudioDevicesBottomSheetState copy(@Y61.l Device current, @Y61.l List<Device> available) {
        return new IacUIAudioDevicesBottomSheetState(current, available);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacUIAudioDevicesBottomSheetState)) {
            return false;
        }
        IacUIAudioDevicesBottomSheetState iacUIAudioDevicesBottomSheetState = (IacUIAudioDevicesBottomSheetState) other;
        return L.f(this.current, iacUIAudioDevicesBottomSheetState.current) && L.f(this.available, iacUIAudioDevicesBottomSheetState.available);
    }

    @Y61.l
    public final List<Device> getAvailable() {
        return this.available;
    }

    @Y61.l
    public final Device getCurrent() {
        return this.current;
    }

    public int hashCode() {
        Device device = this.current;
        int iHashCode = (device == null ? 0 : device.hashCode()) * 31;
        List<Device> list = this.available;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacUIAudioDevicesBottomSheetState(current=");
        sb2.append(this.current);
        sb2.append(", available=");
        return H.p(sb2, this.available, ')');
    }
}
