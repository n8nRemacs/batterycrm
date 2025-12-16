package com.avito.android.serp.adapter.vertical_main.publish;

import com.avito.android.serp.adapter.vertical_main.VerticalPublishData;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalPublishPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/a;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/serp/adapter/vertical_main/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f273112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f273113c;

    public h(f fVar, Y41.a<G0> aVar) {
        this.f273112b = fVar;
        this.f273113c = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.serp.adapter.vertical_main.a aVar = (com.avito.android.serp.adapter.vertical_main.a) obj;
        if (!(aVar instanceof VerticalPublishData)) {
            aVar = null;
        }
        f fVar = this.f273112b;
        fVar.f273109s = (VerticalPublishData) aVar;
        fVar.v();
        this.f273113c.invoke();
    }
}
