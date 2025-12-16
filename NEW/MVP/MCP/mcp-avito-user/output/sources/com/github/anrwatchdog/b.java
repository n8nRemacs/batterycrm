package com.github.anrwatchdog;

import java.util.Comparator;

/* compiled from: ANRError.java */
/* loaded from: classes4.dex */
final class b implements Comparator<Thread> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Thread f342857b;

    public b(Thread thread) {
        this.f342857b = thread;
    }

    @Override // java.util.Comparator
    public final int compare(Thread thread, Thread thread2) {
        Thread thread3 = thread;
        Thread thread4 = thread2;
        if (thread3 == thread4) {
            return 0;
        }
        Thread thread5 = this.f342857b;
        if (thread3 == thread5) {
            return 1;
        }
        if (thread4 == thread5) {
            return -1;
        }
        return thread4.getName().compareTo(thread3.getName());
    }
}
