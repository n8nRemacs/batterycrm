package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class mjh extends qze {
    @Override // defpackage.qze
    public final oze build() {
        Objects.requireNonNull(getSignalingStat(), "Signaling statistics is required");
        Objects.requireNonNull(getExecutor(), "executor is required");
        Objects.requireNonNull(getLog(), "log is required");
        Objects.requireNonNull(getLogConfiguration(), "log configuration is required");
        Objects.requireNonNull(getEndpointParameters(), "endpoing parameters are required");
        njh njhVar = new njh(getTimeoutMS(), getReconnectTimeoutAction(), getSignalingStat(), getExecutor(), getLog(), getLogConfiguration(), getServerPingTimeoutMs(), isFastRecoverEnabled(), getEndpointParameters(), isReplaceParametersInEndpointEnabled());
        njhVar.init();
        return njhVar;
    }
}
