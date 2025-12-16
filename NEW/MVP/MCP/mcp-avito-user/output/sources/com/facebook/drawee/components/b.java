package com.facebook.drawee.components;

import android.os.Handler;
import android.os.Looper;
import com.facebook.drawee.components.a;
import com.facebook.infer.annotation.Nullsafe;
import j.InterfaceC42148d;
import j.K;
import java.util.ArrayList;

/* compiled from: DeferredReleaserConcurrentImpl.java */
@Nullsafe
/* loaded from: classes.dex */
class b extends com.facebook.drawee.components.a {

    /* renamed from: b, reason: collision with root package name */
    public final Object f339974b = new Object();

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f339978f = new a();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<a.InterfaceC10530a> f339976d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<a.InterfaceC10530a> f339977e = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final Handler f339975c = new Handler(Looper.getMainLooper());

    /* compiled from: DeferredReleaserConcurrentImpl.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @K
        public final void run() {
            ArrayList<a.InterfaceC10530a> arrayList;
            synchronized (b.this.f339974b) {
                b bVar = b.this;
                ArrayList<a.InterfaceC10530a> arrayList2 = bVar.f339977e;
                arrayList = bVar.f339976d;
                bVar.f339977e = arrayList;
                bVar.f339976d = arrayList2;
            }
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                b.this.f339977e.get(i12).release();
            }
            b.this.f339977e.clear();
        }
    }

    @Override // com.facebook.drawee.components.a
    @InterfaceC42148d
    public final void a(com.facebook.drawee.controller.b bVar) {
        synchronized (this.f339974b) {
            this.f339976d.remove(bVar);
        }
    }

    @Override // com.facebook.drawee.components.a
    @InterfaceC42148d
    public final void c(com.facebook.drawee.controller.b bVar) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            bVar.release();
            return;
        }
        synchronized (this.f339974b) {
            try {
                if (this.f339976d.contains(bVar)) {
                    return;
                }
                this.f339976d.add(bVar);
                boolean z12 = true;
                if (this.f339976d.size() != 1) {
                    z12 = false;
                }
                if (z12) {
                    this.f339975c.post(this.f339978f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
