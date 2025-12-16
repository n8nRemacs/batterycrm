package androidx.view.compose;

import Y41.l;
import Y41.p;
import Y61.k;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.view.H;
import androidx.view.s;
import androidx.view.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ReportDrawn.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    /* compiled from: ReportDrawn.kt */
    @s0
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends N implements l<C22128n0, InterfaceC22118l0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ s f21211l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Boolean> f21212m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, Y41.a<Boolean> aVar) {
            super(1);
            this.f21211l = sVar;
            this.f21212m = aVar;
        }

        @Override // Y41.l
        public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
            boolean z12;
            s sVar = this.f21211l;
            synchronized (sVar.f21277c) {
                z12 = sVar.f21280f;
            }
            return z12 ? new w() : new x(new p(sVar, this.f21212m));
        }
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Boolean> f21213l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, Y41.a aVar) {
            super(2);
            this.f21213l = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            y.a(this.f21213l, a12, 7);
            return G0.f406611a;
        }
    }

    /* compiled from: ReportDrawn.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Boolean> f21214l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i12, Y41.a aVar) {
            super(2);
            this.f21214l = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            y.a(this.f21214l, a12, 7);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    public static final void a(@k Y41.a<Boolean> aVar, @Y61.l A a12, int i12) {
        s fullyDrawnReporter;
        B bE2 = a12.E(-2047119994);
        if ((i12 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            l.f21195a.getClass();
            bE2.I(540186968);
            v vVarA = (v) bE2.o(l.f21196b);
            bE2.I(1606493384);
            if (vVarA == null) {
                vVarA = H.a((View) bE2.o(AndroidCompositionLocals_androidKt.f41073f));
            }
            bE2.O();
            if (vVarA == null) {
                Object baseContext = (Context) bE2.o(AndroidCompositionLocals_androidKt.f41069b);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        baseContext = null;
                        break;
                    } else if (baseContext instanceof v) {
                        break;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                vVarA = (v) baseContext;
            }
            bE2.O();
            if (vVarA == null || (fullyDrawnReporter = vVarA.getFullyDrawnReporter()) == null) {
                C22039c2 c22039c2Z = bE2.Z();
                if (c22039c2Z == null) {
                    return;
                }
                c22039c2Z.f38184d = new c(i12, aVar);
                return;
            }
            C22187u0.b(fullyDrawnReporter, aVar, new a(fullyDrawnReporter, aVar), bE2);
        }
        C22039c2 c22039c2Z2 = bE2.Z();
        if (c22039c2Z2 == null) {
            return;
        }
        c22039c2Z2.f38184d = new b(i12, aVar);
    }
}
