package com.avito.android.messenger_icebreakers_dialog.deeplink;

import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.messenger_icebreakers_dialog.deeplink.MessengerIcebreakerDialogDeeplink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f197627l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MessengerIcebreakerDialogDeeplink f197628m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(a aVar, MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink) {
        super(0);
        this.f197627l = aVar;
        this.f197628m = messengerIcebreakerDialogDeeplink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        MessengerIcebreakerDialogDeeplink.b.e eVar = MessengerIcebreakerDialogDeeplink.b.e.f197556b;
        a aVar = this.f197627l;
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = aVar.f197567p;
        MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink = this.f197628m;
        aVar.i(eVar, aVar2, new CreateChannelLink(messengerIcebreakerDialogDeeplink.f197547b, null, messengerIcebreakerDialogDeeplink.f197548c, messengerIcebreakerDialogDeeplink.f197549d, false, false, messengerIcebreakerDialogDeeplink.f197550e, 50, null));
        return G0.f406611a;
    }
}
