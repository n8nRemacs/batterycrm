package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.C20304o;
import androidx.compose.animation.core.C20318t;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: LazyLayoutScrollScope.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/core/o;", "", "Landroidx/compose/animation/core/t;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/core/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: androidx.compose.foundation.lazy.layout.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20726j0 extends kotlin.jvm.internal.N implements Y41.l<C20304o<Float, C20318t>, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20722h0 f29441l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f29442m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ float f29443n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0.e f29444o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l0.a f29445p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f29446q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ float f29447r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l0.f f29448s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f29449t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f29450u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l0.h<androidx.compose.animation.core.r<Float, C20318t>> f29451v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20726j0(InterfaceC20722h0 interfaceC20722h0, int i12, float f12, l0.e eVar, l0.a aVar, boolean z12, float f13, l0.f fVar, int i13, int i14, l0.h<androidx.compose.animation.core.r<Float, C20318t>> hVar) {
        super(1);
        this.f29441l = interfaceC20722h0;
        this.f29442m = i12;
        this.f29443n = f12;
        this.f29444o = eVar;
        this.f29445p = aVar;
        this.f29446q = z12;
        this.f29447r = f13;
        this.f29448s = fVar;
        this.f29449t = i13;
        this.f29450u = i14;
        this.f29451v = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.G0 invoke(androidx.compose.animation.core.C20304o<java.lang.Float, androidx.compose.animation.core.C20318t> r11) {
        /*
            r10 = this;
            androidx.compose.animation.core.o r11 = (androidx.compose.animation.core.C20304o) r11
            androidx.compose.foundation.lazy.layout.h0 r0 = r10.f29441l
            int r1 = r10.f29442m
            boolean r2 = androidx.compose.foundation.lazy.layout.C20730l0.c(r0, r1)
            kotlin.jvm.internal.l0$a r3 = r10.f29445p
            int r4 = r10.f29450u
            boolean r5 = r10.f29446q
            r6 = 0
            if (r2 != 0) goto Lbe
            r2 = 0
            float r7 = r10.f29443n
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2d
            androidx.compose.runtime.y1 r2 = r11.f26389e
            androidx.compose.runtime.i3 r2 = (androidx.compose.runtime.C22082i3) r2
            java.lang.Object r2 = r2.getF42167b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = kotlin.ranges.s.c(r2, r7)
            goto L3f
        L2d:
            androidx.compose.runtime.y1 r2 = r11.f26389e
            androidx.compose.runtime.i3 r2 = (androidx.compose.runtime.C22082i3) r2
            java.lang.Object r2 = r2.getF42167b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = kotlin.ranges.s.a(r2, r7)
        L3f:
            kotlin.jvm.internal.l0$e r7 = r10.f29444o
            float r8 = r7.f406839b
            float r2 = r2 - r8
            float r8 = r0.a(r2)
            boolean r9 = androidx.compose.foundation.lazy.layout.C20730l0.c(r0, r1)
            if (r9 == 0) goto L50
            goto Lbe
        L50:
            boolean r9 = androidx.compose.foundation.lazy.layout.C20730l0.a(r5, r0, r1, r4)
            if (r9 != 0) goto Lbe
            int r8 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r8 != 0) goto Lb8
            float r8 = r7.f406839b
            float r8 = r8 + r2
            r7.f406839b = r8
            float r2 = r10.f29447r
            if (r5 == 0) goto L79
            androidx.compose.runtime.y1 r7 = r11.f26389e
            androidx.compose.runtime.i3 r7 = (androidx.compose.runtime.C22082i3) r7
            java.lang.Object r7 = r7.getF42167b()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 <= 0) goto L8f
            r11.a()
            goto L8f
        L79:
            androidx.compose.runtime.y1 r7 = r11.f26389e
            androidx.compose.runtime.i3 r7 = (androidx.compose.runtime.C22082i3) r7
            java.lang.Object r7 = r7.getF42167b()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            float r2 = -r2
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 >= 0) goto L8f
            r11.a()
        L8f:
            kotlin.jvm.internal.l0$f r2 = r10.f29448s
            r7 = 2
            int r8 = r10.f29449t
            if (r5 == 0) goto La8
            int r2 = r2.f406840b
            if (r2 < r7) goto Lbe
            int r2 = r0.d()
            int r2 = r1 - r2
            if (r2 <= r8) goto Lbe
            int r2 = r1 - r8
            r0.e(r2, r6)
            goto Lbe
        La8:
            int r2 = r2.f406840b
            if (r2 < r7) goto Lbe
            int r2 = r0.c()
            int r2 = r2 - r1
            if (r2 <= r8) goto Lbe
            int r8 = r8 + r1
            r0.e(r8, r6)
            goto Lbe
        Lb8:
            r11.a()
            r3.f406838b = r6
            goto Ld3
        Lbe:
            boolean r2 = androidx.compose.foundation.lazy.layout.C20730l0.a(r5, r0, r1, r4)
            if (r2 == 0) goto Lcd
            r0.e(r1, r4)
            r3.f406838b = r6
            r11.a()
            goto Ld3
        Lcd:
            boolean r11 = androidx.compose.foundation.lazy.layout.C20730l0.c(r0, r1)
            if (r11 != 0) goto Ld6
        Ld3:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        Ld6:
            int r11 = r0.f(r1)
            androidx.compose.foundation.lazy.layout.h r0 = new androidx.compose.foundation.lazy.layout.h
            kotlin.jvm.internal.l0$h<androidx.compose.animation.core.r<java.lang.Float, androidx.compose.animation.core.t>> r1 = r10.f29451v
            T r1 = r1.f406842b
            androidx.compose.animation.core.r r1 = (androidx.compose.animation.core.r) r1
            r0.<init>(r11, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C20726j0.invoke(java.lang.Object):java.lang.Object");
    }
}
