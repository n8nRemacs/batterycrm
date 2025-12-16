package com.avito.android.messenger.conversation.mvi.messages.renderers.messages.message_content;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.conversation.T1;
import com.avito.android.messenger.conversation.mvi.messages.h0;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PlatformItemMessageFromAvitoContentRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class F extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.messenger.conversation.mvi.messages.h0, G0> f193236l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T1.d f193237m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F(Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.h0, G0> lVar, T1.d dVar) {
        super(1);
        this.f193236l = lVar;
        this.f193237m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        this.f193236l.invoke(new h0.e(deepLink, this.f193237m.f189180o));
        return G0.f406611a;
    }
}
