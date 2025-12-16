package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.avito.android.avito_map.lite.google.GoogleMapLiteModeViewImpl;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import dY0.InterfaceC39653e;
import dY0.InterfaceC39665k;
import dY0.n0;
import dY0.o0;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public class MapView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final b f354316b;

    @VisibleForTesting
    public static class a implements InterfaceC39665k {

        /* renamed from: a, reason: collision with root package name */
        public final MapView f354317a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC39653e f354318b;

        /* renamed from: c, reason: collision with root package name */
        public View f354319c;

        public a(MapView mapView, InterfaceC39653e interfaceC39653e) {
            this.f354318b = interfaceC39653e;
            C36729v.j(mapView);
            this.f354317a = mapView;
        }

        @Override // com.google.android.gms.dynamic.e
        public final void c(Bundle bundle) {
            try {
                Bundle bundle2 = new Bundle();
                n0.b(bundle, bundle2);
                this.f354318b.c(bundle2);
                n0.b(bundle2, bundle);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void d(Bundle bundle) {
            MapView mapView = this.f354317a;
            InterfaceC39653e interfaceC39653e = this.f354318b;
            try {
                Bundle bundle2 = new Bundle();
                n0.b(bundle, bundle2);
                interfaceC39653e.d(bundle2);
                n0.b(bundle2, bundle);
                this.f354319c = (View) com.google.android.gms.dynamic.f.g4(interfaceC39653e.getView());
                mapView.removeAllViews();
                mapView.addView(this.f354319c);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void e() {
            try {
                this.f354318b.e();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void f(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.e
        public final View g(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onLowMemory() {
            try {
                this.f354318b.onLowMemory();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onPause() {
            try {
                this.f354318b.onPause();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onResume() {
            try {
                this.f354318b.onResume();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStart() {
            try {
                this.f354318b.onStart();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStop() {
            try {
                this.f354318b.onStop();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }
    }

    @VisibleForTesting
    public static class b extends com.google.android.gms.dynamic.a<a> {

        /* renamed from: e, reason: collision with root package name */
        public final MapView f354320e;

        /* renamed from: f, reason: collision with root package name */
        public final Context f354321f;

        /* renamed from: g, reason: collision with root package name */
        public com.google.android.gms.dynamic.g<a> f354322g;

        /* renamed from: h, reason: collision with root package name */
        public final GoogleMapOptions f354323h;

        /* renamed from: i, reason: collision with root package name */
        public final ArrayList f354324i = new ArrayList();

        @VisibleForTesting
        public b(MapView mapView, Context context, GoogleMapOptions googleMapOptions) {
            this.f354320e = mapView;
            this.f354321f = context;
            this.f354323h = googleMapOptions;
        }

        @Override // com.google.android.gms.dynamic.a
        public final void a(com.google.android.gms.dynamic.g<a> gVar) {
            Context context = this.f354321f;
            this.f354322g = gVar;
            if (this.f349638a == null) {
                try {
                    try {
                        C36809f.a(context);
                        InterfaceC39653e interfaceC39653eY3 = o0.a(context).y3(new com.google.android.gms.dynamic.f(context), this.f354323h);
                        if (interfaceC39653eY3 == null) {
                            return;
                        }
                        this.f354322g.a(new a(this.f354320e, interfaceC39653eY3));
                        ArrayList arrayList = this.f354324i;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            InterfaceC36810g interfaceC36810g = (InterfaceC36810g) it.next();
                            a aVar = (a) this.f349638a;
                            aVar.getClass();
                            try {
                                aVar.f354318b.b(new r(interfaceC36810g));
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
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f354316b = new b(this, context, GoogleMapOptions.h(context, attributeSet));
        setClickable(true);
    }

    public final void a(GoogleMapLiteModeViewImpl googleMapLiteModeViewImpl) {
        C36729v.e("getMapAsync() must be called on the main thread");
        b bVar = this.f354316b;
        com.google.android.gms.dynamic.e eVar = bVar.f349638a;
        if (eVar == null) {
            bVar.f354324i.add(googleMapLiteModeViewImpl);
            return;
        }
        try {
            ((a) eVar).f354318b.b(new r(googleMapLiteModeViewImpl));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }
}
