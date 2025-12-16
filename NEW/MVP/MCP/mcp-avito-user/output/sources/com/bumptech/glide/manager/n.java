package com.bumptech.glide.manager;

import androidx.appcompat.app.r;
import j.P;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: RequestTracker.java */
/* loaded from: classes5.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final Set<com.bumptech.glide.request.d> f339516a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f339517b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f339518c;

    public final boolean a(@P com.bumptech.glide.request.d dVar) {
        boolean z12 = true;
        if (dVar == null) {
            return true;
        }
        boolean zRemove = this.f339516a.remove(dVar);
        if (!this.f339517b.remove(dVar) && !zRemove) {
            z12 = false;
        }
        if (z12) {
            dVar.clear();
        }
        return z12;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{numRequests=");
        sb2.append(this.f339516a.size());
        sb2.append(", isPaused=");
        return r.s("}", sb2, this.f339518c);
    }
}
