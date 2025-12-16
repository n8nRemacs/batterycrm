package com.avito.android.extended_profile;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.DeeplinkAction;
import fA.InterfaceC40265a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedProfileMviView.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class Q extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DeeplinkAction f149349l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ A f149350m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(DeeplinkAction deeplinkAction, A a12) {
        super(0);
        this.f149349l = deeplinkAction;
        this.f149350m = a12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        DeeplinkAction deeplinkAction = this.f149349l;
        if (deeplinkAction != null && (deepLink = deeplinkAction.getDeepLink()) != null) {
            this.f149350m.f149244d.accept(new InterfaceC40265a.C40267c(deepLink));
        }
        return G0.f406611a;
    }
}
