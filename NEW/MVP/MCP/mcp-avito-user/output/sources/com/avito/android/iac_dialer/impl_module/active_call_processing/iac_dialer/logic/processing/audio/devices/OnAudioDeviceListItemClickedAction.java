package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.devices;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.s;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: OnAudioDeviceListItemClickedAction.kt */
@P
@s0
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/devices/OnAudioDeviceListItemClickedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "", "audioDeviceName", "audioDeviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/devices/OnAudioDeviceListItemClickedAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAudioDeviceName", "getAudioDeviceId", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnAudioDeviceListItemClickedAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final String audioDeviceId;

    @k
    private final String audioDeviceName;

    public OnAudioDeviceListItemClickedAction(@k String str, @k String str2) {
        this.audioDeviceName = str;
        this.audioDeviceId = str2;
    }

    public static /* synthetic */ OnAudioDeviceListItemClickedAction copy$default(OnAudioDeviceListItemClickedAction onAudioDeviceListItemClickedAction, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = onAudioDeviceListItemClickedAction.audioDeviceName;
        }
        if ((i12 & 2) != 0) {
            str2 = onAudioDeviceListItemClickedAction.audioDeviceId;
        }
        return onAudioDeviceListItemClickedAction.copy(str, str2);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getAudioDeviceName() {
        return this.audioDeviceName;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getAudioDeviceId() {
        return this.audioDeviceId;
    }

    @k
    public final OnAudioDeviceListItemClickedAction copy(@k String audioDeviceName, @k String audioDeviceId) {
        return new OnAudioDeviceListItemClickedAction(audioDeviceName, audioDeviceId);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnAudioDeviceListItemClickedAction)) {
            return false;
        }
        OnAudioDeviceListItemClickedAction onAudioDeviceListItemClickedAction = (OnAudioDeviceListItemClickedAction) other;
        return L.f(this.audioDeviceName, onAudioDeviceListItemClickedAction.audioDeviceName) && L.f(this.audioDeviceId, onAudioDeviceListItemClickedAction.audioDeviceId);
    }

    @k
    public final String getAudioDeviceId() {
        return this.audioDeviceId;
    }

    @k
    public final String getAudioDeviceName() {
        return this.audioDeviceName;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return this.audioDeviceId.hashCode() + (this.audioDeviceName.hashCode() * 31);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @SuppressLint({"HardcodeStringDetector"})
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacState.InUse inUseAsInUse = iacActionProcessing.getState().asInUse();
        AudioDevice audioDevice = null;
        CallInit callInitA = inUseAsInUse != null ? i.a(inUseAsInUse, inUseAsInUse.getCallId()) : null;
        if (callInitA == null || !(iacActionProcessing.getState() instanceof IacState.InUse)) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        Set<AudioDevice> available = callInitA.getAudio().getAvailable();
        if (available != null) {
            Iterator<T> it = available.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((AudioDevice) next).getId().toString(), this.audioDeviceId)) {
                    audioDevice = next;
                    break;
                }
            }
            audioDevice = audioDevice;
        }
        if (audioDevice == null) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new s("No available AudioDevice with this id"));
        } else {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Telecom.Registered.RequestAudioDeviceChange(((IacState.InUse) iacActionProcessing.getState()).getCallId(), audioDevice));
        }
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("OnAudioDeviceListItemClickedAction(audioDeviceName=");
        sb2.append(this.audioDeviceName);
        sb2.append(", audioDeviceId=");
        return C22026a.c(sb2, this.audioDeviceId, ')');
    }
}
