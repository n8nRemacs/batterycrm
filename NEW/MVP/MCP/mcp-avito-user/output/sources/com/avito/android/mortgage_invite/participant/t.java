package com.avito.android.mortgage_invite.participant;

import androidx.compose.foundation.lazy.InterfaceC20793y;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import kotlin.G0;
import kotlin.Metadata;
import p20.e;

/* compiled from: ParticipantScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class t extends kotlin.jvm.internal.N implements Y41.q<InterfaceC20793y, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e.a f206255l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ParticipantFieldId, Boolean, G0> f206256m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ParticipantFieldId, String, G0> f206257n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(e.a aVar, Y41.p<? super ParticipantFieldId, ? super Boolean, G0> pVar, Y41.p<? super ParticipantFieldId, ? super String, G0> pVar2) {
        super(3);
        this.f206255l = aVar;
        this.f206256m = pVar;
        this.f206257n = pVar2;
    }

    @Override // Y41.q
    public final G0 invoke(InterfaceC20793y interfaceC20793y, androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            M.d(this.f206255l.f428150a.f419325e, this.f206256m, this.f206257n, null, a13, 8, 8);
        }
        return G0.f406611a;
    }
}
