package ru.cyberity.input.tools.threading.safe;

import Y41.a;
import Y61.k;
import com.avito.android.tariff_lf_constructor.configure.checkbox_selector.f;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.collections.C42756l;
import ru.cyberity.input.tools.threading.b;

/* compiled from: Safe.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"T", "", "timeoutMs", "Lkotlin/Function0;", "block", "Lkotlin/Z;", "a", "(JLY41/a;)Ljava/lang/Object;", "cyberity-mobile-sdk-internal-core_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class c {
    public static /* synthetic */ Object a(long j12, a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j12 = 1000;
        }
        return a(j12, aVar);
    }

    @k
    public static final <T> Object a(long j12, @k a<? extends T> aVar) {
        Object bVar;
        Object bVar2;
        StackTraceElement[] stackTrace;
        ArrayList arrayListB = null;
        AtomicReference atomicReference = new AtomicReference(null);
        b bVar3 = b.f436062a;
        if (bVar3.b()) {
            bVar3.c();
        }
        try {
            int i12 = Z.f406624c;
            bVar = b.b().submit(new f(4, atomicReference, aVar));
        } catch (Throwable th2) {
            int i13 = Z.f406624c;
            bVar = new Z.b(th2);
        }
        Throwable thB = Z.b(bVar);
        if (thB != null) {
            return new Z.b(thB);
        }
        Future future = (Future) bVar;
        try {
            bVar2 = future.get(j12, TimeUnit.MILLISECONDS);
        } catch (Throwable th3) {
            int i14 = Z.f406624c;
            bVar2 = new Z.b(th3);
        }
        Throwable thB2 = Z.b(bVar2);
        if (thB2 != null) {
            try {
                if (!(thB2 instanceof TimeoutException)) {
                    throw thB2;
                }
                TimeoutException timeoutException = (TimeoutException) thB2;
                Thread thread = (Thread) atomicReference.get();
                if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
                    arrayListB = C42756l.B(stackTrace);
                }
                throw new a(timeoutException, arrayListB);
            } catch (Throwable th4) {
                int i15 = Z.f406624c;
                bVar2 = new Z.b(th4);
            }
        }
        if (Z.b(bVar2) != null) {
            try {
                future.cancel(true);
            } catch (Throwable unused) {
                int i16 = Z.f406624c;
            }
        }
        return bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object a(AtomicReference atomicReference, a aVar) {
        b bVar = b.f436062a;
        bVar.d();
        atomicReference.set(Thread.currentThread());
        try {
            Object objInvoke = aVar.invoke();
            bVar.a();
            return objInvoke;
        } catch (Throwable th2) {
            b.f436062a.a();
            throw th2;
        }
    }
}
