package com.avito.android.iac_dialer.impl_module.audio.audio_devices;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AudioState.kt */
@P
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001!B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u001d\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006\""}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice;", "current", "", "available", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice;Ljava/util/Set;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice;", "component2", "()Ljava/util/Set;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice;Ljava/util/Set;)Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioDevice;", "getCurrent", "Ljava/util/Set;", "getAvailable", "isNotInitialized", "Z", "()Z", "Companion", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AudioState implements dL.d {

    @l
    private final Set<AudioDevice> available;

    @l
    private final AudioDevice current;
    private final boolean isNotInitialized;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AudioState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState$a;", "", "<init>", "()V", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public static AudioState a() {
            return new AudioState(null, null);
        }

        public Companion() {
        }
    }

    public AudioState(@l AudioDevice audioDevice, @l Set<AudioDevice> set) {
        this.current = audioDevice;
        this.available = set;
        this.isNotInitialized = audioDevice == null || set == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AudioState copy$default(AudioState audioState, AudioDevice audioDevice, Set set, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            audioDevice = audioState.current;
        }
        if ((i12 & 2) != 0) {
            set = audioState.available;
        }
        return audioState.copy(audioDevice, set);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AudioDevice getCurrent() {
        return this.current;
    }

    @l
    public final Set<AudioDevice> component2() {
        return this.available;
    }

    @k
    public final AudioState copy(@l AudioDevice current, @l Set<AudioDevice> available) {
        return new AudioState(current, available);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioState)) {
            return false;
        }
        AudioState audioState = (AudioState) other;
        return L.f(this.current, audioState.current) && L.f(this.available, audioState.available);
    }

    @l
    public final Set<AudioDevice> getAvailable() {
        return this.available;
    }

    @l
    public final AudioDevice getCurrent() {
        return this.current;
    }

    public int hashCode() {
        AudioDevice audioDevice = this.current;
        int iHashCode = (audioDevice == null ? 0 : audioDevice.hashCode()) * 31;
        Set<AudioDevice> set = this.available;
        return iHashCode + (set != null ? set.hashCode() : 0);
    }

    /* renamed from: isNotInitialized, reason: from getter */
    public final boolean getIsNotInitialized() {
        return this.isNotInitialized;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AudioState(current=");
        sb2.append(this.current);
        sb2.append(", available=");
        return AK.c.u(sb2, this.available, ')');
    }
}
