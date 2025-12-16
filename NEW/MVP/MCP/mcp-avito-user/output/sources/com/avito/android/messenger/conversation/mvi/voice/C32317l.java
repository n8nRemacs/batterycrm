package com.avito.android.messenger.conversation.mvi.voice;

import androidx.media3.exoplayer.InterfaceC23144m;
import com.avito.android.util.X2;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LegacyVoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldSetOutputToEarpiece", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.voice.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32317l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C32306a f195172b;

    public C32317l(C32306a c32306a) {
        this.f195172b = c32306a;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C32306a c32306a = this.f195172b;
        if (zBooleanValue) {
            X2 x22 = X2.f318778a;
            x22.c("LegacyVoicePlayerPresenterImpl", "OutputSwitchingOnProximityChanges: got shouldSetOutputToEarpiece = true => try to set audioAttributesForEarpiece", null);
            InterfaceC23144m interfaceC23144m = c32306a.f195101N;
            if (interfaceC23144m != null) {
                interfaceC23144m.X(c32306a.f195112Y, false);
                G0 g02 = G0.f406611a;
                x22.c("LegacyVoicePlayerPresenterImpl", "OutputSwitchingOnProximityChanges: applied audioAttributesForEarpiece", null);
                return;
            }
            return;
        }
        X2 x23 = X2.f318778a;
        x23.c("LegacyVoicePlayerPresenterImpl", "OutputSwitchingOnProximityChanges: got shouldSetOutputToEarpiece = false => try to set audioAttributesForSpeaker", null);
        InterfaceC23144m interfaceC23144m2 = c32306a.f195101N;
        if (interfaceC23144m2 != null) {
            interfaceC23144m2.X(c32306a.f195113Z, true);
            G0 g03 = G0.f406611a;
            x23.c("LegacyVoicePlayerPresenterImpl", "OutputSwitchingOnProximityChanges: applied audioAttributesForSpeaker", null);
        }
    }
}
