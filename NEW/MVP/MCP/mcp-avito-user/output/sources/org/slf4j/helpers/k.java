package org.slf4j.helpers;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;
import x41.InterfaceC49770g;

/* compiled from: SubstituteLogger.java */
/* loaded from: classes7.dex */
public class k implements org.slf4j.a {

    /* renamed from: b, reason: collision with root package name */
    public final String f421824b;

    /* renamed from: c, reason: collision with root package name */
    public volatile org.slf4j.a f421825c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f421826d;

    /* renamed from: e, reason: collision with root package name */
    public Method f421827e;

    /* renamed from: f, reason: collision with root package name */
    public u81.b f421828f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedBlockingQueue f421829g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f421830h;

    public k(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z12) {
        this.f421824b = str;
        this.f421829g = linkedBlockingQueue;
        this.f421830h = z12;
    }

    @Override // org.slf4j.a
    public final void a(String str, Exception exc) {
        j().a(str, exc);
    }

    @Override // org.slf4j.a
    public final void b(String str) {
        j().b(str);
    }

    @Override // org.slf4j.a
    public final void c(InterfaceC49770g interfaceC49770g) {
        j().c(interfaceC49770g);
    }

    @Override // org.slf4j.a
    public final void d(String str, Object obj, Serializable serializable) {
        j().d(str, obj, serializable);
    }

    @Override // org.slf4j.a
    public final void debug(String str) {
        j().debug(str);
    }

    @Override // org.slf4j.a
    public final void e(String str) {
        j().e(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f421824b.equals(((k) obj).f421824b);
    }

    @Override // org.slf4j.a
    public final void f(String str) {
        j().f(str);
    }

    @Override // org.slf4j.a
    public final void g(Integer num, String str) {
        j().g(num, str);
    }

    @Override // org.slf4j.a
    public final String getName() {
        return this.f421824b;
    }

    @Override // org.slf4j.a
    public final void h(io.sentry.c cVar, io.sentry.c cVar2) {
        j().h(cVar, cVar2);
    }

    public final int hashCode() {
        return this.f421824b.hashCode();
    }

    @Override // org.slf4j.a
    public final void i(String str, Exception exc) {
        j().i(str, exc);
    }

    @Override // org.slf4j.a
    public final void info(String str) {
        j().info(str);
    }

    public final org.slf4j.a j() {
        if (this.f421825c != null) {
            return this.f421825c;
        }
        if (this.f421830h) {
            return g.f421823b;
        }
        if (this.f421828f == null) {
            u81.b bVar = new u81.b();
            bVar.f439812c = this;
            bVar.f439811b = this.f421824b;
            bVar.f439813d = this.f421829g;
            this.f421828f = bVar;
        }
        return this.f421828f;
    }

    @Override // org.slf4j.a
    public final void k(String str, Object obj, Serializable serializable) {
        j().k(str, obj, serializable);
    }

    @Override // org.slf4j.a
    public final void l(String str, Exception exc) {
        j().l(str, exc);
    }

    @Override // org.slf4j.a
    public final void m(Object obj, String str) {
        j().m(obj, str);
    }

    @Override // org.slf4j.a
    public final void n(Object... objArr) {
        j().n(objArr);
    }

    public final boolean o() {
        Boolean bool = this.f421826d;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f421827e = this.f421825c.getClass().getMethod("log", u81.c.class);
            this.f421826d = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f421826d = Boolean.FALSE;
        }
        return this.f421826d.booleanValue();
    }
}
