package com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info;

import Y61.k;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvanceInfoItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/cpa/prepaid_expense/items/advance_Info/f;", "Lcom/avito/android/tariff/cpa/prepaid_expense/items/advance_Info/d;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f295023b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f295024c;

    @Inject
    public f() {
        com.jakewharton.rxrelay3.c<String> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f295023b = cVar;
        this.f295024c = cVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (a) aVar);
    }

    @Override // com.avito.android.tariff.cpa.prepaid_expense.items.advance_Info.d
    @k
    /* renamed from: Z, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF295024c() {
        return this.f295024c;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof Bundle) {
                obj = obj2;
            }
        }
        Bundle bundle = (Bundle) (obj instanceof Bundle ? obj : null);
        if (bundle == null) {
            k(hVar, aVar2);
        } else {
            hVar.h9(bundle.getBoolean("isValidValue"));
        }
    }

    public final void k(@k h hVar, @k a aVar) {
        hVar.x6(aVar.f295014c);
        hVar.k6(aVar.f295015d);
        hVar.Hd(aVar.f295016e);
        hVar.h9(aVar.f295017f);
        hVar.i0();
        hVar.K(new e(this));
    }
}
