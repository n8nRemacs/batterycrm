package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C22040c3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;

/* compiled from: NavigationDrawer.kt */
@androidx.compose.runtime.F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/Q6;", "", "b", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q6 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C21916v<DrawerValue> f35344a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f35345b;

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/material3/DrawerValue;", "invoke", "(Landroidx/compose/material3/DrawerValue;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<DrawerValue, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f35346l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(DrawerValue drawerValue) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/Q6$b;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "distance", "invoke", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Float, Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f35347l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Float invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            float f13 = Kb.f35004a;
            return Float.valueOf(fFloatValue * 0.5f);
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<Float> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Float invoke() {
            Q6 q62 = Q6.this;
            androidx.compose.ui.unit.d dVar = (androidx.compose.ui.unit.d) ((C22082i3) q62.f35345b).getF42167b();
            if (dVar != null) {
                return Float.valueOf(dVar.M0(Kb.f35004a));
            }
            throw new IllegalArgumentException(("The density on BottomDrawerState (" + q62 + ") was not set. Did you use BottomDrawer with the BottomDrawer composable?").toString());
        }
    }

    /* compiled from: NavigationDrawer.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/material3/Q6$e", "Landroidx/compose/runtime/I3;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements androidx.compose.runtime.I3<Float> {
        @Override // androidx.compose.runtime.I3
        /* renamed from: getValue */
        public final Float getF42167b() {
            throw null;
        }
    }

    static {
        new b(null);
    }

    public Q6(@Y61.k DrawerValue drawerValue, @Y61.k Y41.l<? super DrawerValue, Boolean> lVar) {
        this.f35344a = new C21916v<>(drawerValue, c.f35347l, new d(), Kb.f35006c, lVar);
        this.f35345b = C22126m3.g(null);
    }

    @Y61.l
    public final Object a(@Y61.k SuspendLambda suspendLambda) throws Throwable {
        DrawerValue drawerValue = DrawerValue.f34644b;
        androidx.compose.animation.core.G1<Float> g12 = Kb.f35006c;
        C21916v<DrawerValue> c21916v = this.f35344a;
        Object objB = c21916v.b(drawerValue, MutatePriority.f26797b, new T6(this, ((C22040c3) c21916v.f37500l).f(), g12, null), suspendLambda);
        if (objB != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objB = kotlin.G0.f406611a;
        }
        return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : kotlin.G0.f406611a;
    }

    public /* synthetic */ Q6(DrawerValue drawerValue, Y41.l lVar, int i12, C42822w c42822w) {
        this(drawerValue, (i12 & 2) != 0 ? a.f35346l : lVar);
    }
}
