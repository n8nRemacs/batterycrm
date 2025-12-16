package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.maps.zzn;
import j.N;

/* renamed from: com.google.android.gms.maps.model.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36821e {

    /* renamed from: a, reason: collision with root package name */
    @N
    public final zzn f354488a;

    @VisibleForTesting
    /* renamed from: com.google.android.gms.maps.model.e$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f354489a = new a();
    }

    public C36821e(@N zzn zznVar) {
        a aVar = a.f354489a;
        C36729v.k(zznVar, "delegate");
        this.f354488a = zznVar;
        C36729v.k(aVar, "shim");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C36821e)) {
            return false;
        }
        try {
            return this.f354488a.zzb(((C36821e) obj).f354488a);
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final int hashCode() {
        try {
            return this.f354488a.zzj();
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }
}
