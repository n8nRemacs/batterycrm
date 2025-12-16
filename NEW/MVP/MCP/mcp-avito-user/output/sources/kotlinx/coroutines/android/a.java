package kotlinx.coroutines.android;

import Y61.k;
import android.os.Looper;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.internal.J;

/* compiled from: HandlerDispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/android/a;", "Lkotlinx/coroutines/internal/J;", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a implements J {
    @Override // kotlinx.coroutines.internal.J
    @k
    public final AbstractC43129d1 a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new f(j.b(mainLooper), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.J
    public final int b() {
        return 1073741823;
    }
}
