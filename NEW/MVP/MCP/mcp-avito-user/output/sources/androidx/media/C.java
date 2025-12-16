package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.media.E;
import androidx.media.F;
import j.N;
import j.P;
import j.X;

/* compiled from: MediaSessionManager.java */
/* loaded from: classes.dex */
public final class C {

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f47003b = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f47004c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static volatile C f47005d;

    /* renamed from: a, reason: collision with root package name */
    public D f47006a;

    /* compiled from: MediaSessionManager.java */
    public interface a {
        boolean a(F.a aVar);
    }

    /* compiled from: MediaSessionManager.java */
    public interface c {
    }

    @N
    public static C a(@N Context context) {
        C c12;
        synchronized (f47004c) {
            try {
                if (f47005d == null) {
                    Context applicationContext = context.getApplicationContext();
                    C c13 = new C();
                    if (Build.VERSION.SDK_INT >= 28) {
                        E e12 = new E(applicationContext);
                        c13.f47006a = e12;
                    } else {
                        c13.f47006a = new D(applicationContext);
                    }
                    f47005d = c13;
                }
                c12 = f47005d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c12;
    }

    public final boolean b(@N b bVar) {
        if (bVar != null) {
            return this.f47006a.a(bVar.f47007a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }

    /* compiled from: MediaSessionManager.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final F.a f47007a;

        public b(@N String str, int i12, int i13) {
            if (str == null) {
                throw new NullPointerException("package shouldn't be null");
            }
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            if (Build.VERSION.SDK_INT < 28) {
                this.f47007a = new F.a(str, i12, i13);
                return;
            }
            E.a aVar = new E.a(str, i12, i13);
            p.o(i12, i13, str);
            this.f47007a = aVar;
        }

        @N
        public final String a() {
            return this.f47007a.f47011a;
        }

        public final int b() {
            return this.f47007a.f47012b;
        }

        public final int c() {
            return this.f47007a.f47013c;
        }

        public final boolean equals(@P Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            return this.f47007a.equals(((b) obj).f47007a);
        }

        public final int hashCode() {
            return this.f47007a.hashCode();
        }

        @RestrictTo
        @X
        public b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
            String packageName = remoteUserInfo.getPackageName();
            if (packageName != null) {
                if (!TextUtils.isEmpty(packageName)) {
                    this.f47007a = new E.a(remoteUserInfo.getPackageName(), remoteUserInfo.getPid(), remoteUserInfo.getUid());
                    return;
                }
                throw new IllegalArgumentException("packageName should be nonempty");
            }
            throw new NullPointerException("package shouldn't be null");
        }
    }
}
