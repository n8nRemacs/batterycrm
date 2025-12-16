package kotlinx.coroutines.android;

import Y61.k;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.InterfaceC43082c0;
import kotlinx.coroutines.InterfaceC43268o0;
import kotlinx.coroutines.Z;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/android/g;", "Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/c0;", "<init>", "()V", "Lkotlinx/coroutines/android/f;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class g extends AbstractC43129d1 implements InterfaceC43082c0 {
    public /* synthetic */ g(C42822w c42822w) {
        this();
    }

    @k
    public InterfaceC43268o0 g(long j12, @k Runnable runnable, @k CoroutineContext coroutineContext) {
        return Z.f410747a.g(j12, runnable, coroutineContext);
    }

    public g() {
    }
}
