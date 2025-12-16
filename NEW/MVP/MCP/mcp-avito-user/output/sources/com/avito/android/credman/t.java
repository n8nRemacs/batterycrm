package com.avito.android.credman;

import com.avito.android.credman.o;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: CredmanRx.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/credman/o$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/credman/o$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.credman.CredmanSaverRxImpl$save$1", f = "CredmanRx.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class t extends SuspendLambda implements Y41.p<T, Continuation<? super o.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f129113q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f129114r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f129115s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f129116t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, String str, String str2, Continuation<? super t> continuation) {
        super(2, continuation);
        this.f129114r = uVar;
        this.f129115s = str;
        this.f129116t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new t(this.f129114r, this.f129115s, this.f129116t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super o.a> continuation) {
        return ((t) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f129113q;
        if (i12 == 0) {
            C42729a0.b(obj);
            o oVar = this.f129114r.f129117a;
            this.f129113q = 1;
            obj = oVar.a(this.f129115s, this.f129116t, this);
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
