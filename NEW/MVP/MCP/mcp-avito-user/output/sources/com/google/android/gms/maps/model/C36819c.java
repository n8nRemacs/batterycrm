package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.maps.zzh;

/* renamed from: com.google.android.gms.maps.model.c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36819c {

    /* renamed from: a, reason: collision with root package name */
    public final zzh f354486a;

    public C36819c(zzh zzhVar) {
        C36729v.j(zzhVar);
        this.f354486a = zzhVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36819c)) {
            return false;
        }
        try {
            return this.f354486a.zzb(((C36819c) obj).f354486a);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final int hashCode() {
        try {
            return this.f354486a.zzj();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }
}
