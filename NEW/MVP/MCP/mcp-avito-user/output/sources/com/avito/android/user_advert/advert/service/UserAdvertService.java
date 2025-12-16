package com.avito.android.user_advert.advert.service;

import Y61.l;
import android.app.IntentService;
import android.content.Intent;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.di.C29972i;
import com.avito.android.notification.m;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.remote.model.SuccessResult;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.user_advert.advert.service.UserAdvertServiceAction;
import com.avito.android.user_advert.advert.service.di.b;
import com.avito.android.util.C35974x2;
import com.avito.android.util.V2;
import iI0.C41298c;
import iI0.C41299d;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import nI0.InterfaceC44261b;
import oc.C44752a;

/* compiled from: UserAdvertService.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/service/UserAdvertService;", "Landroid/app/IntentService;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserAdvertService extends IntentService {

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f310613b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public eH0.c f310614c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public InterfaceC44261b f310615d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public PublishIntentFactory f310616e;

    /* renamed from: f, reason: collision with root package name */
    @Inject
    public m f310617f;

    /* renamed from: g, reason: collision with root package name */
    @Inject
    public c f310618g;

    public UserAdvertService() {
        super("UserAdvertService");
    }

    @Override // android.app.IntentService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b.a aVarA = com.avito.android.user_advert.advert.service.di.a.a();
        aVarA.a((com.avito.android.user_advert.advert.service.di.c) C29972i.a(C29972i.b(this), com.avito.android.user_advert.advert.service.di.c.class));
        aVarA.build().a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, java.util.Map] */
    @Override // android.app.IntentService
    public final void onHandleIntent(@l Intent intent) {
        Integer numB;
        boolean zBooleanValue;
        TypedResult typedResult;
        if (intent == null) {
            return;
        }
        NotificationAnalyticParams notificationAnalyticParams = (NotificationAnalyticParams) intent.getParcelableExtra("notification_analytics");
        if (notificationAnalyticParams != null) {
            InterfaceC28373a interfaceC28373a = this.f310613b;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new C44752a(notificationAnalyticParams.f310612c, notificationAnalyticParams.f310611b));
        }
        String stringExtra = intent.getStringExtra("advert_id");
        if (stringExtra == null || (numB = C35974x2.b(intent, "notification_id")) == null) {
            return;
        }
        int iIntValue = numB.intValue();
        String stringExtra2 = intent.getStringExtra("notification_tag");
        UserAdvertServiceAction userAdvertServiceAction = (UserAdvertServiceAction) intent.getParcelableExtra("action");
        m mVar = this.f310617f;
        if (mVar == null) {
            mVar = null;
        }
        mVar.b().a(iIntValue, stringExtra2);
        if (userAdvertServiceAction instanceof UserAdvertServiceAction.Close) {
            c cVar = this.f310618g;
            if (cVar == null) {
                cVar = null;
            }
            String str = ((UserAdvertServiceAction.Close) userAdvertServiceAction).f310621b;
            cVar.getClass();
            try {
                SuccessResult successResult = (SuccessResult) cVar.f310623a.g(stringExtra, str).A(5L, TimeUnit.SECONDS).e();
                V2.f318762a.c("UserAdvertInteractor", "Advert " + stringExtra + " closed with reason " + str + ": " + successResult.getMessage(), null);
                return;
            } catch (Exception e12) {
                V2.f318762a.c("UserAdvertInteractor", androidx.compose.ui.graphics.colorspace.e.n("Failed to close advert ", stringExtra, " with reason ", str), e12);
                return;
            }
        }
        if (!(userAdvertServiceAction instanceof UserAdvertServiceAction.AutoPublish)) {
            if (userAdvertServiceAction instanceof UserAdvertServiceAction.Activate) {
                String stringExtra3 = intent.getStringExtra("skipCpt");
                c cVar2 = this.f310618g;
                if (cVar2 == null) {
                    cVar2 = null;
                }
                cVar2.getClass();
                try {
                    cVar2.f310624b.c(new C41298c(stringExtra));
                    zBooleanValue = ((Boolean) cVar2.f310623a.o(stringExtra, stringExtra3).A(5L, TimeUnit.SECONDS).r(b.f310622b).u(new com.avito.android.iac_dialer_watcher.impl_module.logging.repository.d(9, cVar2, stringExtra)).e()).booleanValue();
                    if (!zBooleanValue) {
                        V2.f318762a.c("UserAdvertInteractor", "Failed to to activate advert with id " + stringExtra + " without app opening", null);
                    }
                } catch (Exception e13) {
                    V2.f318762a.c("UserAdvertInteractor", AK.c.k("Failed to to activate advert with id ", stringExtra, " without app opening"), e13);
                    zBooleanValue = false;
                }
                if (zBooleanValue) {
                    return;
                }
                String string = getString(R.string.advert_activation_failure);
                eH0.c cVar3 = this.f310614c;
                if (cVar3 == null) {
                    cVar3 = null;
                }
                Intent intentD = cVar3.d(stringExtra, string);
                InterfaceC44261b interfaceC44261b = this.f310615d;
                Intent intentPutExtra = intentD.putExtra("up_intent", InterfaceC44261b.a.a(interfaceC44261b != null ? interfaceC44261b : null, null, null, null, null, 31).addFlags(603979776));
                intentPutExtra.setFlags(335544320);
                startActivity(intentPutExtra);
                return;
            }
            return;
        }
        c cVar4 = this.f310618g;
        if (cVar4 == null) {
            cVar4 = null;
        }
        boolean z12 = ((UserAdvertServiceAction.AutoPublish) userAdvertServiceAction).f310620b;
        InterfaceC28373a interfaceC28373a2 = cVar4.f310624b;
        try {
            typedResult = (TypedResult) cVar4.f310623a.n(stringExtra, z12).A(5L, TimeUnit.SECONDS).e();
        } catch (Exception e14) {
            interfaceC28373a2.c(new C41299d(stringExtra, null, e14.getMessage()));
            V2.f318762a.c("UserAdvertInteractor", "Failed to to set autopublish to " + z12 + " for advert " + stringExtra, e14);
        }
        if (!(typedResult instanceof TypedResult.Error)) {
            V2.f318762a.c("UserAdvertInteractor", "Autopublish set to " + z12 + " for advert " + stringExtra, null);
            return;
        }
        interfaceC28373a2.c(new C41299d(stringExtra, null, ((TypedResult.Error) typedResult).getError().getF244063c()));
        V2.f318762a.c("UserAdvertInteractor", "Failed to set autopublish to " + z12 + " for advert " + stringExtra + ": " + ((TypedResult.Error) typedResult).getError(), null);
        String string2 = getString(z12 ? R.string.autopublish_from_push_enable_error : R.string.autopublish_from_push_disable_error);
        eH0.c cVar5 = this.f310614c;
        if (cVar5 == null) {
            cVar5 = null;
        }
        Intent intentD2 = cVar5.d(stringExtra, string2);
        InterfaceC44261b interfaceC44261b2 = this.f310615d;
        Intent intentPutExtra2 = intentD2.putExtra("up_intent", InterfaceC44261b.a.a(interfaceC44261b2 != null ? interfaceC44261b2 : null, null, null, null, null, 31).addFlags(603979776));
        intentPutExtra2.setFlags(335544320);
        startActivity(intentPutExtra2);
    }
}
