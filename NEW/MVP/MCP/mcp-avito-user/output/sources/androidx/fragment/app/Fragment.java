package androidx.fragment.app;

import Fc1.G3;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.view.AbstractC22991Y;
import androidx.view.C22985S;
import androidx.view.C23038g0;
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
import i.AbstractC41201a;
import j.InterfaceC42145a;
import j.InterfaceC42153i;
import j.InterfaceC42159o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import q.InterfaceC47174a;
import z1.AbstractC50339a;
import z1.C50343e;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC22983P, T0, InterfaceC22969B, InterfaceC23487e, androidx.view.result.b {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    k mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @j.N
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;

    @j.I
    private int mContentLayoutId;
    P0.c mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    r<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    C22985S mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<m> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;

    @RestrictTo
    @j.P
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final m mSavedStateAttachListener;
    C23486d mSavedStateRegistryController;

    @j.P
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;

    @j.P
    P mViewLifecycleOwner;
    C23038g0<InterfaceC22983P> mViewLifecycleOwnerLiveData;

    @j.N
    String mWho;

    public static class InstantiationException extends RuntimeException {
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    public class a<I> extends androidx.view.result.h<I> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f46307a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC41201a f46308b;

        public a(AtomicReference atomicReference, AbstractC41201a abstractC41201a) {
            this.f46307a = atomicReference;
            this.f46308b = abstractC41201a;
        }

        @Override // androidx.view.result.h
        @j.N
        public final AbstractC41201a<I, ?> a() {
            return this.f46308b;
        }

        @Override // androidx.view.result.h
        public final void b(Object obj) {
            androidx.view.result.h hVar = (androidx.view.result.h) this.f46307a.get();
            if (hVar == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            hVar.b(obj);
        }

        @Override // androidx.view.result.h
        public final void c() {
            androidx.view.result.h hVar = (androidx.view.result.h) this.f46307a.getAndSet(null);
            if (hVar != null) {
                hVar.c();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    public class c extends m {
        public c() {
            super(null);
        }

        @Override // androidx.fragment.app.Fragment.m
        public final void a() {
            Fragment fragment = Fragment.this;
            fragment.mSavedStateRegistryController.a();
            C23066u0.b(fragment);
            Bundle bundle = fragment.mSavedFragmentState;
            fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    public class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SpecialEffectsController f46312b;

        public e(SpecialEffectsController specialEffectsController) {
            this.f46312b = specialEffectsController;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f46312b.c();
        }
    }

    public class f extends AbstractC22957o {
        public f() {
        }

        @Override // androidx.fragment.app.AbstractC22957o
        @j.P
        public final View b(int i12) {
            Fragment fragment = Fragment.this;
            View view = fragment.mView;
            if (view != null) {
                return view.findViewById(i12);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a view");
        }

        @Override // androidx.fragment.app.AbstractC22957o
        public final boolean c() {
            return Fragment.this.mView != null;
        }
    }

    public class g implements InterfaceC22979L {
        public g() {
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@j.N InterfaceC22983P interfaceC22983P, @j.N Lifecycle.Event event) {
            View view;
            if (event != Lifecycle.Event.ON_STOP || (view = Fragment.this.mView) == null) {
                return;
            }
            view.cancelPendingInputEvents();
        }
    }

    public class h implements InterfaceC47174a<Void, androidx.view.result.j> {
        public h() {
        }

        @Override // q.InterfaceC47174a
        public final androidx.view.result.j apply(Void r32) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof androidx.view.result.k ? ((androidx.view.result.k) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    public class i implements InterfaceC47174a<Void, androidx.view.result.j> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.view.result.j f46316a;

        public i(androidx.view.result.j jVar) {
            this.f46316a = jVar;
        }

        @Override // q.InterfaceC47174a
        public final androidx.view.result.j apply(Void r12) {
            return this.f46316a;
        }
    }

    public class j extends m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC47174a f46317a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference f46318b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AbstractC41201a f46319c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ androidx.view.result.a f46320d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC47174a interfaceC47174a, AtomicReference atomicReference, AbstractC41201a abstractC41201a, androidx.view.result.a aVar) {
            super(null);
            this.f46317a = interfaceC47174a;
            this.f46318b = atomicReference;
            this.f46319c = abstractC41201a;
            this.f46320d = aVar;
        }

        @Override // androidx.fragment.app.Fragment.m
        public final void a() {
            Fragment fragment = Fragment.this;
            this.f46318b.set(((androidx.view.result.j) this.f46317a.apply(null)).d(fragment.generateActivityResultKey(), fragment, this.f46319c, this.f46320d));
        }
    }

    public static class k {

        /* renamed from: a, reason: collision with root package name */
        public boolean f46322a;

        /* renamed from: b, reason: collision with root package name */
        @InterfaceC42145a
        public int f46323b;

        /* renamed from: c, reason: collision with root package name */
        @InterfaceC42145a
        public int f46324c;

        /* renamed from: d, reason: collision with root package name */
        @InterfaceC42145a
        public int f46325d;

        /* renamed from: e, reason: collision with root package name */
        @InterfaceC42145a
        public int f46326e;

        /* renamed from: f, reason: collision with root package name */
        public int f46327f;

        /* renamed from: g, reason: collision with root package name */
        public ArrayList<String> f46328g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList<String> f46329h;

        /* renamed from: i, reason: collision with root package name */
        public Object f46330i = null;

        /* renamed from: j, reason: collision with root package name */
        public Object f46331j;

        /* renamed from: k, reason: collision with root package name */
        public Object f46332k;

        /* renamed from: l, reason: collision with root package name */
        public Object f46333l;

        /* renamed from: m, reason: collision with root package name */
        public Object f46334m;

        /* renamed from: n, reason: collision with root package name */
        public Object f46335n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f46336o;

        /* renamed from: p, reason: collision with root package name */
        public Boolean f46337p;

        /* renamed from: q, reason: collision with root package name */
        public androidx.core.app.P f46338q;

        /* renamed from: r, reason: collision with root package name */
        public androidx.core.app.P f46339r;

        /* renamed from: s, reason: collision with root package name */
        public float f46340s;

        /* renamed from: t, reason: collision with root package name */
        public View f46341t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f46342u;

        public k() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f46331j = obj;
            this.f46332k = null;
            this.f46333l = obj;
            this.f46334m = null;
            this.f46335n = obj;
            this.f46338q = null;
            this.f46339r = null;
            this.f46340s = 1.0f;
            this.f46341t = null;
        }
    }

    @j.X
    public static class l {
    }

    public static abstract class m {
        public m() {
        }

        public abstract void a();

        public /* synthetic */ m(b bVar) {
            this();
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C22964w();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b();
        this.mMaxState = Lifecycle.State.f46683f;
        this.mViewLifecycleOwnerLiveData = new C23038g0<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c();
        initLifecycle();
    }

    private k ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new k();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.f46680c || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new C22985S(this, true);
        C23486d.f54432d.getClass();
        this.mSavedStateRegistryController = C23486d.a.a(this);
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        registerOnPreAttachListener(this.mSavedStateAttachListener);
    }

    @j.N
    @Deprecated
    public static Fragment instantiate(@j.N Context context, @j.N String str) {
        return instantiate(context, str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$performCreateView$0() {
        P p12 = this.mViewLifecycleOwner;
        p12.f46499g.b(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    @j.N
    private <I, O> androidx.view.result.h<I> prepareCallInternal(@j.N AbstractC41201a<I, O> abstractC41201a, @j.N InterfaceC47174a<Void, androidx.view.result.j> interfaceC47174a, @j.N androidx.view.result.a<O> aVar) {
        if (this.mState > 1) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        registerOnPreAttachListener(new j(interfaceC47174a, atomicReference, abstractC41201a, aVar));
        return new a(atomicReference, abstractC41201a);
    }

    private void registerOnPreAttachListener(@j.N m mVar) {
        if (this.mState >= 0) {
            mVar.a();
        } else {
            this.mOnPreAttachedListeners.add(mVar);
        }
    }

    private void restoreViewState() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        if (this.mView != null) {
            Bundle bundle = this.mSavedFragmentState;
            restoreViewState(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
    }

    public void callStartTransitionListener(boolean z12) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        k kVar = this.mAnimationInfo;
        if (kVar != null) {
            kVar.f46342u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        SpecialEffectsController specialEffectsControllerF = SpecialEffectsController.f(viewGroup, fragmentManager);
        specialEffectsControllerF.g();
        if (z12) {
            this.mHost.f46585d.post(new e(specialEffectsControllerF));
        } else {
            specialEffectsControllerF.c();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @j.N
    public AbstractC22957o createFragmentContainer() {
        return new f();
    }

    public void dump(@j.N String str, @j.P FileDescriptor fileDescriptor, @j.N PrintWriter printWriter, @j.P String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.y(androidx.appcompat.app.r.q(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@j.P Object obj) {
        return super.equals(obj);
    }

    @j.P
    public Fragment findFragmentByWho(@j.N String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f46365c.c(str);
    }

    @j.N
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @j.P
    /* renamed from: getActivity, reason: merged with bridge method [inline-methods] */
    public final ActivityC22955m l1() {
        r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return rVar.f46583b;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f46337p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        k kVar = this.mAnimationInfo;
        if (kVar == null || (bool = kVar.f46336o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        kVar.getClass();
        return null;
    }

    @j.P
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @j.N
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " has not been attached yet."));
    }

    @j.P
    public Context getContext() {
        r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return rVar.f46584c;
    }

    @Override // androidx.view.InterfaceC22969B
    @InterfaceC42153i
    @j.N
    public AbstractC50339a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(requireContext().getApplicationContext());
        }
        C50343e c50343e = new C50343e();
        if (application != null) {
            c50343e.b(P0.a.f46696g, application);
        }
        c50343e.b(C23066u0.f46894a, this);
        c50343e.b(C23066u0.f46895b, this);
        if (getArguments() != null) {
            c50343e.b(C23066u0.f46896c, getArguments());
        }
        return c50343e;
    }

    @Override // androidx.view.InterfaceC22969B
    @j.N
    public P0.c getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(requireContext().getApplicationContext());
            }
            this.mDefaultFactory = new C23074y0(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    @InterfaceC42145a
    public int getEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f46323b;
    }

    @j.P
    public Object getEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f46330i;
    }

    public androidx.core.app.P getEnterTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f46338q;
    }

    @InterfaceC42145a
    public int getExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f46324c;
    }

    @j.P
    public Object getExitTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f46332k;
    }

    public androidx.core.app.P getExitTransitionCallback() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f46339r;
    }

    public View getFocusedView() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f46341t;
    }

    @j.P
    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @j.P
    public final Object getHost() {
        r<?> rVar = this.mHost;
        if (rVar == null) {
            return null;
        }
        return rVar.e();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @j.N
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.view.InterfaceC22983P
    @j.N
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @j.N
    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    public int getNextTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f46327f;
    }

    @j.P
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @j.N
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " not associated with a fragment manager."));
    }

    public boolean getPopDirection() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f46322a;
    }

    @InterfaceC42145a
    public int getPopEnterAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f46325d;
    }

    @InterfaceC42145a
    public int getPopExitAnim() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 0;
        }
        return kVar.f46326e;
    }

    public float getPostOnViewCreatedAlpha() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return 1.0f;
        }
        return kVar.f46340s;
    }

    @j.P
    public Object getReenterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f46333l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @j.N
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f46587a;
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this, "Attempting to get retain instance for fragment " + this);
        FragmentStrictMode.f46587a.getClass();
        FragmentStrictMode.b(getRetainInstanceUsageViolation);
        FragmentStrictMode.a(this).f46598a.getClass();
        return this.mRetainInstance;
    }

    @j.P
    public Object getReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f46331j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.view.InterfaceC23487e
    @j.N
    public final C23485c getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f54434b;
    }

    @j.P
    public Object getSharedElementEnterTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        return kVar.f46334m;
    }

    @j.P
    public Object getSharedElementReturnTransition() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return null;
        }
        Object obj = kVar.f46335n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @j.N
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f46328g) == null) ? new ArrayList<>() : arrayList;
    }

    @j.N
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        k kVar = this.mAnimationInfo;
        return (kVar == null || (arrayList = kVar.f46329h) == null) ? new ArrayList<>() : arrayList;
    }

    @j.N
    public final String getString(@j.e0 int i12) {
        return getResources().getString(i12);
    }

    @j.P
    public final String getTag() {
        return this.mTag;
    }

    @j.P
    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f46587a;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this, "Attempting to get target request code from fragment " + this);
        FragmentStrictMode.f46587a.getClass();
        FragmentStrictMode.b(getTargetFragmentRequestCodeUsageViolation);
        FragmentStrictMode.a(this).f46598a.getClass();
        return this.mTargetRequestCode;
    }

    @j.N
    public final CharSequence getText(@j.e0 int i12) {
        return getResources().getText(i12);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @j.P
    public View getView() {
        return this.mView;
    }

    @j.N
    @j.K
    public InterfaceC22983P getViewLifecycleOwner() {
        P p12 = this.mViewLifecycleOwner;
        if (p12 != null) {
            return p12;
        }
        throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    @j.N
    public AbstractC22991Y<InterfaceC22983P> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.view.T0
    @j.N
    /* renamed from: getViewModelStore */
    public S0 getF42820b() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap<String, S0> map = this.mFragmentManager.f46361N.f46612K;
        S0 s02 = map.get(this.mWho);
        if (s02 != null) {
            return s02;
        }
        S0 s03 = new S0();
        map.put(this.mWho, s03);
        return s03;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @RestrictTo
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C22964w();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (!this.mHidden) {
            FragmentManager fragmentManager = this.mFragmentManager;
            if (fragmentManager == null) {
                return false;
            }
            Fragment fragment = this.mParentFragment;
            fragmentManager.getClass();
            if (!(fragment == null ? false : fragment.isHidden())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @RestrictTo
    public final boolean isMenuVisible() {
        if (this.mMenuVisible) {
            if (this.mFragmentManager == null) {
                return true;
            }
            Fragment fragment = this.mParentFragment;
            if (fragment == null ? true : fragment.isMenuVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isPostponed() {
        k kVar = this.mAnimationInfo;
        if (kVar == null) {
            return false;
        }
        return kVar.f46342u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.V();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void k2(@Y61.k MenuItem menuItem) {
        onOptionsItemSelected(menuItem);
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.X();
    }

    @InterfaceC42153i
    @j.K
    @Deprecated
    public void onActivityCreated(@j.P Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i12, int i13, @j.P Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @InterfaceC42153i
    @j.K
    public void onAttach(@j.N Context context) {
        this.mCalled = true;
        r<?> rVar = this.mHost;
        ActivityC22955m activityC22955m = rVar == null ? null : rVar.f46583b;
        if (activityC22955m != null) {
            this.mCalled = false;
            onAttach((Activity) activityC22955m);
        }
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC42153i
    public void onConfigurationChanged(@j.N Configuration configuration) {
        this.mCalled = true;
    }

    @j.K
    public boolean onContextItemSelected(@j.N MenuItem menuItem) {
        return false;
    }

    @InterfaceC42153i
    @j.K
    public void onCreate(@j.P Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f46383u >= 1) {
            return;
        }
        fragmentManager.f46354G = false;
        fragmentManager.f46355H = false;
        fragmentManager.f46361N.f46615N = false;
        fragmentManager.w(1);
    }

    @j.K
    @j.P
    public Animation onCreateAnimation(int i12, boolean z12, int i13) {
        return null;
    }

    @j.K
    @j.P
    public Animator onCreateAnimator(int i12, boolean z12, int i13) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @j.K
    public void onCreateContextMenu(@j.N ContextMenu contextMenu, @j.N View view, @j.P ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @j.K
    @j.P
    public View onCreateView(@j.N LayoutInflater layoutInflater, @j.P ViewGroup viewGroup, @j.P Bundle bundle) {
        int i12 = this.mContentLayoutId;
        if (i12 != 0) {
            return layoutInflater.inflate(i12, viewGroup, false);
        }
        return null;
    }

    @InterfaceC42153i
    @j.K
    public void onDestroy() {
        this.mCalled = true;
    }

    @InterfaceC42153i
    @j.K
    public void onDestroyView() {
        this.mCalled = true;
    }

    @InterfaceC42153i
    @j.K
    public void onDetach() {
        this.mCalled = true;
    }

    @j.N
    public LayoutInflater onGetLayoutInflater(@j.P Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @InterfaceC42153i
    @j.j0
    public void onInflate(@j.N Context context, @j.N AttributeSet attributeSet, @j.P Bundle bundle) {
        this.mCalled = true;
        r<?> rVar = this.mHost;
        ActivityC22955m activityC22955m = rVar == null ? null : rVar.f46583b;
        if (activityC22955m != null) {
            this.mCalled = false;
            onInflate((Activity) activityC22955m, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC42153i
    @j.K
    public void onLowMemory() {
        this.mCalled = true;
    }

    @j.K
    @Deprecated
    public boolean onOptionsItemSelected(@j.N MenuItem menuItem) {
        return false;
    }

    @InterfaceC42153i
    @j.K
    public void onPause() {
        this.mCalled = true;
    }

    @InterfaceC42153i
    @j.K
    public void onResume() {
        this.mCalled = true;
    }

    @InterfaceC42153i
    @j.K
    public void onStart() {
        this.mCalled = true;
    }

    @InterfaceC42153i
    @j.K
    public void onStop() {
        this.mCalled = true;
    }

    @InterfaceC42153i
    @j.K
    public void onViewStateRestored(@j.P Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.X();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new o0(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        restoreViewState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f46354G = false;
        fragmentManager.f46355H = false;
        fragmentManager.f46361N.f46615N = false;
        fragmentManager.w(4);
    }

    public void performAttach() {
        Iterator<m> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.c(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f46584c);
        if (!this.mCalled) {
            throw new o0(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not call through to super.onAttach()"));
        }
        Iterator<A> it2 = this.mFragmentManager.f46377o.iterator();
        while (it2.hasNext()) {
            it2.next().a(this);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f46354G = false;
        fragmentManager.f46355H = false;
        fragmentManager.f46361N.f46615N = false;
        fragmentManager.w(0);
    }

    public void performConfigurationChanged(@j.N Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@j.N MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.l(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.X();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new g());
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new o0(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@j.N Menu menu, @j.N MenuInflater menuInflater) {
        boolean z12 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z12 = true;
        }
        return z12 | this.mChildFragmentManager.m(menu, menuInflater);
    }

    public void performCreateView(@j.N LayoutInflater layoutInflater, @j.P ViewGroup viewGroup, @j.P Bundle bundle) {
        this.mChildFragmentManager.X();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new P(this, getF42820b(), new G3(this, 11));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.f46498f != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
            return;
        }
        this.mViewLifecycleOwner.b();
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(this.mView);
            toString();
        }
        V0.b(this.mView, this.mViewLifecycleOwner);
        X0.b(this.mView, this.mViewLifecycleOwner);
        C23489g.b(this.mView, this.mViewLifecycleOwner);
        this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.n();
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new o0(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.w(1);
        if (this.mView != null) {
            P p12 = this.mViewLifecycleOwner;
            p12.b();
            if (p12.f46498f.f46705d.a(Lifecycle.State.f46681d)) {
                this.mViewLifecycleOwner.a(Lifecycle.Event.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new o0(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        androidx.loader.app.a.b(this).d();
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new o0(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not call through to super.onDetach()"));
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f46356I) {
            return;
        }
        fragmentManager.n();
        this.mChildFragmentManager = new C22964w();
    }

    @j.N
    public LayoutInflater performGetLayoutInflater(@j.P Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z12) {
        onMultiWindowModeChanged(z12);
    }

    public boolean performOptionsItemSelected(@j.N MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.r(menuItem);
    }

    public void performOptionsMenuClosed(@j.N Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.s(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.w(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new o0(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z12) {
        onPictureInPictureModeChanged(z12);
    }

    public boolean performPrepareOptionsMenu(@j.N Menu menu) {
        boolean z12 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z12 = true;
        }
        return z12 | this.mChildFragmentManager.v(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zU2 = FragmentManager.U(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zU2) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zU2);
            onPrimaryNavigationFragmentChanged(zU2);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.w0();
            fragmentManager.t(fragmentManager.f46387y);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.X();
        this.mChildFragmentManager.B(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new o0(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not call through to super.onResume()"));
        }
        C22985S c22985s = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_RESUME;
        c22985s.f(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(event);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f46354G = false;
        fragmentManager.f46355H = false;
        fragmentManager.f46361N.f46615N = false;
        fragmentManager.w(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.X();
        this.mChildFragmentManager.B(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new o0(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not call through to super.onStart()"));
        }
        C22985S c22985s = this.mLifecycleRegistry;
        Lifecycle.Event event = Lifecycle.Event.ON_START;
        c22985s.f(event);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(event);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f46354G = false;
        fragmentManager.f46355H = false;
        fragmentManager.f46361N.f46615N = false;
        fragmentManager.w(5);
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f46355H = true;
        fragmentManager.f46361N.f46615N = true;
        fragmentManager.w(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new o0(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.w(2);
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f46342u = true;
    }

    @Override // androidx.view.result.b
    @j.N
    @j.K
    public final <I, O> androidx.view.result.h<I> registerForActivityResult(@j.N AbstractC41201a<I, O> abstractC41201a, @j.N androidx.view.result.a<O> aVar) {
        return prepareCallInternal(abstractC41201a, new h(), aVar);
    }

    public void registerForContextMenu(@j.N View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@j.N String[] strArr, int i12) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f46351D == null) {
            parentFragmentManager.f46384v.getClass();
            return;
        }
        parentFragmentManager.f46352E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i12));
        parentFragmentManager.f46351D.b(strArr);
    }

    @j.N
    public final ActivityC22955m requireActivity() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            return activityC22955mL1;
        }
        throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " not attached to an activity."));
    }

    @j.N
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " does not have any arguments."));
    }

    @j.N
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " not attached to a context."));
    }

    @j.N
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @j.N
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " not attached to a host."));
    }

    @j.N
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @j.N
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.i0(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.f46354G = false;
        fragmentManager.f46355H = false;
        fragmentManager.f46361N.f46615N = false;
        fragmentManager.w(1);
    }

    public void setAllowEnterTransitionOverlap(boolean z12) {
        ensureAnimationInfo().f46337p = Boolean.valueOf(z12);
    }

    public void setAllowReturnTransitionOverlap(boolean z12) {
        ensureAnimationInfo().f46336o = Boolean.valueOf(z12);
    }

    public void setAnimations(@InterfaceC42145a int i12, @InterfaceC42145a int i13, @InterfaceC42145a int i14, @InterfaceC42145a int i15) {
        if (this.mAnimationInfo == null && i12 == 0 && i13 == 0 && i14 == 0 && i15 == 0) {
            return;
        }
        ensureAnimationInfo().f46323b = i12;
        ensureAnimationInfo().f46324c = i13;
        ensureAnimationInfo().f46325d = i14;
        ensureAnimationInfo().f46326e = i15;
    }

    public void setArguments(@j.P Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@j.P androidx.core.app.P p12) {
        ensureAnimationInfo().f46338q = p12;
    }

    public void setEnterTransition(@j.P Object obj) {
        ensureAnimationInfo().f46330i = obj;
    }

    public void setExitSharedElementCallback(@j.P androidx.core.app.P p12) {
        ensureAnimationInfo().f46339r = p12;
    }

    public void setExitTransition(@j.P Object obj) {
        ensureAnimationInfo().f46332k = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f46341t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z12) {
        if (this.mHasMenu != z12) {
            this.mHasMenu = z12;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.h();
        }
    }

    public void setInitialSavedState(@j.P SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f46306b) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z12) {
        if (this.mMenuVisible != z12) {
            this.mMenuVisible = z12;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.h();
            }
        }
    }

    public void setNextTransition(int i12) {
        if (this.mAnimationInfo == null && i12 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f46327f = i12;
    }

    public void setPopDirection(boolean z12) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f46322a = z12;
    }

    public void setPostOnViewCreatedAlpha(float f12) {
        ensureAnimationInfo().f46340s = f12;
    }

    public void setReenterTransition(@j.P Object obj) {
        ensureAnimationInfo().f46333l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z12) {
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f46587a;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this);
        FragmentStrictMode.f46587a.getClass();
        FragmentStrictMode.b(setRetainInstanceUsageViolation);
        FragmentStrictMode.a(this).f46598a.getClass();
        this.mRetainInstance = z12;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z12) {
            fragmentManager.f46361N.ke(this);
        } else {
            fragmentManager.f46361N.ne(this);
        }
    }

    public void setReturnTransition(@j.P Object obj) {
        ensureAnimationInfo().f46331j = obj;
    }

    public void setSharedElementEnterTransition(@j.P Object obj) {
        ensureAnimationInfo().f46334m = obj;
    }

    public void setSharedElementNames(@j.P ArrayList<String> arrayList, @j.P ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        k kVar = this.mAnimationInfo;
        kVar.f46328g = arrayList;
        kVar.f46329h = arrayList2;
    }

    public void setSharedElementReturnTransition(@j.P Object obj) {
        ensureAnimationInfo().f46335n = obj;
    }

    @Deprecated
    public void setTargetFragment(@j.P Fragment fragment, int i12) {
        if (fragment != null) {
            FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f46587a;
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + fragment + " with request code " + i12 + " for fragment " + this);
            FragmentStrictMode.f46587a.getClass();
            FragmentStrictMode.b(setTargetFragmentUsageViolation);
            FragmentStrictMode.a(this).f46598a.getClass();
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment(false)) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i12;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z12) {
        FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f46587a;
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, "Attempting to set user visible hint to " + z12 + " for fragment " + this);
        FragmentStrictMode.f46587a.getClass();
        FragmentStrictMode.b(setUserVisibleHintViolation);
        FragmentStrictMode.a(this).f46598a.getClass();
        boolean z13 = false;
        if (!this.mUserVisibleHint && z12 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            E eI2 = fragmentManager.i(this);
            Fragment fragment = eI2.f46294c;
            if (fragment.mDeferStart) {
                if (fragmentManager.f46364b) {
                    fragmentManager.f46357J = true;
                } else {
                    fragment.mDeferStart = false;
                    eI2.i();
                }
            }
        }
        this.mUserVisibleHint = z12;
        if (this.mState < 5 && !z12) {
            z13 = true;
        }
        this.mDeferStart = z13;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z12);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@j.N String str) {
        r<?> rVar = this.mHost;
        if (rVar != null) {
            return rVar.g(str);
        }
        return false;
    }

    public void startActivity(@j.N Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@j.N Intent intent, int i12) {
        startActivityForResult(intent, i12, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@j.N IntentSender intentSender, int i12, @j.P Intent intent, int i13, int i14, int i15, @j.P Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " not attached to Activity"));
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            Objects.toString(intentSender);
            Objects.toString(intent);
            Objects.toString(bundle);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f46350C == null) {
            r<?> rVar = parentFragmentManager.f46384v;
            if (i12 == -1) {
                rVar.f46583b.startIntentSenderForResult(intentSender, i12, intent, i13, i14, i15, bundle);
                return;
            } else {
                rVar.getClass();
                throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            } else {
                intent2 = intent;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                bundle.toString();
                intent2.toString();
                Objects.toString(this);
            }
            intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest.a aVar = new IntentSenderRequest.a(intentSender);
        aVar.f21248a = intent2;
        aVar.f21250c = i14;
        aVar.f21249b = i13;
        IntentSenderRequest intentSenderRequest = new IntentSenderRequest(intentSender, aVar.f21248a, aVar.f21249b, aVar.f21250c);
        parentFragmentManager.f46352E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i12));
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        parentFragmentManager.f46350C.b(intentSenderRequest);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f46342u) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f46342u = false;
        } else if (Looper.myLooper() != this.mHost.f46585d.getLooper()) {
            this.mHost.f46585d.postAtFrontOfQueue(new d());
        } else {
            callStartTransitionListener(true);
        }
    }

    @j.N
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(@j.N View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {

        @j.N
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final Bundle f46306b;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.f46306b = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@j.N Parcel parcel, int i12) {
            parcel.writeBundle(this.f46306b);
        }

        public SavedState(@j.N Parcel parcel, @j.P ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f46306b = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    @j.P
    private Fragment getTargetFragment(boolean z12) {
        String str;
        if (z12) {
            FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f46587a;
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this);
            FragmentStrictMode.f46587a.getClass();
            FragmentStrictMode.b(getTargetFragmentUsageViolation);
            FragmentStrictMode.a(this).f46598a.getClass();
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.f46365c.b(str);
    }

    @j.N
    @Deprecated
    public static Fragment instantiate(@j.N Context context, @j.N String str, @j.P Bundle bundle) throws IllegalAccessException, java.lang.InstantiationException, IllegalArgumentException, InvocationTargetException {
        try {
            Fragment fragmentNewInstance = C22959q.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e12) {
            throw new InstantiationException(AK.c.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e12);
        } catch (java.lang.InstantiationException e13) {
            throw new InstantiationException(AK.c.k("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e13);
        } catch (NoSuchMethodException e14) {
            throw new InstantiationException(AK.c.k("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e14);
        } catch (InvocationTargetException e15) {
            throw new InstantiationException(AK.c.k("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e15);
        }
    }

    @j.N
    public final String getString(@j.e0 int i12, @j.P Object... objArr) {
        return getResources().getString(i12, objArr);
    }

    public final void postponeEnterTransition(long j12, @j.N TimeUnit timeUnit) {
        ensureAnimationInfo().f46342u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.f46384v.f46585d;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j12));
    }

    @j.N
    @j.K
    public final <I, O> androidx.view.result.h<I> registerForActivityResult(@j.N AbstractC41201a<I, O> abstractC41201a, @j.N androidx.view.result.j jVar, @j.N androidx.view.result.a<O> aVar) {
        return prepareCallInternal(abstractC41201a, new i(jVar), aVar);
    }

    public void startActivity(@j.N Intent intent, @j.P Bundle bundle) {
        r<?> rVar = this.mHost;
        if (rVar == null) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " not attached to Activity"));
        }
        androidx.core.content.d.startActivity(rVar.f46584c, intent, bundle);
    }

    @Deprecated
    public void startActivityForResult(@j.N Intent intent, int i12, @j.P Bundle bundle) {
        if (this.mHost == null) {
            throw new IllegalStateException(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " not attached to Activity"));
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.f46349B != null) {
            parentFragmentManager.f46352E.addLast(new FragmentManager.LaunchedFragmentInfo(this.mWho, i12));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.f46349B.b(intent);
            return;
        }
        r<?> rVar = parentFragmentManager.f46384v;
        if (i12 == -1) {
            androidx.core.content.d.startActivity(rVar.f46584c, intent, bundle);
        } else {
            rVar.getClass();
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @j.N
    @RestrictTo
    @Deprecated
    public LayoutInflater getLayoutInflater(@j.P Bundle bundle) {
        r<?> rVar = this.mHost;
        if (rVar != null) {
            LayoutInflater layoutInflaterF = rVar.f();
            layoutInflaterF.setFactory2(this.mChildFragmentManager.f46368f);
            return layoutInflaterF;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @InterfaceC42153i
    @j.K
    @Deprecated
    public void onAttach(@j.N Activity activity) {
        this.mCalled = true;
    }

    @InterfaceC42153i
    @j.j0
    @Deprecated
    public void onInflate(@j.N Activity activity, @j.N AttributeSet attributeSet, @j.P Bundle bundle) {
        this.mCalled = true;
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(Lifecycle.Event.ON_CREATE);
                return;
            }
            return;
        }
        throw new o0(androidx.compose.ui.graphics.colorspace.e.m("Fragment ", this, " did not call through to super.onViewStateRestored()"));
    }

    @InterfaceC42159o
    public Fragment(@j.I int i12) {
        this();
        this.mContentLayoutId = i12;
    }

    @j.K
    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @j.K
    @Deprecated
    public void onAttachFragment(@j.N Fragment fragment) {
    }

    @j.K
    public void onHiddenChanged(boolean z12) {
    }

    public void onMultiWindowModeChanged(boolean z12) {
    }

    @j.K
    @Deprecated
    public void onOptionsMenuClosed(@j.N Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z12) {
    }

    @j.K
    @Deprecated
    public void onPrepareOptionsMenu(@j.N Menu menu) {
    }

    @j.K
    public void onPrimaryNavigationFragmentChanged(boolean z12) {
    }

    @j.K
    public void onSaveInstanceState(@j.N Bundle bundle) {
    }

    @j.K
    @Deprecated
    public void onCreateOptionsMenu(@j.N Menu menu, @j.N MenuInflater menuInflater) {
    }

    @j.K
    public void onViewCreated(@j.N View view, @j.P Bundle bundle) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i12, @j.N String[] strArr, @j.N int[] iArr) {
    }
}
