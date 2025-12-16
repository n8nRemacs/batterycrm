package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import dY0.InterfaceC39645a;

/* renamed from: com.google.android.gms.maps.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36805b {

    /* renamed from: a, reason: collision with root package name */
    public static InterfaceC39645a f354353a;

    public static C36804a a(LatLngBounds latLngBounds, int i12) {
        try {
            InterfaceC39645a interfaceC39645a = f354353a;
            C36729v.k(interfaceC39645a, "CameraUpdateFactory is not initialized");
            return new C36804a(interfaceC39645a.V2(latLngBounds, i12));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public static C36804a b(LatLng latLng, float f12) {
        try {
            InterfaceC39645a interfaceC39645a = f354353a;
            C36729v.k(interfaceC39645a, "CameraUpdateFactory is not initialized");
            return new C36804a(interfaceC39645a.u3(latLng, f12));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }
}
