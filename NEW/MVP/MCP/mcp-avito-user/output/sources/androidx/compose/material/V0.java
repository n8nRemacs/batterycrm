package androidx.compose.material;

import androidx.compose.animation.core.InterfaceC20307p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Drawer.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material/V0;", "", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C21398x<BottomDrawerValue> f33265a;

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material/BottomDrawerValue;", "invoke", "(Landroidx/compose/material/BottomDrawerValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<BottomDrawerValue, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f33266l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(BottomDrawerValue bottomDrawerValue) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: Drawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/V0$b;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.unit.d f33267l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(androidx.compose.ui.unit.d dVar) {
            super(1);
            this.f33267l = dVar;
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            f12.floatValue();
            return Float.valueOf(this.f33267l.M0(V3.f33271b));
        }
    }

    /* compiled from: Drawer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.unit.d f33268l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(androidx.compose.ui.unit.d dVar) {
            super(0);
            this.f33268l = dVar;
        }

        @Override // Y41.a
        public final Float invoke() {
            return Float.valueOf(this.f33268l.M0(V3.f33272c));
        }
    }

    static {
        new b(null);
    }

    public V0(@Y61.k BottomDrawerValue bottomDrawerValue, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k Y41.l<? super BottomDrawerValue, Boolean> lVar, @Y61.k InterfaceC20307p<Float> interfaceC20307p) {
        C21398x<BottomDrawerValue> c21398x = new C21398x<>(bottomDrawerValue, new c(dVar), new d(dVar), interfaceC20307p, lVar);
        this.f33265a = c21398x;
        float f12 = V3.f33270a;
        new C21428z3(c21398x);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public V0(BottomDrawerValue bottomDrawerValue, androidx.compose.ui.unit.d dVar, Y41.l lVar, InterfaceC20307p interfaceC20307p, int i12, C42822w c42822w) {
        lVar = (i12 & 4) != 0 ? a.f33266l : lVar;
        if ((i12 & 8) != 0) {
            C21205i3.f33645a.getClass();
            interfaceC20307p = C21205i3.f33646b;
        }
        this(bottomDrawerValue, dVar, lVar, interfaceC20307p);
    }
}
