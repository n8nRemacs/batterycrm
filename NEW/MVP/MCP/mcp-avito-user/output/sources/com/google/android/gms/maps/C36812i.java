package com.google.android.gms.maps;

import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.VisibleRegion;
import dY0.InterfaceC39655f;

/* renamed from: com.google.android.gms.maps.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36812i {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC39655f f354364a;

    public C36812i(InterfaceC39655f interfaceC39655f) {
        this.f354364a = interfaceC39655f;
    }

    public final VisibleRegion a() {
        try {
            return this.f354364a.getVisibleRegion();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final Point b(LatLng latLng) {
        try {
            return (Point) com.google.android.gms.dynamic.f.g4(this.f354364a.U0(latLng));
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }
}
