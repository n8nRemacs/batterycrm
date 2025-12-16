package com.avito.android.analytics.screens.image;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Handler;
import android.util.LruCache;
import androidx.camera.core.RunnableC20147y;
import androidx.compose.foundation.H;
import androidx.view.InterfaceC22983P;
import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.G;
import com.avito.android.analytics.screens.u;
import com.avito.android.analytics.statsd.y;
import com.avito.android.performance.PerformanceImageTracker;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: ScreenImageLoadingTrackerAdapter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/image/h;", "Lcom/avito/android/analytics/screens/image/g;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final f f90634a;

    /* compiled from: ScreenImageLoadingTrackerAdapter.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/analytics/screens/image/h$a", "Lcom/avito/android/performance/a;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.performance.a {
        public a() {
        }

        @Override // com.avito.android.performance.a
        public final void a(@k Uri uri, long j12, @l Throwable th2) {
            f fVar = h.this.f90634a;
            String strA = fVar.f90623d.a(uri);
            LinkedHashSet linkedHashSet = fVar.f90632m;
            if (linkedHashSet.contains(strA)) {
                f.d(fVar, strA, "rest", j12, 0, 0, 0L, uri.toString(), th2, 56);
                return;
            }
            linkedHashSet.add(strA);
            f.d(fVar, strA, "first", j12, 0, 0, 0L, uri.toString(), th2, 56);
            f.c(fVar, uri, strA, 0, 0, uri.toString(), th2, 12);
        }

        @Override // com.avito.android.performance.a
        public final void b(@k Uri uri) {
            f fVar = h.this.f90634a;
            LruCache<Uri, Long> lruCache = fVar.f90633n;
            fVar.f90628i.getClass();
            lruCache.put(uri, Long.valueOf(u.b()));
        }

        @Override // com.avito.android.performance.a
        public final void c(@k final Uri uri, long j12, final int i12, final int i13, long j13, @k PerformanceImageTracker.ImageOrigin imageOrigin) {
            final f fVar = h.this.f90634a;
            if (imageOrigin != PerformanceImageTracker.ImageOrigin.f215085b) {
                return;
            }
            final String strA = fVar.f90623d.a(uri);
            final String strA2 = fVar.f90627h.a(i12, i13);
            fVar.f90628i.getClass();
            final long jC2 = u.c();
            LinkedHashSet linkedHashSet = fVar.f90632m;
            boolean zContains = linkedHashSet.contains(strA);
            Handler handler = fVar.f90625f;
            if (zContains) {
                fVar.a(j12, strA, strA2);
                f.d(fVar, strA, "rest", j12, i12, i13, j13, uri.toString(), null, 384);
                handler.post(new RunnableC20147y(fVar, strA, strA2, jC2, 1));
            } else {
                linkedHashSet.add(strA);
                fVar.a(j12, strA, strA2);
                f.d(fVar, strA, "first", j12, i12, i13, j13, uri.toString(), null, 384);
                handler.post(new Runnable() { // from class: com.avito.android.analytics.screens.image.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i14 = f.f90619o;
                        long j14 = jC2;
                        f fVar2 = fVar;
                        String str = strA;
                        String str2 = strA2;
                        fVar2.b(j14, str, str2);
                        Uri uri2 = uri;
                        f.c(fVar2, uri2, str, i12, i13, uri2.toString(), null, 96);
                        long j15 = fVar2.f90628i.f90959a;
                        Long l12 = fVar2.f90633n.get(uri2);
                        long jC3 = u.c() - Math.max(j15, l12 == null ? 0L : l12.longValue());
                        I1 i15 = fVar2.f90626g;
                        i15.getClass();
                        n<Object> nVar = I1.f67278k0[6];
                        if (((Boolean) i15.f67316g.a().invoke()).booleanValue()) {
                            String strA3 = fVar2.f90624e.a();
                            StringBuilder sb2 = new StringBuilder();
                            G g12 = fVar2.f90621b;
                            sb2.append(g12.getF90370a());
                            sb2.append(".chronological.touch.");
                            String str3 = fVar2.f90631l;
                            sb2.append(str3);
                            sb2.append(".image-drawing.");
                            sb2.append(str);
                            sb2.append('.');
                            String strO = H.o(sb2, strA3, '.', str2);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(g12.getF90370a());
                            sb3.append(".chronological.touch.");
                            sb3.append(str3);
                            sb3.append(".-.content-drawing.image-");
                            String strS = AK.c.s(sb3, str, ".page-etc.not-placeholder");
                            y.c cVar = new y.c(strO, Long.valueOf(jC3), null);
                            InterfaceC28373a interfaceC28373a = fVar2.f90620a;
                            interfaceC28373a.c(cVar);
                            interfaceC28373a.c(new y.c(strS, Long.valueOf(jC3), null));
                        }
                    }
                });
            }
        }
    }

    public h(@k f fVar) {
        this.f90634a = fVar;
    }

    public final void a(@k InterfaceC22983P interfaceC22983P) {
        J60.b bVar = J60.b.f8786a;
        a aVar = new a();
        bVar.getClass();
        interfaceC22983P.getLifecycle().a(new J60.a(aVar));
    }
}
