package com.avito.android.virtual_deal_room.client_room.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomArguments;
import com.avito.android.virtual_deal_room.client_room.mvi.entity.ClientRoomInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ClientRoomInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/virtual_deal_room/client_room/mvi/entity/ClientRoomInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.virtual_deal_room.client_room.interactor.ClientRoomInteractorImpl$load$1", f = "ClientRoomInteractor.kt", i = {0, 1}, l = {45, 46, 75, 98}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* loaded from: classes5.dex */
final class g extends SuspendLambda implements p<InterfaceC43172j<? super ClientRoomInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f326304q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f326305r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f326306s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f326307t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ DN0.b f326308u;

    /* compiled from: ClientRoomInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LJN0/b;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room.client_room.interactor.ClientRoomInteractorImpl$load$1$result$1", f = "ClientRoomInteractor.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<JN0.b>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326309q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ f f326310r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f326310r = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f326310r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<JN0.b>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f326309q;
            if (i12 == 0) {
                C42729a0.b(obj);
                f fVar = this.f326310r;
                IN0.a aVar = fVar.f326293a;
                ClientRoomArguments clientRoomArguments = fVar.f326296d;
                String str = clientRoomArguments.f326339b;
                String str2 = clientRoomArguments.f326340c.f326476b;
                this.f326309q = 1;
                obj = aVar.b(str, str2, clientRoomArguments.f326341d, this);
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
    public g(f fVar, boolean z12, DN0.b bVar, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f326306s = fVar;
        this.f326307t = z12;
        this.f326308u = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        g gVar = new g(this.f326306s, this.f326307t, this.f326308u, continuation);
        gVar.f326305r = obj;
        return gVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ClientRoomInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011c A[PHI: r10
  0x011c: PHI (r10v7 DN0.b) = (r10v5 DN0.b), (r10v17 DN0.b) binds: [B:73:0x0143, B:57:0x0113] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d2  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room.client_room.interactor.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
