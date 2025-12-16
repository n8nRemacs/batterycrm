package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC20307p;
import androidx.compose.foundation.gestures.Orientation;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BackdropScaffold.kt */
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/L0;", "", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.l<BackdropValue, Boolean> f32845a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C21398x<BackdropValue> f32846b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.unit.d f32847c;

    /* compiled from: BackdropScaffold.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BackdropValue;", "invoke", "(Landroidx/compose/material/BackdropValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<BackdropValue, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f32848l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(BackdropValue backdropValue) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: BackdropScaffold.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/L0$b;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: BackdropScaffold.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            f12.floatValue();
            return Float.valueOf(L0.a(L0.this).M0(K0.f32813b));
        }
    }

    /* compiled from: BackdropScaffold.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            return Float.valueOf(L0.a(L0.this).M0(K0.f32812a));
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42830m
    public L0(@Y61.k BackdropValue backdropValue, @Y61.k InterfaceC20307p<Float> interfaceC20307p, @Y61.k Y41.l<? super BackdropValue, Boolean> lVar, @Y61.k C21224j9 c21224j9) {
        this.f32845a = lVar;
        C21398x<BackdropValue> c21398x = new C21398x<>(backdropValue, new c(), new d(), interfaceC20307p, lVar);
        this.f32846b = c21398x;
        Orientation orientation = Orientation.f27425b;
        float f12 = K0.f32812a;
        new E0(c21398x);
    }

    public static final androidx.compose.ui.unit.d a(L0 l02) {
        androidx.compose.ui.unit.d dVar = l02.f32847c;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("The density on BackdropScaffoldState (" + l02 + ") was not set. Did you use BackdropScaffoldState with the BackdropScaffold composable?").toString());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public L0(BackdropValue backdropValue, InterfaceC20307p interfaceC20307p, Y41.l lVar, C21224j9 c21224j9, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            C21111b0.f33444a.getClass();
            interfaceC20307p = C21111b0.f33445b;
        }
        this(backdropValue, interfaceC20307p, (i12 & 4) != 0 ? a.f32848l : lVar, (i12 & 8) != 0 ? new C21224j9() : c21224j9);
    }
}
