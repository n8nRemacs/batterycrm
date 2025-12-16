package com.avito.android.mortgage_invite.contact_info;

import androidx.compose.runtime.C22066f2;
import b20.e;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ApplicationContactInfoScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class s extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e.a f205759l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, Boolean, G0> f205760m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, String, G0> f205761n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, Boolean, G0> f205762o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<ContactInfoFieldId, String, G0> f205763p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f205764q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f205765r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e.a aVar, Y41.p pVar, Y41.p pVar2, Y41.p pVar3, Y41.p pVar4, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f205759l = aVar;
        this.f205760m = pVar;
        this.f205761n = pVar2;
        this.f205762o = pVar3;
        this.f205763p = pVar4;
        this.f205764q = vVar;
        this.f205765r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f205765r | 1);
        androidx.compose.ui.v vVar = this.f205764q;
        Y41.p<ContactInfoFieldId, String, G0> pVar = this.f205761n;
        Y41.p<ContactInfoFieldId, Boolean, G0> pVar2 = this.f205762o;
        C.b(this.f205759l, this.f205760m, pVar, pVar2, this.f205763p, vVar, a12, iA2);
        return G0.f406611a;
    }
}
