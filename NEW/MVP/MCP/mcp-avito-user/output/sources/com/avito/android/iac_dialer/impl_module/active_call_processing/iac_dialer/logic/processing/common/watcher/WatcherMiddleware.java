package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.common.watcher;

import AK.c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewarePayload;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.event.IacEvent;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.CallInit;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: WatcherMiddleware.kt */
@P
@s0
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/watcher/WatcherMiddleware;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareDistinctBy;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/watcher/WatcherMiddleware$Payload;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", VoiceInfo.STATE, "getPayloadFromState", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/watcher/WatcherMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;", "oldPayload", "newPayload", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewareProcessing;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/watcher/WatcherMiddleware$Payload;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/watcher/WatcherMiddleware$Payload;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Payload", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@C11.a
/* loaded from: classes14.dex */
public final /* data */ class WatcherMiddleware implements IacMiddlewareDistinctBy<Payload> {
    public static final int $stable = 0;

    @k
    public static final WatcherMiddleware INSTANCE = new WatcherMiddleware();

    /* compiled from: WatcherMiddleware.kt */
    @P
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00040\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R-\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/watcher/WatcherMiddleware$Payload;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacMiddlewarePayload;", "", "Lkotlin/Q;", "", "Lcom/avito/android/iac_dialer_models/abstract_module/CallId;", "callIds", "<init>", "(Ljava/util/Set;)V", "component1", "()Ljava/util/Set;", "copy", "(Ljava/util/Set;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/common/watcher/WatcherMiddleware$Payload;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "getCallIds", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Payload implements IacMiddlewarePayload {
        public static final int $stable = 8;

        @k
        private final Set<Q<String, String>> callIds;

        public Payload(@k Set<Q<String, String>> set) {
            this.callIds = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Payload copy$default(Payload payload, Set set, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                set = payload.callIds;
            }
            return payload.copy(set);
        }

        @k
        public final Set<Q<String, String>> component1() {
            return this.callIds;
        }

        @k
        public final Payload copy(@k Set<Q<String, String>> callIds) {
            return new Payload(callIds);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Payload) && L.f(this.callIds, ((Payload) other).callIds);
        }

        @k
        public final Set<Q<String, String>> getCallIds() {
            return this.callIds;
        }

        public int hashCode() {
            return this.callIds.hashCode();
        }

        @k
        public String toString() {
            return c.u(new StringBuilder("Payload(callIds="), this.callIds, ')');
        }
    }

    private WatcherMiddleware() {
    }

    public boolean equals(@l Object other) {
        return this == other || (other instanceof WatcherMiddleware);
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return -1941071323;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddleware
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing) {
        IacMiddlewareDistinctBy.a.a(this, iacMiddlewareProcessing);
    }

    @k
    public String toString() {
        return "WatcherMiddleware";
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    @k
    public Payload getPayloadFromState(@k IacState state) {
        String scenario;
        Collection<CallInit> collectionValues = state.getAppearance().getCallInits().values();
        ArrayList arrayList = new ArrayList(C42745f0.q(collectionValues, 10));
        for (CallInit callInit : collectionValues) {
            CallInit.Payload payload = callInit.getPayload();
            if (payload instanceof CallInit.IncomingPayload) {
                scenario = "incoming_call";
            } else {
                if (!(payload instanceof CallInit.OutgoingPayload)) {
                    throw new NoWhenBranchMatchedException();
                }
                scenario = ((CallInit.OutgoingPayload) payload).getInput().getScenario();
            }
            arrayList.add(new Q(callInit.getCallId(), scenario));
        }
        LinkedHashSet linkedHashSetO0 = C42745f0.O0(arrayList);
        if (state instanceof IacState.InUse) {
            IacState.InUse inUse = (IacState.InUse) state;
            b1.i(linkedHashSetO0, new Q(inUse.getCallId(), inUse.getCall().getMeta().getScenario()));
        }
        return new Payload(linkedHashSetO0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacMiddlewareDistinctBy
    public void process(@k IacMiddlewareProcessing iacMiddlewareProcessing, @k Payload payload, @k Payload payload2) {
        for (Q q12 : b1.f(payload2.getCallIds(), payload.getCallIds())) {
            iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new IacEvent.Watcher.ActivateByState((String) q12.f406619b, (String) q12.f406620c));
        }
        Iterator it = b1.f(payload.getCallIds(), payload2.getCallIds()).iterator();
        while (it.hasNext()) {
            iacMiddlewareProcessing.plusAssign(iacMiddlewareProcessing.getOut(), new IacEvent.Watcher.ReleaseWithTimeout((String) ((Q) it.next()).f406619b));
        }
    }
}
