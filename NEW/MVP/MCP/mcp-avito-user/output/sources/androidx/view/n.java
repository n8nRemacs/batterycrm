package androidx.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.ActivityC22757o;
import androidx.core.app.C22744b;
import androidx.core.app.F;
import androidx.core.app.G;
import androidx.core.app.H;
import androidx.core.app.L;
import androidx.core.app.u;
import androidx.core.util.InterfaceC22791e;
import androidx.core.view.C;
import androidx.core.view.C22843w;
import androidx.core.view.InterfaceC22842v;
import androidx.view.C22985S;
import androidx.view.C23066u0;
import androidx.view.C23074y0;
import androidx.view.C23485c;
import androidx.view.C23486d;
import androidx.view.C23489g;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import androidx.view.V0;
import androidx.view.X0;
import androidx.view.result.IntentSenderRequest;
import com.avito.android.R;
import g.C40501b;
import g.InterfaceC40500a;
import i.AbstractC41201a;
import j.I;
import j.InterfaceC42153i;
import j.InterfaceC42159o;
import j.InterfaceC42164u;
import j.K;
import j.N;
import j.P;
import j.X;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.G0;
import z1.AbstractC50339a;
import z1.C50343e;

/* compiled from: ComponentActivity.java */
/* loaded from: classes.dex */
public class n extends ActivityC22757o implements InterfaceC40500a, InterfaceC22983P, T0, InterfaceC22969B, InterfaceC23487e, C, androidx.view.result.k, androidx.view.result.b, androidx.core.content.j, androidx.core.content.k, G, F, H, InterfaceC22842v, v {
    private final androidx.view.result.j mActivityResultRegistry;

    @I
    private int mContentLayoutId;
    final C40501b mContextAwareHelper;
    private P0.c mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @N
    final s mFullyDrawnReporter;
    private final C22985S mLifecycleRegistry;
    private final C22843w mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final y mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<InterfaceC22791e<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC22791e<u>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC22791e<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC22791e<L>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC22791e<Integer>> mOnTrimMemoryListeners;
    final i mReportFullyDrawnExecutor;
    final C23486d mSavedStateRegistryController;
    private S0 mViewModelStore;

    /* compiled from: ComponentActivity.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                n.super.onBackPressed();
            } catch (IllegalStateException e12) {
                if (!TextUtils.equals(e12.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e12;
                }
            }
        }
    }

    /* compiled from: ComponentActivity.java */
    public class b extends androidx.view.result.j {
        public b() {
        }

