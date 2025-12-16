package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.analytics_adjust.InterfaceC28533a;
import com.avito.android.util.rx3.C35896f0;
import kotlin.Metadata;

/* compiled from: UserIdentifierAnalyticsTask.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/avito/android/app/task/UserIdentifierAnalyticsTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/error_reporting/error_reporter/n;", "errorReporter", "Lcom/avito/android/analytics_adjust/a;", "adjust", "Lcom/avito/android/account/E;", "accountState", "<init>", "(Lcom/avito/android/error_reporting/error_reporter/n;Lcom/avito/android/analytics_adjust/a;Lcom/avito/android/account/E;)V", "", "identifier", "Lkotlin/G0;", "setUserId", "(Ljava/lang/String;)V", "Landroid/app/Application;", "application", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/error_reporting/error_reporter/n;", "Lcom/avito/android/analytics_adjust/a;", "Lcom/avito/android/account/E;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UserIdentifierAnalyticsTask implements ApplicationBackgroundStartupTask {

    @Y61.k
    private final com.avito.android.account.E accountState;

    @Y61.k
    private final InterfaceC28533a adjust;

    @Y61.k
    private final com.avito.android.error_reporting.error_reporter.n errorReporter;

    /* compiled from: UserIdentifierAnalyticsTask.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<String, kotlin.G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(String str) {
            UserIdentifierAnalyticsTask.this.setUserId(str);
            return kotlin.G0.f406611a;
        }
    }

    public UserIdentifierAnalyticsTask(@Y61.k com.avito.android.error_reporting.error_reporter.n nVar, @Y61.k InterfaceC28533a interfaceC28533a, @Y61.k com.avito.android.account.E e12) {
        this.errorReporter = nVar;
        this.adjust = interfaceC28533a;
        this.accountState = e12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setUserId(String identifier) {
        if (identifier == null) {
            return;
        }
        this.errorReporter.e(identifier);
        this.adjust.e(identifier);
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@Y61.k Application application) {
        C35896f0.g(this.accountState.m(), new a());
    }
}
