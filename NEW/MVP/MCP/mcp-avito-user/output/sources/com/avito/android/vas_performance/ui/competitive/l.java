package com.avito.android.vas_performance.ui.competitive;

import com.avito.android.vas_performance.ui.items.competitive_vas.c;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CompetitiveVasViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_performance/ui/items/competitive_vas/c;", "buttonState", "Lkotlin/G0;", "accept", "(Lcom/avito/android/vas_performance/ui/items/competitive_vas/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class l<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f321491b;

    public l(p pVar) {
        this.f321491b = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.vas_performance.ui.items.competitive_vas.c cVar = (com.avito.android.vas_performance.ui.items.competitive_vas.c) obj;
        boolean z12 = cVar instanceof c.b;
        p pVar = this.f321491b;
        if (z12) {
            pVar.f321507U++;
        } else if (cVar instanceof c.a) {
            pVar.f321507U--;
        }
        CL0.c cVar2 = pVar.f321505S;
        if (cVar2 != null) {
            pVar.le(cVar2);
        }
    }
}
