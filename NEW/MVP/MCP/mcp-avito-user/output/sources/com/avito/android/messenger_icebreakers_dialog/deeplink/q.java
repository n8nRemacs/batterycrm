package com.avito.android.messenger_icebreakers_dialog.deeplink;

import io.reactivex.rxjava3.internal.operators.observable.T;
import io.reactivex.rxjava3.kotlin.A1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class q extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f197622l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ MessengerIcebreakerDialogDeeplink f197623m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f197624n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f197625o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D8.c f197626p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(a aVar, MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink, String str, String str2, D8.c cVar) {
        super(0);
        this.f197622l = aVar;
        this.f197623m = messengerIcebreakerDialogDeeplink;
        this.f197624n = str;
        this.f197625o = str2;
        this.f197626p = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f197622l;
        io.reactivex.rxjava3.disposables.c cVar = aVar.f197573v;
        T tA2 = ru.avito.messenger.G0.a(aVar.f197563l);
        String str = this.f197625o;
        String str2 = this.f197624n;
        MessengerIcebreakerDialogDeeplink messengerIcebreakerDialogDeeplink = this.f197623m;
        cVar.b(A1.e(tA2.n(new k(aVar, str, str2, messengerIcebreakerDialogDeeplink)).s(aVar.f197565n.a()), new o(this.f197622l, this.f197623m, this.f197624n, this.f197625o, this.f197626p), new p(aVar, messengerIcebreakerDialogDeeplink, this.f197626p)));
        return G0.f406611a;
    }
}
