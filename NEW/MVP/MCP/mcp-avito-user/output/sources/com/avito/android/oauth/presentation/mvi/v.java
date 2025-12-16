package com.avito.android.oauth.presentation.mvi;

import A3.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.oauth.presentation.mvi.entity.OAuthInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: OAuthBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/oauth/presentation/mvi/v;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "_avito_oauth_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class v implements com.avito.android.arch.mvi.b<OAuthInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.plugin.rx.a f208368a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A f208369b;

    /* compiled from: OAuthBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/oauth/presentation/mvi/entity/OAuthInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.oauth.presentation.mvi.OAuthBootstrap$produce$1", f = "OAuthBootstrap.kt", i = {0}, l = {19, 21}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super OAuthInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f208370q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f208371r;

        /* compiled from: OAuthBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA3/a;", "event", "Lkotlin/G0;", "emit", "(LA3/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.oauth.presentation.mvi.v$a$a, reason: collision with other inner class name */
        public static final class C6217a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<OAuthInternalAction> f208373b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v f208374c;

            /* JADX WARN: Multi-variable type inference failed */
            public C6217a(InterfaceC43172j<? super OAuthInternalAction> interfaceC43172j, v vVar) {
                this.f208373b = interfaceC43172j;
                this.f208374c = vVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                A3.a aVar = (A3.a) obj;
                boolean z12 = aVar instanceof a.InterfaceC0003a.c;
                v vVar = this.f208374c;
                InterfaceC43172j<OAuthInternalAction> interfaceC43172j = this.f208373b;
                if (z12) {
                    Object objU = C43175k.u(continuation, vVar.f208369b.a(), interfaceC43172j);
                    return objU == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objU : G0.f406611a;
                }
                if (!(aVar instanceof a.InterfaceC0003a.b)) {
                    return G0.f406611a;
                }
                Object objU2 = C43175k.u(continuation, vVar.f208369b.a(), interfaceC43172j);
                return objU2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objU2 : G0.f406611a;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = v.this.new a(continuation);
            aVar.f208371r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super OAuthInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f208370q;
            v vVar = v.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f208371r;
                C43152f0 c43152f0A = vVar.f208369b.a();
                this.f208371r = interfaceC43172j;
                this.f208370q = 1;
                if (C43175k.u(this, c43152f0A, interfaceC43172j) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f208371r;
                C42729a0.b(obj);
            }
            InterfaceC43160i interfaceC43160iA = kotlinx.coroutines.rx3.y.a(vVar.f208368a.getF68171a());
            C6217a c6217a = new C6217a(interfaceC43172j, vVar);
            this.f208371r = null;
            this.f208370q = 2;
            if (((AbstractC43168f) interfaceC43160iA).collect(c6217a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public v(@Y61.k com.avito.android.account.plugin.rx.a aVar, @Y61.k A a12) {
        this.f208368a = aVar;
        this.f208369b = a12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<OAuthInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
