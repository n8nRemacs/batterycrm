package yv0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.serp.r;
import com.google.gson.Gson;
import dagger.internal.h;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ServiceTransportationWidgetAnalyticsImpl_Factory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lyv0/c;", "Ldagger/internal/h;", "Lyv0/b;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yv0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50309c implements h<C50308b> {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f443610d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Provider<InterfaceC28373a> f443611a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Provider<r> f443612b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<Gson> f443613c;

    /* compiled from: ServiceTransportationWidgetAnalyticsImpl_Factory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyv0/c$a;", "", "<init>", "()V", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yv0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C50309c(@k Provider<InterfaceC28373a> provider, @k Provider<r> provider2, @k Provider<Gson> provider3) {
        this.f443611a = provider;
        this.f443612b = provider2;
        this.f443613c = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28373a interfaceC28373a = this.f443611a.get();
        r rVar = this.f443612b.get();
        Gson gson = this.f443613c.get();
        f443610d.getClass();
        return new C50308b(interfaceC28373a, rVar, gson);
    }
}
