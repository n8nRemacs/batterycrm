package androidx.compose.foundation.text;

import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.InterfaceC22393x;
import androidx.compose.ui.layout.K0;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CoreTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/D0;", "Landroidx/compose/ui/layout/i0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D0 implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C20985q1 f30202a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<androidx.compose.ui.text.o0, kotlin.G0> f30203b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.W f30204c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.text.input.L f30205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f30206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f30207f;

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f30208l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(K0.a aVar) {
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public D0(C20985q1 c20985q1, Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> lVar, androidx.compose.ui.text.input.W w12, androidx.compose.ui.text.input.L l12, androidx.compose.ui.unit.d dVar, int i12) {
        this.f30202a = c20985q1;
        this.f30203b = lVar;
        this.f30204c = w12;
        this.f30205d = l12;
        this.f30206e = dVar;
        this.f30207f = i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (androidx.compose.ui.unit.C22712b.i(r35) == androidx.compose.ui.unit.C22712b.i(r11)) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0170  */
    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.InterfaceC22367j0 b(androidx.compose.ui.layout.InterfaceC22369k0 r33, java.util.List<? extends androidx.compose.ui.layout.InterfaceC22363h0> r34, long r35) {
        /*
            Method dump skipped, instructions count: 686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.D0.b(androidx.compose.ui.layout.k0, java.util.List, long):androidx.compose.ui.layout.j0");
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final int h(InterfaceC22393x interfaceC22393x, List<? extends InterfaceC22391w> list, int i12) {
        C20985q1 c20985q1 = this.f30202a;
        c20985q1.f31778a.a(interfaceC22393x.getF40449b());
        androidx.compose.ui.text.H h12 = c20985q1.f31778a.f30570j;
        if (h12 != null) {
            return V1.a(h12.a());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
