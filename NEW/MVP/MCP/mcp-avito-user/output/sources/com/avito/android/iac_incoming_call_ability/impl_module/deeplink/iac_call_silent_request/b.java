package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_call_silent_request;

import com.avito.android.R;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_call_silent_request.IacCallSilentRequestDeeplink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacCallSilentRequestDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class b extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f168227l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f168227l = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        c cVar = this.f168227l;
        cVar.f168229g.Y1(R.string.iac_incoming_call_ability_impl_order_call_send_request_success);
        cVar.j(IacCallSilentRequestDeeplink.b.a.f168393b);
        return G0.f406611a;
    }
}
