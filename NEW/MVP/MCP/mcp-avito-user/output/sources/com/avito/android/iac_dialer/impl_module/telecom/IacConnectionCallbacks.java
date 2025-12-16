package com.avito.android.iac_dialer.impl_module.telecom;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.TerminateReasonBundle;
import com.avito.android.iac_dialer.impl_module.audio.audio_devices.AudioState;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: IacConnectionInputDataStorage.kt */
@P
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001Bµ\u0001\u0012!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002\u0012!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f\u0012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00070\u0002\u0012!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\u0016\u0010\u0017R2\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR2\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR2\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR2\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b \u0010\u001aR#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/telecom/IacConnectionCallbacks;", "LdL/d;", "Lkotlin/Function1;", "Lcom/avito/android/iac_dialer/impl_module/telecom/a;", "Lkotlin/S;", "name", "callControl", "Lkotlin/G0;", "onCallAdded", "", "t", "onAddCallFailed", "Lkotlin/Function0;", "onSilenceRequested", "", "isVideo", "onAnswerRequested", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/TerminateReasonBundle;", "reason", "onDisconnected", "Lcom/avito/android/iac_dialer/impl_module/audio/audio_devices/AudioState;", "onAudioStateChanged", "<init>", "(LY41/l;LY41/l;LY41/a;LY41/l;LY41/l;LY41/l;)V", "LY41/l;", "getOnCallAdded", "()LY41/l;", "getOnAddCallFailed", "LY41/a;", "getOnSilenceRequested", "()LY41/a;", "getOnAnswerRequested", "getOnDisconnected", "getOnAudioStateChanged", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacConnectionCallbacks implements dL.d {
    public static final int $stable = 0;

    @k
    private final l<Throwable, G0> onAddCallFailed;

    @k
    private final l<Boolean, G0> onAnswerRequested;

    @k
    private final l<AudioState, G0> onAudioStateChanged;

    @k
    private final l<a, G0> onCallAdded;

    @k
    private final l<TerminateReasonBundle, G0> onDisconnected;

    @k
    private final Y41.a<G0> onSilenceRequested;

    /* JADX WARN: Multi-variable type inference failed */
    public IacConnectionCallbacks(@k l<? super a, G0> lVar, @k l<? super Throwable, G0> lVar2, @k Y41.a<G0> aVar, @k l<? super Boolean, G0> lVar3, @k l<? super TerminateReasonBundle, G0> lVar4, @k l<? super AudioState, G0> lVar5) {
        this.onCallAdded = lVar;
        this.onAddCallFailed = lVar2;
        this.onSilenceRequested = aVar;
        this.onAnswerRequested = lVar3;
        this.onDisconnected = lVar4;
        this.onAudioStateChanged = lVar5;
    }

    @k
    public final l<Throwable, G0> getOnAddCallFailed() {
        return this.onAddCallFailed;
    }

    @k
    public final l<Boolean, G0> getOnAnswerRequested() {
        return this.onAnswerRequested;
    }

    @k
    public final l<AudioState, G0> getOnAudioStateChanged() {
        return this.onAudioStateChanged;
    }

    @k
    public final l<a, G0> getOnCallAdded() {
        return this.onCallAdded;
    }

    @k
    public final l<TerminateReasonBundle, G0> getOnDisconnected() {
        return this.onDisconnected;
    }

    @k
    public final Y41.a<G0> getOnSilenceRequested() {
        return this.onSilenceRequested;
    }
}
