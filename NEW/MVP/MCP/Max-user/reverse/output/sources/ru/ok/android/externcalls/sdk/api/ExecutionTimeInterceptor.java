package ru.ok.android.externcalls.sdk.api;

import defpackage.cm0;
import defpackage.hm;
import defpackage.kob;
import defpackage.mua;
import defpackage.nua;
import defpackage.oua;
import defpackage.pua;
import defpackage.tk4;
import defpackage.uaj;
import defpackage.wm;
import defpackage.y8g;
import defpackage.yl;
import defpackage.z8g;
import java.io.InterruptedIOException;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.stat.api.ApiStats;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/api/ExecutionTimeInterceptor;", "Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "apiStats", "Ly8g;", "timeProvider", "<init>", "(Lru/ok/android/externcalls/sdk/stat/api/ApiStats;Ly8g;)V", "Lhm;", "request", "", "getMethod", "(Lhm;)Ljava/lang/String;", "Lmua;", "okApiChain", "Lpua;", "intercept", "(Lmua;)Lpua;", "Lqqg;", "release", "()V", "Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "getApiStats", "()Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "setApiStats", "(Lru/ok/android/externcalls/sdk/stat/api/ApiStats;)V", "Ly8g;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExecutionTimeInterceptor {
    private ApiStats apiStats;
    private final y8g timeProvider;

    public ExecutionTimeInterceptor() {
        this(null, null, 3, null);
    }

    private final String getMethod(hm request) {
        if (request instanceof cm0) {
            return null;
        }
        return wm.b(request.getUri());
    }

    public final ApiStats getApiStats() {
        return this.apiStats;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    public pua intercept(mua okApiChain) {
        pua puaVar;
        ApiStats apiStats;
        uaj uajVar = (uaj) okApiChain;
        oua ouaVar = (oua) uajVar.d;
        yl ylVar = ouaVar.a;
        String method = getMethod(ylVar);
        y8g y8gVar = this.timeProvider;
        long msSinceBoot = y8gVar.getMsSinceBoot();
        kob kobVar = (kob) uajVar.c;
        int i = uajVar.b;
        ?? r4 = uajVar.e;
        if (i >= r4.size()) {
            try {
                puaVar = new pua(kobVar.a(ylVar, ouaVar.b));
            } catch (InterruptedIOException e) {
                if (!(ylVar instanceof nua)) {
                    throw e;
                }
                puaVar = new pua(((nua) ylVar).handleInterruptedIO());
            }
        } else {
            puaVar = ((ExecutionTimeInterceptor) r4.get(i)).intercept(new uaj(kobVar, ouaVar, (Object) r4, i + 1, 7));
        }
        long msSinceBoot2 = y8gVar.getMsSinceBoot() - msSinceBoot;
        if (method != null && (apiStats = this.apiStats) != null) {
            apiStats.reportExecutionTime(method, msSinceBoot2);
        }
        return puaVar;
    }

    public final void release() {
        this.apiStats = null;
    }

    public final void setApiStats(ApiStats apiStats) {
        this.apiStats = apiStats;
    }

    public ExecutionTimeInterceptor(ApiStats apiStats, y8g y8gVar, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : apiStats, (i & 2) != 0 ? new z8g() : y8gVar);
    }

    public ExecutionTimeInterceptor(ApiStats apiStats, y8g y8gVar) {
        this.apiStats = apiStats;
        this.timeProvider = y8gVar;
    }
}
