package androidx.media3.session;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.BinderC23095i;
import androidx.media3.common.InterfaceC23096j;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23114e;
import androidx.media3.session.AbstractServiceC23270w0;
import com.google.common.collect.AbstractC37401r1;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Iterator;
import java.util.List;

/* compiled from: LibraryResult.java */
/* renamed from: androidx.media3.session.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23252q<V> implements InterfaceC23096j {

    /* renamed from: g, reason: collision with root package name */
    public static final String f52611g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f52612h;

    /* renamed from: i, reason: collision with root package name */
    public static final String f52613i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f52614j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f52615k;

    /* renamed from: l, reason: collision with root package name */
    @androidx.media3.common.util.J
    public static final M1 f52616l;

    /* renamed from: b, reason: collision with root package name */
    public final int f52617b;

    /* renamed from: c, reason: collision with root package name */
    public final long f52618c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final V f52619d;

    /* renamed from: e, reason: collision with root package name */
    public final int f52620e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public final AbstractServiceC23270w0.b f52621f;

    /* compiled from: LibraryResult.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.session.q$a */
    public @interface a {
    }

    static {
        int i12 = androidx.media3.common.util.M.f47887a;
        f52611g = Integer.toString(0, 36);
        f52612h = Integer.toString(1, 36);
        f52613i = Integer.toString(2, 36);
        f52614j = Integer.toString(3, 36);
        f52615k = Integer.toString(4, 36);
        f52616l = new M1(6);
    }

    public C23252q(int i12, long j12, @j.P AbstractServiceC23270w0.b bVar, @j.P V v12, int i13) {
        this.f52617b = i12;
        this.f52618c = j12;
        this.f52621f = bVar;
        this.f52619d = v12;
        this.f52620e = i13;
    }

    public static C23252q<?> a(Bundle bundle, @j.P Integer num) {
        int i12 = bundle.getInt(f52611g, 0);
        long j12 = bundle.getLong(f52612h, SystemClock.elapsedRealtime());
        Bundle bundle2 = bundle.getBundle(f52613i);
        Object objFromBundle = null;
        AbstractServiceC23270w0.b bVar = bundle2 == null ? null : (AbstractServiceC23270w0.b) AbstractServiceC23270w0.b.f52655j.fromBundle(bundle2);
        int i13 = bundle.getInt(f52615k);
        if (i13 != 1) {
            String str = f52614j;
            if (i13 == 2) {
                C23110a.g(num == null || num.intValue() == 2);
                Bundle bundle3 = bundle.getBundle(str);
                if (bundle3 != null) {
                    objFromBundle = androidx.media3.common.z.f47977o.fromBundle(bundle3);
                }
            } else if (i13 == 3) {
                C23110a.g(num == null || num.intValue() == 3);
                IBinder binder = bundle.getBinder(str);
                if (binder != null) {
                    objFromBundle = C23114e.a(androidx.media3.common.z.f47977o, BinderC23095i.a(binder));
                }
            } else if (i13 != 4) {
                throw new IllegalStateException();
            }
        }
        return new C23252q<>(i12, j12, bVar, objFromBundle, i13);
    }

    public static <V> C23252q<V> b(int i12, @j.P AbstractServiceC23270w0.b bVar) {
        C23110a.b(i12 != 0);
        return new C23252q<>(i12, SystemClock.elapsedRealtime(), bVar, null, 4);
    }

    public static C23252q<AbstractC37401r1<androidx.media3.common.z>> g(List<androidx.media3.common.z> list, @j.P AbstractServiceC23270w0.b bVar) {
        Iterator<androidx.media3.common.z> it = list.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
        return new C23252q<>(0, SystemClock.elapsedRealtime(), bVar, AbstractC37401r1.v(list), 3);
    }

    public static void j(androidx.media3.common.z zVar) {
        if (TextUtils.isEmpty(zVar.f47978b)) {
            throw new IllegalArgumentException("mediaId must not be empty");
        }
        androidx.media3.common.B b12 = zVar.f47981e;
        C23110a.a("mediaMetadata must specify isBrowsable", b12.f47169q != null);
        C23110a.a("mediaMetadata must specify isPlayable", b12.f47170r != null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if (r3 != 4) goto L22;
     */
    @Override // androidx.media3.common.InterfaceC23096j
    @androidx.media3.common.util.J
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle k() {
        /*
            r8 = this;
            r0 = 1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = androidx.media3.session.C23252q.f52611g
            int r3 = r8.f52617b
            r1.putInt(r2, r3)
            java.lang.String r2 = androidx.media3.session.C23252q.f52612h
            long r3 = r8.f52618c
            r1.putLong(r2, r3)
            androidx.media3.session.w0$b r2 = r8.f52621f
            if (r2 == 0) goto L21
            android.os.Bundle r2 = r2.k()
            java.lang.String r3 = androidx.media3.session.C23252q.f52613i
            r1.putBundle(r3, r2)
        L21:
            java.lang.String r2 = androidx.media3.session.C23252q.f52615k
            int r3 = r8.f52620e
            r1.putInt(r2, r3)
            V r2 = r8.f52619d
            if (r2 != 0) goto L2d
            return r1
        L2d:
            if (r3 == r0) goto L71
            r4 = 2
            r5 = 0
            java.lang.String r6 = androidx.media3.session.C23252q.f52614j
            if (r3 == r4) goto L67
            r4 = 3
            if (r3 == r4) goto L3c
            r0 = 4
            if (r3 == r0) goto L71
            goto L70
        L3c:
            androidx.media3.common.i r3 = new androidx.media3.common.i
            com.google.common.collect.r1 r2 = (com.google.common.collect.AbstractC37401r1) r2
            com.google.common.collect.O4<java.lang.Object> r4 = com.google.common.collect.AbstractC37401r1.f359977c
            com.google.common.collect.r1$a r4 = new com.google.common.collect.r1$a
            r4.<init>()
        L47:
            int r7 = r2.size()
            if (r5 >= r7) goto L5c
            java.lang.Object r7 = r2.get(r5)
            androidx.media3.common.j r7 = (androidx.media3.common.InterfaceC23096j) r7
            android.os.Bundle r7 = r7.k()
            r4.g(r7)
            int r5 = r5 + r0
            goto L47
        L5c:
            com.google.common.collect.r1 r0 = r4.i()
            r3.<init>(r0)
            r1.putBinder(r6, r3)
            goto L70
        L67:
            androidx.media3.common.z r2 = (androidx.media3.common.z) r2
            android.os.Bundle r0 = r2.a(r5)
            r1.putBundle(r6, r0)
        L70:
            return r1
        L71:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.session.C23252q.k():android.os.Bundle");
    }
}
