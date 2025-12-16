package com.avito.android.iac_dialer.impl_module.timer_interactor;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.huawei.hms.api.FailedBinderCallBack;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.e2;

/* compiled from: IacTimerInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor;", "", "Timer", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacTimerInteractor {

    /* compiled from: IacTimerInteractor.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000b\fR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer;", "LdL/d;", "", "getMillis", "()J", "millis", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "getCallId", "()Ljava/lang/String;", FailedBinderCallBack.CALLER_ID, "ActiveFallbackDialogPause", "OutgoingCallStartPause", "Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer$ActiveFallbackDialogPause;", "Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer$OutgoingCallStartPause;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Timer extends d {

        /* compiled from: IacTimerInteractor.kt */
        @P
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\r\u0010\r\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer$ActiveFallbackDialogPause;", "Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer;", "millis", "", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(JLjava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getMillis", "()J", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class ActiveFallbackDialogPause implements Timer {
            public static final int $stable = 0;

            @k
            private final String callId;
            private final long millis;

            public ActiveFallbackDialogPause(long j12, @k String str) {
                this.millis = j12;
                this.callId = str;
            }

            public static /* synthetic */ ActiveFallbackDialogPause copy$default(ActiveFallbackDialogPause activeFallbackDialogPause, long j12, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    j12 = activeFallbackDialogPause.millis;
                }
                if ((i12 & 2) != 0) {
                    str = activeFallbackDialogPause.callId;
                }
                return activeFallbackDialogPause.copy(j12, str);
            }

            /* renamed from: component1, reason: from getter */
            public final long getMillis() {
                return this.millis;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final ActiveFallbackDialogPause copy(long millis, @k String callId) {
                return new ActiveFallbackDialogPause(millis, callId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ActiveFallbackDialogPause)) {
                    return false;
                }
                ActiveFallbackDialogPause activeFallbackDialogPause = (ActiveFallbackDialogPause) other;
                return this.millis == activeFallbackDialogPause.millis && L.f(this.callId, activeFallbackDialogPause.callId);
            }

            @Override // com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor.Timer
            @k
            public String getCallId() {
                return this.callId;
            }

            @Override // com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor.Timer
            public long getMillis() {
                return this.millis;
            }

            public int hashCode() {
                return this.callId.hashCode() + (Long.hashCode(this.millis) * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("ActiveFallbackDialogPause(millis=");
                sb2.append(this.millis);
                sb2.append(", callId=");
                return C22026a.c(sb2, this.callId, ')');
            }
        }

        /* compiled from: IacTimerInteractor.kt */
        @P
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\r\u0010\r\u001a\u00060\u0005j\u0002`\u0006HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\b\u0002\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer$OutgoingCallStartPause;", "Lcom/avito/android/iac_dialer/impl_module/timer_interactor/IacTimerInteractor$Timer;", "millis", "", FailedBinderCallBack.CALLER_ID, "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "(JLjava/lang/String;)V", "getCallId", "()Ljava/lang/String;", "getMillis", "()J", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class OutgoingCallStartPause implements Timer {
            public static final int $stable = 0;

            @k
            private final String callId;
            private final long millis;

            public OutgoingCallStartPause(long j12, @k String str) {
                this.millis = j12;
                this.callId = str;
            }

            public static /* synthetic */ OutgoingCallStartPause copy$default(OutgoingCallStartPause outgoingCallStartPause, long j12, String str, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    j12 = outgoingCallStartPause.millis;
                }
                if ((i12 & 2) != 0) {
                    str = outgoingCallStartPause.callId;
                }
                return outgoingCallStartPause.copy(j12, str);
            }

            /* renamed from: component1, reason: from getter */
            public final long getMillis() {
                return this.millis;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final String getCallId() {
                return this.callId;
            }

            @k
            public final OutgoingCallStartPause copy(long millis, @k String callId) {
                return new OutgoingCallStartPause(millis, callId);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OutgoingCallStartPause)) {
                    return false;
                }
                OutgoingCallStartPause outgoingCallStartPause = (OutgoingCallStartPause) other;
                return this.millis == outgoingCallStartPause.millis && L.f(this.callId, outgoingCallStartPause.callId);
            }

            @Override // com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor.Timer
            @k
            public String getCallId() {
                return this.callId;
            }

            @Override // com.avito.android.iac_dialer.impl_module.timer_interactor.IacTimerInteractor.Timer
            public long getMillis() {
                return this.millis;
            }

            public int hashCode() {
                return this.callId.hashCode() + (Long.hashCode(this.millis) * 31);
            }

            @k
            public String toString() {
                StringBuilder sb2 = new StringBuilder("OutgoingCallStartPause(millis=");
                sb2.append(this.millis);
                sb2.append(", callId=");
                return C22026a.c(sb2, this.callId, ')');
            }
        }

        @k
        String getCallId();

        long getMillis();
    }

    @k
    /* renamed from: a */
    e2 getF166499b();

    void b(@k Timer timer);
}
