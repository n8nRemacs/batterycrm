package com.bumptech.glide.manager;

import j.N;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActivityFragmentLifecycle.java */
/* loaded from: classes5.dex */
public class a implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Set<i> f339492a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public boolean f339493b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f339494c;

    @Override // com.bumptech.glide.manager.h
    public final void a(@N i iVar) {
        this.f339492a.remove(iVar);
    }

    @Override // com.bumptech.glide.manager.h
    public final void b(@N i iVar) {
        this.f339492a.add(iVar);
        if (this.f339494c) {
            iVar.e();
        } else if (this.f339493b) {
            iVar.onStart();
        } else {
            iVar.onStop();
        }
    }

    public final void c() {
        this.f339493b = true;
        Iterator it = com.bumptech.glide.util.m.d(this.f339492a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).onStart();
        }
    }
}
