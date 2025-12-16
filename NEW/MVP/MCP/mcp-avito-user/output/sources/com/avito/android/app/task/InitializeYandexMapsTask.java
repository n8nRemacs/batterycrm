package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.avito_map.yandex.AvitoYandexMapKt;
import com.yandex.mapkit.MapKitFactory;
import jJ.InterfaceC42261a;
import javax.inject.Inject;
import kotlin.Metadata;
import ur.InterfaceC49101b;

/* compiled from: InitializeYandexMapsTask.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/app/task/InitializeYandexMapsTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "LjJ/a;", "localeProvider", "Lur/b;", "appTypeProvider", "<init>", "(LjJ/a;Lur/b;)V", "", "getLocale", "()Ljava/lang/String;", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "LjJ/a;", "Lur/b;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InitializeYandexMapsTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final InterfaceC49101b appTypeProvider;

    @Y61.k
    private final InterfaceC42261a localeProvider;

    @Inject
    public InitializeYandexMapsTask(@Y61.k InterfaceC42261a interfaceC42261a, @Y61.k InterfaceC49101b interfaceC49101b) {
        this.localeProvider = interfaceC42261a;
        this.appTypeProvider = interfaceC49101b;
    }

    private final String getLocale() {
        return this.appTypeProvider.c() ? this.localeProvider.P4().toLanguageTag().replace('-', '_') : "ru_RU";
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        MapKitFactory.setApiKey(AvitoYandexMapKt.YANDEX_MAP_API_KEY);
        MapKitFactory.setLocale(getLocale());
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
