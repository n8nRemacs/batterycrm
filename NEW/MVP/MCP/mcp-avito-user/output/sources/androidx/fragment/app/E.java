package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.view.Lifecycle;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: FragmentStateManager.java */
/* loaded from: classes.dex */
class E {

    /* renamed from: a, reason: collision with root package name */
    public final C22962u f46292a;

    /* renamed from: b, reason: collision with root package name */
    public final G f46293b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Fragment f46294c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46295d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f46296e = -1;

    /* compiled from: FragmentStateManager.java */
    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46298a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f46298a = iArr;
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46298a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46298a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46298a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public E(@j.N C22962u c22962u, @j.N G g12, @j.N Fragment fragment) {
        this.f46292a = c22962u;
        this.f46293b = g12;
        this.f46294c = fragment;
    }

    public final void a() {
        View view;
        View view2;
        int iIndexOfChild = -1;
        Fragment fragment = this.f46294c;
        Fragment fragmentI = FragmentManager.I(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (fragmentI != null && !fragmentI.equals(parentFragment)) {
            int i12 = fragment.mContainerId;
            FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f46587a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(fragment);
            sb2.append(" within the view of parent fragment ");
            sb2.append(fragmentI);
            sb2.append(" via container with ID ");
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, AK.c.i(i12, " without using parent's childFragmentManager", sb2));
            FragmentStrictMode.f46587a.getClass();
            FragmentStrictMode.b(wrongNestedHierarchyViolation);
            FragmentStrictMode.a(fragment).f46598a.getClass();
        }
        G g12 = this.f46293b;
        g12.getClass();
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            ArrayList<Fragment> arrayList = g12.f46438a;
            int iIndexOf = arrayList.indexOf(fragment);
            int i13 = iIndexOf - 1;
            while (true) {
                if (i13 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = arrayList.get(iIndexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = arrayList.get(i13);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i13--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void b() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f46294c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        E e12 = null;
        G g12 = this.f46293b;
        if (fragment2 != null) {
            E e13 = g12.f46439b.get(fragment2.mWho);
            if (e13 == null) {
                throw new IllegalStateException("Fragment " + fragment + " declared target fragment " + fragment.mTarget + " that does not belong to this FragmentManager!");
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            e12 = e13;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (e12 = g12.f46439b.get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                sb2.append(" declared target fragment ");
                throw new IllegalStateException(AK.c.s(sb2, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
            }
        }
        if (e12 != null) {
            e12.i();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.f46384v;
        fragment.mParentFragment = fragmentManager.f46386x;
        C22962u c22962u = this.f46292a;
        c22962u.g(fragment, false);
        fragment.performAttach();
        c22962u.b(fragment, false);
    }

    public final int c() {
        Object next;
        Fragment fragment = this.f46294c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f46296e;
        int iOrdinal = fragment.mMaxState.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (fragment.mFromLayout) {
            if (fragment.mInLayout) {
                iMin = Math.max(this.f46296e, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f46296e < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            SpecialEffectsController specialEffectsControllerF = SpecialEffectsController.f(viewGroup, fragment.getParentFragmentManager());
            specialEffectsControllerF.getClass();
            SpecialEffectsController.Operation operationD = specialEffectsControllerF.d(fragment);
            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = operationD != null ? operationD.f46507b : null;
            Iterator it = specialEffectsControllerF.f46503c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) next;
                if (kotlin.jvm.internal.L.f(operation.f46508c, fragment) && !operation.f46511f) {
                    break;
                }
            }
            SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) next;
            lifecycleImpact = operation2 != null ? operation2.f46507b : null;
            int i12 = lifecycleImpact == null ? -1 : SpecialEffectsController.c.f46524a[lifecycleImpact.ordinal()];
            if (i12 != -1 && i12 != 1) {
                lifecycleImpact = lifecycleImpact;
            }
        }
        if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.f46514c) {
            iMin = Math.min(iMin, 6);
        } else if (lifecycleImpact == SpecialEffectsController.Operation.LifecycleImpact.f46515d) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
        }
        return iMin;
    }

    public final void d() throws Resources.NotFoundException {
        String resourceName;
        Fragment fragment = this.f46294c;
        if (fragment.mFromLayout) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i12 = fragment.mContainerId;
            if (i12 != 0) {
                if (i12 == -1) {
                    throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.e.m("Cannot create fragment ", fragment, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.f46385w.b(i12);
                if (viewGroup == null) {
                    if (!fragment.mRestored) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    FragmentStrictMode fragmentStrictMode = FragmentStrictMode.f46587a;
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                    FragmentStrictMode.f46587a.getClass();
                    FragmentStrictMode.b(wrongFragmentContainerViolation);
                    FragmentStrictMode.a(fragment).f46598a.getClass();
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                a();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            View view = fragment.mView;
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            if (view.isAttachedToWindow()) {
                C22823h0.A(fragment.mView);
            } else {
                View view2 = fragment.mView;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            fragment.performViewCreated();
            this.f46292a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        viewFindFocus.toString();
                        Objects.toString(fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void e() {
        Fragment fragmentB;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f46294c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z12 = fragment.mRemoving && !fragment.isInBackStack();
        G g12 = this.f46293b;
        if (z12 && !fragment.mBeingSaved) {
            g12.i(null, fragment.mWho);
        }
        if (!z12) {
            C22967z c22967z = g12.f46441d;
            if (!((c22967z.f46610E.containsKey(fragment.mWho) && c22967z.f46613L) ? c22967z.f46614M : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = g12.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        r<?> rVar = fragment.mHost;
        if (rVar instanceof T0) {
            zIsChangingConfigurations = g12.f46441d.f46614M;
        } else {
            ActivityC22955m activityC22955m = rVar.f46584c;
            if (activityC22955m != null) {
                zIsChangingConfigurations = true ^ activityC22955m.isChangingConfigurations();
            }
        }
        if ((z12 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            C22967z c22967z2 = g12.f46441d;
            c22967z2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(fragment);
            }
            c22967z2.me(fragment.mWho, false);
        }
        fragment.performDestroy();
        this.f46292a.d(fragment, false);
        Iterator it = g12.d().iterator();
        while (it.hasNext()) {
            E e12 = (E) it.next();
            if (e12 != null) {
                String str2 = fragment.mWho;
                Fragment fragment2 = e12.f46294c;
                if (str2.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str3 = fragment.mTargetWho;
        if (str3 != null) {
            fragment.mTarget = g12.b(str3);
        }
        g12.h(this);
    }

    public final void f() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f46294c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f46292a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.setValue(null);
        fragment.mInLayout = false;
    }

    public final void g() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        Fragment fragment = this.f46294c;
        if (zIsLoggable) {
            Objects.toString(fragment);
        }
        fragment.performDetach();
        this.f46292a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            C22967z c22967z = this.f46293b.f46441d;
            boolean z12 = true;
            if (c22967z.f46610E.containsKey(fragment.mWho) && c22967z.f46613L) {
                z12 = c22967z.f46614M;
            }
            if (!z12) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(fragment);
        }
        fragment.initState();
    }

    public final void h() {
        Fragment fragment = this.f46294c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f46292a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final void i() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        Bundle bundle;
        ViewGroup viewGroup3;
        boolean z12 = this.f46295d;
        Fragment fragment = this.f46294c;
        if (z12) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(fragment);
                return;
            }
            return;
        }
        try {
            this.f46295d = true;
            boolean z13 = false;
            while (true) {
                int iC2 = c();
                int i12 = fragment.mState;
                G g12 = this.f46293b;
                if (iC2 == i12) {
                    if (!z13 && i12 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(fragment);
                        }
                        C22967z c22967z = g12.f46441d;
                        c22967z.getClass();
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(fragment);
                        }
                        c22967z.me(fragment.mWho, true);
                        g12.h(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            SpecialEffectsController specialEffectsControllerF = SpecialEffectsController.f(viewGroup, fragment.getParentFragmentManager());
                            boolean z14 = fragment.mHidden;
                            SpecialEffectsController.Operation.LifecycleImpact lifecycleImpact = SpecialEffectsController.Operation.LifecycleImpact.f46513b;
                            if (z14) {
                                specialEffectsControllerF.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(fragment);
                                }
                                specialEffectsControllerF.a(SpecialEffectsController.Operation.State.f46520e, lifecycleImpact, this);
                            } else {
                                specialEffectsControllerF.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(fragment);
                                }
                                specialEffectsControllerF.a(SpecialEffectsController.Operation.State.f46519d, lifecycleImpact, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.S(fragment)) {
                            fragmentManager.f46353F = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.q();
                    }
                    this.f46295d = false;
                    return;
                }
                C22962u c22962u = this.f46292a;
                if (iC2 <= i12) {
                    switch (i12 - 1) {
                        case -1:
                            g();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (g12.f46440c.get(fragment.mWho) == null) {
                                    g12.i(l(), fragment.mWho);
                                }
                            }
                            e();
                            break;
                        case 1:
                            f();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            if (fragment.mBeingSaved) {
                                g12.i(l(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                m();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                SpecialEffectsController specialEffectsControllerF2 = SpecialEffectsController.f(viewGroup2, fragment.getParentFragmentManager());
                                specialEffectsControllerF2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(fragment);
                                }
                                specialEffectsControllerF2.a(SpecialEffectsController.Operation.State.f46518c, SpecialEffectsController.Operation.LifecycleImpact.f46515d, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStop();
                            c22962u.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performPause();
                            c22962u.f(fragment, false);
                            break;
                    }
                } else {
                    switch (i12 + 1) {
                        case 0:
                            b();
                            break;
                        case 1:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle2 = fragment.mSavedFragmentState;
                            bundle = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
                            if (!fragment.mIsCreated) {
                                c22962u.h(fragment, bundle, false);
                                fragment.performCreate(bundle);
                                c22962u.c(fragment, bundle, false);
                                break;
                            } else {
                                fragment.mState = 1;
                                fragment.restoreChildFragmentState();
                                break;
                            }
                        case 2:
                            h();
                            d();
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            Bundle bundle3 = fragment.mSavedFragmentState;
                            bundle = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                            fragment.performActivityCreated(bundle);
                            c22962u.a(fragment, bundle, false);
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                SpecialEffectsController specialEffectsControllerF3 = SpecialEffectsController.f(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                SpecialEffectsController.Operation.State.f46517b.getClass();
                                SpecialEffectsController.Operation.State stateB = SpecialEffectsController.Operation.State.a.b(visibility);
                                specialEffectsControllerF3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(fragment);
                                }
                                specialEffectsControllerF3.a(stateB, SpecialEffectsController.Operation.LifecycleImpact.f46514c, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(fragment);
                            }
                            fragment.performStart();
                            c22962u.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            k();
                            break;
                    }
                }
                z13 = true;
            }
        } catch (Throwable th2) {
            this.f46295d = false;
            throw th2;
        }
    }

    public final void j(@j.N ClassLoader classLoader) {
        Fragment fragment = this.f46294c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
        fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
        FragmentState fragmentState = (FragmentState) fragment.mSavedFragmentState.getParcelable(VoiceInfo.STATE);
        if (fragmentState != null) {
            fragment.mTargetWho = fragmentState.f46433m;
            fragment.mTargetRequestCode = fragmentState.f46434n;
            Boolean bool = fragment.mSavedUserVisibleHint;
            if (bool != null) {
                fragment.mUserVisibleHint = bool.booleanValue();
                fragment.mSavedUserVisibleHint = null;
            } else {
                fragment.mUserVisibleHint = fragmentState.f46435o;
            }
        }
        if (fragment.mUserVisibleHint) {
            return;
        }
        fragment.mDeferStart = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r5 = this;
            java.lang.String r0 = "FragmentManager"
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            androidx.fragment.app.Fragment r2 = r5.f46294c
            if (r1 == 0) goto Le
            java.util.Objects.toString(r2)
        Le:
            android.view.View r1 = r2.getFocusedView()
            if (r1 == 0) goto L42
            android.view.View r3 = r2.mView
            if (r1 != r3) goto L19
            goto L23
        L19:
            android.view.ViewParent r3 = r1.getParent()
        L1d:
            if (r3 == 0) goto L42
            android.view.View r4 = r2.mView
            if (r3 != r4) goto L3d
        L23:
            r1.requestFocus()
            r3 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r3)
            if (r0 == 0) goto L42
            r1.toString()
            java.util.Objects.toString(r2)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            java.util.Objects.toString(r0)
            goto L42
        L3d:
            android.view.ViewParent r3 = r3.getParent()
            goto L1d
        L42:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            androidx.fragment.app.u r1 = r5.f46292a
            r3 = 0
            r1.i(r2, r3)
            androidx.fragment.app.G r1 = r5.f46293b
            java.lang.String r3 = r2.mWho
            r1.i(r0, r3)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.E.k():void");
    }

    @j.N
    public final Bundle l() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f46294c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable(VoiceInfo.STATE, new FragmentState(fragment));
        if (fragment.mState > -1) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f46292a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleJ0 = fragment.mChildFragmentManager.j0();
            if (!bundleJ0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleJ0);
            }
            if (fragment.mView != null) {
                m();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void m() {
        Fragment fragment = this.f46294c;
        if (fragment.mView == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragment);
            Objects.toString(fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f46499g.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public E(@j.N C22962u c22962u, @j.N G g12, @j.N ClassLoader classLoader, @j.N C22959q c22959q, @j.N Bundle bundle) {
        this.f46292a = c22962u;
        this.f46293b = g12;
        Fragment fragmentA = ((FragmentState) bundle.getParcelable(VoiceInfo.STATE)).a(c22959q, classLoader);
        this.f46294c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(fragmentA);
        }
    }

    public E(@j.N C22962u c22962u, @j.N G g12, @j.N Fragment fragment, @j.N Bundle bundle) {
        this.f46292a = c22962u;
        this.f46293b = g12;
        this.f46294c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }

    /* compiled from: FragmentStateManager.java */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f46297b;

        public a(View view) {
            this.f46297b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            View view2 = this.f46297b;
            view2.removeOnAttachStateChangeListener(this);
            C22823h0.A(view2);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
