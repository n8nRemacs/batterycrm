package com.avito.android.api;

import android.app.Activity;
import com.avito.android.K2;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.remote.error.ApiError;
import com.avito.android.retrofit.InterfaceC34411c;
import com.avito.android.util.InterfaceC35745a5;
import id.C41383a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: ApiErrorsHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/api/k;", "", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C41383a f91320a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f91321b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34411c f91322c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f91323d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final r f91324e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final K2 f91325f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.update.k f91326g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final P f91327h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f91328i = C42727D.c(new b(this));

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f91329j = C42727D.c(new j(this));

    @Inject
    public k(@Y61.k C41383a c41383a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC34411c interfaceC34411c, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k r rVar, @Y61.k K2 k22, @Y61.k com.avito.android.update.k kVar, @Y61.k P p12) {
        this.f91320a = c41383a;
        this.f91321b = interfaceC28373a;
        this.f91322c = interfaceC34411c;
        this.f91323d = interfaceC35745a5;
        this.f91324e = rVar;
        this.f91325f = k22;
        this.f91326g = kVar;
        this.f91327h = p12;
    }

    public static final void a(k kVar, ApiError apiError, String str, Y41.l lVar) {
        Activity activity = kVar.f91320a.get();
        if (activity instanceof androidx.appcompat.app.m) {
            androidx.appcompat.app.m mVar = (androidx.appcompat.app.m) activity;
            if (!mVar.isDestroyed() && !mVar.isFinishing()) {
                lVar.invoke(activity);
                return;
            }
        }
        P p12 = kVar.f91327h;
        kotlin.reflect.n<Object> nVar = P.f67370w0[62];
        if (((Boolean) p12.f67392V.a().invoke()).booleanValue()) {
            kVar.f91321b.c(new NonFatalErrorEvent("Can not handle " + apiError + ", activity=" + activity + " for " + str, null, null, new NonFatalErrorEvent.a.b(ApiError.class, apiError.getClass().getSimpleName(), 0, 4, null), 6, null));
        }
    }
}
