package defpackage;

import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public abstract class qze {
    public long a;
    public Runnable b;
    public m0f c;
    public ExecutorService d;
    public y6d e;
    public z6d f;
    public long g;
    public boolean h;
    public ag5 i;
    public boolean j;

    public abstract oze build();

    public final ag5 getEndpointParameters() {
        return this.i;
    }

    public final ExecutorService getExecutor() {
        return this.d;
    }

    public final y6d getLog() {
        return this.e;
    }

    public final z6d getLogConfiguration() {
        return this.f;
    }

    public final Runnable getReconnectTimeoutAction() {
        return this.b;
    }

    public final long getServerPingTimeoutMs() {
        return this.g;
    }

    public final m0f getSignalingStat() {
        return this.c;
    }

    public final long getTimeoutMS() {
        return this.a;
    }

    public final boolean isFastRecoverEnabled() {
        return this.h;
    }

    public final boolean isReplaceParametersInEndpointEnabled() {
        return this.j;
    }

    /* renamed from: setEndpointParameters, reason: collision with other method in class */
    public final void m45setEndpointParameters(ag5 ag5Var) {
        this.i = ag5Var;
    }

    /* renamed from: setExecutor, reason: collision with other method in class */
    public final void m46setExecutor(ExecutorService executorService) {
        this.d = executorService;
    }

    /* renamed from: setFastRecoverEnabled, reason: collision with other method in class */
    public final void m47setFastRecoverEnabled(boolean z) {
        this.h = z;
    }

    public final qze setIsReplaceParametersInEndpointEnabled(boolean z) {
        this.j = z;
        return this;
    }

    /* renamed from: setLog, reason: collision with other method in class */
    public final void m48setLog(y6d y6dVar) {
        this.e = y6dVar;
    }

    /* renamed from: setLogConfiguration, reason: collision with other method in class */
    public final void m49setLogConfiguration(z6d z6dVar) {
        this.f = z6dVar;
    }

    /* renamed from: setReconnectTimeoutAction, reason: collision with other method in class */
    public final void m50setReconnectTimeoutAction(Runnable runnable) {
        this.b = runnable;
    }

    public final void setReplaceParametersInEndpointEnabled(boolean z) {
        this.j = z;
    }

    /* renamed from: setServerPingTimeoutMs, reason: collision with other method in class */
    public final void m51setServerPingTimeoutMs(long j) {
        this.g = j;
    }

    /* renamed from: setSignalingStat, reason: collision with other method in class */
    public final void m52setSignalingStat(m0f m0fVar) {
        this.c = m0fVar;
    }

    /* renamed from: setTimeoutMS, reason: collision with other method in class */
    public final void m53setTimeoutMS(long j) {
        this.a = j;
    }

    public final qze setEndpointParameters(ag5 ag5Var) {
        this.i = ag5Var;
        return this;
    }

    public final qze setExecutor(ExecutorService executorService) {
        this.d = executorService;
        return this;
    }

    public final qze setFastRecoverEnabled(boolean z) {
        this.h = z;
        return this;
    }

    public final qze setLog(y6d y6dVar) {
        this.e = y6dVar;
        return this;
    }

    public final qze setLogConfiguration(z6d z6dVar) {
        this.f = z6dVar;
        return this;
    }

    public final qze setReconnectTimeoutAction(Runnable runnable) {
        this.b = runnable;
        return this;
    }

    public final qze setServerPingTimeoutMs(long j) {
        this.g = j;
        return this;
    }

    public final qze setSignalingStat(m0f m0fVar) {
        this.c = m0fVar;
        return this;
    }

    public final qze setTimeoutMS(long j) {
        this.a = j;
        return this;
    }
}
