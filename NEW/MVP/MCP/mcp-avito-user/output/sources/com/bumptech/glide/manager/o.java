package com.bumptech.glide.manager;

import com.bumptech.glide.request.target.q;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: TargetTracker.java */
/* loaded from: classes5.dex */
public final class o implements i {

    /* renamed from: b, reason: collision with root package name */
    public final Set<q<?>> f339519b = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.manager.i
    public final void e() {
        Iterator it = com.bumptech.glide.util.m.d(this.f339519b).iterator();
        while (it.hasNext()) {
            ((q) it.next()).e();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStart() {
        Iterator it = com.bumptech.glide.util.m.d(this.f339519b).iterator();
        while (it.hasNext()) {
            ((q) it.next()).onStart();
        }
    }

    @Override // com.bumptech.glide.manager.i
    public final void onStop() {
        Iterator it = com.bumptech.glide.util.m.d(this.f339519b).iterator();
        while (it.hasNext()) {
            ((q) it.next()).onStop();
        }
    }
}
