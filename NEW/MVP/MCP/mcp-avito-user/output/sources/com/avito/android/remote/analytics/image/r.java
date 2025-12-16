package com.avito.android.remote.analytics.image;

import android.net.Uri;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.analytics.image.q;
import com.avito.android.remote.analytics.u;
import com.squareup.anvil.annotations.ContributesBinding;
import j.InterfaceC42148d;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NetworkImageResponsesRelay.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/image/r;", "Lcom/avito/android/remote/analytics/image/q;", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f253159a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f253160b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Object f253161c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d f253162d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d f253163e;

    /* compiled from: NetworkImageResponsesRelay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0015\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/jakewharton/rxrelay3/d;", "Lcom/avito/android/remote/analytics/image/q$a;", "kotlin.jvm.PlatformType", "Lj41/e;", "invoke", "()Lcom/jakewharton/rxrelay3/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<com.jakewharton.rxrelay3.d<q.a>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f253164l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final com.jakewharton.rxrelay3.d<q.a> invoke() {
            return C31685o.m();
        }
    }

    /* compiled from: NetworkImageResponsesRelay.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0015\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000¢\u0006\u0002\b\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/jakewharton/rxrelay3/d;", "Lcom/avito/android/remote/analytics/image/q$b;", "kotlin.jvm.PlatformType", "Lj41/e;", "invoke", "()Lcom/jakewharton/rxrelay3/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.jakewharton.rxrelay3.d<q.b>> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f253165l = new b();

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.jakewharton.rxrelay3.d<q.b> invoke() {
            return C31685o.m();
        }
    }

    @Inject
    public r(@Y61.k u uVar) {
        this.f253159a = uVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, a.f253164l);
        this.f253160b = interfaceC42726CB;
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, b.f253165l);
        this.f253161c = interfaceC42726CB2;
        this.f253162d = (com.jakewharton.rxrelay3.d) interfaceC42726CB.getValue();
        this.f253163e = (com.jakewharton.rxrelay3.d) interfaceC42726CB2.getValue();
    }

    @Override // com.avito.android.remote.analytics.image.q
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final com.jakewharton.rxrelay3.d getF253162d() {
        return this.f253162d;
    }

    @Override // com.avito.android.remote.analytics.image.q
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.d getF253163e() {
        return this.f253163e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.remote.analytics.image.q
    @InterfaceC42148d
    public final void c(@Y61.k Uri uri, @Y61.l Throwable th2) {
        ((com.jakewharton.rxrelay3.d) this.f253160b.getValue()).accept(new q.a(uri.toString(), this.f253159a.b(uri), th2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // com.avito.android.remote.analytics.image.q
    @InterfaceC42148d
    public final void d(@Y61.k Uri uri) {
        com.jakewharton.rxrelay3.d dVar = (com.jakewharton.rxrelay3.d) this.f253161c.getValue();
        uri.toString();
        dVar.accept(new q.b(this.f253159a.b(uri)));
    }
}
