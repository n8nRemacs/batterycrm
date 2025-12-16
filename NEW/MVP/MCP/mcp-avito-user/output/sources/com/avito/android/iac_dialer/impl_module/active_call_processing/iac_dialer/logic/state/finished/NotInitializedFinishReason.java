package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.finished;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotInitializedFinishReason.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason;", "LdL/d;", "BusyByGsm", "CanNotRecall", "CreateCallError", "Hangup", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$BusyByGsm;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CreateCallError;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$Hangup;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface NotInitializedFinishReason extends d {

    /* compiled from: NotInitializedFinishReason.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$BusyByGsm;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class BusyByGsm implements NotInitializedFinishReason {
        public static final int $stable = 0;

        @k
        public static final BusyByGsm INSTANCE = new BusyByGsm();

        private BusyByGsm() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof BusyByGsm);
        }

        public int hashCode() {
            return -615669173;
        }

        @k
        public String toString() {
            return "BusyByGsm";
        }
    }

    /* compiled from: NotInitializedFinishReason.kt */
    @P
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a;", "reason", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a;", "getReason", "a", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CanNotRecall implements NotInitializedFinishReason {
        public static final int $stable = 8;

        @k
        private final a reason;

        /* compiled from: NotInitializedFinishReason.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a;", "", "a", "b", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a$a;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a$b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public interface a {

            /* compiled from: NotInitializedFinishReason.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a$a;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.finished.NotInitializedFinishReason$CanNotRecall$a$a, reason: collision with other inner class name */
            public static final /* data */ class C4907a implements a {
                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C4907a)) {
                        return false;
                    }
                    ((C4907a) obj).getClass();
                    return L.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                @k
                public final String toString() {
                    return "CanRecallReason(canRecallReason=null)";
                }
            }

            /* compiled from: NotInitializedFinishReason.kt */
            @P
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a$b;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CanNotRecall$a;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class b implements a {
                public final boolean equals(@l Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    ((b) obj).getClass();
                    return L.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                @k
                public final String toString() {
                    return "ErrorReason(error=null)";
                }
            }
        }

        public CanNotRecall(@k a aVar) {
            this.reason = aVar;
        }

        public static /* synthetic */ CanNotRecall copy$default(CanNotRecall canNotRecall, a aVar, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                aVar = canNotRecall.reason;
            }
            return canNotRecall.copy(aVar);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final a getReason() {
            return this.reason;
        }

        @k
        public final CanNotRecall copy(@k a reason) {
            return new CanNotRecall(reason);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CanNotRecall) && L.f(this.reason, ((CanNotRecall) other).reason);
        }

        @k
        public final a getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.reason.hashCode();
        }

        @k
        public String toString() {
            return "CanNotRecall(reason=" + this.reason + ')';
        }
    }

    /* compiled from: NotInitializedFinishReason.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$CreateCallError;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class CreateCallError implements NotInitializedFinishReason {
        public static final int $stable = 0;

        @k
        public static final CreateCallError INSTANCE = new CreateCallError();

        private CreateCallError() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof CreateCallError);
        }

        public int hashCode() {
            return 1985865928;
        }

        @k
        public String toString() {
            return "CreateCallError";
        }
    }

    /* compiled from: NotInitializedFinishReason.kt */
    @P
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason$Hangup;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/finished/NotInitializedFinishReason;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Hangup implements NotInitializedFinishReason {
        public static final int $stable = 0;

        @k
        public static final Hangup INSTANCE = new Hangup();

        private Hangup() {
        }

        public boolean equals(@l Object other) {
            return this == other || (other instanceof Hangup);
        }

        public int hashCode() {
            return -573785805;
        }

        @k
        public String toString() {
            return "Hangup";
        }
    }
}
