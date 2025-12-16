package com.avito.android.passport.profile_add.create_flow.select_vertical;

import Y41.p;
import com.avito.android.passport.profile_add.create_flow.select_vertical.mvi.entity.SelectVerticalInternalAction;
import hb0.C40908a;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectVerticalInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalInteractorImpl$loadProfileConstructorData$1", f = "SelectVerticalInteractor.kt", i = {0}, l = {30, 31}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes15.dex */
final class j extends SuspendLambda implements p<InterfaceC43172j<?>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f211909q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f211910r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f211911s;

    /* compiled from: SelectVerticalInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalInteractorImpl$loadProfileConstructorData$1$1", f = "SelectVerticalInteractor.kt", i = {0, 1}, l = {34, 40, 41, 50, 55}, m = "invokeSuspend", n = {"savedProfileInfoDeferred", "verticals"}, s = {"L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public ArrayList f211912q;

        /* renamed from: r, reason: collision with root package name */
        public int f211913r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f211914s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ l f211915t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<?> f211916u;

        /* compiled from: SelectVerticalInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lhb0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lhb0/a;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.passport.profile_add.create_flow.select_vertical.SelectVerticalInteractorImpl$loadProfileConstructorData$1$1$savedProfileInfoDeferred$1", f = "SelectVerticalInteractor.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.passport.profile_add.create_flow.select_vertical.j$a$a, reason: collision with other inner class name */
        public static final class C6336a extends SuspendLambda implements p<T, Continuation<? super C40908a>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f211917q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ l f211918r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6336a(l lVar, Continuation<? super C6336a> continuation) {
                super(2, continuation);
                this.f211918r = lVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C6336a(this.f211918r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super C40908a> continuation) {
                return ((C6336a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f211917q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.passport.profile_add.domain.interactor.a aVar = this.f211918r.f211923b;
                    this.f211917q = 1;
                    obj = aVar.b(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l lVar, InterfaceC43172j<?> interfaceC43172j, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f211915t = lVar;
            this.f211916u = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f211915t, this.f211916u, continuation);
            aVar.f211914s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00bf A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.passport.profile_add.create_flow.select_vertical.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f211911s = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f211911s, continuation);
        jVar.f211910r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<?> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f211909q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f211910r;
            SelectVerticalInternalAction.ProfileConstructorLoading profileConstructorLoading = new SelectVerticalInternalAction.ProfileConstructorLoading();
            this.f211910r = interfaceC43172j;
            this.f211909q = 1;
            if (interfaceC43172j.emit(profileConstructorLoading, this) == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f211910r;
            C42729a0.b(obj);
        }
        a aVar = new a(this.f211911s, interfaceC43172j, null);
        this.f211910r = null;
        this.f211909q = 2;
        if (U.c(aVar, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
