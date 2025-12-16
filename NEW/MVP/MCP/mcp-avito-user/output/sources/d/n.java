package d;

import android.content.SharedPreferences;
import e.InterfaceC39835a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* loaded from: classes.dex */
public final class n extends SuspendLambda implements Y41.p {

    /* renamed from: q, reason: collision with root package name */
    public int f393146q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f393147r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(2, continuation);
        this.f393147r = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.f393147r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return new n(this.f393147r, (Continuation) obj2).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f393146q;
        o oVar = this.f393147r;
        if (i12 == 0) {
            C42729a0.b(obj);
            Kc1.a aVar = oVar.f393148a;
            this.f393146q = 1;
            vc1.c cVar = (vc1.c) aVar;
            ReentrantReadWriteLock.ReadLock lock = ((ReentrantReadWriteLock) cVar.f440911d.getValue()).readLock();
            lock.lock();
            try {
                SharedPreferences sharedPreferences = cVar.f440910c;
                obj = sharedPreferences != null ? sharedPreferences.getString("sber_id_user_id", "") : null;
                if (obj == null) {
                    obj = "";
                }
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } finally {
                lock.unlock();
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return G0.f406611a;
            }
            C42729a0.b(obj);
        }
        String str = (String) obj;
        if (!L.f(str, "")) {
            InterfaceC39835a interfaceC39835a = oVar.f393149b;
            this.f393146q = 2;
            e.h hVar = (e.h) interfaceC39835a;
            C43259k.d((T) ((D31.g) hVar.f394228a).f2880a.getValue(), null, null, new e.g(hVar, str, null), 3);
            if (G0.f406611a == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
