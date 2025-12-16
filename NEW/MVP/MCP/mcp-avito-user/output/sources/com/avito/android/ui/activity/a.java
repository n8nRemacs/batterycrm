package com.avito.android.ui.activity;

import Y61.k;
import Y61.l;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.app.AbstractC19927a;
import androidx.appcompat.app.m;
import androidx.appcompat.app.p;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.P;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.Y;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.a;
import com.avito.android.deeplink_handler.view.impl.h;
import com.avito.android.deeplink_handler.view.impl.i;
import com.avito.android.di.C29972i;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.lib.util.z;
import com.avito.android.memory.consumption.f;
import com.avito.android.ui.activity.b;
import com.avito.android.util.C35739a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35960v2;
import iR.C41336a;
import jJ.InterfaceC42262b;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;

/* compiled from: BaseActivity.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/ui/activity/a;", "Landroidx/appcompat/app/m;", "<init>", "()V", "a", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a extends m {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f304536l = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f304537b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Intent f304538c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Toolbar f304539d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C9352a f304540e;

    /* renamed from: f, reason: collision with root package name */
    public int f304541f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f304542g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final InterfaceC42726C f304543h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC42726C f304544i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f304545j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f304546k;

    /* compiled from: BaseActivity.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/ui/activity/a$a;", "", "<init>", "()V", "_avito_base-component_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.ui.activity.a$a, reason: collision with other inner class name */
    public static final class C9352a {

        /* renamed from: a, reason: collision with root package name */
        @Inject
        public P f304547a;

        /* renamed from: b, reason: collision with root package name */
        @Inject
        public com.avito.android.deeplink_handler.view.d f304548b;

        /* renamed from: c, reason: collision with root package name */
        @Inject
        public com.avito.android.deeplink_handler.handler.composite.a f304549c;

        /* renamed from: d, reason: collision with root package name */
        @Inject
        public com.avito.android.analytics.screens.touch.b f304550d;

        /* renamed from: e, reason: collision with root package name */
        @Inject
        public f.a f304551e;

        /* renamed from: f, reason: collision with root package name */
        @Inject
        public InterfaceC28373a f304552f;

        /* renamed from: g, reason: collision with root package name */
        @Inject
        public InterfaceC42262b f304553g;
    }

    /* compiled from: BaseActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            Resources resources = a.this.getResources();
            return Boolean.valueOf(resources != null ? resources.getBoolean(R.bool.is_tablet) : false);
        }
    }

    /* compiled from: BaseActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/Y;", "invoke", "()Lcom/avito/android/analytics/Y;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Y> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Y invoke() {
            Object applicationContext = a.this.getApplicationContext();
            Y.a aVar = applicationContext instanceof Y.a ? (Y.a) applicationContext : null;
            if (aVar != null) {
                return aVar.getF67629f();
            }
            return null;
        }
    }

    /* compiled from: BaseActivity.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/PowerManager;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<PowerManager> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final PowerManager invoke() {
            Object systemService = a.this.getSystemService("power");
            if (systemService instanceof PowerManager) {
                return (PowerManager) systemService;
            }
            return null;
        }
    }

    public a() {
        com.avito.android.time.c.f301452a.getClass();
        this.f304537b = com.avito.android.time.c.f301453b.a();
        this.f304540e = new C9352a();
        this.f304542g = C42727D.b(LazyThreadSafetyMode.f406616d, new d());
        this.f304543h = C42727D.c(new c());
        this.f304544i = C42727D.c(new b());
        this.f304545j = true;
        this.f304546k = true;
    }

    public static void H1(a aVar) {
        z.c(z.f181429a, aVar.getWindow(), aVar, null);
    }

    public static void J1(a aVar) {
        z.e(z.f181429a, aVar.getWindow(), aVar, null);
    }

    @k
    public final View K1() {
        return findViewById(L1());
    }

    public int L1() {
        return android.R.id.content;
    }

    public int M1() {
        return -1;
    }

    @k
    public a.InterfaceC4053a N1() {
        return new a.C4058a(this);
    }

    @k
    public a.g O1() {
        return new i(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public a.i P1() {
        return new com.avito.android.deeplink_handler.view.impl.k(this, null, 2, 0 == true ? 1 : 0);
    }

    @k
    public final f.a Q1() {
        f.a aVar = this.f304540e.f304551e;
        if (aVar != null) {
            return aVar;
        }
        return null;
    }

    /* renamed from: R1, reason: from getter */
    public boolean getF304546k() {
        return this.f304546k;
    }

    /* renamed from: S1, reason: from getter */
    public boolean getF304545j() {
        return this.f304545j;
    }

    /* renamed from: T1 */
    public boolean getF329528s() {
        return getF304545j();
    }

    public final void U1(Intent intent) {
        DeepLink deepLink = (DeepLink) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("deeplink_handler_link", DeepLink.class) : intent.getParcelableExtra("deeplink_handler_link"));
        if (deepLink != null) {
            intent.removeExtra("deeplink_handler_link");
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f304540e.f304549c;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink, null, null, 6);
        }
    }

    public final void V1() {
        Intent intent = this.f304538c;
        if (intent != null) {
            intent.setFlags(603979776);
            startActivity(intent);
        }
    }

    @l
    public AvitoLayoutInflater.CompositeFactory W1(@l Bundle bundle) {
        AvitoLayoutInflater.CompositeFactory compositeFactory = new AvitoLayoutInflater.CompositeFactory();
        com.avito.android.lib.design.text_view.a.f180919m.getClass();
        AvitoLayoutInflater.CompositeFactory compositeFactoryRegisterFactory = compositeFactory.registerFactory(com.avito.android.lib.design.text_view.a.f180920n).registerFactory(com.avito.android.lib.design.text_view.a.f180921o);
        com.avito.android.lib.design.checked_text_view.a.f178659f.getClass();
        AvitoLayoutInflater.CompositeFactory compositeFactoryRegisterFactory2 = compositeFactoryRegisterFactory.registerFactory(com.avito.android.lib.design.checked_text_view.a.f178660g).registerFactory(com.avito.android.lib.design.checked_text_view.a.f178661h);
        com.avito.android.lib.design.input.a.f179382c.getClass();
        AvitoLayoutInflater.CompositeFactory compositeFactoryRegisterFactory3 = compositeFactoryRegisterFactory2.registerFactory(com.avito.android.lib.design.input.a.f179383d).registerFactory(com.avito.android.lib.design.input.a.f179384e);
        com.avito.android.lib.design.shadow_layout.a.f180490h.getClass();
        AvitoLayoutInflater.c cVar = com.avito.android.lib.design.shadow_layout.a.f180491i;
        C9352a c9352a = this.f304540e;
        P p12 = c9352a.f304547a;
        if (p12 == null) {
            p12 = null;
        }
        p12.getClass();
        n<Object>[] nVarArr = P.f67370w0;
        n<Object> nVar = nVarArr[51];
        AvitoLayoutInflater.CompositeFactory compositeFactoryRegisterFactoryIf = compositeFactoryRegisterFactory3.registerFactoryIf(cVar, ((Boolean) p12.f67382L.a().invoke()).booleanValue());
        com.avito.android.lib.design.shadow_layout.b.f180502g.getClass();
        AvitoLayoutInflater.c cVar2 = com.avito.android.lib.design.shadow_layout.b.f180503h;
        P p13 = c9352a.f304547a;
        P p14 = p13 != null ? p13 : null;
        p14.getClass();
        n<Object> nVar2 = nVarArr[51];
        return compositeFactoryRegisterFactoryIf.registerFactoryIf(cVar2, ((Boolean) p14.f67382L.a().invoke()).booleanValue());
    }

    public void X1() {
        int iM1 = M1();
        if (iM1 != -1) {
            setContentView(iM1);
        }
    }

    public void Z1() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.f304539d = toolbar;
        C35739a.f318787a.getClass();
        C35739a.a(this, toolbar);
        AbstractC19927a supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            return;
        }
        supportActionBar.w(null);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(@k MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C41336a.C11375a.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.app.Activity
    @k
    public final Intent getIntent() {
        try {
            Intent intent = super.getIntent();
            InterfaceC28373a interfaceC28373a = this.f304540e.f304552f;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            C35960v2.a(intent, this, interfaceC28373a);
            return intent;
        } catch (Exception unused) {
            Intent intent2 = super.getIntent();
            C35960v2.a(intent2, this, null);
            return intent2;
        }
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, android.app.Activity
    public void onActivityResult(int i12, int i13, @l Intent intent) {
        C9352a c9352a = this.f304540e;
        if (intent != null) {
            InterfaceC28373a interfaceC28373a = c9352a.f304552f;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            C35960v2.a(intent, this, interfaceC28373a);
        }
        super.onActivityResult(i12, i13, intent);
        com.avito.android.deeplink_handler.view.d dVar = c9352a.f304548b;
        (dVar != null ? dVar : null).a(i12, i13, intent);
    }

    @Override // androidx.view.n, android.app.Activity
    public void onBackPressed() {
        try {
            C41336a.C11375a.a();
            super.onBackPressed();
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        this.f304541f = getResources().getConfiguration().uiMode & 48;
        com.avito.android.ui.activity.b bVarA = ((b.InterfaceC9353b) C29972i.a(C29972i.b(this), b.InterfaceC9353b.class)).Fk().a(this, cv.c.c(this));
        C9352a c9352a = this.f304540e;
        bVarA.a(c9352a);
        Y1(bundle);
        U1(getIntent());
        com.avito.android.deeplink_handler.view.d dVar = c9352a.f304548b;
        (dVar != null ? dVar : null).c(this, O1(), P1(), new h(this), N1());
        J1(this);
        H1(this);
        AvitoLayoutInflater avitoLayoutInflater = AvitoLayoutInflater.f181382a;
        AvitoLayoutInflater.CompositeFactory compositeFactoryW1 = W1(bundle);
        avitoLayoutInflater.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        if (compositeFactoryW1 != null && layoutInflaterFrom.getFactory2() != null) {
            throw new IllegalStateException("A factory has already been set on this LayoutInflater");
        }
        if (layoutInflaterFrom.getFactory2() == null) {
            AvitoLayoutInflater.a aVar = new AvitoLayoutInflater.a(getDelegate());
            layoutInflaterFrom.setFactory2(new AvitoLayoutInflater.d(compositeFactoryW1, compositeFactoryW1, aVar, aVar));
        }
        com.avito.android.analytics.screens.touch.b bVar = c9352a.f304550d;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar.f90699b) {
            C41336a.C11375a.a();
            bVar.f90699b = false;
        }
        super.onCreate(bundle);
        Intent intent = (Intent) getIntent().getParcelableExtra("up_intent");
        if (intent != null) {
            InterfaceC28373a interfaceC28373a = c9352a.f304552f;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            C35960v2.a(intent, this, interfaceC28373a);
        } else {
            intent = null;
        }
        this.f304538c = intent;
        X1();
        Z1();
        if (getF304545j()) {
            com.avito.android.lib.util.i iVar = com.avito.android.lib.util.i.f181373a;
            iVar.getClass();
            com.avito.android.lib.util.i.j(iVar, findViewById(android.R.id.content));
        }
        if (getF329528s()) {
            com.avito.android.lib.util.i iVar2 = com.avito.android.lib.util.i.f181373a;
            iVar2.getClass();
            com.avito.android.lib.util.i.f(iVar2, findViewById(android.R.id.content));
        }
        if (getF304546k()) {
            P p12 = c9352a.f304547a;
            if (p12 == null) {
                p12 = null;
            }
            p12.getClass();
            n<Object> nVar = P.f67370w0[88];
            if (((Boolean) p12.f67439v0.a().invoke()).booleanValue()) {
                InterfaceC42262b interfaceC42262b = c9352a.f304553g;
                (interfaceC42262b != null ? interfaceC42262b : null).d();
            }
        }
    }

    @Override // androidx.appcompat.app.m, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i12, @k KeyEvent keyEvent) {
        if (i12 == 82) {
            return true;
        }
        return super.onKeyDown(i12, keyEvent);
    }

    @Override // androidx.view.n, android.app.Activity
    public void onNewIntent(@k Intent intent) {
        super.onNewIntent(intent);
        InterfaceC28373a interfaceC28373a = this.f304540e.f304552f;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        C35960v2.a(intent, this, interfaceC28373a);
        U1(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(@k MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f304538c == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        V1();
        finish();
        return true;
    }

    @Override // androidx.fragment.app.ActivityC22955m, android.app.Activity
    public void onPause() {
        super.onPause();
        Y y12 = (Y) this.f304543h.getValue();
        if (y12 != null) {
            y12.f89689c.remove(getClass().getSimpleName());
        }
    }

    @Override // androidx.fragment.app.ActivityC22955m, android.app.Activity
    public void onResume() {
        super.onResume();
        Y y12 = (Y) this.f304543h.getValue();
        if (y12 != null) {
            String simpleName = getClass().getSimpleName();
            boolean zBooleanValue = ((Boolean) this.f304544i.getValue()).booleanValue();
            y12.f89689c.add(simpleName);
            y12.f89690d = zBooleanValue;
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.C] */
    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public void onStart() {
        int iJ2 = getDelegate().j();
        Integer numValueOf = Integer.valueOf(iJ2);
        if (iJ2 == -100) {
            numValueOf = null;
        }
        if (this.f304541f != C35835l0.b(this, numValueOf != null ? numValueOf.intValue() : p.f21560c, (PowerManager) this.f304542g.getValue())) {
            recreate();
        }
        com.avito.android.analytics.screens.touch.b bVar = this.f304540e.f304550d;
        com.avito.android.analytics.screens.touch.b bVar2 = bVar != null ? bVar : null;
        if (bVar2.f90699b) {
            C41336a.C11375a.a();
            bVar2.f90699b = false;
        }
        super.onStart();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public void onStop() {
        this.f304541f = getResources().getConfiguration().uiMode & 48;
        super.onStop();
    }

    @Override // androidx.appcompat.app.m
    public boolean onSupportNavigateUp() {
        if (super.onSupportNavigateUp()) {
            return true;
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(@l Intent intent, @l Bundle bundle) {
        if (intent != null) {
            InterfaceC28373a interfaceC28373a = this.f304540e.f304552f;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            C35960v2.a(intent, this, interfaceC28373a);
        }
        super.startActivity(intent, bundle);
    }

    @Override // androidx.view.n, android.app.Activity
    public void startActivityForResult(@k Intent intent, int i12, @l Bundle bundle) {
        C9352a c9352a = this.f304540e;
        InterfaceC28373a interfaceC28373a = c9352a.f304552f;
        if (interfaceC28373a == null) {
            interfaceC28373a = null;
        }
        C35960v2.a(intent, this, interfaceC28373a);
        if (i12 != -1) {
            P p12 = c9352a.f304547a;
            if (p12 == null) {
                p12 = null;
            }
            p12.getClass();
            n<Object> nVar = P.f67370w0[66];
            if (((Boolean) p12.f67396Z.a().invoke()).booleanValue() && (intent.getFlags() & 536870912) != 0 && (intent.getFlags() & 67108864) != 0) {
                ComponentName component = intent.getComponent();
                if (L.f(component != null ? component.getClassName() : null, getClass().getName())) {
                    startActivity(intent);
                    onActivityResult(i12, 0, null);
                    return;
                }
            }
        }
        super.startActivityForResult(intent, i12, bundle);
    }

    public void Y1(@l Bundle bundle) {
    }
}
