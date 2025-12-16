package com.google.android.gms.maps.model;

import android.os.RemoteException;

/* loaded from: classes6.dex */
public final class k {
    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        try {
            ((k) obj).getClass();
            throw null;
        } catch (RemoteException e12) {
            throw new RuntimeRemoteException(e12);
        }
    }

    public final int hashCode() {
        throw null;
    }
}
