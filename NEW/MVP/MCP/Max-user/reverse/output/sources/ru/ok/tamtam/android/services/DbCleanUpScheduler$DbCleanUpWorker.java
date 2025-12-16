package ru.ok.tamtam.android.services;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.aef;
import defpackage.yi5;
import kotlin.Metadata;
import ru.ok.tamtam.workmanager.SdkCoroutineWorker;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"ru/ok/tamtam/android/services/DbCleanUpScheduler$DbCleanUpWorker", "Lru/ok/tamtam/workmanager/SdkCoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "Laef;", "statsDatabase", "Lyi5;", "exceptionHandler", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Laef;Lyi5;)V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DbCleanUpScheduler$DbCleanUpWorker extends SdkCoroutineWorker {
    public final Context a;
    public final aef b;
    public final yi5 c;

    public DbCleanUpScheduler$DbCleanUpWorker(Context context, WorkerParameters workerParameters, aef aefVar, yi5 yi5Var) {
        super(context, workerParameters);
        this.a = context;
        this.b = aefVar;
        this.c = yi5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ru.ok.tamtam.workmanager.SdkCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.services.DbCleanUpScheduler$DbCleanUpWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
