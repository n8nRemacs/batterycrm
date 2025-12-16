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

@TargetApi(11)
/* renamed from: com.google.android.gms.maps.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class FragmentC36815l extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public final b f354367b = new b(this);

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.l$a */
    public static class a implements InterfaceC39667l {

        /* renamed from: a, reason: collision with root package name */
        public final FragmentC36815l f354368a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC39659h f354369b;

        public a(FragmentC36815l fragmentC36815l, InterfaceC39659h interfaceC39659h) {
            C36729v.j(interfaceC39659h);
            this.f354369b = interfaceC39659h;
            C36729v.j(fragmentC36815l);
            this.f354368a = fragmentC36815l;
        }

        public final void a(InterfaceC36811h interfaceC36811h) {
            try {
                this.f354369b.q(new BinderC36834w(interfaceC36811h));
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void c(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                n0.b(bundle, bundle2);
                this.f354369b.c(bundle2);
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
                Bundle arguments = this.f354368a.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    n0.c(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.f354369b.d(bundle2);
                n0.b(bundle2, bundle);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void e() {
            try {
                this.f354369b.e();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void f(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                Bundle bundle3 = new Bundle();
                n0.b(bundle2, bundle3);
                this.f354369b.f2(new com.google.android.gms.dynamic.f(activity), bundle3);
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
                com.google.android.gms.dynamic.d dVarI = this.f354369b.i(new com.google.android.gms.dynamic.f(layoutInflater), new com.google.android.gms.dynamic.f(viewGroup), bundle2);
                n0.b(bundle2, bundle);
                return (View) com.google.android.gms.dynamic.f.g4(dVarI);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onDestroyView() {
            try {
                this.f354369b.onDestroyView();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onLowMemory() {
            try {
                this.f354369b.onLowMemory();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onPause() {
            try {
                this.f354369b.onPause();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onResume() {
            try {
                this.f354369b.onResume();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStart() {
            try {
                this.f354369b.onStart();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStop() {
            try {
                this.f354369b.onStop();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.l$b */
    public static class b extends com.google.android.gms.dynamic.a<a> {

        /* renamed from: e, reason: collision with root package name */
        public final FragmentC36815l f354370e;

        /* renamed from: f, reason: collision with root package name */
        public com.google.android.gms.dynamic.g<a> f354371f;

        /* renamed from: g, reason: collision with root package name */
        public Activity f354372g;

        /* renamed from: h, reason: collision with root package name */
        public final ArrayList f354373h = new ArrayList();

        @VisibleForTesting
        public b(FragmentC36815l fragmentC36815l) {
            this.f354370e = fragmentC36815l;
        }

        @Override // com.google.android.gms.dynamic.a
        public final void a(com.google.android.gms.dynamic.g<a> gVar) {
            this.f354371f = gVar;
            m();
        }

        public final void m() {
            Activity activity = this.f354372g;
            if (activity == null || this.f354371f == null || this.f349638a != null) {
                return;
            }
            try {
                C36809f.a(activity);
                this.f354371f.a(new a(this.f354370e, o0.a(this.f354372g).F2(new com.google.android.gms.dynamic.f(this.f354372g))));
                ArrayList arrayList = this.f354373h;
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

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(FragmentC36815l.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        b bVar = this.f354367b;
        bVar.f354372g = activity;
        bVar.m();
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f354367b.b(bundle);
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f354367b.c(layoutInflater, viewGroup, bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        this.f354367b.d();
        super.onDestroy();
    }

    @Override // android.app.Fragment
    public final void onDestroyView() {
        b bVar = this.f354367b;
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
        b bVar = this.f354367b;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            bVar.f354372g = activity;
            bVar.m();
            bVar.e(activity, new Bundle(), bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        com.google.android.gms.dynamic.e eVar = this.f354367b.f349638a;
        if (eVar != null) {
            eVar.onLowMemory();
        }
        super.onLowMemory();
    }

    @Override // android.app.Fragment
    public final void onPause() {
        b bVar = this.f354367b;
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
        this.f354367b.f();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(FragmentC36815l.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.f354367b.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f354367b.h();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        this.f354367b.i();
        super.onStop();
    }
}
