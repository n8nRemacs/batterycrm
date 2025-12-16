package com.avito.android.cpx_promo.v2.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.cpx_promo.v2.domain.model.CpxPromoV2;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction;
import com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CpxPromoV2Reducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/cpx_promo/v2/mvi/w;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2InternalAction;", "Lcom/avito/android/cpx_promo/v2/mvi/entity/CpxPromoV2State;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class w implements com.avito.android.arch.mvi.u<CpxPromoV2InternalAction, CpxPromoV2State> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cpx_promo.b f127779b;

    @Inject
    public w(@Y61.k com.avito.android.cpx_promo.b bVar) {
        this.f127779b = bVar;
    }

    public static js.c b(CpxPromoV2State cpxPromoV2State) {
        CpxPromoV2.c cVar;
        CpxPromoV2.Auto auto;
        Object next;
        boolean z12 = cpxPromoV2State.f127630h.f127669c;
        CpxPromoV2 cpxPromoV2 = cpxPromoV2State.f127626d;
        if (!z12) {
            if (cpxPromoV2 == null || (cVar = cpxPromoV2.f127487i) == null) {
                return null;
            }
            return cVar.f127515a;
        }
        if (cpxPromoV2 == null || (auto = cpxPromoV2.f127488j) == null) {
            return null;
        }
        Iterator it = auto.f127491a.f127494c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((CpxPromoV2.Auto.Budget.Value) next).f127495a == cpxPromoV2State.f127632j.f127652d) {
                break;
            }
        }
        CpxPromoV2.Auto.Budget.Value value = (CpxPromoV2.Auto.Budget.Value) next;
        if (value != null) {
            return value.f127497c;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0399  */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State a(com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2InternalAction r32, com.avito.android.cpx_promo.v2.mvi.entity.CpxPromoV2State r33) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.cpx_promo.v2.mvi.w.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
