package com.avito.android.serp.adapter.vertical_main.publish;

import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: VerticalPublishPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f273114b;

    public i(f fVar) {
        this.f273114b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        f fVar = this.f273114b;
        com.avito.android.serp.adapter.vertical_main.vertical_filter.item.f fVar2 = fVar.f273105o;
        if (fVar2 != null) {
            fVar2.Of(null, false);
        }
        V2.f318762a.a("VerticalFilterPresenterImpl", "load search form filter error", th2);
        fVar.f273101k.accept(th2);
        fVar.f273103m.K5(th2);
    }
}
