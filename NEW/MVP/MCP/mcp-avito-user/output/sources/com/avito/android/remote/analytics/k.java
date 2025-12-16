package com.avito.android.remote.analytics;

import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.C34265g0;
import com.avito.android.remote.analytics.j;
import com.google.gson.Gson;
import java.lang.annotation.Annotation;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import lj0.InterfaceC43782b;

/* compiled from: NetworkErrorsReporterFactory.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/k;", "", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<Gson> f253169a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I1 f253170b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f253171c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n f253172d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final y f253173e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43782b f253174f;

    @Inject
    public k(@Y61.k h31.e<Gson> eVar, @Y61.k I1 i12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k n nVar, @Y61.k y yVar, @Y61.k InterfaceC43782b interfaceC43782b) {
        this.f253169a = eVar;
        this.f253170b = i12;
        this.f253171c = interfaceC28373a;
        this.f253172d = nVar;
        this.f253173e = yVar;
        this.f253174f = interfaceC43782b;
    }

    @Y61.k
    public final j a(@Y61.k Annotation[] annotationArr) {
        I1 i12 = this.f253170b;
        i12.getClass();
        kotlin.reflect.n<Object> nVar = I1.f67278k0[13];
        if (!((Boolean) i12.f67327n.a().invoke()).booleanValue()) {
            return j.a.f253168a;
        }
        return new m(new C34265g0(this.f253169a.get(), annotationArr), this.f253171c, this.f253172d, this.f253170b, this.f253173e, this.f253174f);
    }
}
