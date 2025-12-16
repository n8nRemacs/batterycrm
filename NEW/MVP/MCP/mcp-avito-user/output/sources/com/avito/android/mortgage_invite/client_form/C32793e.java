package com.avito.android.mortgage_invite.client_form;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ApplicationClientFormFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage_invite.client_form.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32793e extends kotlin.jvm.internal.N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ApplicationClientFormFragment f205187l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32793e(ApplicationClientFormFragment applicationClientFormFragment) {
        super(1);
        this.f205187l = applicationClientFormFragment;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        DeepLink deepLink2 = deepLink;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f205187l.f205016n0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink2, null, null, 6);
        return G0.f406611a;
    }
}
