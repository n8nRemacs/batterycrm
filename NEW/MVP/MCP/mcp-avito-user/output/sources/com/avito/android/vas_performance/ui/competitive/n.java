package com.avito.android.vas_performance.ui.competitive;

import com.avito.android.remote.model.notification.NotificationOpenAtTab;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CompetitiveVasViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", NotificationOpenAtTab.TAB, "Lkotlin/G0;", "accept", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f321493b;

    public n(p pVar) {
        this.f321493b = pVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        int iIntValue = ((Number) obj).intValue();
        p pVar = this.f321493b;
        pVar.f321506T = iIntValue;
        CL0.c cVar = pVar.f321505S;
        if (cVar != null) {
            pVar.le(cVar);
        }
    }
}
