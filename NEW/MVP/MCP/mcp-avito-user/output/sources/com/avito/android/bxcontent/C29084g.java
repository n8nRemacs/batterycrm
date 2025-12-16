package com.avito.android.bxcontent;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Emitters.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "kotlinx/coroutines/flow/b0"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.BxContentCombinationFeatureManager$special$$inlined$transform$3", f = "BxContentCombinationFeatureManager.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.bxcontent.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29084g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Void>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f111079q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f111080r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f111081s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C28969d f111082t;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/b0$a", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.g$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<Void> f111083b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C28969d f111084c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.bxcontent.BxContentCombinationFeatureManager$special$$inlined$transform$3$1", f = "BxContentCombinationFeatureManager.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.g$a$a, reason: collision with other inner class name */
        public static final class C3277a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f111085q;

            /* renamed from: r, reason: collision with root package name */
            public int f111086r;

            public C3277a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f111085q = obj;
                this.f111086r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, C28969d c28969d) {
            this.f111084c = c28969d;
            this.f111083b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.bxcontent.C29084g.a.C3277a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.bxcontent.g$a$a r0 = (com.avito.android.bxcontent.C29084g.a.C3277a) r0
                int r1 = r0.f111086r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f111086r = r1
                goto L18
            L13:
                com.avito.android.bxcontent.g$a$a r0 = new com.avito.android.bxcontent.g$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f111085q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f111086r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L54
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent r5 = (com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent) r5
                r0.f111086r = r3
                com.avito.android.bxcontent.d r6 = r4.f111084c
                r6.getClass()
                com.avito.android.bxcontent.mvi.entity.b$Y r2 = new com.avito.android.bxcontent.mvi.entity.b$Y
                r2.<init>(r5)
                com.avito.android.arch.mvi.c<com.avito.android.bxcontent.mvi.entity.b, com.avito.android.bxcontent.mvi.entity.BxContentInternalAction, com.avito.android.bxcontent.mvi.entity.l, com.avito.android.bxcontent.mvi.entity.g> r5 = r6.f109656e
                java.lang.Object r5 = r5.ya(r2, r0)
                java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r5 != r6) goto L4f
                goto L51
            L4f:
                kotlin.G0 r5 = kotlin.G0.f406611a
            L51:
                if (r5 != r1) goto L54
                return r1
            L54:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.C29084g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29084g(InterfaceC43160i interfaceC43160i, Continuation continuation, C28969d c28969d) {
        super(2, continuation);
        this.f111081s = interfaceC43160i;
        this.f111082t = c28969d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C29084g c29084g = new C29084g(this.f111081s, continuation, this.f111082t);
        c29084g.f111080r = obj;
        return c29084g;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Void> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C29084g) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f111079q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((InterfaceC43172j) this.f111080r, this.f111082t);
            this.f111079q = 1;
            if (this.f111081s.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
