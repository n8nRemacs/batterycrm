package com.avito.android.delivery_tarifikator.presentation.region_screen.mvi;

import Xv.C17052c;
import Xv.InterfaceC17050a;
import com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.a;
import com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.entity.TarifikatorRegionInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: TarifikatorRegionActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/delivery_tarifikator/presentation/main_screen/mvi/a;", "Lkotlinx/coroutines/flow/i;", "LXv/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.TarifikatorRegionActor$process$9", f = "TarifikatorRegionActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class j extends SuspendLambda implements Y41.p<Q<? extends com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.a, ? extends InterfaceC43160i<? extends InterfaceC17050a>>, Continuation<? super InterfaceC43160i<? extends TarifikatorRegionInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f135828q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a f135829r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<C17052c> f135830s;

    /* compiled from: TarifikatorRegionActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXv/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "<anonymous>", "(LXv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.TarifikatorRegionActor$process$9$1", f = "TarifikatorRegionActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC17050a, Continuation<? super InterfaceC43160i<? extends TarifikatorRegionInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f135831q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a f135832r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C17052c> f135833s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a aVar, Y41.a<C17052c> aVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f135832r = aVar;
            this.f135833s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f135832r, this.f135833s, continuation);
            aVar.f135831q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC17050a interfaceC17050a, Continuation<? super InterfaceC43160i<? extends TarifikatorRegionInternalAction>> continuation) {
            return ((a) create(interfaceC17050a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC17050a interfaceC17050a = (InterfaceC17050a) this.f135831q;
            this.f135833s.invoke();
            return this.f135832r.c(interfaceC17050a);
        }
    }

    /* compiled from: TarifikatorRegionActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXv/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "<anonymous>", "(LXv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.TarifikatorRegionActor$process$9$2", f = "TarifikatorRegionActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC17050a, Continuation<? super InterfaceC43160i<? extends TarifikatorRegionInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f135834q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a f135835r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C17052c> f135836s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a aVar, Y41.a<C17052c> aVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f135835r = aVar;
            this.f135836s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f135835r, this.f135836s, continuation);
            bVar.f135834q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC17050a interfaceC17050a, Continuation<? super InterfaceC43160i<? extends TarifikatorRegionInternalAction>> continuation) {
            return ((b) create(interfaceC17050a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC17050a interfaceC17050a = (InterfaceC17050a) this.f135834q;
            this.f135836s.invoke();
            return this.f135835r.c(interfaceC17050a);
        }
    }

    /* compiled from: TarifikatorRegionActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXv/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/delivery_tarifikator/presentation/region_screen/mvi/entity/TarifikatorRegionInternalAction;", "<anonymous>", "(LXv/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.TarifikatorRegionActor$process$9$3", f = "TarifikatorRegionActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC17050a, Continuation<? super InterfaceC43160i<? extends TarifikatorRegionInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f135837q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a f135838r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<C17052c> f135839s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a aVar, Y41.a<C17052c> aVar2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f135838r = aVar;
            this.f135839s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f135838r, this.f135839s, continuation);
            cVar.f135837q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC17050a interfaceC17050a, Continuation<? super InterfaceC43160i<? extends TarifikatorRegionInternalAction>> continuation) {
            return ((c) create(interfaceC17050a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC17050a interfaceC17050a = (InterfaceC17050a) this.f135837q;
            this.f135839s.invoke();
            return this.f135838r.c(interfaceC17050a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a aVar, Y41.a<C17052c> aVar2, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f135829r = aVar;
        this.f135830s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f135829r, this.f135830s, continuation);
        jVar.f135828q = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.a, ? extends InterfaceC43160i<? extends InterfaceC17050a>> q12, Continuation<? super InterfaceC43160i<? extends TarifikatorRegionInternalAction>> continuation) {
        return ((j) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f135828q;
        com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.a aVar = (com.avito.android.delivery_tarifikator.presentation.main_screen.mvi.a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = L.f(aVar, a.c.f135612a);
        Y41.a<C17052c> aVar2 = this.f135830s;
        com.avito.android.delivery_tarifikator.presentation.region_screen.mvi.a aVar3 = this.f135829r;
        if (zF2) {
            return C43175k.B(new a(aVar3, aVar2, null), C43175k.r(C43175k.n(interfaceC43160i, 100L)));
        }
        if (!L.f(aVar, a.C4104a.f135610a)) {
            return C43175k.C(new c(aVar3, aVar2, null), interfaceC43160i);
        }
        return C43175k.C(new b(aVar3, aVar2, null), com.avito.android.arch.mvi.utils.h.d(interfaceC43160i, 1000L));
    }
}
