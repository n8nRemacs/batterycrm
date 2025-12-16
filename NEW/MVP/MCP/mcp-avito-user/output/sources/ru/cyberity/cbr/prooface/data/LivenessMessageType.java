package ru.cyberity.cbr.prooface.data;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/prooface/data/LivenessMessageType;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "VEkdd97RzWe", "startLivenessSession", "livenessClientError", "livenessFragment", "livenessSessionStarted", "livenessSessionInProgress", "livenessSessionCompleted", "livenessSessionTerminated", "bye", "unknown", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public enum LivenessMessageType {
    startLivenessSession("startLivenessSession"),
    livenessClientError("livenessClientError"),
    livenessFragment("livenessFragment"),
    livenessSessionStarted("livenessSessionStarted"),
    livenessSessionInProgress("livenessSessionInProgress"),
    livenessSessionCompleted("livenessSessionCompleted"),
    livenessSessionTerminated("livenessSessionTerminated"),
    bye("bye"),
    unknown("unknown");


    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    private final String type;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lru/cyberity/cbr/prooface/data/LivenessMessageType$VEkdd97RzWe;", "", "", "type", "Lru/cyberity/cbr/prooface/data/LivenessMessageType;", "AnZ4ntgRZiVOQFYAd", "<init>", "()V", "cyberity-mobile-sdk-prooface_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.prooface.data.LivenessMessageType$VEkdd97RzWe, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final LivenessMessageType AnZ4ntgRZiVOQFYAd(@l String type) {
            LivenessMessageType livenessMessageType;
            LivenessMessageType[] livenessMessageTypeArrValues = LivenessMessageType.values();
            int length = livenessMessageTypeArrValues.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length) {
                    livenessMessageType = null;
                    break;
                }
                livenessMessageType = livenessMessageTypeArrValues[i12];
                if (L.f(livenessMessageType.getType(), type)) {
                    break;
                }
                i12++;
            }
            return livenessMessageType == null ? LivenessMessageType.unknown : livenessMessageType;
        }

        private Companion() {
        }
    }

    LivenessMessageType(String str) {
        this.type = str;
    }

    @k
    public final String getType() {
        return this.type;
    }
}
