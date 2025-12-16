package zc1;

import Xb1.a;
import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.e2;

/* loaded from: classes9.dex */
public final class a extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f444094q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f444095r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f444096s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f444097t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f444095r = cVar;
        this.f444096s = str;
        this.f444097t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f444095r, this.f444096s, this.f444097t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f444094q;
        if (i12 == 0) {
            C42729a0.b(obj);
            e2 e2Var = this.f444095r.f444102b;
            a.C1338a c1338a = new a.C1338a(this.f444096s, this.f444097t);
            this.f444094q = 1;
            if (e2Var.emit(c1338a, this) == coroutine_suspended) {
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
