package androidx.compose.ui.node;

import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.C22356e;
import androidx.compose.ui.layout.InterfaceC22352c;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.u;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;

/* compiled from: LayoutModifierNode.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n"}, d2 = {"Landroidx/compose/ui/node/B0;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final B0 f40545a = new B0();

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/B0$a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        InterfaceC22367j0 a(@Y61.k C22356e c22356e, @Y61.k InterfaceC22363h0 interfaceC22363h0, long j12);
    }

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/B0$b;", "Landroidx/compose/ui/layout/h0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC22363h0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22391w f40546b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final d f40547c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final e f40548d;

        public b(@Y61.k InterfaceC22391w interfaceC22391w, @Y61.k d dVar, @Y61.k e eVar) {
            this.f40546b = interfaceC22391w;
            this.f40547c = dVar;
            this.f40548d = eVar;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22391w
        public final int G(int i12) {
            return this.f40546b.G(i12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22363h0
        @Y61.k
        public final androidx.compose.ui.layout.K0 I(long j12) {
            e eVar = e.f40553b;
            d dVar = this.f40547c;
            InterfaceC22391w interfaceC22391w = this.f40546b;
            if (this.f40548d == eVar) {
                return new c(dVar == d.f40550c ? interfaceC22391w.b0(C22712b.i(j12)) : interfaceC22391w.G(C22712b.i(j12)), C22712b.e(j12) ? C22712b.i(j12) : 32767);
            }
            return new c(C22712b.f(j12) ? C22712b.j(j12) : 32767, dVar == d.f40550c ? interfaceC22391w.R(C22712b.j(j12)) : interfaceC22391w.X(C22712b.j(j12)));
        }

        @Override // androidx.compose.ui.layout.InterfaceC22391w
        public final int R(int i12) {
            return this.f40546b.R(i12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22391w
        public final int X(int i12) {
            return this.f40546b.X(i12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22391w
        public final int b0(int i12) {
            return this.f40546b.b0(i12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22391w
        @Y61.l
        /* renamed from: f */
        public final Object getF40847t() {
            return this.f40546b.getF40847t();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/B0$d;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f40549b;

        /* renamed from: c, reason: collision with root package name */
        public static final d f40550c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ d[] f40551d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f40552e;

        static {
            d dVar = new d("Min", 0);
            f40549b = dVar;
            d dVar2 = new d("Max", 1);
            f40550c = dVar2;
            d[] dVarArr = {dVar, dVar2};
            f40551d = dVarArr;
            f40552e = kotlin.enums.c.a(dVarArr);
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f40551d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/B0$e;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e {

        /* renamed from: b, reason: collision with root package name */
        public static final e f40553b;

        /* renamed from: c, reason: collision with root package name */
        public static final e f40554c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ e[] f40555d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f40556e;

        static {
            e eVar = new e("Width", 0);
            f40553b = eVar;
            e eVar2 = new e("Height", 1);
            f40554c = eVar2;
            e[] eVarArr = {eVar, eVar2};
            f40555d = eVarArr;
            f40556e = kotlin.enums.c.a(eVarArr);
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f40555d.clone();
        }
    }

    /* compiled from: LayoutModifierNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bà\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/B0$f;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface f {
    }

    public static int a(@Y61.k a aVar, @Y61.k InterfaceC22352c interfaceC22352c, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return aVar.a(new C22356e(interfaceC22352c, interfaceC22352c.getF40449b()), new b(interfaceC22391w, d.f40550c, e.f40554c), C22713c.b(i12, 0, 13)).getF40522b();
    }

    public static int b(@Y61.k a aVar, @Y61.k InterfaceC22352c interfaceC22352c, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return aVar.a(new C22356e(interfaceC22352c, interfaceC22352c.getF40449b()), new b(interfaceC22391w, d.f40550c, e.f40553b), C22713c.b(0, i12, 7)).getF40521a();
    }

    public static int c(@Y61.k a aVar, @Y61.k InterfaceC22352c interfaceC22352c, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return aVar.a(new C22356e(interfaceC22352c, interfaceC22352c.getF40449b()), new b(interfaceC22391w, d.f40549b, e.f40554c), C22713c.b(i12, 0, 13)).getF40522b();
    }

    public static int d(@Y61.k a aVar, @Y61.k InterfaceC22352c interfaceC22352c, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return aVar.a(new C22356e(interfaceC22352c, interfaceC22352c.getF40449b()), new b(interfaceC22391w, d.f40549b, e.f40553b), C22713c.b(0, i12, 7)).getF40521a();
    }

    /* compiled from: LayoutModifierNode.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/node/B0$c;", "Landroidx/compose/ui/layout/K0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends androidx.compose.ui.layout.K0 {
        public c(int i12, int i13) {
            u.a aVar = androidx.compose.ui.unit.u.f42871b;
            o0((i13 & 4294967295L) | (i12 << 32));
        }

        @Override // androidx.compose.ui.layout.InterfaceC22375n0
        public final int d0(@Y61.k AbstractC22348a abstractC22348a) {
            return BeduinInputModel.MIN_TEXT_VERSION;
        }

        @Override // androidx.compose.ui.layout.K0
        public final void k0(long j12, float f12, @Y61.l Y41.l<? super InterfaceC22276o0, kotlin.G0> lVar) {
        }
    }
}
