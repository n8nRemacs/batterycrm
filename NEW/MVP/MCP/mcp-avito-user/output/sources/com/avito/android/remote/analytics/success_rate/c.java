package com.avito.android.remote.analytics.success_rate;

import Y61.k;
import androidx.view.C23050m0;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.analytics.B;
import com.avito.android.remote.analytics.image.q;
import com.avito.android.remote.analytics.success_rate.a;
import com.avito.android.remote.analytics.success_rate.f;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import j.k0;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import l41.o;

/* compiled from: NetworkRequestsSuccessRateAnalytics.kt */
@Singleton
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/remote/analytics/success_rate/c;", "Lcom/avito/android/remote/analytics/success_rate/b;", "Landroidx/lifecycle/q;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class c implements com.avito.android.remote.analytics.success_rate.b, InterfaceC23057q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC28373a f253240b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f253241c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final B f253242d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final q f253243e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.remote.analytics.success_rate.f f253244f = new com.avito.android.remote.analytics.success_rate.f();

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<G0> f253245g = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.d<a.b> f253246h = C31685o.m();

    /* compiled from: NetworkRequestsSuccessRateAnalytics.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lcom/avito/android/remote/analytics/success_rate/a$a;", "apply", "(J)Lcom/avito/android/remote/analytics/success_rate/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final e<T, R> f253251b = new e<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Number) obj).longValue();
            return a.C7608a.f253236a;
        }
    }

    /* compiled from: NetworkRequestsSuccessRateAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/G0;", "kotlin.jvm.PlatformType", "it", "Lcom/avito/android/remote/analytics/success_rate/a$a;", "apply", "(Lkotlin/G0;)Lcom/avito/android/remote/analytics/success_rate/a$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T, R> f253252b = new f<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return a.C7608a.f253236a;
        }
    }

    /* compiled from: NetworkRequestsSuccessRateAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/analytics/success_rate/a;", "kotlin.jvm.PlatformType", "command", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/analytics/success_rate/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            com.avito.android.remote.analytics.success_rate.a aVar = (com.avito.android.remote.analytics.success_rate.a) obj;
            boolean zF2 = L.f(aVar, a.C7608a.f253236a);
            c cVar = c.this;
            if (zF2) {
                cVar.b();
                return;
            }
            if (aVar instanceof a.b) {
                a.b bVar = (a.b) aVar;
                ResponseType responseType = bVar.f253238b;
                com.avito.android.remote.analytics.success_rate.f fVar = cVar.f253244f;
                LinkedHashMap linkedHashMap = fVar.f253261a;
                LinkedHashMap linkedHashMap2 = fVar.f253263c;
                f.a aVar2 = com.avito.android.remote.analytics.success_rate.f.f253260f;
                aVar2.getClass();
                String str = bVar.f253237a;
                int iB2 = f.a.b(linkedHashMap, linkedHashMap2, str);
                LinkedHashMap linkedHashMap3 = fVar.f253262b;
                LinkedHashMap linkedHashMap4 = fVar.f253264d;
                if (iB2 >= 1024 || f.a.b(linkedHashMap3, linkedHashMap4, str) >= 1024) {
                    cVar.b();
                }
                LinkedHashMap linkedHashMap5 = fVar.f253261a;
                aVar2.getClass();
                int iB3 = f.a.b(linkedHashMap5, linkedHashMap2, str);
                int iB4 = f.a.b(linkedHashMap3, linkedHashMap4, str);
                if (iB3 >= 1024 || iB4 >= 1024) {
                    throw new IllegalStateException("Check failed.");
                }
                int iOrdinal = responseType.ordinal();
                if (iOrdinal == 0) {
                    f.a.a(aVar2, linkedHashMap5, str);
                    return;
                }
                if (iOrdinal == 1) {
                    f.a.a(aVar2, linkedHashMap3, str);
                } else if (iOrdinal == 2) {
                    f.a.a(aVar2, linkedHashMap2, str);
                } else {
                    if (iOrdinal != 3) {
                        return;
                    }
                    f.a.a(aVar2, linkedHashMap4, str);
                }
            }
        }
    }

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a, @k InterfaceC35745a5 interfaceC35745a5, @k B b12, @k q qVar) {
        this.f253240b = interfaceC28373a;
        this.f253241c = interfaceC35745a5;
        this.f253242d = b12;
        this.f253243e = qVar;
    }

    public static final y.a c(int i12, String str) {
        return new y.a("requests.success-rate.".concat(str), i12);
    }

    @Override // com.avito.android.remote.analytics.success_rate.b
    public final void a() {
        C23050m0.f46822j.getClass();
        C23050m0.f46823k.f46829g.a(this);
        B b12 = this.f253242d;
        b12.getF253089e().t0(new l41.g() { // from class: com.avito.android.remote.analytics.success_rate.c.a
            @Override // l41.g
            public final void accept(Object obj) {
                c.this.f253246h.accept(new a.b(((B.c) obj).f253084a, ResponseType.f253230b));
            }
        });
        b12.getF253088d().t0(new l41.g() { // from class: com.avito.android.remote.analytics.success_rate.c.b
            @Override // l41.g
            public final void accept(Object obj) {
                c.this.f253246h.accept(new a.b(((B.b) obj).f253079b, ResponseType.f253231c));
            }
        });
        q qVar = this.f253243e;
        qVar.getF253163e().t0(new l41.g() { // from class: com.avito.android.remote.analytics.success_rate.c.c
            @Override // l41.g
            public final void accept(Object obj) {
                c.this.f253246h.accept(new a.b(((q.b) obj).f253158a, ResponseType.f253232d));
            }
        });
        qVar.getF253162d().t0(new l41.g() { // from class: com.avito.android.remote.analytics.success_rate.c.d
            @Override // l41.g
            public final void accept(Object obj) {
                c.this.f253246h.accept(new a.b(((q.a) obj).f253156b, ResponseType.f253233e));
            }
        });
        z.e0(z.a0(5L, 5L, TimeUnit.MINUTES, io.reactivex.rxjava3.schedulers.b.f404942b).d0(e.f253251b), this.f253245g.d0(f.f253252b), this.f253246h).j0(this.f253241c.a()).t0(new g());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d8, code lost:
    
        if (r5 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00da, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
    
        r1 = r19.f253240b;
        r1.c(r5);
        r1.c(c(r5.f406561d, "api.success"));
        r1.c(c(r5.f406562e, "api.failure"));
        r1.c(c(r5.f406563f, "image.success"));
        r1.c(c(r5.f406564g, "image.failure"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x010c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.analytics.success_rate.c.b():void");
    }

    @Override // androidx.view.InterfaceC23057q
    @k0
    public final void onStop(@k InterfaceC22983P interfaceC22983P) {
        this.f253245g.accept(G0.f406611a);
    }
}
