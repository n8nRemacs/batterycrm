package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.layout.InterfaceC20717f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyGridSpanLayoutProvider.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/lazy/grid/H0;", "", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H f29000a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList<a> f29001b;

    /* renamed from: c, reason: collision with root package name */
    public int f29002c;

    /* renamed from: d, reason: collision with root package name */
    public int f29003d;

    /* renamed from: e, reason: collision with root package name */
    public int f29004e;

    /* renamed from: f, reason: collision with root package name */
    public int f29005f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ArrayList f29006g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public Object f29007h;

    /* renamed from: i, reason: collision with root package name */
    public int f29008i;

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/grid/H0$b;", "Landroidx/compose/foundation/lazy/grid/Z;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Z {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f29011a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static int f29012b;

        /* renamed from: c, reason: collision with root package name */
        public static int f29013c;

        @Override // androidx.compose.foundation.lazy.grid.Z
        public final int a() {
            return f29013c;
        }

        @Override // androidx.compose.foundation.lazy.grid.Z
        public final int b() {
            return f29012b;
        }
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/H0$c;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f29014a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Object f29015b;

        public c(int i12, @Y61.k List<C20664c> list) {
            this.f29014a = i12;
            this.f29015b = list;
        }
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/grid/H0$a;", "it", "", "invoke", "(Landroidx/compose/foundation/lazy/grid/H0$a;)Ljava/lang/Integer;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<a, Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f29016l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i12) {
            super(1);
            this.f29016l = i12;
        }

        @Override // Y41.l
        public final Integer invoke(a aVar) {
            return Integer.valueOf(aVar.f29009a - this.f29016l);
        }
    }

    public H0(@Y61.k H h12) {
        this.f29000a = h12;
        ArrayList<a> arrayList = new ArrayList<>();
        int i12 = 0;
        arrayList.add(new a(i12, i12, 2, null));
        this.f29001b = arrayList;
        this.f29005f = -1;
        this.f29006g = new ArrayList();
        this.f29007h = C42784z0.f406748b;
    }

    public final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.f29008i)) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.foundation.lazy.grid.H0.c b(int r13) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.H0.b(int):androidx.compose.foundation.lazy.grid.H0$c");
    }

    public final int c(int i12) {
        int i13 = 0;
        if (d() <= 0) {
            return 0;
        }
        if (i12 >= d()) {
            androidx.compose.foundation.internal.e.a("ItemIndex > total count");
        }
        if (!this.f29000a.f28998c) {
            return i12 / this.f29008i;
        }
        ArrayList<a> arrayList = this.f29001b;
        int iN2 = C42745f0.n(arrayList, arrayList.size(), new d(i12));
        int i14 = 2;
        if (iN2 < 0) {
            iN2 = (-iN2) - 2;
        }
        int iA2 = a() * iN2;
        int i15 = arrayList.get(iN2).f29009a;
        if (i15 > i12) {
            androidx.compose.foundation.internal.e.a("currentItemIndex > itemIndex");
        }
        int i16 = 0;
        while (i15 < i12) {
            int i17 = i15 + 1;
            int iE2 = e(i15, this.f29008i - i16);
            i16 += iE2;
            int i18 = this.f29008i;
            if (i16 >= i18) {
                if (i16 == i18) {
                    iA2++;
                    i16 = 0;
                } else {
                    iA2++;
                    i16 = iE2;
                }
            }
            if (iA2 % a() == 0 && iA2 / a() >= arrayList.size()) {
                arrayList.add(new a(i17 - (i16 > 0 ? 1 : 0), i13, i14, null));
            }
            i15 = i17;
        }
        return e(i12, this.f29008i - i16) + i16 > this.f29008i ? iA2 + 1 : iA2;
    }

    public final int d() {
        return this.f29000a.f28997b.f29258b;
    }

    public final int e(int i12, int i13) {
        b bVar = b.f29011a;
        bVar.getClass();
        b.f29012b = i13;
        b.f29013c = this.f29008i;
        InterfaceC20717f.a<G> aVarB = this.f29000a.f28997b.b(i12);
        return (int) aVarB.f29413c.f28992b.invoke(bVar, Integer.valueOf(i12 - aVarB.f29411a)).f29104a;
    }

    /* compiled from: LazyGridSpanLayoutProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/grid/H0$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f29009a;

        /* renamed from: b, reason: collision with root package name */
        public final int f29010b;

        public a(int i12, int i13) {
            this.f29009a = i12;
            this.f29010b = i13;
        }

        public /* synthetic */ a(int i12, int i13, int i14, C42822w c42822w) {
            this(i12, (i14 & 2) != 0 ? 0 : i13);
        }
    }
}
