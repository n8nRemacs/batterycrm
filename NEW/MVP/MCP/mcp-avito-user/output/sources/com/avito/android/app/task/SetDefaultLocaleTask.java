package com.avito.android.app.task;

import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.avito.android.app.task.ApplicationBlockingStartupTask;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.util.InterfaceC35950u;
import jJ.InterfaceC42262b;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import ur.InterfaceC49101b;

/* compiled from: SetDefaultLocaleTask.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/avito/android/app/task/SetDefaultLocaleTask;", "Lcom/avito/android/app/task/ApplicationBlockingStartupTask;", "LjJ/b;", "localeStore", "Lcom/avito/android/P;", "coreFeatures", "Lur/b;", "appTypeProvider", "Lcom/avito/android/util/u;", "buildInfo", "<init>", "(LjJ/b;Lcom/avito/android/P;Lur/b;Lcom/avito/android/util/u;)V", "Landroid/content/res/Resources;", "resources", "Lkotlin/G0;", "setDefaultLocale", "(Landroid/content/res/Resources;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "LjJ/b;", "Lcom/avito/android/P;", "Lur/b;", "Lcom/avito/android/util/u;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SetDefaultLocaleTask implements ApplicationBlockingStartupTask {

    @Y61.k
    private final InterfaceC49101b appTypeProvider;

    @Y61.k
    private final InterfaceC35950u buildInfo;

    @Y61.k
    private final com.avito.android.P coreFeatures;

    @Y61.k
    private final InterfaceC42262b localeStore;

    @Inject
    public SetDefaultLocaleTask(@Y61.k InterfaceC42262b interfaceC42262b, @Y61.k com.avito.android.P p12, @Y61.k InterfaceC49101b interfaceC49101b, @Y61.k InterfaceC35950u interfaceC35950u) {
        this.localeStore = interfaceC42262b;
        this.coreFeatures = p12;
        this.appTypeProvider = interfaceC49101b;
        this.buildInfo = interfaceC35950u;
    }

    private final void setDefaultLocale(Resources resources) {
        Locale locale = new Locale("ru");
        if (!locale.equals(Locale.getDefault())) {
            Locale.setDefault(locale);
        }
        Configuration configuration = resources.getConfiguration();
        Locale locale2 = configuration.locale;
        if (locale2 == null || !locale.equals(locale2)) {
            configuration.setLocale(locale);
            resources.updateConfiguration(configuration, null);
        }
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        com.avito.android.P p12 = this.coreFeatures;
        p12.getClass();
        kotlin.reflect.n<Object> nVar = com.avito.android.P.f67370w0[88];
        if (((Boolean) p12.f67439v0.a().invoke()).booleanValue() || this.appTypeProvider.c()) {
            this.localeStore.a(this.buildInfo.c());
        } else {
            setDefaultLocale(application.getResources());
        }
        return InterfaceC28559h.a.c.f91606a;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public ApplicationBlockingStartupTask.Priority getPriority() {
        return ApplicationBlockingStartupTask.Priority.f91378b;
    }
}
