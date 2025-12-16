package com.avito.android.user_stats.extended_user_stats.metrics;

import Y41.l;
import Y61.k;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.chips.h;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MetricsBottomSheetDialog.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/metrics/b;", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements Chips.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f317282a;

    public b(a aVar) {
        this.f317282a = aVar;
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void b(@k h hVar) {
        if (hVar instanceof PJ0.a) {
            a aVar = this.f317282a;
            l<? super f, G0> lVar = aVar.f317275b;
            if (lVar != null) {
                PJ0.a aVar2 = (PJ0.a) hVar;
                lVar.invoke(new f(new com.avito.android.lib.design.bottom_sheet.k(aVar2.f12965c, aVar2.f12964b, null, null, null, null, null, null, null, null, null, null, 4092, null), "suggest"));
            }
            com.avito.android.lib.design.bottom_sheet.d dVar = aVar.f317277d;
            if (dVar == null) {
                dVar = null;
            }
            dVar.r();
        }
    }

    @Override // com.avito.android.lib.design.chips.Chips.c
    public final void a(@k h hVar) {
    }
}
