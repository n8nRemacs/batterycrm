package com.avito.android.autoteka.data.order;

import Y41.p;
import com.avito.android.remote.model.AuthResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35783e4;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;

/* compiled from: AutotekaChangeEmailInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.data.order.AutotekaChangeEmailInteractorImpl$saveEmail$2", f = "AutotekaChangeEmailInteractor.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class b extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<G0>>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f96145q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f96146r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d f96147s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f96148t;

    /* compiled from: AutotekaChangeEmailInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/AuthResult;", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/Profile;", "apply", "(Lcom/avito/android/remote/model/AuthResult;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f96149b;

        public a(d dVar) {
            this.f96149b = dVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            AuthResult authResult = (AuthResult) obj;
            return this.f96149b.f96155b.h(C35783e4.a(authResult.getProfile()), null).B(authResult.getProfile()).F();
        }
    }

    /* compiled from: AutotekaChangeEmailInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/Profile;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/remote/model/Profile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.autoteka.data.order.b$b, reason: collision with other inner class name */
    public static final class C2843b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<TypedResult<G0>> f96150b;

        /* JADX WARN: Multi-variable type inference failed */
        public C2843b(InterfaceC43172j<? super TypedResult<G0>> interfaceC43172j) {
            this.f96150b = interfaceC43172j;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            G0 g02 = G0.f406611a;
            Object objEmit = this.f96150b.emit(new TypedResult.Success(g02), continuation);
            return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : g02;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, String str, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f96147s = dVar;
        this.f96148t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f96147s, this.f96148t, continuation);
        bVar.f96146r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super TypedResult<G0>> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f96145q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f96146r;
            d dVar = this.f96147s;
            InterfaceC43160i interfaceC43160iA = y.a(dVar.f96154a.D(null, this.f96148t, null, null, null, null, null, null).T(new a(dVar), Integer.MAX_VALUE));
            C2843b c2843b = new C2843b(interfaceC43172j);
            this.f96145q = 1;
            if (((AbstractC43168f) interfaceC43160iA).collect(c2843b, this) == coroutine_suspended) {
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
