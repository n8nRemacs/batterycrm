package com.avito.android.publish.slots.contact_method.info_item;

import Y61.k;
import androidx.compose.runtime.internal.P;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ContactMethodInfoBlockItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/info_item/e;", "Lcom/avito/android/publish/slots/contact_method/info_item/c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final OL.a f243278b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<ContactMethodInfoBlockItem> f243279c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C41981q0 f243280d;

    @Inject
    public e(@k OL.a aVar) {
        this.f243278b = aVar;
        com.jakewharton.rxrelay3.c<ContactMethodInfoBlockItem> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243279c = cVar;
        this.f243280d = new C41981q0(cVar);
    }

    @Override // com.avito.android.publish.slots.contact_method.info_item.c
    @k
    /* renamed from: C7, reason: from getter */
    public final C41981q0 getF243280d() {
        return this.f243280d;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        ((g) eVar).g60(new d(this, (ContactMethodInfoBlockItem) aVar));
    }
}
