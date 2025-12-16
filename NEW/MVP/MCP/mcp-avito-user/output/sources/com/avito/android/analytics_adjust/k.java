package com.avito.android.analytics_adjust;

import Gc.InterfaceC13864a;
import Hc.InterfaceC13975a;
import android.app.Application;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.LogLevel;
import com.avito.android.di.module.M4;
import com.avito.android.util.C5;
import com.avito.android.util.J5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import io.reactivex.rxjava3.internal.operators.maybe.s0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.O;
import j.k0;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Optional;
import java.util.function.Consumer;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.text.C43047d;
import kotlin.text.C43059p;

/* compiled from: Adjust.kt */
@k0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics_adjust/k;", "Lcom/avito/android/analytics_adjust/a;", "Lcom/avito/android/util/J5;", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends J5 implements InterfaceC28533a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Application f91220c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f91221d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28534b f91222e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f91223f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final r f91224g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f91225h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final u f91226i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Optional<Hc.b> f91227j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Optional<InterfaceC13975a> f91228k;

    /* compiled from: Adjust.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends H implements Y41.l<InterfaceC13975a, G0> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f91229b = new a();

        public a() {
            super(1, InterfaceC13975a.class, "initOaid", "initOaid()V", 0);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC13975a interfaceC13975a) {
            interfaceC13975a.a();
            return G0.f406611a;
        }
    }

    @Inject
    public k(@Y61.k Application application, @Y61.k com.avito.android.util.C c12, @Y61.k InterfaceC28534b interfaceC28534b, @InterfaceC13864a @Y61.k String str, @Gc.b @Y61.k r rVar, @M4 @Y61.l String str2, @Y61.k u uVar, @Y61.k Optional<Hc.b> optional, @Y61.k Optional<InterfaceC13975a> optional2) {
        this.f91220c = application;
        this.f91221d = c12;
        this.f91222e = interfaceC28534b;
        this.f91223f = str;
        this.f91224g = rVar;
        this.f91225h = str2;
        this.f91226i = uVar;
        this.f91227j = optional;
        this.f91228k = optional2;
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28533a
    public final void e(@Y61.k String str) throws NoSuchAlgorithmException {
        if (str.length() <= 0) {
            Adjust.removeGlobalPartnerParameter("user_id");
            return;
        }
        C43059p c43059p = C5.f318567a;
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes(C43047d.f410589b));
        String string = new BigInteger(1, messageDigest.digest()).toString(16);
        while (string.length() < 32) {
            string = "0".concat(string);
        }
        Adjust.addGlobalPartnerParameter("user_id", string);
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28533a
    @Y61.k
    public final O f() {
        return new C42006d(new com.avito.android.advert.item.delivery_suggests.l(20)).r(new l41.o() { // from class: com.avito.android.analytics_adjust.l
            @Override // l41.o
            public final Object apply(Object obj) {
                return h.a((String) obj);
            }
        });
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28533a
    @Y61.k
    public final O getOaid() {
        Optional<Hc.b> optional = this.f91227j;
        io.reactivex.rxjava3.core.q<String> oaid = optional.isPresent() ? optional.get().getOaid() : C41928w.f403335b;
        oaid.getClass();
        return new s0(oaid, "").r(new l41.o() { // from class: com.avito.android.analytics_adjust.n
            @Override // l41.o
            public final Object apply(Object obj) {
                return A.a((String) obj);
            }
        });
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28533a
    public final void k(@Y61.k String str) {
        Adjust.setPushToken(str, this.f91220c);
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28533a
    @Y61.k
    public final O l() {
        return this.f91226i.a().r(new l41.o() { // from class: com.avito.android.analytics_adjust.m
            @Override // l41.o
            public final Object apply(Object obj) {
                return y.a((String) obj);
            }
        });
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28533a
    @Y61.k
    public final AdjustEvent m(@Y61.k String str) {
        return new AdjustEvent(str);
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        this.f91221d.getF125491k().getClass();
        final a aVar = a.f91229b;
        this.f91228k.ifPresent(new Consumer() { // from class: com.avito.android.analytics_adjust.i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                aVar.invoke(obj);
            }
        });
        AdjustConfig adjustConfig = new AdjustConfig(this.f91220c, this.f91223f, AdjustConfig.ENVIRONMENT_PRODUCTION, false);
        adjustConfig.enableSendingInBackground();
        adjustConfig.setLogLevel(LogLevel.SUPRESS);
        r rVar = this.f91224g;
        String str = rVar.f91243a;
        if (str != null) {
            adjustConfig.setDefaultTracker(str);
        }
        if (rVar.f91244b) {
            adjustConfig.enablePreinstallTracking();
        }
        String str2 = this.f91225h;
        if (str2 != null) {
            Adjust.addGlobalCallbackParameter("android_deviceid", str2);
            Adjust.addGlobalPartnerParameter("device_id", str2);
        }
        adjustConfig.setOnDeferredDeeplinkResponseListener(new Ae0.c(this.f91222e, 21));
        Adjust.initSdk(adjustConfig);
        V2.f318762a.i("AdjustWrapper", "Adjust initialized", null);
    }

    @Override // com.avito.android.analytics_adjust.InterfaceC28533a
    public final void trackEvent(@Y61.k AdjustEvent adjustEvent) {
        Adjust.trackEvent(adjustEvent);
    }
}
