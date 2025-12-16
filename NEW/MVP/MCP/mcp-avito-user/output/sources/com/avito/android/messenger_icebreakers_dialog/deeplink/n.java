package com.avito.android.messenger_icebreakers_dialog.deeplink;

import com.avito.android.iac_dialer_models.abstract_module.IacCallContext;
import io.reactivex.rxjava3.kotlin.A1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MessengerIcebreakerDialogDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class n extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f197610l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f197611m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ IacCallContext f197612n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Boolean f197613o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar, String str, IacCallContext iacCallContext, Boolean bool) {
        super(0);
        this.f197610l = aVar;
        this.f197611m = str;
        this.f197612n = iacCallContext;
        this.f197613o = bool;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f197610l;
        io.reactivex.rxjava3.disposables.c cVar = aVar.f197573v;
        IacCallContext iacCallContext = this.f197612n;
        WL.a aVar2 = aVar.f197572u;
        String str = this.f197611m;
        Boolean bool = this.f197613o;
        cVar.b(A1.e(aVar2.a(str, iacCallContext, null, bool, null).S().s(aVar.f197565n.a()), new l(aVar, str, bool), new m(aVar)));
        return G0.f406611a;
    }
}
