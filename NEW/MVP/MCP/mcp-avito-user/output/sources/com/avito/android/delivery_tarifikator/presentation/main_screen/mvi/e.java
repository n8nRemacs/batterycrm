package com.avito.android.delivery_tarifikator.presentation.main_screen.mvi;

import Tv.C15414e;
import Tv.InterfaceC15412c;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.a;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.entity.TarifikatorMainInternalAction;
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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TarifikatorMainActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/a;", "Lkotlinx/coroutines/flow/i;", "LTv/c;", "<name for destructuring parameter 0>", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.TarifikatorMainActor$process$12", f = "TarifikatorMainActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class e extends SuspendLambda implements Y41.p<Q<? extends com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.a, ? extends InterfaceC43160i<? extends InterfaceC15412c>>, Continuation<? super InterfaceC43160i<? extends TarifikatorMainInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f135623q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.b f135624r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C15414e> f135625s;

    /* compiled from: TarifikatorMainActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTv/c;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "<anonymous>", "(LTv/c;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.TarifikatorMainActor$process$12$1", f = "TarifikatorMainActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC15412c, Continuation<? super InterfaceC43160i<? extends TarifikatorMainInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f135626q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.b f135627r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C15414e> f135628s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.b bVar, Y41.a<C15414e> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f135627r = bVar;
            this.f135628s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f135627r, this.f135628s, continuation);
            aVar.f135626q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC15412c interfaceC15412c, Continuation<? super InterfaceC43160i<? extends TarifikatorMainInternalAction>> continuation) {
            return ((a) create(interfaceC15412c, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC15412c interfaceC15412c = (InterfaceC15412c) this.f135626q;
            this.f135628s.invoke();
            return this.f135627r.c(interfaceC15412c);
        }
    }

    /* compiled from: TarifikatorMainActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTv/c;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "<anonymous>", "(LTv/c;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.TarifikatorMainActor$process$12$2", f = "TarifikatorMainActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC15412c, Continuation<? super InterfaceC43160i<? extends TarifikatorMainInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f135629q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.b f135630r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C15414e> f135631s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.b bVar, Y41.a<C15414e> aVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f135630r = bVar;
            this.f135631s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f135630r, this.f135631s, continuation);
            bVar.f135629q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC15412c interfaceC15412c, Continuation<? super InterfaceC43160i<? extends TarifikatorMainInternalAction>> continuation) {
            return ((b) create(interfaceC15412c, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC15412c interfaceC15412c = (InterfaceC15412c) this.f135629q;
            this.f135631s.invoke();
            return this.f135630r.c(interfaceC15412c);
        }
    }

    /* compiled from: TarifikatorMainActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTv/c;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/entity/TarifikatorMainInternalAction;", "<anonymous>", "(LTv/c;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.TarifikatorMainActor$process$12$3", f = "TarifikatorMainActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC15412c, Continuation<? super InterfaceC43160i<? extends TarifikatorMainInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f135632q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.b f135633r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C15414e> f135634s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.b bVar, Y41.a<C15414e> aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f135633r = bVar;
            this.f135634s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f135633r, this.f135634s, continuation);
            cVar.f135632q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC15412c interfaceC15412c, Continuation<? super InterfaceC43160i<? extends TarifikatorMainInternalAction>> continuation) {
            return ((c) create(interfaceC15412c, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC15412c interfaceC15412c = (InterfaceC15412c) this.f135632q;
            this.f135634s.invoke();
            return this.f135633r.c(interfaceC15412c);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.b bVar, Y41.a<C15414e> aVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f135624r = bVar;
        this.f135625s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f135624r, this.f135625s, continuation);
        eVar.f135623q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.a, ? extends InterfaceC43160i<? extends InterfaceC15412c>> q12, Continuation<? super InterfaceC43160i<? extends TarifikatorMainInternalAction>> continuation) {
        return ((e) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f135623q;
        com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.a aVar = (com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = L.f(aVar, a.b.f135611a);
        Y41.a<C15414e> aVar2 = this.f135625s;
        com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.b bVar = this.f135624r;
        if (zF2) {
            return C43175k.C(new a(bVar, aVar2, null), interfaceC43160i);
        }
        if (L.f(aVar, a.C4104a.f135610a)) {
            return C43175k.C(new b(bVar, aVar2, null), com.avito.android.arch.mvi.utils.h.d(interfaceC43160i, 1000L));
        }
        if (!L.f(aVar, a.c.f135612a)) {
            throw new NoWhenBranchMatchedException();
        }
        return C43175k.B(new c(bVar, aVar2, null), C43175k.r(C43175k.n(interfaceC43160i, 100L)));
    }
}
