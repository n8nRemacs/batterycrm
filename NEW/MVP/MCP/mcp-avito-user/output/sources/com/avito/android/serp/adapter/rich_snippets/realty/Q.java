package com.avito.android.serp.adapter.rich_snippets.realty;

import com.avito.android.analytics.C28456h;
import com.avito.android.analytics.event.ImageViewportEvent;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: DevelopmentXlRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "width", "height", "Lru/avito/component/serp/AsyncViewportTracker$ViewContext;", "context", "Lkotlin/G0;", "invoke", "(IILru/avito/component/serp/AsyncViewportTracker$ViewContext;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.q<Integer, Integer, AsyncViewportTracker.ViewContext, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ S f270956l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s5) {
        super(3);
        this.f270956l = s5;
    }

    @Override // Y41.q
    public final G0 invoke(Integer num, Integer num2, AsyncViewportTracker.ViewContext viewContext) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        S s5 = this.f270956l;
        C28456h.a(s5.f270958c, new ImageViewportEvent(iIntValue, iIntValue2, viewContext.f430437b, null, null, null, null, 120, null));
        return G0.f406611a;
    }
}
