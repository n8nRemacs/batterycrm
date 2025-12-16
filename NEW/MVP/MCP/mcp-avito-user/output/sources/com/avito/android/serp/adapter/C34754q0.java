package com.avito.android.serp.adapter;

import com.avito.android.analytics.C28456h;
import com.avito.android.analytics.event.ImageViewportEvent;
import kotlin.Metadata;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: RdsAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "width", "height", "Lru/avito/component/serp/AsyncViewportTracker$ViewContext;", "context", "Lkotlin/G0;", "invoke", "(IILru/avito/component/serp/AsyncViewportTracker$ViewContext;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.serp.adapter.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34754q0 extends kotlin.jvm.internal.N implements Y41.q<Integer, Integer, AsyncViewportTracker.ViewContext, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C34755r0 f270531l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34754q0(C34755r0 c34755r0) {
        super(3);
        this.f270531l = c34755r0;
    }

    @Override // Y41.q
    public final kotlin.G0 invoke(Integer num, Integer num2, AsyncViewportTracker.ViewContext viewContext) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C34755r0 c34755r0 = this.f270531l;
        C28456h.a(c34755r0.f270536c, new ImageViewportEvent(iIntValue, iIntValue2, viewContext.f430437b, null, null, null, null, 120, null));
        return kotlin.G0.f406611a;
    }
}
