package org.chromium.net;

import java.util.Date;
import java.util.Set;
import org.chromium.net.CronetEngine;

/* loaded from: classes7.dex */
public abstract class ICronetEngineBuilder {
    public abstract ICronetEngineBuilder addPublicKeyPins(String str, Set<byte[]> set, boolean z12, Date date);

    public abstract ICronetEngineBuilder addQuicHint(String str, int i12, int i13);

    public abstract ExperimentalCronetEngine build();

    public abstract ICronetEngineBuilder enableHttp2(boolean z12);

    public abstract ICronetEngineBuilder enableHttpCache(int i12, long j12);

    public abstract ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z12);

    public abstract ICronetEngineBuilder enableQuic(boolean z12);

    public abstract ICronetEngineBuilder enableSdch(boolean z12);

    public abstract String getDefaultUserAgent();

    public abstract ICronetEngineBuilder setExperimentalOptions(String str);

    public abstract ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader);

    public abstract ICronetEngineBuilder setStoragePath(String str);

    public abstract ICronetEngineBuilder setUserAgent(String str);

    public ICronetEngineBuilder enableBrotli(boolean z12) {
        return this;
    }

    public ICronetEngineBuilder enableNetworkQualityEstimator(boolean z12) {
        return this;
    }

    public ICronetEngineBuilder setThreadPriority(int i12) {
        return this;
    }
}
