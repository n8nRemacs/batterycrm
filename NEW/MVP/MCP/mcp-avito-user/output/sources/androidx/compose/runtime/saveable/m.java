package androidx.compose.runtime.saveable;

import androidx.collection.R0;
import androidx.collection.i1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.S;
import androidx.compose.runtime.internal.C22096n;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SaveableStateHolder.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/saveable/m;", "Landroidx/compose/runtime/saveable/l;", "c", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class m implements l {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final c f38582e = new c(null);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final w f38583f;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Map<Object, Map<String, List<Object>>> f38584a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0<Object, r> f38585b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public r f38586c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y41.l<Object, Boolean> f38587d;

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0003\u0010\n\u001a$\u0012\u0004\u0012\u00020\u0004\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00070\u0005\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/runtime/saveable/m;", "it", "", "", "", "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/runtime/saveable/m;)Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<x, m, Map<Object, Map<String, ? extends List<? extends Object>>>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f38588l = new a();

        public a() {
            super(2);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Map<java.lang.Object, java.util.Map<java.lang.String, ? extends java.util.List<? extends java.lang.Object>>> invoke(androidx.compose.runtime.saveable.x r17, androidx.compose.runtime.saveable.m r18) {
            /*
                r16 = this;
                r0 = r17
                androidx.compose.runtime.saveable.x r0 = (androidx.compose.runtime.saveable.x) r0
                r0 = r18
                androidx.compose.runtime.saveable.m r0 = (androidx.compose.runtime.saveable.m) r0
                androidx.collection.R0<java.lang.Object, androidx.compose.runtime.saveable.r> r1 = r0.f38585b
                java.lang.Object[] r2 = r1.f25722b
                java.lang.Object[] r3 = r1.f25723c
                long[] r1 = r1.f25721a
                int r4 = r1.length
                int r4 = r4 + (-2)
                java.util.Map<java.lang.Object, java.util.Map<java.lang.String, java.util.List<java.lang.Object>>> r0 = r0.f38584a
                if (r4 < 0) goto L63
                r5 = 0
                r6 = r5
            L19:
                r7 = r1[r6]
                long r9 = ~r7
                r11 = 7
                long r9 = r9 << r11
                long r9 = r9 & r7
                r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r9 = r9 & r11
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 == 0) goto L5e
                int r9 = r6 - r4
                int r9 = ~r9
                int r9 = r9 >>> 31
                r10 = 8
                int r9 = 8 - r9
                r11 = r5
            L33:
                if (r11 >= r9) goto L5c
                r12 = 255(0xff, double:1.26E-321)
                long r12 = r12 & r7
                r14 = 128(0x80, double:6.3E-322)
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 >= 0) goto L58
                int r12 = r6 << 3
                int r12 = r12 + r11
                r13 = r2[r12]
                r12 = r3[r12]
                androidx.compose.runtime.saveable.r r12 = (androidx.compose.runtime.saveable.r) r12
                java.util.Map r12 = r12.c()
                boolean r14 = r12.isEmpty()
                if (r14 == 0) goto L55
                r0.remove(r13)
                goto L58
            L55:
                r0.put(r13, r12)
            L58:
                long r7 = r7 >> r10
                int r11 = r11 + 1
                goto L33
            L5c:
                if (r9 != r10) goto L63
            L5e:
                if (r6 == r4) goto L63
                int r6 = r6 + 1
                goto L19
            L63:
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L6a
                r0 = 0
            L6a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.saveable.m.a.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062&\u0010\u0005\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00020\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "", "", "", "", "it", "Landroidx/compose/runtime/saveable/m;", "invoke", "(Ljava/util/Map;)Landroidx/compose/runtime/saveable/m;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Map<Object, Map<String, ? extends List<? extends Object>>>, m> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f38589l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final m invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            return new m(map);
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/saveable/m$c;", "", "<init>", "()V", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: SaveableStateHolder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<Object, Boolean> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Object obj) {
            r rVar = m.this.f38586c;
            return Boolean.valueOf(rVar != null ? rVar.a(obj) : true);
        }
    }

    static {
        a aVar = a.f38588l;
        b bVar = b.f38589l;
        w wVar = v.f38606a;
        f38583f = new w(bVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.runtime.saveable.l
    @InterfaceC22132o
    public final void b(@Y61.k Object obj, @Y61.k C22096n c22096n, @Y61.l A a12, int i12) {
        a12.C(-1198538093);
        a12.e(obj);
        Object objT = a12.t();
        A.f37866a.getClass();
        Object obj2 = A.a.f37868b;
        if (objT == obj2) {
            Y41.l<Object, Boolean> lVar = this.f38587d;
            if (!((Boolean) ((d) lVar).invoke(obj)).booleanValue()) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            Map<String, List<Object>> map = this.f38584a.get(obj);
            J3 j32 = t.f38604a;
            Object sVar = new s(map, lVar);
            a12.H(sVar);
            objT = sVar;
        }
        r rVar = (r) objT;
        S.a(t.f38604a.b(rVar), c22096n, a12, (i12 & 112) | 8);
        G0 g02 = G0.f406611a;
        boolean zU2 = a12.u(this) | a12.u(obj) | a12.u(rVar);
        Object objT2 = a12.t();
        if (zU2 || objT2 == obj2) {
            objT2 = new o(this, obj, rVar);
            a12.H(objT2);
        }
        C22187u0.a(g02, (Y41.l) objT2, a12);
        a12.s();
        a12.h();
    }

    @Override // androidx.compose.runtime.saveable.l
    public final void e(@Y61.k Object obj) {
        if (this.f38585b.k(obj) == null) {
            this.f38584a.remove(obj);
        }
    }

    public m(@Y61.k Map<Object, Map<String, List<Object>>> map) {
        this.f38584a = map;
        this.f38585b = i1.b();
        this.f38587d = new d();
    }

    public /* synthetic */ m(Map map, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
