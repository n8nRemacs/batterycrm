package com.google.android.gms.common.api.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
@j.k0
/* loaded from: classes6.dex */
final class D extends LifecycleCallback {

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f348983c;

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    @j.K
    public final void j() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = this.f348983c;
            this.f348983c = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }
}
