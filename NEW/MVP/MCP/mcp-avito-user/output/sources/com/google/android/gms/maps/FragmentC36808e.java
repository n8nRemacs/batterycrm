package com.google.android.gms.maps;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import dY0.InterfaceC39651d;
import dY0.InterfaceC39665k;
import dY0.n0;
import dY0.o0;
import java.util.ArrayList;
import java.util.Iterator;

@TargetApi(11)
/* renamed from: com.google.android.gms.maps.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class FragmentC36808e extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public final b f354356b = new b(this);

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.e$a */
    public static class a implements InterfaceC39665k {

        /* renamed from: a, reason: collision with root package name */
        public final FragmentC36808e f354357a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC39651d f354358b;

        public a(FragmentC36808e fragmentC36808e, InterfaceC39651d interfaceC39651d) {
            this.f354358b = interfaceC39651d;
            C36729v.j(fragmentC36808e);
            this.f354357a = fragmentC36808e;
        }

        public final void a(InterfaceC36810g interfaceC36810g) {
            try {
                this.f354358b.b(new BinderC36829q(interfaceC36810g));
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void c(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                n0.b(bundle, bundle2);
                this.f354358b.c(bundle2);
                n0.b(bundle2, bundle);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void d(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                n0.b(bundle, bundle2);
                Bundle arguments = this.f354357a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    n0.c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.f354358b.d(bundle2);
                n0.b(bundle2, bundle);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void e() {
            try {
                this.f354358b.e();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void f(Activity activity, Bundle bundle, Bundle bundle2) {
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                n0.b(bundle2, bundle3);
                this.f354358b.u(new com.google.android.gms.dynamic.f(activity), googleMapOptions, bundle3);
                n0.b(bundle3, bundle2);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final View g(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                n0.b(bundle, bundle2);
                com.google.android.gms.dynamic.d dVarI = this.f354358b.i(new com.google.android.gms.dynamic.f(layoutInflater), new com.google.android.gms.dynamic.f(viewGroup), bundle2);
                n0.b(bundle2, bundle);
                return (View) com.google.android.gms.dynamic.f.g4(dVarI);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onDestroyView() {
            try {
                this.f354358b.onDestroyView();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onLowMemory() {
            try {
                this.f354358b.onLowMemory();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onPause() {
            try {
                this.f354358b.onPause();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onResume() {
            try {
                this.f354358b.onResume();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStart() {
            try {
                this.f354358b.onStart();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStop() {
            try {
                this.f354358b.onStop();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.e$b */
    public static class b extends com.google.android.gms.dynamic.a<a> {

        /* renamed from: e, reason: collision with root package name */
        public final FragmentC36808e f354359e;

        /* renamed from: f, reason: collision with root package name */
        public com.google.android.gms.dynamic.g<a> f354360f;

        /* renamed from: g, reason: collision with root package name */
        public Activity f354361g;

        /* renamed from: h, reason: collision with root package name */
        public final ArrayList f354362h = new ArrayList();

        @VisibleForTesting
        public b(FragmentC36808e fragmentC36808e) {
            this.f354359e = fragmentC36808e;
        }

        @Override // com.google.android.gms.dynamic.a
        public final void a(com.google.android.gms.dynamic.g<a> gVar) {
            this.f354360f = gVar;
            m();
        }

        public final void m() {
            Activity activity = this.f354361g;
            if (activity == null || this.f354360f == null || this.f349638a != null) {
                return;
            }
            try {
                C36809f.a(activity);
                InterfaceC39651d interfaceC39651dS2 = o0.a(this.f354361g).S2(new com.google.android.gms.dynamic.f(this.f354361g));
                if (interfaceC39651dS2 == null) {
                    return;
                }
                this.f354360f.a(new a(this.f354359e, interfaceC39651dS2));
                ArrayList arrayList = this.f354362h;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((a) this.f349638a).a((InterfaceC36810g) it.next());
                }
                arrayList.clear();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(FragmentC36808e.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        b bVar = this.f354356b;
        bVar.f354361g = activity;
        bVar.m();
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f354356b.b(bundle);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayoutC = this.f354356b.c(layoutInflater, viewGroup, bundle);
        frameLayoutC.setClickable(true);
        return frameLayoutC;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        this.f354356b.d();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        b bVar = this.f354356b;
        com.google.android.gms.dynamic.e eVar = bVar.f349638a;
        if (eVar != null) {
            eVar.onDestroyView();
        } else {
            bVar.k(2);
        }
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    @SuppressLint({"NewApi"})
    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        b bVar = this.f354356b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            bVar.f354361g = activity;
            bVar.m();
            GoogleMapOptions googleMapOptionsH = GoogleMapOptions.h(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsH);
            bVar.e(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        com.google.android.gms.dynamic.e eVar = this.f354356b.f349638a;
        if (eVar != null) {
            eVar.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public final void onPause() {
        b bVar = this.f354356b;
        com.google.android.gms.dynamic.e eVar = bVar.f349638a;
        if (eVar != null) {
            eVar.onPause();
        } else {
            bVar.k(5);
        }
        super.onPause();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f354356b.f();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(FragmentC36808e.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f354356b.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f354356b.h();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        this.f354356b.i();
        super.onStop();
    }
}
