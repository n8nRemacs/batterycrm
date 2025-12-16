package com.avito.android.preloading.coroutines;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: FlowPreloadable.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/preloading/coroutines/C;", "", "Params", "Response", "Lcom/avito/android/preloading/coroutines/l;", "<init>", "()V", "_common_preloading-promise"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class C<Params, Response> implements l<Params, Response> {

    /* compiled from: FlowPreloadable.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00010\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Params", "Response", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.preloading.coroutines.SuspendPreloadable$load$1", f = "FlowPreloadable.kt", i = {}, l = {15, 15}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Response>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f221785q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f221786r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C<Params, Response> f221787s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Params f221788t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C<Params, Response> c12, Params params, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f221787s = c12;
            this.f221788t = params;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f221787s, this.f221788t, continuation);
            aVar.f221786r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(Object obj, Continuation<? super G0> continuation) {
            return ((a) create((InterfaceC43172j) obj, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f221785q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f221786r;
                this.f221786r = interfaceC43172j;
                this.f221785q = 1;
                obj = this.f221787s.b(this.f221788t, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f221786r;
                C42729a0.b(obj);
            }
            this.f221786r = null;
            this.f221785q = 2;
            if (interfaceC43172j.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Override // com.avito.android.preloading.coroutines.l
    @Y61.k
    public final InterfaceC43160i<Response> a(@Y61.k Params params) {
        return C43175k.G(new a(this, params, null));
    }

    @Y61.l
    public abstract Object b(@Y61.k Params params, @Y61.k Continuation<? super Response> continuation);
}
