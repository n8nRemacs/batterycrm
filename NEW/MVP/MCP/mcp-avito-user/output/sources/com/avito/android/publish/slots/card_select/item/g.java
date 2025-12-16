package com.avito.android.publish.slots.card_select.item;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.publish.slots.card_select.item.k;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.slot.card_select.CardSelect;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CardSelectSlotItemPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/g;", "Lcom/avito/android/publish/slots/card_select/item/d;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<a> f243148b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243149c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<k> f243150d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243151e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<DeepLink> f243152f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C41981q0 f243153g;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<a> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f243148b = cVar;
        this.f243149c = new C41981q0(cVar);
        com.jakewharton.rxrelay3.c<k> cVar2 = new com.jakewharton.rxrelay3.c<>();
        this.f243150d = cVar2;
        this.f243151e = new C41981q0(cVar2.D(io.reactivex.rxjava3.internal.functions.a.f401991a));
        com.jakewharton.rxrelay3.c<DeepLink> cVar3 = new com.jakewharton.rxrelay3.c<>();
        this.f243152f = cVar3;
        this.f243153g = new C41981q0(cVar3);
    }

    @Override // com.avito.android.publish.slots.card_select.item.d
    @Y61.k
    /* renamed from: B7, reason: from getter */
    public final C41981q0 getF243151e() {
        return this.f243151e;
    }

    @Override // com.avito.android.publish.slots.card_select.item.d
    @Y61.k
    /* renamed from: M5, reason: from getter */
    public final C41981q0 getF243153g() {
        return this.f243153g;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Object next;
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        Iterator<T> it = aVar2.f243136c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((CardSelect) next).isChecked()) {
                    break;
                }
            }
        }
        CardSelect cardSelect = (CardSelect) next;
        this.f243150d.accept(cardSelect == null ? k.d.f243163a : cardSelect.getNavigationAction() == CategoryPublishStep.Params.NavigationButtonAction.CONTINUE_PUBLISH ? new k.c(cardSelect.getNavigationAction()) : new k.a(cardSelect.getNavigationButtonsDisclaimer(), cardSelect.getDeeplink(), cardSelect.getNavigationAction()));
        iVar.xC(aVar2.f243136c, aVar2.f243137d, aVar2.f243138e, new e(this, aVar2), new f(this));
    }

    @Override // com.avito.android.publish.slots.card_select.item.d
    @Y61.k
    /* renamed from: r2, reason: from getter */
    public final C41981q0 getF243149c() {
        return this.f243149c;
    }
}
