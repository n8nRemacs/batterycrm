package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Q;
import androidx.compose.ui.layout.Y0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SubcomposeLayout.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/layout/T;", "Landroidx/compose/ui/node/LayoutNode$e;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T extends LayoutNode.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f40402b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Z0, C22712b, InterfaceC22367j0> f40403c;

    /* compiled from: SubcomposeLayout.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/ui/layout/U", "Landroidx/compose/ui/layout/j0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22367j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22367j0 f40404a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q f40405b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f40406c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22367j0 f40407d;

        public a(InterfaceC22367j0 interfaceC22367j0, Q q12, int i12, InterfaceC22367j0 interfaceC22367j02) {
            this.f40405b = q12;
            this.f40406c = i12;
            this.f40407d = interfaceC22367j02;
            this.f40404a = interfaceC22367j0;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        /* renamed from: getHeight */
        public final int getF40585c() {
            return this.f40404a.getF40585c();
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        /* renamed from: getWidth */
        public final int getF40584b() {
            return this.f40404a.getF40584b();
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final Map<AbstractC22348a, Integer> t() {
            return this.f40404a.t();
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final void u() {
            Q q12 = this.f40405b;
            q12.f40368f = this.f40406c;
            this.f40407d.u();
            androidx.collection.R0<Object, Y0.a> r02 = q12.f40375m;
            long[] jArr = r02.f25721a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j12 = jArr[i12];
                if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j12) < 128) {
                            int i15 = (i12 << 3) + i14;
                            Object obj = r02.f25722b[i15];
                            Y0.a aVar = (Y0.a) r02.f25723c[i15];
                            int i16 = q12.f40376n.i(obj);
                            if (i16 < 0 || i16 >= q12.f40368f) {
                                aVar.dispose();
                                r02.l(i15);
                            }
                        }
                        j12 >>= 8;
                    }
                    if (i13 != 8) {
                        return;
                    }
                }
                if (i12 == length) {
                    return;
                } else {
                    i12++;
                }
            }
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final Y41.l<R0, kotlin.G0> v() {
            return this.f40404a.v();
        }
    }

    /* compiled from: SubcomposeLayout.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/ui/layout/U", "Landroidx/compose/ui/layout/j0;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC22367j0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22367j0 f40408a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q f40409b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f40410c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22367j0 f40411d;

        public b(InterfaceC22367j0 interfaceC22367j0, Q q12, int i12, InterfaceC22367j0 interfaceC22367j02) {
            this.f40409b = q12;
            this.f40410c = i12;
            this.f40411d = interfaceC22367j02;
            this.f40408a = interfaceC22367j0;
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        /* renamed from: getHeight */
        public final int getF40585c() {
            return this.f40408a.getF40585c();
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        /* renamed from: getWidth */
        public final int getF40584b() {
            return this.f40408a.getF40584b();
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final Map<AbstractC22348a, Integer> t() {
            return this.f40408a.t();
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final void u() {
            Q q12 = this.f40409b;
            q12.f40367e = this.f40410c;
            this.f40411d.u();
            q12.a(q12.f40367e);
        }

        @Override // androidx.compose.ui.layout.InterfaceC22367j0
        public final Y41.l<R0, kotlin.G0> v() {
            return this.f40408a.v();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public T(Q q12, Y41.p<? super Z0, ? super C22712b, ? extends InterfaceC22367j0> pVar, String str) {
        super(str);
        this.f40402b = q12;
        this.f40403c = pVar;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
        Q q12 = this.f40402b;
        LayoutDirection f40388b = interfaceC22369k0.getF40449b();
        Q.c cVar = q12.f40371i;
        cVar.f40388b = f40388b;
        cVar.f40389c = interfaceC22369k0.getF40389c();
        cVar.f40390d = interfaceC22369k0.getF40390d();
        boolean zI1 = interfaceC22369k0.I1();
        Y41.p<Z0, C22712b, InterfaceC22367j0> pVar = this.f40403c;
        if (zI1 || q12.f40364b.f40635k == null) {
            q12.f40367e = 0;
            InterfaceC22367j0 interfaceC22367j0Invoke = pVar.invoke(cVar, C22712b.a(j12));
            return new b(interfaceC22367j0Invoke, q12, q12.f40367e, interfaceC22367j0Invoke);
        }
        q12.f40368f = 0;
        InterfaceC22367j0 interfaceC22367j0Invoke2 = pVar.invoke(q12.f40372j, C22712b.a(j12));
        return new a(interfaceC22367j0Invoke2, q12, q12.f40368f, interfaceC22367j0Invoke2);
    }
}
