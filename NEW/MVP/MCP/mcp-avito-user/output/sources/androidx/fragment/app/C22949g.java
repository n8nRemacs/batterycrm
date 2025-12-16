package androidx.fragment.app;

import Fc1.G3;
import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.transition.Transition;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.C20199a;
import androidx.core.os.C22778f;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.fragment.app.C22956n;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: DefaultSpecialEffectsController.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/g;", "Landroidx/fragment/app/SpecialEffectsController;", "a", "b", "c", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22949g extends SpecialEffectsController {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f46547g = 0;

    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/g$a;", "Landroidx/fragment/app/g$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.g$a */
    public static final class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f46548c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f46549d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public C22956n.a f46550e;

        public a(@Y61.k SpecialEffectsController.Operation operation, @Y61.k C22778f c22778f, boolean z12) {
            super(operation, c22778f);
            this.f46548c = z12;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.fragment.app.C22956n.a c(@Y61.k android.content.Context r9) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C22949g.a.c(android.content.Context):androidx.fragment.app.n$a");
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/g$b;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.g$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final SpecialEffectsController.Operation f46551a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final C22778f f46552b;

        public b(@Y61.k SpecialEffectsController.Operation operation, @Y61.k C22778f c22778f) {
            this.f46551a = operation;
            this.f46552b = c22778f;
        }

        public final void a() {
            SpecialEffectsController.Operation operation = this.f46551a;
            LinkedHashSet linkedHashSet = operation.f46510e;
            if (linkedHashSet.remove(this.f46552b) && linkedHashSet.isEmpty()) {
                operation.b();
            }
        }

        public final boolean b() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State.a aVar = SpecialEffectsController.Operation.State.f46517b;
            SpecialEffectsController.Operation operation = this.f46551a;
            View view = operation.f46508c.mView;
            aVar.getClass();
            SpecialEffectsController.Operation.State stateA = SpecialEffectsController.Operation.State.a.a(view);
            SpecialEffectsController.Operation.State state2 = operation.f46506a;
            return stateA == state2 || !(stateA == (state = SpecialEffectsController.Operation.State.f46519d) || state2 == state);
        }
    }

    /* compiled from: DefaultSpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/g$c;", "Landroidx/fragment/app/g$b;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.fragment.app.g$c */
    public static final class c extends b {

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Object f46553c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f46554d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final Object f46555e;

        public c(@Y61.k SpecialEffectsController.Operation operation, @Y61.k C22778f c22778f, boolean z12, boolean z13) {
            super(operation, c22778f);
            SpecialEffectsController.Operation.State state = operation.f46506a;
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.f46519d;
            Fragment fragment = operation.f46508c;
            this.f46553c = state == state2 ? z12 ? fragment.getReenterTransition() : fragment.getEnterTransition() : z12 ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.f46554d = operation.f46506a == state2 ? z12 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() : true;
            this.f46555e = z13 ? z12 ? fragment.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition() : null;
        }

        @Y61.l
        public final O c() {
            Object obj = this.f46553c;
            O oD2 = d(obj);
            Object obj2 = this.f46555e;
            O oD3 = d(obj2);
            if (oD2 == null || oD3 == null || oD2 == oD3) {
                return oD2 == null ? oD3 : oD2;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + this.f46551a.f46508c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2).toString());
        }

        public final O d(Object obj) {
            if (obj == null) {
                return null;
            }
            O o12 = J.f46467a;
            if (o12 != null && (obj instanceof Transition)) {
                return o12;
            }
            O o13 = J.f46468b;
            if (o13 != null && o13.e(obj)) {
                return o13;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f46551a.f46508c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public static void i(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if (childAt.getVisibility() == 0) {
                i(childAt, arrayList);
            }
        }
    }

    public static void j(C20199a c20199a, View view) {
        String strP = C22823h0.p(view);
        if (strP != null) {
            c20199a.put(strP, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = viewGroup.getChildAt(i12);
                if (childAt.getVisibility() == 0) {
                    j(c20199a, childAt);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // androidx.fragment.app.SpecialEffectsController
    public final void b(@Y61.k ArrayList arrayList, final boolean z12) throws Resources.NotFoundException {
        Object next;
        SpecialEffectsController.Operation operationPrevious;
        ArrayList arrayList2;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap;
        ViewGroup viewGroup;
        SpecialEffectsController.Operation operation;
        String str;
        SpecialEffectsController.Operation operation2;
        boolean z13;
        boolean z14;
        SpecialEffectsController.Operation operation3;
        SpecialEffectsController.Operation operation4;
        String str2;
        String str3;
        View view;
        View view2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        LinkedHashMap linkedHashMap2;
        ViewGroup viewGroup2;
        Rect rect;
        O o12;
        ArrayList<String> arrayList6;
        Object obj;
        View view3;
        String strB;
        final C22949g c22949g;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            SpecialEffectsController.Operation operation5 = (SpecialEffectsController.Operation) next;
            SpecialEffectsController.Operation.State.a aVar = SpecialEffectsController.Operation.State.f46517b;
            View view4 = operation5.f46508c.mView;
            aVar.getClass();
            SpecialEffectsController.Operation.State stateA = SpecialEffectsController.Operation.State.a.a(view4);
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.f46519d;
            if (stateA == state && operation5.f46506a != state) {
                break;
            }
        }
        final SpecialEffectsController.Operation operation6 = (SpecialEffectsController.Operation) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                operationPrevious = 0;
                break;
            }
            operationPrevious = listIterator.previous();
            SpecialEffectsController.Operation operation7 = (SpecialEffectsController.Operation) operationPrevious;
            SpecialEffectsController.Operation.State.a aVar2 = SpecialEffectsController.Operation.State.f46517b;
            View view5 = operation7.f46508c.mView;
            aVar2.getClass();
            SpecialEffectsController.Operation.State stateA2 = SpecialEffectsController.Operation.State.a.a(view5);
            SpecialEffectsController.Operation.State state2 = SpecialEffectsController.Operation.State.f46519d;
            if (stateA2 != state2 && operation7.f46506a == state2) {
                break;
            }
        }
        final SpecialEffectsController.Operation operation8 = operationPrevious;
        String str4 = "FragmentManager";
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(operation6);
            Objects.toString(operation8);
        }
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList(arrayList);
        Fragment fragment = ((SpecialEffectsController.Operation) C42745f0.Q(arrayList)).f46508c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Fragment.k kVar = ((SpecialEffectsController.Operation) it2.next()).f46508c.mAnimationInfo;
            Fragment.k kVar2 = fragment.mAnimationInfo;
            kVar.f46323b = kVar2.f46323b;
            kVar.f46324c = kVar2.f46324c;
            kVar.f46325d = kVar2.f46325d;
            kVar.f46326e = kVar2.f46326e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            SpecialEffectsController.Operation operation9 = (SpecialEffectsController.Operation) it3.next();
            C22778f c22778f = new C22778f();
            operation9.d();
            LinkedHashSet linkedHashSet = operation9.f46510e;
            linkedHashSet.add(c22778f);
            arrayList7.add(new a(operation9, c22778f, z12));
            C22778f c22778f2 = new C22778f();
            operation9.d();
            linkedHashSet.add(c22778f2);
            arrayList8.add(new c(operation9, c22778f2, z12, !z12 ? operation9 != operation8 : operation9 != operation6));
            operation9.f46509d.add(new RunnableC22944b(arrayList9, operation9, this));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        ArrayList arrayList10 = new ArrayList();
        Iterator it4 = arrayList8.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (!((c) next2).b()) {
                arrayList10.add(next2);
            }
        }
        ArrayList arrayList11 = new ArrayList();
        Iterator it5 = arrayList10.iterator();
        while (it5.hasNext()) {
            Object next3 = it5.next();
            if (((c) next3).c() != null) {
                arrayList11.add(next3);
            }
        }
        Iterator it6 = arrayList11.iterator();
        O o13 = null;
        while (it6.hasNext()) {
            c cVar = (c) it6.next();
            O oC2 = cVar.c();
            if (o13 != null && oC2 != o13) {
                StringBuilder sb2 = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb2.append(cVar.f46551a.f46508c);
                sb2.append(" returned Transition ");
                throw new IllegalArgumentException(androidx.appcompat.app.r.o(cVar.f46553c, " which uses a different Transition type than other Fragments.", sb2).toString());
            }
            o13 = oC2;
        }
        ViewGroup viewGroup3 = this.f46501a;
        if (o13 == null) {
            Iterator it7 = arrayList8.iterator();
            while (it7.hasNext()) {
                c cVar2 = (c) it7.next();
                linkedHashMap3.put(cVar2.f46551a, Boolean.FALSE);
                cVar2.a();
            }
            arrayList2 = arrayList7;
            operation2 = operation6;
            operation = operation8;
            arrayList3 = arrayList9;
            linkedHashMap = linkedHashMap3;
            viewGroup = viewGroup3;
            z13 = true;
            z14 = false;
            str = "FragmentManager";
        } else {
            View view6 = new View(viewGroup3.getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList12 = new ArrayList<>();
            ArrayList<View> arrayList13 = new ArrayList<>();
            C20199a c20199a = new C20199a();
            Iterator it8 = arrayList8.iterator();
            arrayList2 = arrayList7;
            Object obj2 = null;
            View view7 = null;
            boolean z15 = false;
            while (it8.hasNext()) {
                View view8 = view7;
                Object obj3 = ((c) it8.next()).f46555e;
                if (obj3 == null || operation6 == null || operation8 == null) {
                    arrayList4 = arrayList8;
                    arrayList5 = arrayList9;
                    linkedHashMap2 = linkedHashMap3;
                    viewGroup2 = viewGroup3;
                    rect = rect2;
                    o12 = o13;
                    viewGroup3 = viewGroup2;
                    linkedHashMap3 = linkedHashMap2;
                    o13 = o12;
                    view7 = view8;
                    arrayList9 = arrayList5;
                    rect2 = rect;
                    arrayList8 = arrayList4;
                } else {
                    Object objR = o13.r(o13.f(obj3));
                    Fragment fragment2 = operation8.f46508c;
                    arrayList5 = arrayList9;
                    ArrayList<String> sharedElementSourceNames = fragment2.getSharedElementSourceNames();
                    arrayList4 = arrayList8;
                    Fragment fragment3 = operation6.f46508c;
                    LinkedHashMap linkedHashMap4 = linkedHashMap3;
                    ArrayList<String> sharedElementSourceNames2 = fragment3.getSharedElementSourceNames();
                    View view9 = view6;
                    ArrayList<String> sharedElementTargetNames = fragment3.getSharedElementTargetNames();
                    Rect rect3 = rect2;
                    int size = sharedElementTargetNames.size();
                    int i12 = 0;
                    while (i12 < size) {
                        int i13 = size;
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i12));
                        ArrayList<String> arrayList14 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i12));
                        }
                        i12++;
                        size = i13;
                        sharedElementTargetNames = arrayList14;
                    }
                    ArrayList<String> sharedElementTargetNames2 = fragment2.getSharedElementTargetNames();
                    kotlin.Q q12 = !z12 ? new kotlin.Q(fragment3.getExitTransitionCallback(), fragment2.getEnterTransitionCallback()) : new kotlin.Q(fragment3.getEnterTransitionCallback(), fragment2.getExitTransitionCallback());
                    androidx.core.app.P p12 = (androidx.core.app.P) q12.f406619b;
                    androidx.core.app.P p13 = (androidx.core.app.P) q12.f406620c;
                    int size2 = sharedElementSourceNames.size();
                    O o14 = o13;
                    int i14 = 0;
                    while (i14 < size2) {
                        c20199a.put(sharedElementSourceNames.get(i14), sharedElementTargetNames2.get(i14));
                        i14++;
                        size2 = size2;
                        viewGroup3 = viewGroup3;
                    }
                    ViewGroup viewGroup4 = viewGroup3;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Iterator<String> it9 = sharedElementTargetNames2.iterator();
                        while (it9.hasNext()) {
                            it9.next();
                        }
                        Iterator<String> it10 = sharedElementSourceNames.iterator();
                        while (it10.hasNext()) {
                            it10.next();
                        }
                    }
                    C20199a c20199a2 = new C20199a();
                    j(c20199a2, fragment3.mView);
                    c20199a2.n(sharedElementSourceNames);
                    if (p12 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            operation6.toString();
                        }
                        int size3 = sharedElementSourceNames.size() - 1;
                        if (size3 >= 0) {
                            while (true) {
                                int i15 = size3 - 1;
                                String str5 = sharedElementSourceNames.get(size3);
                                View view10 = (View) c20199a2.get(str5);
                                if (view10 == null) {
                                    c20199a.remove(str5);
                                    arrayList6 = sharedElementSourceNames;
                                } else {
                                    arrayList6 = sharedElementSourceNames;
                                    if (!kotlin.jvm.internal.L.f(str5, C22823h0.p(view10))) {
                                        c20199a.put(C22823h0.p(view10), (String) c20199a.remove(str5));
                                    }
                                }
                                if (i15 < 0) {
                                    break;
                                }
                                size3 = i15;
                                sharedElementSourceNames = arrayList6;
                            }
                        } else {
                            arrayList6 = sharedElementSourceNames;
                        }
                    } else {
                        arrayList6 = sharedElementSourceNames;
                        c20199a.n(c20199a2.keySet());
                    }
                    final C20199a c20199a3 = new C20199a();
                    j(c20199a3, fragment2.mView);
                    c20199a3.n(sharedElementTargetNames2);
                    c20199a3.n(c20199a.values());
                    if (p13 != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            operation8.toString();
                        }
                        int size4 = sharedElementTargetNames2.size() - 1;
                        if (size4 >= 0) {
                            while (true) {
                                int i16 = size4 - 1;
                                String str6 = sharedElementTargetNames2.get(size4);
                                View view11 = (View) c20199a3.get(str6);
                                if (view11 == null) {
                                    String strB2 = J.b(c20199a, str6);
                                    if (strB2 != null) {
                                        c20199a.remove(strB2);
                                    }
                                } else if (!kotlin.jvm.internal.L.f(str6, C22823h0.p(view11)) && (strB = J.b(c20199a, str6)) != null) {
                                    c20199a.put(strB, C22823h0.p(view11));
                                }
                                if (i16 < 0) {
                                    break;
                                } else {
                                    size4 = i16;
                                }
                            }
                        }
                    } else {
                        O o15 = J.f46467a;
                        for (int i17 = c20199a.f25790d - 1; -1 < i17; i17--) {
                            if (!c20199a3.containsKey((String) c20199a.k(i17))) {
                                c20199a.h(i17);
                            }
                        }
                    }
                    C42745f0.p0(c20199a2.entrySet(), new C22950h(c20199a.keySet()));
                    C42745f0.p0(c20199a3.entrySet(), new C22950h(c20199a.values()));
                    if (c20199a.isEmpty()) {
                        arrayList12.clear();
                        arrayList13.clear();
                        view7 = view8;
                        arrayList9 = arrayList5;
                        arrayList8 = arrayList4;
                        linkedHashMap3 = linkedHashMap4;
                        view6 = view9;
                        rect2 = rect3;
                        o13 = o14;
                        viewGroup3 = viewGroup4;
                        obj2 = null;
                    } else {
                        J.a(fragment2, fragment3, z12, c20199a2);
                        viewGroup2 = viewGroup4;
                        androidx.core.view.P.b(viewGroup2, new Runnable() { // from class: androidx.fragment.app.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i18 = C22949g.f46547g;
                                SpecialEffectsController.Operation operation10 = operation8;
                                SpecialEffectsController.Operation operation11 = operation6;
                                J.a(operation10.f46508c, operation11.f46508c, z12, c20199a3);
                            }
                        });
                        arrayList12.addAll(c20199a2.values());
                        if (arrayList6.isEmpty()) {
                            obj = objR;
                            o12 = o14;
                        } else {
                            View view12 = (View) c20199a2.get(arrayList6.get(0));
                            obj = objR;
                            o12 = o14;
                            o12.m(view12, obj);
                            view8 = view12;
                        }
                        arrayList13.addAll(c20199a3.values());
                        if (sharedElementTargetNames2.isEmpty() || (view3 = (View) c20199a3.get(sharedElementTargetNames2.get(0))) == null) {
                            rect = rect3;
                            view6 = view9;
                        } else {
                            rect = rect3;
                            androidx.core.view.P.b(viewGroup2, new RunnableC22948f(o12, view3, rect));
                            view6 = view9;
                            z15 = true;
                        }
                        o12.p(obj, view6, arrayList12);
                        o12.l(obj, null, null, obj, arrayList13);
                        Boolean bool = Boolean.TRUE;
                        linkedHashMap2 = linkedHashMap4;
                        linkedHashMap2.put(operation6, bool);
                        linkedHashMap2.put(operation8, bool);
                        obj2 = obj;
                        viewGroup3 = viewGroup2;
                        linkedHashMap3 = linkedHashMap2;
                        o13 = o12;
                        view7 = view8;
                        arrayList9 = arrayList5;
                        rect2 = rect;
                        arrayList8 = arrayList4;
                    }
                }
            }
            ArrayList arrayList15 = arrayList8;
            View view13 = view7;
            arrayList3 = arrayList9;
            linkedHashMap = linkedHashMap3;
            viewGroup = viewGroup3;
            Rect rect4 = rect2;
            O o16 = o13;
            ArrayList arrayList16 = new ArrayList();
            Iterator it11 = arrayList15.iterator();
            Object objJ = null;
            Object objJ2 = null;
            while (it11.hasNext()) {
                Iterator it12 = it11;
                c cVar3 = (c) it11.next();
                boolean zB2 = cVar3.b();
                C20199a c20199a4 = c20199a;
                SpecialEffectsController.Operation operation10 = cVar3.f46551a;
                if (zB2) {
                    str3 = str4;
                    linkedHashMap.put(operation10, Boolean.FALSE);
                    cVar3.a();
                } else {
                    str3 = str4;
                    Object objF = o16.f(cVar3.f46553c);
                    boolean z16 = obj2 != null && (operation10 == operation6 || operation10 == operation8);
                    if (objF != null) {
                        SpecialEffectsController.Operation operation11 = operation8;
                        ArrayList arrayList17 = new ArrayList();
                        Object obj4 = obj2;
                        Fragment fragment4 = operation10.f46508c;
                        Object obj5 = objJ2;
                        i(fragment4.mView, arrayList17);
                        if (z16) {
                            if (operation10 == operation6) {
                                arrayList17.removeAll(C42745f0.P0(arrayList12));
                            } else {
                                arrayList17.removeAll(C42745f0.P0(arrayList13));
                            }
                        }
                        if (arrayList17.isEmpty()) {
                            o16.a(view6, objF);
                            view = view6;
                        } else {
                            o16.b(arrayList17, objF);
                            o16.l(objF, objF, arrayList17, null, null);
                            view = view6;
                            if (operation10.f46506a == SpecialEffectsController.Operation.State.f46520e) {
                                arrayList3.remove(operation10);
                                ArrayList<View> arrayList18 = new ArrayList<>(arrayList17);
                                arrayList18.remove(fragment4.mView);
                                o16.k(objF, fragment4.mView, arrayList18);
                                androidx.core.view.P.b(viewGroup, new G3(arrayList17, 10));
                            }
                        }
                        if (operation10.f46506a == SpecialEffectsController.Operation.State.f46519d) {
                            arrayList16.addAll(arrayList17);
                            if (z15) {
                                o16.n(objF, rect4);
                            }
                            view2 = view13;
                        } else {
                            view2 = view13;
                            o16.m(view2, objF);
                        }
                        linkedHashMap.put(operation10, Boolean.TRUE);
                        if (cVar3.f46554d) {
                            objJ = o16.j(objJ, objF);
                            it11 = it12;
                            view13 = view2;
                            view6 = view;
                            c20199a = c20199a4;
                            str4 = str3;
                            operation8 = operation11;
                            obj2 = obj4;
                            objJ2 = obj5;
                        } else {
                            objJ2 = o16.j(obj5, objF);
                            it11 = it12;
                            view13 = view2;
                            view6 = view;
                            c20199a = c20199a4;
                            str4 = str3;
                            operation8 = operation11;
                            obj2 = obj4;
                        }
                    } else if (!z16) {
                        linkedHashMap.put(operation10, Boolean.FALSE);
                        cVar3.a();
                    }
                }
                it11 = it12;
                c20199a = c20199a4;
                str4 = str3;
            }
            C20199a c20199a5 = c20199a;
            operation = operation8;
            String str7 = str4;
            Object objI = o16.i(objJ, objJ2, obj2);
            if (objI == null) {
                operation2 = operation6;
                str = str7;
            } else {
                ArrayList arrayList19 = new ArrayList();
                Iterator it13 = arrayList15.iterator();
                while (it13.hasNext()) {
                    Object next4 = it13.next();
                    if (!((c) next4).b()) {
                        arrayList19.add(next4);
                    }
                }
                Iterator it14 = arrayList19.iterator();
                while (it14.hasNext()) {
                    c cVar4 = (c) it14.next();
                    Object obj6 = cVar4.f46553c;
                    SpecialEffectsController.Operation operation12 = cVar4.f46551a;
                    SpecialEffectsController.Operation operation13 = operation;
                    boolean z17 = obj2 != null && (operation12 == operation6 || operation12 == operation13);
                    if (obj6 != null || z17) {
                        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                        if (viewGroup.isLaidOut()) {
                            str2 = str7;
                            o16.o(objI, cVar4.f46552b, new RunnableC22948f(cVar4, operation12));
                        } else {
                            str2 = str7;
                            if (Log.isLoggable(str2, 2)) {
                                Objects.toString(viewGroup);
                                Objects.toString(operation12);
                            }
                            cVar4.a();
                        }
                    } else {
                        str2 = str7;
                    }
                    operation = operation13;
                    str7 = str2;
                }
                str = str7;
                SpecialEffectsController.Operation operation14 = operation;
                WeakHashMap<View, A0> weakHashMap2 = C22823h0.f45055a;
                if (viewGroup.isLaidOut()) {
                    J.c(4, arrayList16);
                    ArrayList arrayList20 = new ArrayList();
                    int size5 = arrayList13.size();
                    for (int i18 = 0; i18 < size5; i18++) {
                        View view14 = arrayList13.get(i18);
                        arrayList20.add(C22823h0.p(view14));
                        C22823h0.P(view14, null);
                    }
                    if (Log.isLoggable(str, 2)) {
                        Iterator<View> it15 = arrayList12.iterator();
                        while (it15.hasNext()) {
                            View next5 = it15.next();
                            next5.toString();
                            C22823h0.p(next5);
                        }
                        Iterator<View> it16 = arrayList13.iterator();
                        while (it16.hasNext()) {
                            View next6 = it16.next();
                            next6.toString();
                            C22823h0.p(next6);
                        }
                    }
                    o16.c(viewGroup, objI);
                    int size6 = arrayList13.size();
                    ArrayList arrayList21 = new ArrayList();
                    int i19 = 0;
                    while (i19 < size6) {
                        View view15 = arrayList12.get(i19);
                        String strP = C22823h0.p(view15);
                        arrayList21.add(strP);
                        if (strP == null) {
                            operation4 = operation6;
                            operation3 = operation14;
                        } else {
                            operation3 = operation14;
                            C22823h0.P(view15, null);
                            String str8 = (String) c20199a5.get(strP);
                            int i22 = 0;
                            while (true) {
                                operation4 = operation6;
                                if (i22 >= size6) {
                                    break;
                                }
                                if (str8.equals(arrayList20.get(i22))) {
                                    C22823h0.P(arrayList13.get(i22), strP);
                                    break;
                                } else {
                                    i22++;
                                    operation6 = operation4;
                                }
                            }
                        }
                        i19++;
                        operation6 = operation4;
                        operation14 = operation3;
                    }
                    operation2 = operation6;
                    operation = operation14;
                    z13 = true;
                    androidx.core.view.P.b(viewGroup, new N(size6, arrayList13, arrayList20, arrayList12, arrayList21));
                    z14 = false;
                    J.c(0, arrayList16);
                    o16.q(obj2, arrayList12, arrayList13);
                } else {
                    operation2 = operation6;
                    operation = operation14;
                }
            }
            z13 = true;
            z14 = false;
        }
        boolean zContainsValue = linkedHashMap.containsValue(Boolean.TRUE);
        Context context = viewGroup.getContext();
        ArrayList arrayList22 = new ArrayList();
        Iterator it17 = arrayList2.iterator();
        boolean z18 = z14;
        while (it17.hasNext()) {
            a aVar3 = (a) it17.next();
            if (aVar3.b()) {
                aVar3.a();
            } else {
                C22956n.a aVarC = aVar3.c(context);
                if (aVarC == null) {
                    aVar3.a();
                } else {
                    final Animator animator = aVarC.f46575b;
                    if (animator == null) {
                        arrayList22.add(aVar3);
                    } else {
                        final SpecialEffectsController.Operation operation15 = aVar3.f46551a;
                        boolean zF2 = kotlin.jvm.internal.L.f(linkedHashMap.get(operation15), Boolean.TRUE);
                        Fragment fragment5 = operation15.f46508c;
                        if (zF2) {
                            if (Log.isLoggable(str, 2)) {
                                Objects.toString(fragment5);
                            }
                            aVar3.a();
                        } else {
                            boolean z19 = operation15.f46506a == SpecialEffectsController.Operation.State.f46520e ? z13 : z14;
                            ArrayList arrayList23 = arrayList3;
                            if (z19) {
                                arrayList23.remove(operation15);
                            }
                            View view16 = fragment5.mView;
                            viewGroup.startViewTransition(view16);
                            animator.addListener(new C22951i(this, view16, z19, operation15, aVar3));
                            animator.setTarget(view16);
                            animator.start();
                            if (Log.isLoggable(str, 2)) {
                                operation15.toString();
                            }
                            aVar3.f46552b.c(new C22778f.a() { // from class: androidx.fragment.app.c
                                @Override // androidx.core.os.C22778f.a
                                public final void onCancel() {
                                    int i23 = C22949g.f46547g;
                                    animator.end();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        operation15.toString();
                                    }
                                }
                            });
                            arrayList3 = arrayList23;
                            z18 = true;
                            z13 = true;
                        }
                    }
                }
            }
        }
        ArrayList arrayList24 = arrayList3;
        Iterator it18 = arrayList22.iterator();
        while (it18.hasNext()) {
            final a aVar4 = (a) it18.next();
            final SpecialEffectsController.Operation operation16 = aVar4.f46551a;
            Fragment fragment6 = operation16.f46508c;
            if (zContainsValue) {
                if (Log.isLoggable(str, 2)) {
                    Objects.toString(fragment6);
                }
                aVar4.a();
            } else if (z18) {
                if (Log.isLoggable(str, 2)) {
                    Objects.toString(fragment6);
                }
                aVar4.a();
            } else {
                final View view17 = fragment6.mView;
                C22956n.a aVarC2 = aVar4.c(context);
                if (aVarC2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = aVarC2.f46574a;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (operation16.f46506a != SpecialEffectsController.Operation.State.f46518c) {
                    view17.startAnimation(animation);
                    aVar4.a();
                    c22949g = this;
                } else {
                    viewGroup.startViewTransition(view17);
                    C22956n.b bVar = new C22956n.b(animation, viewGroup, view17);
                    c22949g = this;
                    bVar.setAnimationListener(new AnimationAnimationListenerC22952j(view17, aVar4, c22949g, operation16));
                    view17.startAnimation(bVar);
                    if (Log.isLoggable(str, 2)) {
                        operation16.toString();
                    }
                }
                aVar4.f46552b.c(new C22778f.a() { // from class: androidx.fragment.app.d
                    @Override // androidx.core.os.C22778f.a
                    public final void onCancel() {
                        int i23 = C22949g.f46547g;
                        View view18 = view17;
                        view18.clearAnimation();
                        c22949g.f46501a.endViewTransition(view18);
                        aVar4.a();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            operation16.toString();
                        }
                    }
                });
            }
        }
        Iterator it19 = arrayList24.iterator();
        while (it19.hasNext()) {
            SpecialEffectsController.Operation operation17 = (SpecialEffectsController.Operation) it19.next();
            operation17.f46506a.a(operation17.f46508c.mView);
        }
        arrayList24.clear();
        if (Log.isLoggable(str, 2)) {
            Objects.toString(operation2);
            Objects.toString(operation);
        }
    }
}
