package com.google.common.util.concurrent;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Monitor.java */
@XY0.c
@InterfaceC37531b0
@XY0.d
/* loaded from: classes6.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f360532a = new ReentrantLock(false);

    /* compiled from: Monitor.java */
    public static abstract class a {
        public a(J0 j02) {
            com.google.common.base.M.j(j02, "monitor");
            j02.f360532a.newCondition();
        }
    }
}
