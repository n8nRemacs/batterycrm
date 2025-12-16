package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public final class k1 {

    /* renamed from: c, reason: collision with root package name */
    public static final Status f349171c = new Status(8, "The connection to Google Play services was lost", null, null);

    /* renamed from: a, reason: collision with root package name */
    @j.k0
    public final Set f349172a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b, reason: collision with root package name */
    public final C36651j1 f349173b = new C36651j1(this);

    public final void a() {
        Set set = this.f349172a;
        for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                set.remove(basePendingResult);
            }
        }
    }
}
