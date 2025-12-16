package com.avito.android.user_adverts.root_screen.adverts_host.host_view;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.user_adverts.root_screen.adverts_host.host_view.HostViewState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HostViewRenderer.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class r extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ HostViewState.a.C9588a f313085l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f313086m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(HostViewState.a.C9588a c9588a, j jVar) {
        super(0);
        this.f313085l = c9588a;
        this.f313086m = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        HostViewState.f fVar = this.f313085l.f312975e;
        if (fVar != null && (deepLink = fVar.f312987b) != null) {
            b.a.a(this.f313086m.f313019a, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}
