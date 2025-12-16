package androidx.compose.foundation.gestures;

import androidx.compose.ui.node.AbstractC22430p0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;

/* compiled from: Draggable.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Landroidx/compose/ui/node/p0;", "Landroidx/compose/foundation/gestures/X0;", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DraggableElement extends AbstractC22430p0<X0> {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<androidx.compose.ui.input.pointer.C, Boolean> f27220j;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y0 f27221b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Orientation f27222c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f27223d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final androidx.compose.foundation.interaction.m f27224e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f27225f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Y41.q<kotlinx.coroutines.T, l0.g, Continuation<? super kotlin.G0>, Object> f27226g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Y41.q<kotlinx.coroutines.T, Float, Continuation<? super kotlin.G0>, Object> f27227h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f27228i;

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "it", "", "invoke", "(Landroidx/compose/ui/input/pointer/C;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f27229l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.pointer.C c12) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f27220j = a.f27229l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DraggableElement(@Y61.k Y0 y02, @Y61.k Orientation orientation, boolean z12, @Y61.l androidx.compose.foundation.interaction.m mVar, boolean z13, @Y61.k Y41.q<? super kotlinx.coroutines.T, ? super l0.g, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, @Y61.k Y41.q<? super kotlinx.coroutines.T, ? super Float, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar2, boolean z14) {
        this.f27221b = y02;
        this.f27222c = orientation;
        this.f27223d = z12;
        this.f27224e = mVar;
        this.f27225f = z13;
        this.f27226g = qVar;
        this.f27227h = qVar2;
        this.f27228i = z14;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final v.d a() {
        Y41.l<androidx.compose.ui.input.pointer.C, Boolean> lVar = f27220j;
        boolean z12 = this.f27223d;
        androidx.compose.foundation.interaction.m mVar = this.f27224e;
        Orientation orientation = this.f27222c;
        X0 x02 = new X0(lVar, z12, mVar, orientation);
        x02.f27513z = this.f27221b;
        x02.f27508A = orientation;
        x02.f27509B = this.f27225f;
        x02.f27510C = this.f27226g;
        x02.f27511D = this.f27227h;
        x02.f27512E = this.f27228i;
        return x02;
    }

    @Override // androidx.compose.ui.node.AbstractC22430p0
    public final void b(v.d dVar) {
        boolean z12;
        boolean z13;
        X0 x02 = (X0) dVar;
        Y41.l<androidx.compose.ui.input.pointer.C, Boolean> lVar = f27220j;
        Y0 y02 = x02.f27513z;
        Y0 y03 = this.f27221b;
        if (kotlin.jvm.internal.L.f(y02, y03)) {
            z12 = false;
        } else {
            x02.f27513z = y03;
            z12 = true;
        }
        Orientation orientation = x02.f27508A;
        Orientation orientation2 = this.f27222c;
        if (orientation != orientation2) {
            x02.f27508A = orientation2;
            z12 = true;
        }
        boolean z14 = x02.f27512E;
        boolean z15 = this.f27228i;
        if (z14 != z15) {
            x02.f27512E = z15;
            z13 = true;
        } else {
            z13 = z12;
        }
        x02.f27510C = this.f27226g;
        x02.f27511D = this.f27227h;
        x02.f27509B = this.f27225f;
        x02.v2(lVar, this.f27223d, this.f27224e, orientation2, z13);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return kotlin.jvm.internal.L.f(this.f27221b, draggableElement.f27221b) && this.f27222c == draggableElement.f27222c && this.f27223d == draggableElement.f27223d && kotlin.jvm.internal.L.f(this.f27224e, draggableElement.f27224e) && this.f27225f == draggableElement.f27225f && kotlin.jvm.internal.L.f(this.f27226g, draggableElement.f27226g) && kotlin.jvm.internal.L.f(this.f27227h, draggableElement.f27227h) && this.f27228i == draggableElement.f27228i;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i((this.f27222c.hashCode() + (this.f27221b.hashCode() * 31)) * 31, 31, this.f27223d);
        androidx.compose.foundation.interaction.m mVar = this.f27224e;
        return Boolean.hashCode(this.f27228i) + ((this.f27227h.hashCode() + ((this.f27226g.hashCode() + androidx.appcompat.app.r.i((i12 + (mVar != null ? mVar.hashCode() : 0)) * 31, 31, this.f27225f)) * 31)) * 31);
    }
}
