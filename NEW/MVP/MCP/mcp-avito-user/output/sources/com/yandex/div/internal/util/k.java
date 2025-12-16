package com.yandex.div.internal.util;

import j.l0;

/* compiled from: NamedRunnable.java */
/* loaded from: classes7.dex */
public abstract class k implements Runnable {
    @l0
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(name + "-SendBeacon");
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
