package com.avito.android.trx_promo_goods.screens.configure.mvi;

import JF0.e;
import MF0.e;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.error.z;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: TrxPromoGoodsConfigureReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/configure/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/trx_promo_goods/screens/configure/mvi/entity/TrxPromoGoodsConfigureInternalAction;", "LMF0/d;", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class p implements u<TrxPromoGoodsConfigureInternalAction, MF0.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LF0.a f303616b;

    @Inject
    public p(@Y61.k LF0.a aVar) {
        this.f303616b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    @Override // com.avito.android.arch.mvi.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final MF0.d a(com.avito.android.trx_promo_goods.screens.configure.mvi.entity.TrxPromoGoodsConfigureInternalAction r14, MF0.d r15) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.trx_promo_goods.screens.configure.mvi.p.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final MF0.d b(MF0.d dVar) {
        MF0.e bVar;
        MF0.e cVar;
        int i12 = dVar.f10512b ? R.drawable.ic_close_24 : R.drawable.ic_back_24;
        if (dVar.f10513c) {
            bVar = new e.d(i12, new uZ.e(null, null));
        } else {
            Throwable th2 = dVar.f10514d;
            if (th2 != null) {
                cVar = new e.c(i12, new uZ.e(null, null), z.l(th2));
                return MF0.d.a(dVar, false, false, null, null, 0.0f, null, null, 0.0f, null, false, cVar, 1023);
            }
            e.b bVar2 = dVar.f10515e;
            if (bVar2 == null) {
                MF0.e.f10523a.getClass();
                bVar = MF0.e.f10524b;
            } else {
                MF0.b bVar3 = dVar.f10518h;
                Float f12 = bVar3 != null ? bVar3.f10503a : null;
                LocalDate localDate = bVar3 != null ? bVar3.f10504b : null;
                LF0.a aVar = this.f303616b;
                boolean z12 = dVar.f10521k;
                ArrayList arrayListG = aVar.g(bVar2, z12, f12, localDate);
                Q<ButtonAction, ButtonAction> qC2 = aVar.c(bVar2, z12);
                bVar = new e.b(i12, bVar2.getNavBar(), arrayListG, qC2.f406619b, qC2.f406620c, aVar.f(bVar2, z12));
            }
        }
        cVar = bVar;
        return MF0.d.a(dVar, false, false, null, null, 0.0f, null, null, 0.0f, null, false, cVar, 1023);
    }
}
