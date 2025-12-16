package androidx.compose.foundation.text;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22190v;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.R3;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.InterfaceC22413h;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: AnnotatedStringResolveInlineContent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*:\b\u0000\u0010\u0005\"\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00040\u00002\u0019\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u00040\u0000*\u0018\b\u0000\u0010\u0007\"\b\u0012\u0004\u0012\u00020\u00060\u00002\b\u0012\u0004\u0012\u00020\u00060\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/e$e;", "Lkotlin/Function1;", "", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "InlineContentRange", "Landroidx/compose/ui/text/U;", "PlaceholderRange", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20863f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final kotlin.Q<List<C22602e.C1684e<androidx.compose.ui.text.U>>, List<C22602e.C1684e<Y41.q<String, androidx.compose.runtime.A, Integer, kotlin.G0>>>> f30701a;

    /* compiled from: AnnotatedStringResolveInlineContent.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "Landroidx/compose/ui/unit/b;", "constrains", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.f$a */
    public static final class a implements InterfaceC22365i0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30702a = new a();

        /* compiled from: AnnotatedStringResolveInlineContent.kt */
        @kotlin.jvm.internal.s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.f$a$a, reason: collision with other inner class name */
        public static final class C1606a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ArrayList f30703l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1606a(ArrayList arrayList) {
                super(1);
                this.f30703l = arrayList;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(K0.a aVar) {
                K0.a aVar2 = aVar;
                ArrayList arrayList = this.f30703l;
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    aVar2.h((androidx.compose.ui.layout.K0) arrayList.get(i12), 0, 0, 0.0f);
                }
                return kotlin.G0.f406611a;
            }
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int iF2 = 0;
            while (iF2 < size) {
                iF2 = androidx.compose.foundation.H.f(list.get(iF2), j12, arrayList, iF2, 1);
            }
            return interfaceC22369k0.L0(C22712b.j(j12), C22712b.i(j12), kotlin.collections.P0.c(), new C1606a(arrayList));
        }
    }

    /* compiled from: AnnotatedStringResolveInlineContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.f$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22602e f30704l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<C22602e.C1684e<Y41.q<String, androidx.compose.runtime.A, Integer, kotlin.G0>>> f30705m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f30706n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C22602e c22602e, List<C22602e.C1684e<Y41.q<String, androidx.compose.runtime.A, Integer, kotlin.G0>>> list, int i12) {
            super(2);
            this.f30704l = c22602e;
            this.f30705m = list;
            this.f30706n = i12;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f30706n | 1);
            C20863f.a(this.f30704l, this.f30705m, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    static {
        C42784z0 c42784z0 = C42784z0.f406748b;
        f30701a = new kotlin.Q<>(c42784z0, c42784z0);
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k C22602e c22602e, @Y61.k List<C22602e.C1684e<Y41.q<String, androidx.compose.runtime.A, Integer, kotlin.G0>>> list, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1794596951);
        int i13 = (i12 & 6) == 0 ? (bE2.B(c22602e) ? 4 : 2) | i12 : i12;
        if ((i12 & 48) == 0) {
            i13 |= bE2.u(list) ? 32 : 16;
        }
        if (bE2.p(i13 & 1, (i13 & 19) != 18)) {
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                C22602e.C1684e<Y41.q<String, androidx.compose.runtime.A, Integer, kotlin.G0>> c1684e = list.get(i14);
                Y41.q<String, androidx.compose.runtime.A, Integer, kotlin.G0> qVar = c1684e.f42138a;
                a aVar = a.f30702a;
                v.a aVar2 = androidx.compose.ui.v.f42878y1;
                int i15 = bE2.f37888Q;
                androidx.compose.runtime.O1 o1S = bE2.S();
                androidx.compose.ui.v vVarC = androidx.compose.ui.n.c(bE2, aVar2);
                InterfaceC22413h.f40789C1.getClass();
                Y41.a<InterfaceC22413h> aVar3 = InterfaceC22413h.a.f40791b;
                if (bE2.f37890b == null) {
                    C22190v.b();
                    throw null;
                }
                bE2.A();
                if (bE2.f37887P) {
                    bE2.b(aVar3);
                } else {
                    bE2.d();
                }
                R3.b(InterfaceC22413h.a.f40796g, bE2, aVar);
                R3.b(InterfaceC22413h.a.f40795f, bE2, o1S);
                Y41.p<InterfaceC22413h, Integer, kotlin.G0> pVar = InterfaceC22413h.a.f40799j;
                if (bE2.f37887P || !kotlin.jvm.internal.L.f(bE2.t(), Integer.valueOf(i15))) {
                    AK.c.y(i15, bE2, i15, pVar);
                }
                R3.b(InterfaceC22413h.a.f40793d, bE2, vVarC);
                qVar.invoke(c22602e.subSequence(c1684e.f42139b, c1684e.f42140c).f42127c, bE2, 0);
                bE2.X(true);
            }
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(c22602e, list, i12);
        }
    }
}