        @Override // androidx.view.result.j
        public final void c(int i12, @N AbstractC41201a abstractC41201a, Object obj) {
            Bundle bundle;
            n nVar = n.this;
            AbstractC41201a.C11360a synchronousResult = abstractC41201a.getSynchronousResult(nVar, obj);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new o(this, i12, synchronousResult));
                return;
            }
            Intent intentCreateIntent = abstractC41201a.createIntent(nVar, obj);
            if (intentCreateIntent.getExtras() != null && intentCreateIntent.getExtras().getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(nVar.getClassLoader());
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle = bundleExtra;
            } else {
                bundle = null;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C22744b.a(nVar, stringArrayExtra, i12);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentCreateIntent.getAction())) {
                nVar.startActivityForResult(intentCreateIntent, i12, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                nVar.startIntentSenderForResult(intentSenderRequest.f21244b, i12, intentSenderRequest.f21245c, intentSenderRequest.f21246d, intentSenderRequest.f21247e, 0, bundle);
            } catch (IntentSender.SendIntentException e12) {
                new Handler(Looper.getMainLooper()).post(new p(this, i12, e12));
            }
        }
    }

    /* compiled from: ComponentActivity.java */
    public class c implements InterfaceC22979L {
        public c() {
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@N InterfaceC22983P interfaceC22983P, @N Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                Window window = n.this.getWindow();
                View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                if (viewPeekDecorView != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                }
            }
        }
    }

    /* compiled from: ComponentActivity.java */
    public class d implements InterfaceC22979L {
        public d() {
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@N InterfaceC22983P interfaceC22983P, @N Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                n.this.mContextAwareHelper.f396207b = null;
                if (!n.this.isChangingConfigurations()) {
                    n.this.getF42820b().a();
                }
                n.this.mReportFullyDrawnExecutor.P();
            }
        }
    }

    /* compiled from: ComponentActivity.java */
    public class e implements InterfaceC22979L {
        public e() {
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@N InterfaceC22983P interfaceC22983P, @N Lifecycle.Event event) {
            n nVar = n.this;
            nVar.ensureViewModelStore();
            nVar.getLifecycle().c(this);
        }
    }

    /* compiled from: ComponentActivity.java */
    @X
    public static class f {
    }

    /* compiled from: ComponentActivity.java */
    @X
    public static class g {
        @InterfaceC42164u
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* compiled from: ComponentActivity.java */
    public static final class h {

        /* renamed from: a, reason: collision with root package name */
        public Object f21224a;

        /* renamed from: b, reason: collision with root package name */
        public S0 f21225b;
    }

    /* compiled from: ComponentActivity.java */
    public interface i extends Executor {
        void P();

        void S(@N View view);
    }

    /* compiled from: ComponentActivity.java */
    @X
    public class j implements i, ViewTreeObserver.OnDrawListener, Runnable {

        /* renamed from: c, reason: collision with root package name */
        public Runnable f21227c;

        /* renamed from: b, reason: collision with root package name */
        public final long f21226b = SystemClock.uptimeMillis() + 10000;

        /* renamed from: d, reason: collision with root package name */
        public boolean f21228d = false;

        public j() {
        }

        @Override // androidx.activity.n.i
        public final void P() {
            n nVar = n.this;
            nVar.getWindow().getDecorView().removeCallbacks(this);
            nVar.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.n.i
        public final void S(@N View view) {
            if (this.f21228d) {
                return;
            }
            this.f21228d = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f21227c = runnable;
            View decorView = n.this.getWindow().getDecorView();
            if (!this.f21228d) {
                decorView.postOnAnimation(new q(this, 0));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            boolean z12;
            Runnable runnable = this.f21227c;
            n nVar = n.this;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f21226b) {
                    this.f21228d = false;
                    nVar.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f21227c = null;
            s sVar = nVar.mFullyDrawnReporter;
            synchronized (sVar.f21277c) {
                z12 = sVar.f21280f;
            }
            if (z12) {
                this.f21228d = false;
                nVar.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            n.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public n() {
        this.mContextAwareHelper = new C40501b();
        this.mMenuHostHelper = new C22843w(new q(this, 1));
        this.mLifecycleRegistry = new C22985S(this, true);
        C23486d.f54432d.getClass();
        C23486d c23486dA = C23486d.a.a(this);
        this.mSavedStateRegistryController = c23486dA;
        this.mOnBackPressedDispatcher = new y(new a());
        i iVarCreateFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = iVarCreateFullyDrawnExecutor;
        this.mFullyDrawnReporter = new s(iVarCreateFullyDrawnExecutor, new androidx.view.k(this));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new c());
        getLifecycle().a(new d());
        getLifecycle().a(new e());
        c23486dA.a();
        C23066u0.b(this);
        getSavedStateRegistry().c("android:support:activity-result", new C23485c.InterfaceC1922c() { // from class: androidx.activity.l
            @Override // androidx.view.C23485c.InterfaceC1922c
            public final Bundle H() {
                return this.f21217a.lambda$new$1();
            }
        });
        addOnContextAvailableListener(new g.f() { // from class: androidx.activity.m
            @Override // g.f
            public final void a(n nVar) {
                this.f21218a.lambda$new$2(nVar);
            }
        });
    }

    private i createFullyDrawnExecutor() {
        return new j();
    }

    private void initViewTreeOwners() {
        V0.b(getWindow().getDecorView(), this);
        X0.b(getWindow().getDecorView(), this);
        C23489g.b(getWindow().getDecorView(), this);
        getWindow().getDecorView().setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        getWindow().getDecorView().setTag(R.id.report_drawn, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ G0 lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        androidx.view.result.j jVar = this.mActivityResultRegistry;
        jVar.getClass();
        HashMap map = jVar.f21253c;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(map.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(map.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(jVar.f21255e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) jVar.f21258h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", jVar.f21251a);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$new$2(Context context) {
        Bundle bundleA = getSavedStateRegistry().a("android:support:activity-result");
        if (bundleA != null) {
            androidx.view.result.j jVar = this.mActivityResultRegistry;
            jVar.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            jVar.f21255e = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            jVar.f21251a = (Random) bundleA.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = jVar.f21258h;
            bundle2.putAll(bundle);
            for (int i12 = 0; i12 < stringArrayList.size(); i12++) {
                String str = stringArrayList.get(i12);
                HashMap map = jVar.f21253c;
                boolean zContainsKey = map.containsKey(str);
                HashMap map2 = jVar.f21252b;
                if (zContainsKey) {
                    Integer num = (Integer) map.remove(str);
                    if (!bundle2.containsKey(str)) {
                        map2.remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i12);
                num2.intValue();
                String str2 = stringArrayList.get(i12);
                map2.put(num2, str2);
                map.put(str2, num2);
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.S(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.InterfaceC22842v
    public void addMenuProvider(@N C c12) {
        C22843w c22843w = this.mMenuHostHelper;
        c22843w.f45093b.add(c12);
        c22843w.f45092a.run();
    }

    @Override // androidx.core.content.j
    public final void addOnConfigurationChangedListener(@N InterfaceC22791e<Configuration> interfaceC22791e) {
        this.mOnConfigurationChangedListeners.add(interfaceC22791e);
    }

    public final void addOnContextAvailableListener(@N g.f fVar) {
        C40501b c40501b = this.mContextAwareHelper;
        n nVar = c40501b.f396207b;
        if (nVar != null) {
            fVar.a(nVar);
        }
        c40501b.f396206a.add(fVar);
    }

    @Override // androidx.core.app.F
    public final void addOnMultiWindowModeChangedListener(@N InterfaceC22791e<u> interfaceC22791e) {
        this.mOnMultiWindowModeChangedListeners.add(interfaceC22791e);
    }

    public final void addOnNewIntentListener(@N InterfaceC22791e<Intent> interfaceC22791e) {
        this.mOnNewIntentListeners.add(interfaceC22791e);
    }

    @Override // androidx.core.app.H
    public final void addOnPictureInPictureModeChangedListener(@N InterfaceC22791e<L> interfaceC22791e) {
        this.mOnPictureInPictureModeChangedListeners.add(interfaceC22791e);
    }

    @Override // androidx.core.content.k
    public final void addOnTrimMemoryListener(@N InterfaceC22791e<Integer> interfaceC22791e) {
        this.mOnTrimMemoryListeners.add(interfaceC22791e);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.mViewModelStore = hVar.f21225b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new S0();
            }
        }
    }

    @Override // androidx.view.result.k
    @N
    public final androidx.view.result.j getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.view.InterfaceC22969B
    @InterfaceC42153i
    @N
    public AbstractC50339a getDefaultViewModelCreationExtras() {
        C50343e c50343e = new C50343e();
        if (getApplication() != null) {
            c50343e.b(P0.a.f46696g, getApplication());
        }
        c50343e.b(C23066u0.f46894a, this);
        c50343e.b(C23066u0.f46895b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c50343e.b(C23066u0.f46896c, getIntent().getExtras());
        }
        return c50343e;
    }

    @Override // androidx.view.InterfaceC22969B
    @N
    public P0.c getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new C23074y0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.view.v
    @N
    public s getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Override // androidx.core.app.ActivityC22757o, androidx.view.InterfaceC22983P
    @N
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.view.C
    @N
    /* renamed from: getOnBackPressedDispatcher */
    public final y getF21241d() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.view.InterfaceC23487e
    @N
    public final C23485c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f54434b;
    }

    @Override // androidx.view.T0
    @N
    /* renamed from: getViewModelStore */
    public S0 getF42820b() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @InterfaceC42153i
    @Deprecated
    public void onActivityResult(int i12, int i13, @P Intent intent) {
        if (this.mActivityResultRegistry.b(i12, i13, intent)) {
            return;
        }
        super.onActivityResult(i12, i13, intent);
    }

    @Override // android.app.Activity
    @K
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @InterfaceC42153i
    public void onConfigurationChanged(@N Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC22791e<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    @Override // androidx.core.app.ActivityC22757o, android.app.Activity
    @j.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(@j.P android.os.Bundle r3) {
        /*
            r2 = this;
            androidx.savedstate.d r0 = r2.mSavedStateRegistryController
            r0.b(r3)
            g.b r0 = r2.mContextAwareHelper
            r0.f396207b = r2
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.f396206a
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            g.f r1 = (g.f) r1
            r1.a(r2)
            goto Lf
        L1f:
            super.onCreate(r3)
            androidx.lifecycle.q0$b r3 = androidx.view.FragmentC23058q0.f46869c
            r3.getClass()
            androidx.view.FragmentC23058q0.b.b(r2)
            int r3 = androidx.core.os.C22774b.f44795a
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r3 >= r0) goto L53
            r0 = 32
            if (r3 < r0) goto L5e
            java.lang.String r3 = android.os.Build.VERSION.CODENAME
            java.lang.String r0 = "REL"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L41
            goto L5e
        L41:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r0)
            java.lang.String r1 = "Tiramisu"
            java.lang.String r0 = r1.toUpperCase(r0)
            int r3 = r3.compareTo(r0)
            if (r3 < 0) goto L5e
        L53:
            androidx.activity.y r3 = r2.mOnBackPressedDispatcher
            android.window.OnBackInvokedDispatcher r0 = androidx.activity.n.g.a(r2)
            r3.f21293e = r0
            r3.d()
        L5e:
            int r3 = r2.mContentLayoutId
            if (r3 == 0) goto L65
            r2.setContentView(r3)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.n.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i12, @N Menu menu) {
        if (i12 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i12, menu);
        C22843w c22843w = this.mMenuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator<C> it = c22843w.f45093b.iterator();
        while (it.hasNext()) {
            it.next().b(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i12, @N MenuItem menuItem) {
        if (super.onMenuItemSelected(i12, menuItem)) {
            return true;
        }
        if (i12 != 0) {
            return false;
        }
        Iterator<C> it = this.mMenuHostHelper.f45093b.iterator();
        while (it.hasNext()) {
            if (it.next().d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    @InterfaceC42153i
    public void onMultiWindowModeChanged(boolean z12) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC22791e<u>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new u(z12));
        }
    }

    @Override // android.app.Activity
    @InterfaceC42153i
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<InterfaceC22791e<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i12, @N Menu menu) {
        Iterator<C> it = this.mMenuHostHelper.f45093b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
        super.onPanelClosed(i12, menu);
    }

    @Override // android.app.Activity
    @InterfaceC42153i
    public void onPictureInPictureModeChanged(boolean z12) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC22791e<L>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new L(z12));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i12, @P View view, @N Menu menu) {
        if (i12 != 0) {
            return true;
        }
        super.onPreparePanel(i12, view, menu);
        Iterator<C> it = this.mMenuHostHelper.f45093b.iterator();
        while (it.hasNext()) {
            it.next().c(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @InterfaceC42153i
    @Deprecated
    public void onRequestPermissionsResult(int i12, @N String[] strArr, @N int[] iArr) {
        if (this.mActivityResultRegistry.b(i12, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i12, strArr, iArr);
    }

    @P
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @P
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        S0 s02 = this.mViewModelStore;
        if (s02 == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            s02 = hVar.f21225b;
        }
        if (s02 == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f21224a = objOnRetainCustomNonConfigurationInstance;
        hVar2.f21225b = s02;
        return hVar2;
    }

    @Override // androidx.core.app.ActivityC22757o, android.app.Activity
    @InterfaceC42153i
    public void onSaveInstanceState(@N Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof C22985S) {
            ((C22985S) lifecycle).h(Lifecycle.State.f46681d);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @InterfaceC42153i
    public void onTrimMemory(int i12) {
        super.onTrimMemory(i12);
        Iterator<InterfaceC22791e<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i12));
        }
    }

    @N
    public final <I, O> androidx.view.result.h<I> registerForActivityResult(@N AbstractC41201a<I, O> abstractC41201a, @N androidx.view.result.j jVar, @N androidx.view.result.a<O> aVar) {
        return jVar.d("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC41201a, aVar);
    }

    @Override // androidx.core.view.InterfaceC22842v
    public void removeMenuProvider(@N C c12) {
        this.mMenuHostHelper.a(c12);
    }

    @Override // androidx.core.content.j
    public final void removeOnConfigurationChangedListener(@N InterfaceC22791e<Configuration> interfaceC22791e) {
        this.mOnConfigurationChangedListeners.remove(interfaceC22791e);
    }

    @Override // androidx.core.app.F
    public final void removeOnMultiWindowModeChangedListener(@N InterfaceC22791e<u> interfaceC22791e) {
        this.mOnMultiWindowModeChangedListeners.remove(interfaceC22791e);
    }

    @Override // androidx.core.app.H
    public final void removeOnPictureInPictureModeChangedListener(@N InterfaceC22791e<L> interfaceC22791e) {
        this.mOnPictureInPictureModeChangedListeners.remove(interfaceC22791e);
    }

    @Override // androidx.core.content.k
    public final void removeOnTrimMemoryListener(@N InterfaceC22791e<Integer> interfaceC22791e) {
        this.mOnTrimMemoryListeners.remove(interfaceC22791e);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (androidx.tracing.b.d()) {
                Trace.beginSection(androidx.tracing.b.e("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.a();
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@I int i12) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.S(getWindow().getDecorView());
        super.setContentView(i12);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@N Intent intent, int i12) {
        super.startActivityForResult(intent, i12);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@N IntentSender intentSender, int i12, @P Intent intent, int i13, int i14, int i15) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i12, intent, i13, i14, i15);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@N Intent intent, int i12, @P Bundle bundle) {
        super.startActivityForResult(intent, i12, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@N IntentSender intentSender, int i12, @P Intent intent, int i13, int i14, int i15, @P Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i12, intent, i13, i14, i15, bundle);
    }

    @Override // android.app.Activity
    @InterfaceC42153i
    @X
    public void onMultiWindowModeChanged(boolean z12, @N Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z12, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC22791e<u>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new u(z12));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    @InterfaceC42153i
    @X
    public void onPictureInPictureModeChanged(boolean z12, @N Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z12, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC22791e<L>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new L(z12));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // androidx.view.result.b
    @N
    public final <I, O> androidx.view.result.h<I> registerForActivityResult(@N AbstractC41201a<I, O> abstractC41201a, @N androidx.view.result.a<O> aVar) {
        return registerForActivityResult(abstractC41201a, this.mActivityResultRegistry, aVar);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.S(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        this.mReportFullyDrawnExecutor.S(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    /* compiled from: ComponentActivity.java */
    public static class k implements i {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f21230b;

        public k() {
            Looper looperMyLooper = Looper.myLooper();
            this.f21230b = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f21230b.postAtFrontOfQueue(runnable);
        }

        @Override // androidx.activity.n.i
        public final void P() {
        }

        @Override // androidx.activity.n.i
        public final void S(@N View view) {
        }
    }

    @InterfaceC42159o
    public n(@I int i12) {
        this();
        this.mContentLayoutId = i12;
    }
}
