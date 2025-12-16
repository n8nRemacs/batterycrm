package com.avito.android.mortgage_invite.participant;

import androidx.compose.runtime.C22066f2;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ParticipantScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class C extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o20.d f205974l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ParticipantFieldId, Boolean, G0> f205975m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ParticipantFieldId, String, G0> f205976n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f205977o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f205978p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(o20.d dVar, Y41.p pVar, Y41.p pVar2, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f205974l = dVar;
        this.f205975m = pVar;
        this.f205976n = pVar2;
        this.f205977o = vVar;
        this.f205978p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f205978p | 1);
        Y41.p<ParticipantFieldId, Boolean, G0> pVar = this.f205975m;
        Y41.p<ParticipantFieldId, String, G0> pVar2 = this.f205976n;
        M.a(this.f205974l, pVar, pVar2, a12, iA2);
        return G0.f406611a;
    }
}
