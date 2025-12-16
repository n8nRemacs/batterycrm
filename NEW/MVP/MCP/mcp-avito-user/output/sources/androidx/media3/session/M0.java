package androidx.media3.session;

import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.H;
import androidx.media3.session.H0;
import androidx.media3.session.J;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.util.concurrent.C37568u0;
import j.InterfaceC42164u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: MediaNotificationManager.java */
/* loaded from: classes.dex */
final class M0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractServiceC23212c1 f52131a;

    /* renamed from: b, reason: collision with root package name */
    public final C23240m f52132b;

    /* renamed from: c, reason: collision with root package name */
    public final H0.a f52133c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.core.app.E f52134d;

    /* renamed from: f, reason: collision with root package name */
    public final Intent f52136f;

    /* renamed from: i, reason: collision with root package name */
    public int f52139i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public H0 f52140j;

    /* renamed from: e, reason: collision with root package name */
    public final K f52135e = new K(new Handler(Looper.getMainLooper()), 1);

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f52137g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f52138h = new HashMap();

    /* renamed from: k, reason: collision with root package name */
    public boolean f52141k = false;

    /* compiled from: MediaNotificationManager.java */
    @j.X
    public static class a {
        @InterfaceC42164u
        public static void a(AbstractServiceC23212c1 abstractServiceC23212c1, boolean z12) {
            abstractServiceC23212c1.stopForeground(z12 ? 1 : 2);
        }
    }

    /* compiled from: MediaNotificationManager.java */
    @j.X
    public static class b {
        @InterfaceC42164u
        public static void a(AbstractServiceC23212c1 abstractServiceC23212c1, H0 h02) {
            try {
                abstractServiceC23212c1.startForeground(h02.f52059a, h02.f52060b, 2);
            } catch (RuntimeException e12) {
                androidx.media3.common.util.s.c();
                throw e12;
            }
        }
    }

    /* compiled from: MediaNotificationManager.java */
    public static final class c implements J.c, H.g {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractServiceC23212c1 f52142b;

        /* renamed from: c, reason: collision with root package name */
        public final O0 f52143c;

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f52144d;

        public c(AbstractServiceC23212c1 abstractServiceC23212c1, O0 o02, HashMap map) {
            this.f52142b = abstractServiceC23212c1;
            this.f52143c = o02;
            this.f52144d = map;
        }

        @Override // androidx.media3.common.H.g
        public final void C(H.f fVar) {
            if (fVar.f47245a.a(4, 5, 14, 0)) {
                this.f52142b.f(this.f52143c, false);
            }
        }

        @Override // androidx.media3.session.J.c
        public final com.google.common.util.concurrent.D0 c(List list) {
            AbstractC37401r1 abstractC37401r1V = AbstractC37401r1.v(list);
            HashMap map = this.f52144d;
            O0 o02 = this.f52143c;
            map.put(o02, abstractC37401r1V);
            this.f52142b.f(o02, false);
            return C37568u0.d(new O1(0));
        }

        @Override // androidx.media3.session.J.c
        public final void f() {
            O0 o02 = this.f52143c;
            AbstractServiceC23212c1 abstractServiceC23212c1 = this.f52142b;
            abstractServiceC23212c1.g(o02);
            abstractServiceC23212c1.f(o02, false);
        }
    }

    public M0(AbstractServiceC23212c1 abstractServiceC23212c1, C23240m c23240m, H0.a aVar) {
        this.f52131a = abstractServiceC23212c1;
        this.f52132b = c23240m;
        this.f52133c = aVar;
        this.f52134d = new androidx.core.app.E(abstractServiceC23212c1);
        this.f52136f = new Intent(abstractServiceC23212c1, abstractServiceC23212c1.getClass());
    }

    @j.P
    public final J a(O0 o02) {
        com.google.common.util.concurrent.D0 d02 = (com.google.common.util.concurrent.D0) this.f52137g.get(o02);
        if (d02 == null) {
            return null;
        }
        try {
            return (J) C37568u0.b(d02);
        } catch (ExecutionException e12) {
            throw new IllegalStateException(e12);
        }
    }

    public final void b(boolean z12) {
        ArrayList arrayList;
        H0 h02;
        AbstractServiceC23212c1 abstractServiceC23212c1 = this.f52131a;
        synchronized (abstractServiceC23212c1.f52403b) {
            arrayList = new ArrayList(abstractServiceC23212c1.f52405d.values());
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            if (c((O0) arrayList.get(i12), false)) {
                return;
            }
        }
        int i13 = androidx.media3.common.util.M.f47887a;
        AbstractServiceC23212c1 abstractServiceC23212c12 = this.f52131a;
        if (i13 >= 24) {
            a.a(abstractServiceC23212c12, z12);
        } else {
            abstractServiceC23212c12.stopForeground(z12 || i13 < 21);
        }
        this.f52141k = false;
        if (!z12 || (h02 = this.f52140j) == null) {
            return;
        }
        this.f52134d.a(h02.f52059a, null);
        this.f52139i++;
        this.f52140j = null;
    }

    public final boolean c(O0 o02, boolean z12) {
        J jA2 = a(o02);
        return jA2 != null && (jA2.getPlayWhenReady() || z12) && (jA2.getPlaybackState() == 3 || jA2.getPlaybackState() == 2);
    }

    public final void d(O0 o02, H0 h02, boolean z12) {
        int i12 = androidx.media3.common.util.M.f47887a;
        if (i12 >= 21) {
            h02.f52060b.extras.putParcelable("android.mediaSession", (MediaSession.Token) o02.f52204a.f52293g.f52362g.getSessionToken().getToken());
        }
        this.f52140j = h02;
        if (!z12) {
            this.f52134d.d(null, h02.f52059a, h02.f52060b);
            b(false);
            return;
        }
        Intent intent = this.f52136f;
        AbstractServiceC23212c1 abstractServiceC23212c1 = this.f52131a;
        androidx.core.content.d.startForegroundService(abstractServiceC23212c1, intent);
        if (i12 >= 29) {
            b.a(abstractServiceC23212c1, h02);
        } else {
            abstractServiceC23212c1.startForeground(h02.f52059a, h02.f52060b);
        }
        this.f52141k = true;
    }
}
