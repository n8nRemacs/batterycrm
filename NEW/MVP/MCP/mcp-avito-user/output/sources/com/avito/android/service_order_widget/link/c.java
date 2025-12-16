package com.avito.android.service_order_widget.link;

import Y41.p;
import com.avito.android.service_order_widget.link.b;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SendServiceOrderRequestLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/service_order_widget/link/b$a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_order_widget.link.SendServiceOrderRequestLinkHandler$createChannelAndSendMessage$1", f = "SendServiceOrderRequestLinkHandler.kt", i = {0, 1, 1, 2, 2, 3}, l = {287, 290, 292, 293, 294, 296, 299}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "userInfo", "$this$flow", "chat", "$this$flow"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super b.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public Object f278965q;

    /* renamed from: r, reason: collision with root package name */
    public int f278966r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f278967s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f278968t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f278969u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f278970v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List<String> f278971w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str, String str2, List<String> list, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f278968t = bVar;
        this.f278969u = str;
        this.f278970v = str2;
        this.f278971w = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f278968t, this.f278969u, this.f278970v, this.f278971w, continuation);
        cVar.f278967s = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super b.a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_order_widget.link.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
