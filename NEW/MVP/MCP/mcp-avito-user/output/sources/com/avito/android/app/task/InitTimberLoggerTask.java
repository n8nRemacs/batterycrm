package com.avito.android.app.task;

import android.app.Application;
import com.avito.android.app.task.InterfaceC28559h;
import com.avito.android.log.LogLevel;
import kotlin.Metadata;
import pc1.b;

/* compiled from: InitTimberLoggerTask.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/app/task/InitTimberLoggerTask;", "Lcom/avito/android/app/task/InitLoggerTask;", "Lpc1/b$c;", "bufferingTree", "Lcom/avito/android/P;", "features", "<init>", "(Lpc1/b$c;Lcom/avito/android/P;)V", "Landroid/app/Application;", "application", "Lcom/avito/android/app/task/h$a;", "execute", "(Landroid/app/Application;)Lcom/avito/android/app/task/h$a;", "Lpc1/b$c;", "Lcom/avito/android/P;", "_avito-release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InitTimberLoggerTask extends InitLoggerTask {

    @Y61.k
    private final b.c bufferingTree;

    @Y61.k
    private final com.avito.android.P features;

    public InitTimberLoggerTask(@Y61.k b.c cVar, @Y61.k com.avito.android.P p12) {
        this.bufferingTree = cVar;
        this.features = p12;
    }

    @Override // com.avito.android.app.task.ApplicationBlockingStartupTask
    @Y61.k
    public InterfaceC28559h.a execute(@Y61.k Application application) {
        LogLevel logLevel;
        if (this.features.r().invoke().booleanValue()) {
            pc1.b.f428696a.o(this.bufferingTree);
            logLevel = LogLevel.f182841d;
        } else {
            logLevel = LogLevel.f182842e;
        }
        AW.f fVar = AW.f.f434a;
        fVar.getClass();
        if (!AW.f.f435b) {
            AW.f.f435b = true;
            AW.f.f436c = logLevel;
        }
        setAvitoLogger(fVar);
        return InterfaceC28559h.a.c.f91606a;
    }
}
