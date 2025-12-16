package com.avito.android.search.filter.adapter.category_group;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.NavigationNode;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CategoryGroupItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "link", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class k extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f262067l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.d f262068m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, ParameterElement.d dVar) {
        super(1);
        this.f262067l = pVar;
        this.f262068m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        Object next;
        DeepLink deepLink2 = deepLink;
        p pVar = this.f262067l;
        pVar.f262082g.accept(G0.f406611a);
        List<NavigationNode> list = this.f262068m.f262744g;
        List<String> unsetParams = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (L.f(((NavigationNode) next).getDeeplink(), deepLink2)) {
                    break;
                }
            }
            NavigationNode navigationNode = (NavigationNode) next;
            if (navigationNode != null) {
                unsetParams = navigationNode.getUnsetParams();
            }
        }
        pVar.f262081f.accept(new C34537a(deepLink2, unsetParams));
        return G0.f406611a;
    }
}
