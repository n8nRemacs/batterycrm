package com.avito.android.shift_list.mvi;

import Vv0.b;
import com.avito.android.arch.mvi.u;
import com.avito.android.shift_list.ui.list.title_item.ShiftTitleItem;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ShiftListReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/shift_list/mvi/p;", "Lcom/avito/android/arch/mvi/u;", "LVv0/b;", "LVv0/d;", "<init>", "()V", "_avito_gig_shift-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements u<Vv0.b, Vv0.d> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Vv0.d a(Vv0.b bVar, Vv0.d dVar) {
        Vv0.b bVar2 = bVar;
        Vv0.d dVar2 = dVar;
        if (bVar2 instanceof b.C1213b) {
            b.C1213b c1213b = (b.C1213b) bVar2;
            ArrayList arrayList = c1213b.f17484b;
            boolean z12 = false;
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((com.avito.conveyor_item.a) it.next()) instanceof ShiftTitleItem) {
                        z12 = true;
                        break;
                    }
                }
            }
            return new Vv0.d(c1213b.f17483a, arrayList, false, true, false, false, c1213b.f17485c, z12);
        }
        if (bVar2 instanceof b.f) {
            return Vv0.d.a(dVar2, null, true, false, false, false, false, false, 67);
        }
        if (bVar2 instanceof b.g) {
            return Vv0.d.a(dVar2, null, false, false, false, true, false, false, 223);
        }
        if (bVar2 instanceof b.d) {
            return Vv0.d.a(dVar2, null, false, false, false, false, false, false, 223);
        }
        if (bVar2 instanceof b.c) {
            return Vv0.d.a(dVar2, null, false, false, true, false, false, false, 195);
        }
        if (bVar2 instanceof b.e) {
            b.e eVar = (b.e) bVar2;
            return Vv0.d.a(dVar2, C42745f0.h0(eVar.f17488a, dVar2.f17494b), false, true, false, false, eVar.f17489b, dVar2.f17500h, 1);
        }
        if (bVar2 instanceof b.a) {
            return dVar2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
