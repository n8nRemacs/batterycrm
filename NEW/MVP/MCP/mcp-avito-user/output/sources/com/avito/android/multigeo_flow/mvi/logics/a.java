package com.avito.android.multigeo_flow.mvi.logics;

import Q20.a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.multigeo_flow.mvi.entity.InternalAction;
import com.avito.android.multigeo_flow.mvi.entity.JobMultiGeoState;
import com.avito.android.remote.model.TypedResult;
import com.huawei.updatesdk.service.otaupdate.UpdateStatusCode;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: JobMultiGeoActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/multigeo_flow/mvi/entity/InternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.multigeo_flow.mvi.logics.JobMultiGeoActor$process$1", f = "JobMultiGeoActor.kt", i = {1, 3, 4, 5, 6, 7}, l = {45, 56, 57, 76, 77, 82, 83, 91, 93, UpdateStatusCode.DialogButton.CONFIRM, 110, 112, 132, 134, 149, 150}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes15.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f207004q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f207005r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Q20.a f207006s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f207007t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ JobMultiGeoState f207008u;

    /* compiled from: JobMultiGeoActor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlinx/coroutines/a0;", "Lcom/avito/android/remote/model/TypedResult;", "LP20/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lkotlinx/coroutines/a0;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.multigeo_flow.mvi.logics.JobMultiGeoActor$process$1$request$1", f = "JobMultiGeoActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.multigeo_flow.mvi.logics.a$a, reason: collision with other inner class name */
    public static final class C6171a extends SuspendLambda implements p<T, Continuation<? super InterfaceC43076a0<? extends TypedResult<P20.d>>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f207009q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f207010r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ JobMultiGeoState f207011s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Q20.a f207012t;

        /* compiled from: JobMultiGeoActor.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LP20/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.multigeo_flow.mvi.logics.JobMultiGeoActor$process$1$request$1$1", f = "JobMultiGeoActor.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.multigeo_flow.mvi.logics.a$a$a, reason: collision with other inner class name */
        public static final class C6172a extends SuspendLambda implements p<T, Continuation<? super TypedResult<P20.d>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f207013q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f207014r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ JobMultiGeoState f207015s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ Q20.a f207016t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6172a(Q20.a aVar, JobMultiGeoState jobMultiGeoState, b bVar, Continuation continuation) {
                super(2, continuation);
                this.f207014r = bVar;
                this.f207015s = jobMultiGeoState;
                this.f207016t = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C6172a(this.f207016t, this.f207015s, this.f207014r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super TypedResult<P20.d>> continuation) {
                return ((C6172a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f207013q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    com.avito.android.multigeo_flow.domain.b bVar = this.f207014r.f207017a;
                    String str = this.f207015s.f206999b;
                    int i13 = ((a.e) this.f207016t).f13427a.f206875c;
                    this.f207013q = 1;
                    obj = bVar.a(str, i13, this);
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
        public C6171a(Q20.a aVar, JobMultiGeoState jobMultiGeoState, b bVar, Continuation continuation) {
            super(2, continuation);
            this.f207010r = bVar;
            this.f207011s = jobMultiGeoState;
            this.f207012t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C6171a c6171a = new C6171a(this.f207012t, this.f207011s, this.f207010r, continuation);
            c6171a.f207009q = obj;
            return c6171a;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super InterfaceC43076a0<? extends TypedResult<P20.d>>> continuation) {
            return ((C6171a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f207009q;
            b bVar = this.f207010r;
            return C43259k.b(t12, null, new C6172a(this.f207012t, this.f207011s, bVar, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Q20.a aVar, JobMultiGeoState jobMultiGeoState, b bVar, Continuation continuation) {
        super(2, continuation);
        this.f207006s = aVar;
        this.f207007t = bVar;
        this.f207008u = jobMultiGeoState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        b bVar = this.f207007t;
        a aVar = new a(this.f207006s, this.f207008u, bVar, continuation);
        aVar.f207005r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0169  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.multigeo_flow.mvi.logics.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
