package com.avito.android.user_advert.advert.faq;

import Y61.k;
import android.app.Application;
import com.avito.android.ab_tests.f0;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertFaqSurveyStartupTask.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/user_advert/advert/faq/AdvertFaqSurveyStartupTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/user_advert/advert/faq/e;", "interactor", "Lcom/avito/android/ab_tests/f0;", "userAdvertAbTestsProvider", "<init>", "(Lcom/avito/android/user_advert/advert/faq/e;Lcom/avito/android/ab_tests/f0;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/user_advert/advert/faq/e;", "Lcom/avito/android/ab_tests/f0;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AdvertFaqSurveyStartupTask implements ApplicationBackgroundStartupTask {

    @k
    private final e interactor;

    @k
    private final f0 userAdvertAbTestsProvider;

    @Inject
    public AdvertFaqSurveyStartupTask(@k e eVar, @k f0 f0Var) {
        this.interactor = eVar;
        this.userAdvertAbTestsProvider = f0Var;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@k Application application) {
        if (this.userAdvertAbTestsProvider.a().f439742a.f439749b.b()) {
            this.interactor.a();
        }
    }
}
