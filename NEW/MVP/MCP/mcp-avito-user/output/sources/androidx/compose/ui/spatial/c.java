package androidx.compose.ui.spatial;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.graphics.H0;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.node.P;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;

/* compiled from: RectListDebugger.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/spatial/c;", "Landroidx/compose/ui/node/u;", "Landroidx/compose/ui/v$d;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class c extends v.d implements InterfaceC22438u {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Paint f41866p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public Object f41867q;

    /* compiled from: RectListDebugger.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            C22440v.a(c.this);
            return G0.f406611a;
        }
    }

    public c() {
        C22273n c22273n = new C22273n();
        T.f39320b.getClass();
        c22273n.b(T.f39324f);
        H0.f39278b.getClass();
        c22273n.q(H0.f39279c);
        this.f41866p = c22273n.f39702a;
    }

    @Override // androidx.compose.ui.v.d
    public final void c2() {
        i rectManager = C22421l.h(this).getRectManager();
        a aVar = new a();
        rectManager.f41872c.f(aVar);
        this.f41867q = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.v.d
    public final void d2() {
        i rectManager = C22421l.h(this).getRectManager();
        Object obj = this.f41867q;
        rectManager.getClass();
        if ((v0.f(0, obj) ? (Y41.a) obj : null) == null) {
            return;
        }
        rectManager.f41872c.j(obj);
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k P p12) {
        b bVar = C22421l.h(this).getRectManager().f41870a;
        M mA2 = p12.f40671b.f39478c.a();
        Canvas canvas = C22247d.f39473a;
        Canvas canvas2 = ((C22245c) mA2).f39351a;
        long[] jArr = bVar.f41863a;
        int i12 = bVar.f41865c;
        for (int i13 = 0; i13 < jArr.length - 2 && i13 < i12; i13 += 3) {
            long j12 = jArr[i13];
            long j13 = jArr[i13 + 1];
            long j14 = jArr[i13 + 2];
            canvas2.drawRect((int) (j12 >> 32), (int) j12, (int) (j13 >> 32), (int) j13, this.f41866p);
        }
    }
}
