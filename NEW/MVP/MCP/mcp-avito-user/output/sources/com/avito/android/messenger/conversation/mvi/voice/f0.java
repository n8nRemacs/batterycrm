package com.avito.android.messenger.conversation.mvi.voice;

import android.os.Bundle;
import androidx.media3.session.K1;
import com.avito.android.util.X2;
import kotlin.Metadata;

/* compiled from: VoicePlayerPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldSetOutputToEarpiece", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f195157b;

    public f0(a0 a0Var) {
        this.f195157b = a0Var;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a0 a0Var = this.f195157b;
        if (zBooleanValue) {
            X2 x22 = X2.f318778a;
            x22.c("VoicePlayerPresenter", "OutputSwitchingOnProximityChanges: got shouldSetOutputToEarpiece = true => try to set audioAttributesForEarpiece", null);
            androidx.media3.session.J j12 = a0Var.f195127N;
            if (j12 != null) {
                j12.b0(new K1(new Bundle(), "COMMAND_SWITCH_TO_EARPIECE"), new Bundle());
                x22.c("VoicePlayerPresenter", "OutputSwitchingOnProximityChanges: sendCustomCommand to apply audioAttributesForEarpiece", null);
                return;
            }
            return;
        }
        X2 x23 = X2.f318778a;
        x23.c("VoicePlayerPresenter", "OutputSwitchingOnProximityChanges: got shouldSetOutputToEarpiece = false => try to set audioAttributesForSpeaker", null);
        androidx.media3.session.J j13 = a0Var.f195127N;
        if (j13 != null) {
            j13.b0(new K1(new Bundle(), "COMMAND_SWITCH_TO_SPEAKER"), new Bundle());
            x23.c("VoicePlayerPresenter", "OutputSwitchingOnProximityChanges: sendCustomCommand to apply audioAttributesForSpeaker", null);
        }
    }
}
