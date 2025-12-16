package com.avito.android.push.impl_module.token.sending.analytics;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.push.PushToken;
import com.avito.android.util.C;
import com.squareup.anvil.annotations.ContributesBinding;
import fg0.InterfaceC40417a;
import io.reactivex.rxjava3.kotlin.A1;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: NotificationSystemSettingsLogger.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/analytics/c;", "Lcom/avito/android/push/impl_module/token/sending/analytics/b;", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.push.impl_module.token.sending.analytics.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f245998a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40417a f245999b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final I30.d f246000c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f246001d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C f246002e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final j f246003f;

    /* compiled from: NotificationSystemSettingsLogger.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f246004l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(Throwable th2) {
            return G0.f406611a;
        }
    }

    /* compiled from: NotificationSystemSettingsLogger.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/push/PushToken;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/push/PushToken;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<PushToken, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f246006m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12) {
            super(1);
            this.f246006m = z12;
        }

        @Override // Y41.l
        public final G0 invoke(PushToken pushToken) {
            c.this.f246001d.c(new com.avito.android.push.impl_module.token.sending.analytics.a(pushToken.f245932b, this.f246006m));
            return G0.f406611a;
        }
    }

    @Inject
    public c(@Y61.k AK0.l lVar, @Y61.k InterfaceC40417a interfaceC40417a, @Y61.k I30.d dVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k C c12, @Y61.k j jVar) {
        this.f245998a = lVar;
        this.f245999b = interfaceC40417a;
        this.f246000c = dVar;
        this.f246001d = interfaceC28373a;
        this.f246002e = c12;
        this.f246003f = jVar;
    }

    @Override // com.avito.android.push.impl_module.token.sending.analytics.b
    public final void a() {
        AK0.l lVar = this.f245998a;
        boolean z12 = lVar.getBoolean("system_notification_settings_first_start", true);
        C c12 = this.f246002e;
        j jVar = this.f246003f;
        if (z12) {
            lVar.putBoolean("system_notification_settings_first_start", false);
            if (c12.getF125487g() >= 33 && !jVar.e()) {
                return;
            }
        }
        boolean z13 = lVar.getBoolean("system_notification_settings_is_2558_sent", jVar.e());
        boolean z14 = lVar.getBoolean("system_notification_settings_was_enable", !(c12.getF125487g() >= 33));
        boolean zB2 = this.f246000c.b();
        if (zB2 != z14 || (!z13 && c12.getF125487g() >= 33)) {
            lVar.putBoolean("system_notification_settings_was_enable", zB2);
            lVar.putBoolean("system_notification_settings_is_2558_sent", true);
            A1.e(this.f245999b.c("NotificationSystemSettingsLogger"), a.f246004l, new b(zB2));
        }
    }
}
