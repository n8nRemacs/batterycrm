package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import one.me.sdk.arch.Widget;

/* loaded from: classes.dex */
public abstract class c54 {
    private static final String KEY_ARGS = "Controller.args";
    private static final String KEY_CHILD_ROUTERS = "Controller.childRouters";
    private static final String KEY_CLASS_NAME = "Controller.className";
    private static final String KEY_INSTANCE_ID = "Controller.instanceId";
    private static final String KEY_NEEDS_ATTACH = "Controller.needsAttach";
    private static final String KEY_OVERRIDDEN_POP_HANDLER = "Controller.overriddenPopHandler";
    private static final String KEY_OVERRIDDEN_PUSH_HANDLER = "Controller.overriddenPushHandler";
    private static final String KEY_REQUESTED_PERMISSIONS = "Controller.requestedPermissions";
    private static final String KEY_RETAIN_VIEW_MODE = "Controller.retainViewMode";
    private static final String KEY_SAVED_STATE = "Controller.savedState";
    private static final String KEY_TARGET_INSTANCE_ID = "Controller.target.instanceId";
    private static final String KEY_VIEW_STATE = "Controller.viewState";
    static final String KEY_VIEW_STATE_BUNDLE = "Controller.viewState.bundle";
    private static final String KEY_VIEW_STATE_HIERARCHY = "Controller.viewState.hierarchy";
    private final Bundle args;
    private boolean attached;
    private boolean attachedToUnownedParent;
    private boolean awaitingParentAttach;
    private boolean destroyed;
    private WeakReference<View> destroyedView;
    private boolean hasOptionsMenu;
    private boolean hasSavedViewState;
    String instanceId;
    boolean isBeingDestroyed;
    private boolean isContextAvailable;
    boolean isDetachFrozen;
    private boolean isPerformingExitTransition;
    public final j48 lifecycleOwner;
    private boolean needsAttach;
    final bva onBackPressedCallback;
    boolean onBackPressedDispatcherEnabled;
    private boolean optionsMenuHidden;
    private h54 overriddenPopHandler;
    private h54 overriddenPushHandler;
    private c54 parentController;
    ytd router;
    private Bundle savedInstanceState;
    private String targetInstanceId;
    View view;
    private neh viewAttachHandler;
    boolean viewIsAttached;
    Bundle viewState;
    boolean viewWasDetached;
    private b54 retainViewMode = b54.a;
    private final List<j54> childRouters = new ArrayList();
    private final List<a54> lifecycleListeners = new ArrayList();
    private final ArrayList<String> requestedPermissions = new ArrayList<>();
    private final ArrayList<ztd> onRouterSetListeners = new ArrayList<>();

