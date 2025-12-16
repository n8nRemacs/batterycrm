package com.avito.android.publish.screen.step.params.view;

import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.publish.slots.card_select.item.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PublishDetailsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/publish/slots/card_select/item/k$b;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/slots/card_select/item/k$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class m extends N implements Y41.l<k.b, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f241647l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(j jVar) {
        super(1);
        this.f241647l = jVar;
    }

    @Override // Y41.l
    public final G0 invoke(k.b bVar) {
        j jVar = this.f241647l;
        jVar.f241603a.post(new RunnableC28882d(27, jVar, bVar));
        return G0.f406611a;
    }
}
