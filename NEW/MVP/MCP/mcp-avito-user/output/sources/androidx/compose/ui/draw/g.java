package androidx.compose.ui.draw;

import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.InterfaceC22264l0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.node.D0;
import androidx.compose.ui.node.E0;
import androidx.compose.ui.node.P;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DrawModifier.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/draw/g;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/draw/f;", "Landroidx/compose/ui/node/D0;", "Landroidx/compose/ui/draw/e;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class g extends v.d implements f, D0, e {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final i f39039p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f39040q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public w f39041r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super i, p> f39042s;

    /* compiled from: DrawModifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/graphics/l0;", "invoke", "()Landroidx/compose/ui/graphics/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<InterfaceC22264l0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC22264l0 invoke() {
            g gVar = g.this;
            w wVar = gVar.f39041r;
            if (wVar == null) {
                wVar = new w();
                gVar.f39041r = wVar;
            }
            if (wVar.f39072b == null) {
                InterfaceC22264l0 graphicsContext = C22421l.h(gVar).getGraphicsContext();
                wVar.c();
                wVar.f39072b = graphicsContext;
            }
            return wVar;
        }
    }

    public g(@Y61.k i iVar, @Y61.k Y41.l<? super i, p> lVar) {
        this.f39039p = iVar;
        this.f39042s = lVar;
        iVar.f39046b = this;
        iVar.f39049e = new a();
    }

    @Override // androidx.compose.ui.node.InterfaceC22419k, androidx.compose.ui.node.P0
    public final void B() {
        D0();
    }

    @Override // androidx.compose.ui.draw.f
    public final void D0() {
        w wVar = this.f39041r;
        if (wVar != null) {
            wVar.c();
        }
        this.f39040q = false;
        this.f39039p.f39047c = null;
        C22440v.a(this);
    }

    @Override // androidx.compose.ui.node.InterfaceC22419k
    public final void H1() {
        D0();
    }

    @Override // androidx.compose.ui.node.D0
    public final void K1() {
        D0();
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        w wVar = this.f39041r;
        if (wVar != null) {
            wVar.c();
        }
    }

    @Override // androidx.compose.ui.draw.e
    @Y61.k
    public final androidx.compose.ui.unit.d getDensity() {
        return C22421l.g(this).f40608B;
    }

    @Override // androidx.compose.ui.draw.e
    @Y61.k
    public final LayoutDirection getLayoutDirection() {
        return C22421l.g(this).f40609C;
    }

    @Override // androidx.compose.ui.draw.e
    public final long i() {
        return androidx.compose.ui.unit.v.c(C22421l.e(this, 128).f40347d);
    }

    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void r1() {
        D0();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // androidx.compose.ui.node.InterfaceC22438u
    public final void t(@Y61.k P p12) {
        boolean z12 = this.f39040q;
        i iVar = this.f39039p;
        if (!z12) {
            iVar.f39047c = null;
            iVar.f39048d = p12;
            E0.a(this, new h(this, iVar));
            if (iVar.f39047c == null) {
                throw H.s("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f39040q = true;
        }
        iVar.f39047c.f39058a.invoke(p12);
    }
}
