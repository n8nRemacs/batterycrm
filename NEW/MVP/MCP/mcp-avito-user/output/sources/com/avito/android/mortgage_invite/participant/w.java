package com.avito.android.mortgage_invite.participant;

import androidx.compose.runtime.C22066f2;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import kotlin.G0;
import kotlin.Metadata;
import p20.e;

/* compiled from: ParticipantScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class w extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e.a f206266l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ParticipantFieldId, Boolean, G0> f206267m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ParticipantFieldId, Boolean, G0> f206268n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ParticipantFieldId, String, G0> f206269o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ParticipantFieldId, String, G0> f206270p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f206271q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f206272r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e.a aVar, Y41.p pVar, Y41.p pVar2, Y41.p pVar3, Y41.p pVar4, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f206266l = aVar;
        this.f206267m = pVar;
        this.f206268n = pVar2;
        this.f206269o = pVar3;
        this.f206270p = pVar4;
        this.f206271q = vVar;
        this.f206272r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f206272r | 1);
        androidx.compose.ui.v vVar = this.f206271q;
        Y41.p<ParticipantFieldId, Boolean, G0> pVar = this.f206268n;
        Y41.p<ParticipantFieldId, String, G0> pVar2 = this.f206269o;
        M.c(this.f206266l, this.f206267m, pVar, pVar2, this.f206270p, vVar, a12, iA2);
        return G0.f406611a;
    }
}
