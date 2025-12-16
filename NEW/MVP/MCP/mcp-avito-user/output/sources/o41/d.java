package O41;

import Y41.p;
import ac1.AbstractC19866a;
import android.content.SharedPreferences;
import cc1.C27176a;
import dc1.C39703a;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import o31.C44576a;
import v2.f;

/* loaded from: classes8.dex */
public final class d extends SuspendLambda implements p {

    /* renamed from: q, reason: collision with root package name */
    public int f11963q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f11964r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f11965s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f11964r = eVar;
        this.f11965s = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new d(this.f11964r, this.f11965s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((T) obj, (Continuation) obj2)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f11963q;
        String str = this.f11965s;
        e eVar = this.f11964r;
        if (i12 == 0) {
            C42729a0.b(obj);
            J31.a aVar = eVar.f11967a;
            this.f11963q = 1;
            obj = ((f) ((C44576a) aVar).f419361a).a(new A2.c(str), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        AbstractC19866a abstractC19866a = (AbstractC19866a) obj;
        boolean z12 = abstractC19866a instanceof AbstractC19866a.b;
        F41.a aVar2 = eVar.f11968b;
        if (z12) {
            AbstractC19866a.b bVar = (AbstractC19866a.b) abstractC19866a;
            w1.b bVar2 = e.f11966e;
            if (bVar.f21080b == 204) {
                throw e.f11966e;
            }
            ((C39703a) bVar.f21081c).getClass();
            ((t31.c) aVar2).c(new C27176a(str, System.currentTimeMillis()));
            Q51.a.a(eVar.f11969c, 0L);
        } else if (abstractC19866a instanceof AbstractC19866a.C1499a) {
            AbstractC19866a.C1499a c1499a = (AbstractC19866a.C1499a) abstractC19866a;
            w1.b bVar3 = e.f11966e;
            String str2 = c1499a.f21079c;
            int i13 = c1499a.f21078b;
            if (i13 == 204) {
                throw e.f11966e;
            }
            if (i13 == 400) {
                t31.c cVar = (t31.c) aVar2;
                ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) cVar.f439142d.getValue();
                ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                int i14 = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i15 = 0; i15 < readHoldCount; i15++) {
                    lock.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    SharedPreferences sharedPreferences = cVar.f439141c;
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                        editorEdit.remove("sber_id_session_id").apply();
                        editorEdit.remove("sber_id_session_expires_at").apply();
                        editorEdit.apply();
                        G0 g02 = G0.f406611a;
                    }
                } finally {
                    while (i14 < readHoldCount) {
                        lock.lock();
                        i14++;
                    }
                    writeLock.unlock();
                }
            } else if (i13 == 500) {
                ((t31.c) aVar2).b(new c(eVar));
            }
        }
        return G0.f406611a;
    }
}
