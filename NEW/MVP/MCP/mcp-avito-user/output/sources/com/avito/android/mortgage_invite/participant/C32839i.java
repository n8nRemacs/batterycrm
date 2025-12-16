package com.avito.android.mortgage_invite.participant;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.mortgage_invite.model.ApplicationCreateResult;
import kotlin.G0;
import kotlin.Metadata;
import q20.InterfaceC47188b;

/* compiled from: ParticipantFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_invite.participant.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* synthetic */ class C32839i extends kotlin.jvm.internal.H implements Y41.l<String, G0> {
    @Override // Y41.l
    public final G0 invoke(String str) {
        String str2 = str;
        ParticipantFragment participantFragment = (ParticipantFragment) this.receiver;
        InterfaceC47188b interfaceC47188b = participantFragment.f206040o0;
        if (interfaceC47188b == null) {
            interfaceC47188b = null;
        }
        interfaceC47188b.b(new ApplicationCreateResult.ApplicationCreated(str2));
        ActivityC22955m activityC22955mL1 = participantFragment.l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
        return G0.f406611a;
    }
}
