package androidx.view.fragment;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.view.AbstractC23301M0;
import androidx.view.AbstractC23307P0;
import androidx.view.C23280B0;
import androidx.view.C23317W;
import androidx.view.C23395u;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23373j;
import androidx.view.Lifecycle;
import androidx.view.fragment.p;
import j.InterfaceC42153i;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;

/* compiled from: DialogFragmentNavigator.kt */
@AbstractC23301M0.b("dialog")
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/b;", "Landroidx/navigation/M0;", "Landroidx/navigation/fragment/b$b;", "a", "b", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b extends AbstractC23301M0<C1874b> {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f53126h = 0;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Context f53127c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final FragmentManager f53128d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LinkedHashSet f53129e = new LinkedHashSet();

    /* renamed from: f, reason: collision with root package name */
    @k
    public final c f53130f = new c();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinkedHashMap f53131g = new LinkedHashMap();

    /* compiled from: DialogFragmentNavigator.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/fragment/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DialogFragmentNavigator.kt */
    @C23317W.a
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/navigation/fragment/b$b;", "Landroidx/navigation/W;", "Landroidx/navigation/j;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.fragment.b$b, reason: collision with other inner class name */
    public static class C1874b extends C23317W implements InterfaceC23373j {

        /* renamed from: l, reason: collision with root package name */
        @l
        public String f53132l;

        public C1874b() {
            throw null;
        }

        @Override // androidx.view.C23317W
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof C1874b)) {
                return false;
            }
            return super.equals(obj) && L.f(this.f53132l, ((C1874b) obj).f53132l);
        }

        @Override // androidx.view.C23317W
        public final int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f53132l;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @Override // androidx.view.C23317W
        @InterfaceC42153i
        public final void l(@k Context context, @k AttributeSet attributeSet) {
            super.l(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, p.d.f53161a);
            String string = typedArrayObtainAttributes.getString(0);
            if (string != null) {
                this.f53132l = string;
            }
            typedArrayObtainAttributes.recycle();
        }
    }

    /* compiled from: DialogFragmentNavigator.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/navigation/fragment/b$c", "Landroidx/lifecycle/L;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements InterfaceC22979L {

        /* compiled from: DialogFragmentNavigator.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f53134a;

            static {
                int[] iArr = new int[Lifecycle.Event.values().length];
                try {
                    iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f53134a = iArr;
            }
        }

        public c() {
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
            int iNextIndex;
            int i12 = a.f53134a[event.ordinal()];
            b bVar = b.this;
            if (i12 == 1) {
                DialogFragment dialogFragment = (DialogFragment) interfaceC22983P;
                int i13 = b.f53126h;
                List<C23395u> value = bVar.b().f52865e.getValue();
                if (!(value instanceof Collection) || !value.isEmpty()) {
                    Iterator<T> it = value.iterator();
                    while (it.hasNext()) {
                        if (L.f(((C23395u) it.next()).f53186g, dialogFragment.getTag())) {
                            return;
                        }
                    }
                }
                dialogFragment.dismiss();
                return;
            }
            Object obj = null;
            if (i12 == 2) {
                DialogFragment dialogFragment2 = (DialogFragment) interfaceC22983P;
                int i14 = b.f53126h;
                for (Object obj2 : bVar.b().f52866f.getValue()) {
                    if (L.f(((C23395u) obj2).f53186g, dialogFragment2.getTag())) {
                        obj = obj2;
                    }
                }
                C23395u c23395u = (C23395u) obj;
                if (c23395u != null) {
                    bVar.b().b(c23395u);
                    return;
                }
                return;
            }
            if (i12 != 3) {
                if (i12 != 4) {
                    return;
                }
                DialogFragment dialogFragment3 = (DialogFragment) interfaceC22983P;
                int i15 = b.f53126h;
                for (Object obj3 : bVar.b().f52866f.getValue()) {
                    if (L.f(((C23395u) obj3).f53186g, dialogFragment3.getTag())) {
                        obj = obj3;
                    }
                }
                C23395u c23395u2 = (C23395u) obj;
                if (c23395u2 != null) {
                    bVar.b().b(c23395u2);
                }
                dialogFragment3.getLifecycle().c(this);
                return;
            }
            DialogFragment dialogFragment4 = (DialogFragment) interfaceC22983P;
            if (dialogFragment4.requireDialog().isShowing()) {
                return;
            }
            int i16 = b.f53126h;
            List<C23395u> value2 = bVar.b().f52865e.getValue();
            ListIterator<C23395u> listIterator = value2.listIterator(value2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (L.f(listIterator.previous().f53186g, dialogFragment4.getTag())) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                } else {
                    iNextIndex = -1;
                    break;
                }
            }
            C23395u c23395u3 = (C23395u) C42745f0.K(iNextIndex, value2);
            if (!L.f(C42745f0.S(value2), c23395u3)) {
                dialogFragment4.toString();
            }
            if (c23395u3 != null) {
                bVar.l(iNextIndex, c23395u3, false);
            }
        }
    }

    static {
        new a(null);
    }

    public b(@k Context context, @k FragmentManager fragmentManager) {
        this.f53127c = context;
        this.f53128d = fragmentManager;
    }

    @Override // androidx.view.AbstractC23301M0
    public final C23317W a() {
        return new C1874b(this);
    }

    @Override // androidx.view.AbstractC23301M0
    public final void d(@k List<C23395u> list, @l C23280B0 c23280b0, @l AbstractC23301M0.a aVar) {
        FragmentManager fragmentManager = this.f53128d;
        if (fragmentManager.V()) {
            return;
        }
        for (C23395u c23395u : list) {
            k(c23395u).show(fragmentManager, c23395u.f53186g);
            C23395u c23395u2 = (C23395u) C42745f0.S(b().f52865e.getValue());
            boolean zR2 = C42745f0.r(b().f52866f.getValue(), c23395u2);
            b().h(c23395u);
            if (c23395u2 != null && !zR2) {
                b().b(c23395u2);
            }
        }
    }

    @Override // androidx.view.AbstractC23301M0
    public final void e(@k AbstractC23307P0 abstractC23307P0) {
        Lifecycle lifecycle;
        super.e(abstractC23307P0);
        Iterator<C23395u> it = abstractC23307P0.f52865e.getValue().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            FragmentManager fragmentManager = this.f53128d;
            if (!zHasNext) {
                fragmentManager.f46377o.add(new androidx.view.fragment.a(this, 0));
                return;
            }
            C23395u next = it.next();
            DialogFragment dialogFragment = (DialogFragment) fragmentManager.H(next.f53186g);
            if (dialogFragment == null || (lifecycle = dialogFragment.getLifecycle()) == null) {
                this.f53129e.add(next.f53186g);
            } else {
                lifecycle.a(this.f53130f);
            }
        }
    }

    @Override // androidx.view.AbstractC23301M0
    public final void f(@k C23395u c23395u) {
        FragmentManager fragmentManager = this.f53128d;
        if (fragmentManager.V()) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f53131g;
        String str = c23395u.f53186g;
        DialogFragment dialogFragment = (DialogFragment) linkedHashMap.get(str);
        if (dialogFragment == null) {
            Fragment fragmentH = fragmentManager.H(str);
            dialogFragment = fragmentH instanceof DialogFragment ? (DialogFragment) fragmentH : null;
        }
        if (dialogFragment != null) {
            dialogFragment.getLifecycle().c(this.f53130f);
            dialogFragment.dismiss();
        }
        k(c23395u).show(fragmentManager, str);
        AbstractC23307P0 abstractC23307P0B = b();
        List<C23395u> value = abstractC23307P0B.f52865e.getValue();
        ListIterator<C23395u> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            C23395u c23395uPrevious = listIterator.previous();
            if (L.f(c23395uPrevious.f53186g, str)) {
                Z1<Set<C23395u>> z12 = abstractC23307P0B.f52863c;
                z12.setValue(b1.i(b1.i(z12.getValue(), c23395uPrevious), c23395u));
                abstractC23307P0B.c(c23395u);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // androidx.view.AbstractC23301M0
    public final void i(@k C23395u c23395u, boolean z12) {
        FragmentManager fragmentManager = this.f53128d;
        if (fragmentManager.V()) {
            return;
        }
        List<C23395u> value = b().f52865e.getValue();
        int iIndexOf = value.indexOf(c23395u);
        Iterator it = C42745f0.q0(value.subList(iIndexOf, value.size())).iterator();
        while (it.hasNext()) {
            Fragment fragmentH = fragmentManager.H(((C23395u) it.next()).f53186g);
            if (fragmentH != null) {
                ((DialogFragment) fragmentH).dismiss();
            }
        }
        l(iIndexOf, c23395u, z12);
    }

    public final DialogFragment k(C23395u c23395u) {
        C1874b c1874b = (C1874b) c23395u.f53182c;
        String str = c1874b.f53132l;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set");
        }
        char cCharAt = str.charAt(0);
        Context context = this.f53127c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        Fragment fragmentB = this.f53128d.O().b(context.getClassLoader(), str);
        if (DialogFragment.class.isAssignableFrom(fragmentB.getClass())) {
            DialogFragment dialogFragment = (DialogFragment) fragmentB;
            dialogFragment.setArguments(c23395u.a());
            dialogFragment.getLifecycle().a(this.f53130f);
            this.f53131g.put(c23395u.f53186g, dialogFragment);
            return dialogFragment;
        }
        StringBuilder sb2 = new StringBuilder("Dialog destination ");
        String str2 = c1874b.f53132l;
        if (str2 != null) {
            throw new IllegalArgumentException(AK.c.s(sb2, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set");
    }

    public final void l(int i12, C23395u c23395u, boolean z12) {
        C23395u c23395u2 = (C23395u) C42745f0.K(i12 - 1, b().f52865e.getValue());
        boolean zR2 = C42745f0.r(b().f52866f.getValue(), c23395u2);
        b().e(c23395u, z12);
        if (c23395u2 == null || zR2) {
            return;
        }
        b().b(c23395u2);
    }
}
