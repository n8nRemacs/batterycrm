package com.avito.android.gig_motivations_list.ui.mvi;

import Y41.p;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import wH.C49507c;
import zH.InterfaceC50463b;

/* compiled from: MotivationsListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LzH/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.gig_motivations_list.ui.mvi.MotivationsListActor$getMotivations$1", f = "MotivationsListActor.kt", i = {0}, l = {50, 50}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes13.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC50463b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f160352q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f160353r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.gig_motivations_list.ui.mvi.b f160354s;

    /* compiled from: MotivationsListActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LwH/c;", "it", "Lkotlin/G0;", "<anonymous>", "(LwH/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_motivations_list.ui.mvi.MotivationsListActor$getMotivations$1$1", f = "MotivationsListActor.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.gig_motivations_list.ui.mvi.a$a, reason: collision with other inner class name */
    public static final class C4684a extends SuspendLambda implements p<C49507c, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f160355q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f160356r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InterfaceC50463b> f160357s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C4684a(InterfaceC43172j<? super InterfaceC50463b> interfaceC43172j, Continuation<? super C4684a> continuation) {
            super(2, continuation);
            this.f160357s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C4684a c4684a = new C4684a(this.f160357s, continuation);
            c4684a.f160356r = obj;
            return c4684a;
        }

        @Override // Y41.p
        public final Object invoke(C49507c c49507c, Continuation<? super G0> continuation) {
            return ((C4684a) create(c49507c, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f160355q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC50463b.a aVar = new InterfaceC50463b.a((C49507c) this.f160356r);
                this.f160355q = 1;
                if (this.f160357s.emit(aVar, this) == coroutine_suspended) {
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

    /* compiled from: MotivationsListActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_motivations_list.ui.mvi.MotivationsListActor$getMotivations$1$2", f = "MotivationsListActor.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f160358q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f160359r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<InterfaceC50463b> f160360s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(InterfaceC43172j<? super InterfaceC50463b> interfaceC43172j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f160360s = interfaceC43172j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f160360s, continuation);
            bVar.f160359r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(String str, Continuation<? super G0> continuation) {
            return ((b) create(str, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f160358q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC50463b.C12950b c12950b = new InterfaceC50463b.C12950b((String) this.f160359r);
                this.f160358q = 1;
                if (this.f160360s.emit(c12950b, this) == coroutine_suspended) {
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
    public a(com.avito.android.gig_motivations_list.ui.mvi.b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f160354s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f160354s, continuation);
        aVar.f160353r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InterfaceC50463b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f160352q;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f160353r;
            wH.h hVar = this.f160354s.f160361a;
            this.f160353r = interfaceC43172j;
            this.f160352q = 1;
            obj = hVar.a(this);
            if (obj == coroutine_suspended) {
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
            interfaceC43172j = (InterfaceC43172j) this.f160353r;
            C42729a0.b(obj);
        }
        C4684a c4684a = new C4684a(interfaceC43172j, null);
        b bVar = new b(interfaceC43172j, null);
        this.f160353r = null;
        this.f160352q = 2;
        if (z.s((TypedResult) obj, c4684a, bVar, null, null, this, 60) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
