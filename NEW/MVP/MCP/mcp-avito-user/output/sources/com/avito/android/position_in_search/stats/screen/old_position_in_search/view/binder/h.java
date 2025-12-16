package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.binder;

import X80.b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SearchPositionViewStateBinder.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "queryId", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.p<String, DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f220811l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar) {
        super(2);
        this.f220811l = eVar;
    }

    @Override // Y41.p
    public final G0 invoke(String str, DeepLink deepLink) {
        e eVar = this.f220811l;
        eVar.f220786b.accept(new b.k(str, deepLink));
        return G0.f406611a;
    }
}
