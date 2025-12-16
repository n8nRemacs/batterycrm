package kotlinx.coroutines.internal;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.InterfaceC43082c0;
import kotlinx.coroutines.InterfaceC43268o0;

/* compiled from: MainDispatchers.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/M;", "Lkotlinx/coroutines/d1;", "Lkotlinx/coroutines/c0;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
final class M extends AbstractC43129d1 implements InterfaceC43082c0 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Throwable f411878c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f411879d;

    public M(Throwable th2, String str, int i12, C42822w c42822w) {
        str = (i12 & 2) != 0 ? null : str;
        this.f411878c = th2;
        this.f411879d = str;
    }

    public final void B() {
        String strConcat;
        Throwable th2 = this.f411878c;
        if (th2 == null) {
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        }
        String str = this.f411879d;
        if (str == null || (strConcat = ". ".concat(str)) == null) {
            strConcat = "";
        }
        throw new IllegalStateException("Module with the Main dispatcher had failed to initialize".concat(strConcat), th2);
    }

    @Override // kotlinx.coroutines.InterfaceC43082c0
    public final void f(long j12, kotlinx.coroutines.r rVar) {
        B();
        throw null;
    }

    @Override // kotlinx.coroutines.InterfaceC43082c0
    @Y61.k
    public final InterfaceC43268o0 g(long j12, @Y61.k Runnable runnable, @Y61.k CoroutineContext coroutineContext) {
        B();
        throw null;
    }

    @Override // kotlinx.coroutines.M
    public final void h(CoroutineContext coroutineContext, Runnable runnable) {
        B();
        throw null;
    }

    @Override // kotlinx.coroutines.M
    public final boolean p(@Y61.k CoroutineContext coroutineContext) {
        B();
        throw null;
    }

    @Override // kotlinx.coroutines.AbstractC43129d1, kotlinx.coroutines.M
    @Y61.k
    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("Dispatchers.Main[missing");
        Throwable th2 = this.f411878c;
        if (th2 != null) {
            str = ", cause=" + th2;
        } else {
            str = "";
        }
        return C22026a.c(sb2, str, ']');
    }

    @Override // kotlinx.coroutines.AbstractC43129d1
    @Y61.k
    public final AbstractC43129d1 y() {
        return this;
    }
}
