package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
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

/* loaded from: classes6.dex */
public class SupportMapFragment extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public final b f354335f0 = new b(this);

    @VisibleForTesting
    public static class a implements InterfaceC39665k {

        /* renamed from: a, reason: collision with root package name */
        public final SupportMapFragment f354336a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC39651d f354337b;

        public a(SupportMapFragment supportMapFragment, InterfaceC39651d interfaceC39651d) {
            this.f354337b = interfaceC39651d;
            C36729v.j(supportMapFragment);
            this.f354336a = supportMapFragment;
        }

        @Override // com.google.android.gms.dynamic.e
        public final void c(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                n0.b(bundle, bundle2);
                this.f354337b.c(bundle2);
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
                Bundle arguments = this.f354336a.getArguments();
                if (arguments != null && arguments.containsKey("MapOptions")) {
                    n0.c(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.f354337b.d(bundle2);
                n0.b(bundle2, bundle);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void e() {
            try {
                this.f354337b.e();
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
                this.f354337b.u(new com.google.android.gms.dynamic.f(activity), googleMapOptions, bundle3);
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
                com.google.android.gms.dynamic.d dVarI = this.f354337b.i(new com.google.android.gms.dynamic.f(layoutInflater), new com.google.android.gms.dynamic.f(viewGroup), bundle2);
                n0.b(bundle2, bundle);
                return (View) com.google.android.gms.dynamic.f.g4(dVarI);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onDestroyView() {
            try {
                this.f354337b.onDestroyView();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onLowMemory() {
            try {
                this.f354337b.onLowMemory();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onPause() {
            try {
                this.f354337b.onPause();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onResume() {
            try {
                this.f354337b.onResume();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStart() {
            try {
                this.f354337b.onStart();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStop() {
            try {
                this.f354337b.onStop();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }
    }

    @VisibleForTesting
    public static class b extends com.google.android.gms.dynamic.a<a> {

        /* renamed from: e, reason: collision with root package name */
        public final SupportMapFragment f354338e;

        /* renamed from: f, reason: collision with root package name */
        public com.google.android.gms.dynamic.g<a> f354339f;

        /* renamed from: g, reason: collision with root package name */
        public Activity f354340g;

        /* renamed from: h, reason: collision with root package name */
        public final ArrayList f354341h = new ArrayList();

        @VisibleForTesting
        public b(SupportMapFragment supportMapFragment) {
            this.f354338e = supportMapFragment;
        }

        @Override // com.google.android.gms.dynamic.a
        public final void a(com.google.android.gms.dynamic.g<a> gVar) {
            this.f354339f = gVar;
            m();
        }

        public final void m() {
            Activity activity = this.f354340g;
            if (activity == null || this.f354339f == null || this.f349638a != null) {
                return;
            }
            try {
                try {
                    C36809f.a(activity);
                    InterfaceC39651d interfaceC39651dS2 = o0.a(this.f354340g).S2(new com.google.android.gms.dynamic.f(this.f354340g));
                    if (interfaceC39651dS2 == null) {
                        return;
                    }
                    this.f354339f.a(new a(this.f354338e, interfaceC39651dS2));
                    ArrayList arrayList = this.f354341h;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        InterfaceC36810g interfaceC36810g = (InterfaceC36810g) it.next();
                        a aVar = (a) this.f349638a;
                        aVar.getClass();
                        try {
                            aVar.f354337b.b(new BinderC36837z(interfaceC36810g));
                        } catch (RemoteException e12) {
                            throw new RuntimeRemoteException(e12);
                        }
                    }
                    arrayList.clear();
                } catch (GooglePlayServicesNotAvailableException unused) {
                }
            } catch (RemoteException e13) {
                throw new RuntimeRemoteException(e13);
            }
        }
    }

    public final void b5(InterfaceC36810g interfaceC36810g) {
        C36729v.e("getMapAsync must be called on the main thread.");
        b bVar = this.f354335f0;
        com.google.android.gms.dynamic.e eVar = bVar.f349638a;
        if (eVar == null) {
            bVar.f354341h.add(interfaceC36810g);
            return;
        }
        try {
            ((a) eVar).f354337b.b(new BinderC36837z(interfaceC36810g));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        b bVar = this.f354335f0;
        bVar.f354340g = activity;
        bVar.m();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f354335f0.b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayoutC = this.f354335f0.c(layoutInflater, viewGroup, bundle);
        frameLayoutC.setClickable(true);
        return frameLayoutC;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f354335f0.d();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        b bVar = this.f354335f0;
        com.google.android.gms.dynamic.e eVar = bVar.f349638a;
        if (eVar != null) {
            eVar.onDestroyView();
        } else {
            bVar.k(2);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        b bVar = this.f354335f0;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            bVar.f354340g = activity;
            bVar.m();
            GoogleMapOptions googleMapOptionsH = GoogleMapOptions.h(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsH);
            bVar.e(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        com.google.android.gms.dynamic.e eVar = this.f354335f0.f349638a;
        if (eVar != null) {
            eVar.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        b bVar = this.f354335f0;
        com.google.android.gms.dynamic.e eVar = bVar.f349638a;
        if (eVar != null) {
            eVar.onPause();
        } else {
            bVar.k(5);
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f354335f0.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f354335f0.g(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f354335f0.h();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        this.f354335f0.i();
        super.onStop();
    }
}
