package androidx.view.compose;

import Y41.p;
import Y41.r;
import android.annotation.SuppressLint;
import androidx.compose.animation.AbstractC20359j1;
import androidx.compose.animation.AbstractC20365l1;
import androidx.compose.animation.C20389u;
import androidx.compose.animation.C20396w0;
import androidx.compose.animation.H0;
import androidx.compose.animation.InterfaceC20395w;
import androidx.compose.animation.InterfaceC20401y;
import androidx.compose.animation.core.C20288i1;
import androidx.compose.animation.core.C20300m1;
import androidx.compose.animation.core.C20310q;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22128n0;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22118l0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.saveable.q;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.v;
import androidx.view.AbstractC23301M0;
import androidx.view.C23303N0;
import androidx.view.C23317W;
import androidx.view.C23324b0;
import androidx.view.C23395u;
import androidx.view.C23404y0;
import androidx.view.InterfaceC22983P;
import androidx.view.T0;
import androidx.view.compose.C23338d;
import androidx.view.compose.C23339e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: NavHost.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004¨\u0006\u0005²\u0006\u0012\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "Landroidx/navigation/u;", "currentBackStack", "allVisibleEntries", "visibleEntries", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.compose.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23359y {

    /* compiled from: NavHost.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.y$a */
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23404y0 f52988l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C23404y0 c23404y0) {
            super(0);
            this.f52988l = c23404y0;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f52988l.p();
            return G0.f406611a;
        }
    }

    /* compiled from: NavHost.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.y$b */
    public static final class b extends N implements Y41.l<C22128n0, InterfaceC22118l0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23404y0 f52989l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f52990m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C23404y0 c23404y0, InterfaceC22983P interfaceC22983P) {
            super(1);
            this.f52989l = c23404y0;
            this.f52990m = interfaceC22983P;
        }

        @Override // Y41.l
        public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
            this.f52989l.C(this.f52990m);
            return new C23360z();
        }
    }

    /* compiled from: NavHost.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/y;", "Landroidx/navigation/u;", "Landroidx/compose/animation/w0;", "invoke", "(Landroidx/compose/animation/y;)Landroidx/compose/animation/w0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.y$c */
    public static final class c extends N implements Y41.l<InterfaceC20401y<C23395u>, C20396w0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Map<String, Float> f52991l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C23339e f52992m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20359j1> f52993n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> f52994o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ I3<List<C23395u>> f52995p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Map<String, Float> map, C23339e c23339e, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar2, I3<? extends List<C23395u>> i32) {
            super(1);
            this.f52991l = map;
            this.f52992m = c23339e;
            this.f52993n = lVar;
            this.f52994o = lVar2;
            this.f52995p = i32;
        }

        @Override // Y41.l
        public final C20396w0 invoke(InterfaceC20401y<C23395u> interfaceC20401y) {
            float fFloatValue;
            InterfaceC20401y<C23395u> interfaceC20401y2 = interfaceC20401y;
            if (!this.f52995p.getF42167b().contains(interfaceC20401y2.a())) {
                AbstractC20359j1.f26498a.getClass();
                AbstractC20359j1 abstractC20359j1 = AbstractC20359j1.f26499b;
                AbstractC20365l1.f26506a.getClass();
                return C20389u.e(abstractC20359j1, AbstractC20365l1.f26507b);
            }
            String str = interfaceC20401y2.a().f53186g;
            Map<String, Float> map = this.f52991l;
            Float f12 = map.get(str);
            if (f12 != null) {
                fFloatValue = f12.floatValue();
            } else {
                map.put(interfaceC20401y2.a().f53186g, Float.valueOf(0.0f));
                fFloatValue = 0.0f;
            }
            if (!L.f(interfaceC20401y2.d().f53186g, interfaceC20401y2.a().f53186g)) {
                fFloatValue = ((Boolean) ((C22082i3) this.f52992m.f52942c).getF42167b()).booleanValue() ? fFloatValue - 1.0f : fFloatValue + 1.0f;
            }
            float f13 = fFloatValue;
            map.put(interfaceC20401y2.d().f53186g, Float.valueOf(f13));
            return new C20396w0(this.f52993n.invoke(interfaceC20401y2), this.f52994o.invoke(interfaceC20401y2), f13, null, 8, null);
        }
    }

    /* compiled from: NavHost.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/u;", "it", "", "invoke", "(Landroidx/navigation/u;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.y$d */
    public static final class d extends N implements Y41.l<C23395u, Object> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f52996l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Object invoke(C23395u c23395u) {
            return c23395u.f53186g;
        }
    }

    /* compiled from: NavHost.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/animation/w;", "Landroidx/navigation/u;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/animation/w;Landroidx/navigation/u;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.y$e */
    public static final class e extends N implements r<InterfaceC20395w, C23395u, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.runtime.saveable.l f52997l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ I3<List<C23395u>> f52998m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(androidx.compose.runtime.saveable.l lVar, I3<? extends List<C23395u>> i32) {
            super(4);
            this.f52997l = lVar;
            this.f52998m = i32;
        }

        @Override // Y41.r
        public final G0 invoke(InterfaceC20395w interfaceC20395w, C23395u c23395u, A a12, Integer num) {
            C23395u c23395uPrevious;
            InterfaceC20395w interfaceC20395w2 = interfaceC20395w;
            C23395u c23395u2 = c23395u;
            A a13 = a12;
            num.intValue();
            List<C23395u> f42167b = this.f52998m.getF42167b();
            ListIterator<C23395u> listIterator = f42167b.listIterator(f42167b.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    c23395uPrevious = null;
                    break;
                }
                c23395uPrevious = listIterator.previous();
                if (L.f(c23395u2, c23395uPrevious)) {
                    break;
                }
            }
            C23395u c23395u3 = c23395uPrevious;
            if (c23395u3 != null) {
                C23352r.a(c23395u3, this.f52997l, androidx.compose.runtime.internal.r.b(a13, -1425390790, new C23327A(c23395u3, interfaceC20395w2)), a13, 456);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: NavHost.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.navigation.compose.NavHostKt$NavHost$15", f = "NavHost.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.navigation.compose.y$f */
    public static final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C20288i1<C23395u> f52999q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Map<String, Float> f53000r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ I3<List<C23395u>> f53001s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C23339e f53002t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(C20288i1<C23395u> c20288i1, Map<String, Float> map, I3<? extends List<C23395u>> i32, C23339e c23339e, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f52999q = c20288i1;
            this.f53000r = map;
            this.f53001s = i32;
            this.f53002t = c23339e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new f(this.f52999q, this.f53000r, this.f53001s, this.f53002t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C20288i1<C23395u> c20288i1 = this.f52999q;
            C23395u c23395uA = c20288i1.f26317a.a();
            InterfaceC22204y1 interfaceC22204y1 = c20288i1.f26320d;
            if (L.f(c23395uA, ((C22082i3) interfaceC22204y1).getF42167b())) {
                Iterator<T> it = this.f53001s.getF42167b().iterator();
                while (it.hasNext()) {
                    this.f53002t.b().b((C23395u) it.next());
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Map<String, Float> map = this.f53000r;
                for (Map.Entry<String, Float> entry : map.entrySet()) {
                    if (!L.f(entry.getKey(), ((C23395u) ((C22082i3) interfaceC22204y1).getF42167b()).f53186g)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it2 = linkedHashMap.entrySet().iterator();
                while (it2.hasNext()) {
                    map.remove(((Map.Entry) it2.next()).getKey());
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: NavHost.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/n0;", "Landroidx/compose/runtime/l0;", "invoke", "(Landroidx/compose/runtime/n0;)Landroidx/compose/runtime/l0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.y$g */
    public static final class g extends N implements Y41.l<C22128n0, InterfaceC22118l0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I3<List<C23395u>> f53003l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C23339e f53004m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(I3<? extends List<C23395u>> i32, C23339e c23339e) {
            super(1);
            this.f53003l = i32;
            this.f53004m = c23339e;
        }

        @Override // Y41.l
        public final InterfaceC22118l0 invoke(C22128n0 c22128n0) {
            return new C23328B(this.f53003l, this.f53004m);
        }
    }

    /* compiled from: NavHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.y$h */
    public static final class h extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23404y0 f53005l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C23324b0 f53006m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f53007n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22215f f53008o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20359j1> f53009p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> f53010q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20359j1> f53011r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> f53012s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f53013t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f53014u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(C23404y0 c23404y0, C23324b0 c23324b0, v vVar, InterfaceC22215f interfaceC22215f, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar2, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar3, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar4, int i12, int i13) {
            super(2);
            this.f53005l = c23404y0;
            this.f53006m = c23324b0;
            this.f53007n = vVar;
            this.f53008o = interfaceC22215f;
            this.f53009p = lVar;
            this.f53010q = lVar2;
            this.f53011r = lVar3;
            this.f53012s = lVar4;
            this.f53013t = i12;
            this.f53014u = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f53013t | 1);
            Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> lVar = this.f53010q;
            C23359y.a(this.f53005l, this.f53006m, this.f53007n, this.f53008o, this.f53009p, lVar, this.f53011r, this.f53012s, a12, iA2, this.f53014u);
            return G0.f406611a;
        }
    }

    /* compiled from: NavHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.y$i */
    public static final class i extends N implements Y41.l<InterfaceC20401y<C23395u>, AbstractC20359j1> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f53015l = new i();

        public i() {
            super(1);
        }

        @Override // Y41.l
        public final AbstractC20359j1 invoke(InterfaceC20401y<C23395u> interfaceC20401y) {
            return H0.d(C20310q.e(700, 0, null, 6), 2);
        }
    }

    /* compiled from: NavHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.y$j */
    public static final class j extends N implements Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> {

        /* renamed from: l, reason: collision with root package name */
        public static final j f53016l = new j();

        public j() {
            super(1);
        }

        @Override // Y41.l
        public final AbstractC20365l1 invoke(InterfaceC20401y<C23395u> interfaceC20401y) {
            return H0.e(C20310q.e(700, 0, null, 6), 2);
        }
    }

    /* compiled from: NavHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.y$k */
    public static final class k extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23404y0 f53017l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C23324b0 f53018m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f53019n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22215f f53020o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20359j1> f53021p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> f53022q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20359j1> f53023r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> f53024s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f53025t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f53026u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(C23404y0 c23404y0, C23324b0 c23324b0, v vVar, InterfaceC22215f interfaceC22215f, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar2, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar3, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar4, int i12, int i13) {
            super(2);
            this.f53017l = c23404y0;
            this.f53018m = c23324b0;
            this.f53019n = vVar;
            this.f53020o = interfaceC22215f;
            this.f53021p = lVar;
            this.f53022q = lVar2;
            this.f53023r = lVar3;
            this.f53024s = lVar4;
            this.f53025t = i12;
            this.f53026u = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f53025t | 1);
            Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> lVar = this.f53022q;
            C23359y.a(this.f53017l, this.f53018m, this.f53019n, this.f53020o, this.f53021p, lVar, this.f53023r, this.f53024s, a12, iA2, this.f53026u);
            return G0.f406611a;
        }
    }

    /* compiled from: NavHost.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.compose.y$l */
    public static final class l extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23404y0 f53027l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C23324b0 f53028m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f53029n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22215f f53030o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20359j1> f53031p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> f53032q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20359j1> f53033r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> f53034s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f53035t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f53036u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(C23404y0 c23404y0, C23324b0 c23324b0, v vVar, InterfaceC22215f interfaceC22215f, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar2, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar3, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar4, int i12, int i13) {
            super(2);
            this.f53027l = c23404y0;
            this.f53028m = c23324b0;
            this.f53029n = vVar;
            this.f53030o = interfaceC22215f;
            this.f53031p = lVar;
            this.f53032q = lVar2;
            this.f53033r = lVar3;
            this.f53034s = lVar4;
            this.f53035t = i12;
            this.f53036u = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f53035t | 1);
            Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> lVar = this.f53032q;
            C23359y.a(this.f53027l, this.f53028m, this.f53029n, this.f53030o, this.f53031p, lVar, this.f53033r, this.f53034s, a12, iA2, this.f53036u);
            return G0.f406611a;
        }
    }

    /* compiled from: NavHost.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/y;", "Landroidx/navigation/u;", "Landroidx/compose/animation/j1;", "invoke", "(Landroidx/compose/animation/y;)Landroidx/compose/animation/j1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.y$m */
    public static final class m extends N implements Y41.l<InterfaceC20401y<C23395u>, AbstractC20359j1> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23339e f53037l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20359j1> f53038m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20359j1> f53039n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public m(C23339e c23339e, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar2) {
            super(1);
            this.f53037l = c23339e;
            this.f53038m = lVar;
            this.f53039n = lVar2;
        }

        @Override // Y41.l
        public final AbstractC20359j1 invoke(InterfaceC20401y<C23395u> interfaceC20401y) {
            InterfaceC20401y<C23395u> interfaceC20401y2 = interfaceC20401y;
            C23339e.b bVar = (C23339e.b) interfaceC20401y2.d().f53182c;
            if (((Boolean) ((C22082i3) this.f53037l.f52942c).getF42167b()).booleanValue()) {
                C23317W.f52878k.getClass();
                for (C23317W c23317w : C23317W.b.c(bVar)) {
                    if (c23317w instanceof C23339e.b) {
                        ((C23339e.b) c23317w).getClass();
                    } else if (c23317w instanceof C23338d.a) {
                        ((C23338d.a) c23317w).getClass();
                    }
                }
                return this.f53038m.invoke(interfaceC20401y2);
            }
            C23317W.f52878k.getClass();
            for (C23317W c23317w2 : C23317W.b.c(bVar)) {
                if (c23317w2 instanceof C23339e.b) {
                    ((C23339e.b) c23317w2).getClass();
                } else if (c23317w2 instanceof C23338d.a) {
                    ((C23338d.a) c23317w2).getClass();
                }
            }
            return this.f53039n.invoke(interfaceC20401y2);
        }
    }

    /* compiled from: NavHost.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/animation/y;", "Landroidx/navigation/u;", "Landroidx/compose/animation/l1;", "invoke", "(Landroidx/compose/animation/y;)Landroidx/compose/animation/l1;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.y$n */
    public static final class n extends N implements Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C23339e f53040l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> f53041m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<InterfaceC20401y<C23395u>, AbstractC20365l1> f53042n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public n(C23339e c23339e, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar, Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar2) {
            super(1);
            this.f53040l = c23339e;
            this.f53041m = lVar;
            this.f53042n = lVar2;
        }

        @Override // Y41.l
        public final AbstractC20365l1 invoke(InterfaceC20401y<C23395u> interfaceC20401y) {
            InterfaceC20401y<C23395u> interfaceC20401y2 = interfaceC20401y;
            C23339e.b bVar = (C23339e.b) interfaceC20401y2.a().f53182c;
            if (((Boolean) ((C22082i3) this.f53040l.f52942c).getF42167b()).booleanValue()) {
                C23317W.f52878k.getClass();
                for (C23317W c23317w : C23317W.b.c(bVar)) {
                    if (c23317w instanceof C23339e.b) {
                        ((C23339e.b) c23317w).getClass();
                    } else if (c23317w instanceof C23338d.a) {
                        ((C23338d.a) c23317w).getClass();
                    }
                }
                return this.f53041m.invoke(interfaceC20401y2);
            }
            C23317W.f52878k.getClass();
            for (C23317W c23317w2 : C23317W.b.c(bVar)) {
                if (c23317w2 instanceof C23339e.b) {
                    ((C23339e.b) c23317w2).getClass();
                } else if (c23317w2 instanceof C23338d.a) {
                    ((C23338d.a) c23317w2).getClass();
                }
            }
            return this.f53042n.invoke(interfaceC20401y2);
        }
    }

    /* compiled from: NavHost.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Landroidx/navigation/u;", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.compose.y$o */
    public static final class o extends N implements Y41.a<List<? extends C23395u>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f53043l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC22204y1 interfaceC22204y1) {
            super(0);
            this.f53043l = interfaceC22204y1;
        }

        @Override // Y41.a
        public final List<? extends C23395u> invoke() {
            List list = (List) this.f53043l.getF42167b();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (L.f(((C23395u) obj).f53182c.f52879b, "composable")) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
    @InterfaceC22132o
    @SuppressLint({"StateFlowValueCalledInComposition"})
    @InterfaceC22181t
    public static final void a(@Y61.k C23404y0 c23404y0, @Y61.k C23324b0 c23324b0, @Y61.l v vVar, @Y61.l InterfaceC22215f interfaceC22215f, @Y61.l Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar, @Y61.l Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar2, @Y61.l Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar3, @Y61.l Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar4, @Y61.l A a12, int i12, int i13) {
        InterfaceC22215f interfaceC22215f2;
        Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar5;
        int i14;
        Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar6;
        Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar7;
        Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar8;
        Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar9;
        C23303N0 c23303n0;
        ?? r102;
        C23348n c23348n;
        B bE2 = a12.E(-1818191915);
        if ((i13 & 8) != 0) {
            InterfaceC22215f.f39074a.getClass();
            interfaceC22215f2 = InterfaceC22215f.a.f39080f;
        } else {
            interfaceC22215f2 = interfaceC22215f;
        }
        Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20359j1> lVar10 = (i13 & 16) != 0 ? i.f53015l : lVar;
        Y41.l<? super InterfaceC20401y<C23395u>, ? extends AbstractC20365l1> lVar11 = (i13 & 32) != 0 ? j.f53016l : lVar2;
        if ((i13 & 64) != 0) {
            i14 = i12 & (-3670017);
            lVar5 = lVar10;
        } else {
            lVar5 = lVar3;
            i14 = i12;
        }
        if ((i13 & 128) != 0) {
            i14 &= -29360129;
            lVar6 = lVar11;
        } else {
            lVar6 = lVar4;
        }
        InterfaceC22983P interfaceC22983P = (InterfaceC22983P) bE2.o(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        androidx.view.viewmodel.compose.a.f46897a.getClass();
        T0 t0A = androidx.view.viewmodel.compose.a.a(bE2);
        if (t0A == null) {
            throw new IllegalStateException("NavHost requires a ViewModelStoreOwner to be provided via LocalViewModelStoreOwner");
        }
        c23404y0.D(t0A.getF42820b());
        c23404y0.y(c23324b0, null);
        C23303N0 c23303n02 = c23404y0.f53227w;
        AbstractC23301M0 abstractC23301M0B = c23303n02.b("composable");
        C23339e c23339e = abstractC23301M0B instanceof C23339e ? (C23339e) abstractC23301M0B : null;
        if (c23339e == null) {
            C22039c2 c22039c2Z = bE2.Z();
            if (c22039c2Z == null) {
                return;
            }
            c22039c2Z.f38184d = new k(c23404y0, c23324b0, vVar, interfaceC22215f2, lVar10, lVar11, lVar5, lVar6, i12, i13);
            return;
        }
        androidx.view.compose.h.a(((List) C22126m3.b(c23339e.b().f52865e, bE2).getF42167b()).size() > 1, new a(c23404y0), bE2, 0, 0);
        C22187u0.a(interfaceC22983P, new b(c23404y0, interfaceC22983P), bE2);
        androidx.compose.runtime.saveable.l lVarA = q.a(bE2);
        InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(c23404y0.f53215k, bE2);
        bE2.I(-492369756);
        Object objT = bE2.t();
        A.f37866a.getClass();
        Object obj = A.a.f37868b;
        if (objT == obj) {
            objT = C22126m3.d(new o(interfaceC22204y1B));
            bE2.H(objT);
        }
        bE2.X(false);
        I3 i32 = (I3) objT;
        C23395u c23395u = (C23395u) C42745f0.S((List) i32.getF42167b());
        bE2.I(-492369756);
        Object objT2 = bE2.t();
        if (objT2 == obj) {
            objT2 = new LinkedHashMap();
            bE2.H(objT2);
        }
        bE2.X(false);
        Map map = (Map) objT2;
        bE2.I(1822177954);
        if (c23395u != null) {
            bE2.I(1618982084);
            boolean zB2 = bE2.B(c23339e) | bE2.B(lVar5) | bE2.B(lVar10);
            Object objT3 = bE2.t();
            if (zB2 || objT3 == obj) {
                objT3 = new m(c23339e, lVar5, lVar10);
                bE2.H(objT3);
            }
            bE2.X(false);
            Y41.l lVar12 = (Y41.l) objT3;
            bE2.I(1618982084);
            boolean zB3 = bE2.B(c23339e) | bE2.B(lVar6) | bE2.B(lVar11);
            Object objT4 = bE2.t();
            if (zB3 || objT4 == obj) {
                objT4 = new n(c23339e, lVar6, lVar11);
                bE2.H(objT4);
            }
            bE2.X(false);
            lVar9 = lVar6;
            C20288i1 c20288i1F = C20300m1.f(c23395u, "entry", bE2, 56, 0);
            lVar8 = lVar5;
            C23339e c23339e2 = c23339e;
            lVar7 = lVar11;
            c23303n0 = c23303n02;
            r102 = 0;
            c23348n = null;
            C20389u.a(c20288i1F, vVar, new c(map, c23339e, lVar12, (Y41.l) objT4, i32), interfaceC22215f2, d.f52996l, androidx.compose.runtime.internal.r.b(bE2, -1440061047, new e(lVarA, i32)), bE2, ((i14 >> 3) & 112) | 221184 | (i14 & 7168));
            C22187u0.e(c20288i1F.f26317a.a(), ((C22082i3) c20288i1F.f26320d).getF42167b(), new f(c20288i1F, map, i32, c23339e2, null), bE2);
            Boolean bool = Boolean.TRUE;
            bE2.I(511388516);
            boolean zB4 = bE2.B(i32) | bE2.B(c23339e2);
            Object objT5 = bE2.t();
            if (zB4 || objT5 == obj) {
                objT5 = new g(i32, c23339e2);
                bE2.H(objT5);
            }
            bE2.X(false);
            C22187u0.a(bool, (Y41.l) objT5, bE2);
        } else {
            lVar7 = lVar11;
            lVar8 = lVar5;
            lVar9 = lVar6;
            c23303n0 = c23303n02;
            r102 = 0;
            c23348n = null;
        }
        bE2.X(r102);
        AbstractC23301M0 abstractC23301M0B2 = c23303n0.b("dialog");
        C23348n c23348n2 = abstractC23301M0B2 instanceof C23348n ? (C23348n) abstractC23301M0B2 : c23348n;
        if (c23348n2 == null) {
            C22039c2 c22039c2Z2 = bE2.Z();
            if (c22039c2Z2 == null) {
                return;
            }
            c22039c2Z2.f38184d = new l(c23404y0, c23324b0, vVar, interfaceC22215f2, lVar10, lVar7, lVar8, lVar9, i12, i13);
            return;
        }
        C23340f.a(c23348n2, bE2, r102);
        C22039c2 c22039c2Z3 = bE2.Z();
        if (c22039c2Z3 == null) {
            return;
        }
        c22039c2Z3.f38184d = new h(c23404y0, c23324b0, vVar, interfaceC22215f2, lVar10, lVar7, lVar8, lVar9, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x003e  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k androidx.view.C23404y0 r21, @Y61.k java.lang.String r22, @Y61.k Y41.l r23, @Y61.l androidx.compose.runtime.A r24, int r25) {
        /*
            r2 = r22
            r9 = r23
            r0 = 410432995(0x1876b5e3, float:3.1886584E-24)
            r1 = r24
            androidx.compose.runtime.B r0 = r1.E(r0)
            androidx.compose.ui.v$a r3 = androidx.compose.ui.v.f42878y1
            androidx.compose.ui.f$a r1 = androidx.compose.ui.InterfaceC22215f.f39074a
            r1.getClass()
            androidx.compose.ui.i r4 = androidx.compose.ui.InterfaceC22215f.a.f39080f
            androidx.navigation.compose.D r7 = androidx.view.compose.C23330D.f52924l
            androidx.navigation.compose.E r8 = androidx.view.compose.C23331E.f52925l
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r0.I(r1)
            r1 = 0
            boolean r5 = r0.B(r1)
            boolean r6 = r0.B(r2)
            r5 = r5 | r6
            boolean r6 = r0.B(r9)
            r5 = r5 | r6
            java.lang.Object r6 = r0.t()
            if (r5 != 0) goto L3e
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            r5.getClass()
            androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r5) goto L41
        L3e:
            r5 = r21
            goto L44
        L41:
            r5 = r21
            goto L55
        L44:
            androidx.navigation.N0 r6 = r5.f53227w
            androidx.navigation.c0 r10 = new androidx.navigation.c0
            r10.<init>(r6, r2, r1)
            r9.invoke(r10)
            androidx.navigation.b0 r6 = r10.a()
            r0.H(r6)
        L55:
            r1 = 0
            r0.X(r1)
            r11 = r6
            androidx.navigation.b0 r11 = (androidx.view.C23324b0) r11
            r19 = 72
            r20 = 0
            r10 = r21
            r12 = r3
            r13 = r4
            r14 = r7
            r15 = r8
            r16 = r7
            r17 = r8
            r18 = r0
            a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            androidx.compose.runtime.c2 r11 = r0.Z()
            if (r11 != 0) goto L76
            goto L88
        L76:
            androidx.navigation.compose.F r12 = new androidx.navigation.compose.F
            r0 = r12
            r1 = r21
            r2 = r22
            r5 = r7
            r6 = r8
            r9 = r23
            r10 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f38184d = r12
        L88:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.compose.C23359y.b(androidx.navigation.y0, java.lang.String, Y41.l, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0031  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    @kotlin.InterfaceC42830m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.view.C23404y0 r16, java.lang.String r17, androidx.compose.ui.v r18, Y41.l r19, androidx.compose.runtime.A r20, int r21) {
        /*
            r2 = r17
            r4 = r19
            r0 = 141827520(0x8741dc0, float:7.346105E-34)
            r1 = r20
            androidx.compose.runtime.B r0 = r1.E(r0)
            r1 = 1618982084(0x607fb4c4, float:7.370227E19)
            r0.I(r1)
            r1 = 0
            boolean r3 = r0.B(r1)
            boolean r5 = r0.B(r2)
            r3 = r3 | r5
            boolean r5 = r0.B(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r0.t()
            if (r3 != 0) goto L31
            androidx.compose.runtime.A$a r3 = androidx.compose.runtime.A.f37866a
            r3.getClass()
            androidx.compose.runtime.A$a$a r3 = androidx.compose.runtime.A.a.f37868b
            if (r5 != r3) goto L34
        L31:
            r3 = r16
            goto L37
        L34:
            r3 = r16
            goto L48
        L37:
            androidx.navigation.N0 r5 = r3.f53227w
            androidx.navigation.c0 r6 = new androidx.navigation.c0
            r6.<init>(r5, r2, r1)
            r4.invoke(r6)
            androidx.navigation.b0 r5 = r6.a()
            r0.H(r5)
        L48:
            r1 = 0
            r0.X(r1)
            r6 = r5
            androidx.navigation.b0 r6 = (androidx.view.C23324b0) r6
            r1 = r21
            r5 = r1 & 896(0x380, float:1.256E-42)
            r14 = r5 | 72
            r11 = 0
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r15 = 248(0xf8, float:3.48E-43)
            r5 = r16
            r7 = r18
            r13 = r0
            a(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            androidx.compose.runtime.c2 r6 = r0.Z()
            if (r6 != 0) goto L6b
            goto L7d
        L6b:
            androidx.navigation.compose.C r7 = new androidx.navigation.compose.C
            r0 = r7
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f38184d = r7
        L7d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.compose.C23359y.c(androidx.navigation.y0, java.lang.String, androidx.compose.ui.v, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
