package com.avito.android.messenger.conversation.mvi.voice;

import com.avito.android.util.X2;
import kotlin.Metadata;

/* compiled from: LegacyVoicePlayerPresenterImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isPlaying", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.voice.o, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32320o<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32306a f195181b;

    public C32320o(C32306a c32306a) {
        this.f195181b = c32306a;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean z12;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C32306a c32306a = this.f195181b;
        com.jakewharton.rxrelay3.b<Boolean> bVar = c32306a.f195115b0;
        if (zBooleanValue) {
            X2 x22 = X2.f318778a;
            x22.c("LegacyVoicePlayerPresenterImpl", "ProximityLogicTogglingOnPlaybackStateChanges: got isPlaying = true => acquireProximityWakeLock() and send TRUE to shouldListenToProximitySensorEventsStream", null);
            c32306a.f195114a0.acquire();
            x22.c("LegacyVoicePlayerPresenterImpl", "proximityWakeLock acquired", null);
            z12 = true;
        } else {
            X2.f318778a.c("LegacyVoicePlayerPresenterImpl", "ProximityLogicTogglingOnPlaybackStateChanges: got isPlaying = false => releaseProximityWakeLock() and send FALSE to shouldListenToProximitySensorEventsStream", null);
            c32306a.me();
            z12 = false;
        }
        bVar.accept(Boolean.valueOf(z12));
    }
}
