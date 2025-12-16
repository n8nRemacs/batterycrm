package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.J3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.view.C23485c;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.compose.C23005G;
import com.avito.android.R;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p0.InterfaceC44967a;

/* compiled from: AndroidCompositionLocals.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/runtime/X1;", "Landroidx/lifecycle/P;", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/X1;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final C22143q0 f41068a = androidx.compose.runtime.S.c(a.f41074l);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final J3 f41069b = androidx.compose.runtime.S.d(b.f41075l);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final J3 f41070c = androidx.compose.runtime.S.d(c.f41076l);

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final J3 f41071d = androidx.compose.runtime.S.d(d.f41077l);

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final J3 f41072e = androidx.compose.runtime.S.d(e.f41078l);

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final J3 f41073f = androidx.compose.runtime.S.d(f.f41079l);

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/res/Configuration;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Configuration> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f41074l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.b("LocalConfiguration");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/content/Context;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Context> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f41075l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.b("LocalContext");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu0/d;", "invoke", "()Lu0/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<u0.d> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f41076l = new c();

        public c() {
            super(0);
        }

        @Override // Y41.a
        public final u0.d invoke() {
            AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lu0/g;", "invoke", "()Lu0/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<u0.g> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f41077l = new d();

        public d() {
            super(0);
        }

        @Override // Y41.a
        public final u0.g invoke() {
            AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/savedstate/e;", "invoke", "()Landroidx/savedstate/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<InterfaceC23487e> {

        /* renamed from: l, reason: collision with root package name */
        public static final e f41078l = new e();

        public e() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC23487e invoke() {
            AndroidCompositionLocals_androidKt.b("LocalSavedStateRegistryOwner");
            throw null;
        }
    }

    /* compiled from: AndroidCompositionLocals.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<View> {

        /* renamed from: l, reason: collision with root package name */
        public static final f f41079l = new f();

        public f() {
            super(0);
        }

        @Override // Y41.a
        public final View invoke() {
            AndroidCompositionLocals_androidKt.b("LocalView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k AndroidComposeView androidComposeView, @Y61.k C22096n c22096n, @Y61.l androidx.compose.runtime.A a12, int i12) {
        boolean z12;
        androidx.compose.runtime.B bE2 = a12.E(1396852028);
        int i13 = (bE2.u(androidComposeView) ? 4 : 2) | i12 | (bE2.u(c22096n) ? 32 : 16);
        if (bE2.p(i13 & 1, (i13 & 19) != 18)) {
            Context context = androidComposeView.getContext();
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = C22126m3.g(new Configuration(context.getResources().getConfiguration()));
                bE2.H(objT);
            }
            InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new K(interfaceC22204y1);
                bE2.H(objT2);
            }
            androidComposeView.setConfigurationChangeObserver((Y41.l) objT2);
            Object objT3 = bE2.t();
            if (objT3 == c1651a) {
                objT3 = new C22495l0(context);
                bE2.H(objT3);
            }
            C22495l0 c22495l0 = (C22495l0) objT3;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objT4 = bE2.t();
            InterfaceC23487e interfaceC23487e = viewTreeOwners.f41048b;
            if (objT4 == c1651a) {
                View view = (View) androidComposeView.getParent();
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = androidx.compose.runtime.saveable.r.class.getSimpleName() + ':' + strValueOf;
                C23485c savedStateRegistry = interfaceC23487e.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        linkedHashMap.put(str2, bundleA.getParcelableArrayList(str2));
                    }
                }
                androidx.compose.runtime.saveable.r rVarA = androidx.compose.runtime.saveable.t.a(linkedHashMap, C22456b1.f41416l);
                try {
                    savedStateRegistry.c(str, new Z0(rVarA, 0));
                    z12 = true;
                } catch (IllegalArgumentException unused) {
                    z12 = false;
                }
                Y0 y02 = new Y0(rVarA, new C22452a1(z12, savedStateRegistry, str));
                bE2.H(y02);
                objT4 = y02;
            }
            Y0 y03 = (Y0) objT4;
            kotlin.G0 g02 = kotlin.G0.f406611a;
            boolean zU2 = bE2.u(y03);
            Object objT5 = bE2.t();
            if (zU2 || objT5 == A.a.f37868b) {
                objT5 = new M(y03);
                bE2.H(objT5);
            }
            C22187u0.a(g02, (Y41.l) objT5, bE2);
            Object objT6 = bE2.t();
            A.a.C1651a c1651a2 = A.a.f37868b;
            if (objT6 == c1651a2) {
                C22508o1.f41521a.getClass();
                objT6 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new K1() : new U0(androidComposeView.getView());
                bE2.H(objT6);
            }
            InterfaceC44967a interfaceC44967a = (InterfaceC44967a) objT6;
            Configuration configuration = (Configuration) interfaceC22204y1.getF42167b();
            Object objT7 = bE2.t();
            if (objT7 == c1651a2) {
                objT7 = new u0.d();
                bE2.H(objT7);
            }
            u0.d dVar = (u0.d) objT7;
            Object objT8 = bE2.t();
            Object obj = objT8;
            if (objT8 == c1651a2) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                bE2.H(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object objT9 = bE2.t();
            if (objT9 == c1651a2) {
                objT9 = new S(configuration3, dVar);
                bE2.H(objT9);
            }
            S s5 = (S) objT9;
            boolean zU3 = bE2.u(context);
            Object objT10 = bE2.t();
            if (zU3 || objT10 == c1651a2) {
                objT10 = new Q(context, s5);
                bE2.H(objT10);
            }
            C22187u0.a(dVar, (Y41.l) objT10, bE2);
            Object objT11 = bE2.t();
            if (objT11 == c1651a2) {
                objT11 = new u0.g();
                bE2.H(objT11);
            }
            u0.g gVar = (u0.g) objT11;
            Object objT12 = bE2.t();
            if (objT12 == c1651a2) {
                objT12 = new V(gVar);
                bE2.H(objT12);
            }
            V v12 = (V) objT12;
            boolean zU4 = bE2.u(context);
            Object objT13 = bE2.t();
            if (zU4 || objT13 == c1651a2) {
                objT13 = new U(context, v12);
                bE2.H(objT13);
            }
            C22187u0.a(gVar, (Y41.l) objT13, bE2);
            C22143q0 c22143q0 = Q0.f41213v;
            androidx.compose.runtime.S.b(new androidx.compose.runtime.Y1[]{f41068a.b((Configuration) interfaceC22204y1.getF42167b()), f41069b.b(context), C23005G.f46734a.b(viewTreeOwners.f41047a), f41072e.b(interfaceC23487e), androidx.compose.runtime.saveable.t.f38604a.b(y03), f41073f.b(androidComposeView.getView()), f41070c.b(dVar), f41071d.b(gVar), c22143q0.b(Boolean.valueOf(((Boolean) bE2.o(c22143q0)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), Q0.f41203l.b(interfaceC44967a)}, androidx.compose.runtime.internal.r.c(1471621628, new N(androidComposeView, c22495l0, c22096n), bE2), bE2, 56);
        } else {
            bE2.f();
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new O(androidComposeView, c22096n, i12);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    @Y61.k
    public static final androidx.compose.runtime.X1<InterfaceC22983P> getLocalLifecycleOwner() {
        return C23005G.f46734a;
    }
}
