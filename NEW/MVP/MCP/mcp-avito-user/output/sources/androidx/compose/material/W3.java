package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Drawer.kt */
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/W3;", "", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class W3 {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final b f33299c = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C21398x<DrawerValue> f33300a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.unit.d f33301b;

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/DrawerValue;", "invoke", "(Landroidx/compose/material/DrawerValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<DrawerValue, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f33302l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(DrawerValue drawerValue) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/W3$b;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: Drawer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            f12.floatValue();
            return Float.valueOf(W3.a(W3.this).M0(V3.f33271b));
        }
    }

    /* compiled from: Drawer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            return Float.valueOf(W3.a(W3.this).M0(V3.f33272c));
        }
    }

    public W3(@Y61.k DrawerValue drawerValue, @Y61.k Y41.l<? super DrawerValue, Boolean> lVar) {
        this.f33300a = new C21398x<>(drawerValue, new c(), new d(), V3.f33273d, lVar);
    }

    public static final androidx.compose.ui.unit.d a(W3 w32) {
        androidx.compose.ui.unit.d dVar = w32.f33301b;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(("The density on DrawerState (" + w32 + ") was not set. Did you use DrawerState with the Drawer composable?").toString());
    }

    public /* synthetic */ W3(DrawerValue drawerValue, Y41.l lVar, int i12, C42822w c42822w) {
        this(drawerValue, (i12 & 2) != 0 ? a.f33302l : lVar);
    }
}
