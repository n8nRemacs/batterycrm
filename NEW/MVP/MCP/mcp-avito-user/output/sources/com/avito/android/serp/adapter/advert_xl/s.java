package com.avito.android.serp.adapter.advert_xl;

import com.avito.android.analytics.C28456h;
import com.avito.android.analytics.event.ImageViewportEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: AdvertXlItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "width", "height", "Lru/avito/component/serp/AsyncViewportTracker$ViewContext;", "context", "Lkotlin/G0;", "invoke", "(IILru/avito/component/serp/AsyncViewportTracker$ViewContext;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class s extends N implements Y41.q<Integer, Integer, AsyncViewportTracker.ViewContext, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u f268863l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar) {
        super(3);
        this.f268863l = uVar;
    }

    @Override // Y41.q
    public final G0 invoke(Integer num, Integer num2, AsyncViewportTracker.ViewContext viewContext) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        u uVar = this.f268863l;
        C28456h.a(uVar.f268873h, new ImageViewportEvent(iIntValue, iIntValue2, viewContext.f430437b, null, null, null, null, 120, null));
        return G0.f406611a;
    }
}
