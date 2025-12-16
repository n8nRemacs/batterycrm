package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.messenger.channels.mvi.list_feature.C31772a;
import com.avito.android.util.X2;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ChannelsListActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/messenger/channels/mvi/list_feature/a$a;", "Lkotlinx/coroutines/flow/i;", "LHY/a;", "<name for destructuring parameter 0>", "LHY/d;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$4", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class N extends SuspendLambda implements Y41.p<kotlin.Q<? extends C31772a.InterfaceC5527a, ? extends InterfaceC43160i<? extends HY.a>>, Continuation<? super InterfaceC43160i<? extends HY.d>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f187779q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C31772a f187780r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<HY.h> f187781s;

    /* compiled from: ChannelsListActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LHY/a;", "action", "Lkotlinx/coroutines/flow/i;", "LHY/d;", "<anonymous>", "(LHY/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$4$1", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<HY.a, Continuation<? super InterfaceC43160i<? extends HY.d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f187782q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C31772a f187783r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<HY.h> f187784s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C31772a.InterfaceC5527a f187785t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C31772a c31772a, Y41.a<HY.h> aVar, C31772a.InterfaceC5527a interfaceC5527a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f187783r = c31772a;
            this.f187784s = aVar;
            this.f187785t = interfaceC5527a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f187783r, this.f187784s, this.f187785t, continuation);
            aVar.f187782q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(HY.a aVar, Continuation<? super InterfaceC43160i<? extends HY.d>> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            HY.a aVar = (HY.a) this.f187782q;
            boolean z12 = aVar instanceof HY.c;
            C31772a c31772a = this.f187783r;
            if (z12) {
                this.f187784s.invoke();
                return c31772a.g((HY.c) aVar);
            }
            if (aVar instanceof HY.g) {
                return C31772a.e(c31772a, (HY.g) aVar);
            }
            InterfaceC43160i interfaceC43160iW = C43175k.w();
            X2.f318778a.d("ChannelsListActor", aVar + " can't be processed and shouldn't be in group " + this.f187785t);
            return interfaceC43160iW;
        }
    }

    /* compiled from: ChannelsListActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LHY/a;", "action", "Lkotlinx/coroutines/flow/i;", "LHY/d;", "<anonymous>", "(LHY/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$4$2", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<HY.a, Continuation<? super InterfaceC43160i<? extends HY.d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f187786q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C31772a f187787r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<HY.h> f187788s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C31772a.InterfaceC5527a f187789t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C31772a c31772a, Y41.a<HY.h> aVar, C31772a.InterfaceC5527a interfaceC5527a, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f187787r = c31772a;
            this.f187788s = aVar;
            this.f187789t = interfaceC5527a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f187787r, this.f187788s, this.f187789t, continuation);
            bVar.f187786q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(HY.a aVar, Continuation<? super InterfaceC43160i<? extends HY.d>> continuation) {
            return ((b) create(aVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            HY.a aVar = (HY.a) this.f187786q;
            boolean z12 = aVar instanceof HY.c;
            C31772a c31772a = this.f187787r;
            if (z12) {
                this.f187788s.invoke();
                return c31772a.g((HY.c) aVar);
            }
            if (aVar instanceof HY.g) {
                return C31772a.e(c31772a, (HY.g) aVar);
            }
            InterfaceC43160i interfaceC43160iW = C43175k.w();
            X2.f318778a.d("ChannelsListActor", aVar + " can't be processed and shouldn't be in group " + this.f187789t);
            return interfaceC43160iW;
        }
    }

    /* compiled from: ChannelsListActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LHY/a;", "action", "Lkotlinx/coroutines/flow/i;", "LHY/d;", "<anonymous>", "(LHY/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$4$3", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<HY.a, Continuation<? super InterfaceC43160i<? extends HY.d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f187790q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C31772a f187791r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<HY.h> f187792s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C31772a.InterfaceC5527a f187793t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C31772a c31772a, Y41.a<HY.h> aVar, C31772a.InterfaceC5527a interfaceC5527a, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f187791r = c31772a;
            this.f187792s = aVar;
            this.f187793t = interfaceC5527a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f187791r, this.f187792s, this.f187793t, continuation);
            cVar.f187790q = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(HY.a aVar, Continuation<? super InterfaceC43160i<? extends HY.d>> continuation) {
            return ((c) create(aVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            HY.a aVar = (HY.a) this.f187790q;
            boolean z12 = aVar instanceof HY.c;
            C31772a c31772a = this.f187791r;
            if (z12) {
                this.f187792s.invoke();
                return c31772a.g((HY.c) aVar);
            }
            if (aVar instanceof HY.g) {
                return C31772a.e(c31772a, (HY.g) aVar);
            }
            InterfaceC43160i interfaceC43160iW = C43175k.w();
            X2.f318778a.d("ChannelsListActor", aVar + " can't be processed and shouldn't be in group " + this.f187793t);
            return interfaceC43160iW;
        }
    }

    /* compiled from: ChannelsListActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LHY/a;", "action", "Lkotlinx/coroutines/flow/i;", "LHY/d;", "<anonymous>", "(LHY/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$4$4", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<HY.a, Continuation<? super InterfaceC43160i<? extends HY.d>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f187794q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C31772a.InterfaceC5527a f187795r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C31772a.InterfaceC5527a interfaceC5527a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f187795r = interfaceC5527a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f187795r, continuation);
            dVar.f187794q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(HY.a aVar, Continuation<? super InterfaceC43160i<? extends HY.d>> continuation) {
            return ((d) create(aVar, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            HY.a aVar = (HY.a) this.f187794q;
            if (aVar instanceof HY.d) {
                return new C43210w(aVar);
            }
            InterfaceC43160i interfaceC43160iW = C43175k.w();
            X2.f318778a.d("ChannelsListActor", aVar + " can't be passed through and shouldn't be in group " + this.f187795r);
            return interfaceC43160iW;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C31772a c31772a, Y41.a<HY.h> aVar, Continuation<? super N> continuation) {
        super(2, continuation);
        this.f187780r = c31772a;
        this.f187781s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        N n12 = new N(this.f187780r, this.f187781s, continuation);
        n12.f187779q = obj;
        return n12;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends C31772a.InterfaceC5527a, ? extends InterfaceC43160i<? extends HY.a>> q12, Continuation<? super InterfaceC43160i<? extends HY.d>> continuation) {
        return ((N) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = (kotlin.Q) this.f187779q;
        C31772a.InterfaceC5527a interfaceC5527a = (C31772a.InterfaceC5527a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = kotlin.jvm.internal.L.f(interfaceC5527a, C31772a.InterfaceC5527a.d.f187950a);
        Y41.a<HY.h> aVar = this.f187781s;
        C31772a c31772a = this.f187780r;
        if (zF2) {
            return C43175k.B(new a(c31772a, aVar, interfaceC5527a, null), interfaceC43160i);
        }
        if (kotlin.jvm.internal.L.f(interfaceC5527a, C31772a.InterfaceC5527a.c.f187949a)) {
            return C43175k.B(new b(c31772a, aVar, interfaceC5527a, null), interfaceC43160i);
        }
        if (kotlin.jvm.internal.L.f(interfaceC5527a, C31772a.InterfaceC5527a.b.f187948a)) {
            return C43175k.B(new c(c31772a, aVar, interfaceC5527a, null), interfaceC43160i);
        }
        if (kotlin.jvm.internal.L.f(interfaceC5527a, C31772a.InterfaceC5527a.C5528a.f187947a)) {
            return C43175k.B(new d(interfaceC5527a, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
