package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.c3;
import androidx.compose.foundation.text.selection.C20998b0;
import androidx.compose.foundation.text.selection.C21035s;
import androidx.compose.foundation.text.selection.InterfaceC21041v;
import androidx.compose.foundation.text.selection.V0;
import androidx.compose.runtime.B2;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.input.pointer.C22346y;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SelectionController.kt */
@P
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/k;", "Landroidx/compose/runtime/B2;", "", "selectableId", "Landroidx/compose/foundation/text/selection/V0;", "selectionRegistrar", "Landroidx/compose/ui/graphics/T;", "backgroundSelectionColor", "Landroidx/compose/foundation/text/modifiers/p;", "params", "<init>", "(JLandroidx/compose/foundation/text/selection/V0;JLandroidx/compose/foundation/text/modifiers/p;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k implements B2 {

    /* renamed from: b, reason: collision with root package name */
    public final long f31669b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final V0 f31670c;

    /* renamed from: d, reason: collision with root package name */
    public final long f31671d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public p f31672e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public InterfaceC21041v f31673f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final v f31674g;

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/layout/A;", "invoke", "()Landroidx/compose/ui/layout/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<A> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final A invoke() {
            return k.this.f31672e.f31688a;
        }
    }

    /* compiled from: SelectionController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/text/o0;", "invoke", "()Landroidx/compose/ui/text/o0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<o0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final o0 invoke() {
            return k.this.f31672e.f31689b;
        }
    }

    public k(long j12, V0 v02, long j13, p pVar, C42822w c42822w) {
        this.f31669b = j12;
        this.f31670c = v02;
        this.f31671d = j13;
        this.f31672e = pVar;
        j jVar = new j(this);
        l lVar = new l(jVar, v02, j12);
        this.f31674g = C22346y.a(C20998b0.i(v.f42878y1, new m(jVar, v02, j12), lVar), c3.f30671a);
    }

    @Override // androidx.compose.runtime.B2
    public final void b() {
        InterfaceC21041v interfaceC21041v = this.f31673f;
        if (interfaceC21041v != null) {
            this.f31670c.b(interfaceC21041v);
            this.f31673f = null;
        }
    }

    @Override // androidx.compose.runtime.B2
    public final void c() {
        this.f31673f = this.f31670c.f(new C21035s(this.f31669b, new a(), new b()));
    }

    @Override // androidx.compose.runtime.B2
    public final void e() {
        InterfaceC21041v interfaceC21041v = this.f31673f;
        if (interfaceC21041v != null) {
            this.f31670c.b(interfaceC21041v);
            this.f31673f = null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(long j12, V0 v02, long j13, p pVar, int i12, C42822w c42822w) {
        p pVar2;
        if ((i12 & 8) != 0) {
            p.f31686c.getClass();
            pVar2 = p.f31687d;
        } else {
            pVar2 = pVar;
        }
        this(j12, v02, j13, pVar2, null);
    }
}
