package ru.ok.android.externcalls.sdk.rate.connection;

import defpackage.fni;
import defpackage.id5;
import defpackage.tk4;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/connection/CandidateTypeHintConfig;", "", "limits", "", "", "", "(Ljava/util/Map;)V", "isEmpty", "", "()Z", "isNotEmpty", "getLimits", "()Ljava/util/Map;", "component1", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CandidateTypeHintConfig {
    public static final String TYPE_HOST = "host";
    public static final String TYPE_PRFLX = "prflx";
    public static final String TYPE_RELAY = "relay";
    public static final String TYPE_SRFLX = "srflx";
    private final Map<String, Long> limits;

    /* JADX WARN: Multi-variable type inference failed */
    public CandidateTypeHintConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CandidateTypeHintConfig copy$default(CandidateTypeHintConfig candidateTypeHintConfig, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = candidateTypeHintConfig.limits;
        }
        return candidateTypeHintConfig.copy(map);
    }

    public final Map<String, Long> component1() {
        return this.limits;
    }

    public final CandidateTypeHintConfig copy(Map<String, Long> limits) {
        return new CandidateTypeHintConfig(limits);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CandidateTypeHintConfig) && fni.a(this.limits, ((CandidateTypeHintConfig) other).limits);
    }

    public final Map<String, Long> getLimits() {
        return this.limits;
    }

    public int hashCode() {
        return this.limits.hashCode();
    }

    public final boolean isEmpty() {
        return this.limits.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.limits.isEmpty();
    }

    public String toString() {
        return "CandidateTypeHintConfig(limits=" + this.limits + ")";
    }

    public CandidateTypeHintConfig(Map<String, Long> map) {
        this.limits = map;
    }

    public /* synthetic */ CandidateTypeHintConfig(Map map, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? id5.a : map);
    }
}
