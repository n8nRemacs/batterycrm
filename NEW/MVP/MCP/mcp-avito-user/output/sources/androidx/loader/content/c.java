package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import androidx.loader.app.b;
import j.K;
import j.N;
import j.P;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: Loader.java */
/* loaded from: classes.dex */
public class c<D> {

    /* renamed from: a, reason: collision with root package name */
    public b.a f46962a;

    /* renamed from: b, reason: collision with root package name */
    public Context f46963b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f46964c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f46965d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f46966e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f46967f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f46968g;

    /* compiled from: Loader.java */
    public final class a extends ContentObserver {
        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z12) {
            throw null;
        }
    }

    /* compiled from: Loader.java */
    public interface b<D> {
    }

    /* compiled from: Loader.java */
    /* renamed from: androidx.loader.content.c$c, reason: collision with other inner class name */
    public interface InterfaceC1807c<D> {
    }

    @K
    public void a(@P D d12) {
        b.a aVar = this.f46962a;
        if (aVar != null) {
            aVar.b(d12);
        }
    }

    @Deprecated
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(0);
        printWriter.print(" mListener=");
        printWriter.println(this.f46962a);
        if (this.f46964c || this.f46967f || this.f46968g) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f46964c);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f46967f);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f46968g);
        }
        if (this.f46965d || this.f46966e) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f46965d);
            printWriter.print(" mReset=");
            printWriter.println(this.f46966e);
        }
    }

    @K
    public boolean c() {
        return false;
    }

    @N
    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=0}");
        return sb2.toString();
    }

    @K
    public void d() {
    }

    @K
    public void e() {
    }

    @K
    public void f() {
    }
}
