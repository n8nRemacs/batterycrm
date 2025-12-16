package com.avito.android.calltracking;

import com.avito.android.calltracking.remote.model.CalltrackingAllocationResponse;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.gsm_call_starter.public_module.link.GsmCallStartLink;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: CalltrackingViewModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/calltracking/remote/model/CalltrackingAllocationResponse;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class P<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f113602b;

    public P(S s5) {
        this.f113602b = s5;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2<CalltrackingAllocationResponse> p22 = (P2) obj;
        S s5 = this.f113602b;
        s5.f113624c0.setValue(p22);
        if (p22 instanceof P2.b) {
            b.a.a(s5.f113607L, new GsmCallStartLink(((CalltrackingAllocationResponse) ((P2.b) p22).f318720a).getVirtualNumber(), null, null, null, null, null, 62, null), null, null, 6);
        } else if (p22 instanceof P2.a) {
            S.ke((P2.a) p22);
        } else {
            p22.equals(P2.c.f318721a);
        }
    }
}
