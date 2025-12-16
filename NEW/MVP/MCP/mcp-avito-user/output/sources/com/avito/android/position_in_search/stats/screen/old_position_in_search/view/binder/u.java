package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder;

import X80.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SearchPositionViewStateBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class u extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f220824l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(e eVar) {
        super(1);
        this.f220824l = eVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        this.f220824l.f220786b.accept(new b.d(deepLink));
        return G0.f406611a;
    }
}
