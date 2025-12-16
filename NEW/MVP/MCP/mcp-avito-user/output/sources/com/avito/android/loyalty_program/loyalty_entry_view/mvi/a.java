package com.avito.android.loyalty_program.loyalty_entry_view.mvi;

import BX.a;
import com.avito.android.arch.mvi.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.loyalty_program.analytics.LoyaltyProgramFromPage;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vX.InterfaceC49276a;

/* compiled from: LoyaltyEntryViewActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/loyalty_program/loyalty_entry_view/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LBX/a;", "LBX/b;", "LBX/d;", "_avito_loyalty-program_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.arch.mvi.a<BX.a, BX.b, BX.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.loyalty_program.loyalty_entry_view.domain.a f184167a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49276a f184168b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x f184169c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f184170d;

    @Inject
    public a(@Y61.k com.avito.android.loyalty_program.loyalty_entry_view.domain.a aVar, @Y61.k InterfaceC49276a interfaceC49276a, @Y61.k x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2) {
        this.f184167a = aVar;
        this.f184168b = interfaceC49276a;
        this.f184169c = xVar;
        this.f184170d = aVar2;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BX.b> b(BX.a aVar, BX.d dVar) {
        BX.a aVar2 = aVar;
        BX.d dVar2 = dVar;
        if (aVar2 instanceof a.c) {
            return this.f184167a.a();
        }
        boolean z12 = aVar2 instanceof a.C0056a;
        InterfaceC49276a interfaceC49276a = this.f184168b;
        if (!z12) {
            if (!(aVar2 instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            interfaceC49276a.a(((a.b) aVar2).f1443a);
            return C43175k.w();
        }
        LoyaltyProgramFromPage[] loyaltyProgramFromPageArr = LoyaltyProgramFromPage.f184155b;
        Long f1452a = dVar2.getF1452a();
        interfaceC49276a.b(f1452a != null ? Integer.valueOf((int) f1452a.longValue()) : null);
        String f1453b = dVar2.getF1453b();
        if (f1453b != null) {
            Object objC = this.f184169c.c(f1453b);
            int i12 = Z.f406624c;
            if (objC instanceof Z.b) {
                objC = null;
            }
            DeepLink deepLink = (DeepLink) objC;
            if (deepLink != null) {
                b.a.a(this.f184170d, deepLink, null, null, 6);
            }
        }
        return C43175k.w();
    }
}
