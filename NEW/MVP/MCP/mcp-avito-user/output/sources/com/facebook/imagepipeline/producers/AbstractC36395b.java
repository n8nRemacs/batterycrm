package com.facebook.imagepipeline.producers;

import com.facebook.infer.annotation.Nullsafe;
import uW0.C48986a;
import uW0.C48987b;

/* compiled from: BaseConsumer.java */
@J41.d
@Nullsafe
/* renamed from: com.facebook.imagepipeline.producers.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC36395b<T> implements InterfaceC36410l<T> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f340650a = false;

    public static boolean e(int i12) {
        return (i12 & 1) == 1;
    }

    public static boolean f(int i12) {
        return !e(i12);
    }

    public static boolean l(int i12, int i13) {
        return (i12 & i13) == i13;
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC36410l
    public final synchronized void a(Throwable th2) {
        if (this.f340650a) {
            return;
        }
        this.f340650a = true;
        try {
            h(th2);
        } catch (Exception e12) {
            k(e12);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC36410l
    public final synchronized void b() {
        if (this.f340650a) {
            return;
        }
        this.f340650a = true;
        try {
            g();
        } catch (Exception e12) {
            k(e12);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC36410l
    public final synchronized void c(int i12, @I41.h Object obj) {
        if (this.f340650a) {
            return;
        }
        this.f340650a = e(i12);
        try {
            i(i12, obj);
        } catch (Exception e12) {
            k(e12);
        }
    }

    @Override // com.facebook.imagepipeline.producers.InterfaceC36410l
    public final synchronized void d(float f12) {
        if (this.f340650a) {
            return;
        }
        try {
            j(f12);
        } catch (Exception e12) {
            k(e12);
        }
    }

    public abstract void g();

    public abstract void h(Throwable th2);

    public abstract void i(int i12, @I41.h Object obj);

    public final void k(Exception exc) {
        Class<?> cls = getClass();
        C48987b c48987b = C48986a.f440079a;
        if (c48987b.a(6)) {
            c48987b.c(6, cls.getSimpleName(), "unhandled exception", exc);
        }
    }

    public void j(float f12) {
    }
}
