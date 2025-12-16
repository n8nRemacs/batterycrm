package com.avito.android.messenger_icebreakers_dialog.deeplink;

import io.reactivex.rxjava3.internal.operators.single.S;
import io.reactivex.rxjava3.kotlin.A1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f197592l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MessengerIcebreakerDialogDeeplink f197593m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink) {
        super(0);
        this.f197592l = aVar;
        this.f197593m = messengerIcebreakerDialogDeeplink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f197592l;
        S s5 = ru.avito.messenger.G0.a(aVar.f197563l).s(aVar.f197565n.c());
        MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink = this.f197593m;
        aVar.f197573v.b(A1.e(s5.n(new e(aVar, messengerIcebreakerDialogDeeplink)), new f(aVar), new g(aVar, messengerIcebreakerDialogDeeplink)));
        return G0.f406611a;
    }
}
