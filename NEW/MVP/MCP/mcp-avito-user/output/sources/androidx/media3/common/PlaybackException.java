package androidx.media3.common;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import j.InterfaceC42153i;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes.dex */
public class PlaybackException extends Exception implements InterfaceC23096j {

    /* renamed from: d, reason: collision with root package name */
    public static final String f47426d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f47427e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f47428f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f47429g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f47430h;

    /* renamed from: i, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final C23088b f47431i;

    /* renamed from: b, reason: collision with root package name */
    public final int f47432b;

    /* renamed from: c, reason: collision with root package name */
    public final long f47433c;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f47426d = Integer.toString(0, 36);
        f47427e = Integer.toString(1, 36);
        f47428f = Integer.toString(2, 36);
        f47429g = Integer.toString(3, 36);
        f47430h = Integer.toString(4, 36);
        f47431i = new C23088b(18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @androidx.media3.common.util.J
    public PlaybackException(Bundle bundle) {
        RemoteException remoteException;
        Throwable th2;
        String string = bundle.getString(f47428f);
        String string2 = bundle.getString(f47429g);
        String string3 = bundle.getString(f47430h);
        if (TextUtils.isEmpty(string2)) {
            th2 = th;
        } else {
            try {
                Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                th = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
            } catch (Throwable unused) {
                remoteException = new RemoteException(string3);
            }
            if (th == null) {
                remoteException = new RemoteException(string3);
                th2 = remoteException;
            }
            th2 = th;
        }
        this(string, th2, bundle.getInt(f47426d, 1000), bundle.getLong(f47427e, SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if (r3 == null) goto L22;
     */
    @j.InterfaceC42153i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(@j.P androidx.media3.common.PlaybackException r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L60
            java.lang.Class r2 = r6.getClass()
            java.lang.Class r3 = r7.getClass()
            if (r2 == r3) goto L12
            goto L60
        L12:
            java.lang.Throwable r2 = r6.getCause()
            java.lang.Throwable r3 = r7.getCause()
            if (r2 == 0) goto L3c
            if (r3 == 0) goto L3c
            java.lang.String r4 = r2.getMessage()
            java.lang.String r5 = r3.getMessage()
            boolean r4 = androidx.media3.common.util.M.a(r4, r5)
            if (r4 != 0) goto L2d
            return r1
        L2d:
            java.lang.Class r2 = r2.getClass()
            java.lang.Class r3 = r3.getClass()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            return r1
        L3c:
            if (r2 != 0) goto L60
            if (r3 == 0) goto L41
            goto L60
        L41:
            int r2 = r6.f47432b
            int r3 = r7.f47432b
            if (r2 != r3) goto L5e
            java.lang.String r2 = r6.getMessage()
            java.lang.String r3 = r7.getMessage()
            boolean r2 = androidx.media3.common.util.M.a(r2, r3)
            if (r2 == 0) goto L5e
            long r2 = r6.f47433c
            long r4 = r7.f47433c
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L5e
            goto L5f
        L5e:
            r0 = r1
        L5f:
            return r0
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.PlaybackException.a(androidx.media3.common.PlaybackException):boolean");
    }

    @Override // androidx.media3.common.InterfaceC23096j
    @InterfaceC42153i
    @androidx.media3.common.util.J
    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(f47426d, this.f47432b);
        bundle.putLong(f47427e, this.f47433c);
        bundle.putString(f47428f, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f47429g, cause.getClass().getName());
            bundle.putString(f47430h, cause.getMessage());
        }
        return bundle;
    }

    @androidx.media3.common.util.J
    public PlaybackException(@j.P String str, @j.P Throwable th2, int i12, long j12) {
        super(str, th2);
        this.f47432b = i12;
        this.f47433c = j12;
    }
}
