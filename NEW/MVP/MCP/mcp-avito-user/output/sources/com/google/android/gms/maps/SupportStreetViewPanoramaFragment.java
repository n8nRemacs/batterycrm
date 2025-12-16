package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import dY0.InterfaceC39659h;
import dY0.InterfaceC39667l;
import dY0.n0;
import dY0.o0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class SupportStreetViewPanoramaFragment extends Fragment {

    /* renamed from: f0, reason: collision with root package name */
    public final b f354342f0 = new b(this);

    @VisibleForTesting
    public static class a implements InterfaceC39667l {

        /* renamed from: a, reason: collision with root package name */
        public final SupportStreetViewPanoramaFragment f354343a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC39659h f354344b;

        public a(SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment, InterfaceC39659h interfaceC39659h) {
            C36729v.j(interfaceC39659h);
            this.f354344b = interfaceC39659h;
            C36729v.j(supportStreetViewPanoramaFragment);
            this.f354343a = supportStreetViewPanoramaFragment;
        }

        public final void a(InterfaceC36811h interfaceC36811h) {
            try {
                this.f354344b.q(new A(interfaceC36811h));
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void c(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                n0.b(bundle, bundle2);
                this.f354344b.c(bundle2);
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
                Bundle arguments = this.f354343a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    n0.c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.f354344b.d(bundle2);
                n0.b(bundle2, bundle);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void e() {
            try {
                this.f354344b.e();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void f(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                Bundle bundle3 = new Bundle();
                n0.b(bundle2, bundle3);
                this.f354344b.f2(new com.google.android.gms.dynamic.f(activity), bundle3);
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
                com.google.android.gms.dynamic.d dVarI = this.f354344b.i(new com.google.android.gms.dynamic.f(layoutInflater), new com.google.android.gms.dynamic.f(viewGroup), bundle2);
                n0.b(bundle2, bundle);
                return (View) com.google.android.gms.dynamic.f.g4(dVarI);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onDestroyView() {
            try {
                this.f354344b.onDestroyView();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onLowMemory() {
            try {
                this.f354344b.onLowMemory();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onPause() {
            try {
                this.f354344b.onPause();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onResume() {
            try {
                this.f354344b.onResume();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStart() {
            try {
                this.f354344b.onStart();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStop() {
            try {
                this.f354344b.onStop();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }
    }

    @VisibleForTesting
    public static class b extends com.google.android.gms.dynamic.a<a> {

        /* renamed from: e, reason: collision with root package name */
        public final SupportStreetViewPanoramaFragment f354345e;

        /* renamed from: f, reason: collision with root package name */
        public com.google.android.gms.dynamic.g<a> f354346f;

        /* renamed from: g, reason: collision with root package name */
        public Activity f354347g;

        /* renamed from: h, reason: collision with root package name */
        public final ArrayList f354348h = new ArrayList();

        @VisibleForTesting
        public b(SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment) {
            this.f354345e = supportStreetViewPanoramaFragment;
        }

        @Override // com.google.android.gms.dynamic.a
        public final void a(com.google.android.gms.dynamic.g<a> gVar) {
            this.f354346f = gVar;
            m();
        }

        public final void m() {
            Activity activity = this.f354347g;
            if (activity == null || this.f354346f == null || this.f349638a != null) {
                return;
            }
            try {
                C36809f.a(activity);
                this.f354346f.a(new a(this.f354345e, o0.a(this.f354347g).F2(new com.google.android.gms.dynamic.f(this.f354347g))));
                ArrayList arrayList = this.f354348h;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((a) this.f349638a).a((InterfaceC36811h) it.next());
                }
                arrayList.clear();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        b bVar = this.f354342f0;
        bVar.f354347g = activity;
        bVar.m();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f354342f0.b(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f354342f0.c(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f354342f0.d();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        b bVar = this.f354342f0;
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
        b bVar = this.f354342f0;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            bVar.f354347g = activity;
            bVar.m();
            bVar.e(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        com.google.android.gms.dynamic.e eVar = this.f354342f0.f349638a;
        if (eVar != null) {
            eVar.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        b bVar = this.f354342f0;
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
        this.f354342f0.f();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f354342f0.g(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f354342f0.h();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        this.f354342f0.i();
        super.onStop();
    }
}
