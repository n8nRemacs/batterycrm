package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.InterfaceC22276o0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.u;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;

/* compiled from: LayoutModifier.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Landroidx/compose/ui/layout/o0;", "", "<init>", "()V", "a", "b", "c", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22377o0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22377o0 f40500a = new C22377o0();

    /* compiled from: LayoutModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/o0$a;", "Landroidx/compose/ui/layout/h0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.o0$a */
    public static final class a implements InterfaceC22363h0 {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22391w f40501b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final c f40502c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final d f40503d;

        public a(@Y61.k InterfaceC22391w interfaceC22391w, @Y61.k c cVar, @Y61.k d dVar) {
            this.f40501b = interfaceC22391w;
            this.f40502c = cVar;
            this.f40503d = dVar;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22391w
        public final int G(int i12) {
            return this.f40501b.G(i12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22363h0
        @Y61.k
        public final K0 I(long j12) {
            d dVar = d.f40508b;
            c cVar = this.f40502c;
            InterfaceC22391w interfaceC22391w = this.f40501b;
            if (this.f40503d == dVar) {
                return new b(cVar == c.f40505c ? interfaceC22391w.b0(C22712b.i(j12)) : interfaceC22391w.G(C22712b.i(j12)), C22712b.e(j12) ? C22712b.i(j12) : 32767);
            }
            return new b(C22712b.f(j12) ? C22712b.j(j12) : 32767, cVar == c.f40505c ? interfaceC22391w.R(C22712b.j(j12)) : interfaceC22391w.X(C22712b.j(j12)));
        }

        @Override // androidx.compose.ui.layout.InterfaceC22391w
        public final int R(int i12) {
            return this.f40501b.R(i12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22391w
        public final int X(int i12) {
            return this.f40501b.X(i12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22391w
        public final int b0(int i12) {
            return this.f40501b.b0(i12);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22391w
        @Y61.l
        /* renamed from: f */
        public final Object getF40847t() {
            return this.f40501b.getF40847t();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LayoutModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/o0$c;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.o0$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f40504b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f40505c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ c[] f40506d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f40507e;

        static {
            c cVar = new c("Min", 0);
            f40504b = cVar;
            c cVar2 = new c("Max", 1);
            f40505c = cVar2;
            c[] cVarArr = {cVar, cVar2};
            f40506d = cVarArr;
            f40507e = kotlin.enums.c.a(cVarArr);
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f40506d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LayoutModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/o0$d;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.o0$d */
    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f40508b;

        /* renamed from: c, reason: collision with root package name */
        public static final d f40509c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ d[] f40510d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f40511e;

        static {
            d dVar = new d("Width", 0);
            f40508b = dVar;
            d dVar2 = new d("Height", 1);
            f40509c = dVar2;
            d[] dVarArr = {dVar, dVar2};
            f40510d = dVarArr;
            f40511e = kotlin.enums.c.a(dVarArr);
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f40510d.clone();
        }
    }

    /* compiled from: LayoutModifier.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/o0$b;", "Landroidx/compose/ui/layout/K0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.layout.o0$b */
    public static final class b extends K0 {
        public b(int i12, int i13) {
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
