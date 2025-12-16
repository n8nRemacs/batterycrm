package com.avito.android.profile_tab.summary.mvi;

import Cc0.InterfaceC13241a;
import Dc0.e;
import Dc0.f;
import com.avito.android.arch.mvi.u;
import com.avito.android.profile_tab.summary.e;
import com.avito.android.remote.model.BeduinV2;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;

/* compiled from: ProfileSummaryReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_tab/summary/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "LDc0/e;", "LDc0/f;", "<init>", "()V", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class m implements u<Dc0.e, Dc0.f> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Dc0.f a(Dc0.e eVar, Dc0.f fVar) {
        Dc0.f fVarA;
        Dc0.e eVar2 = eVar;
        Dc0.f fVar2 = fVar;
        if (eVar2 instanceof e.a) {
            InterfaceC13241a interfaceC13241a = ((e.a) eVar2).f3272a;
            if (interfaceC13241a instanceof InterfaceC13241a.C0115a) {
                BeduinV2 beduinV2 = ((InterfaceC13241a.C0115a) interfaceC13241a).f2350a;
                com.avito.android.profile_tab.summary.e eVar3 = fVar2.f3277b;
                e.a aVar = eVar3 instanceof e.a ? (e.a) eVar3 : null;
                List<String> list = aVar != null ? aVar.f230868a : null;
                if (list == null) {
                    list = C42784z0.f406748b;
                }
                fVarA = Dc0.f.a(fVar2, null, new f.a.C0174a(fVar2.f3278c, beduinV2, list), 7);
            } else {
                if (!(interfaceC13241a instanceof InterfaceC13241a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13241a.b bVar = (InterfaceC13241a.b) interfaceC13241a;
                fVarA = Dc0.f.a(fVar2, null, new f.a.b(bVar.f2351a, bVar.f2352b), 7);
            }
        } else {
            if (eVar2 instanceof e.b) {
                return Dc0.f.a(fVar2, null, f.a.c.f3285a, 7);
            }
            if (!(eVar2 instanceof e.d)) {
                if (eVar2 instanceof e.c) {
                    return fVar2;
                }
                throw new NoWhenBranchMatchedException();
            }
            com.avito.android.profile_tab.summary.e eVar4 = ((e.d) eVar2).f3275a;
            if (eVar4 instanceof e.a) {
                fVarA = Dc0.f.a(fVar2, eVar4, null, 13);
            } else {
                if (!(eVar4 instanceof e.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                fVarA = Dc0.f.a(fVar2, eVar4, f.a.d.f3286a, 5);
            }
        }
        return fVarA;
    }
}
