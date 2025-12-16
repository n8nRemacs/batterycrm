package com.avito.android.photo_list_view;

import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.image.enhancement.InterfaceC30978i;
import com.avito.android.photo_list_view.InterfaceC33208b;
import com.avito.android.photo_list_view.s;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.P1;
import io.reactivex.rxjava3.internal.operators.single.U;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: ImageListPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_list_view/t;", "Lcom/avito/android/photo_list_view/s;", "a", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class t implements s {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33214h f218326a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final s.b f218327b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final s.a f218328c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f218329d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final x f218330e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC33218l f218331f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final N f218332g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final InterfaceC30978i f218333h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final HM.a f218334i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final InterfaceC28373a f218335j;

    /* renamed from: k, reason: collision with root package name */
    public int f218336k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Integer> f218337l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<kotlin.Q<Integer, Integer>> f218338m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.e<G> f218339n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f218340o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Integer> f218341p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public y f218342q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f218343r;

    /* renamed from: s, reason: collision with root package name */
    public int f218344s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f218345t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public List<G> f218346u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f218347v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.i f218348w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f218349x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public static final a f218324y = new a(null);

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC33208b.a f218325z = new InterfaceC33208b.a(null, Integer.valueOf(R.drawable.ic_image_enhance), null, null, null, 28, null);

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public static final InterfaceC33208b.a f218323A = new InterfaceC33208b.a(com.avito.android.printable_text.b.c(R.string.label_main, new Serializable[0]), null, null, null, null, 28, null);

    /* compiled from: ImageListPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_list_view/t$a;", "", "<init>", "()V", "_avito_photo-list-view_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ImageListPresenter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "", "", "Lcom/avito/android/photo_list_view/b$a;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Map map = (Map) obj;
            t tVar = t.this;
            List<G> list = tVar.f218346u;
            if (list.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (G gC2 : list) {
                List list2 = (List) map.get(gC2.f218072e);
                if (list2 != null && !list2.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList(gC2.f218071d);
                    arrayList2.addAll(list2);
                    gC2 = G.c(gC2, arrayList2, null, null, 503);
                }
                arrayList.add(gC2);
            }
            y yVar = tVar.f218342q;
            if (yVar != null) {
                boolean z12 = tVar.f218345t;
                yVar.a(tVar.f218331f.a(tVar.f218336k, arrayList, z12));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                G g12 = (G) it.next();
                LinkedHashMap linkedHashMap = tVar.f218340o;
                Object obj2 = linkedHashMap.get(g12.f218072e);
                String str = g12.f218072e;
                if (!kotlin.jvm.internal.L.f(obj2, map.get(str))) {
                    Collection collection = (List) map.get(str);
                    if (collection == null) {
                        collection = C42784z0.f406748b;
                    }
                    linkedHashMap.put(str, collection);
                    tVar.f218339n.onNext(g12);
                }
            }
        }
    }

    /* compiled from: ImageListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final c<T> f218351b = new c<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    /* compiled from: ImageListPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/avito/android/photo_list_view/G;", "images", "", "maxCount", "apply", "(Ljava/util/List;I)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T1, T2, R> f218352b = new d<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            List listE0 = C42745f0.E0((List) obj, ((Number) obj2).intValue());
            ArrayList arrayList = new ArrayList(C42745f0.q(listE0, 10));
            int i12 = 0;
            for (Object obj3 : listE0) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                G g12 = (G) obj3;
                ArrayList arrayList2 = new ArrayList();
                if (i12 == 0) {
                    t.f218324y.getClass();
                    arrayList2.add(t.f218323A);
                }
                if (g12.f218075h) {
                    t.f218324y.getClass();
                    arrayList2.add(t.f218325z);
                }
                arrayList.add(G.c(g12, arrayList2, null, null, 503));
                i12 = i13;
            }
            return arrayList;
        }
    }

    /* compiled from: ImageListPresenter.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_list_view/G;", PhotoParameter.TYPE, "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            ArrayList arrayList = new ArrayList();
            for (T t12 : (List) obj) {
                if (((G) t12).f218070c instanceof InterfaceC33208b.InterfaceC6540b.a) {
                    arrayList.add(t12);
                }
            }
            t.this.f218344s = arrayList.size();
        }
    }

    /* compiled from: ImageListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_list_view/G;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            t.this.f218341p.accept(Integer.valueOf(((List) obj).size()));
        }
    }

    /* compiled from: ImageListPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/photo_list_view/G;", "it", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            List list = (List) obj;
            a aVar = t.f218324y;
            t tVar = t.this;
            tVar.k(list);
            tVar.f218346u = list;
            y yVar = tVar.f218342q;
            if (yVar != null) {
                boolean z12 = tVar.f218345t;
                yVar.a(tVar.f218331f.a(tVar.f218336k, list, z12));
            }
        }
    }

    /* compiled from: ImageListPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T> implements l41.g {
        public h() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            NonFatalErrorEvent nonFatalErrorEvent = new NonFatalErrorEvent("ImageListPresenter.subscribeToPhotos", (Throwable) obj, null, null, 12, null);
            InterfaceC28373a interfaceC28373a = t.this.f218335j;
            if (interfaceC28373a != null) {
                interfaceC28373a.c(nonFatalErrorEvent);
            }
        }
    }

    public t(@Y61.k InterfaceC33214h interfaceC33214h, @Y61.k s.b bVar, @Y61.l s.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k x xVar, @Y61.k InterfaceC33218l interfaceC33218l, @Y61.k N n12, @Y61.l InterfaceC30978i interfaceC30978i, @Y61.l HM.a aVar2, @Y61.l InterfaceC28373a interfaceC28373a) {
        this.f218326a = interfaceC33214h;
        this.f218327b = bVar;
        this.f218328c = aVar;
        this.f218329d = interfaceC35745a5;
        this.f218330e = xVar;
        this.f218331f = interfaceC33218l;
        this.f218332g = n12;
        this.f218333h = interfaceC30978i;
        this.f218334i = aVar2;
        this.f218335j = interfaceC28373a;
        this.f218337l = new com.jakewharton.rxrelay3.b<>();
        this.f218338m = new com.jakewharton.rxrelay3.c<>();
        this.f218339n = new io.reactivex.rxjava3.subjects.e<>();
        this.f218340o = new LinkedHashMap();
        this.f218341p = new com.jakewharton.rxrelay3.c<>();
        this.f218346u = C42784z0.f406748b;
        this.f218347v = new io.reactivex.rxjava3.disposables.c();
        this.f218348w = new io.reactivex.rxjava3.disposables.i();
    }

    @Override // com.avito.android.photo_list_view.s
    public final void A(@Y61.k y yVar) {
        this.f218342q = yVar;
        InterfaceC30978i interfaceC30978i = this.f218333h;
        if (interfaceC30978i != null) {
            interfaceC30978i.E0();
        }
        E();
        u uVar = new u(this);
        l41.g<? super Throwable> gVar = v.f218358b;
        com.jakewharton.rxrelay3.c<kotlin.Q<Integer, Integer>> cVar = this.f218338m;
        cVar.getClass();
        this.f218347v.b(cVar.v0(uVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.photo_list_view.y.a
    public final void B(@Y61.k String str, @Y61.l String str2) {
        this.f218332g.getF218104c().accept(ViewAction.f218107b);
        if (str.equals("9223372036854775806")) {
            str = null;
        }
        this.f218330e.A2(this.f218344s, str, str2);
    }

    @Override // com.avito.android.photo_list_view.s
    /* renamed from: C, reason: from getter */
    public final int getF218336k() {
        return this.f218336k;
    }

    public final void E() {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f218343r;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        P1 p1I0 = this.f218326a.a().I0(this.f218337l, d.f218352b);
        InterfaceC35745a5 interfaceC35745a5 = this.f218329d;
        this.f218343r = (io.reactivex.rxjava3.internal.observers.y) p1I0.x0(interfaceC35745a5.c()).j0(interfaceC35745a5.e()).K(new e()).K(new f()).v0(new g(), new h(), io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    @Override // com.avito.android.photo_list_view.s
    public final void c(int i12) {
        this.f218336k = i12;
        this.f218337l.accept(Integer.valueOf(i12));
    }

    @Override // com.avito.android.photo_list_view.s
    public final void e0() {
        y yVar = this.f218342q;
        if (yVar != null) {
            yVar.destroy();
        }
        this.f218342q = null;
        InterfaceC30978i interfaceC30978i = this.f218333h;
        if (interfaceC30978i != null) {
            interfaceC30978i.K();
        }
        io.reactivex.rxjava3.internal.observers.y yVar2 = this.f218343r;
        if (yVar2 != null) {
            DisposableHelper.a(yVar2);
        }
        this.f218343r = null;
        this.f218347v.e();
        this.f218348w.a(null);
        this.f218340o.clear();
    }

    @Override // com.avito.android.photo_list_view.y.a
    public final void f(@Y61.k String str) {
        this.f218327b.a(str);
    }

    public final void k(List<G> list) {
        HM.a aVar;
        String str;
        if (!this.f218349x || (aVar = this.f218334i) == null || list.isEmpty()) {
            return;
        }
        List<G> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (C43066x.K(((G) it.next()).f218072e)) {
                    return;
                }
            }
        }
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (G g12 : list2) {
            boolean z12 = g12.f218075h;
            String str2 = g12.f218072e;
            if (!z12 && (str = g12.f218076i) != null) {
                str2 = str;
            }
            arrayList.add(str2);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            G g13 = (G) obj;
            String str3 = g13.f218076i;
            if (str3 != null && !str3.equals(g13.f218072e) && g13.f218075h) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            G g14 = (G) it2.next();
            linkedHashMap.put(g14.f218072e, g14.f218076i);
        }
        U uV = aVar.d(arrayList, linkedHashMap).v(P0.c());
        InterfaceC35745a5 interfaceC35745a5 = this.f218329d;
        this.f218348w.a(uV.z(interfaceC35745a5.a()).s(interfaceC35745a5.e()).x(new b(), c.f218351b));
    }

    @Override // com.avito.android.photo_list_view.s
    public final void l(boolean z12) {
        if (z12) {
            this.f218327b.a(null);
        }
    }

    @Override // com.avito.android.photo_list_view.y.a
    public final void o(@Y61.k String str) {
        Object next;
        s.a aVar;
        this.f218326a.remove(str);
        Iterator<T> it = this.f218346u.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (kotlin.jvm.internal.L.f(((G) next).f218068a, str)) {
                    break;
                }
            }
        }
        G g12 = (G) next;
        if (g12 == null || (aVar = this.f218328c) == null) {
            return;
        }
        aVar.P3(g12);
    }

    @Override // com.avito.android.photo_list_view.s
    public final void p(boolean z12) {
        this.f218345t = z12;
        List list = this.f218346u;
        k(list);
        this.f218346u = list;
        y yVar = this.f218342q;
        if (yVar != null) {
            boolean z13 = this.f218345t;
            yVar.a(this.f218331f.a(this.f218336k, list, z13));
        }
    }

    @Override // com.avito.android.photo_list_view.y.a
    public final void r() {
        E();
    }

    @Override // com.avito.android.photo_list_view.H
    public final void u(int i12, int i13) {
        this.f218338m.accept(new kotlin.Q<>(Integer.valueOf(i12), Integer.valueOf(i13)));
    }

    @Override // com.avito.android.photo_list_view.s
    @Y61.k
    public final io.reactivex.rxjava3.core.z<G> w() {
        return this.f218339n;
    }

    @Override // com.avito.android.photo_list_view.s
    public final void x(boolean z12) {
        boolean z13 = !this.f218349x && z12;
        this.f218349x = z12;
        if (z13) {
            k(this.f218346u);
        }
    }

    public /* synthetic */ t(InterfaceC33214h interfaceC33214h, s.b bVar, s.a aVar, InterfaceC35745a5 interfaceC35745a5, x xVar, InterfaceC33218l interfaceC33218l, N n12, InterfaceC30978i interfaceC30978i, HM.a aVar2, InterfaceC28373a interfaceC28373a, int i12, C42822w c42822w) {
        this(interfaceC33214h, bVar, aVar, interfaceC35745a5, xVar, interfaceC33218l, n12, interfaceC30978i, aVar2, (i12 & 512) != 0 ? null : interfaceC28373a);
    }

    public t(@Y61.k InterfaceC33214h interfaceC33214h, @Y61.k s.b bVar, @Y61.l s.a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k x xVar, @Y61.k InterfaceC33218l interfaceC33218l, @Y61.k N n12) {
        this(interfaceC33214h, bVar, aVar, interfaceC35745a5, xVar, interfaceC33218l, n12, null, null, null);
    }
}
