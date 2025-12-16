package kotlinx.coroutines.rx3;

import io.reactivex.rxjava3.core.InterfaceC41770c;
import io.reactivex.rxjava3.core.InterfaceC41772e;
import kotlin.InterfaceC43072x;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC43075a;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.D0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class J implements io.reactivex.rxjava3.core.C, io.reactivex.rxjava3.core.M, InterfaceC41772e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D0 f412056b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f412057c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43072x f412058d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ J(D0 d02, CoroutineContext coroutineContext, Y41.p pVar, int i12) {
        this.f412056b = d02;
        this.f412057c = coroutineContext;
        switch (i12) {
            case 1:
                this.f412058d = (SuspendLambda) pVar;
                break;
            case 2:
                this.f412058d = pVar;
                break;
            default:
                this.f412058d = (SuspendLambda) pVar;
                break;
        }
    }

    @Override // io.reactivex.rxjava3.core.InterfaceC41772e
    public void e(InterfaceC41770c interfaceC41770c) {
        AbstractC43075a c43297u = new C43297u(kotlinx.coroutines.K.c(this.f412056b, this.f412057c), interfaceC41770c);
        interfaceC41770c.f(new C43293p(c43297u));
        c43297u.E0(CoroutineStart.f410680b, c43297u, (Y41.p) this.f412058d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // io.reactivex.rxjava3.core.C
    public void f(io.reactivex.rxjava3.core.B b12) {
        I i12 = new I(kotlinx.coroutines.K.c(this.f412056b, this.f412057c), b12);
        b12.f(new C43293p(i12));
        i12.E0(CoroutineStart.f410680b, i12, (SuspendLambda) this.f412058d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [Y41.p, kotlin.coroutines.jvm.internal.SuspendLambda] */
    @Override // io.reactivex.rxjava3.core.M
    public void j(io.reactivex.rxjava3.core.K k12) {
        P p12 = new P(kotlinx.coroutines.K.c(this.f412056b, this.f412057c), k12);
        k12.f(new C43293p(p12));
        p12.E0(CoroutineStart.f410680b, p12, (SuspendLambda) this.f412058d);
    }
}
