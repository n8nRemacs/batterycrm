package com.avito.android.remote.analytics;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.analytics.B;
import com.avito.android.remote.error.ApiError;
import com.squareup.anvil.annotations.ContributesBinding;
import j.InterfaceC42148d;
import java.lang.annotation.Annotation;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.sequences.C43033p;
import kotlin.text.C43066x;
import okhttp3.Request;

/* compiled from: NetworkResponsesRelayImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/C;", "Lcom/avito/android/remote/analytics/B;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class C implements B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f253085a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f253086b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f253087c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d f253088d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d f253089e;

    /* compiled from: NetworkResponsesRelayImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0015\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/jakewharton/rxrelay3/d;", "Lcom/avito/android/remote/analytics/B$b;", "kotlin.jvm.PlatformType", "Lj41/e;", "invoke", "()Lcom/jakewharton/rxrelay3/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.jakewharton.rxrelay3.d<B.b>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f253090l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.jakewharton.rxrelay3.d<B.b> invoke() {
            return C31685o.m();
        }
    }

    /* compiled from: NetworkResponsesRelayImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0015\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/jakewharton/rxrelay3/d;", "Lcom/avito/android/remote/analytics/B$c;", "kotlin.jvm.PlatformType", "Lj41/e;", "invoke", "()Lcom/jakewharton/rxrelay3/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.jakewharton.rxrelay3.d<B.c>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f253091l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.jakewharton.rxrelay3.d<B.c> invoke() {
            return C31685o.m();
        }
    }

    @Inject
    public C(@Y61.k u uVar) {
        this.f253085a = uVar;
        InterfaceC42726C interfaceC42726CA = C42727D.a(a.f253090l);
        this.f253086b = interfaceC42726CA;
        InterfaceC42726C interfaceC42726CA2 = C42727D.a(b.f253091l);
        this.f253087c = interfaceC42726CA2;
        this.f253088d = (com.jakewharton.rxrelay3.d) interfaceC42726CA.getValue();
        this.f253089e = (com.jakewharton.rxrelay3.d) interfaceC42726CA2.getValue();
    }

    @Override // com.avito.android.remote.analytics.B
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final com.jakewharton.rxrelay3.d getF253088d() {
        return this.f253088d;
    }

    @Override // com.avito.android.remote.analytics.B
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.d getF253089e() {
        return this.f253089e;
    }

    @Override // com.avito.android.remote.analytics.B
    @InterfaceC42148d
    public final void c(@Y61.k Y41.a<Request> aVar, @Y61.k Annotation[] annotationArr) {
        H.f253095a.getClass();
        String str = (String) C43033p.n(C43033p.y(C42756l.f(annotationArr), G.f253094l));
        String strQ0 = str != null ? C43066x.q0(str, "?") : null;
        String url = aVar.invoke().url().getUrl();
        if (strQ0 == null) {
            strQ0 = url;
        }
        ((com.jakewharton.rxrelay3.d) this.f253087c.getValue()).accept(new B.c(this.f253085a.a(strQ0, url)));
    }

    @Override // com.avito.android.remote.analytics.B
    @InterfaceC42148d
    public final void d(@Y61.k Y41.a<Request> aVar, @Y61.k Annotation[] annotationArr, @Y61.l String str, @Y61.k Throwable th2, @Y61.l ApiError apiError) {
        H.f253095a.getClass();
        String str2 = (String) C43033p.n(C43033p.y(C42756l.f(annotationArr), G.f253094l));
        String strQ0 = str2 != null ? C43066x.q0(str2, "?") : null;
        String url = aVar.invoke().url().getUrl();
        if (strQ0 == null) {
            strQ0 = url;
        }
        ((com.jakewharton.rxrelay3.d) this.f253086b.getValue()).accept(new B.b(url, this.f253085a.a(strQ0, url), annotationArr, str, th2, apiError));
    }
}
