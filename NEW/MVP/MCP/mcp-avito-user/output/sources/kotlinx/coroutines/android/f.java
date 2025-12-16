package kotlinx.coroutines.android;

import Y61.k;
import Y61.l;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.s;
import kotlinx.coroutines.AbstractC43129d1;
import kotlinx.coroutines.C43224g1;
import kotlinx.coroutines.C43262l0;
import kotlinx.coroutines.InterfaceC43082c0;
import kotlinx.coroutines.InterfaceC43268o0;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.internal.K;
import kotlinx.coroutines.r;

/* compiled from: HandlerDispatcher.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/android/f;", "Lkotlinx/coroutines/android/g;", "Lkotlinx/coroutines/c0;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f extends g implements InterfaceC43082c0 {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Handler f410762c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f410763d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f410764e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final f f410765f;

    public f(Handler handler, String str, boolean z12) {
        super(null);
        this.f410762c = handler;
        this.f410763d = str;
        this.f410764e = z12;
        this.f410765f = z12 ? this : new f(handler, str, true);
    }

    public final void B(CoroutineContext coroutineContext, Runnable runnable) {
        Q0.b(coroutineContext, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C43262l0.f411947c.h(coroutineContext, runnable);
    }

    public final boolean equals(@l Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (fVar.f410762c == this.f410762c && fVar.f410764e == this.f410764e) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.coroutines.InterfaceC43082c0
    public final void f(long j12, @k r rVar) {
        d dVar = new d(rVar, this);
        if (this.f410762c.postDelayed(dVar, s.d(j12, 4611686018427387903L))) {
            rVar.r(new e(this, dVar));
        } else {
            B(rVar.f411960f, dVar);
        }
    }

    @Override // kotlinx.coroutines.android.g, kotlinx.coroutines.InterfaceC43082c0
    @k
    public final InterfaceC43268o0 g(long j12, @k final Runnable runnable, @k CoroutineContext coroutineContext) {
        if (this.f410762c.postDelayed(runnable, s.d(j12, 4611686018427387903L))) {
            return new InterfaceC43268o0() { // from class: kotlinx.coroutines.android.c
                @Override // kotlinx.coroutines.InterfaceC43268o0
                public final void dispose() {
                    this.f410756b.f410762c.removeCallbacks(runnable);
                }
            };
        }
        B(coroutineContext, runnable);
        return C43224g1.f411855b;
    }

    @Override // kotlinx.coroutines.M
    public final void h(@k CoroutineContext coroutineContext, @k Runnable runnable) {
        if (this.f410762c.post(runnable)) {
            return;
        }
        B(coroutineContext, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.f410762c) ^ (this.f410764e ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.M
    public final boolean p(@k CoroutineContext coroutineContext) {
        return (this.f410764e && L.f(Looper.myLooper(), this.f410762c.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.AbstractC43129d1, kotlinx.coroutines.M
    @k
    public final String toString() {
        AbstractC43129d1 abstractC43129d1Y;
        String str;
        kotlinx.coroutines.scheduling.c cVar = C43262l0.f411945a;
        AbstractC43129d1 abstractC43129d1 = K.f411877a;
        if (this == abstractC43129d1) {
            str = "Dispatchers.Main";
        } else {
            try {
                abstractC43129d1Y = abstractC43129d1.y();
            } catch (UnsupportedOperationException unused) {
                abstractC43129d1Y = null;
            }
            str = this == abstractC43129d1Y ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f410763d;
        if (string == null) {
            string = this.f410762c.toString();
        }
        return this.f410764e ? androidx.appcompat.app.r.q(string, ".immediate") : string;
    }

    @Override // kotlinx.coroutines.AbstractC43129d1
    public final AbstractC43129d1 y() {
        return this.f410765f;
    }

    public f(Handler handler, String str, int i12, C42822w c42822w) {
        this(handler, (i12 & 2) != 0 ? null : str, false);
    }
}
