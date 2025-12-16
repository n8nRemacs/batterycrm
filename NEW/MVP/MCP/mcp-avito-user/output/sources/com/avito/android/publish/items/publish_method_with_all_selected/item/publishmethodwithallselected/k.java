package com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected;

import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PublishMethodWithAllSelectedPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/publish_method_with_all_selected/item/publishmethodwithallselected/k;", "Lcom/avito/android/publish/items/publish_method_with_all_selected/item/publishmethodwithallselected/g;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f237096b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<ParameterElement.A> f237097c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f237098d;

    @Inject
    public k(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f237096b = aVar;
        com.jakewharton.rxrelay3.c<ParameterElement.A> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f237097c = cVar;
        this.f237098d = new C41981q0(cVar);
    }

    @Override // com.avito.android.publish.items.publish_method_with_all_selected.item.publishmethodwithallselected.g
    @Y61.k
    /* renamed from: F5, reason: from getter */
    public final C41981q0 getF237098d() {
        return this.f237098d;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ParameterElement.A a12 = (ParameterElement.A) aVar;
        this.f237097c.accept(a12);
        ((m) eVar).EU(a12, new h(this, a12), new i(this));
    }
}
