package com.facebook.drawee.components;

import I41.h;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: DeferredReleaser.java */
@Nullsafe
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @h
    public static a f339973a;

    /* compiled from: DeferredReleaser.java */
    /* renamed from: com.facebook.drawee.components.a$a, reason: collision with other inner class name */
    public interface InterfaceC10530a {
        void release();
    }

    public static synchronized a b() {
        try {
            if (f339973a == null) {
                f339973a = new b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f339973a;
    }

    public abstract void a(com.facebook.drawee.controller.b bVar);

    public abstract void c(com.facebook.drawee.controller.b bVar);
}
