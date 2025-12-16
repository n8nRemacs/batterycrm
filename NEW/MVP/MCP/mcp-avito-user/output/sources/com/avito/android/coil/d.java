package com.avito.android.coil;

import Y61.k;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import coil.decode.DataSource;
import coil.f;
import coil.request.e;
import coil.request.p;
import coil.request.x;
import com.avito.android.performance.PerformanceImageTracker;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PerformanceEventListener.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/coil/d;", "Lcoil/f;", "<init>", "()V", "a", "_design-modules_compose_shared_coil_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements f {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f119731c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public long f119732b;

    /* compiled from: PerformanceEventListener.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/coil/d$a;", "Lcoil/f$d;", "<init>", "()V", "_design-modules_compose_shared_coil_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements f.d {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Override // coil.f.d
        @k
        public final f create() {
            return new d(null);
        }

        public a() {
        }
    }

    /* compiled from: PerformanceEventListener.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f119733a;

        static {
            int[] iArr = new int[DataSource.values().length];
            try {
                DataSource dataSource = DataSource.f58268b;
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f119733a = iArr;
        }
    }

    public /* synthetic */ d(C42822w c42822w) {
        this();
    }

    @Override // coil.f, coil.request.p.b
    public final void a(@k p pVar) {
        Object obj = pVar.f58660b;
        Uri uri = obj instanceof Uri ? (Uri) obj : null;
        if (uri == null) {
            return;
        }
        com.avito.android.time.c.f301452a.getClass();
        this.f119732b = com.avito.android.time.c.f301453b.a();
        PerformanceImageTracker.f215083a.getClass();
        Iterator it = PerformanceImageTracker.f215084b.iterator();
        while (it.hasNext()) {
            ((com.avito.android.performance.a) it.next()).b(uri);
        }
    }

    @Override // coil.f, coil.request.p.b
    public final void b(@k p pVar, @k e eVar) {
        Object obj = pVar.f58660b;
        Uri uri = obj instanceof Uri ? (Uri) obj : null;
        if (uri == null) {
            return;
        }
        com.avito.android.time.c.f301452a.getClass();
        long jA2 = com.avito.android.time.c.f301453b.a() - this.f119732b;
        PerformanceImageTracker performanceImageTracker = PerformanceImageTracker.f215083a;
        Throwable th2 = eVar.f58643c;
        performanceImageTracker.getClass();
        Iterator it = PerformanceImageTracker.f215084b.iterator();
        while (it.hasNext()) {
            ((com.avito.android.performance.a) it.next()).a(uri, jA2, th2);
        }
    }

    @Override // coil.f, coil.request.p.b
    public final void c(@k p pVar, @k x xVar) {
        Object obj = pVar.f58660b;
        Uri uri = obj instanceof Uri ? (Uri) obj : null;
        if (uri == null) {
            return;
        }
        com.avito.android.time.c.f301452a.getClass();
        long jA2 = com.avito.android.time.c.f301453b.a() - this.f119732b;
        PerformanceImageTracker performanceImageTracker = PerformanceImageTracker.f215083a;
        Drawable drawable = xVar.f58738a;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        PerformanceImageTracker.ImageOrigin imageOrigin = b.f119733a[xVar.f58740c.ordinal()] == 1 ? PerformanceImageTracker.ImageOrigin.f215085b : PerformanceImageTracker.ImageOrigin.f215086c;
        performanceImageTracker.getClass();
        Iterator it = PerformanceImageTracker.f215084b.iterator();
        while (it.hasNext()) {
            ((com.avito.android.performance.a) it.next()).c(uri, jA2, intrinsicWidth, intrinsicHeight, 0L, imageOrigin);
        }
    }

    public d() {
    }
}
