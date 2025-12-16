package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.os.C22778f;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.fragment.app.SpecialEffectsController;
import com.avito.android.R;
import j.InterfaceC42153i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SpecialEffectsController.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController;", "", "a", "b", "Operation", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f46500f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f46501a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f46502b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ArrayList f46503c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f46504d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46505e;

    /* compiled from: SpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$a;", "", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$b;", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends Operation {

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final E f46523h;

        public b(@Y61.k Operation.State state, @Y61.k Operation.LifecycleImpact lifecycleImpact, @Y61.k E e12, @Y61.k C22778f c22778f) {
            super(state, lifecycleImpact, e12.f46294c, c22778f);
            this.f46523h = e12;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void b() {
            super.b();
            this.f46523h.i();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        public final void d() {
            Operation.LifecycleImpact lifecycleImpact = this.f46507b;
            Operation.LifecycleImpact lifecycleImpact2 = Operation.LifecycleImpact.f46514c;
            E e12 = this.f46523h;
            if (lifecycleImpact != lifecycleImpact2) {
                if (lifecycleImpact == Operation.LifecycleImpact.f46515d) {
                    Fragment fragment = e12.f46294c;
                    View viewRequireView = fragment.requireView();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(viewRequireView.findFocus());
                        viewRequireView.toString();
                        fragment.toString();
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = e12.f46294c;
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (Log.isLoggable("FragmentManager", 2)) {
                    viewFindFocus.toString();
                    fragment2.toString();
                }
            }
            View viewRequireView2 = this.f46508c.requireView();
            if (viewRequireView2.getParent() == null) {
                e12.a();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46524a;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f46524a = iArr;
        }
    }

    public SpecialEffectsController(@Y61.k ViewGroup viewGroup) {
        this.f46501a = viewGroup;
    }

    @X41.n
    @Y61.k
    public static final SpecialEffectsController f(@Y61.k ViewGroup viewGroup, @Y61.k FragmentManager fragmentManager) {
        f46500f.getClass();
        n0 n0VarQ = fragmentManager.Q();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        C22949g c22949gA = n0VarQ.a(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c22949gA);
        return c22949gA;
    }

    public final void a(Operation.State state, Operation.LifecycleImpact lifecycleImpact, E e12) {
        synchronized (this.f46502b) {
            C22778f c22778f = new C22778f();
            Operation operationD = d(e12.f46294c);
            if (operationD != null) {
                operationD.c(state, lifecycleImpact);
                return;
            }
            final b bVar = new b(state, lifecycleImpact, e12, c22778f);
            this.f46502b.add(bVar);
            final int i12 = 0;
            bVar.f46509d.add(new Runnable(this) { // from class: androidx.fragment.app.m0

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ SpecialEffectsController f46572c;

                {
                    this.f46572c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            ArrayList arrayList = this.f46572c.f46502b;
                            SpecialEffectsController.b bVar2 = bVar;
                            if (arrayList.contains(bVar2)) {
                                bVar2.f46506a.a(bVar2.f46508c.mView);
                                break;
                            }
                            break;
                        default:
                            SpecialEffectsController specialEffectsController = this.f46572c;
                            ArrayList arrayList2 = specialEffectsController.f46502b;
                            SpecialEffectsController.b bVar3 = bVar;
                            arrayList2.remove(bVar3);
                            specialEffectsController.f46503c.remove(bVar3);
                            break;
                    }
                }
            });
            final int i13 = 1;
            bVar.f46509d.add(new Runnable(this) { // from class: androidx.fragment.app.m0

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ SpecialEffectsController f46572c;

                {
                    this.f46572c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            ArrayList arrayList = this.f46572c.f46502b;
                            SpecialEffectsController.b bVar2 = bVar;
                            if (arrayList.contains(bVar2)) {
                                bVar2.f46506a.a(bVar2.f46508c.mView);
                                break;
                            }
                            break;
                        default:
                            SpecialEffectsController specialEffectsController = this.f46572c;
                            ArrayList arrayList2 = specialEffectsController.f46502b;
                            SpecialEffectsController.b bVar3 = bVar;
                            arrayList2.remove(bVar3);
                            specialEffectsController.f46503c.remove(bVar3);
                            break;
                    }
                }
            });
            G0 g02 = G0.f406611a;
        }
    }

    public abstract void b(@Y61.k ArrayList arrayList, boolean z12);

    public final void c() {
        if (this.f46505e) {
            return;
        }
        ViewGroup viewGroup = this.f46501a;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.f46504d = false;
            return;
        }
        synchronized (this.f46502b) {
            try {
                if (!this.f46502b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f46503c);
                    this.f46503c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Operation operation = (Operation) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(operation);
                        }
                        operation.a();
                        if (!operation.f46512g) {
                            this.f46503c.add(operation);
                        }
                    }
                    h();
                    ArrayList arrayList2 = new ArrayList(this.f46502b);
                    this.f46502b.clear();
                    this.f46503c.addAll(arrayList2);
                    Log.isLoggable("FragmentManager", 2);
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((Operation) it2.next()).d();
                    }
                    b(arrayList2, this.f46504d);
                    this.f46504d = false;
                    Log.isLoggable("FragmentManager", 2);
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Operation d(Fragment fragment) {
        Object next;
        Iterator it = this.f46502b.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Operation operation = (Operation) next;
            if (kotlin.jvm.internal.L.f(operation.f46508c, fragment) && !operation.f46511f) {
                break;
            }
        }
        return (Operation) next;
    }

    public final void e() {
        Log.isLoggable("FragmentManager", 2);
        ViewGroup viewGroup = this.f46501a;
        WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f46502b) {
            try {
                h();
                Iterator it = this.f46502b.iterator();
                while (it.hasNext()) {
                    ((Operation) it.next()).d();
                }
                Iterator it2 = new ArrayList(this.f46503c).iterator();
                while (it2.hasNext()) {
                    Operation operation = (Operation) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f46501a);
                        }
                        Objects.toString(operation);
                    }
                    operation.a();
                }
                Iterator it3 = new ArrayList(this.f46502b).iterator();
                while (it3.hasNext()) {
                    Operation operation2 = (Operation) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.f46501a);
                        }
                        Objects.toString(operation2);
                    }
                    operation2.a();
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        Object objPrevious;
        synchronized (this.f46502b) {
            try {
                h();
                ArrayList arrayList = this.f46502b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    Operation operation = (Operation) objPrevious;
                    Operation.State.a aVar = Operation.State.f46517b;
                    View view = operation.f46508c.mView;
                    aVar.getClass();
                    Operation.State stateA = Operation.State.a.a(view);
                    Operation.State state = operation.f46506a;
                    Operation.State state2 = Operation.State.f46519d;
                    if (state == state2 && stateA != state2) {
                        break;
                    }
                }
                Operation operation2 = (Operation) objPrevious;
                Fragment fragment = operation2 != null ? operation2.f46508c : null;
                this.f46505e = fragment != null ? fragment.isPostponed() : false;
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        Iterator it = this.f46502b.iterator();
        while (it.hasNext()) {
            Operation operation = (Operation) it.next();
            if (operation.f46507b == Operation.LifecycleImpact.f46514c) {
                View viewRequireView = operation.f46508c.requireView();
                Operation.State.a aVar = Operation.State.f46517b;
                int visibility = viewRequireView.getVisibility();
                aVar.getClass();
                operation.c(Operation.State.a.b(visibility), Operation.LifecycleImpact.f46513b);
            }
        }
    }

    /* compiled from: SpecialEffectsController.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation;", "", "LifecycleImpact", "State", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class Operation {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public State f46506a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public LifecycleImpact f46507b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Fragment f46508c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final ArrayList f46509d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final LinkedHashSet f46510e = new LinkedHashSet();

        /* renamed from: f, reason: collision with root package name */
        public boolean f46511f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f46512g;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SpecialEffectsController.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$LifecycleImpact;", "", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class LifecycleImpact {

            /* renamed from: b, reason: collision with root package name */
            public static final LifecycleImpact f46513b;

            /* renamed from: c, reason: collision with root package name */
            public static final LifecycleImpact f46514c;

            /* renamed from: d, reason: collision with root package name */
            public static final LifecycleImpact f46515d;

            /* renamed from: e, reason: collision with root package name */
            public static final /* synthetic */ LifecycleImpact[] f46516e;

            static {
                LifecycleImpact lifecycleImpact = new LifecycleImpact("NONE", 0);
                f46513b = lifecycleImpact;
                LifecycleImpact lifecycleImpact2 = new LifecycleImpact("ADDING", 1);
                f46514c = lifecycleImpact2;
                LifecycleImpact lifecycleImpact3 = new LifecycleImpact("REMOVING", 2);
                f46515d = lifecycleImpact3;
                f46516e = new LifecycleImpact[]{lifecycleImpact, lifecycleImpact2, lifecycleImpact3};
            }

            public LifecycleImpact() {
                throw null;
            }

            public static LifecycleImpact valueOf(String str) {
                return (LifecycleImpact) Enum.valueOf(LifecycleImpact.class, str);
            }

            public static LifecycleImpact[] values() {
                return (LifecycleImpact[]) f46516e.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SpecialEffectsController.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State;", "", "a", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class State {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f46517b;

            /* renamed from: c, reason: collision with root package name */
            public static final State f46518c;

            /* renamed from: d, reason: collision with root package name */
            public static final State f46519d;

            /* renamed from: e, reason: collision with root package name */
            public static final State f46520e;

            /* renamed from: f, reason: collision with root package name */
            public static final State f46521f;

            /* renamed from: g, reason: collision with root package name */
            public static final /* synthetic */ State[] f46522g;

            /* compiled from: SpecialEffectsController.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/fragment/app/SpecialEffectsController$Operation$State$a;", "", "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(C42822w c42822w) {
                    this();
                }

                @Y61.k
                public static State a(@Y61.k View view) {
                    return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? State.f46521f : b(view.getVisibility());
                }

                @X41.n
                @Y61.k
                public static State b(int i12) {
                    if (i12 == 0) {
                        return State.f46519d;
                    }
                    if (i12 == 4) {
                        return State.f46521f;
                    }
                    if (i12 == 8) {
                        return State.f46520e;
                    }
                    throw new IllegalArgumentException(AK.c.g(i12, "Unknown visibility "));
                }

                public a() {
                }
            }

            /* compiled from: SpecialEffectsController.kt */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public /* synthetic */ class b {
                static {
                    int[] iArr = new int[State.values().length];
                    try {
                        iArr[0] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        a aVar = State.f46517b;
                        iArr[1] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        a aVar2 = State.f46517b;
                        iArr[2] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        a aVar3 = State.f46517b;
                        iArr[3] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                }
            }

            static {
                State state = new State("REMOVED", 0);
                f46518c = state;
                State state2 = new State("VISIBLE", 1);
                f46519d = state2;
                State state3 = new State("GONE", 2);
                f46520e = state3;
                State state4 = new State("INVISIBLE", 3);
                f46521f = state4;
                f46522g = new State[]{state, state2, state3, state4};
                f46517b = new a(null);
            }

            public State() {
                throw null;
            }

            public static State valueOf(String str) {
                return (State) Enum.valueOf(State.class, str);
            }

            public static State[] values() {
                return (State[]) f46522g.clone();
            }

            public final void a(@Y61.k View view) {
                int iOrdinal = ordinal();
                if (iOrdinal == 0) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (iOrdinal == 1) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        view.toString();
                    }
                    view.setVisibility(0);
                } else if (iOrdinal == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        view.toString();
                    }
                    view.setVisibility(8);
                } else {
                    if (iOrdinal != 3) {
                        return;
                    }
                    if (Log.isLoggable("FragmentManager", 2)) {
                        view.toString();
                    }
                    view.setVisibility(4);
                }
            }
        }

        /* compiled from: SpecialEffectsController.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[LifecycleImpact.values().length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[0] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        public Operation(@Y61.k State state, @Y61.k LifecycleImpact lifecycleImpact, @Y61.k Fragment fragment, @Y61.k C22778f c22778f) {
            this.f46506a = state;
            this.f46507b = lifecycleImpact;
            this.f46508c = fragment;
            c22778f.c(new Ae0.c(this, 10));
        }

        public final void a() {
            if (this.f46511f) {
                return;
            }
            this.f46511f = true;
            LinkedHashSet linkedHashSet = this.f46510e;
            if (linkedHashSet.isEmpty()) {
                b();
                return;
            }
            Iterator it = C42745f0.O0(linkedHashSet).iterator();
            while (it.hasNext()) {
                ((C22778f) it.next()).a();
            }
        }

        @InterfaceC42153i
        public void b() {
            if (this.f46512g) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.f46512g = true;
            Iterator it = this.f46509d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(@Y61.k State state, @Y61.k LifecycleImpact lifecycleImpact) {
            int iOrdinal = lifecycleImpact.ordinal();
            Fragment fragment = this.f46508c;
            if (iOrdinal == 0) {
                if (this.f46506a != State.f46518c) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(fragment);
                        Objects.toString(this.f46506a);
                        state.toString();
                    }
                    this.f46506a = state;
                    return;
                }
                return;
            }
            if (iOrdinal == 1) {
                if (this.f46506a == State.f46518c) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(fragment);
                        Objects.toString(this.f46507b);
                    }
                    this.f46506a = State.f46519d;
                    this.f46507b = LifecycleImpact.f46514c;
                    return;
                }
                return;
            }
            if (iOrdinal != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(fragment);
                Objects.toString(this.f46506a);
                Objects.toString(this.f46507b);
            }
            this.f46506a = State.f46518c;
            this.f46507b = LifecycleImpact.f46515d;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sbA = androidx.appcompat.app.r.A("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
            sbA.append(this.f46506a);
            sbA.append(" lifecycleImpact = ");
            sbA.append(this.f46507b);
            sbA.append(" fragment = ");
            sbA.append(this.f46508c);
            sbA.append('}');
            return sbA.toString();
        }

        public void d() {
        }
    }
}
