package com.avito.android.constructor_advert.ui.serp.constructor;

import com.avito.android.analytics.C28456h;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.ImageViewportEvent;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: SharedConstructorAdvertItemPresenter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u00020\u0007\"\n\b\u0000\u0010\u0001 \u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "T", "", "width", "height", "Lru/avito/component/serp/AsyncViewportTracker$ViewContext;", "context", "Lkotlin/G0;", "invoke", "(IILru/avito/component/serp/AsyncViewportTracker$ViewContext;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class y extends N implements Y41.q<Integer, Integer, AsyncViewportTracker.ViewContext, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x<ConstructorAdvertItem> f125858l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f125859m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(x<ConstructorAdvertItem> xVar, Map<String, String> map) {
        super(3);
        this.f125858l = xVar;
        this.f125859m = map;
    }

    @Override // Y41.q
    public final G0 invoke(Integer num, Integer num2, AsyncViewportTracker.ViewContext viewContext) {
        String str;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        AsyncViewportTracker.ViewContext viewContext2 = viewContext;
        InterfaceC28373a interfaceC28373a = this.f125858l.f125835c;
        Map<String, String> map = this.f125859m;
        if (map == null || (str = map.get("image")) == null) {
            str = viewContext2.f430437b;
        }
        C28456h.a(interfaceC28373a, new ImageViewportEvent(str, map != null ? map.get("screen") : null, map != null ? map.get("view") : null, iIntValue, iIntValue2, map != null ? map.get("type") : null, map != null ? map.get("place") : null));
        return G0.f406611a;
    }
}
