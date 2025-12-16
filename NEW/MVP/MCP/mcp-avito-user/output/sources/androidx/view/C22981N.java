package androidx.view;

import Y61.k;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;
import kotlinx.coroutines.t1;

/* compiled from: Lifecycle.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22981N {
    @k
    public static final C22977J a(@k Lifecycle lifecycle) {
        while (true) {
            AtomicReference<Object> atomicReference = lifecycle.f46677a;
            C22977J c22977j = (C22977J) atomicReference.get();
            if (c22977j != null) {
                return c22977j;
            }
            CoroutineContext.Element elementB = t1.b();
            c cVar = C43262l0.f411945a;
            C22977J c22977j2 = new C22977J(lifecycle, CoroutineContext.Element.DefaultImpls.plus((V0) elementB, K.f411877a.y()));
            while (!atomicReference.compareAndSet(null, c22977j2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            c cVar2 = C43262l0.f411945a;
            C43259k.d(c22977j2, K.f411877a.y(), null, new C22976I(c22977j2, null), 2);
            return c22977j2;
        }
    }
}
