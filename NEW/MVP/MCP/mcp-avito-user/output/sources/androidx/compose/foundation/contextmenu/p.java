package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.text.C20991s0;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.snapshots.D;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ContextMenuUi.android.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/contextmenu/p;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final D<Y41.q<g, androidx.compose.runtime.A, Integer, G0>> f27037a = new D<>();

    /* compiled from: ContextMenuUi.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ g f27039m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, int i12) {
            super(2);
            this.f27039m = gVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            p.this.a(this.f27039m, a12, iA2);
            return G0.f406611a;
        }
    }

    public static void b(p pVar, C20991s0 c20991s0, Y41.a aVar) {
        v.a aVar2 = androidx.compose.ui.v.f42878y1;
        pVar.getClass();
        pVar.f27037a.add(new C22096n(262103052, new q(c20991s0, aVar2, aVar), true));
    }

    @InterfaceC22132o
    public final void a(@Y61.k g gVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(1320309496);
        int i13 = (bE2.B(gVar) ? 4 : 2) | i12 | (bE2.B(this) ? 32 : 16);
        if (bE2.p(i13 & 1, (i13 & 19) != 18)) {
            D<Y41.q<g, androidx.compose.runtime.A, Integer, G0>> d12 = this.f27037a;
            int size = d12.size();
            for (int i14 = 0; i14 < size; i14++) {
                d12.get(i14).invoke(gVar, bE2, Integer.valueOf(i13 & 14));
            }
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(gVar, i12);
        }
    }
}
