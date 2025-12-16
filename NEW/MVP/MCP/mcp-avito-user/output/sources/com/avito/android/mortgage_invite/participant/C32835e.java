package com.avito.android.mortgage_invite.participant;

import com.avito.android.mortgage_invite.participant.ParticipantFragment;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import kotlin.G0;
import kotlin.Metadata;
import p20.InterfaceC46876a;

/* compiled from: ParticipantFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/domain/model/ParticipantFieldId;", "id", "", "value", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mortgage_invite/participant/domain/model/ParticipantFieldId;Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_invite.participant.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32835e extends kotlin.jvm.internal.N implements Y41.p<ParticipantFieldId, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParticipantFragment f206135l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32835e(ParticipantFragment participantFragment) {
        super(2);
        this.f206135l = participantFragment;
    }

    @Override // Y41.p
    public final G0 invoke(ParticipantFieldId participantFieldId, String str) {
        ParticipantFragment.a aVar = ParticipantFragment.f206038v0;
        this.f206135l.q5().accept(new InterfaceC46876a.e(participantFieldId, str));
        return G0.f406611a;
    }
}
