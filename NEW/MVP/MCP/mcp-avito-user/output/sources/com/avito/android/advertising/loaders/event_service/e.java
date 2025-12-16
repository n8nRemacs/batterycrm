package com.avito.android.advertising.loaders.event_service;

import Db.InterfaceC13381a;
import android.annotation.SuppressLint;
import androidx.camera.camera2.internal.G;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaAnalyticsBadResponseException;
import com.avito.android.advertising.loaders.buzzoola.BuzzoolaPixels;
import com.avito.android.remote.interceptor.U0;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import l41.o;
import l41.r;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import xb.C49917c;

/* compiled from: CommercialPixelService.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/event_service/e;", "Lcom/avito/android/advertising/loaders/event_service/c;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements com.avito.android.advertising.loaders.event_service.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13381a f88340a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f88341b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final H f88342c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final OkHttpClient f88343d;

    /* compiled from: CommercialPixelService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lokhttp3/Request;", "request", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/advertising/loaders/event_service/k;", "apply", "(Lokhttp3/Request;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            return e.k(e.this, (Request) obj);
        }
    }

    /* compiled from: CommercialPixelService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/event_service/k;", "pixelResponse", "Lkotlin/G0;", "accept", "(Lcom/avito/android/advertising/loaders/event_service/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f88346c;

        public b(String str) {
            this.f88346c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) throws IOException {
            e.j(e.this, (k) obj, this.f88346c, false);
        }
    }

    /* compiled from: CommercialPixelService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f88348c;

        public c(String str) {
            this.f88348c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            e eVar = e.this;
            String str = this.f88348c;
            e.l(eVar, th2, str, false);
            if (eVar.f88340a.b() && (th2 instanceof PixelThrowable)) {
                eVar.o(((PixelThrowable) th2).f88334b, str);
            }
        }
    }

    /* compiled from: CommercialPixelService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final d<T> f88349b = new d<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: CommercialPixelService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "Lokhttp3/Request;", "apply", "(Z)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advertising.loaders.event_service.e$e, reason: collision with other inner class name */
    public static final class C2611e<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f88351c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f88352d;

        public C2611e(List<String> list, String str) {
            this.f88351c = list;
            this.f88352d = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Boolean) obj).getClass();
            e.this.getClass();
            Request[] requestArrN = e.n(this.f88352d, this.f88351c);
            return z.V(Arrays.copyOf(requestArrN, requestArrN.length));
        }
    }

    /* compiled from: CommercialPixelService.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "isConnectionAvailable", "apply", "(JZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T1, T2, R> f88353b = new f<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            ((Number) obj).longValue();
            Boolean bool = (Boolean) obj2;
            bool.booleanValue();
            return bool;
        }
    }

    /* compiled from: CommercialPixelService.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "isConnectionAvailable", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g<T> implements r {

        /* renamed from: b, reason: collision with root package name */
        public static final g<T> f88354b = new g<>();

        @Override // l41.r
        public final boolean test(Object obj) {
            return ((Boolean) obj).booleanValue();
        }
    }

    /* compiled from: CommercialPixelService.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/advertising/loaders/event_service/k;", "apply", "(Z)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T, R> implements o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Request f88356c;

        public h(Request request) {
            this.f88356c = request;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            ((Boolean) obj).getClass();
            return e.k(e.this, this.f88356c);
        }
    }

    /* compiled from: CommercialPixelService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/event_service/k;", "pixelResponse", "Lkotlin/G0;", "accept", "(Lcom/avito/android/advertising/loaders/event_service/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f88358c;

        public i(String str) {
            this.f88358c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) throws IOException {
            e.j(e.this, (k) obj, this.f88358c, true);
        }
    }

    /* compiled from: CommercialPixelService.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f88360c;

        public j(String str) {
            this.f88360c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            e.l(e.this, (Throwable) obj, this.f88360c, true);
        }
    }

    @Inject
    public e(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k U0 u02, @Y61.k InterfaceC13381a interfaceC13381a, @Y61.k com.avito.android.connection_quality.connectivity.a aVar) {
        this.f88340a = interfaceC13381a;
        this.f88341b = aVar;
        this.f88342c = interfaceC35745a5.g(Executors.newFixedThreadPool(interfaceC13381a.b() ? 8 : 4));
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        String f253555a = u02.getF253555a();
        if (f253555a != null && !C43066x.K(f253555a)) {
            builder.addInterceptor(new C49917c(u02, f253555a));
        }
        this.f88343d = builder.build();
    }

    public static final void j(e eVar, k kVar, String str, boolean z12) throws IOException {
        eVar.getClass();
        boolean zIsSuccessful = kVar.f88368b.isSuccessful();
        Response response = kVar.f88368b;
        if (!zIsSuccessful) {
            long jCurrentTimeMillis = System.currentTimeMillis() - kVar.f88369c;
            V2 v22 = V2.f318762a;
            String str2 = z12 ? "pixel_error_retry" : "pixel_error";
            int iCode = response.code();
            Request request = kVar.f88367a;
            String url = request.url().getUrl();
            StringBuilder sb2 = new StringBuilder("Bad Response: ");
            sb2.append(iCode);
            sb2.append(", Loading Time: ");
            sb2.append(jCurrentTimeMillis);
            v22.a("DEFAULT_TAG", str2, new BuzzoolaAnalyticsBadResponseException(G.h(sb2, " ms network ", str, " in ", url)));
            if (!z12 && eVar.f88340a.b()) {
                eVar.o(request, str);
            }
        }
        ResponseBody responseBodyBody = response.body();
        if (responseBodyBody != null) {
            responseBodyBody.close();
        }
    }

    public static final C41982q1 k(final e eVar, final Request request) {
        eVar.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        z c12 = new C(new io.reactivex.rxjava3.core.C() { // from class: com.avito.android.advertising.loaders.event_service.d
            @Override // io.reactivex.rxjava3.core.C
            public final void f(B b12) {
                e eVar2 = this.f88337b;
                Request request2 = request;
                long j12 = jCurrentTimeMillis;
                try {
                    b12.onNext(new k(j12, request2, eVar2.f88343d.newCall(request2).execute()));
                    b12.e();
                } catch (Throwable th2) {
                    b12.onError(new PixelThrowable(request2, th2, j12));
                }
            }
        });
        if (eVar.f88340a.b()) {
            c12 = c12.E0(5L, TimeUnit.SECONDS, null, io.reactivex.rxjava3.schedulers.b.f404942b).l0(new com.avito.android.advertising.loaders.event_service.f(request, jCurrentTimeMillis));
        }
        return c12.x0(eVar.f88342c);
    }

    public static final void l(e eVar, Throwable th2, String str, boolean z12) {
        eVar.getClass();
        boolean z13 = th2 instanceof PixelThrowable;
        String url = z13 ? ((PixelThrowable) th2).f88334b.url().getUrl() : "";
        long jCurrentTimeMillis = z13 ? System.currentTimeMillis() - ((PixelThrowable) th2).f88336d : 0L;
        if (z13) {
            th2 = ((PixelThrowable) th2).f88335c;
        }
        V2 v22 = V2.f318762a;
        String str2 = z12 ? "pixel_error_retry" : "pixel_error";
        StringBuilder sb2 = new StringBuilder("Error Loading Time: ");
        sb2.append(jCurrentTimeMillis);
        sb2.append(" ms network ");
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(url);
        sb2.append(' ');
        String message = th2.getMessage();
        sb2.append(message != null ? message : "");
        v22.a("DEFAULT_TAG", str2, new PixelRequestException(sb2.toString(), th2));
    }

    public static Request[] n(String str, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
            } catch (PixelInvalidUrlException e12) {
                V2.f318762a.a("pixel_error", "", e12);
            } catch (Exception e13) {
                V2 v22 = V2.f318762a;
                StringBuilder sb2 = new StringBuilder("Error network ");
                sb2.append(str);
                sb2.append(" in ");
                sb2.append(str2);
                sb2.append(' ');
                String message = e13.getMessage();
                if (message == null) {
                    message = "";
                }
                sb2.append(message);
                v22.a("pixel_error", "", new PixelInvalidUrlException(sb2.toString(), e13));
            }
            if (!C43066x.h0(str2, "https://", false)) {
                throw new PixelInvalidUrlException("Wrong prefix: " + ((Object) str2.subSequence(0, Math.min(str2.length(), 8))) + " network " + str + " in " + str2);
            }
            arrayList.add(new Request.Builder().url(str2).build());
        }
        return (Request[]) arrayList.toArray(new Request[0]);
    }

    @Override // com.avito.android.advertising.loaders.event_service.c
    public final void a(@Y61.k com.avito.android.advertising.loaders.C c12) {
        if (c12.getF87999p()) {
            return;
        }
        c12.p();
        m(c12.getF88383l(), c12.l());
    }

    @Override // com.avito.android.advertising.loaders.event_service.c
    public final void b(@Y61.k com.avito.android.advertising.loaders.C c12) {
        if (c12.getF87991h()) {
            return;
        }
        c12.j();
        m(c12.getF88383l(), c12.B());
    }

    @Override // com.avito.android.advertising.loaders.event_service.c
    public final void c(@Y61.k BuzzoolaPixels buzzoolaPixels) {
        if (buzzoolaPixels.f88300g) {
            return;
        }
        buzzoolaPixels.f88300g = true;
        m(buzzoolaPixels.f88298e, buzzoolaPixels.f88295b);
    }

    @Override // com.avito.android.advertising.loaders.event_service.c
    public final void d(@Y61.k com.avito.android.advertising.loaders.event_service.b bVar) {
        if (bVar.getF88302i()) {
            return;
        }
        bVar.L();
        m(bVar.getF88298e(), bVar.K());
    }

    @Override // com.avito.android.advertising.loaders.event_service.c
    public final void e(@Y61.k com.avito.android.advertising.loaders.C c12) {
        if (c12.getF87995l()) {
            return;
        }
        c12.n();
        m(c12.getF88383l(), c12.n0());
    }

    @Override // com.avito.android.advertising.loaders.event_service.c
    public final void f(@Y61.k com.avito.android.advertising.loaders.C c12) {
        if (c12.getF87997n()) {
            return;
        }
        c12.f();
        m(c12.getF88383l(), c12.E());
    }

    @Override // com.avito.android.advertising.loaders.event_service.c
    public final void g(@Y61.k com.avito.android.advertising.loaders.C c12) {
        if (c12.getF87993j()) {
            return;
        }
        c12.I();
        m(c12.getF88383l(), c12.s());
    }

    @Override // com.avito.android.advertising.loaders.event_service.c
    public final void h(@Y61.k com.avito.android.advertising.loaders.event_service.i iVar) {
        if (iVar.getF88301h()) {
            return;
        }
        iVar.F();
        m(iVar.c(), iVar.D());
    }

    @Override // com.avito.android.advertising.loaders.event_service.c
    public final void i(@Y61.k com.avito.android.advertising.loaders.event_service.a aVar) {
        if (aVar.getF88303j()) {
            return;
        }
        aVar.i();
        m(aVar.c(), aVar.j());
    }

    @SuppressLint({"CheckResult"})
    public final void m(String str, List list) {
        z zVarV;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        if (this.f88340a.b()) {
            zVarV = this.f88341b.d().N(d.f88349b).z0(1L).T(new C2611e(list, str), Integer.MAX_VALUE);
        } else {
            Request[] requestArrN = n(str, list);
            zVarV = z.V(Arrays.copyOf(requestArrN, requestArrN.length));
        }
        zVarV.T(new a(), Integer.MAX_VALUE).x0(this.f88342c).u0(new b(str), new c(str));
    }

    @SuppressLint({"CheckResult"})
    public final void o(Request request, String str) {
        z.k(z.F0(3L, TimeUnit.SECONDS, io.reactivex.rxjava3.schedulers.b.f404942b), this.f88341b.d(), f.f88353b).N(g.f88354b).z0(1L).T(new h(request), Integer.MAX_VALUE).x0(this.f88342c).u0(new i(str), new j(str));
    }
}
