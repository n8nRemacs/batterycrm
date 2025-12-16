package com.avito.android.apps_tracking;

import Ad.C13015a;
import Ad.InterfaceC13016b;
import Ad.InterfaceC13020f;
import Ad.j;
import Y61.k;
import android.content.Context;
import com.avito.android.R;
import com.avito.android.T2;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.t0;
import kotlin.reflect.n;
import lD.C43617a;
import pd.InterfaceC47056b;

/* compiled from: InstalledAppsTrackingTask.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010!¨\u0006\""}, d2 = {"Lcom/avito/android/apps_tracking/InstalledAppsTrackingTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Landroid/content/Context;", "context", "LAd/b;", "expirationInteractor", "LAd/f;", "trackingInteractor", "LAd/k;", "bankTrackingInteractor", "Lcom/avito/android/analytics/a;", "analytics", "LlD/a;", "autoFeatures", "Lcom/avito/android/T2;", "webPaymentFeatures", "Lcom/avito/android/analytics/task/a;", "performanceTracker", "Lcom/avito/android/account/E;", "accountStateProvider", "<init>", "(Landroid/content/Context;LAd/b;LAd/f;LAd/k;Lcom/avito/android/analytics/a;LlD/a;Lcom/avito/android/T2;Lcom/avito/android/analytics/task/a;Lcom/avito/android/account/E;)V", "Lkotlin/G0;", "execute", "()V", "Landroid/content/Context;", "LAd/b;", "LAd/f;", "LAd/k;", "Lcom/avito/android/analytics/a;", "LlD/a;", "Lcom/avito/android/T2;", "Lcom/avito/android/analytics/task/a;", "Lcom/avito/android/account/E;", "_avito_apps-tracking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InstalledAppsTrackingTask implements ApplicationForegroundStartupTask {

    @k
    private final E accountStateProvider;

    @k
    private final InterfaceC28373a analytics;

    @k
    private final C43617a autoFeatures;

    @k
    private final Ad.k bankTrackingInteractor;

    @k
    private final Context context;

    @k
    private final InterfaceC13016b expirationInteractor;

    @k
    private final com.avito.android.analytics.task.a performanceTracker;

    @k
    private final InterfaceC13020f trackingInteractor;

    @k
    private final T2 webPaymentFeatures;

    @Inject
    public InstalledAppsTrackingTask(@k Context context, @k InterfaceC13016b interfaceC13016b, @k InterfaceC13020f interfaceC13020f, @k Ad.k kVar, @k InterfaceC28373a interfaceC28373a, @k C43617a c43617a, @k T2 t22, @InterfaceC47056b @k com.avito.android.analytics.task.a aVar, @k E e12) {
        this.context = context;
        this.expirationInteractor = interfaceC13016b;
        this.trackingInteractor = interfaceC13020f;
        this.bankTrackingInteractor = kVar;
        this.analytics = interfaceC28373a;
        this.autoFeatures = c43617a;
        this.webPaymentFeatures = t22;
        this.performanceTracker = aVar;
        this.accountStateProvider = e12;
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        if (this.expirationInteractor.b()) {
            C43617a c43617a = this.autoFeatures;
            c43617a.getClass();
            n<Object> nVar = C43617a.f413588V[31];
            if (((Boolean) c43617a.f413595G.a().invoke()).booleanValue()) {
                t0 t0Var = new t0(3);
                t0Var.b(this.context.getResources().getStringArray(R.array.competitors_apps_tracking_list));
                t0Var.b(this.context.getResources().getStringArray(R.array.competitors_inhouse_apps_tracking_list));
                t0Var.b(this.context.getResources().getStringArray(R.array.apps_tracking_app_markets_tracking_list));
                ArrayList<Object> arrayList = t0Var.f406850a;
                this.analytics.c(new C13015a(this.trackingInteractor.a(C42745f0.U(arrayList.toArray(new String[arrayList.size()])))));
                this.expirationInteractor.a();
            }
            T2 t22 = this.webPaymentFeatures;
            t22.getClass();
            n<Object> nVar2 = T2.f67572c[0];
            if (((Boolean) t22.f67573b.a().invoke()).booleanValue()) {
                D.f90335a.getClass();
                F fA2 = D.a.a();
                this.analytics.c(new j(this.accountStateProvider.a(), this.bankTrackingInteractor.a(C42756l.g0(this.context.getResources().getStringArray(R.array.bank_id_tracking_list)))));
                this.expirationInteractor.a();
                this.performanceTracker.a(fA2.b(), "bank-apps-tracking");
            }
        }
    }
}