    public c54(Bundle bundle) throws SecurityException {
        Constructor<?> constructor;
        Widget widget = (Widget) this;
        this.onBackPressedCallback = new z44(widget, 0);
        this.lifecycleOwner = new nx1(widget);
        this.args = bundle == null ? new Bundle(getClass().getClassLoader()) : bundle;
        this.instanceId = UUID.randomUUID().toString();
        Constructor<?>[] constructors = getClass().getConstructors();
        if (k0(constructors) == null) {
            int length = constructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    constructor = null;
                    break;
                }
                constructor = constructors[i];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                } else {
                    i++;
                }
            }
            if (constructor == null) {
                throw new RuntimeException(getClass() + " does not have a constructor that takes a Bundle argument or a default constructor. Controllers must have one of these in order to restore their states.");
            }
        }
        ykb ykbVar = new ykb();
        ykbVar.d = Bundle.EMPTY;
        addLifecycleListener(new q9(ykbVar, 9, widget));
    }

    public static Constructor k0(Constructor[] constructorArr) {
        for (Constructor constructor : constructorArr) {
            if (constructor.getParameterTypes().length == 1 && constructor.getParameterTypes()[0] == Bundle.class) {
                return constructor;
            }
        }
        return null;
    }

    public static c54 newInstance(Bundle bundle) throws SecurityException {
        Constructor<?> constructor;
        c54 c54Var;
        String string = bundle.getString(KEY_CLASS_NAME);
        Class clsA = q4j.a(string, false);
        Constructor<?>[] constructors = clsA.getConstructors();
        Constructor constructorK0 = k0(constructors);
        Bundle bundle2 = bundle.getBundle(KEY_ARGS);
        if (bundle2 != null) {
            bundle2.setClassLoader(clsA.getClassLoader());
        }
        try {
            if (constructorK0 != null) {
                c54Var = (c54) constructorK0.newInstance(bundle2);
            } else {
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    }
                    i++;
                }
                c54Var = (c54) constructor.newInstance(null);
                if (bundle2 != null) {
                    c54Var.args.putAll(bundle2);
                }
            }
            c54Var.getClass();
            Bundle bundle3 = bundle.getBundle(KEY_VIEW_STATE);
            c54Var.viewState = bundle3;
            if (bundle3 != null) {
                bundle3.setClassLoader(c54Var.getClass().getClassLoader());
            }
            c54Var.instanceId = bundle.getString(KEY_INSTANCE_ID);
            c54Var.targetInstanceId = bundle.getString(KEY_TARGET_INSTANCE_ID);
            c54Var.requestedPermissions.addAll(bundle.getStringArrayList(KEY_REQUESTED_PERMISSIONS));
            Bundle bundle4 = bundle.getBundle(KEY_OVERRIDDEN_PUSH_HANDLER);
            HashMap map = h54.c;
            c54Var.overriddenPushHandler = j6j.b(bundle4);
            c54Var.overriddenPopHandler = j6j.b(bundle.getBundle(KEY_OVERRIDDEN_POP_HANDLER));
            c54Var.needsAttach = bundle.getBoolean(KEY_NEEDS_ATTACH);
            c54Var.retainViewMode = b54.values()[bundle.getInt(KEY_RETAIN_VIEW_MODE, 0)];
            for (Bundle bundle5 : bundle.getParcelableArrayList(KEY_CHILD_ROUTERS)) {
                j54 j54Var = new j54();
                if (j54Var.j == null) {
                    j54Var.j = c54Var;
                    j54Var.R(c54Var.onBackPressedDispatcherEnabled);
                }
                j54Var.O(bundle5);
                c54Var.childRouters.add(j54Var);
            }
            Bundle bundle6 = bundle.getBundle(KEY_SAVED_STATE);
            c54Var.savedInstanceState = bundle6;
            if (bundle6 != null) {
                bundle6.setClassLoader(c54Var.getClass().getClassLoader());
            }
            c54Var.l0();
            return c54Var;
        } catch (Exception e) {
            StringBuilder sbN = az1.n("An exception occurred while creating a new instance of ", string, ". ");
            sbN.append(e.getMessage());
            throw new RuntimeException(sbN.toString(), e);
        }
    }

    private void removeViewReference(Context context) {
        View view = this.view;
        if (view != null) {
            if (context == null) {
                context = view.getContext();
            }
            if (!this.isBeingDestroyed && !this.hasSavedViewState) {
                n0(this.view);
            }
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((a54) it.next()).s(this, this.view);
            }
            onDestroyView(this.view);
            neh nehVar = this.viewAttachHandler;
            if (nehVar != null) {
                View view2 = this.view;
                view2.removeOnAttachStateChangeListener(nehVar);
                if (nehVar.X != null && (view2 instanceof ViewGroup)) {
                    neh.a((ViewGroup) view2).removeOnAttachStateChangeListener(nehVar.X);
                    nehVar.X = null;
                }
            }
            this.viewAttachHandler = null;
            this.viewIsAttached = false;
            if (this.isBeingDestroyed) {
                this.destroyedView = new WeakReference<>(this.view);
            }
            this.view = null;
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((a54) it2.next()).l(this);
            }
            Iterator<j54> it3 = this.childRouters.iterator();
            while (it3.hasNext()) {
                it3.next().a0();
            }
        }
        if (this.isBeingDestroyed) {
            if (context == null) {
                context = getActivity();
            }
            if (this.isContextAvailable) {
                onContextUnavailable(context);
            }
            if (this.destroyed) {
                return;
            }
            Iterator it4 = new ArrayList(this.lifecycleListeners).iterator();
            while (it4.hasNext()) {
                ((a54) it4.next()).r(this);
            }
            this.destroyed = true;
            onDestroy();
            this.parentController = null;
            Iterator it5 = new ArrayList(this.lifecycleListeners).iterator();
            while (it5.hasNext()) {
                ((a54) it5.next()).k(this);
            }
        }
    }

    public final void activityDestroyed(Activity activity) {
        if (activity.isChangingConfigurations()) {
            detach(this.view, true, false);
        } else {
            j0(true);
        }
        onContextUnavailable(activity);
    }

    public final void activityPaused(Activity activity) {
        onActivityPaused(activity);
    }

    public final void activityResumed(Activity activity) {
        View view;
        boolean z = this.attached;
        if (!z && (view = this.view) != null && this.viewIsAttached) {
            attach(view);
        } else if (z) {
            this.needsAttach = false;
            this.hasSavedViewState = false;
        }
        onActivityResumed(activity);
    }

    public final void activityStarted(Activity activity) {
        neh nehVar = this.viewAttachHandler;
        if (nehVar != null) {
            nehVar.c = false;
            nehVar.b();
        }
        onActivityStarted(activity);
    }

    public final void activityStopped(Activity activity) {
        boolean z = this.attached;
        neh nehVar = this.viewAttachHandler;
        if (nehVar != null) {
            nehVar.c = true;
            nehVar.c(true);
        }
        if (z && activity.isChangingConfigurations()) {
            this.needsAttach = true;
        }
        onActivityStopped(activity);
    }

    public final void addLifecycleListener(a54 a54Var) {
        if (this.lifecycleListeners.contains(a54Var)) {
            return;
        }
        this.lifecycleListeners.add(a54Var);
    }

    public void attach(View view) {
        boolean z = this.router == null || view.getParent() != this.router.i;
        this.attachedToUnownedParent = z;
        if (z || this.isBeingDestroyed) {
            return;
        }
        c54 c54Var = this.parentController;
        if (c54Var != null && !c54Var.attached) {
            this.awaitingParentAttach = true;
            return;
        }
        this.awaitingParentAttach = false;
        this.hasSavedViewState = false;
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((a54) it.next()).n(this, view);
        }
        this.attached = true;
        this.needsAttach = this.router.h;
        onAttach(view);
        if (this.hasOptionsMenu && !this.optionsMenuHidden) {
            this.router.o();
        }
        Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
        while (it2.hasNext()) {
            ((a54) it2.next()).g(this);
        }
        for (j54 j54Var : this.childRouters) {
            Iterator it3 = j54Var.a.iterator();
            while (true) {
                f2 f2Var = (f2) it3;
                if (!f2Var.hasNext()) {
                    break;
                }
                c54 c54Var2 = ((bud) f2Var.next()).a;
                if (c54Var2.awaitingParentAttach) {
                    c54Var2.attach(c54Var2.view);
                }
            }
            if ((j54Var.j == null || j54Var.i == null) ? false : true) {
                j54Var.J();
            }
        }
    }

    public final void changeEnded(h54 h54Var, i54 i54Var) {
        WeakReference<View> weakReference;
        if (!i54Var.b) {
            this.isPerformingExitTransition = false;
            Iterator<j54> it = this.childRouters.iterator();
            while (it.hasNext()) {
                it.next().b0(false);
            }
        }
        onChangeEnded(h54Var, i54Var);
        Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
        while (it2.hasNext()) {
            ((a54) it2.next()).a(this, h54Var, i54Var);
        }
        if (this.isBeingDestroyed && !this.viewIsAttached && !this.attached && (weakReference = this.destroyedView) != null) {
            View view = weakReference.get();
            if (this.router.i != null && view != null) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = this.router.i;
                if (parent == viewGroup) {
                    viewGroup.removeView(view);
                }
            }
            this.destroyedView = null;
        }
        h54Var.getClass();
    }

    public final void changeStarted(h54 h54Var, i54 i54Var) {
        if (!i54Var.b) {
            this.isPerformingExitTransition = true;
            Iterator<j54> it = this.childRouters.iterator();
            while (it.hasNext()) {
                it.next().b0(true);
            }
        }
        onChangeStarted(h54Var, i54Var);
        Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
        while (it2.hasNext()) {
            ((a54) it2.next()).b(this, h54Var, i54Var);
        }
    }

    public final void createOptionsMenu(Menu menu, MenuInflater menuInflater) {
        if (this.attached && this.hasOptionsMenu && !this.optionsMenuHidden) {
            onCreateOptionsMenu(menu, menuInflater);
        }
    }

    public final void destroy() {
        j0(false);
    }

    public void detach(View view, boolean z, boolean z2) {
        if (!this.attachedToUnownedParent) {
            Iterator<j54> it = this.childRouters.iterator();
            while (it.hasNext()) {
                it.next().G();
            }
        }
        boolean z3 = !z2 && (z || this.retainViewMode == b54.a || this.isBeingDestroyed);
        if (this.attached) {
            if (this.awaitingParentAttach) {
                this.attached = false;
            } else {
                Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
                while (it2.hasNext()) {
                    ((a54) it2.next()).t(this);
                }
                this.attached = false;
                onDetach(view);
                if (this.hasOptionsMenu && !this.optionsMenuHidden) {
                    this.router.o();
                }
                Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
                while (it3.hasNext()) {
                    ((a54) it3.next()).m(this);
                }
            }
        }
        this.awaitingParentAttach = false;
        if (z3) {
            removeViewReference(view != null ? view.getContext() : null);
        }
    }

    public final boolean didRequestPermission(String str) {
        return this.requestedPermissions.contains(str);
    }

    public final void executeWithRouter(ztd ztdVar) {
        if (this.router != null) {
            ztdVar.a();
        } else {
            this.onRouterSetListeners.add(ztdVar);
        }
    }

    public final c54 findController(String str) {
        if (this.instanceId.equals(str)) {
            return this;
        }
        Iterator<j54> it = this.childRouters.iterator();
        while (it.hasNext()) {
            c54 c54VarF = it.next().f(str);
            if (c54VarF != null) {
                return c54VarF;
            }
        }
        return null;
    }

    public final Activity getActivity() {
        ytd ytdVar = this.router;
        if (ytdVar != null) {
            return ytdVar.d();
        }
        return null;
    }

    public final Context getApplicationContext() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity.getApplicationContext();
        }
        return null;
    }

    public Bundle getArgs() {
        return this.args;
    }

    public final ytd getChildRouter(ViewGroup viewGroup) {
        return getChildRouter(viewGroup, null);
    }

    public final List<ytd> getChildRouters() {
        ArrayList arrayList = new ArrayList(this.childRouters.size());
        arrayList.addAll(this.childRouters);
        return arrayList;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final boolean getNeedsAttach() {
        return this.needsAttach;
    }

    public final jva getOnBackPressedDispatcher() {
        ytd ytdVar = this.router;
        if (ytdVar != null) {
            return ytdVar.h();
        }
        return null;
    }

    public h54 getOverriddenPopHandler() {
        return this.overriddenPopHandler;
    }

    public final h54 getOverriddenPushHandler() {
        return this.overriddenPushHandler;
    }

    public final c54 getParentController() {
        return this.parentController;
    }

    public final Resources getResources() {
        Activity activity = getActivity();
        if (activity != null) {
            return activity.getResources();
        }
        return null;
    }

    public b54 getRetainViewMode() {
        return this.retainViewMode;
    }

    public final ytd getRouter() {
        return this.router;
    }

    public final c54 getTargetController() {
        if (this.targetInstanceId != null) {
            return this.router.i().f(this.targetInstanceId);
        }
        return null;
    }

    public final View getView() {
        return this.view;
    }

    @Deprecated
    public boolean handleBack() {
        ArrayList arrayList = new ArrayList();
        Iterator<j54> it = this.childRouters.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().e());
        }
        Collections.sort(arrayList, new o00(14));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            c54 c54Var = ((bud) it2.next()).a;
            if (c54Var.isAttached()) {
                ytd router = c54Var.getRouter();
                router.getClass();
                iei.a();
                if (router.m()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final View inflate(ViewGroup viewGroup) {
        View view = this.view;
        if (view != null && view.getParent() != null && this.view.getParent() != viewGroup) {
            View view2 = this.view;
            detach(view2, true, false);
            removeViewReference(view2.getContext());
        }
        if (this.view == null) {
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((a54) it.next()).q(this);
            }
            Bundle bundle = this.viewState;
            View viewOnCreateView = onCreateView(LayoutInflater.from(viewGroup.getContext()), viewGroup, bundle == null ? null : bundle.getBundle(KEY_VIEW_STATE_BUNDLE));
            this.view = viewOnCreateView;
            if (viewOnCreateView == viewGroup) {
                throw new IllegalStateException("Controller's onCreateView method returned the parent ViewGroup. Perhaps you forgot to pass false for LayoutInflater.inflate's attachToRoot parameter?");
            }
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((a54) it2.next()).j(this, this.view);
            }
            View view3 = this.view;
            Bundle bundle2 = this.viewState;
            if (bundle2 != null) {
                view3.restoreHierarchyState(bundle2.getSparseParcelableArray(KEY_VIEW_STATE_HIERARCHY));
                Bundle bundle3 = this.viewState.getBundle(KEY_VIEW_STATE_BUNDLE);
                bundle3.setClassLoader(getClass().getClassLoader());
                onRestoreViewState(view3, bundle3);
                m0();
                Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
                while (it3.hasNext()) {
                    ((a54) it3.next()).d(this);
                }
            }
            if (!this.isBeingDestroyed) {
                mc5 mc5Var = new mc5(1, this);
                neh nehVar = new neh();
                nehVar.a = false;
                nehVar.b = false;
                nehVar.c = false;
                nehVar.d = 1;
                nehVar.o = mc5Var;
                this.viewAttachHandler = nehVar;
                this.view.addOnAttachStateChangeListener(nehVar);
            }
        } else {
            m0();
        }
        return this.view;
    }

    public final boolean isAttached() {
        return this.attached;
    }

    public final boolean isBeingDestroyed() {
        return this.isBeingDestroyed;
    }

    public final boolean isDestroyed() {
        return this.destroyed;
    }

    public final void j0(boolean z) {
        this.isBeingDestroyed = true;
        ytd ytdVar = this.router;
        if (ytdVar != null) {
            ytdVar.Z(this.instanceId);
        }
        Iterator<j54> it = this.childRouters.iterator();
        while (it.hasNext()) {
            it.next().c(false);
        }
        if (!this.attached) {
            removeViewReference(null);
        } else if (z) {
            detach(this.view, true, false);
        }
    }

    public final void l0() {
        Bundle bundle = this.savedInstanceState;
        if (bundle == null || this.router == null) {
            return;
        }
        onRestoreInstanceState(bundle);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((a54) it.next()).c(this, this.savedInstanceState);
        }
        this.savedInstanceState = null;
    }

    public final void m0() {
        for (j54 j54Var : this.childRouters) {
            if (j54Var.j == null || j54Var.i == null) {
                View viewFindViewById = this.view.findViewById(j54Var.k);
                if (viewFindViewById instanceof ViewGroup) {
                    j54Var.c0(this, (ViewGroup) viewFindViewById);
                    j54Var.J();
                }
            }
        }
    }

    public final void n0(View view) {
        this.hasSavedViewState = true;
        this.viewState = new Bundle(getClass().getClassLoader());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        view.saveHierarchyState(sparseArray);
        this.viewState.putSparseParcelableArray(KEY_VIEW_STATE_HIERARCHY, sparseArray);
        Bundle bundle = new Bundle(getClass().getClassLoader());
        onSaveViewState(view, bundle);
        this.viewState.putBundle(KEY_VIEW_STATE_BUNDLE, bundle);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((a54) it.next()).f(this);
        }
    }

    public abstract void onActivityPaused(Activity activity);

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public abstract void onActivityResumed(Activity activity);

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }

    public void onAttach(View view) {
    }

    public void onChangeEnded(h54 h54Var, i54 i54Var) {
    }

    public abstract void onChangeStarted(h54 h54Var, i54 i54Var);

    public void onContextAvailable(Context context) {
    }

    public void onContextUnavailable() {
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public abstract View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void onDestroy() {
    }

    public void onDestroyView(View view) {
    }

    public void onDetach(View view) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public abstract void onRestoreInstanceState(Bundle bundle);

    public void onRestoreViewState(View view, Bundle bundle) {
    }

    public abstract void onSaveInstanceState(Bundle bundle);

    public void onSaveViewState(View view, Bundle bundle) {
    }

    public final boolean optionsItemSelected(MenuItem menuItem) {
        return this.attached && this.hasOptionsMenu && !this.optionsMenuHidden && onOptionsItemSelected(menuItem);
    }

    public void overridePopHandler(h54 h54Var) {
        this.overriddenPopHandler = h54Var;
    }

    public void overridePushHandler(h54 h54Var) {
        this.overriddenPushHandler = h54Var;
    }

    public final void prepareForHostDetach() {
        this.needsAttach = this.needsAttach || this.attached;
        Iterator<j54> it = this.childRouters.iterator();
        while (it.hasNext()) {
            it.next().G();
        }
    }

    public final void prepareOptionsMenu(Menu menu) {
        if (this.attached && this.hasOptionsMenu && !this.optionsMenuHidden) {
            onPrepareOptionsMenu(menu);
        }
    }

    public final void registerForActivityResult(final int i) {
        executeWithRouter(new ztd() { // from class: v44
            @Override // defpackage.ztd
            public final void a() {
                c54 c54Var = this.a;
                c54Var.router.K(i, c54Var.instanceId);
            }
        });
    }

    public final void removeChildRouter(ytd ytdVar) {
        if ((ytdVar instanceof j54) && this.childRouters.remove(ytdVar)) {
            ytdVar.c(true);
        }
    }

    public final void removeLifecycleListener(a54 a54Var) {
        this.lifecycleListeners.remove(a54Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void requestPermissions(String[] strArr, int i) {
        this.requestedPermissions.addAll(Arrays.asList(strArr));
        executeWithRouter(new w44(this, strArr, i, 1));
    }

    public final void requestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.requestedPermissions.removeAll(Arrays.asList(strArr));
        onRequestPermissionsResult(i, strArr, iArr);
    }

    public final Bundle saveInstanceState() {
        View view;
        if (!this.hasSavedViewState && (view = this.view) != null) {
            n0(view);
        }
        Bundle bundle = new Bundle();
        bundle.putString(KEY_CLASS_NAME, getClass().getName());
        bundle.putBundle(KEY_VIEW_STATE, this.viewState);
        bundle.putBundle(KEY_ARGS, this.args);
        bundle.putString(KEY_INSTANCE_ID, this.instanceId);
        bundle.putString(KEY_TARGET_INSTANCE_ID, this.targetInstanceId);
        bundle.putStringArrayList(KEY_REQUESTED_PERMISSIONS, this.requestedPermissions);
        bundle.putBoolean(KEY_NEEDS_ATTACH, this.needsAttach || this.attached);
        bundle.putInt(KEY_RETAIN_VIEW_MODE, this.retainViewMode.ordinal());
        h54 h54Var = this.overriddenPushHandler;
        if (h54Var != null) {
            bundle.putBundle(KEY_OVERRIDDEN_PUSH_HANDLER, h54Var.j());
        }
        h54 h54Var2 = this.overriddenPopHandler;
        if (h54Var2 != null) {
            bundle.putBundle(KEY_OVERRIDDEN_POP_HANDLER, h54Var2.j());
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.childRouters.size());
        for (j54 j54Var : this.childRouters) {
            Bundle bundle2 = new Bundle();
            j54Var.P(bundle2);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(KEY_CHILD_ROUTERS, arrayList);
        Bundle bundle3 = new Bundle(getClass().getClassLoader());
        onSaveInstanceState(bundle3);
        Iterator it = new ArrayList(this.lifecycleListeners).iterator();
        while (it.hasNext()) {
            ((a54) it.next()).e(this, bundle3);
        }
        bundle.putBundle(KEY_SAVED_STATE, bundle3);
        return bundle;
    }

    public final void setDetachFrozen(boolean z) {
        if (this.isDetachFrozen != z) {
            this.isDetachFrozen = z;
            boolean z2 = (z || this.view == null || !this.viewWasDetached) ? false : true;
            for (j54 j54Var : this.childRouters) {
                if (z2) {
                    j54Var.G();
                }
                j54Var.b0(z);
            }
            if (z2) {
                View view = this.view;
                detach(view, false, false);
                if (this.view == null) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = this.router.i;
                    if (parent == viewGroup) {
                        viewGroup.removeView(view);
                    }
                }
            }
        }
    }

    public final void setHasOptionsMenu(boolean z) {
        boolean z2 = (!this.attached || this.optionsMenuHidden || this.hasOptionsMenu == z) ? false : true;
        this.hasOptionsMenu = z;
        if (z2) {
            this.router.o();
        }
    }

    public final void setNeedsAttach(boolean z) {
        this.needsAttach = z;
    }

    public final void setOptionsMenuHidden(boolean z) {
        boolean z2 = this.attached && this.hasOptionsMenu && this.optionsMenuHidden != z;
        this.optionsMenuHidden = z;
        if (z2) {
            this.router.o();
        }
    }

    public final void setParentController(c54 c54Var) {
        this.parentController = c54Var;
    }

    public void setRetainViewMode(b54 b54Var) {
        b54 b54Var2 = b54.a;
        if (b54Var == null) {
            b54Var = b54Var2;
        }
        this.retainViewMode = b54Var;
        if (b54Var != b54Var2 || this.attached) {
            return;
        }
        removeViewReference(null);
    }

    public final void setRouter(ytd ytdVar) {
        if (this.router == ytdVar) {
            l0();
            return;
        }
        this.router = ytdVar;
        l0();
        Iterator<ztd> it = this.onRouterSetListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.onRouterSetListeners.clear();
    }

    public void setTargetController(c54 c54Var) {
        if (this.targetInstanceId != null) {
            throw new RuntimeException("Target controller already set. A controller's target may only be set once.");
        }
        this.targetInstanceId = c54Var != null ? c54Var.getInstanceId() : null;
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        return getActivity().shouldShowRequestPermissionRationale(str);
    }

    public final void startActivity(final Intent intent) {
        executeWithRouter(new ztd() { // from class: y44
            @Override // defpackage.ztd
            public final void a() {
                this.a.router.U(intent);
            }
        });
    }

    public final void startActivityForResult(Intent intent, int i) {
        executeWithRouter(new w44(this, intent, i, 0));
    }

    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        this.router.X(this.instanceId, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public final ytd getChildRouter(ViewGroup viewGroup, String str) {
        return getChildRouter(viewGroup, str, true);
    }

    public final void onContextAvailable() {
        Activity activityD = this.router.d();
        if (activityD != null && !this.isContextAvailable) {
            Iterator it = new ArrayList(this.lifecycleListeners).iterator();
            while (it.hasNext()) {
                ((a54) it.next()).o(this);
            }
            boolean z = this.router.f;
            this.onBackPressedDispatcherEnabled = z;
            if (z) {
                if (!(activityD instanceof nl3)) {
                    throw new IllegalStateException("Host activities must extend ComponentActivity when enabling OnBackPressedDispatcher support.");
                }
                getOnBackPressedDispatcher().b(this.onBackPressedCallback);
            }
            this.isContextAvailable = true;
            onContextAvailable(activityD);
            Iterator it2 = new ArrayList(this.lifecycleListeners).iterator();
            while (it2.hasNext()) {
                ((a54) it2.next()).h(this);
            }
        }
        Iterator<j54> it3 = this.childRouters.iterator();
        while (it3.hasNext()) {
            it3.next().u();
        }
    }

    public final void onContextUnavailable(Context context) {
        for (j54 j54Var : this.childRouters) {
            Iterator it = j54Var.a.iterator();
            while (true) {
                f2 f2Var = (f2) it;
                if (!f2Var.hasNext()) {
                    break;
                } else {
                    ((bud) f2Var.next()).a.onContextUnavailable(context);
                }
            }
            Iterator it2 = j54Var.d.iterator();
            while (it2.hasNext()) {
                ((c54) it2.next()).onContextUnavailable(context);
            }
        }
        if (this.isContextAvailable) {
            Iterator it3 = new ArrayList(this.lifecycleListeners).iterator();
            while (it3.hasNext()) {
                ((a54) it3.next()).p(this);
            }
            this.isContextAvailable = false;
            onContextUnavailable();
            if (this.onBackPressedDispatcherEnabled) {
                this.onBackPressedCallback.e();
            }
            Iterator it4 = new ArrayList(this.lifecycleListeners).iterator();
            while (it4.hasNext()) {
                ((a54) it4.next()).i(this);
            }
        }
    }

    public final void startActivityForResult(final Intent intent, final int i, final Bundle bundle) {
        executeWithRouter(new ztd() { // from class: x44
            @Override // defpackage.ztd
            public final void a() {
                c54 c54Var = this.a;
                c54Var.router.W(c54Var.instanceId, intent, i, bundle);
            }
        });
    }

    public final ytd getChildRouter(ViewGroup viewGroup, String str, boolean z) {
        return getChildRouter(viewGroup, str, z, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ytd getChildRouter(android.view.ViewGroup r5, java.lang.String r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            int r0 = r5.getId()
            r1 = -1
            if (r0 == r1) goto L86
            java.util.List<j54> r1 = r4.childRouters
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L43
            java.lang.Object r2 = r1.next()
            j54 r2 = (defpackage.j54) r2
            boolean r3 = r2.n
            if (r3 != 0) goto L36
            android.view.ViewGroup r3 = r2.i
            if (r3 != 0) goto L36
            java.lang.String r3 = r2.l
            if (r3 == 0) goto L2e
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L36
            r2.k = r0
            goto L44
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Host ID can't be variable with a null tag"
            r5.<init>(r6)
            throw r5
        L36:
            int r3 = r2.k
            if (r3 != r0) goto Ld
            java.lang.String r3 = r2.l
            boolean r3 = android.text.TextUtils.equals(r6, r3)
            if (r3 == 0) goto Ld
            goto L44
        L43:
            r2 = 0
        L44:
            if (r2 != 0) goto L76
            if (r7 == 0) goto L75
            j54 r7 = new j54
            int r0 = r5.getId()
            r7.<init>()
            if (r8 != 0) goto L5e
            if (r6 == 0) goto L56
            goto L5e
        L56:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "ControllerHostedRouter can't be created without a tag if not bounded to its container"
            r5.<init>(r6)
            throw r5
        L5e:
            r7.k = r0
            r7.l = r6
            r7.n = r8
            r7.c0(r4, r5)
            java.util.List<j54> r5 = r4.childRouters
            r5.add(r7)
            boolean r5 = r4.isPerformingExitTransition
            if (r5 == 0) goto L74
            r5 = 1
            r7.b0(r5)
        L74:
            return r7
        L75:
            return r2
        L76:
            c54 r6 = r2.j
            if (r6 == 0) goto L7f
            android.view.ViewGroup r6 = r2.i
            if (r6 == 0) goto L7f
            return r2
        L7f:
            r2.c0(r4, r5)
            r2.J()
            return r2
        L86:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "You must set an id on your container."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c54.getChildRouter(android.view.ViewGroup, java.lang.String, boolean, boolean):ytd");
    }
}
