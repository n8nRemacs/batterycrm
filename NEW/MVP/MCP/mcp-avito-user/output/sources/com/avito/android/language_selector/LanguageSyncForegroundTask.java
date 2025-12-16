package com.avito.android.language_selector;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.app.task.ApplicationForegroundStartupTask;
import com.avito.android.language_selector.domain.g;
import h31.e;
import id.i;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LanguageSyncTask.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/language_selector/LanguageSyncForegroundTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/language_selector/domain/g;", "languageSyncUseCase", "Lh31/e;", "Landroid/app/Application;", "application", "<init>", "(Lcom/avito/android/language_selector/domain/g;Lh31/e;)V", "Lkotlin/G0;", "execute", "()V", "Lcom/avito/android/language_selector/domain/g;", "Lh31/e;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LanguageSyncForegroundTask implements ApplicationForegroundStartupTask {

    @k
    private final e<Application> application;

    @k
    private final g languageSyncUseCase;

    /* compiled from: LanguageSyncTask.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/language_selector/LanguageSyncForegroundTask$a", "Lid/i;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends i {
        public a() {
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@k Activity activity, @l Bundle bundle) {
            LanguageSyncForegroundTask languageSyncForegroundTask = LanguageSyncForegroundTask.this;
            ((Application) languageSyncForegroundTask.application.get()).unregisterActivityLifecycleCallbacks(this);
            languageSyncForegroundTask.languageSyncUseCase.execute();
        }
    }

    @Inject
    public LanguageSyncForegroundTask(@k g gVar, @k e<Application> eVar) {
        this.languageSyncUseCase = gVar;
        this.application = eVar;
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        this.application.get().registerActivityLifecycleCallbacks(new a());
    }
}
