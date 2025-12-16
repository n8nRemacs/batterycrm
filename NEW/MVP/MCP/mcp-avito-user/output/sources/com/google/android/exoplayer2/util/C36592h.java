package com.google.android.exoplayer2.util;

/* compiled from: ConditionVariable.java */
/* renamed from: com.google.android.exoplayer2.util.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C36592h {

    /* renamed from: a, reason: collision with root package name */
    public final L f348130a = InterfaceC36589e.f348123a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f348131b;

    public final synchronized void a() {
        while (!this.f348131b) {
            wait();
        }
    }

    public final synchronized void b() {
        boolean z12 = false;
        while (!this.f348131b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z12 = true;
            }
        }
        if (z12) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized boolean c() {
        if (this.f348131b) {
            return false;
        }
        this.f348131b = true;
        notifyAll();
        return true;
    }
}
