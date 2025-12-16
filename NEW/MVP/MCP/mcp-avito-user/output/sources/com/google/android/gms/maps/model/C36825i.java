package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.maps.zzw;

/* renamed from: com.google.android.gms.maps.model.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36825i {

    /* renamed from: a, reason: collision with root package name */
    public final zzw f354491a;

    public C36825i(zzw zzwVar) {
        C36729v.j(zzwVar);
        this.f354491a = zzwVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36825i)) {
            return false;
        }
        try {
            return this.f354491a.zzb(((C36825i) obj).f354491a);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final int hashCode() {
        try {
            return this.f354491a.zzj();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }
}
