package com.avito.android.image_loader.fresco;

import QW0.c;
import android.net.Uri;
import android.util.Size;
import com.avito.android.image_loader.ImageRequest;
import com.avito.android.performance.PerformanceImageTracker;
import com.avito.android.util.V2;
import java.util.Iterator;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: FrescoImageRequestListener.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/image_loader/fresco/e;", "LQW0/c;", "LYW0/f;", "_common_image-loader-fresco_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements QW0.c<YW0.f> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Uri f169533b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ImageRequest.SourcePlace f169534c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Size f169535d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f169536e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final N f169537f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final t f169538g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final R3.d f169539h;

    /* renamed from: i, reason: collision with root package name */
    public long f169540i;

    /* compiled from: FrescoImageRequestListener.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<String> {
        public a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final String invoke() {
            String string;
            StringBuilder sb2 = new StringBuilder("\nImage load failed from ");
            e eVar = e.this;
            sb2.append(eVar.f169534c.name());
            sb2.append("\n with uri=");
            Uri uri = eVar.f169533b;
            if (uri == null || (string = uri.toString()) == null) {
                string = "empty";
            }
            sb2.append(string);
            sb2.append("\n with viewPort=(");
            Size size = eVar.f169535d;
            sb2.append(size.getWidth());
            sb2.append('X');
            sb2.append(size.getHeight());
            sb2.append(")\n advertId=");
            String str = eVar.f169536e;
            if (str == null) {
                str = "none";
            }
            sb2.append(str);
            sb2.append("\n isConnectionAvailable=");
            sb2.append(((Boolean) eVar.f169537f.invoke()).booleanValue());
            sb2.append(" |\n                ");
            return C43066x.A0(sb2.toString()).toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.l Uri uri, @Y61.k ImageRequest.SourcePlace sourcePlace, @Y61.k Size size, @Y61.l String str, @Y61.k Y41.a aVar, @Y61.l t tVar, @Y61.k R3.d dVar) {
        this.f169533b = uri;
        this.f169534c = sourcePlace;
        this.f169535d = size;
        this.f169536e = str;
        this.f169537f = (N) aVar;
        this.f169538g = tVar;
        this.f169539h = dVar;
    }

    @Override // QW0.c
    public final void b(String str, YW0.f fVar, c.a aVar) {
        String string;
        YW0.f fVar2 = fVar;
        if (this.f169533b != null && fVar2 != null) {
            com.avito.android.time.c.f301452a.getClass();
            long jA2 = com.avito.android.time.c.f301453b.a() - this.f169540i;
            Object obj = fVar2.getExtras().get("encoded_size");
            Long lZ02 = (obj == null || (string = obj.toString()) == null) ? null : C43066x.z0(string);
            Map<String, Object> map = aVar.f13750c;
            Object obj2 = map != null ? map.get("origin") : null;
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            PerformanceImageTracker.ImageOrigin imageOrigin = str2 == null ? PerformanceImageTracker.ImageOrigin.f215087d : str2.equals("network") ? PerformanceImageTracker.ImageOrigin.f215085b : PerformanceImageTracker.ImageOrigin.f215086c;
            if (imageOrigin == PerformanceImageTracker.ImageOrigin.f215085b && lZ02 != null) {
                int width = fVar2.getWidth();
                int height = fVar2.getHeight();
                long jLongValue = lZ02.longValue();
                R3.d dVar = this.f169539h;
                dVar.getClass();
                if (jLongValue > 0 && jA2 > 0) {
                    double d12 = jLongValue;
                    double d13 = d12 / (jA2 / 1000.0d);
                    double d14 = d12 / (width * height);
                    synchronized (dVar.f14094e) {
                        try {
                            dVar.f14092c.addFirst(Long.valueOf(kotlin.math.b.c(d13)));
                            dVar.f14093d.addFirst(Double.valueOf(d14));
                            C42754k<Long> c42754k = dVar.f14092c;
                            if (c42754k.f406741d > 10) {
                                c42754k.removeLast();
                            }
                            C42754k<Double> c42754k2 = dVar.f14093d;
                            if (c42754k2.f406741d > 10) {
                                c42754k2.removeLast();
                            }
                            C42754k<Long> c42754k3 = dVar.f14092c;
                            if (c42754k3.f406741d == 10) {
                                dVar.f14090a = Long.valueOf(kotlin.math.b.c(C42745f0.m(c42754k3)));
                            }
                            C42754k<Double> c42754k4 = dVar.f14093d;
                            if (c42754k4.f406741d == 10) {
                                Iterator<Double> it = c42754k4.iterator();
                                double dDoubleValue = 0.0d;
                                int i12 = 0;
                                while (it.hasNext()) {
                                    dDoubleValue += it.next().doubleValue();
                                    i12++;
                                    if (i12 < 0) {
                                        C42745f0.G0();
                                        throw null;
                                    }
                                }
                                dVar.f14091b = i12 == 0 ? Double.NaN : dDoubleValue / i12;
                            }
                            G0 g02 = G0.f406611a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            PerformanceImageTracker performanceImageTracker = PerformanceImageTracker.f215083a;
            int width2 = fVar2.getWidth();
            int height2 = fVar2.getHeight();
            long jLongValue2 = lZ02 != null ? lZ02.longValue() : 0L;
            Uri uri = this.f169533b;
            performanceImageTracker.getClass();
            Iterator it2 = PerformanceImageTracker.f215084b.iterator();
            while (it2.hasNext()) {
                ((com.avito.android.performance.a) it2.next()).c(uri, jA2, width2, height2, jLongValue2, imageOrigin);
            }
        }
        t tVar = this.f169538g;
        if (tVar != null) {
            tVar.b(str, fVar2, aVar);
        }
    }

    @Override // QW0.c
    public final void c(@Y61.k String str, @Y61.l Throwable th2, @Y61.l c.a aVar) {
        t tVar = this.f169538g;
        if (tVar != null) {
            tVar.c(str, th2, aVar);
        }
        Uri uri = this.f169533b;
        if (uri != null) {
            com.avito.android.time.c.f301452a.getClass();
            long jA2 = com.avito.android.time.c.f301453b.a() - this.f169540i;
            PerformanceImageTracker.f215083a.getClass();
            Iterator it = PerformanceImageTracker.f215084b.iterator();
            while (it.hasNext()) {
                ((com.avito.android.performance.a) it.next()).a(uri, jA2, th2);
            }
        }
        V2 v22 = V2.f318762a;
        if (th2 == null) {
            th2 = new Exception("FrescoImageRequestListener: onFailure");
        }
        v22.h("Fresco", th2, new a());
    }

    @Override // QW0.c
    public final void d(@Y61.k String str, @Y61.l c.a aVar) {
        Uri uri = this.f169533b;
        if (uri != null) {
            com.avito.android.time.c.f301452a.getClass();
            this.f169540i = com.avito.android.time.c.f301453b.a();
            PerformanceImageTracker.f215083a.getClass();
            Iterator it = PerformanceImageTracker.f215084b.iterator();
            while (it.hasNext()) {
                ((com.avito.android.performance.a) it.next()).b(uri);
            }
        }
        t tVar = this.f169538g;
        if (tVar != null) {
            tVar.d(str, aVar);
        }
    }

    @Override // QW0.c
    public final void a(@Y61.k String str, @Y61.l c.a aVar) {
    }
}
