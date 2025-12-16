package y41;

import java.util.ArrayDeque;
import java.util.HashSet;

/* compiled from: ExceptionInterface.java */
/* renamed from: y41.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C50056b implements InterfaceC50060f {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f442896b;

    public C50056b() {
        throw null;
    }

    public C50056b(Throwable th2) {
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = new StackTraceElement[0];
        while (th2 != null && hashSet.add(th2)) {
            arrayDeque.add(new C50059e(th2, stackTrace));
            stackTrace = th2.getStackTrace();
            th2 = th2.getCause();
        }
        this.f442896b = arrayDeque;
    }

    @Override // y41.InterfaceC50060f
    public final String M0() {
        return "sentry.interfaces.Exception";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f442896b.equals(((C50056b) obj).f442896b);
    }

    public final int hashCode() {
        return this.f442896b.hashCode();
    }

    public final String toString() {
        return "ExceptionInterface{exceptions=" + this.f442896b + '}';
    }
}
