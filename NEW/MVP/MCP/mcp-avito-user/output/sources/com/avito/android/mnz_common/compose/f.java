package com.avito.android.mnz_common.compose;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MnzFloatingFooter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.mnz_common.ui.compose.model.a f197882l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f197883m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f197884n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(com.avito.android.mnz_common.ui.compose.model.a aVar, Y41.l<? super DeepLink, G0> lVar, Y41.a<G0> aVar2) {
        super(0);
        this.f197882l = aVar;
        this.f197883m = lVar;
        this.f197884n = aVar2;
    }

    @Override // Y41.a
    public final G0 invoke() {
        G0 g02;
        DeepLink deepLink = this.f197882l.f198003b;
        if (deepLink != null) {
            this.f197883m.invoke(deepLink);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            this.f197884n.invoke();
        }
        return G0.f406611a;
    }
}
