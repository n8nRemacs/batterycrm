package com.avito.android.search.subscriptions;

import Go0.InterfaceC13902a;
import android.app.IntentService;
import android.content.Intent;
import com.avito.android.I1;
import com.avito.android.di.C29972i;
import com.avito.android.geo_common.interactor.B;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.search.subscriptions.di.n;
import com.avito.android.util.C35835l0;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchSubscriptionSyncService.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/subscriptions/SearchSubscriptionSyncService;", "Landroid/app/IntentService;", "<init>", "()V", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchSubscriptionSyncService extends IntentService {

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public InterfaceC13902a f263849b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public B f263850c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public TV.c f263851d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public com.avito.android.db.l f263852e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public InterfaceC35745a5 f263853f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public SearchParamsConverter f263854g;

    /* renamed from: h, reason: collision with root package name */
    @Inject
    public I1 f263855h;

    /* renamed from: i, reason: collision with root package name */
    @Inject
    public I30.d f263856i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f263857j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f263858k;

    public SearchSubscriptionSyncService() {
        super("SavedSearchSyncService");
        this.f263857j = new io.reactivex.rxjava3.disposables.c();
        this.f263858k = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        n.a aVarA = com.avito.android.search.subscriptions.di.b.a();
        aVarA.a((com.avito.android.search.subscriptions.di.d) C29972i.a(C29972i.b(this), com.avito.android.search.subscriptions.di.d.class));
        aVarA.build().a(this);
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onDestroy() {
        this.f263857j.e();
        this.f263858k.e();
        super.onDestroy();
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@Y61.l Intent intent) {
        z<Location> zVarF;
        if (C35835l0.o(this)) {
            I1 i12 = this.f263855h;
            if (i12 == null) {
                i12 = null;
            }
            i12.getClass();
            kotlin.reflect.n<Object> nVar = I1.f67278k0[12];
            if (((Boolean) i12.f67326m.a().invoke()).booleanValue()) {
                B b12 = this.f263850c;
                if (b12 == null) {
                    b12 = null;
                }
                zVarF = b12.e();
            } else {
                B b13 = this.f263850c;
                if (b13 == null) {
                    b13 = null;
                }
                zVarF = b13.f();
            }
            InterfaceC35745a5 interfaceC35745a5 = this.f263853f;
            if (interfaceC35745a5 == null) {
                interfaceC35745a5 = null;
            }
            C41982q1 c41982q1X0 = zVarF.x0(interfaceC35745a5.b());
            InterfaceC35745a5 interfaceC35745a52 = this.f263853f;
            if (interfaceC35745a52 == null) {
                interfaceC35745a52 = null;
            }
            this.f263857j.b(c41982q1X0.j0(interfaceC35745a52.b()).v0(new o(this), p.f263999b, io.reactivex.rxjava3.internal.functions.a.f401993c));
        }
        TV.c cVar = this.f263851d;
        (cVar != null ? cVar : null).l(new TV.h());
    }
}
