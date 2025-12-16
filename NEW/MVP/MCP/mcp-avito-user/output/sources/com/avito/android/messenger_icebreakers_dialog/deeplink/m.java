package com.avito.android.messenger_icebreakers_dialog.deeplink;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger_icebreakers_dialog.deeplink.MessengerIcebreakerDialogDeeplink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "phoneDeeplink", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class m extends N implements Y41.l<DeepLink, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f197609l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(a aVar) {
        super(1);
        this.f197609l = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        MessengerIcebreakerDialogDeeplink.b.d dVar = MessengerIcebreakerDialogDeeplink.b.d.f197555b;
        a aVar = this.f197609l;
        aVar.i(dVar, aVar.f197567p, deepLink);
        return G0.f406611a;
    }
}
