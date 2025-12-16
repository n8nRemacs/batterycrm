package com.avito.android.screens.bbip_private.ui.items.duration;

import com.avito.android.lib.design.chips.Chips;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BbipPrivateDurationItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip_private/ui/items/duration/k;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class k implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f260854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f260855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f260856c;

    public k(ArrayList arrayList, Y41.l lVar, l lVar2) {
        this.f260854a = arrayList;
        this.f260855b = lVar;
        this.f260856c = lVar2;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) throws NumberFormatException {
        boolean zF2 = L.f(hVar.getF114848c(), C42745f0.Q(this.f260854a));
        Y41.l<String, G0> lVar = this.f260855b;
        l lVar2 = this.f260856c;
        if (!zF2) {
            if (hVar.equals(lVar2.f260860e)) {
                return;
            }
            ((f) lVar).invoke(hVar.getF114848c().toString());
            lVar2.f260860e = hVar;
            return;
        }
        ((f) lVar).invoke(hVar.getF114848c().toString());
        com.avito.android.lib.design.chips.h hVar2 = lVar2.f260860e;
        if (hVar2 != null) {
            int i12 = Chips.f178664L;
            lVar2.f260858c.q(hVar2, true);
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
    }
}
