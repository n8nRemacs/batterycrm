package com.avito.android.bxcontent.last_search_tooltip;

import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ls0.C43825a;
import ls0.C43826b;

/* compiled from: LastSearchTooltipInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lls0/a;", "it", "Lcom/avito/android/bxcontent/last_search_tooltip/a;", "invoke", "(Lls0/a;)Lcom/avito/android/bxcontent/last_search_tooltip/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class e extends N implements Y41.l<C43825a, a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f111167l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar) {
        super(1);
        this.f111167l = cVar;
    }

    @Override // Y41.l
    public final a invoke(C43825a c43825a) {
        C43826b tooltipWidget = c43825a.getTooltipWidget();
        if (tooltipWidget != null) {
            return this.f111167l.f111152b.a(tooltipWidget);
        }
        return null;
    }
}
