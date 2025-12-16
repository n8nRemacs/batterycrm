package com.google.android.gms.cloudmessaging;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
/* loaded from: classes6.dex */
public final class h extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class<?> loadClass(String str, boolean z12) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z12);
        }
        Log.isLoggable("CloudMessengerCompat", 3);
        return zzd.class;
    }
}
