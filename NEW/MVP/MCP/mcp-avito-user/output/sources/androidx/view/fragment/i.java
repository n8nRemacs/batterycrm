package androidx.view.fragment;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.os.C22777e;
import androidx.fragment.app.A;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.H;
import androidx.view.AbstractC23301M0;
import androidx.view.AbstractC23307P0;
import androidx.view.C23280B0;
import androidx.view.C23317W;
import androidx.view.C23395u;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import androidx.view.Lifecycle;
import androidx.view.M0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.fragment.i;
import androidx.view.fragment.p;
import j.InterfaceC42153i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import z1.AbstractC50339a;
import z1.C50340b;
import z1.C50341c;
import z1.C50346h;

/* compiled from: FragmentNavigator.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/fragment/i;", "Landroidx/navigation/M0;", "Landroidx/navigation/fragment/i$c;", "a", "b", "c", "d", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC23301M0.b("fragment")
/* loaded from: classes.dex */
public class i extends AbstractC23301M0<c> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f53137j = 0;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f53138c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FragmentManager f53139d;

    /* renamed from: e, reason: collision with root package name */
    public final int f53140e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinkedHashSet f53141f = new LinkedHashSet();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f53142g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    @k
    public final M11.d f53143h = new M11.d(this, 3);

    /* renamed from: i, reason: collision with root package name */
    @k
    public final l<C23395u, InterfaceC22979L> f53144i = new g();

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/fragment/i$a;", "Landroidx/lifecycle/M0;", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends M0 {

        /* renamed from: E, reason: collision with root package name */
        public WeakReference<Y41.a<G0>> f53145E;

        @Override // androidx.view.M0
        public final void onCleared() {
            super.onCleared();
            WeakReference<Y41.a<G0>> weakReference = this.f53145E;
            if (weakReference == null) {
                weakReference = null;
            }
            Y41.a<G0> aVar = weakReference.get();
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/navigation/fragment/i$b;", "", "<init>", "()V", "", "KEY_SAVED_IDS", "Ljava/lang/String;", "TAG", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @C23317W.a
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/fragment/i$c;", "Landroidx/navigation/W;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class c extends C23317W {

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public String f53146l;

        public c() {
            throw null;
        }

        @Override // androidx.view.C23317W
        public boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof c)) {
                return false;
            }
            return super.equals(obj) && L.f(this.f53146l, ((c) obj).f53146l);
        }

        @Override // androidx.view.C23317W
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f53146l;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.view.C23317W
        @InterfaceC42153i
        public void l(@k Context context, @k AttributeSet attributeSet) {
            super.l(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, p.d.f53162b);
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f53146l = string;
            }
            G0 g02 = G0.f406611a;
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.view.C23317W
        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f53146l;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            return sb2.toString();
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/fragment/i$d;", "Landroidx/navigation/M0$a;", "a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d implements AbstractC23301M0.a {

        /* compiled from: FragmentNavigator.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/fragment/i$d$a;", "", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a {
            public a() {
                new LinkedHashMap();
            }
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC23307P0 f53147l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Fragment f53148m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment, C23395u c23395u, AbstractC23307P0 abstractC23307P0) {
            super(0);
            this.f53147l = abstractC23307P0;
            this.f53148m = fragment;
        }

        @Override // Y41.a
        public final G0 invoke() {
            AbstractC23307P0 abstractC23307P0 = this.f53147l;
            for (C23395u c23395u : abstractC23307P0.f52866f.getValue()) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(c23395u);
                    Objects.toString(this.f53148m);
                }
                abstractC23307P0.b(c23395u);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz1/a;", "Landroidx/navigation/fragment/i$a;", "invoke", "(Lz1/a;)Landroidx/navigation/fragment/i$a;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class f extends N implements l<AbstractC50339a, a> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f53149l = new f();

        public f() {
            super(1);
        }

        @Override // Y41.l
        public final a invoke(AbstractC50339a abstractC50339a) {
            return new a();
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/u;", "entry", "Landroidx/lifecycle/L;", "invoke", "(Landroidx/navigation/u;)Landroidx/lifecycle/L;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class g extends N implements l<C23395u, InterfaceC22979L> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC22979L invoke(C23395u c23395u) {
            final C23395u c23395u2 = c23395u;
            final i iVar = i.this;
            return new InterfaceC22979L() { // from class: androidx.navigation.fragment.l
                @Override // androidx.view.InterfaceC22979L
                public final void HH(InterfaceC22983P interfaceC22983P, Lifecycle.Event event) {
                    Lifecycle.Event event2 = Lifecycle.Event.ON_RESUME;
                    i iVar2 = iVar;
                    C23395u c23395u3 = c23395u2;
                    if (event == event2) {
                        int i12 = i.f53137j;
                        if (iVar2.b().f52865e.getValue().contains(c23395u3)) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                c23395u3.toString();
                                interfaceC22983P.toString();
                            }
                            iVar2.b().b(c23395u3);
                        }
                    }
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            c23395u3.toString();
                            interfaceC22983P.toString();
                        }
                        int i13 = i.f53137j;
                        iVar2.b().b(c23395u3);
                    }
                }
            };
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Q;", "", "", "it", "invoke", "(Lkotlin/Q;)Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.fragment.i$i, reason: collision with other inner class name */
    public static final class C1875i extends N implements l<Q<? extends String, ? extends Boolean>, String> {

        /* renamed from: l, reason: collision with root package name */
        public static final C1875i f53153l = new C1875i();

        public C1875i() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final String invoke(Q<? extends String, ? extends Boolean> q12) {
            return (String) q12.f406619b;
        }
    }

    /* compiled from: FragmentNavigator.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class j implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f53154b;

        public j(l lVar) {
            this.f53154b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f53154b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f53154b;
        }

        public final int hashCode() {
            return this.f53154b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f53154b.invoke(obj);
        }
    }

    static {
        new b(null);
    }

    public i(@k Context context, @k FragmentManager fragmentManager, int i12) {
        this.f53138c = context;
        this.f53139d = fragmentManager;
        this.f53140e = i12;
    }

    public static void k(i iVar, String str, int i12) {
        boolean z12 = (i12 & 2) == 0;
        boolean z13 = (i12 & 4) != 0;
        ArrayList arrayList = iVar.f53142g;
        if (z13) {
            C42745f0.l0(new androidx.view.fragment.j(str), arrayList);
        }
        arrayList.add(new Q(str, Boolean.valueOf(z12)));
    }

    public static void l(@k Fragment fragment, @k C23395u c23395u, @k AbstractC23307P0 abstractC23307P0) {
        S0 f42820b = fragment.getF42820b();
        C50341c c50341c = new C50341c();
        f fVar = f.f53149l;
        kotlin.reflect.d dVarB = m0.f406844a.b(a.class);
        LinkedHashMap linkedHashMap = c50341c.f443750a;
        if (linkedHashMap.containsKey(dVarB)) {
            throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + dVarB.p0() + '.').toString());
        }
        linkedHashMap.put(dVarB, new C50346h(dVarB, fVar));
        A1.i iVar = A1.i.f43a;
        Collection collectionValues = linkedHashMap.values();
        iVar.getClass();
        C50346h[] c50346hArr = (C50346h[]) collectionValues.toArray(new C50346h[0]);
        ((a) new P0(f42820b, new C50340b((C50346h[]) Arrays.copyOf(c50346hArr, c50346hArr.length)), AbstractC50339a.C12939a.f443748b).a(a.class)).f53145E = new WeakReference<>(new e(fragment, c23395u, abstractC23307P0));
    }

    @Override // androidx.view.AbstractC23301M0
    public void d(@k List<C23395u> list, @Y61.l C23280B0 c23280b0, @Y61.l AbstractC23301M0.a aVar) {
        FragmentManager fragmentManager = this.f53139d;
        if (fragmentManager.V()) {
            return;
        }
        for (C23395u c23395u : list) {
            boolean zIsEmpty = b().f52865e.getValue().isEmpty();
            if (c23280b0 == null || zIsEmpty || !c23280b0.f52743b || !this.f53141f.remove(c23395u.f53186g)) {
                H hN2 = n(c23395u, c23280b0);
                if (!zIsEmpty) {
                    C23395u c23395u2 = (C23395u) C42745f0.S(b().f52865e.getValue());
                    if (c23395u2 != null) {
                        k(this, c23395u2.f53186g, 6);
                    }
                    String str = c23395u.f53186g;
                    k(this, str, 6);
                    hN2.c(str);
                }
                if (aVar instanceof d) {
                    ((d) aVar).getClass();
                    kotlin.collections.P0.q(null);
                    throw null;
                }
                hN2.e();
                if (Log.isLoggable("FragmentManager", 2)) {
                    c23395u.toString();
                }
                b().h(c23395u);
            } else {
                fragmentManager.h0(c23395u.f53186g);
                b().h(c23395u);
            }
        }
    }

    @Override // androidx.view.AbstractC23301M0
    public final void e(@k final AbstractC23307P0 abstractC23307P0) {
        super.e(abstractC23307P0);
        Log.isLoggable("FragmentManager", 2);
        A a12 = new A() { // from class: androidx.navigation.fragment.h
            @Override // androidx.fragment.app.A
            public final void a(Fragment fragment) {
                C23395u c23395uPrevious;
                int i12 = i.f53137j;
                AbstractC23307P0 abstractC23307P02 = abstractC23307P0;
                List<C23395u> value = abstractC23307P02.f52865e.getValue();
                ListIterator<C23395u> listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        c23395uPrevious = null;
                        break;
                    } else {
                        c23395uPrevious = listIterator.previous();
                        if (L.f(c23395uPrevious.f53186g, fragment.getTag())) {
                            break;
                        }
                    }
                }
                C23395u c23395u = c23395uPrevious;
                boolean zIsLoggable = Log.isLoggable("FragmentManager", 2);
                i iVar = this;
                if (zIsLoggable) {
                    fragment.toString();
                    Objects.toString(c23395u);
                    Objects.toString(iVar.f53139d);
                }
                if (c23395u != null) {
                    fragment.getViewLifecycleOwnerLiveData().observe(fragment, new i.j(new k(iVar, fragment, c23395u)));
                    fragment.getLifecycle().a(iVar.f53143h);
                    i.l(fragment, c23395u, abstractC23307P02);
                }
            }
        };
        FragmentManager fragmentManager = this.f53139d;
        fragmentManager.f46377o.add(a12);
        fragmentManager.b(new h(abstractC23307P0, this));
    }

    @Override // androidx.view.AbstractC23301M0
    public final void f(@k C23395u c23395u) {
        FragmentManager fragmentManager = this.f53139d;
        if (fragmentManager.V()) {
            return;
        }
        H hN2 = n(c23395u, null);
        List<C23395u> value = b().f52865e.getValue();
        if (value.size() > 1) {
            C23395u c23395u2 = (C23395u) C42745f0.K(value.size() - 2, value);
            if (c23395u2 != null) {
                k(this, c23395u2.f53186g, 6);
            }
            String str = c23395u.f53186g;
            k(this, str, 4);
            fragmentManager.a0(1, str);
            k(this, str, 2);
            hN2.c(str);
        }
        hN2.e();
        b().c(c23395u);
    }

    @Override // androidx.view.AbstractC23301M0
    public final void g(@k Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            LinkedHashSet linkedHashSet = this.f53141f;
            linkedHashSet.clear();
            C42745f0.h(stringArrayList, linkedHashSet);
        }
    }

    @Override // androidx.view.AbstractC23301M0
    @Y61.l
    public final Bundle h() {
        LinkedHashSet linkedHashSet = this.f53141f;
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return C22777e.b(new Q("androidx-nav-fragment:navigator:savedIds", new ArrayList(linkedHashSet)));
    }

    @Override // androidx.view.AbstractC23301M0
    public final void i(@k C23395u c23395u, boolean z12) {
        FragmentManager fragmentManager = this.f53139d;
        if (fragmentManager.V()) {
            return;
        }
        List<C23395u> value = b().f52865e.getValue();
        int iIndexOf = value.indexOf(c23395u);
        List<C23395u> listSubList = value.subList(iIndexOf, value.size());
        C23395u c23395u2 = (C23395u) C42745f0.E(value);
        if (z12) {
            for (C23395u c23395u3 : C42745f0.q0(listSubList)) {
                if (L.f(c23395u3, c23395u2)) {
                    Objects.toString(c23395u3);
                } else {
                    fragmentManager.k0(c23395u3.f53186g);
                    this.f53141f.add(c23395u3.f53186g);
                }
            }
        } else {
            fragmentManager.a0(1, c23395u.f53186g);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            c23395u.toString();
        }
        C23395u c23395u4 = (C23395u) C42745f0.K(iIndexOf - 1, value);
        if (c23395u4 != null) {
            k(this, c23395u4.f53186g, 6);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            C23395u c23395u5 = (C23395u) obj;
            if (!C43033p.c(new o0(new C42770s0(this.f53142g), C1875i.f53153l), c23395u5.f53186g)) {
                if (!L.f(c23395u5.f53186g, c23395u2.f53186g)) {
                }
            }
            arrayList.add(obj);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k(this, ((C23395u) it.next()).f53186g, 4);
        }
        b().e(c23395u, z12);
    }

    @Override // androidx.view.AbstractC23301M0
    @k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this);
    }

    public final H n(C23395u c23395u, C23280B0 c23280b0) {
        c cVar = (c) c23395u.f53182c;
        Bundle bundleA = c23395u.a();
        String str = cVar.f53146l;
        if (str == null) {
            throw new IllegalStateException("Fragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f53138c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        FragmentManager fragmentManager = this.f53139d;
        Fragment fragmentB = fragmentManager.O().b(context.getClassLoader(), str);
        fragmentB.setArguments(bundleA);
        H hE2 = fragmentManager.e();
        int i12 = c23280b0 != null ? c23280b0.f52747f : -1;
        int i13 = c23280b0 != null ? c23280b0.f52748g : -1;
        int i14 = c23280b0 != null ? c23280b0.f52749h : -1;
        int i15 = c23280b0 != null ? c23280b0.f52750i : -1;
        if (i12 != -1 || i13 != -1 || i14 != -1 || i15 != -1) {
            if (i12 == -1) {
                i12 = 0;
            }
            if (i13 == -1) {
                i13 = 0;
            }
            if (i14 == -1) {
                i14 = 0;
            }
            hE2.o(i12, i13, i14, i15 != -1 ? i15 : 0);
        }
        hE2.n(this.f53140e, fragmentB, c23395u.f53186g);
        hE2.q(fragmentB);
        hE2.f46457p = true;
        return hE2;
    }

    /* compiled from: FragmentNavigator.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/navigation/fragment/i$h", "Landroidx/fragment/app/FragmentManager$p;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class h implements FragmentManager.p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC23307P0 f53151a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f53152b;

        public h(AbstractC23307P0 abstractC23307P0, i iVar) {
            this.f53151a = abstractC23307P0;
            this.f53152b = iVar;
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public final void b(@k Fragment fragment, boolean z12) {
            C23395u c23395uPrevious;
            if (z12) {
                AbstractC23307P0 abstractC23307P0 = this.f53151a;
                List<C23395u> value = abstractC23307P0.f52865e.getValue();
                ListIterator<C23395u> listIterator = value.listIterator(value.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        c23395uPrevious = null;
                        break;
                    } else {
                        c23395uPrevious = listIterator.previous();
                        if (L.f(c23395uPrevious.f53186g, fragment.getTag())) {
                            break;
                        }
                    }
                }
                C23395u c23395u = c23395uPrevious;
                if (Log.isLoggable("FragmentManager", 2)) {
                    fragment.toString();
                    Objects.toString(c23395u);
                }
                if (c23395u != null) {
                    abstractC23307P0.f(c23395u);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.fragment.app.FragmentManager.p
        public final void c(@k Fragment fragment, boolean z12) {
            Object obj;
            Object objPrevious;
            AbstractC23307P0 abstractC23307P0 = this.f53151a;
            ArrayList arrayListH0 = C42745f0.h0(abstractC23307P0.f52866f.getValue(), abstractC23307P0.f52865e.getValue());
            ListIterator listIterator = arrayListH0.listIterator(arrayListH0.size());
            while (true) {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (L.f(((C23395u) objPrevious).f53186g, fragment.getTag())) {
                        break;
                    }
                }
            }
            C23395u c23395u = (C23395u) objPrevious;
            i iVar = this.f53152b;
            boolean z13 = z12 && iVar.f53142g.isEmpty() && fragment.isRemoving();
            Iterator it = iVar.f53142g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (L.f(((Q) next).f406619b, fragment.getTag())) {
                    obj = next;
                    break;
                }
            }
            Q q12 = (Q) obj;
            if (q12 != null) {
                iVar.f53142g.remove(q12);
            }
            if (!z13 && Log.isLoggable("FragmentManager", 2)) {
                fragment.toString();
                Objects.toString(c23395u);
            }
            boolean z14 = q12 != null && ((Boolean) q12.f406620c).booleanValue();
            if (!z12 && !z14 && c23395u == null) {
                throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.m("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            }
            if (c23395u != null) {
                i.l(fragment, c23395u, abstractC23307P0);
                if (z13) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragment.toString();
                        c23395u.toString();
                    }
                    abstractC23307P0.e(c23395u, false);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.p
        public final void a() {
        }
    }
}
