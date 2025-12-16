package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.util.X2;
import kotlin.Metadata;

/* compiled from: VoicePlayerPresenterImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isPlaying", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class i0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f195163b;

    public i0(a0 a0Var) {
        this.f195163b = a0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean z12;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        com.jakewharton.rxrelay3.b<Boolean> bVar = this.f195163b.f195137X;
        if (zBooleanValue) {
            X2.f318778a.c("VoicePlayerPresenter", "ProximityLogicTogglingOnPlaybackStateChanges: got isPlaying = true => send TRUE to shouldListenToProximitySensorEventsStream", null);
            z12 = true;
        } else {
            X2.f318778a.c("VoicePlayerPresenter", "ProximityLogicTogglingOnPlaybackStateChanges: got isPlaying = false => send FALSE to shouldListenToProximitySensorEventsStream", null);
            z12 = false;
        }
        bVar.accept(Boolean.valueOf(z12));
    }
}
