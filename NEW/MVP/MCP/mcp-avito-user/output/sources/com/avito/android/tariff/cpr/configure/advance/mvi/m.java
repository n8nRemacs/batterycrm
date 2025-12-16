package com.avito.android.tariff.cpr.configure.advance.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.tariff.cpr.configure.advance.items.reviews.x;
import com.avito.android.tariff.cpr.configure.advance.mvi.entity.CprConfigureAdvanceInternalAction;
import gB0.C40568c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CprConfigureAdvanceReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/tariff/cpr/configure/advance/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/tariff/cpr/configure/advance/mvi/entity/CprConfigureAdvanceInternalAction;", "LgB0/c;", "<init>", "()V", "_avito_tariff-cpr_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class m implements u<CprConfigureAdvanceInternalAction, C40568c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40568c a(CprConfigureAdvanceInternalAction cprConfigureAdvanceInternalAction, C40568c c40568c) {
        Object next;
        CprConfigureAdvanceInternalAction cprConfigureAdvanceInternalAction2 = cprConfigureAdvanceInternalAction;
        C40568c c40568c2 = c40568c;
        if (!(cprConfigureAdvanceInternalAction2 instanceof CprConfigureAdvanceInternalAction.Content)) {
            return cprConfigureAdvanceInternalAction2 instanceof CprConfigureAdvanceInternalAction.SelectAdvance ? C40568c.a(c40568c2, ((CprConfigureAdvanceInternalAction.SelectAdvance) cprConfigureAdvanceInternalAction2).f295471b, null, false, 119) : cprConfigureAdvanceInternalAction2 instanceof CprConfigureAdvanceInternalAction.Error.ScreenError ? C40568c.a(c40568c2, null, ((CprConfigureAdvanceInternalAction.Error.ScreenError) cprConfigureAdvanceInternalAction2).f295466b, false, 79) : cprConfigureAdvanceInternalAction2 instanceof CprConfigureAdvanceInternalAction.Loading ? C40568c.a(c40568c2, null, null, true, 79) : c40568c2;
        }
        ArrayList arrayList = new ArrayList();
        iB0.c cVar = ((CprConfigureAdvanceInternalAction.Content) cprConfigureAdvanceInternalAction2).f295465b;
        arrayList.add(new com.avito.android.tariff.cpr.configure.advance.items.header.a(cVar.getTitle(), cVar.getDescription()));
        List<iB0.h> listE = cVar.e();
        ArrayList arrayList2 = new ArrayList();
        for (iB0.h hVar : listE) {
            if (hVar instanceof iB0.i) {
                iB0.i iVar = (iB0.i) hVar;
                arrayList2.add(new x.b(iVar.getDescription(), iVar.getAdvance(), iVar.getIsSelected()));
            } else if (hVar instanceof iB0.g) {
                iB0.g gVar = (iB0.g) hVar;
                arrayList2.add(new x.a(gVar.getDescription(), gVar.getDeeplink()));
            }
        }
        arrayList.add(new com.avito.android.tariff.cpr.configure.advance.items.reviews.a(arrayList2));
        List<iB0.e> listD = cVar.d();
        if (listD != null && !listD.isEmpty()) {
            List<iB0.e> list = listD;
            ArrayList arrayList3 = new ArrayList(C42745f0.q(list, 10));
            for (iB0.e eVar : list) {
                arrayList3.add(new com.avito.android.tariff.cpr.configure.advance.items.hints.j(eVar.getDescription(), eVar.getImage()));
            }
            arrayList.add(new com.avito.android.tariff.cpr.configure.advance.items.hints.a(arrayList3));
        }
        List<iB0.h> listE2 = cVar.e();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : listE2) {
            if (obj instanceof iB0.i) {
                arrayList4.add(obj);
            }
        }
        Iterator it = arrayList4.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((iB0.i) next).getIsSelected()) {
                break;
            }
        }
        iB0.i iVar2 = (iB0.i) next;
        String advance = iVar2 != null ? iVar2.getAdvance() : null;
        ButtonAction aboutButton = cVar.getAboutButton();
        ButtonAction button = cVar.getButton();
        String str = c40568c2.f396377e;
        return new C40568c(arrayList, aboutButton, button, str == null ? advance : str, null, false, cVar.getRules());
    }
}
