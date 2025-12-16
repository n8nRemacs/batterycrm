package com.avito.android.loyalty_program.loyalty_entry_view.mvi;

import BX.b;
import BX.d;
import com.avito.android.arch.mvi.u;
import com.avito.android.loyalty_program.analytics.LoyaltyProgramFromPage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import vX.InterfaceC49276a;

/* compiled from: LoyaltyEntryViewReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LBX/b;", "LBX/d;", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements u<BX.b, BX.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49276a f184186b;

    @Inject
    public j(@Y61.k InterfaceC49276a interfaceC49276a) {
        this.f184186b = interfaceC49276a;
    }

    @Override // com.avito.android.arch.mvi.u
    public final BX.d a(BX.b bVar, BX.d dVar) {
        BX.b bVar2 = bVar;
        boolean z12 = bVar2 instanceof b.a;
        InterfaceC49276a interfaceC49276a = this.f184186b;
        if (z12) {
            LoyaltyProgramFromPage[] loyaltyProgramFromPageArr = LoyaltyProgramFromPage.f184155b;
            b.a aVar = (b.a) bVar2;
            Long l12 = aVar.f1445a;
            interfaceC49276a.c(l12 != null ? Integer.valueOf((int) l12.longValue()) : null);
            return new d.a(l12, aVar.f1446b, aVar.f1447c, aVar.f1448d);
        }
        if (bVar2 instanceof b.c) {
            return d.b.f1459d;
        }
        if (!(bVar2 instanceof b.C0057b)) {
            throw new NoWhenBranchMatchedException();
        }
        LoyaltyProgramFromPage[] loyaltyProgramFromPageArr2 = LoyaltyProgramFromPage.f184155b;
        interfaceC49276a.c(null);
        return new d.a(null, null, null, null);
    }
}
