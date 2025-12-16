package com.avito.android.edit_carousel.mvi;

import Y41.p;
import Y41.q;
import com.avito.android.edit_carousel.mvi.a;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselInternalAction;
import com.avito.android.edit_carousel.mvi.entity.EditCarouselState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import ty.InterfaceC48738a;

/* compiled from: EditCarouselActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/edit_carousel/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "Lty/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.edit_carousel.mvi.EditCarouselActor$process$2", f = "EditCarouselActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements p<Q<? extends a.InterfaceC4255a, ? extends InterfaceC43160i<? extends InterfaceC48738a>>, Continuation<? super InterfaceC43160i<? extends EditCarouselInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f146444q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.edit_carousel.mvi.a f146445r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<EditCarouselState> f146446s;

    /* compiled from: EditCarouselActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lty/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/edit_carousel/mvi/entity/EditCarouselInternalAction;", "<anonymous>", "(Lty/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_carousel.mvi.EditCarouselActor$process$2$1", f = "EditCarouselActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC48738a, Continuation<? super InterfaceC43160i<? extends EditCarouselInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f146447q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.edit_carousel.mvi.a f146448r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<EditCarouselState> f146449s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, com.avito.android.edit_carousel.mvi.a aVar2, Continuation continuation) {
            super(2, continuation);
            this.f146448r = aVar2;
            this.f146449s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f146449s, this.f146448r, continuation);
            aVar.f146447q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC48738a interfaceC48738a, Continuation<? super InterfaceC43160i<? extends EditCarouselInternalAction>> continuation) {
            return ((a) create(interfaceC48738a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f146448r.b((InterfaceC48738a) this.f146447q, this.f146449s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.edit_carousel.mvi.EditCarouselActor$process$2$invokeSuspend$$inlined$flatMapLatest$1", f = "EditCarouselActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super EditCarouselInternalAction>, InterfaceC48738a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f146450q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f146451r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f146452s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.edit_carousel.mvi.a f146453t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f146454u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, com.avito.android.edit_carousel.mvi.a aVar2, Continuation continuation) {
            super(3, continuation);
            this.f146453t = aVar2;
            this.f146454u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super EditCarouselInternalAction> interfaceC43172j, InterfaceC48738a interfaceC48738a, Continuation<? super G0> continuation) {
            b bVar = new b(this.f146454u, this.f146453t, continuation);
            bVar.f146451r = interfaceC43172j;
            bVar.f146452s = interfaceC48738a;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f146450q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f146451r;
                InterfaceC43160i<EditCarouselInternalAction> interfaceC43160iC = this.f146453t.b((InterfaceC48738a) this.f146452s, (EditCarouselState) this.f146454u.invoke());
                this.f146450q = 1;
                if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Y41.a aVar, com.avito.android.edit_carousel.mvi.a aVar2, Continuation continuation) {
        super(2, continuation);
        this.f146445r = aVar2;
        this.f146446s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f146446s, this.f146445r, continuation);
        cVar.f146444q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends a.InterfaceC4255a, ? extends InterfaceC43160i<? extends InterfaceC48738a>> q12, Continuation<? super InterfaceC43160i<? extends EditCarouselInternalAction>> continuation) {
        return ((c) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f146444q;
        a.InterfaceC4255a interfaceC4255a = (a.InterfaceC4255a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = L.f(interfaceC4255a, a.InterfaceC4255a.b.f146423a);
        Y41.a<EditCarouselState> aVar = this.f146446s;
        com.avito.android.edit_carousel.mvi.a aVar2 = this.f146445r;
        if (zF2) {
            return C43175k.C(new a(aVar, aVar2, null), interfaceC43160i);
        }
        if (L.f(interfaceC4255a, a.InterfaceC4255a.C4256a.f146422a)) {
            return C43175k.Y(interfaceC43160i, new b(aVar, aVar2, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
