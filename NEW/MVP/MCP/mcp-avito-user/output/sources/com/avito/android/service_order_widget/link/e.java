package com.avito.android.service_order_widget.link;

import Cu0.InterfaceC13353a;
import Y41.p;
import com.avito.android.R;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.service_order_widget.link.b;
import com.avito.android.service_order_widget.link.o;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import wu0.C49684a;

/* compiled from: SendServiceOrderRequestLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/b$a;", "sendOrderRequestMessageResult", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/service_order_widget/link/b$a;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_order_widget.link.SendServiceOrderRequestLinkHandler$handleSuccessWithoutRedirect$1", f = "SendServiceOrderRequestLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class e extends SuspendLambda implements p<b.a, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f278974q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f278975r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SendServiceOrderRequestWithPhotoLink f278976s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.service_order_widget.domain.f f278977t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, SendServiceOrderRequestWithPhotoLink sendServiceOrderRequestWithPhotoLink, com.avito.android.service_order_widget.domain.f fVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f278975r = bVar;
        this.f278976s = sendServiceOrderRequestWithPhotoLink;
        this.f278977t = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f278975r, this.f278976s, this.f278977t, continuation);
        eVar.f278974q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(b.a aVar, Continuation<? super G0> continuation) {
        return ((e) create(aVar, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b.a aVar = (b.a) this.f278974q;
        boolean z12 = aVar instanceof b.a.C8295a;
        SendServiceOrderRequestWithPhotoLink sendServiceOrderRequestWithPhotoLink = this.f278976s;
        b bVar = this.f278975r;
        if (z12) {
            Throwable th2 = ((b.a.C8295a) aVar).f278963a;
            if (th2 != null) {
                V2.f318762a.f(th2);
            }
            AbstractC40161a<?> abstractC40161a = bVar.f278962p;
            if (abstractC40161a != null) {
                abstractC40161a.j(new o.a(sendServiceOrderRequestWithPhotoLink.f278944c, null));
            }
        } else if (L.f(aVar, b.a.C8296b.f278964a)) {
            bVar.getClass();
            bVar.f278959m.c(new C49684a(sendServiceOrderRequestWithPhotoLink.f278944c, null, 2, null));
            InterfaceC13353a interfaceC13353a = bVar.f278957k;
            String str = sendServiceOrderRequestWithPhotoLink.f278944c;
            interfaceC13353a.b(str, sendServiceOrderRequestWithPhotoLink.f278943b);
            com.avito.android.service_order_widget.domain.f fVar = this.f278977t;
            a.i.C4057a.d(bVar.f278956j, com.avito.android.printable_text.a.b(R.string.default_service_order_sent_message, fVar.f278836b), null, null, null, 0, ToastBarPosition.f181047e, null, null, 1982);
            AbstractC40161a<?> abstractC40161a2 = bVar.f278962p;
            if (abstractC40161a2 != null) {
                abstractC40161a2.j(new o.d(str, fVar.f278837c));
            }
        }
        return G0.f406611a;
    }
}
