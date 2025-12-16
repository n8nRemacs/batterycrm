package com.avito.android.language_selector;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.app.task.ApplicationBackgroundStartupTask;
import com.avito.android.language_selector.domain.d;
import id.i;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LanguageSyncTask.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/language_selector/LanguageSyncBackgroundTask;", "Lcom/avito/android/app/task/ApplicationBackgroundStartupTask;", "Lcom/avito/android/language_selector/domain/d;", "languageSetUpUseCase", "<init>", "(Lcom/avito/android/language_selector/domain/d;)V", "Landroid/app/Application;", "application", "Lkotlin/G0;", "execute", "(Landroid/app/Application;)V", "Lcom/avito/android/language_selector/domain/d;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LanguageSyncBackgroundTask implements ApplicationBackgroundStartupTask {

    @k
    private final d languageSetUpUseCase;

    /* compiled from: LanguageSyncTask.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/language_selector/LanguageSyncBackgroundTask$a", "Lid/i;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends i {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Application f174893b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LanguageSyncBackgroundTask f174894c;

        public a(Application application, LanguageSyncBackgroundTask languageSyncBackgroundTask) {
            this.f174893b = application;
            this.f174894c = languageSyncBackgroundTask;
        }

        @Override // id.i, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(@k Activity activity, @l Bundle bundle) {
            this.f174893b.unregisterActivityLifecycleCallbacks(this);
            this.f174894c.languageSetUpUseCase.execute();
        }
    }

    @Inject
    public LanguageSyncBackgroundTask(@k d dVar) {
        this.languageSetUpUseCase = dVar;
    }

    @Override // com.avito.android.app.task.ApplicationBackgroundStartupTask
    public void execute(@k Application application) {
        application.registerActivityLifecycleCallbacks(new a(application, this));
    }
}
