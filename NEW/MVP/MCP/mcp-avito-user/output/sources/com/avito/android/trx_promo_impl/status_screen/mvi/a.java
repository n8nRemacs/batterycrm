package com.avito.android.trx_promo_impl.status_screen.mvi;

import aG0.C19772c;
import aG0.InterfaceC19770a;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.trx_promo_impl.analytics.TrxPromoBackPressEvent;
import com.avito.android.trx_promo_impl.status_screen.mvi.entity.TrxPromoStatusInternalAction;
import com.avito.android.trx_promo_public.data.TrxPromoStatus;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TrxPromoStatusActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/trx_promo_impl/status_screen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LaG0/a;", "Lcom/avito/android/trx_promo_impl/status_screen/mvi/entity/TrxPromoStatusInternalAction;", "LaG0/c;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC19770a, TrxPromoStatusInternalAction, C19772c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.trx_promo_impl.status_screen.domain.a f304449a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f304450b;

    /* compiled from: TrxPromoStatusActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.trx_promo_impl.status_screen.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C9348a {
        static {
            int[] iArr = new int[TrxPromoStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<TrxPromoStatus> creator = TrxPromoStatus.CREATOR;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.trx_promo_impl.status_screen.domain.a aVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f304449a = aVar;
        this.f304450b = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<TrxPromoStatusInternalAction> b(InterfaceC19770a interfaceC19770a, C19772c c19772c) {
        TrxPromoBackPressEvent.FromPage fromPage;
        InterfaceC19770a interfaceC19770a2 = interfaceC19770a;
        C19772c c19772c2 = c19772c;
        if (!(interfaceC19770a2 instanceof InterfaceC19770a.C1487a)) {
            if (interfaceC19770a2 instanceof InterfaceC19770a.d) {
                return (InterfaceC43160i) this.f304449a.invoke();
            }
            if (interfaceC19770a2 instanceof InterfaceC19770a.c) {
                RF0.h hVar = c19772c2.f20855g;
                return new C43210w(new TrxPromoStatusInternalAction.HandleDeeplink(hVar != null ? hVar.f14240b : null));
            }
            if (interfaceC19770a2 instanceof InterfaceC19770a.b) {
                return new C43210w(new TrxPromoStatusInternalAction.HandleDeeplink(((InterfaceC19770a.b) interfaceC19770a2).f20842a));
            }
            throw new NoWhenBranchMatchedException();
        }
        TrxPromoStatus trxPromoStatus = c19772c2.f20851c;
        if (trxPromoStatus != null) {
            int iOrdinal = trxPromoStatus.ordinal();
            if (iOrdinal == 0) {
                fromPage = TrxPromoBackPressEvent.FromPage.f303900d;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                fromPage = TrxPromoBackPressEvent.FromPage.f303901e;
            }
            this.f304450b.c(new TrxPromoBackPressEvent(fromPage));
        }
        return new C43210w(c19772c2.f20850b ? TrxPromoStatusInternalAction.Close.f304461b : TrxPromoStatusInternalAction.Back.f304460b);
    }
}
