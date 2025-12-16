package com.avito.android.gsm_s2b_call_action.impl_module.link;

import Y41.p;
import Y61.k;
import Y61.l;
import cI.InterfaceC27039a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.gsm_s2b_call_action.impl_module.link.GsmS2BCallActionLink;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35936s;
import com.avito.android.util.V2;
import dI.C39584a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: GsmS2BCallActionLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gsm_s2b_call_action.impl_module.link.GsmS2BCallActionLinkHandler$doHandleSuspend$2", f = "GsmS2BCallActionLinkHandler.kt", i = {}, l = {40, 46, 61}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f161287q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.gsm_s2b_call_action.impl_module.link.b f161288r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GsmS2BCallActionLink f161289s;

    /* compiled from: GsmS2BCallActionLinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gsm_s2b_call_action.impl_module.link.GsmS2BCallActionLinkHandler$doHandleSuspend$2$1", f = "GsmS2BCallActionLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.gsm_s2b_call_action.impl_module.link.a$a, reason: collision with other inner class name */
    public static final class C4721a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ TypedResult<C39584a> f161290q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.gsm_s2b_call_action.impl_module.link.b f161291r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4721a(TypedResult<C39584a> typedResult, com.avito.android.gsm_s2b_call_action.impl_module.link.b bVar, Continuation<? super C4721a> continuation) {
            super(2, continuation);
            this.f161290q = typedResult;
            this.f161291r = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C4721a(this.f161290q, this.f161291r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C4721a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            TypedResult<C39584a> typedResult = this.f161290q;
            boolean z12 = typedResult instanceof TypedResult.Success;
            com.avito.android.gsm_s2b_call_action.impl_module.link.b bVar = this.f161291r;
            if (z12) {
                C39584a c39584a = (C39584a) ((TypedResult.Success) typedResult).getResult();
                if (c39584a.getAction() == null || (c39584a.getAction() instanceof NoMatchLink)) {
                    com.avito.android.gsm_s2b_call_action.impl_module.link.b.o(bVar, new UnsupportedOperationException("bad response from api.getSellerToBuyerCallAction: action=" + c39584a.getAction() + ", noActionReason=" + c39584a.getNoActionReason()));
                } else {
                    DeepLink action = c39584a.getAction();
                    bVar.getClass();
                    V2.f318762a.c("GsmS2BCallActionLinkHandler", "onSuccess: " + action, null);
                    bVar.f161299l.g(null, false);
                    bVar.i(GsmS2BCallActionLink.b.a.f161285b, bVar.f161297j, action);
                }
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                TypedResult.Error error = (TypedResult.Error) typedResult;
                com.avito.android.gsm_s2b_call_action.impl_module.link.b.o(bVar, C35936s.a(error.getError(), error.getCause()));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: GsmS2BCallActionLinkHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gsm_s2b_call_action.impl_module.link.GsmS2BCallActionLinkHandler$doHandleSuspend$2$2", f = "GsmS2BCallActionLinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.gsm_s2b_call_action.impl_module.link.b f161292q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Throwable f161293r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.gsm_s2b_call_action.impl_module.link.b bVar, Throwable th2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f161292q = bVar;
            this.f161293r = th2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(this.f161292q, this.f161293r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.gsm_s2b_call_action.impl_module.link.b.o(this.f161292q, this.f161293r);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.avito.android.gsm_s2b_call_action.impl_module.link.b bVar, GsmS2BCallActionLink gsmS2BCallActionLink, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f161288r = bVar;
        this.f161289s = gsmS2BCallActionLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f161288r, this.f161289s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f161287q;
        com.avito.android.gsm_s2b_call_action.impl_module.link.b bVar = this.f161288r;
        try {
        } catch (Throwable th2) {
            AbstractC43129d1 abstractC43129d1B = bVar.f161295h.b();
            b bVar2 = new b(bVar, th2, null);
            this.f161287q = 3;
            if (C43259k.g(abstractC43129d1B, bVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC27039a interfaceC27039a = bVar.f161294g;
            GsmS2BCallActionLink gsmS2BCallActionLink = this.f161289s;
            String str = gsmS2BCallActionLink.f161281b;
            long j12 = gsmS2BCallActionLink.f161282c;
            String str2 = gsmS2BCallActionLink.f161283d;
            this.f161287q = 1;
            obj = interfaceC27039a.a(str, j12, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        AbstractC43129d1 abstractC43129d1B2 = bVar.f161295h.b();
        C4721a c4721a = new C4721a((TypedResult) obj, bVar, null);
        this.f161287q = 2;
        if (C43259k.g(abstractC43129d1B2, c4721a, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
