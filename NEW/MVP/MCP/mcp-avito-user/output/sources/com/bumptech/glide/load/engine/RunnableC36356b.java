package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.engine.c;

/* compiled from: ActiveResources.java */
/* renamed from: com.bumptech.glide.load.engine.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class RunnableC36356b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f338911b;

    public RunnableC36356b(c cVar) {
        this.f338911b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar = this.f338911b;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.b) cVar.f338954c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
