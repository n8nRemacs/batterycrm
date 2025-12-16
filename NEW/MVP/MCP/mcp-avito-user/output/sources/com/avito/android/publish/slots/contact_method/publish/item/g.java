package com.avito.android.publish.slots.contact_method.publish.item;

import Hj.C13996a;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PublishContactMethodPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/publish/item/g;", "Lcom/avito/android/publish/slots/contact_method/publish/item/e;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<PublishContactMethodItem> f243347b = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public g() {
    }

    @Override // com.avito.android.publish.slots.contact_method.publish.item.e
    /* renamed from: L, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF243347b() {
        return this.f243347b;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        c cVar = (c) eVar;
        PublishContactMethodItem publishContactMethodItem = (PublishContactMethodItem) aVar;
        cVar.a60(new C13996a(publishContactMethodItem.f243330c, new ItemWithState.State.Normal(null, 1, null), false, false, null, null, null, null, null, 508, null));
        cVar.setEnabled(publishContactMethodItem.f243333f);
        cVar.u60(publishContactMethodItem.f243332e);
        cVar.d6(publishContactMethodItem.f243331d);
        cVar.l0(new f(cVar, this, publishContactMethodItem));
    }
}
