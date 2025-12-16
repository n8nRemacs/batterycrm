package com.avito.android.mortgage_invite.participant;

import androidx.compose.runtime.C22066f2;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import kotlin.G0;
import kotlin.Metadata;
import o20.C44572a;

/* compiled from: ParticipantScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class x extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C44572a f206273l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ParticipantFieldId, Boolean, G0> f206274m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ParticipantFieldId, String, G0> f206275n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f206276o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f206277p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f206278q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x(C44572a c44572a, Y41.p<? super ParticipantFieldId, ? super Boolean, G0> pVar, Y41.p<? super ParticipantFieldId, ? super String, G0> pVar2, androidx.compose.ui.v vVar, int i12, int i13) {
        super(2);
        this.f206273l = c44572a;
        this.f206274m = pVar;
        this.f206275n = pVar2;
        this.f206276o = vVar;
        this.f206277p = i12;
        this.f206278q = i13;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f206277p | 1);
        Y41.p<ParticipantFieldId, Boolean, G0> pVar = this.f206274m;
        M.d(this.f206273l, pVar, this.f206275n, this.f206276o, a12, iA2, this.f206278q);
        return G0.f406611a;
    }
}
