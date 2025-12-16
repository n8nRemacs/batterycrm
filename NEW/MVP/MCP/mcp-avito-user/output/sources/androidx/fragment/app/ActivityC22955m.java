package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.platform.Z0;
import androidx.core.app.C22744b;
import androidx.core.util.InterfaceC22791e;
import androidx.core.view.InterfaceC22842v;
import androidx.view.C22985S;
import androidx.view.C23485c;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.S0;
import androidx.view.T0;
import j.InterfaceC42153i;
import j.InterfaceC42159o;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: FragmentActivity.java */
/* renamed from: androidx.fragment.app.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC22955m extends androidx.view.n implements C22744b.i, C22744b.k {
    boolean mCreated;
    final C22985S mFragmentLifecycleRegistry;
    final C22958p mFragments;
    boolean mResumed;
    boolean mStopped;

    /* compiled from: FragmentActivity.java */
    /* renamed from: androidx.fragment.app.m$a */
    public class a extends r<ActivityC22955m> implements androidx.core.content.j, androidx.core.content.k, androidx.core.app.F, androidx.core.app.H, T0, androidx.view.C, androidx.view.result.k, InterfaceC23487e, A, InterfaceC22842v {
        public a() {
            super(ActivityC22955m.this);
        }

        @Override // androidx.fragment.app.A
        public final void a(@j.N Fragment fragment) {
            ActivityC22955m.this.onAttachFragment(fragment);
        }

        @Override // androidx.core.view.InterfaceC22842v
        public final void addMenuProvider(@j.N androidx.core.view.C c12) {
            ActivityC22955m.this.addMenuProvider(c12);
        }

        @Override // androidx.core.content.j
        public final void addOnConfigurationChangedListener(@j.N InterfaceC22791e<Configuration> interfaceC22791e) {
            ActivityC22955m.this.addOnConfigurationChangedListener(interfaceC22791e);
        }

        @Override // androidx.core.app.F
        public final void addOnMultiWindowModeChangedListener(@j.N InterfaceC22791e<androidx.core.app.u> interfaceC22791e) {
            ActivityC22955m.this.addOnMultiWindowModeChangedListener(interfaceC22791e);
        }

        @Override // androidx.core.app.H
        public final void addOnPictureInPictureModeChangedListener(@j.N InterfaceC22791e<androidx.core.app.L> interfaceC22791e) {
            ActivityC22955m.this.addOnPictureInPictureModeChangedListener(interfaceC22791e);
        }

        @Override // androidx.core.content.k
        public final void addOnTrimMemoryListener(@j.N InterfaceC22791e<Integer> interfaceC22791e) {
            ActivityC22955m.this.addOnTrimMemoryListener(interfaceC22791e);
        }

        @Override // androidx.fragment.app.r, androidx.fragment.app.AbstractC22957o
        @j.P
        public final View b(int i12) {
            return ActivityC22955m.this.findViewById(i12);
        }

        @Override // androidx.fragment.app.r, androidx.fragment.app.AbstractC22957o
        public final boolean c() {
            Window window = ActivityC22955m.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.r
        public final void d(@j.N PrintWriter printWriter, @j.P String[] strArr) {
            ActivityC22955m.this.dump("  ", null, printWriter, strArr);
        }

        @Override // androidx.fragment.app.r
        public final ActivityC22955m e() {
            return ActivityC22955m.this;
        }

        @Override // androidx.fragment.app.r
        @j.N
        public final LayoutInflater f() {
            ActivityC22955m activityC22955m = ActivityC22955m.this;
            return activityC22955m.getLayoutInflater().cloneInContext(activityC22955m);
        }

        @Override // androidx.fragment.app.r
        public final boolean g(@j.N String str) {
            return C22744b.b(ActivityC22955m.this, str);
        }

        @Override // androidx.view.result.k
        @j.N
        public final androidx.view.result.j getActivityResultRegistry() {
            return ActivityC22955m.this.getActivityResultRegistry();
        }

        @Override // androidx.view.InterfaceC22983P
        @j.N
        public final Lifecycle getLifecycle() {
            return ActivityC22955m.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.view.C
        @j.N
        /* renamed from: getOnBackPressedDispatcher */
        public final androidx.view.y getF21241d() {
            return ActivityC22955m.this.getF21241d();
        }

        @Override // androidx.view.InterfaceC23487e
        @j.N
        public final C23485c getSavedStateRegistry() {
            return ActivityC22955m.this.getSavedStateRegistry();
        }

        @Override // androidx.view.T0
        @j.N
        /* renamed from: getViewModelStore */
        public final S0 getF42820b() {
            return ActivityC22955m.this.getF42820b();
        }

        @Override // androidx.fragment.app.r
        public final void h() {
            ActivityC22955m.this.invalidateMenu();
        }

        @Override // androidx.core.view.InterfaceC22842v
        public final void removeMenuProvider(@j.N androidx.core.view.C c12) {
            ActivityC22955m.this.removeMenuProvider(c12);
        }

        @Override // androidx.core.content.j
        public final void removeOnConfigurationChangedListener(@j.N InterfaceC22791e<Configuration> interfaceC22791e) {
            ActivityC22955m.this.removeOnConfigurationChangedListener(interfaceC22791e);
        }

        @Override // androidx.core.app.F
        public final void removeOnMultiWindowModeChangedListener(@j.N InterfaceC22791e<androidx.core.app.u> interfaceC22791e) {
            ActivityC22955m.this.removeOnMultiWindowModeChangedListener(interfaceC22791e);
        }

        @Override // androidx.core.app.H
        public final void removeOnPictureInPictureModeChangedListener(@j.N InterfaceC22791e<androidx.core.app.L> interfaceC22791e) {
            ActivityC22955m.this.removeOnPictureInPictureModeChangedListener(interfaceC22791e);
        }

        @Override // androidx.core.content.k
        public final void removeOnTrimMemoryListener(@j.N InterfaceC22791e<Integer> interfaceC22791e) {
            ActivityC22955m.this.removeOnTrimMemoryListener(interfaceC22791e);
        }
    }

    public ActivityC22955m() {
        this.mFragments = new C22958p(new a());
        this.mFragmentLifecycleRegistry = new C22985S(this, true);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().c("android:support:lifecycle", new Z0(this, 1));
        addOnConfigurationChangedListener(new C22953k(this, 0));
        addOnNewIntentListener(new C22953k(this, 1));
        addOnContextAvailableListener(new g.f() { // from class: androidx.fragment.app.l
            @Override // g.f
            public final void a(androidx.view.n nVar) {
                this.f46568a.lambda$init$3(nVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$1(Configuration configuration) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$init$2(Intent intent) {
        this.mFragments.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$init$3(Context context) {
        r<?> rVar = this.mFragments.f46581a;
        rVar.f46586e.c(rVar, rVar, null);
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.f46365c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), state);
                }
                P p12 = fragment.mViewLifecycleOwner;
                Lifecycle.State state2 = Lifecycle.State.f46682e;
                if (p12 != null) {
                    p12.b();
                    if (p12.f46498f.f46705d.a(state2)) {
                        fragment.mViewLifecycleOwner.f46498f.h(state);
                        zMarkState = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f46705d.a(state2)) {
                    fragment.mLifecycleRegistry.h(state);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    @j.P
    public final View dispatchFragmentsOnCreateView(@j.P View view, @j.N String str, @j.N Context context, @j.N AttributeSet attributeSet) {
        return this.mFragments.f46581a.f46586e.f46368f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@j.N String str, @j.P FileDescriptor fileDescriptor, @j.N PrintWriter printWriter, @j.P String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f46581a.f46586e.y(str, fileDescriptor, printWriter, strArr);
        }
    }

    @j.N
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f46581a.f46586e;
    }

    @j.N
    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    public void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), Lifecycle.State.f46681d)) {
        }
    }

    @Override // androidx.view.n, android.app.Activity
    @InterfaceC42153i
    public void onActivityResult(int i12, int i13, @j.P Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i12, i13, intent);
    }

    @Override // androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public void onCreate(@j.P Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_CREATE);
        FragmentManager fragmentManager = this.mFragments.f46581a.f46586e;
        fragmentManager.f46354G = false;
        fragmentManager.f46355H = false;
        fragmentManager.f46361N.f46615N = false;
        fragmentManager.w(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @j.P
    public View onCreateView(@j.P View view, @j.N String str, @j.N Context context, @j.N AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f46581a.f46586e.n();
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_DESTROY);
    }

    @Override // androidx.view.n, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i12, @j.N MenuItem menuItem) {
        if (super.onMenuItemSelected(i12, menuItem)) {
            return true;
        }
        if (i12 == 6) {
            return this.mFragments.f46581a.f46586e.l(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f46581a.f46586e.w(5);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.view.n, android.app.Activity
    @InterfaceC42153i
    public void onRequestPermissionsResult(int i12, @j.N String[] strArr, @j.N int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i12, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f46581a.f46586e.B(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_RESUME);
        FragmentManager fragmentManager = this.mFragments.f46581a.f46586e;
        fragmentManager.f46354G = false;
        fragmentManager.f46355H = false;
        fragmentManager.f46361N.f46615N = false;
        fragmentManager.w(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            FragmentManager fragmentManager = this.mFragments.f46581a.f46586e;
            fragmentManager.f46354G = false;
            fragmentManager.f46355H = false;
            fragmentManager.f46361N.f46615N = false;
            fragmentManager.w(4);
        }
        this.mFragments.f46581a.f46586e.B(true);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_START);
        FragmentManager fragmentManager2 = this.mFragments.f46581a.f46586e;
        fragmentManager2.f46354G = false;
        fragmentManager2.f46355H = false;
        fragmentManager2.f46361N.f46615N = false;
        fragmentManager2.w(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        FragmentManager fragmentManager = this.mFragments.f46581a.f46586e;
        fragmentManager.f46355H = true;
        fragmentManager.f46361N.f46615N = true;
        fragmentManager.w(4);
        this.mFragmentLifecycleRegistry.f(Lifecycle.Event.ON_STOP);
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @j.P
    public View onCreateView(@j.N String str, @j.N Context context, @j.N AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @InterfaceC42159o
    public ActivityC22955m(@j.I int i12) {
        super(i12);
        this.mFragments = new C22958p(new a());
        this.mFragmentLifecycleRegistry = new C22985S(this, true);
        this.mStopped = true;
        init();
    }

    @j.K
    @Deprecated
    public void onAttachFragment(@j.N Fragment fragment) {
    }

    @Override // androidx.core.app.C22744b.k
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i12) {
    }
}
