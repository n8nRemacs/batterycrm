package com.avito.android.iac_dialer.impl_module.screens.call_screen.dialer_mediator;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import com.avito.android.iac_dialer.impl_module.utils.HasIndex;
import com.avito.android.iac_dialer_ui.pub.call_screen.IacUICallScreenState;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;

/* compiled from: IacCallScreenDialerMediatorState.kt */
@P
@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\fHÖ\u0001J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/dialer_mediator/IacCallScreenDialerMediatorState;", "Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex;", "callScreenState", "Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState;", "audioState", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;", "(Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState;Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;)V", "getAudioState", "()Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;", "getCallScreenState", "()Lcom/avito/android/iac_dialer_ui/pub/call_screen/IacUICallScreenState;", "index", "", "getIndex", "()I", "setIndex", "(I)V", "indexType", "Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex$Type;", "getIndexType", "()Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex$Type;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacCallScreenDialerMediatorState implements HasIndex {
    public static final int $stable = 8;

    @k
    private final AudioState audioState;

    @k
    private final IacUICallScreenState callScreenState;
    private int index = -1;

    @k
    private final HasIndex.Type indexType = HasIndex.Type.f166507c;

    public IacCallScreenDialerMediatorState(@k IacUICallScreenState iacUICallScreenState, @k AudioState audioState) {
        this.callScreenState = iacUICallScreenState;
        this.audioState = audioState;
    }

    public static /* synthetic */ IacCallScreenDialerMediatorState copy$default(IacCallScreenDialerMediatorState iacCallScreenDialerMediatorState, IacUICallScreenState iacUICallScreenState, AudioState audioState, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            iacUICallScreenState = iacCallScreenDialerMediatorState.callScreenState;
        }
        if ((i12 & 2) != 0) {
            audioState = iacCallScreenDialerMediatorState.audioState;
        }
        return iacCallScreenDialerMediatorState.copy(iacUICallScreenState, audioState);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final IacUICallScreenState getCallScreenState() {
        return this.callScreenState;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AudioState getAudioState() {
        return this.audioState;
    }

    @k
    public final IacCallScreenDialerMediatorState copy(@k IacUICallScreenState callScreenState, @k AudioState audioState) {
        return new IacCallScreenDialerMediatorState(callScreenState, audioState);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacCallScreenDialerMediatorState)) {
            return false;
        }
        IacCallScreenDialerMediatorState iacCallScreenDialerMediatorState = (IacCallScreenDialerMediatorState) other;
        return L.f(this.callScreenState, iacCallScreenDialerMediatorState.callScreenState) && L.f(this.audioState, iacCallScreenDialerMediatorState.audioState);
    }

    @k
    public final AudioState getAudioState() {
        return this.audioState;
    }

    @k
    public final IacUICallScreenState getCallScreenState() {
        return this.callScreenState;
    }

    @Override // com.avito.android.iac_dialer.impl_module.utils.HasIndex
    public int getIndex() {
        return this.index;
    }

    @Override // com.avito.android.iac_dialer.impl_module.utils.HasIndex
    @k
    public HasIndex.Type getIndexType() {
        return this.indexType;
    }

    public int hashCode() {
        return this.audioState.hashCode() + (this.callScreenState.hashCode() * 31);
    }

    @Override // com.avito.android.iac_dialer.impl_module.utils.HasIndex
    public void setIndex(int i12) {
        this.index = i12;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacCallScreenState_");
        sb2.append(getIndex());
        sb2.append('(');
        return C22026a.c(sb2, C42745f0.O(C42745f0.U("callScreenState=" + this.callScreenState, "audioState=" + this.audioState), null, null, null, null, 63), ')');
    }
}
