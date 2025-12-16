package com.avito.android.trx_promo_impl.mvi;

import YF0.o;
import ZF0.e;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.trx_promo_impl.mvi.entity.TrxPromoInternalAction;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TrxPromoReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_impl/mvi/o;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/trx_promo_impl/mvi/entity/TrxPromoInternalAction;", "LZF0/d;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class o implements u<TrxPromoInternalAction, ZF0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.trx_promo_impl.data.mapper.a f304369b;

    @Inject
    public o(@Y61.k com.avito.android.trx_promo_impl.data.mapper.a aVar) {
        this.f304369b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final ZF0.d a(TrxPromoInternalAction trxPromoInternalAction, ZF0.d dVar) {
        TrxPromoInternalAction trxPromoInternalAction2 = trxPromoInternalAction;
        ZF0.d dVar2 = dVar;
        boolean z12 = trxPromoInternalAction2 instanceof TrxPromoInternalAction.ContentV7;
        com.avito.android.trx_promo_impl.data.mapper.a aVar = this.f304369b;
        if (z12) {
            TrxPromoInternalAction.ContentV7 contentV7 = (TrxPromoInternalAction.ContentV7) trxPromoInternalAction2;
            o.b bVar = contentV7.f304333b;
            int value = (int) bVar.getCommission().getValue();
            LocalDate localDateD = aVar.d(bVar, false);
            LocalDate localDateC = aVar.c(bVar, false);
            return b(ZF0.d.a(dVar2, false, false, null, contentV7.f304333b, new ZF0.b(Integer.valueOf(value), localDateD, localDateC), null, false, null, value, localDateD, localDateC, 161));
        }
        if (trxPromoInternalAction2 instanceof TrxPromoInternalAction.Loading) {
            return b(ZF0.d.a(dVar2, false, true, null, null, null, null, false, null, 0, null, null, 2041));
        }
        if (trxPromoInternalAction2 instanceof TrxPromoInternalAction.Error) {
            return b(ZF0.d.a(dVar2, false, false, ((TrxPromoInternalAction.Error) trxPromoInternalAction2).f304334b, null, null, null, false, null, 0, null, null, 2041));
        }
        boolean z13 = trxPromoInternalAction2 instanceof TrxPromoInternalAction.InputChange;
        LocalDate localDate = dVar2.f20052l;
        ZF0.b bVar2 = dVar2.f20046f;
        LocalDate localDate2 = dVar2.f20051k;
        int i12 = dVar2.f20050j;
        if (!z13) {
            if (!(trxPromoInternalAction2 instanceof TrxPromoInternalAction.ResetChanges)) {
                return dVar2;
            }
            Integer num = bVar2.f20030a;
            int iIntValue = num != null ? num.intValue() : i12;
            LocalDate localDate3 = bVar2.f20031b;
            LocalDate localDate4 = localDate3 == null ? localDate2 : localDate3;
            LocalDate localDate5 = bVar2.f20032c;
            return b(ZF0.d.a(dVar2, false, false, null, null, null, null, false, null, iIntValue, localDate4, localDate5 == null ? localDate : localDate5, 159));
        }
        TrxPromoInternalAction.InputChange inputChange = (TrxPromoInternalAction.InputChange) trxPromoInternalAction2;
        Integer num2 = inputChange.f304343d;
        LocalDate localDate6 = inputChange.f304341b;
        LocalDate localDate7 = inputChange.f304342c;
        ZF0.b bVar3 = new ZF0.b(num2, localDate6, localDate7);
        boolean z14 = true;
        if (localDate6 != null || localDate7 != null ? num2 != null ? bVar3.equals(bVar2) : bVar3.equals(ZF0.b.a(bVar2, 6)) : bVar3.equals(ZF0.b.a(bVar2, 1))) {
            z14 = false;
        }
        int iIntValue2 = num2 != null ? num2.intValue() : i12;
        o.b bVar4 = dVar2.f20045e;
        LocalDate localDateC2 = bVar4 != null ? aVar.c(bVar4, z14) : null;
        LocalDate localDateD2 = bVar4 != null ? aVar.d(bVar4, z14) : null;
        LocalDate localDate8 = localDate6 == null ? localDateD2 == null ? localDate2 : localDateD2 : localDate6;
        if (localDate7 == null) {
            localDate7 = localDateC2 == null ? localDate : localDateC2;
        }
        return b(ZF0.d.a(dVar2, false, false, null, null, null, bVar3, z14, null, iIntValue2, localDate8, localDate7, 159));
    }

    public final ZF0.d b(ZF0.d dVar) {
        ZF0.e bVar;
        ZF0.e cVar;
        int i12 = dVar.f20042b ? R.drawable.ic_close_24 : R.drawable.ic_back_24;
        if (dVar.f20043c) {
            bVar = new e.d(i12);
        } else {
            ApiError apiError = dVar.f20044d;
            if (apiError != null) {
                cVar = new e.c(i12, z.k(apiError));
                return ZF0.d.a(dVar, false, false, null, null, null, null, false, cVar, 0, null, null, 1919);
            }
            o.b bVar2 = dVar.f20045e;
            if (bVar2 != null) {
                com.avito.android.trx_promo_impl.data.mapper.a aVar = this.f304369b;
                RF0.k kVarE = aVar.e(bVar2);
                ZF0.b bVar3 = dVar.f20047g;
                Integer num = bVar3 != null ? bVar3.f20030a : null;
                LocalDate localDate = bVar3 != null ? bVar3.f20031b : null;
                LocalDate localDate2 = bVar3 != null ? bVar3.f20032c : null;
                ArrayList arrayListA = this.f304369b.a(dVar.f20045e, dVar.f20048h, num, localDate, localDate2);
                boolean z12 = dVar.f20048h;
                bVar = new e.b(i12, kVarE, arrayListA, aVar.g(bVar2, z12), aVar.b(bVar2, z12), aVar.f(bVar2, z12, dVar.f20052l));
            } else {
                ZF0.e.f20053a.getClass();
                bVar = ZF0.e.f20054b;
            }
        }
        cVar = bVar;
        return ZF0.d.a(dVar, false, false, null, null, null, null, false, cVar, 0, null, null, 1919);
    }
}
