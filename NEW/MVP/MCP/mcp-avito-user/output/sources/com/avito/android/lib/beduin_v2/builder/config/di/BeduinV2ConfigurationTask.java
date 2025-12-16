package com.avito.android.lib.beduin_v2.builder.config.di;

import com.avito.android.app.task.ApplicationForegroundStartupTask;
import com.avito.android.util.C;
import com.avito.beduin.v2.logger.LogLevel;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinV2ConfigTaskModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\f"}, d2 = {"Lcom/avito/android/lib/beduin_v2/builder/config/di/BeduinV2ConfigurationTask;", "Lcom/avito/android/app/task/ApplicationForegroundStartupTask;", "Lcom/avito/android/util/C;", "buildInfo", "<init>", "(Lcom/avito/android/util/C;)V", "Lkotlin/G0;", "execute", "()V", "Lcom/avito/android/util/C;", "Companion", "a", "_design-modules_beduin-v2_config_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BeduinV2ConfigurationTask implements ApplicationForegroundStartupTask {

    @Y61.k
    private final C buildInfo;

    @Inject
    public BeduinV2ConfigurationTask(@Y61.k C c12) {
        this.buildInfo = c12;
    }

    @Override // com.avito.android.app.task.ApplicationForegroundStartupTask
    public void execute() {
        this.buildInfo.o().getClass();
        LogLevel[] logLevelArr = LogLevel.f337864b;
        RU0.b bVar = RU0.b.f14467a;
        h hVar = new h(AW.f.f434a);
        bVar.getClass();
        if (RU0.b.f14471e) {
            hVar.j(AK.c.s(new StringBuilder(), RU0.b.f14470d, ":Logger"), "Logger was already configured. Is it intentional call?", null);
            return;
        }
        RU0.b.f14471e = true;
        RU0.b.f14468b = hVar;
        RU0.b.f14469c = 4;
        RU0.b.f14470d = "BDUI";
    }
}
