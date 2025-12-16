package com.avito.android.iac_incoming_call_ability.impl_module.deeplink.iac_voip_call_request;

import Y41.l;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.iac_incoming_call_ability.public_module.deeplink.iac_call_silent_request.IacCallSilentRequestDeeplink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import java.io.Serializable;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacVoipCallRequestDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class a extends N implements l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f168276l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(1);
        this.f168276l = cVar;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        c cVar = this.f168276l;
        a.i.C4057a.d(cVar.f168279f, com.avito.android.printable_text.b.c(R.string.iac_incoming_call_ability_impl_order_call_send_request_error, new Serializable[0]), null, null, new f.c(th2), 0, ToastBarPosition.f181047e, null, null, 1966);
        cVar.j(IacCallSilentRequestDeeplink.b.C4978b.f168394b);
        return G0.f406611a;
    }
}
