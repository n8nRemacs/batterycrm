package com.avito.android.service_order_widget.link;

import Y41.p;
import com.avito.android.B2;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.service_order_widget.link.o;
import ev.AbstractC40161a;
import java.util.Arrays;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import wu0.C49684a;

/* compiled from: SendServiceOrderRequestLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.service_order_widget.link.SendServiceOrderRequestLinkHandler$internalHandle$1", f = "SendServiceOrderRequestLinkHandler.kt", i = {}, l = {158, 163}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f278978q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f278979r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ DeepLink f278980s;

    /* compiled from: SendServiceOrderRequestLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.service_order_widget.link.SendServiceOrderRequestLinkHandler$internalHandle$1$1", f = "SendServiceOrderRequestLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ TypedResult<com.avito.android.service_order_widget.domain.f> f278981q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f278982r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ DeepLink f278983s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(TypedResult<com.avito.android.service_order_widget.domain.f> typedResult, b bVar, com.avito.android.service_order_widget.link.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f278981q = typedResult;
            this.f278982r = bVar;
            this.f278983s = (DeepLink) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.deep_linking.links.DeepLink, com.avito.android.service_order_widget.link.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f278981q, this.f278982r, this.f278983s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [com.avito.android.deep_linking.links.DeepLink, com.avito.android.service_order_widget.link.a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            TypedResult<com.avito.android.service_order_widget.domain.f> typedResult = this.f278981q;
            boolean z12 = typedResult instanceof TypedResult.Error;
            ?? r32 = this.f278983s;
            b bVar = this.f278982r;
            if (z12) {
                b.a(bVar, ((TypedResult.Error) typedResult).getError(), r32.getF278944c());
            } else if (typedResult instanceof TypedResult.Success) {
                com.avito.android.service_order_widget.domain.f fVar = (com.avito.android.service_order_widget.domain.f) ((TypedResult.Success) typedResult).getResult();
                B2 b22 = bVar.f278958l;
                b22.getClass();
                kotlin.reflect.n<Object> nVar = B2.f67184X[35];
                if (((Boolean) b22.f67192H.a().invoke()).booleanValue() && (r32 instanceof SendServiceOrderRequestWithPhotoLink)) {
                    SendServiceOrderRequestWithPhotoLink sendServiceOrderRequestWithPhotoLink = (SendServiceOrderRequestWithPhotoLink) r32;
                    String str = sendServiceOrderRequestWithPhotoLink.f278947f;
                    if (str == null && sendServiceOrderRequestWithPhotoLink.f278946e.isEmpty()) {
                        AbstractC40161a<?> abstractC40161a = bVar.f278962p;
                        if (abstractC40161a != null) {
                            abstractC40161a.j(new o.d(sendServiceOrderRequestWithPhotoLink.f278944c, fVar.f278837c));
                        }
                    } else {
                        e eVar = new e(bVar, sendServiceOrderRequestWithPhotoLink, fVar, null);
                        AbstractC40161a<?> abstractC40161a2 = bVar.f278962p;
                        if (abstractC40161a2 != null) {
                            bVar.f278952f.b(sendServiceOrderRequestWithPhotoLink, abstractC40161a2, null, new i(bVar, sendServiceOrderRequestWithPhotoLink, str, eVar));
                        }
                    }
                } else {
                    String itemId = r32.getF278944c();
                    String strC = r32.getF278943b();
                    a.i.C4057a.d(bVar.f278956j, com.avito.android.printable_text.a.b(R.string.default_service_order_sent_message, fVar.f278836b), null, null, null, 0, ToastBarPosition.f181047e, null, null, 1982);
                    bVar.f278959m.c(new C49684a(itemId, null, 2, null));
                    bVar.f278957k.b(itemId, strC);
                    AbstractC40161a<?> abstractC40161a3 = bVar.f278962p;
                    if (abstractC40161a3 != null) {
                        o.c cVar = new o.c(itemId, fVar.f278837c);
                        DeepLink deepLink = fVar.f278835a;
                        DeepLink[] deepLinkArr = deepLink != null ? new DeepLink[]{deepLink} : new DeepLink[0];
                        abstractC40161a3.i(cVar, bVar.f278955i, (DeepLink[]) Arrays.copyOf(deepLinkArr, deepLinkArr.length));
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(b bVar, com.avito.android.service_order_widget.link.a aVar, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f278979r = bVar;
        this.f278980s = (DeepLink) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.avito.android.deep_linking.links.DeepLink, com.avito.android.service_order_widget.link.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new f(this.f278979r, this.f278980s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.avito.android.deep_linking.links.DeepLink, com.avito.android.service_order_widget.link.a] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f278978q;
        ?? r22 = this.f278980s;
        b bVar = this.f278979r;
        if (i12 == 0) {
            C42729a0.b(obj);
            com.avito.android.service_order_widget.domain.a aVar = bVar.f278953g;
            String strC = r22.getF278943b();
            String itemId = r22.getF278944c();
            Integer numE = r22.getF278945d();
            this.f278978q = 1;
            obj = aVar.a(strC, itemId, numE, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        AbstractC43129d1 abstractC43129d1B = bVar.f278954h.b();
        a aVar2 = new a((TypedResult) obj, bVar, r22, null);
        this.f278978q = 2;
        if (C43259k.g(abstractC43129d1B, aVar2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
