package androidx.view;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.G;
import androidx.core.os.C22777e;
import androidx.view.C23306P;
import androidx.view.C23315U;
import androidx.view.C23317W;
import androidx.view.C23324b0;
import androidx.view.C23395u;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.S0;
import androidx.view.x;
import j.D;
import j.InterfaceC42153i;
import j.K;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42754k;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42809i;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.v0;
import kotlin.sequences.C43033p;
import kotlin.sequences.m0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.flow.p2;

/* compiled from: NavController.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/v;", "", "a", "b", "c", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.navigation.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C23397v {

    /* renamed from: G, reason: collision with root package name */
    public static final boolean f53198G;

    /* renamed from: A, reason: collision with root package name */
    @k
    public final LinkedHashMap f53199A;

    /* renamed from: B, reason: collision with root package name */
    public int f53200B;

    /* renamed from: C, reason: collision with root package name */
    @k
    public final ArrayList f53201C;

    /* renamed from: D, reason: collision with root package name */
    @k
    public final InterfaceC42726C f53202D;

    /* renamed from: E, reason: collision with root package name */
    @k
    public final e2 f53203E;

    /* renamed from: F, reason: collision with root package name */
    @k
    public final InterfaceC43160i<C23395u> f53204F;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f53205a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Activity f53206b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public C23324b0 f53207c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Bundle f53208d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Parcelable[] f53209e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f53210f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C42754k<C23395u> f53211g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Z1<List<C23395u>> f53212h;

    /* renamed from: i, reason: collision with root package name */
    @k
    @RestrictTo
    public final n2<List<C23395u>> f53213i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Z1<List<C23395u>> f53214j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final n2<List<C23395u>> f53215k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final LinkedHashMap f53216l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final LinkedHashMap f53217m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final LinkedHashMap f53218n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final LinkedHashMap f53219o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public InterfaceC22983P f53220p;

    /* renamed from: q, reason: collision with root package name */
    @l
    public C23300M f53221q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final CopyOnWriteArrayList<c> f53222r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public Lifecycle.State f53223s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final M11.d f53224t;

    /* renamed from: u, reason: collision with root package name */
    @k
    public final f f53225u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f53226v;

    /* renamed from: w, reason: collision with root package name */
    @k
    public final C23303N0 f53227w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final LinkedHashMap f53228x;

    /* renamed from: y, reason: collision with root package name */
    @l
    public N f53229y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public Y41.l<? super C23395u, G0> f53230z;

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/navigation/v$a;", "", "<init>", "()V", "", "KEY_BACK_STACK", "Ljava/lang/String;", "KEY_BACK_STACK_DEST_IDS", "KEY_BACK_STACK_IDS", "KEY_BACK_STACK_STATES_IDS", "KEY_BACK_STACK_STATES_PREFIX", "KEY_DEEP_LINK_ARGS", "KEY_DEEP_LINK_HANDLED", "KEY_DEEP_LINK_IDS", "KEY_DEEP_LINK_INTENT", "KEY_NAVIGATOR_STATE", "KEY_NAVIGATOR_STATE_NAMES", "TAG", "", "deepLinkSaveState", "Z", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.v$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: NavController.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/v$b;", "Landroidx/navigation/P0;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.v$b */
    public final class b extends AbstractC23307P0 {

        /* renamed from: g, reason: collision with root package name */
        @k
        public final AbstractC23301M0<? extends C23317W> f53231g;

        /* compiled from: NavController.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.navigation.v$b$a */
        public static final class a extends N implements Y41.a<G0> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ C23395u f53234m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ boolean f53235n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C23395u c23395u, boolean z12) {
                super(0);
                this.f53234m = c23395u;
                this.f53235n = z12;
            }

            @Override // Y41.a
            public final G0 invoke() {
                b.super.d(this.f53234m, this.f53235n);
                return G0.f406611a;
            }
        }

        public b(@k AbstractC23301M0<? extends C23317W> abstractC23301M0) {
            this.f53231g = abstractC23301M0;
        }

        @Override // androidx.view.AbstractC23307P0
        @k
        public final C23395u a(@k C23317W c23317w, @l Bundle bundle) {
            C23395u.a aVar = C23395u.f53180p;
            C23397v c23397v = C23397v.this;
            return C23395u.a.a(aVar, c23397v.f53205a, c23317w, bundle, c23397v.j(), c23397v.f53221q);
        }

        @Override // androidx.view.AbstractC23307P0
        public final void b(@k C23395u c23395u) {
            C23300M c23300m;
            S0 s02;
            C23397v c23397v = C23397v.this;
            boolean zF2 = L.f(c23397v.f53199A.get(c23395u), Boolean.TRUE);
            super.b(c23395u);
            c23397v.f53199A.remove(c23395u);
            C42754k<C23395u> c42754k = c23397v.f53211g;
            boolean zContains = c42754k.contains(c23395u);
            Z1<List<C23395u>> z12 = c23397v.f53214j;
            if (zContains) {
                if (this.f52864d) {
                    return;
                }
                c23397v.A();
                c23397v.f53212h.K5(new ArrayList(c42754k));
                z12.K5(c23397v.u());
                return;
            }
            c23397v.z(c23395u);
            if (c23395u.f53188i.f46705d.a(Lifecycle.State.f46681d)) {
                c23395u.b(Lifecycle.State.f46679b);
            }
            String str = c23395u.f53186g;
            if (c42754k == null || !c42754k.isEmpty()) {
                Iterator<C23395u> it = c42754k.iterator();
                while (it.hasNext()) {
                    if (L.f(it.next().f53186g, str)) {
                        break;
                    }
                }
                if (!zF2 && (c23300m = c23397v.f53221q) != null && (s02 = (S0) c23300m.f52806E.remove(str)) != null) {
                    s02.a();
                }
            } else if (!zF2) {
                s02.a();
            }
            c23397v.A();
            z12.K5(c23397v.u());
        }

        @Override // androidx.view.AbstractC23307P0
        public final void d(@k C23395u c23395u, boolean z12) {
            C23397v c23397v = C23397v.this;
            AbstractC23301M0 abstractC23301M0B = c23397v.f53227w.b(c23395u.f53182c.f52879b);
            if (!abstractC23301M0B.equals(this.f53231g)) {
                ((b) c23397v.f53228x.get(abstractC23301M0B)).d(c23395u, z12);
                return;
            }
            Y41.l<? super C23395u, G0> lVar = c23397v.f53230z;
            if (lVar != null) {
                ((C23401x) lVar).invoke(c23395u);
                super.d(c23395u, z12);
                return;
            }
            a aVar = new a(c23395u, z12);
            C42754k<C23395u> c42754k = c23397v.f53211g;
            int iIndexOf = c42754k.indexOf(c23395u);
            if (iIndexOf < 0) {
                c23395u.toString();
                return;
            }
            int i12 = iIndexOf + 1;
            if (i12 != c42754k.f406741d) {
                c23397v.q(c42754k.get(i12).f53182c.f52886i, true, false);
            }
            C23397v.t(c23397v, c23395u);
            aVar.invoke();
            c23397v.B();
            c23397v.b();
        }

        @Override // androidx.view.AbstractC23307P0
        public final void e(@k C23395u c23395u, boolean z12) {
            super.e(c23395u, z12);
            C23397v.this.f53199A.put(c23395u, Boolean.valueOf(z12));
        }

        @Override // androidx.view.AbstractC23307P0
        public final void f(@k C23395u c23395u) {
            super.f(c23395u);
            if (!C23397v.this.f53211g.contains(c23395u)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            c23395u.b(Lifecycle.State.f46682e);
        }

        /* JADX WARN: Type inference failed for: r0v6, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.AbstractC23307P0
        public final void g(@k C23395u c23395u) {
            C23397v c23397v = C23397v.this;
            AbstractC23301M0 abstractC23301M0B = c23397v.f53227w.b(c23395u.f53182c.f52879b);
            if (!abstractC23301M0B.equals(this.f53231g)) {
                Object obj = c23397v.f53228x.get(abstractC23301M0B);
                if (obj == null) {
                    throw new IllegalStateException(AK.c.s(new StringBuilder("NavigatorBackStack for "), c23395u.f53182c.f52879b, " should already be created").toString());
                }
                ((b) obj).g(c23395u);
                return;
            }
            ?? r02 = c23397v.f53229y;
            if (r02 == 0) {
                Objects.toString(c23395u.f53182c);
            } else {
                r02.invoke(c23395u);
                super.g(c23395u);
            }
        }

        public final void j(@k C23395u c23395u) {
            super.g(c23395u);
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/navigation/v$c;", "", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.v$c */
    public interface c {
        void a(@k C23317W c23317w, @l Bundle bundle);
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Context;", "it", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.v$d */
    public static final class d extends N implements Y41.l<Context, Context> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f53236l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Context invoke(Context context) {
            Context context2 = context;
            if (context2 instanceof ContextWrapper) {
                return ((ContextWrapper) context2).getBaseContext();
            }
            return null;
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/navigation/A0;", "invoke", "()Landroidx/navigation/A0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.navigation.v$e */
    public static final class e extends N implements Y41.a<C23278A0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final C23278A0 invoke() {
            boolean z12 = C23397v.f53198G;
            C23397v c23397v = C23397v.this;
            c23397v.getClass();
            return new C23278A0(c23397v.f53205a, c23397v.f53227w);
        }
    }

    /* compiled from: NavController.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/navigation/v$f", "Landroidx/activity/x;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.navigation.v$f */
    public static final class f extends x {
        public f() {
            super(false);
        }

        @Override // androidx.view.x
        public final void c() {
            C23397v.this.p();
        }
    }

    static {
        new a(null);
        f53198G = true;
    }

    public C23397v(@k Context context) {
        Object next;
        this.f53205a = context;
        Iterator it = C43033p.u(d.f53236l, context).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f53206b = (Activity) next;
        this.f53211g = new C42754k<>();
        C42784z0 c42784z0 = C42784z0.f406748b;
        Z1<List<C23395u>> z1A = p2.a(c42784z0);
        this.f53212h = z1A;
        this.f53213i = C43175k.b(z1A);
        Z1<List<C23395u>> z1A2 = p2.a(c42784z0);
        this.f53214j = z1A2;
        this.f53215k = C43175k.b(z1A2);
        this.f53216l = new LinkedHashMap();
        this.f53217m = new LinkedHashMap();
        this.f53218n = new LinkedHashMap();
        this.f53219o = new LinkedHashMap();
        this.f53222r = new CopyOnWriteArrayList<>();
        this.f53223s = Lifecycle.State.f46680c;
        this.f53224t = new M11.d(this, 2);
        this.f53225u = new f();
        this.f53226v = true;
        C23303N0 c23303n0 = new C23303N0();
        this.f53227w = c23303n0;
        this.f53228x = new LinkedHashMap();
        this.f53199A = new LinkedHashMap();
        c23303n0.a(new C23366f0(c23303n0));
        c23303n0.a(new C23363e(this.f53205a));
        this.f53201C = new ArrayList();
        this.f53202D = C42727D.c(new e());
        e2 e2VarB = f2.b(1, 0, BufferOverflow.f410778c, 2);
        this.f53203E = e2VarB;
        this.f53204F = C43175k.a(e2VarB);
    }

    public static C23317W e(C23317W c23317w, @D int i12) {
        if (c23317w.f52886i == i12) {
            return c23317w;
        }
        return (c23317w instanceof C23324b0 ? (C23324b0) c23317w : c23317w.f52880c).y(i12, true);
    }

    public static void n(C23397v c23397v, String str, C23280B0 c23280b0, int i12) {
        C42822w c42822w = null;
        if ((i12 & 2) != 0) {
            c23280b0 = null;
        }
        c23397v.getClass();
        C23315U.a.C1868a c1868a = C23315U.a.f52877a;
        C23317W.f52878k.getClass();
        Uri uri = Uri.parse(C23317W.b.a(str));
        c1868a.getClass();
        new C23315U.a(c42822w);
        c23397v.l(new C23315U(uri, null, null), c23280b0);
    }

    public static /* synthetic */ void t(C23397v c23397v, C23395u c23395u) {
        c23397v.s(c23395u, false, new C42754k<>());
    }

    public final void A() {
        AtomicInteger atomicInteger;
        n2<Set<C23395u>> n2Var;
        Set<C23395u> value;
        ArrayList arrayList = new ArrayList(this.f53211g);
        if (arrayList.isEmpty()) {
            return;
        }
        C23317W c23317w = ((C23395u) C42745f0.Q(arrayList)).f53182c;
        ArrayList arrayList2 = new ArrayList();
        if (c23317w instanceof InterfaceC23373j) {
            Iterator it = C42745f0.q0(arrayList).iterator();
            while (it.hasNext()) {
                C23317W c23317w2 = ((C23395u) it.next()).f53182c;
                arrayList2.add(c23317w2);
                if (!(c23317w2 instanceof InterfaceC23373j) && !(c23317w2 instanceof C23324b0)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (C23395u c23395u : C42745f0.q0(arrayList)) {
            Lifecycle.State state = c23395u.f53193n;
            C23317W c23317w3 = c23395u.f53182c;
            Lifecycle.State state2 = Lifecycle.State.f46683f;
            Lifecycle.State state3 = Lifecycle.State.f46682e;
            if (c23317w != null && c23317w3.f52886i == c23317w.f52886i) {
                if (state != state2) {
                    b bVar = (b) this.f53228x.get(this.f53227w.b(c23317w3.f52879b));
                    if (L.f((bVar == null || (n2Var = bVar.f52866f) == null || (value = n2Var.getValue()) == null) ? null : Boolean.valueOf(value.contains(c23395u)), Boolean.TRUE) || ((atomicInteger = (AtomicInteger) this.f53217m.get(c23395u)) != null && atomicInteger.get() == 0)) {
                        map.put(c23395u, state3);
                    } else {
                        map.put(c23395u, state2);
                    }
                }
                C23317W c23317w4 = (C23317W) C42745f0.G(arrayList2);
                if (c23317w4 != null && c23317w4.f52886i == c23317w3.f52886i) {
                    C42745f0.m0(arrayList2);
                }
                c23317w = c23317w.f52880c;
            } else if (arrayList2.isEmpty() || c23317w3.f52886i != ((C23317W) C42745f0.E(arrayList2)).f52886i) {
                c23395u.b(Lifecycle.State.f46681d);
            } else {
                C23317W c23317w5 = (C23317W) C42745f0.m0(arrayList2);
                if (state == state2) {
                    c23395u.b(state3);
                } else if (state != state3) {
                    map.put(c23395u, state3);
                }
                C23324b0 c23324b0 = c23317w5.f52880c;
                if (c23324b0 != null && !arrayList2.contains(c23324b0)) {
                    arrayList2.add(c23324b0);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C23395u c23395u2 = (C23395u) it2.next();
            Lifecycle.State state4 = (Lifecycle.State) map.get(c23395u2);
            if (state4 != null) {
                c23395u2.b(state4);
            } else {
                c23395u2.c();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r2 = this;
            boolean r0 = r2.f53226v
            if (r0 == 0) goto Lc
            int r0 = r2.i()
            r1 = 1
            if (r0 <= r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            androidx.navigation.v$f r0 = r2.f53225u
            r0.d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.C23397v.B():void");
    }

    public final void a(C23317W c23317w, Bundle bundle, C23395u c23395u, List<C23395u> list) {
        C23395u c23395uPrevious;
        C23324b0 c23324b0;
        C23395u c23395uPrevious2;
        C23317W c23317w2 = c23395u.f53182c;
        boolean z12 = c23317w2 instanceof InterfaceC23373j;
        C42754k<C23395u> c42754k = this.f53211g;
        if (!z12) {
            while (!c42754k.isEmpty() && (c42754k.last().f53182c instanceof InterfaceC23373j) && q(c42754k.last().f53182c.f52886i, true, false)) {
            }
        }
        C42754k c42754k2 = new C42754k();
        C23395u c23395u2 = null;
        if (c23317w instanceof C23324b0) {
            C23317W c23317w3 = c23317w2;
            while (true) {
                C23324b0 c23324b02 = c23317w3.f52880c;
                if (c23324b02 != null) {
                    ListIterator<C23395u> listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            c23395uPrevious2 = null;
                            break;
                        } else {
                            c23395uPrevious2 = listIterator.previous();
                            if (L.f(c23395uPrevious2.f53182c, c23324b02)) {
                                break;
                            }
                        }
                    }
                    C23395u c23395uA = c23395uPrevious2;
                    if (c23395uA == null) {
                        c23324b0 = c23324b02;
                        c23395uA = C23395u.a.a(C23395u.f53180p, this.f53205a, c23324b02, bundle, j(), this.f53221q);
                    } else {
                        c23324b0 = c23324b02;
                    }
                    c42754k2.addFirst(c23395uA);
                    if (!c42754k.isEmpty() && c42754k.last().f53182c == c23324b0) {
                        t(this, c42754k.last());
                    }
                } else {
                    c23324b0 = c23324b02;
                }
                if (c23324b0 == null || c23324b0 == c23317w) {
                    break;
                } else {
                    c23317w3 = c23324b0;
                }
            }
        }
        C23317W c23317w4 = c42754k2.isEmpty() ? c23317w2 : ((C23395u) c42754k2.first()).f53182c;
        while (c23317w4 != null && d(c23317w4.f52886i) != c23317w4) {
            c23317w4 = c23317w4.f52880c;
            if (c23317w4 != null) {
                Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                ListIterator<C23395u> listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (!listIterator2.hasPrevious()) {
                        c23395uPrevious = null;
                        break;
                    } else {
                        c23395uPrevious = listIterator2.previous();
                        if (L.f(c23395uPrevious.f53182c, c23317w4)) {
                            break;
                        }
                    }
                }
                C23395u c23395uA2 = c23395uPrevious;
                if (c23395uA2 == null) {
                    c23395uA2 = C23395u.a.a(C23395u.f53180p, this.f53205a, c23317w4, c23317w4.b(bundle2), j(), this.f53221q);
                }
                c42754k2.addFirst(c23395uA2);
            }
        }
        if (!c42754k2.isEmpty()) {
            c23317w2 = ((C23395u) c42754k2.first()).f53182c;
        }
        while (!c42754k.isEmpty() && (c42754k.last().f53182c instanceof C23324b0) && ((C23324b0) c42754k.last().f53182c).y(c23317w2.f52886i, false) == null) {
            t(this, c42754k.last());
        }
        C23395u c23395uE = c42754k.e();
        if (c23395uE == null) {
            c23395uE = (C23395u) c42754k2.e();
        }
        if (!L.f(c23395uE != null ? c23395uE.f53182c : null, this.f53207c)) {
            ListIterator<C23395u> listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                C23395u c23395uPrevious3 = listIterator3.previous();
                if (L.f(c23395uPrevious3.f53182c, this.f53207c)) {
                    c23395u2 = c23395uPrevious3;
                    break;
                }
            }
            C23395u c23395uA3 = c23395u2;
            if (c23395uA3 == null) {
                C23395u.a aVar = C23395u.f53180p;
                C23324b0 c23324b03 = this.f53207c;
                c23395uA3 = C23395u.a.a(aVar, this.f53205a, c23324b03, c23324b03.b(bundle), j(), this.f53221q);
            }
            c42754k2.addFirst(c23395uA3);
        }
        Iterator<E> it = c42754k2.iterator();
        while (it.hasNext()) {
            C23395u c23395u3 = (C23395u) it.next();
            Object obj = this.f53228x.get(this.f53227w.b(c23395u3.f53182c.f52879b));
            if (obj == null) {
                throw new IllegalStateException(AK.c.s(new StringBuilder("NavigatorBackStack for "), c23317w.f52879b, " should already be created").toString());
            }
            ((b) obj).j(c23395u3);
        }
        c42754k.addAll(c42754k2);
        c42754k.addLast(c23395u);
        Iterator it2 = C42745f0.i0(c23395u, c42754k2).iterator();
        while (it2.hasNext()) {
            C23395u c23395u4 = (C23395u) it2.next();
            C23324b0 c23324b04 = c23395u4.f53182c.f52880c;
            if (c23324b04 != null) {
                k(c23395u4, g(c23324b04.f52886i));
            }
        }
    }

    public final boolean b() {
        C42754k<C23395u> c42754k;
        while (true) {
            c42754k = this.f53211g;
            if (c42754k.isEmpty() || !(c42754k.last().f53182c instanceof C23324b0)) {
                break;
            }
            t(this, c42754k.last());
        }
        C23395u c23395uH = c42754k.h();
        ArrayList arrayList = this.f53201C;
        if (c23395uH != null) {
            arrayList.add(c23395uH);
        }
        this.f53200B++;
        A();
        int i12 = this.f53200B - 1;
        this.f53200B = i12;
        if (i12 == 0) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C23395u c23395u = (C23395u) it.next();
                Iterator<c> it2 = this.f53222r.iterator();
                while (it2.hasNext()) {
                    it2.next().a(c23395u.f53182c, c23395u.a());
                }
                this.f53203E.K5(c23395u);
            }
            this.f53212h.K5(new ArrayList(c42754k));
            this.f53214j.K5(u());
        }
        return c23395uH != null;
    }

    public final boolean c(ArrayList arrayList, C23317W c23317w, boolean z12, boolean z13) {
        String str;
        l0.a aVar = new l0.a();
        C42754k c42754k = new C42754k();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC23301M0 abstractC23301M0 = (AbstractC23301M0) it.next();
            l0.a aVar2 = new l0.a();
            C23395u c23395uLast = this.f53211g.last();
            this.f53230z = new C23401x(aVar2, aVar, this, z13, c42754k);
            abstractC23301M0.i(c23395uLast, z13);
            this.f53230z = null;
            if (!aVar2.f406838b) {
                break;
            }
        }
        if (z13) {
            LinkedHashMap linkedHashMap = this.f53218n;
            if (!z12) {
                m0.a aVar3 = new m0.a(new m0(C43033p.u(C23403y.f53245l, c23317w), new C23405z(this)));
                while (aVar3.hasNext()) {
                    Integer numValueOf = Integer.valueOf(((C23317W) aVar3.next()).f52886i);
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) c42754k.e();
                    linkedHashMap.put(numValueOf, navBackStackEntryState != null ? navBackStackEntryState.f52849b : null);
                }
            }
            if (!c42754k.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) c42754k.first();
                m0.a aVar4 = new m0.a(new m0(C43033p.u(C23277A.f52736l, d(navBackStackEntryState2.f52850c)), new C23279B(this)));
                while (true) {
                    boolean zHasNext = aVar4.hasNext();
                    str = navBackStackEntryState2.f52849b;
                    if (!zHasNext) {
                        break;
                    }
                    linkedHashMap.put(Integer.valueOf(((C23317W) aVar4.next()).f52886i), str);
                }
                if (linkedHashMap.values().contains(str)) {
                    this.f53219o.put(str, c42754k);
                }
            }
        }
        B();
        return aVar.f406838b;
    }

    @l
    @RestrictTo
    public final C23317W d(@D int i12) {
        C23317W c23317w;
        C23324b0 c23324b0 = this.f53207c;
        if (c23324b0 == null) {
            return null;
        }
        if (c23324b0.f52886i == i12) {
            return c23324b0;
        }
        C23395u c23395uH = this.f53211g.h();
        if (c23395uH == null || (c23317w = c23395uH.f53182c) == null) {
            c23317w = this.f53207c;
        }
        return e(c23317w, i12);
    }

    @k
    public final C23395u f() {
        C23395u c23395u;
        C42754k<C23395u> c42754k = this.f53211g;
        ListIterator<C23395u> listIterator = c42754k.listIterator(c42754k.getF38308i());
        while (true) {
            c23395u = null;
            if (!listIterator.hasPrevious()) {
                break;
            }
            C23395u c23395uPrevious = listIterator.previous();
            C23395u c23395u2 = c23395uPrevious;
            if (c23395u2.f53182c.g(c23395u2.a(), null)) {
                c23395u = c23395uPrevious;
                break;
            }
        }
        C23395u c23395u3 = c23395u;
        if (c23395u3 != null) {
            return c23395u3;
        }
        throw new IllegalArgumentException(("No destination with route null is on the NavController's back stack. The current destination is " + h()).toString());
    }

    @k
    public final C23395u g(@D int i12) {
        C23395u c23395uPrevious;
        C42754k<C23395u> c42754k = this.f53211g;
        ListIterator<C23395u> listIterator = c42754k.listIterator(c42754k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c23395uPrevious = null;
                break;
            }
            c23395uPrevious = listIterator.previous();
            if (c23395uPrevious.f53182c.f52886i == i12) {
                break;
            }
        }
        C23395u c23395u = c23395uPrevious;
        if (c23395u != null) {
            return c23395u;
        }
        StringBuilder sbJ = G.j(i12, "No destination with ID ", " is on the NavController's back stack. The current destination is ");
        sbJ.append(h());
        throw new IllegalArgumentException(sbJ.toString().toString());
    }

    @l
    public final C23317W h() {
        C23395u c23395uH = this.f53211g.h();
        if (c23395uH != null) {
            return c23395uH.f53182c;
        }
        return null;
    }

    public final int i() {
        int i12 = 0;
        C42754k<C23395u> c42754k = this.f53211g;
        if (c42754k == null || !c42754k.isEmpty()) {
            Iterator<C23395u> it = c42754k.iterator();
            while (it.hasNext()) {
                if (!(it.next().f53182c instanceof C23324b0) && (i12 = i12 + 1) < 0) {
                    C42745f0.G0();
                    throw null;
                }
            }
        }
        return i12;
    }

    @k
    public final Lifecycle.State j() {
        return this.f53220p == null ? Lifecycle.State.f46681d : this.f53223s;
    }

    public final void k(C23395u c23395u, C23395u c23395u2) {
        this.f53216l.put(c23395u, c23395u2);
        LinkedHashMap linkedHashMap = this.f53217m;
        if (linkedHashMap.get(c23395u2) == null) {
            linkedHashMap.put(c23395u2, new AtomicInteger(0));
        }
        ((AtomicInteger) linkedHashMap.get(c23395u2)).incrementAndGet();
    }

    @K
    public final void l(@k C23315U c23315u, @l C23280B0 c23280b0) {
        C23324b0 c23324b0 = this.f53207c;
        if (c23324b0 == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + c23315u + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        C23317W.c cVarH = c23324b0.h(c23315u);
        if (cVarH == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + c23315u + " cannot be found in the navigation graph " + this.f53207c);
        }
        Bundle bundle = cVarH.f52890c;
        C23317W c23317w = cVarH.f52889b;
        Bundle bundleB = c23317w.b(bundle);
        if (bundleB == null) {
            bundleB = new Bundle();
        }
        Intent intent = new Intent();
        intent.setDataAndType(c23315u.f52874a, c23315u.f52876c);
        intent.setAction(c23315u.f52875b);
        bundleB.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        m(c23317w, bundleB, c23280b0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    @j.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(androidx.view.C23317W r18, android.os.Bundle r19, androidx.view.C23280B0 r20, androidx.view.dynamicfeatures.e r21) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.C23397v.m(androidx.navigation.W, android.os.Bundle, androidx.navigation.B0, androidx.navigation.dynamicfeatures.e):void");
    }

    @K
    public final boolean o() {
        Intent intent;
        if (i() != 1) {
            return p();
        }
        Activity activity = this.f53206b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        int i12 = 0;
        if ((extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null) == null) {
            C23317W c23317wH = h();
            int i13 = c23317wH.f52886i;
            for (C23324b0 c23324b0 = c23317wH.f52880c; c23324b0 != null; c23324b0 = c23324b0.f52880c) {
                if (c23324b0.f52905m != i13) {
                    Bundle bundle = new Bundle();
                    if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity.getIntent());
                        C23317W.c cVarH = this.f53207c.h(new C23315U(activity.getIntent()));
                        if ((cVarH != null ? cVarH.f52890c : null) != null) {
                            bundle.putAll(cVarH.f52889b.b(cVarH.f52890c));
                        }
                    }
                    C23306P c23306p = new C23306P(this);
                    int i14 = c23324b0.f52886i;
                    ArrayList arrayList = c23306p.f52857d;
                    arrayList.clear();
                    arrayList.add(new C23306P.a(i14, null));
                    if (c23306p.f52856c != null) {
                        c23306p.c();
                    }
                    c23306p.f52855b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
                    c23306p.a().b();
                    if (activity == null) {
                        return true;
                    }
                    activity.finish();
                    return true;
                }
                i13 = c23324b0.f52886i;
            }
            return false;
        }
        if (this.f53210f) {
            Intent intent2 = activity.getIntent();
            Bundle extras2 = intent2.getExtras();
            ArrayList arrayListH0 = C42756l.h0(extras2.getIntArray("android-support-nav:controller:deepLinkIds"));
            ArrayList parcelableArrayList = extras2.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
            int iIntValue = ((Number) C42745f0.n0(arrayListH0)).intValue();
            if (parcelableArrayList != null) {
            }
            if (!arrayListH0.isEmpty()) {
                C23324b0 c23324b02 = this.f53207c;
                if (c23324b02 == null) {
                    throw new IllegalStateException("You must call setGraph() before calling getGraph()");
                }
                C23317W c23317wE = e(c23324b02, iIntValue);
                if (c23317wE instanceof C23324b0) {
                    C23324b0.f52903p.getClass();
                    iIntValue = C23324b0.a.a((C23324b0) c23317wE).f52886i;
                }
                C23317W c23317wH2 = h();
                if (c23317wH2 != null && iIntValue == c23317wH2.f52886i) {
                    C23306P c23306p2 = new C23306P(this);
                    Bundle bundleB = C22777e.b(new Q("android-support-nav:controller:deepLinkIntent", intent2));
                    Bundle bundle2 = extras2.getBundle("android-support-nav:controller:deepLinkExtras");
                    if (bundle2 != null) {
                        bundleB.putAll(bundle2);
                    }
                    c23306p2.f52855b.putExtra("android-support-nav:controller:deepLinkExtras", bundleB);
                    Iterator it = arrayListH0.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i15 = i12 + 1;
                        if (i12 < 0) {
                            C42745f0.H0();
                            throw null;
                        }
                        c23306p2.f52857d.add(new C23306P.a(((Number) next).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i12) : null));
                        if (c23306p2.f52856c != null) {
                            c23306p2.c();
                        }
                        i12 = i15;
                    }
                    c23306p2.a().b();
                    activity.finish();
                    return true;
                }
            }
        }
        return false;
    }

    @K
    public final boolean p() {
        return !this.f53211g.isEmpty() && q(h().f52886i, true, false) && b();
    }

    @K
    public final boolean q(@D int i12, boolean z12, boolean z13) {
        C23317W c23317w;
        C42754k<C23395u> c42754k = this.f53211g;
        if (c42754k.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C42745f0.q0(c42754k).iterator();
        while (true) {
            if (!it.hasNext()) {
                c23317w = null;
                break;
            }
            c23317w = ((C23395u) it.next()).f53182c;
            AbstractC23301M0 abstractC23301M0B = this.f53227w.b(c23317w.f52879b);
            if (z12 || c23317w.f52886i != i12) {
                arrayList.add(abstractC23301M0B);
            }
            if (c23317w.f52886i == i12) {
                break;
            }
        }
        if (c23317w != null) {
            return c(arrayList, c23317w, z12, z13);
        }
        C23317W.f52878k.getClass();
        C23317W.b.b(i12, this.f53205a);
        return false;
    }

    public final boolean r(String str, boolean z12, boolean z13) {
        C23395u c23395uPrevious;
        C42754k<C23395u> c42754k = this.f53211g;
        if (c42754k.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator<C23395u> listIterator = c42754k.listIterator(c42754k.getF38308i());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c23395uPrevious = null;
                break;
            }
            c23395uPrevious = listIterator.previous();
            C23395u c23395u = c23395uPrevious;
            boolean zG2 = c23395u.f53182c.g(c23395u.a(), str);
            if (z12 || !zG2) {
                arrayList.add(this.f53227w.b(c23395u.f53182c.f52879b));
            }
            if (zG2) {
                break;
            }
        }
        C23395u c23395u2 = c23395uPrevious;
        C23317W c23317w = c23395u2 != null ? c23395u2.f53182c : null;
        if (c23317w == null) {
            return false;
        }
        return c(arrayList, c23317w, z12, z13);
    }

    public final void s(C23395u c23395u, boolean z12, C42754k<NavBackStackEntryState> c42754k) {
        C23300M c23300m;
        S0 s02;
        n2<Set<C23395u>> n2Var;
        Set<C23395u> value;
        C42754k<C23395u> c42754k2 = this.f53211g;
        C23395u c23395uLast = c42754k2.last();
        if (!L.f(c23395uLast, c23395u)) {
            throw new IllegalStateException(("Attempted to pop " + c23395u.f53182c + ", which is not the top of the back stack (" + c23395uLast.f53182c + ')').toString());
        }
        c42754k2.removeLast();
        b bVar = (b) this.f53228x.get(this.f53227w.b(c23395uLast.f53182c.f52879b));
        boolean z13 = true;
        if ((bVar == null || (n2Var = bVar.f52866f) == null || (value = n2Var.getValue()) == null || !value.contains(c23395uLast)) && !this.f53217m.containsKey(c23395uLast)) {
            z13 = false;
        }
        Lifecycle.State state = c23395uLast.f53188i.f46705d;
        Lifecycle.State state2 = Lifecycle.State.f46681d;
        if (state.a(state2)) {
            if (z12) {
                c23395uLast.b(state2);
                c42754k.addFirst(new NavBackStackEntryState(c23395uLast));
            }
            if (z13) {
                c23395uLast.b(state2);
            } else {
                c23395uLast.b(Lifecycle.State.f46679b);
                z(c23395uLast);
            }
        }
        if (z12 || z13 || (c23300m = this.f53221q) == null || (s02 = (S0) c23300m.f52806E.remove(c23395uLast.f53186g)) == null) {
            return;
        }
        s02.a();
    }

    @k
    public final ArrayList u() {
        Lifecycle.State state;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f53228x.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            state = Lifecycle.State.f46682e;
            if (!zHasNext) {
                break;
            }
            Set<C23395u> value = ((b) it.next()).f52866f.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                C23395u c23395u = (C23395u) obj;
                if (!arrayList.contains(c23395u) && !c23395u.f53193n.a(state)) {
                    arrayList2.add(obj);
                }
            }
            C42745f0.h(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<C23395u> it2 = this.f53211g.iterator();
        while (it2.hasNext()) {
            C23395u next = it2.next();
            C23395u c23395u2 = next;
            if (!arrayList.contains(c23395u2) && c23395u2.f53193n.a(state)) {
                arrayList3.add(next);
            }
        }
        C42745f0.h(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            if (!(((C23395u) next2).f53182c instanceof C23324b0)) {
                arrayList4.add(next2);
            }
        }
        return arrayList4;
    }

    @InterfaceC42153i
    public final void v(@l Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f53205a.getClassLoader());
        this.f53208d = bundle.getBundle("android-support-nav:controller:navigatorState");
        this.f53209e = bundle.getParcelableArray("android-support-nav:controller:backStack");
        LinkedHashMap linkedHashMap = this.f53219o;
        linkedHashMap.clear();
        int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                this.f53218n.put(Integer.valueOf(intArray[i12]), stringArrayList.get(i13));
                i12++;
                i13++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
        if (stringArrayList2 != null) {
            for (String str : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                if (parcelableArray != null) {
                    C42754k c42754k = new C42754k(parcelableArray.length);
                    Iterator itA = C42809i.a(parcelableArray);
                    while (itA.hasNext()) {
                        c42754k.addLast((NavBackStackEntryState) ((Parcelable) itA.next()));
                    }
                    linkedHashMap.put(str, c42754k);
                }
            }
        }
        this.f53210f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
    }

    public final boolean w(int i12, Bundle bundle, C23280B0 c23280b0, androidx.view.dynamicfeatures.e eVar) {
        C23317W c23317w;
        C23395u c23395u;
        C23317W c23317w2;
        Bundle bundle2;
        LinkedHashMap linkedHashMap = this.f53218n;
        if (!linkedHashMap.containsKey(Integer.valueOf(i12))) {
            return false;
        }
        String str = (String) linkedHashMap.get(Integer.valueOf(i12));
        C42745f0.k0(linkedHashMap.values(), new C23295J(str));
        C42754k c42754k = (C42754k) v0.c(this.f53219o).remove(str);
        ArrayList arrayList = new ArrayList();
        C23395u c23395uH = this.f53211g.h();
        if ((c23395uH == null || (c23317w = c23395uH.f53182c) == null) && (c23317w = this.f53207c) == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()");
        }
        if (c42754k != null) {
            Iterator<E> it = c42754k.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                C23317W c23317wE = e(c23317w, navBackStackEntryState.f52850c);
                Context context = this.f53205a;
                if (c23317wE == null) {
                    C23317W.f52878k.getClass();
                    throw new IllegalStateException(("Restore State failed: destination " + C23317W.b.b(navBackStackEntryState.f52850c, context) + " cannot be found from the current destination " + c23317w).toString());
                }
                Lifecycle.State stateJ = j();
                C23300M c23300m = this.f53221q;
                Bundle bundle3 = navBackStackEntryState.f52851d;
                if (bundle3 != null) {
                    bundle3.setClassLoader(context.getClassLoader());
                    bundle2 = bundle3;
                } else {
                    bundle2 = null;
                }
                C23395u.f53180p.getClass();
                arrayList.add(new C23395u(context, c23317wE, bundle2, stateJ, c23300m, navBackStackEntryState.f52849b, navBackStackEntryState.f52852e, null));
                c23317w = c23317wE;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!(((C23395u) next).f53182c instanceof C23324b0)) {
                arrayList3.add(next);
            }
        }
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            C23395u c23395u2 = (C23395u) it3.next();
            List list = (List) C42745f0.S(arrayList2);
            if (L.f((list == null || (c23395u = (C23395u) C42745f0.Q(list)) == null || (c23317w2 = c23395u.f53182c) == null) ? null : c23317w2.f52879b, c23395u2.f53182c.f52879b)) {
                list.add(c23395u2);
            } else {
                arrayList2.add(C42745f0.e0(c23395u2));
            }
        }
        l0.a aVar = new l0.a();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            List<C23395u> list2 = (List) it4.next();
            AbstractC23301M0 abstractC23301M0B = this.f53227w.b(((C23395u) C42745f0.E(list2)).f53182c.f52879b);
            this.f53229y = new C23281C(aVar, arrayList, new l0.f(), this, bundle);
            abstractC23301M0B.d(list2, c23280b0, eVar);
            this.f53229y = null;
        }
        return aVar.f406838b;
    }

    @InterfaceC42153i
    @l
    public final Bundle x() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : P0.q(this.f53227w.f52848a).entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleH = ((AbstractC23301M0) entry.getValue()).h();
            if (bundleH != null) {
                arrayList.add(str);
                bundle2.putBundle(str, bundleH);
            }
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        C42754k<C23395u> c42754k = this.f53211g;
        if (!c42754k.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[c42754k.f406741d];
            Iterator<C23395u> it = c42754k.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                parcelableArr[i12] = new NavBackStackEntryState(it.next());
                i12++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = this.f53218n;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i13 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str2 = (String) entry2.getValue();
                iArr[i13] = iIntValue;
                arrayList2.add(str2);
                i13++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = this.f53219o;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str3 = (String) entry3.getKey();
                C42754k c42754k2 = (C42754k) entry3.getValue();
                arrayList3.add(str3);
                Parcelable[] parcelableArr2 = new Parcelable[c42754k2.f406741d];
                Iterator<E> it2 = c42754k2.iterator();
                int i14 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    parcelableArr2[i14] = (NavBackStackEntryState) next;
                    i14 = i15;
                }
                bundle.putParcelableArray(G.f("android-support-nav:controller:backStackStates:", str3), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f53210f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f53210f);
        }
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0224  */
    @j.InterfaceC42153i
    @j.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(@Y61.k androidx.view.C23324b0 r22, @Y61.l android.os.Bundle r23) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.C23397v.y(androidx.navigation.b0, android.os.Bundle):void");
    }

    @l
    public final void z(@k C23395u c23395u) {
        C23395u c23395u2 = (C23395u) this.f53216l.remove(c23395u);
        if (c23395u2 == null) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f53217m;
        AtomicInteger atomicInteger = (AtomicInteger) linkedHashMap.get(c23395u2);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            b bVar = (b) this.f53228x.get(this.f53227w.b(c23395u2.f53182c.f52879b));
            if (bVar != null) {
                bVar.b(c23395u2);
            }
            linkedHashMap.remove(c23395u2);
        }
    }
}
