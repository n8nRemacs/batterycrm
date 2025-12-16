package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.maps.zzk;

/* renamed from: com.google.android.gms.maps.model.d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36820d {

    /* renamed from: a, reason: collision with root package name */
    public final zzk f354487a;

    public C36820d(zzk zzkVar) {
        C36729v.j(zzkVar);
        this.f354487a = zzkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36820d)) {
            return false;
        }
        try {
            return this.f354487a.zzb(((C36820d) obj).f354487a);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final int hashCode() {
        try {
            return this.f354487a.zzj();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }
}
