package com.avito.android.user_adverts.tab_screens.adverts.tooltip;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.Iterator;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsTooltipsQueue.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/tab_screens/adverts/tooltip/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsQueue$computeTooltips$1", f = "UserAdvertsTooltipsQueue.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class E extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC35693c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315565q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f315566r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C43210w f315567s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ P f315568t;

    /* compiled from: UserAdvertsTooltipsQueue.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ P f315569b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InterfaceC35693c> f315570c;

        /* compiled from: UserAdvertsTooltipsQueue.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.tooltip.UserAdvertsTooltipsQueue$computeTooltips$1$1", f = "UserAdvertsTooltipsQueue.kt", i = {}, l = {51}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.tooltip.E$a$a, reason: collision with other inner class name */
        public static final class C9777a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public InterfaceC43172j f315571q;

            /* renamed from: r, reason: collision with root package name */
            public Iterator f315572r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f315573s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ a<T> f315574t;

            /* renamed from: u, reason: collision with root package name */
            public int f315575u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C9777a(a<? super T> aVar, Continuation<? super C9777a> continuation) {
                super(continuation);
                this.f315574t = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f315573s = obj;
                this.f315575u |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f315574t.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(P p12, InterfaceC43172j<? super InterfaceC35693c> interfaceC43172j) {
            this.f315569b = p12;
            this.f315570c = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@Y61.k com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.tooltip.E.a.C9777a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.E$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.E.a.C9777a) r0
                int r1 = r0.f315575u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f315575u = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.E$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.tooltip.E$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f315573s
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f315575u
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.util.Iterator r5 = r0.f315572r
                kotlinx.coroutines.flow.j r2 = r0.f315571q
                kotlin.C42729a0.b(r6)
                goto L5d
            L2d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L35:
                kotlin.C42729a0.b(r6)
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.P r6 = r4.f315569b
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$ViewState r5 = r5.f315398p
                java.util.List<com.avito.conveyor_item.a> r5 = r5.f315417b
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                kotlin.collections.s0 r2 = new kotlin.collections.s0
                r2.<init>(r5)
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.F r5 = com.avito.android.user_adverts.tab_screens.adverts.tooltip.F.f315576l
                kotlin.sequences.h r5 = kotlin.sequences.C43033p.i(r2, r5)
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.H r2 = new com.avito.android.user_adverts.tab_screens.adverts.tooltip.H
                r2.<init>(r6)
                kotlin.sequences.i r5 = kotlin.sequences.C43033p.o(r5, r2)
                kotlin.sequences.i$b r6 = new kotlin.sequences.i$b
                r6.<init>(r5)
                kotlinx.coroutines.flow.j<com.avito.android.user_adverts.tab_screens.adverts.tooltip.c> r5 = r4.f315570c
                r2 = r5
                r5 = r6
            L5d:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L76
                java.lang.Object r6 = r5.next()
                com.avito.android.user_adverts.tab_screens.adverts.tooltip.c r6 = (com.avito.android.user_adverts.tab_screens.adverts.tooltip.InterfaceC35693c) r6
                r0.f315571q = r2
                r0.f315572r = r5
                r0.f315575u = r3
                java.lang.Object r6 = r2.emit(r6, r0)
                if (r6 != r1) goto L5d
                return r1
            L76:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.tooltip.E.a.emit(com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(C43210w c43210w, P p12, Continuation continuation) {
        super(2, continuation);
        this.f315567s = c43210w;
        this.f315568t = p12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        E e12 = new E(this.f315567s, this.f315568t, continuation);
        e12.f315566r = obj;
        return e12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC35693c> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((E) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315565q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f315568t, (InterfaceC43172j) this.f315566r);
            this.f315565q = 1;
            if (this.f315567s.collect(aVar, this) == coroutine_suspended) {
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
