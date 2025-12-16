package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.util.AppStore;
import com.avito.android.util.C35946t2;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35950u;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35896f0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserKeysAnalyticsTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/avito/android/app/task/UserKeysAnalyticsTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/error_reporting/error_reporter/n;", "errorReporter", "Lcom/avito/android/util/u;", "buildInfo", "Lcom/avito/android/remote/H;", "deviceIdProvider", "Lcom/avito/android/util/I1;", "googlePlayServicesInfo", "Lcom/avito/android/util/a5;", "schedulers", "<init>", "(Lcom/avito/android/error_reporting/error_reporter/n;Lcom/avito/android/util/u;Lcom/avito/android/remote/H;Lcom/avito/android/util/I1;Lcom/avito/android/util/a5;)V", "Lkotlin/G0;", "addKeys", "()V", "addStore", "addGooglePlayServiceVersion", "Landroid/app/Application;", "application", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/error_reporting/error_reporter/n;", "Lcom/avito/android/util/u;", "Lcom/avito/android/remote/H;", "Lcom/avito/android/util/I1;", "Lcom/avito/android/util/a5;", "Companion", "a", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserKeysAnalyticsTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private static final a Companion = new a(null);

    @Y61.k
    private final InterfaceC35950u buildInfo;

    @Y61.k
    private final com.avito.android.remote.H deviceIdProvider;

    @Y61.k
    private final com.avito.android.error_reporting.error_reporter.n errorReporter;

    @Y61.k
    private final com.avito.android.util.I1 googlePlayServicesInfo;

    @Y61.k
    private final InterfaceC35745a5 schedulers;

    /* compiled from: UserKeysAnalyticsTask.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/app/task/UserKeysAnalyticsTask$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UserKeysAnalyticsTask.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            UserKeysAnalyticsTask.this.addKeys();
        }
    }

    @Inject
    public UserKeysAnalyticsTask(@Y61.k com.avito.android.error_reporting.error_reporter.n nVar, @Y61.k InterfaceC35950u interfaceC35950u, @Y61.k com.avito.android.remote.H h12, @Y61.k com.avito.android.util.I1 i12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.errorReporter = nVar;
        this.buildInfo = interfaceC35950u;
        this.deviceIdProvider = h12;
        this.googlePlayServicesInfo = i12;
        this.schedulers = interfaceC35745a5;
    }

    private final void addGooglePlayServiceVersion() {
        try {
            this.errorReporter.b("device_id", this.deviceIdProvider.getF253025a());
        } catch (Exception e12) {
            V2.f318762a.a("UserKeysAnalyticsTask", "Failed to set custom key", e12);
        }
        try {
            com.avito.android.error_reporting.error_reporter.n nVar = this.errorReporter;
            Integer numA = this.googlePlayServicesInfo.a();
            nVar.n(numA != null ? numA.intValue() : -1, "gps_version_code");
        } catch (Exception e13) {
            V2.f318762a.a("UserKeysAnalyticsTask", "Failed to set custom key", e13);
        }
        try {
            com.avito.android.error_reporting.error_reporter.n nVar2 = this.errorReporter;
            String strB = this.googlePlayServicesInfo.b();
            if (strB == null) {
                strB = "N/A";
            }
            nVar2.b("gps_version_name", strB);
        } catch (Exception e14) {
            V2.f318762a.a("UserKeysAnalyticsTask", "Failed to set custom key", e14);
        }
        try {
            this.errorReporter.n(this.googlePlayServicesInfo.c(), "gps_library_version_code");
        } catch (Exception e15) {
            V2.f318762a.a("UserKeysAnalyticsTask", "Failed to set custom key", e15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addKeys() {
        addStore();
        addGooglePlayServiceVersion();
    }

    private final void addStore() {
        if (this.buildInfo.getF125488h() != AppStore.f318525b) {
            this.errorReporter.b("store", this.buildInfo.getF125488h().name());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void execute$lambda$0(io.reactivex.rxjava3.core.B b12) {
        b12.onNext(kotlin.G0.f406611a);
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        C35896f0.f(new io.reactivex.rxjava3.internal.operators.observable.A0(new io.reactivex.rxjava3.internal.operators.observable.C(new com.avito.android.advert.item.delivery_suggests.l(21)), new C35946t2(this.errorReporter)).K(new b()).x0(this.schedulers.a()));
    }
}
