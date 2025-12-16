package com.avito.android.bxcontent.mvi;

import com.avito.android.bxcontent.mvi.C;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BxContentInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "it", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getData$4", f = "BxContentInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class N extends SuspendLambda implements Y41.p<BxContentInternalAction, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f111408q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f111409r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C.b f111410s;

    /* compiled from: BxContentInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$getData$4$1", f = "BxContentInteractor.kt", i = {}, l = {1177}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111411q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111412r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ BxContentInternalAction f111413s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BxContentInternalAction bxContentInternalAction, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f111413s = bxContentInternalAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f111413s, continuation);
            aVar.f111412r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111411q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f111412r;
                this.f111411q = 1;
                if (interfaceC43172j.emit(this.f111413s, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(C.b bVar, F f12, Continuation continuation) {
        super(2, continuation);
        this.f111409r = f12;
        this.f111410s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        N n12 = new N(this.f111410s, this.f111409r, continuation);
        n12.f111408q = obj;
        return n12;
    }

    @Override // Y41.p
    public final Object invoke(BxContentInternalAction bxContentInternalAction, Continuation<? super InterfaceC43160i<? extends BxContentInternalAction>> continuation) {
        return ((N) create(bxContentInternalAction, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.N.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
