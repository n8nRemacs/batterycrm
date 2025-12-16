package com.avito.android.screens.bbip.ui.items.duration;

import com.avito.android.lib.design.chips.Chips;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DurationItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/duration/l;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class l implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f260365a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f260366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f260367c;

    public l(ArrayList arrayList, Y41.l lVar, m mVar) {
        this.f260365a = arrayList;
        this.f260366b = lVar;
        this.f260367c = mVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) throws NumberFormatException {
        boolean zF2 = L.f(hVar.getF114848c(), C42745f0.Q(this.f260365a));
        Y41.l<String, G0> lVar = this.f260366b;
        m mVar = this.f260367c;
        if (!zF2) {
            if (hVar.equals(mVar.f260371e)) {
                return;
            }
            ((f) lVar).invoke(hVar.getF114848c().toString());
            mVar.f260371e = hVar;
            return;
        }
        ((f) lVar).invoke(hVar.getF114848c().toString());
        com.avito.android.lib.design.chips.h hVar2 = mVar.f260371e;
        if (hVar2 != null) {
            int i12 = Chips.f178664L;
            mVar.f260369c.q(hVar2, true);
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
    }
}
