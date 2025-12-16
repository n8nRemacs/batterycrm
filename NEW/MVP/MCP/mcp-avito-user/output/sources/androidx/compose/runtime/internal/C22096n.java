package androidx.compose.runtime.internal;

import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22034b2;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.v0;

/* compiled from: ComposableLambda.kt */
@F3
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/internal/n;", "Landroidx/compose/runtime/internal/c;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.internal.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22096n implements InterfaceC22085c {

    /* renamed from: b, reason: collision with root package name */
    public final int f38448b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f38449c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Object f38450d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public InterfaceC22034b2 f38451e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public ArrayList f38452f;

    /* compiled from: ComposableLambda.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.internal.n$a */
    public /* synthetic */ class a extends C42801a implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            int iIntValue = num.intValue();
            ((C22096n) this.receiver).b(a12, iIntValue);
            return G0.f406611a;
        }
    }

    /* compiled from: ComposableLambda.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/A;", "nc", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.internal.n$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f38454m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f38455n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, int i12) {
            super(2);
            this.f38454m = obj;
            this.f38455n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f38455n) | 1;
            C22096n.this.a(iA2, a12, this.f38454m);
            return G0.f406611a;
        }
    }

    /* compiled from: ComposableLambda.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/A;", "nc", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.internal.n$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f38457m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Object f38458n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f38459o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object obj, Object obj2, int i12) {
            super(2);
            this.f38457m = obj;
            this.f38458n = obj2;
            this.f38459o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f38459o) | 1;
            Object obj = this.f38457m;
            Object obj2 = this.f38458n;
            C22096n.this.d(obj, obj2, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ComposableLambda.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/A;", "nc", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.internal.n$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f38461m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Object f38462n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f38463o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f38464p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, Object obj2, Object obj3, int i12) {
            super(2);
            this.f38461m = obj;
            this.f38462n = obj2;
            this.f38463o = obj3;
            this.f38464p = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f38464p) | 1;
            Object obj = this.f38462n;
            Object obj2 = this.f38463o;
            C22096n.this.f(this.f38461m, obj, obj2, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ComposableLambda.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/A;", "nc", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.internal.n$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f38466m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Object f38467n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f38468o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Object f38469p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f38470q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, Object obj2, Object obj3, Object obj4, int i12) {
            super(2);
            this.f38466m = obj;
            this.f38467n = obj2;
            this.f38468o = obj3;
            this.f38469p = obj4;
            this.f38470q = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f38470q) | 1;
            Object obj = this.f38468o;
            Object obj2 = this.f38469p;
            C22096n.this.g(this.f38466m, this.f38467n, obj, obj2, a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ComposableLambda.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/A;", "nc", "", "<anonymous parameter 1>", "Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.internal.n$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Object f38472m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Object f38473n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Object f38474o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Object f38475p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Object f38476q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f38477r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i12) {
            super(2);
            this.f38472m = obj;
            this.f38473n = obj2;
            this.f38474o = obj3;
            this.f38475p = obj4;
            this.f38476q = obj5;
            this.f38477r = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f38477r) | 1;
            Object obj = this.f38475p;
            Object obj2 = this.f38476q;
            C22096n.this.j(this.f38472m, this.f38473n, this.f38474o, obj, obj2, a12, iA2);
            return G0.f406611a;
        }
    }

    public C22096n(int i12, @Y61.l Object obj, boolean z12) {
        this.f38448b = i12;
        this.f38449c = z12;
        this.f38450d = obj;
    }

    @Y61.l
    public final Object a(int i12, @Y61.k androidx.compose.runtime.A a12, @Y61.l Object obj) {
        androidx.compose.runtime.B bE2 = a12.E(this.f38448b);
        l(bE2);
        int iA2 = bE2.B(this) ? r.a(2, 1) : r.a(1, 1);
        Object obj2 = this.f38450d;
        v0.e(3, obj2);
        Object objInvoke = ((Y41.q) obj2).invoke(obj, bE2, Integer.valueOf(iA2 | i12));
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(obj, i12);
        }
        return objInvoke;
    }

    @Y61.l
    public final Object b(@Y61.k androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(this.f38448b);
        l(bE2);
        int iA2 = i12 | (bE2.B(this) ? r.a(2, 0) : r.a(1, 0));
        Object obj = this.f38450d;
        v0.e(2, obj);
        Object objInvoke = ((Y41.p) obj).invoke(bE2, Integer.valueOf(iA2));
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(2, this, C22096n.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }
        return objInvoke;
    }

    @Y61.l
    public final Object d(@Y61.l Object obj, @Y61.l Object obj2, @Y61.k androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(this.f38448b);
        l(bE2);
        int iA2 = bE2.B(this) ? r.a(2, 2) : r.a(1, 2);
        Object obj3 = this.f38450d;
        v0.e(4, obj3);
        Object objInvoke = ((Y41.r) obj3).invoke(obj, obj2, bE2, Integer.valueOf(iA2 | i12));
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new c(obj, obj2, i12);
        }
        return objInvoke;
    }

    @Y61.l
    public final Object f(@Y61.l Object obj, @Y61.l Object obj2, @Y61.l Object obj3, @Y61.k androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(this.f38448b);
        l(bE2);
        int iA2 = bE2.B(this) ? r.a(2, 3) : r.a(1, 3);
        Object obj4 = this.f38450d;
        v0.e(5, obj4);
        Object objInvoke = ((Y41.s) obj4).invoke(obj, obj2, obj3, bE2, Integer.valueOf(iA2 | i12));
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(obj, obj2, obj3, i12);
        }
        return objInvoke;
    }

    @Y61.l
    public final Object g(@Y61.l Object obj, @Y61.l Object obj2, @Y61.l Object obj3, @Y61.l Object obj4, @Y61.k androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(this.f38448b);
        l(bE2);
        int iA2 = bE2.B(this) ? r.a(2, 4) : r.a(1, 4);
        Object obj5 = this.f38450d;
        v0.e(6, obj5);
        Object objInvoke = ((Y41.t) obj5).invoke(obj, obj2, obj3, obj4, bE2, Integer.valueOf(iA2 | i12));
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(obj, obj2, obj3, obj4, i12);
        }
        return objInvoke;
    }

    @Override // Y41.u
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Serializable serializable) {
        return j(obj, obj2, obj3, obj4, obj5, (androidx.compose.runtime.A) obj6, ((Number) serializable).intValue());
    }

    @Override // Y41.p
    public final /* bridge */ /* synthetic */ Object invoke(androidx.compose.runtime.A a12, Integer num) {
        return b(a12, num.intValue());
    }

    @Y61.l
    public final Object j(@Y61.l Object obj, @Y61.l Object obj2, @Y61.l Object obj3, @Y61.l Object obj4, @Y61.l Object obj5, @Y61.k androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(this.f38448b);
        l(bE2);
        int iA2 = bE2.B(this) ? r.a(2, 5) : r.a(1, 5);
        Object obj6 = this.f38450d;
        v0.e(7, obj6);
        Object objI = ((Y41.u) obj6).i(obj, obj2, obj3, obj4, obj5, bE2, Integer.valueOf(i12 | iA2));
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(obj, obj2, obj3, obj4, obj5, i12);
        }
        return objI;
    }

    public final void l(androidx.compose.runtime.A a12) {
        C22039c2 c22039c2R;
        if (!this.f38449c || (c22039c2R = a12.r()) == null) {
            return;
        }
        a12.g(c22039c2R);
        if (r.d(this.f38451e, c22039c2R)) {
            this.f38451e = c22039c2R;
            return;
        }
        ArrayList arrayList = this.f38452f;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f38452f = arrayList2;
            arrayList2.add(c22039c2R);
            return;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (r.d((InterfaceC22034b2) arrayList.get(i12), c22039c2R)) {
                arrayList.set(i12, c22039c2R);
                return;
            }
        }
        arrayList.add(c22039c2R);
    }

    public final void m(@Y61.k InterfaceC43072x interfaceC43072x) {
        if (kotlin.jvm.internal.L.f(this.f38450d, interfaceC43072x)) {
            return;
        }
        boolean z12 = this.f38450d == null;
        this.f38450d = interfaceC43072x;
        if (z12 || !this.f38449c) {
            return;
        }
        InterfaceC22034b2 interfaceC22034b2 = this.f38451e;
        if (interfaceC22034b2 != null) {
            interfaceC22034b2.invalidate();
            this.f38451e = null;
        }
        ArrayList arrayList = this.f38452f;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((InterfaceC22034b2) arrayList.get(i12)).invalidate();
            }
            arrayList.clear();
        }
    }

    @Override // Y41.q
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, androidx.compose.runtime.A a12, Integer num) {
        return a(num.intValue(), a12, obj);
    }

    @Override // Y41.r
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, androidx.compose.runtime.A a12, Integer num) {
        return d(obj, obj2, a12, num.intValue());
    }

    @Override // Y41.s
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, androidx.compose.runtime.A a12, Integer num) {
        return f(obj, obj2, obj3, a12, num.intValue());
    }

    @Override // Y41.t
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, androidx.compose.runtime.A a12, Integer num) {
        return g(obj, obj2, obj3, obj4, a12, num.intValue());
    }
}
