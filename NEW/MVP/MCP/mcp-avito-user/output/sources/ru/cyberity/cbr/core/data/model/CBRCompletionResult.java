package ru.cyberity.cbr.core.data.model;

import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ru.cyberity.cbr.core.PublicApi;

/* compiled from: CBRCompletionResult.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "", "()V", "AbnormalTermination", "SuccessTermination", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult$AbnormalTermination;", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult$SuccessTermination;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@PublicApi
/* loaded from: classes9.dex */
public abstract class CBRCompletionResult {

    /* compiled from: CBRCompletionResult.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRCompletionResult$AbnormalTermination;", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "", "exception", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class AbnormalTermination extends CBRCompletionResult {

        @Y61.l
        private final Throwable exception;

        /* JADX WARN: Multi-variable type inference failed */
        public AbnormalTermination() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AbnormalTermination) && L.f(this.exception, ((AbnormalTermination) other).exception);
        }

        @Y61.l
        public final Throwable getException() {
            return this.exception;
        }

        public int hashCode() {
            Throwable th2 = this.exception;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        @Y61.k
        public String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("AbnormalTermination(exception="), this.exception, ')');
        }

        public AbnormalTermination(@Y61.l Throwable th2) {
            super(null);
            this.exception = th2;
        }

        public /* synthetic */ AbnormalTermination(Throwable th2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : th2);
        }
    }

    /* compiled from: CBRCompletionResult.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/cyberity/cbr/core/data/model/CBRCompletionResult$SuccessTermination;", "Lru/cyberity/cbr/core/data/model/CBRCompletionResult;", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "reason", "<init>", "(Lru/cyberity/cbr/core/data/model/CBRLivenessReason;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "getReason", "()Lru/cyberity/cbr/core/data/model/CBRLivenessReason;", "cyberity-mobile-sdk-publicapi_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class SuccessTermination extends CBRCompletionResult {

        @Y61.l
        private final CBRLivenessReason reason;

        /* JADX WARN: Multi-variable type inference failed */
        public SuccessTermination() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(@Y61.l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SuccessTermination) && L.f(this.reason, ((SuccessTermination) other).reason);
        }

        public int hashCode() {
            CBRLivenessReason cBRLivenessReason = this.reason;
            if (cBRLivenessReason == null) {
                return 0;
            }
            return cBRLivenessReason.hashCode();
        }

        @Y61.k
        public String toString() {
            return "SuccessTermination(reason=" + this.reason + ')';
        }

        public SuccessTermination(@Y61.l CBRLivenessReason cBRLivenessReason) {
            super(null);
            this.reason = cBRLivenessReason;
        }

        public /* synthetic */ SuccessTermination(CBRLivenessReason cBRLivenessReason, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : cBRLivenessReason);
        }
    }

    public /* synthetic */ CBRCompletionResult(C42822w c42822w) {
        this();
    }

    private CBRCompletionResult() {
    }
}
