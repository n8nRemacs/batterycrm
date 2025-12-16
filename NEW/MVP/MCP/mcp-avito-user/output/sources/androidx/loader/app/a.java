package androidx.loader.app;

import androidx.loader.content.c;
import androidx.view.InterfaceC22983P;
import androidx.view.T0;
import com.google.android.gms.auth.api.signin.internal.f;
import j.K;
import j.N;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* loaded from: classes.dex */
public abstract class a {

    /* compiled from: LoaderManager.java */
    /* renamed from: androidx.loader.app.a$a, reason: collision with other inner class name */
    public interface InterfaceC1804a<D> {
        @N
        @K
        f a();

        @K
        void b(Object obj);
    }

    @N
    public static <T extends InterfaceC22983P & T0> a b(@N T t12) {
        return new b(t12, t12.getF42820b());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @N
    @K
    public abstract c c(@N InterfaceC1804a interfaceC1804a);

    public abstract void d();
}
