package com.google.android.gms.maps;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import dY0.InterfaceC39667l;
import dY0.n0;
import dY0.o0;

/* renamed from: com.google.android.gms.maps.m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36816m extends FrameLayout {

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.m$a */
    public static class a implements InterfaceC39667l {
        @Override // com.google.android.gms.dynamic.e
        public final void c(Bundle bundle) {
            try {
                n0.b(bundle, new Bundle());
                throw null;
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void d(Bundle bundle) {
            try {
                n0.b(bundle, new Bundle());
                throw null;
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        @Override // com.google.android.gms.dynamic.e
        public final void e() {
            throw null;
        }

        @Override // com.google.android.gms.dynamic.e
        public final void f(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.e
        public final View g(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onLowMemory() {
            throw null;
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onPause() {
            throw null;
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onResume() {
            throw null;
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStart() {
            throw null;
        }

        @Override // com.google.android.gms.dynamic.e
        public final void onStop() {
            throw null;
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.m$b */
    public static class b extends com.google.android.gms.dynamic.a<a> {

        /* renamed from: e, reason: collision with root package name */
        public com.google.android.gms.dynamic.g<a> f354374e;

        @Override // com.google.android.gms.dynamic.a
        public final void a(com.google.android.gms.dynamic.g<a> gVar) throws PackageManager.NameNotFoundException {
            this.f354374e = gVar;
            if (this.f349638a != null) {
                return;
            }
            try {
                C36809f.a(null);
                o0.a(null);
                throw null;
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }
    }
}
