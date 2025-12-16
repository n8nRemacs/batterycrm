package androidx.work.impl;

import androidx.work.C23540d;
import java.lang.reflect.InvocationTargetException;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: WorkerWrapper.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes10.dex */
final class p0 extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ androidx.work.F f55904l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f55905m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f55906n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0 f55907o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(androidx.work.F f12, boolean z12, String str, l0 l0Var) {
        super(1);
        this.f55904l = f12;
        this.f55905m = z12;
        this.f55906n = str;
        this.f55907o = l0Var;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String str;
        Throwable th3 = th2;
        if (th3 instanceof WorkerStoppedException) {
            this.f55904l.stop(((WorkerStoppedException) th3).f55553b);
        }
        if (this.f55905m && (str = this.f55906n) != null) {
            l0 l0Var = this.f55907o;
            C23540d c23540d = l0Var.f55762f.f55462p;
            int iHashCode = l0Var.f55757a.hashCode();
            c23540d.getClass();
            androidx.tracing.b.b(iHashCode, str);
        }
        return G0.f406611a;
    }
}
