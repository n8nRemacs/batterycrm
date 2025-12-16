package com.avito.android.service_order_widget.link;

import Y41.p;
import com.avito.android.service_order_widget.link.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SendServiceOrderRequestLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_order_widget.link.SendServiceOrderRequestLinkHandler$sendMessage$1$1", f = "SendServiceOrderRequestLinkHandler.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class h extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f278987q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f278988r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SendServiceOrderRequestWithPhotoLink f278989s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f278990t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p<b.a, Continuation<? super G0>, Object> f278991u;

    /* compiled from: SendServiceOrderRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/service_order_widget/link/b$a;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/service_order_widget/link/b$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<b.a, Continuation<? super G0>, Object> f278992b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super b.a, ? super Continuation<? super G0>, ? extends Object> pVar) {
            this.f278992b = pVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            Object objInvoke = this.f278992b.invoke((b.a) obj, continuation);
            return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(b bVar, SendServiceOrderRequestWithPhotoLink sendServiceOrderRequestWithPhotoLink, String str, p<? super b.a, ? super Continuation<? super G0>, ? extends Object> pVar, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f278988r = bVar;
        this.f278989s = sendServiceOrderRequestWithPhotoLink;
        this.f278990t = str;
        this.f278991u = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new h(this.f278988r, this.f278989s, this.f278990t, this.f278991u, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f278987q;
        if (i12 == 0) {
            C42729a0.b(obj);
            SendServiceOrderRequestWithPhotoLink sendServiceOrderRequestWithPhotoLink = this.f278989s;
            String str = sendServiceOrderRequestWithPhotoLink.f278944c;
            b bVar = this.f278988r;
            bVar.getClass();
            InterfaceC43160i interfaceC43160iG = C43175k.G(new c(bVar, str, this.f278990t, sendServiceOrderRequestWithPhotoLink.f278946e, null));
            a aVar = new a(this.f278991u);
            this.f278987q = 1;
            if (interfaceC43160iG.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
