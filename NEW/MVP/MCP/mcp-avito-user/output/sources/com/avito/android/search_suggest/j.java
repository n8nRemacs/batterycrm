package com.avito.android.search_suggest;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.TypedResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SearchSuggestInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.search_suggest.SearchSuggestInteractorImpl$removeSearchHistory$2", f = "SearchSuggestInteractor.kt", i = {0}, l = {98, 102}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Boolean>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f264239q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f264240r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f264241s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f264242t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, String str, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f264241s = kVar;
        this.f264242t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f264241s, this.f264242t, continuation);
        jVar.f264240r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Boolean> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlinx.coroutines.flow.j] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        boolean z12;
        ?? r12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f264239q;
        try {
        } catch (Exception unused) {
            z12 = false;
            r12 = i12;
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            ?? r13 = (InterfaceC43172j) this.f264240r;
            V0 v02 = this.f264241s.f264243a.get();
            String str = this.f264242t;
            this.f264240r = r13;
            this.f264239q = 1;
            obj = v02.o(str, this);
            i12 = r13;
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
            ?? r14 = (InterfaceC43172j) this.f264240r;
            C42729a0.b(obj);
            i12 = r14;
        }
        z12 = obj instanceof TypedResult.Success;
        r12 = i12;
        Boolean boolBoxBoolean = Boxing.boxBoolean(z12);
        this.f264240r = null;
        this.f264239q = 2;
        if (r12.emit(boolBoxBoolean, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
