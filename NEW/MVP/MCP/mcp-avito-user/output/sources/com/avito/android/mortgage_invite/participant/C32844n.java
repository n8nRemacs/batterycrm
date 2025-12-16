package com.avito.android.mortgage_invite.participant;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ParticipantFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo20/b;", "it", "Lkotlin/G0;", "invoke", "(Lo20/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_invite.participant.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32844n extends kotlin.jvm.internal.N implements Y41.l<o20.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParticipantFragment f206246l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32844n(ParticipantFragment participantFragment) {
        super(1);
        this.f206246l = participantFragment;
    }

    @Override // Y41.l
    public final G0 invoke(o20.b bVar) {
        ParticipantFragment participantFragment = this.f206246l;
        com.avito.android.lib.util.g.a(new com.avito.android.mortgage_invite.participant.close_dialog.b(participantFragment.requireContext(), bVar, new C32843m(participantFragment)));
        return G0.f406611a;
    }
}
