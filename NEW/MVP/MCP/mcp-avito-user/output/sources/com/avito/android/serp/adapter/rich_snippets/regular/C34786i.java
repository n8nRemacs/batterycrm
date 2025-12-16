package com.avito.android.serp.adapter.rich_snippets.regular;

import com.avito.android.analytics.C28456h;
import com.avito.android.analytics.event.ImageViewportEvent;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertRichItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "width", "height", "Lru/avito/component/serp/AsyncViewportTracker$ViewContext;", "context", "Lkotlin/G0;", "invoke", "(IILru/avito/component/serp/AsyncViewportTracker$ViewContext;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.rich_snippets.regular.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34786i extends kotlin.jvm.internal.N implements Y41.q<Integer, Integer, AsyncViewportTracker.ViewContext, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34797u f271178l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34786i(C34797u c34797u) {
        super(3);
        this.f271178l = c34797u;
    }

    @Override // Y41.q
    public final G0 invoke(Integer num, Integer num2, AsyncViewportTracker.ViewContext viewContext) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C34797u c34797u = this.f271178l;
        C28456h.a(c34797u.f271214e, new ImageViewportEvent(iIntValue, iIntValue2, viewContext.f430437b, null, null, null, null, 120, null));
        return G0.f406611a;
    }
}
