package com.avito.android.re_agent_landing.landing.items.action_block;

import Sh0.InterfaceC15186a;
import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ActionBlockPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f250743l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f250744m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, f fVar) {
        super(0);
        this.f250743l = cVar;
        this.f250744m = fVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        String str;
        c cVar = this.f250743l;
        ActionStatus actionStatus = cVar.f250736c;
        ActionStatus actionStatus2 = ActionStatus.f250711b;
        f fVar = this.f250744m;
        l<InterfaceC15186a, G0> lVar = fVar.f250745b;
        if (actionStatus == actionStatus2) {
            lVar.invoke(InterfaceC15186a.c.f15115a);
        } else {
            if (actionStatus == ActionStatus.f250713d && (str = cVar.f250742i) != null) {
                fVar.f250746c.c(new Ph0.c(str));
            }
            j jVar = cVar.f250740g;
            if (jVar != null && (deepLink = jVar.f250756b) != null) {
                lVar.invoke(new InterfaceC15186a.b(deepLink, true));
            }
        }
        return G0.f406611a;
    }
}
