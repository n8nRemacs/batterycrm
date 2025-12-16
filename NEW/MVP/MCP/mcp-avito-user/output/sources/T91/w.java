package T91;

import android.content.Context;
import android.content.Intent;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* loaded from: classes9.dex */
public final class w extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f15482q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f15483r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f15484s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f15485t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, z zVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f15483r = context;
        this.f15484s = zVar;
        this.f15485t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w(this.f15483r, this.f15484s, this.f15485t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f15482q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Intent intent = new Intent();
            intent.setAction("d.c.action");
            intent.putExtra("bd_extra", this.f15485t);
            androidx.localbroadcastmanager.content.a.a(this.f15483r).c(intent);
            z zVar = this.f15484s;
            v vVar = new v(zVar, null);
            this.f15482q = 1;
            if (z.ke(zVar, vVar, this) == coroutine_suspended) {
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
