package androidx.view.compose;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.C22166k;
import androidx.compose.runtime.snapshots.H;
import androidx.view.s;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: ReportDrawn.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/activity/compose/p;", "Lkotlin/Function0;", "Lkotlin/G0;", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class p implements Y41.a<G0> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final s f21201b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<Boolean> f21202c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final H f21203d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final l<Y41.a<Boolean>, G0> f21204e;

    /* compiled from: ReportDrawn.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements l<Y41.a<? extends Boolean>, G0> {
        public final void f(@k Y41.a<Boolean> aVar) {
            boolean z12;
            p pVar = (p) this.receiver;
            pVar.getClass();
            l0.a aVar2 = new l0.a();
            pVar.f21203d.e(aVar, pVar.f21204e, new q(aVar2, aVar));
            if (aVar2.f406838b) {
                pVar.f21203d.c(pVar.f21202c);
                s sVar = pVar.f21201b;
                synchronized (sVar.f21277c) {
                    z12 = sVar.f21280f;
                }
                if (!z12) {
                    sVar.b();
                }
                H h12 = pVar.f21203d;
                h12.b();
                C22166k c22166k = h12.f38634h;
                if (c22166k != null) {
                    c22166k.dispose();
                }
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Y41.a<? extends Boolean> aVar) {
            f(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "command", "invoke", "(LY41/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements l<Y41.a<? extends G0>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f21205l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Y41.a<? extends G0> aVar) {
            aVar.invoke();
            return G0.f406611a;
        }
    }

    public p(@k s sVar, @k Y41.a<Boolean> aVar) {
        boolean z12;
        boolean z13;
        boolean z14;
        this.f21201b = sVar;
        this.f21202c = aVar;
        H h12 = new H(b.f21205l);
        AbstractC22167l.a aVar2 = AbstractC22167l.f38720e;
        Y41.p<Set<? extends Object>, AbstractC22167l, G0> pVar = h12.f38630d;
        aVar2.getClass();
        h12.f38634h = AbstractC22167l.a.d(pVar);
        this.f21203d = h12;
        a aVar3 = new a(1, this, p.class, "observeReporter", "observeReporter(Lkotlin/jvm/functions/Function0;)V", 0);
        this.f21204e = aVar3;
        synchronized (sVar.f21277c) {
            if (sVar.f21280f) {
                z12 = true;
            } else {
                sVar.f21281g.add(this);
                z12 = false;
            }
        }
        if (z12) {
            invoke();
        }
        synchronized (sVar.f21277c) {
            z13 = sVar.f21280f;
        }
        if (z13) {
            return;
        }
        synchronized (sVar.f21277c) {
            try {
                if (!sVar.f21280f) {
                    sVar.f21278d++;
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        l0.a aVar4 = new l0.a();
        h12.e(aVar, aVar3, new q(aVar4, aVar));
        if (aVar4.f406838b) {
            h12.c(aVar);
            synchronized (sVar.f21277c) {
                z14 = sVar.f21280f;
            }
            if (!z14) {
                sVar.b();
            }
            h12.b();
            C22166k c22166k = h12.f38634h;
            if (c22166k != null) {
                c22166k.dispose();
            }
        }
    }

    @Override // Y41.a
    public final G0 invoke() {
        H h12 = this.f21203d;
        h12.b();
        C22166k c22166k = h12.f38634h;
        if (c22166k != null) {
            c22166k.dispose();
        }
        return G0.f406611a;
    }
}
