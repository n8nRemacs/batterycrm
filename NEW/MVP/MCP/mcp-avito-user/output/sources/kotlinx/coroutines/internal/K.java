package kotlinx.coroutines.internal;

import java.util.Iterator;
import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlinx.coroutines.AbstractC43129d1;

/* compiled from: MainDispatchers.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/internal/K;", "", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @Y61.k
    public static final AbstractC43129d1 f411877a;

    static {
        Object obj;
        new K();
        String strC = d0.c("kotlinx.coroutines.fast.service.loader");
        if (strC != null) {
            Boolean.parseBoolean(strC);
        }
        Iterator it = C43033p.D(C43033p.b(ServiceLoader.load(J.class, J.class.getClassLoader()).iterator())).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int iB2 = ((J) next).b();
                do {
                    Object next2 = it.next();
                    int iB3 = ((J) next2).b();
                    if (iB2 < iB3) {
                        next = next2;
                        iB2 = iB3;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        J j12 = (J) obj;
        if (j12 == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        f411877a = j12.a();
    }
}
