package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.audio.devices;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.ext.i;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioDevice;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.enums.c;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: OnChangeAudioDeviceClickedAction.kt */
@P
@s0
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/devices/OnChangeAudioDeviceClickedAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/devices/OnChangeAudioDeviceClickedAction$From;", InlineFilterValue.InlineFilterDateRangeValue.FROM_PARAM_NAME, "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/devices/OnChangeAudioDeviceClickedAction$From;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/devices/OnChangeAudioDeviceClickedAction$From;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/devices/OnChangeAudioDeviceClickedAction$From;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/devices/OnChangeAudioDeviceClickedAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/devices/OnChangeAudioDeviceClickedAction$From;", "getFrom", "From", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnChangeAudioDeviceClickedAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final From from;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OnChangeAudioDeviceClickedAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/audio/devices/OnChangeAudioDeviceClickedAction$From;", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class From {

        /* renamed from: b, reason: collision with root package name */
        public static final From f165447b;

        /* renamed from: c, reason: collision with root package name */
        public static final From f165448c;

        /* renamed from: d, reason: collision with root package name */
        public static final From f165449d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ From[] f165450e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f165451f;

        static {
            From from = new From("OverlayBroadcast", 0);
            f165447b = from;
            From from2 = new From("ScreenArgument", 1);
            f165448c = from2;
            From from3 = new From("ScreenClick", 2);
            f165449d = from3;
            From[] fromArr = {from, from2, from3};
            f165450e = fromArr;
            f165451f = c.a(fromArr);
        }

        public From() {
            throw null;
        }

        public static From valueOf(String str) {
            return (From) Enum.valueOf(From.class, str);
        }

        public static From[] values() {
            return (From[]) f165450e.clone();
        }
    }

    /* compiled from: OnChangeAudioDeviceClickedAction.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[From.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                From from = From.f165447b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                From from2 = From.f165447b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public OnChangeAudioDeviceClickedAction(@k From from) {
        this.from = from;
    }

    public static /* synthetic */ OnChangeAudioDeviceClickedAction copy$default(OnChangeAudioDeviceClickedAction onChangeAudioDeviceClickedAction, From from, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            from = onChangeAudioDeviceClickedAction.from;
        }
        return onChangeAudioDeviceClickedAction.copy(from);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final From getFrom() {
        return this.from;
    }

    @k
    public final OnChangeAudioDeviceClickedAction copy(@k From from) {
        return new OnChangeAudioDeviceClickedAction(from);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnChangeAudioDeviceClickedAction) && this.from == ((OnChangeAudioDeviceClickedAction) other).from;
    }

    @k
    public final From getFrom() {
        return this.from;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return this.from.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
        IacState.InUse inUseAsInUse = iacActionProcessing.getState().asInUse();
        AudioDevice audioDevice = null;
        CallInit callInitA = inUseAsInUse != null ? i.a(inUseAsInUse, inUseAsInUse.getCallId()) : null;
        if (callInitA == null || !(iacActionProcessing.getState() instanceof IacState.InUse)) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        AudioState audio = callInitA.getAudio();
        if (audio.getIsNotInitialized()) {
            f.s(null, 1, null, iacActionProcessing, iacActionProcessing.getOut());
            return;
        }
        Set<AudioDevice> available = audio.getAvailable();
        if (available == null) {
            available = B0.f406639b;
        }
        if (available.size() > 2) {
            int iOrdinal = this.from.ordinal();
            if (iOrdinal == 0) {
                iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.ActivityLauncher.Launch(IacCallScreenArgument.OpenAudioDeviceSettings.INSTANCE));
                return;
            } else {
                if (iOrdinal == 1 || iOrdinal == 2) {
                    iacActionProcessing.plusAssign(iacActionProcessing.getOut(), IacEvent.CallScreen.OpenAudioDevicesBottomSheet.INSTANCE);
                    return;
                }
                return;
            }
        }
        Set<AudioDevice> available2 = audio.getAvailable();
        if (available2 != null) {
            Iterator<T> it = available2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                UUID id2 = ((AudioDevice) next).getId();
                AudioDevice current = audio.getCurrent();
                if (!L.f(id2, current != null ? current.getId() : null)) {
                    audioDevice = next;
                    break;
                }
            }
            audioDevice = audioDevice;
        }
        if (audioDevice != null) {
            iacActionProcessing.plusAssign(iacActionProcessing.getOut(), new IacEvent.Telecom.Registered.RequestAudioDeviceChange(((IacState.InUse) iacActionProcessing.getState()).getCallId(), audioDevice));
        }
    }

    @k
    public String toString() {
        return "OnChangeAudioDeviceClickedAction(from=" + this.from + ')';
    }
}
