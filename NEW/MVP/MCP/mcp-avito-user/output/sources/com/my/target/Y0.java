package com.my.target;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.corpmailru.Omid;
import com.iab.omid.library.corpmailru.adsession.AdEvents;
import com.iab.omid.library.corpmailru.adsession.AdSession;
import com.iab.omid.library.corpmailru.adsession.CreativeType;
import com.iab.omid.library.corpmailru.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.corpmailru.adsession.Partner;
import com.iab.omid.library.corpmailru.adsession.media.InteractionType;
import com.iab.omid.library.corpmailru.adsession.media.MediaEvents;
import e11.AbstractC39895p;
import e11.C1;
import e11.C39913v0;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public final class Y0 {

    /* renamed from: l, reason: collision with root package name */
    @j.N
    public static final Handler f364657l = new Handler(Looper.getMainLooper());

    /* renamed from: m, reason: collision with root package name */
    @j.N
    public static final AtomicBoolean f364658m = new AtomicBoolean();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final CreativeType f364659a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C1 f364660b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    public final C39913v0<com.my.target.common.models.e> f364661c;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public AdEvents f364664f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public AdSession f364665g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public MediaEvents f364666h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f364668j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public e f364669k;

    /* renamed from: d, reason: collision with root package name */
    public int f364662d = -1;

    /* renamed from: e, reason: collision with root package name */
    public float f364663e = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public boolean f364667i = false;

    public static class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final AdSession f364670b;

        public b(AdSession adSession, a aVar) {
            this.f364670b = adSession;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Objects.toString(this.f364670b);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final View f364671a;

        /* renamed from: b, reason: collision with root package name */
        public final int f364672b;

        public c(@j.N View view, int i12) {
            this.f364671a = view;
            this.f364672b = i12;
        }
    }

    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final Partner f364673a = Partner.createPartner("Corpmailru", "5.16.4");
    }

    public static class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final WeakReference<Y0> f364674b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final AdSession f364675c;

        public e(@j.N Y0 y02, @j.N AdSession adSession) {
            this.f364674b = new WeakReference<>(y02);
            this.f364675c = adSession;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f364674b.get() == null) {
                this.f364675c.finish();
            } else {
                Y0.f364657l.postDelayed(this, 7000L);
            }
        }
    }

    public Y0(@j.N CreativeType creativeType, @j.N C1 c12, @j.P C39913v0<com.my.target.common.models.e> c39913v0) {
        this.f364659a = creativeType;
        this.f364660b = c12;
        this.f364661c = c39913v0;
    }

    @j.j0
    @j.P
    public static Y0 a(@j.N AbstractC39895p abstractC39895p, int i12, @j.P C39913v0<com.my.target.common.models.e> c39913v0, @j.N Context context) {
        C1 c12 = abstractC39895p.f394699E;
        if (c12 == null) {
            return null;
        }
        if (f364658m.compareAndSet(false, true)) {
            try {
                Omid.activate(context);
            } catch (Throwable th2) {
                th2.getMessage();
                return null;
            }
        }
        if (Omid.isActive()) {
            return new Y0(i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? CreativeType.DEFINED_BY_JAVASCRIPT : CreativeType.AUDIO : CreativeType.VIDEO : CreativeType.NATIVE_DISPLAY : CreativeType.HTML_DISPLAY, c12, c39913v0);
        }
        return null;
    }

    public static void d(@j.N c cVar, @j.N AdSession adSession) {
        try {
            int i12 = cVar.f364672b;
            adSession.addFriendlyObstruction(cVar.f364671a, i12 != 0 ? i12 != 1 ? i12 != 2 ? FriendlyObstructionPurpose.OTHER : FriendlyObstructionPurpose.NOT_VISIBLE : FriendlyObstructionPurpose.VIDEO_CONTROLS : FriendlyObstructionPurpose.CLOSE_AD, " ");
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @j.j0
    public final void b(int i12) {
        MediaEvents mediaEvents = this.f364666h;
        if (mediaEvents == null) {
            return;
        }
        try {
            if (i12 == 0) {
                mediaEvents.pause();
            } else if (i12 == 1) {
                mediaEvents.resume();
            } else if (i12 == 2 || i12 == 3) {
                mediaEvents.skipped();
            } else if (i12 != 4) {
            } else {
                mediaEvents.adUserInteraction(InteractionType.CLICK);
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    @j.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@j.N android.view.View r10, @j.N com.my.target.Y0.c... r11) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.Y0.c(android.view.View, com.my.target.Y0$c[]):void");
    }

    @j.j0
    public final void e(@j.N c... cVarArr) {
        if (this.f364665g == null) {
            return;
        }
        for (c cVar : cVarArr) {
            d(cVar, this.f364665g);
        }
    }

    @j.j0
    public final void f() {
        this.f364664f = null;
        if (this.f364665g == null) {
            return;
        }
        e eVar = this.f364669k;
        Handler handler = f364657l;
        if (eVar != null) {
            eVar.f364674b.clear();
            handler.removeCallbacks(this.f364669k);
            this.f364669k = null;
        }
        try {
            this.f364665g.finish();
            handler.postDelayed(new b(this.f364665g, null), 7000L);
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }

    @j.j0
    public final void g() {
        AdEvents adEvents;
        if (this.f364668j || (adEvents = this.f364664f) == null) {
            return;
        }
        try {
            adEvents.impressionOccurred();
            this.f364668j = true;
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
