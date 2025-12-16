package com.avito.android.rubricator.list.service.item;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.rubricator.list.service.model.ServiceListItem;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ServiceItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class e extends N implements l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f255994l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceListItem f255995m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, ServiceListItem serviceListItem) {
        super(1);
        this.f255994l = fVar;
        this.f255995m = serviceListItem;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        f fVar = this.f255994l;
        b.a.a(fVar.f255996b, deepLink, null, null, 6);
        fVar.f255997c.s1();
        d.a.a(fVar.f255998d, null, "all_service_screen", this.f255995m.f256012d, null, null, null, null, null, 249);
        return G0.f406611a;
    }
}
