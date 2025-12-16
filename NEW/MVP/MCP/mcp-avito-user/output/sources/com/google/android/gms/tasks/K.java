package com.google.android.gms.tasks;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes6.dex */
final class K {

    /* renamed from: a, reason: collision with root package name */
    public final Object f355654a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public ArrayDeque f355655b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f355656c;

    public final void a(@j.N J j12) {
        synchronized (this.f355654a) {
            try {
                if (this.f355655b == null) {
                    this.f355655b = new ArrayDeque();
                }
                this.f355655b.add(j12);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(@j.N Task task) {
        J j12;
        synchronized (this.f355654a) {
            if (this.f355655b != null && !this.f355656c) {
                this.f355656c = true;
                while (true) {
                    synchronized (this.f355654a) {
                        try {
                            j12 = (J) this.f355655b.poll();
                            if (j12 == null) {
                                this.f355656c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    j12.a(task);
                }
            }
        }
    }
}
