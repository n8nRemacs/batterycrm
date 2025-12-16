package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.maps.zzt;

/* renamed from: com.google.android.gms.maps.model.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36824h {

    /* renamed from: a, reason: collision with root package name */
    public final zzt f354490a;

    public C36824h(zzt zztVar) {
        C36729v.j(zztVar);
        this.f354490a = zztVar;
    }

    public final void a(float f12, float f13) {
        try {
            this.f354490a.setAnchor(f12, f13);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final void b(float f12) {
        try {
            this.f354490a.setZIndex(f12);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36824h)) {
            return false;
        }
        try {
            return this.f354490a.zzj(((C36824h) obj).f354490a);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final int hashCode() {
        try {
            return this.f354490a.zzj();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }
}
