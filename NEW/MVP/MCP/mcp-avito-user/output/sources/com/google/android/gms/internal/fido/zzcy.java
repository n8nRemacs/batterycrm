package com.google.android.gms.internal.fido;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes6.dex */
public final class zzcy {
    public static int a(zzcf zzcfVar) {
        Iterator it = zzcfVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
