package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C37028k;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final Map f349006a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final Map f349007b = Collections.synchronizedMap(new WeakHashMap());

    public final void a(Status status, boolean z12) {
        HashMap map;
        HashMap map2;
        synchronized (this.f349006a) {
            map = new HashMap(this.f349006a);
        }
        synchronized (this.f349007b) {
            map2 = new HashMap(this.f349007b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z12 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z12 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C37028k) entry2.getKey()).c(new ApiException(status));
            }
        }
    }
}
