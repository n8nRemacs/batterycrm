package com.avito.android.favorite_sellers.service;

import android.app.IntentService;
import android.content.Intent;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.C29972i;
import com.avito.android.favorite_sellers.service.di.b;
import com.avito.android.util.C35974x2;
import com.avito.android.util.Y5;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import oc.C44752a;

/* compiled from: FavoriteSellerService.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_sellers/service/FavoriteSellerService;", "Landroid/app/IntentService;", "<init>", "()V", "_avito_favorite-sellers_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoriteSellerService extends IntentService {

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f156107b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public com.avito.android.notification.m f156108c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public e f156109d;

    /* compiled from: FavoriteSellerService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f156110a;

        static {
            int[] iArr = new int[FavoriteSellerServiceAction.values().length];
            try {
                FavoriteSellerServiceAction favoriteSellerServiceAction = FavoriteSellerServiceAction.f156111b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f156110a = iArr;
        }
    }

    public FavoriteSellerService() {
        super("FavoriteSellerService");
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b.a aVarA = com.avito.android.favorite_sellers.service.di.a.a();
        aVarA.a((com.avito.android.favorite_sellers.service.di.c) C29972i.a(C29972i.b(this), com.avito.android.favorite_sellers.service.di.c.class));
        aVarA.build().a(this);
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@Y61.l Intent intent) throws InterruptedException {
        String stringExtra;
        Integer numB;
        if (intent == null || (stringExtra = intent.getStringExtra("user_key")) == null || (numB = C35974x2.b(intent, "notification_id")) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        String stringExtra2 = intent.getStringExtra("notification_tag");
        FavoriteSellerServiceAction favoriteSellerServiceAction = (FavoriteSellerServiceAction) intent.getSerializableExtra("action");
        NotificationAnalyticParams notificationAnalyticParams = (NotificationAnalyticParams) intent.getParcelableExtra("notification_analytics");
        if (notificationAnalyticParams != null) {
            InterfaceC28373a interfaceC28373a = this.f156107b;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new C44752a(notificationAnalyticParams.f156115c, notificationAnalyticParams.f156114b));
        }
        com.avito.android.notification.m mVar = this.f156108c;
        if (mVar == null) {
            mVar = null;
        }
        mVar.b().a(iIntValue, stringExtra2);
        if (a.f156110a[favoriteSellerServiceAction.ordinal()] == 1) {
            e eVar = this.f156109d;
            e eVar2 = eVar != null ? eVar : null;
            z zVarA = Y5.a(eVar2.f156122a.d("push", stringExtra, false));
            c cVar = new c(eVar2, stringExtra);
            l41.g gVar = d.f156119b;
            InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
            Objects.requireNonNull(gVar, "onError is null");
            Objects.requireNonNull(interfaceC43543a, "onComplete is null");
            y yVar = new y(cVar, gVar, interfaceC43543a, io.reactivex.rxjava3.internal.functions.a.f401994d);
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            io.reactivex.rxjava3.internal.observers.k kVar = new io.reactivex.rxjava3.internal.observers.k(linkedBlockingQueue);
            yVar.b(kVar);
            zVarA.c(kVar);
            while (!kVar.getF318621e()) {
                Object objPoll = linkedBlockingQueue.poll();
                if (objPoll == null) {
                    try {
                        objPoll = linkedBlockingQueue.take();
                    } catch (InterruptedException e12) {
                        kVar.dispose();
                        yVar.onError(e12);
                        return;
                    }
                }
                if (kVar.getF318621e() || objPoll == io.reactivex.rxjava3.internal.observers.k.f402112c || NotificationLite.c(yVar, objPoll)) {
                    return;
                }
            }
        }
    }
}
