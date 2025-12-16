package com.avito.android.vas_performance.ui.visual_legacy;

import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import w50.InterfaceC49447a;

/* compiled from: VisualVasFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class i extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ VisualVasFragment f322113l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(VisualVasFragment visualVasFragment) {
        super(1);
        this.f322113l = visualVasFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        G0 g02;
        DeepLink deepLink2 = deepLink;
        VisualVasFragment visualVasFragment = this.f322113l;
        if (deepLink2 != null) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = visualVasFragment.f322089t0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink2, null, null, 6);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            InterfaceC49447a interfaceC49447a = visualVasFragment.f322077C0;
            (interfaceC49447a != null ? interfaceC49447a : null).r1();
        }
        return G0.f406611a;
    }
}
