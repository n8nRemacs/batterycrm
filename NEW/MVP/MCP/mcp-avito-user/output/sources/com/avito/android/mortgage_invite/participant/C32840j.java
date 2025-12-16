package com.avito.android.mortgage_invite.participant;

import com.avito.android.mortgage_invite.participant.ParticipantFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ParticipantFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_invite.participant.j, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* synthetic */ class C32840j extends kotlin.jvm.internal.H implements Y41.a<G0> {
    @Override // Y41.a
    public final G0 invoke() {
        ParticipantFragment participantFragment = (ParticipantFragment) this.receiver;
        ParticipantFragment.a aVar = ParticipantFragment.f206038v0;
        if (participantFragment.getParentFragmentManager().L() > 0) {
            participantFragment.getParentFragmentManager().Y();
        } else {
            participantFragment.requireActivity().finish();
        }
        return G0.f406611a;
    }
}
