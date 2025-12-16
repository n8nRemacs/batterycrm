package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import shark.AndroidResourceIdNames;

/* compiled from: GraphicsLayerModifier.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/j1;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/v$d;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/r1;", "transformOrigin", "Landroidx/compose/ui/graphics/h1;", "shape", "", "clip", "Landroidx/compose/ui/graphics/Z0;", "renderEffect", "Landroidx/compose/ui/graphics/T;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/e0;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/h1;ZLandroidx/compose/ui/graphics/Z0;JJILkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class j1 extends v.d implements androidx.compose.ui.node.K {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public h1 f39525A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f39526B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public Z0 f39527C;

    /* renamed from: D, reason: collision with root package name */
    public long f39528D;

    /* renamed from: E, reason: collision with root package name */
    public long f39529E;

    /* renamed from: F, reason: collision with root package name */
    public int f39530F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final Y41.l<? super InterfaceC22276o0, kotlin.G0> f39531G;

    /* renamed from: p, reason: collision with root package name */
    public float f39532p;

    /* renamed from: q, reason: collision with root package name */
    public float f39533q;

    /* renamed from: r, reason: collision with root package name */
    public float f39534r;

    /* renamed from: s, reason: collision with root package name */
    public float f39535s;

    /* renamed from: t, reason: collision with root package name */
    public float f39536t;

    /* renamed from: u, reason: collision with root package name */
    public float f39537u;

    /* renamed from: v, reason: collision with root package name */
    public float f39538v;

    /* renamed from: w, reason: collision with root package name */
    public float f39539w;

    /* renamed from: x, reason: collision with root package name */
    public float f39540x;

    /* renamed from: y, reason: collision with root package name */
    public float f39541y;

    /* renamed from: z, reason: collision with root package name */
    public long f39542z;

    /* compiled from: GraphicsLayerModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f39543l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ j1 f39544m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.layout.K0 k02, j1 j1Var) {
            super(1);
            this.f39543l = k02;
            this.f39544m = j1Var;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a.m(aVar, this.f39543l, 0, 0, this.f39544m.f39531G, 4);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public j1(float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f23, long j12, h1 h1Var, boolean z12, Z0 z02, long j13, long j14, int i12, int i13, C42822w c42822w) {
        int i14;
        if ((i13 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0) {
            C22250e0.f39504b.getClass();
            i14 = 0;
        } else {
            i14 = i12;
        }
        this(f12, f13, f14, f15, f16, f17, f18, f19, f22, f23, j12, h1Var, z12, z02, j13, j14, i14, null);
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    @Override // androidx.compose.ui.node.K
    @Y61.k
    public final InterfaceC22367j0 f(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(j12);
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, kotlin.collections.P0.c(), new a(k0I, this));
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb2.append(this.f39532p);
        sb2.append(", scaleY=");
        sb2.append(this.f39533q);
        sb2.append(", alpha = ");
        sb2.append(this.f39534r);
        sb2.append(", translationX=");
        sb2.append(this.f39535s);
        sb2.append(", translationY=");
        sb2.append(this.f39536t);
        sb2.append(", shadowElevation=");
        sb2.append(this.f39537u);
        sb2.append(", rotationX=");
        sb2.append(this.f39538v);
        sb2.append(", rotationY=");
        sb2.append(this.f39539w);
        sb2.append(", rotationZ=");
        sb2.append(this.f39540x);
        sb2.append(", cameraDistance=");
        sb2.append(this.f39541y);
        sb2.append(", transformOrigin=");
        sb2.append((Object) r1.e(this.f39542z));
        sb2.append(", shape=");
        sb2.append(this.f39525A);
        sb2.append(", clip=");
        sb2.append(this.f39526B);
        sb2.append(", renderEffect=");
        sb2.append(this.f39527C);
        sb2.append(", ambientShadowColor=");
        androidx.compose.foundation.H.z(this.f39528D, ", spotShadowColor=", sb2);
        androidx.compose.foundation.H.z(this.f39529E, ", compositingStrategy=", sb2);
        sb2.append((Object) C22250e0.b(this.f39530F));
        sb2.append(')');
        return sb2.toString();
    }

    public j1(float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f22, float f23, long j12, h1 h1Var, boolean z12, Z0 z02, long j13, long j14, int i12, C42822w c42822w) {
        this.f39532p = f12;
        this.f39533q = f13;
        this.f39534r = f14;
        this.f39535s = f15;
        this.f39536t = f16;
        this.f39537u = f17;
        this.f39538v = f18;
        this.f39539w = f19;
        this.f39540x = f22;
        this.f39541y = f23;
        this.f39542z = j12;
        this.f39525A = h1Var;
        this.f39526B = z12;
        this.f39527C = z02;
        this.f39528D = j13;
        this.f39529E = j14;
        this.f39530F = i12;
        this.f39531G = new i1(this);
    }
}
