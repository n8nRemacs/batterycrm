package androidx.view;

import A1.a;
import A1.e;
import Y61.k;
import kotlin.G;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.scheduling.c;
import kotlinx.coroutines.t1;

/* compiled from: ViewModel.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class N0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final e f46685a = new e();

    @k
    public static final a a(@k M0 m02) {
        a aVar;
        CoroutineContext coroutineContextY;
        synchronized (f46685a) {
            aVar = (a) m02.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                try {
                    c cVar = C43262l0.f411945a;
                    coroutineContextY = K.f411877a.y();
                } catch (IllegalStateException unused) {
                    coroutineContextY = EmptyCoroutineContext.INSTANCE;
                } catch (G unused2) {
                    coroutineContextY = EmptyCoroutineContext.INSTANCE;
                }
                a aVar2 = new a(coroutineContextY.plus(t1.b()));
                m02.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }
}
