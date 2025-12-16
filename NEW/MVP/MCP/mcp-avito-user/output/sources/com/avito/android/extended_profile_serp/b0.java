package com.avito.android.extended_profile_serp;

import bB.InterfaceC25487a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class b0 extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ F f152646l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(F f12) {
        super(1);
        this.f152646l = f12;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        this.f152646l.f152526c.invoke(new InterfaceC25487a.f(deepLink));
        return G0.f406611a;
    }
}
