package com.avito.android.publish.cpa_tariff.mvi;

import Kd0.AbstractC14304b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import kotlin.Metadata;

/* compiled from: CpaTariffReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/publish/cpa_tariff/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "LKd0/b;", "LKd0/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements u<AbstractC14304b, Kd0.d> {
    @Override // com.avito.android.arch.mvi.u
    public final Kd0.d a(AbstractC14304b abstractC14304b, Kd0.d dVar) {
        AbstractC14304b abstractC14304b2 = abstractC14304b;
        Kd0.d dVar2 = dVar;
        if (abstractC14304b2 instanceof AbstractC14304b.d) {
            return Kd0.d.a(dVar2, null, null, true, 3);
        }
        boolean z12 = abstractC14304b2 instanceof AbstractC14304b.e;
        Kd0.e eVar = dVar2.f9559a;
        if (z12) {
            return Kd0.d.a(dVar2, new Kd0.e(eVar.f9562a, false), null, false, 6);
        }
        if (abstractC14304b2 instanceof AbstractC14304b.f) {
            return Kd0.d.a(dVar2, null, new Kd0.e(dVar2.f9560b.f9562a, false), false, 5);
        }
        if (abstractC14304b2 instanceof AbstractC14304b.g) {
            return Kd0.d.a(dVar2, null, null, false, 3);
        }
        if (!(abstractC14304b2 instanceof AbstractC14304b.c)) {
            if (!(abstractC14304b2 instanceof AbstractC14304b.h)) {
                return dVar2;
            }
            AbstractC14304b.h hVar = (AbstractC14304b.h) abstractC14304b2;
            return Kd0.d.a(dVar2, new Kd0.e(hVar.f9552a, true), new Kd0.e(hVar.f9553b, true), false, 4);
        }
        AbstractC14304b.c cVar = (AbstractC14304b.c) abstractC14304b2;
        Kd0.e eVar2 = new Kd0.e(cVar.f9546a, true);
        String str = cVar.f9547b;
        if (str == null) {
            str = "";
        }
        return new Kd0.d(eVar2, new Kd0.e(str, true), false);
    }
}
