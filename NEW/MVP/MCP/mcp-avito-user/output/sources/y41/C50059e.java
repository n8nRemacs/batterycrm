package y41;

import androidx.compose.foundation.H;
import java.io.Serializable;

/* compiled from: SentryException.java */
/* renamed from: y41.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C50059e implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final String f442917b;

    /* renamed from: c, reason: collision with root package name */
    public final String f442918c;

    /* renamed from: d, reason: collision with root package name */
    public final String f442919d;

    /* renamed from: e, reason: collision with root package name */
    public final C50062h f442920e;

    public C50059e(Throwable th2, StackTraceElement[] stackTraceElementArr) {
        Package r02 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        this.f442917b = th2.getMessage();
        if (r02 != null) {
            name = name.replace(r02.getName() + ".", "");
        }
        this.f442918c = name;
        this.f442919d = r02 != null ? r02.getName() : null;
        this.f442920e = new C50062h(th2.getStackTrace(), stackTraceElementArr, io.sentry.jvmti.b.f405208b.get().get(th2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C50059e.class != obj.getClass()) {
            return false;
        }
        C50059e c50059e = (C50059e) obj;
        if (!this.f442918c.equals(c50059e.f442918c)) {
            return false;
        }
        String str = c50059e.f442917b;
        String str2 = this.f442917b;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = c50059e.f442919d;
        String str4 = this.f442919d;
        if (str4 == null ? str3 == null : str4.equals(str3)) {
            return this.f442920e.equals(c50059e.f442920e);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f442917b;
        int iD2 = H.d((str != null ? str.hashCode() : 0) * 31, 31, this.f442918c);
        String str2 = this.f442919d;
        return iD2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "SentryException{exceptionMessage='" + this.f442917b + "', exceptionClassName='" + this.f442918c + "', exceptionPackageName='" + this.f442919d + "', stackTraceInterface=" + this.f442920e + '}';
    }
}
