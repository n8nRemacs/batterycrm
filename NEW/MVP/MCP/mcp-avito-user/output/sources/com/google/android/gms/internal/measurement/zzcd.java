package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public abstract class zzcd {

    /* renamed from: a, reason: collision with root package name */
    public static final zzcd f350602a = new zzcg();

    public static synchronized zzcd zza() {
        return f350602a;
    }

    public abstract URLConnection zza(URL url, String str);
}
