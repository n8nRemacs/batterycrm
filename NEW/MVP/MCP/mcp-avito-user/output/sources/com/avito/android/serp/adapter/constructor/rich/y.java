package com.avito.android.serp.adapter.constructor.rich;

import com.avito.android.analytics.C28456h;
import com.avito.android.analytics.event.ImageViewportEvent;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import ru.avito.component.serp.AsyncViewportTracker;

/* compiled from: ConstructorAdvertItemRichPresenter.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "width", "height", "Lru/avito/component/serp/AsyncViewportTracker$ViewContext;", "context", "Lkotlin/G0;", "invoke", "(IILru/avito/component/serp/AsyncViewportTracker$ViewContext;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class y extends N implements Y41.q<Integer, Integer, AsyncViewportTracker.ViewContext, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f269711l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f269712m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, Map<String, String> map) {
        super(3);
        this.f269711l = zVar;
        this.f269712m = map;
    }

    @Override // Y41.q
    public final G0 invoke(Integer num, Integer num2, AsyncViewportTracker.ViewContext viewContext) {
        String str;
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        AsyncViewportTracker.ViewContext viewContext2 = viewContext;
        z zVar = this.f269711l;
        Map<String, String> map = this.f269712m;
        if (map == null || (str = map.get("image")) == null) {
            str = viewContext2.f430437b;
        }
        C28456h.a(zVar.f269716e, new ImageViewportEvent(str, map != null ? map.get("screen") : null, map != null ? map.get("view") : null, iIntValue, iIntValue2, map != null ? map.get("type") : null, map != null ? map.get("place") : null));
        return G0.f406611a;
    }
}
