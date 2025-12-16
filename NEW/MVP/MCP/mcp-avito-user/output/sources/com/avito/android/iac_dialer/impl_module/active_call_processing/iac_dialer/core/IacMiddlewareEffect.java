package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.o;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacMiddlewareProcessing.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect;", "LdL/d;", "EmitAction", "EmitEvent", "UnhandledError", "WriteLog", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect$EmitAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect$EmitEvent;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect$UnhandledError;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect$WriteLog;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacMiddlewareEffect extends d {

    /* compiled from: IacMiddlewareProcessing.kt */
    @P
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect$EmitAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect;", "action", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;)V", "getAction", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmitAction implements IacMiddlewareEffect {
        public static final int $stable = 8;

        @k
        private final IacAction action;

        public EmitAction(@k IacAction iacAction) {
            this.action = iacAction;
        }

        public static /* synthetic */ EmitAction copy$default(EmitAction emitAction, IacAction iacAction, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacAction = emitAction.action;
            }
            return emitAction.copy(iacAction);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final IacAction getAction() {
            return this.action;
        }

        @k
        public final EmitAction copy(@k IacAction action) {
            return new EmitAction(action);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EmitAction) && L.f(this.action, ((EmitAction) other).action);
        }

        @k
        public final IacAction getAction() {
            return this.action;
        }

        public int hashCode() {
            return this.action.hashCode();
        }

        @k
        public String toString() {
            return "EmitAction(action=" + this.action + ')';
        }
    }

    /* compiled from: IacMiddlewareProcessing.kt */
    @P
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect$EmitEvent;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect;", "event", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;)V", "getEvent", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/event/IacEvent;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class EmitEvent implements IacMiddlewareEffect {
        public static final int $stable = 8;

        @k
        private final IacEvent event;

        public EmitEvent(@k IacEvent iacEvent) {
            this.event = iacEvent;
        }

        public static /* synthetic */ EmitEvent copy$default(EmitEvent emitEvent, IacEvent iacEvent, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                iacEvent = emitEvent.event;
            }
            return emitEvent.copy(iacEvent);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final IacEvent getEvent() {
            return this.event;
        }

        @k
        public final EmitEvent copy(@k IacEvent event) {
            return new EmitEvent(event);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EmitEvent) && L.f(this.event, ((EmitEvent) other).event);
        }

        @k
        public final IacEvent getEvent() {
            return this.event;
        }

        public int hashCode() {
            return this.event.hashCode();
        }

        @k
        public String toString() {
            return "EmitEvent(event=" + this.event + ')';
        }
    }

    /* compiled from: IacMiddlewareProcessing.kt */
    @P
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect$UnhandledError;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect;", "t", "", "(Ljava/lang/Throwable;)V", "getT", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UnhandledError implements IacMiddlewareEffect {
        public static final int $stable = 8;

        @k
        private final Throwable t;

        public UnhandledError(@k Throwable th2) {
            this.t = th2;
        }

        public static /* synthetic */ UnhandledError copy$default(UnhandledError unhandledError, Throwable th2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                th2 = unhandledError.t;
            }
            return unhandledError.copy(th2);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Throwable getT() {
            return this.t;
        }

        @k
        public final UnhandledError copy(@k Throwable t12) {
            return new UnhandledError(t12);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UnhandledError) && L.f(this.t, ((UnhandledError) other).t);
        }

        @k
        public final Throwable getT() {
            return this.t;
        }

        public int hashCode() {
            return this.t.hashCode();
        }

        @k
        public String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("UnhandledError(t="), this.t, ')');
        }
    }

    /* compiled from: IacMiddlewareProcessing.kt */
    @P
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect$WriteLog;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/o;", "log", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/o;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/o;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/o;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareEffect$WriteLog;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/utils/o;", "getLog", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class WriteLog implements IacMiddlewareEffect {
        public static final int $stable = 8;

        @k
        private final o log;

        public WriteLog(@k o oVar) {
            this.log = oVar;
        }

        public static /* synthetic */ WriteLog copy$default(WriteLog writeLog, o oVar, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                oVar = writeLog.log;
            }
            return writeLog.copy(oVar);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final o getLog() {
            return this.log;
        }

        @k
        public final WriteLog copy(@k o log) {
            return new WriteLog(log);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WriteLog) && L.f(this.log, ((WriteLog) other).log);
        }

        @k
        public final o getLog() {
            return this.log;
        }

        public int hashCode() {
            return this.log.hashCode();
        }

        @k
        public String toString() {
            return "WriteLog(log=" + this.log + ')';
        }
    }
}
