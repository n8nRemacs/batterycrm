package u81;

import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.helpers.k;
import x41.InterfaceC49770g;

/* compiled from: EventRecodingLogger.java */
/* loaded from: classes7.dex */
public class b implements org.slf4j.a {

    /* renamed from: b, reason: collision with root package name */
    public String f439811b;

    /* renamed from: c, reason: collision with root package name */
    public k f439812c;

    /* renamed from: d, reason: collision with root package name */
    public LinkedBlockingQueue f439813d;

    public b() {
        throw null;
    }

    @Override // org.slf4j.a
    public final void a(String str, Exception exc) {
        j(null);
    }

    @Override // org.slf4j.a
    public final void b(String str) {
        j(new Object[]{str});
    }

    @Override // org.slf4j.a
    public final void c(InterfaceC49770g interfaceC49770g) {
        j(new Object[]{interfaceC49770g});
    }

    @Override // org.slf4j.a
    public final void d(String str, Object obj, Serializable serializable) {
        o(obj, serializable);
    }

    @Override // org.slf4j.a
    public final void debug(String str) {
        j(null);
    }

    @Override // org.slf4j.a
    public final void e(String str) {
        j(null);
    }

    @Override // org.slf4j.a
    public final void f(String str) {
        j(null);
    }

    @Override // org.slf4j.a
    public final void g(Integer num, String str) {
        j(new Object[]{num});
    }

    @Override // org.slf4j.a
    public final String getName() {
        return this.f439811b;
    }

    @Override // org.slf4j.a
    public final void h(io.sentry.c cVar, io.sentry.c cVar2) {
        o(cVar, cVar2);
    }

    @Override // org.slf4j.a
    public final void i(String str, Exception exc) {
        j(null);
    }

    @Override // org.slf4j.a
    public final void info(String str) {
        j(null);
    }

    public final void j(Object[] objArr) {
        d dVar = new d();
        System.currentTimeMillis();
        dVar.f439814a = this.f439812c;
        Thread.currentThread().getName();
        dVar.f439815b = objArr;
        this.f439813d.add(dVar);
    }

    @Override // org.slf4j.a
    public final void k(String str, Object obj, Serializable serializable) {
        o(obj, serializable);
    }

    @Override // org.slf4j.a
    public final void l(String str, Exception exc) {
        j(null);
    }

    @Override // org.slf4j.a
    public final void m(Object obj, String str) {
        j(new Object[]{obj});
    }

    @Override // org.slf4j.a
    public final void n(Object... objArr) {
        Throwable th2 = null;
        if (objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th2 = (Throwable) obj;
            }
        }
        if (th2 == null) {
            j(objArr);
            return;
        }
        if (objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        j(objArr2);
    }

    public final void o(Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            j(new Object[]{obj});
        } else {
            j(new Object[]{obj, obj2});
        }
    }
}
