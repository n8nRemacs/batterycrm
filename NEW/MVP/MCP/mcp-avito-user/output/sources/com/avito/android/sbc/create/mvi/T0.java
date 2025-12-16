package com.avito.android.sbc.create.mvi;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;

/* compiled from: CreateDiscountDispatchView.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "id", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class T0 extends kotlin.jvm.internal.N implements Y41.p<DeepLink, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M0 f259507l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(M0 m02) {
        super(2);
        this.f259507l = m02;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(DeepLink deepLink, Integer num) {
        this.f259507l.f259413t0.accept(new kotlin.Q(deepLink, Integer.valueOf(num.intValue())));
        return kotlin.G0.f406611a;
    }
}
