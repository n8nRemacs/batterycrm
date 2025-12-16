package com.google.android.gms.internal.measurement;

import androidx.collection.C20199a;
import j.B;
import j.P;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* loaded from: classes6.dex */
public final class zzhe implements zzgj {

    /* renamed from: b, reason: collision with root package name */
    @B
    public static final C20199a f350829b = new C20199a();

    /* renamed from: a, reason: collision with root package name */
    public volatile Map<String, ?> f350830a;

    public static synchronized void a() {
        Iterator it = f350829b.values().iterator();
        if (it.hasNext()) {
            ((zzhe) it.next()).getClass();
            throw null;
        }
        f350829b.clear();
    }

    @Override // com.google.android.gms.internal.measurement.zzgj
    @P
    public final Object zza(String str) {
        Map<String, ?> map = this.f350830a;
        map.getClass();
        return map.get(str);
    }
}
