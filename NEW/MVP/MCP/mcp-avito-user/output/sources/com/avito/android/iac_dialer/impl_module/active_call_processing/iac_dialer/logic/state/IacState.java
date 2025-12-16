package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.appearance.Appearance;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.call_state.CallState;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.idle.IdleNavigation;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.params.CallParams;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.IncomingPreconditions;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions.OutgoingPreconditions;
import com.avito.android.iac_dialer.impl_module.utils.HasIndex;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import dL.d;
import fK.InterfaceC40303a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacState.kt */
@P
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u001f B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0002!\u0006¨\u0006\""}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "LfK/a;", "Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex;", "LdL/d;", "<init>", "()V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse;", "asInUse", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive;", "asAlive", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", "asFinished", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", "", "index", "I", "getIndex", "()I", "setIndex", "(I)V", "Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex$Type;", "indexType", "Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex$Type;", "getIndexType", "()Lcom/avito/android/iac_dialer/impl_module/utils/HasIndex$Type;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "getAppearance", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "appearance", "Idle", "InUse", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$Idle;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class IacState implements InterfaceC40303a, HasIndex, d {
    public static final int $stable = 8;
    private int index;

    @k
    private final HasIndex.Type indexType;

    /* compiled from: IacState.kt */
    @P
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001e"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$Idle;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "appearance", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "navigation", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation;)V", "getAppearance", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "getNavigation", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation;", "component1", "component2", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toIncoming", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming$Waiting;", "params", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "call", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "toOutgoing", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing$Launching;", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Idle extends IacState {
        public static final int $stable = 8;

        @k
        private final Appearance appearance;

        @k
        private final IdleNavigation navigation;

        public Idle(@k Appearance appearance, @k IdleNavigation idleNavigation) {
            super(null);
            this.appearance = appearance;
            this.navigation = idleNavigation;
        }

        public static /* synthetic */ Idle copy$default(Idle idle, Appearance appearance, IdleNavigation idleNavigation, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                appearance = idle.appearance;
            }
            if ((i12 & 2) != 0) {
                idleNavigation = idle.navigation;
            }
            return idle.copy(appearance, idleNavigation);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final Appearance getAppearance() {
            return this.appearance;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final IdleNavigation getNavigation() {
            return this.navigation;
        }

        @k
        public final Idle copy(@k Appearance appearance, @k IdleNavigation navigation2) {
            return new Idle(appearance, navigation2);
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Idle)) {
                return false;
            }
            Idle idle = (Idle) other;
            return L.f(this.appearance, idle.appearance) && L.f(this.navigation, idle.navigation);
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState
        @k
        public Appearance getAppearance() {
            return this.appearance;
        }

        @k
        public final IdleNavigation getNavigation() {
            return this.navigation;
        }

        public int hashCode() {
            return this.navigation.hashCode() + (this.appearance.hashCode() * 31);
        }

        @k
        public final InUse.Alive.Incoming.Waiting toIncoming(@k CallParams params, @k CallState call) {
            return new InUse.Alive.Incoming.Waiting(call, params, getAppearance());
        }

        @k
        public final InUse.Alive.Outgoing.Launching toOutgoing(@k CallParams params, @k CallState call) {
            return new InUse.Alive.Outgoing.Launching(call, params, getAppearance());
        }

        @k
        public String toString() {
            return "Idle(appearance=" + this.appearance + ", navigation=" + this.navigation + ')';
        }
    }

    /* compiled from: IacState.kt */
    @P
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/a;", "<init>", "()V", "Alive", "Finished", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class InUse extends IacState implements a {
        public static final int $stable = 0;

        /* compiled from: IacState.kt */
        @P
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse;", "()V", "Incoming", "Outgoing", "Talking", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Talking;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static abstract class Alive extends InUse {
            public static final int $stable = 0;

            /* compiled from: IacState.kt */
            @P
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive;", "()V", "Accepting", "Resolving", "Waiting", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming$Accepting;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming$Resolving;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming$Waiting;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static abstract class Incoming extends Alive {
                public static final int $stable = 0;

                /* compiled from: IacState.kt */
                @P
                @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming$Accepting;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming;", "call", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "params", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "appearance", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;)V", "getAppearance", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "getCall", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "getParams", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toFinished", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", "toString", "", "toTalking", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Talking;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Accepting extends Incoming {
                    public static final int $stable = 8;

                    @k
                    private final Appearance appearance;

                    @k
                    private final CallState call;

                    @k
                    private final CallParams params;

                    public Accepting(@k CallState callState, @k CallParams callParams, @k Appearance appearance) {
                        super(null);
                        this.call = callState;
                        this.params = callParams;
                        this.appearance = appearance;
                    }

                    public static /* synthetic */ Accepting copy$default(Accepting accepting, CallState callState, CallParams callParams, Appearance appearance, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            callState = accepting.call;
                        }
                        if ((i12 & 2) != 0) {
                            callParams = accepting.params;
                        }
                        if ((i12 & 4) != 0) {
                            appearance = accepting.appearance;
                        }
                        return accepting.copy(callState, callParams, appearance);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final CallState getCall() {
                        return this.call;
                    }

                    @k
                    /* renamed from: component2, reason: from getter */
                    public final CallParams getParams() {
                        return this.params;
                    }

                    @k
                    /* renamed from: component3, reason: from getter */
                    public final Appearance getAppearance() {
                        return this.appearance;
                    }

                    @k
                    public final Accepting copy(@k CallState call, @k CallParams params, @k Appearance appearance) {
                        return new Accepting(call, params, appearance);
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Accepting)) {
                            return false;
                        }
                        Accepting accepting = (Accepting) other;
                        return L.f(this.call, accepting.call) && L.f(this.params, accepting.params) && L.f(this.appearance, accepting.appearance);
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState
                    @k
                    public Appearance getAppearance() {
                        return this.appearance;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallState getCall() {
                        return this.call;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallParams getParams() {
                        return this.params;
                    }

                    public int hashCode() {
                        return this.appearance.hashCode() + ((this.params.hashCode() + (this.call.hashCode() * 31)) * 31);
                    }

                    @k
                    public final Finished toFinished() {
                        return new Finished(getCall(), getParams(), getAppearance());
                    }

                    @k
                    public String toString() {
                        return "Accepting(call=" + this.call + ", params=" + this.params + ", appearance=" + this.appearance + ')';
                    }

                    @k
                    public final Talking toTalking() {
                        return new Talking(getCall(), getParams(), getAppearance());
                    }
                }

                /* compiled from: IacState.kt */
                @P
                @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020!J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming$Resolving;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming;", "preconditions", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions;", "call", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "params", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "appearance", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;)V", "getAppearance", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "getCall", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "getParams", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "getPreconditions", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toAccepting", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming$Accepting;", "toFinished", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Resolving extends Incoming {
                    public static final int $stable = 8;

                    @k
                    private final Appearance appearance;

                    @k
                    private final CallState call;

                    @k
                    private final CallParams params;

                    @k
                    private final IncomingPreconditions preconditions;

                    public Resolving(@k IncomingPreconditions incomingPreconditions, @k CallState callState, @k CallParams callParams, @k Appearance appearance) {
                        super(null);
                        this.preconditions = incomingPreconditions;
                        this.call = callState;
                        this.params = callParams;
                        this.appearance = appearance;
                    }

                    public static /* synthetic */ Resolving copy$default(Resolving resolving, IncomingPreconditions incomingPreconditions, CallState callState, CallParams callParams, Appearance appearance, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            incomingPreconditions = resolving.preconditions;
                        }
                        if ((i12 & 2) != 0) {
                            callState = resolving.call;
                        }
                        if ((i12 & 4) != 0) {
                            callParams = resolving.params;
                        }
                        if ((i12 & 8) != 0) {
                            appearance = resolving.appearance;
                        }
                        return resolving.copy(incomingPreconditions, callState, callParams, appearance);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final IncomingPreconditions getPreconditions() {
                        return this.preconditions;
                    }

                    @k
                    /* renamed from: component2, reason: from getter */
                    public final CallState getCall() {
                        return this.call;
                    }

                    @k
                    /* renamed from: component3, reason: from getter */
                    public final CallParams getParams() {
                        return this.params;
                    }

                    @k
                    /* renamed from: component4, reason: from getter */
                    public final Appearance getAppearance() {
                        return this.appearance;
                    }

                    @k
                    public final Resolving copy(@k IncomingPreconditions preconditions, @k CallState call, @k CallParams params, @k Appearance appearance) {
                        return new Resolving(preconditions, call, params, appearance);
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Resolving)) {
                            return false;
                        }
                        Resolving resolving = (Resolving) other;
                        return L.f(this.preconditions, resolving.preconditions) && L.f(this.call, resolving.call) && L.f(this.params, resolving.params) && L.f(this.appearance, resolving.appearance);
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState
                    @k
                    public Appearance getAppearance() {
                        return this.appearance;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallState getCall() {
                        return this.call;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallParams getParams() {
                        return this.params;
                    }

                    @k
                    public final IncomingPreconditions getPreconditions() {
                        return this.preconditions;
                    }

                    public int hashCode() {
                        return this.appearance.hashCode() + ((this.params.hashCode() + ((this.call.hashCode() + (this.preconditions.hashCode() * 31)) * 31)) * 31);
                    }

                    @k
                    public final Accepting toAccepting() {
                        return new Accepting(getCall(), getParams(), getAppearance());
                    }

                    @k
                    public final Finished toFinished() {
                        return new Finished(getCall(), getParams(), getAppearance());
                    }

                    @k
                    public String toString() {
                        return "Resolving(preconditions=" + this.preconditions + ", call=" + this.call + ", params=" + this.params + ", appearance=" + this.appearance + ')';
                    }
                }

                /* compiled from: IacState.kt */
                @P
                @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006!"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming$Waiting;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming;", "call", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "params", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "appearance", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;)V", "getAppearance", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "getCall", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "getParams", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toFinished", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", "toResolving", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Incoming$Resolving;", "preconditions", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions;", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Waiting extends Incoming {
                    public static final int $stable = 8;

                    @k
                    private final Appearance appearance;

                    @k
                    private final CallState call;

                    @k
                    private final CallParams params;

                    public Waiting(@k CallState callState, @k CallParams callParams, @k Appearance appearance) {
                        super(null);
                        this.call = callState;
                        this.params = callParams;
                        this.appearance = appearance;
                    }

                    public static /* synthetic */ Waiting copy$default(Waiting waiting, CallState callState, CallParams callParams, Appearance appearance, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            callState = waiting.call;
                        }
                        if ((i12 & 2) != 0) {
                            callParams = waiting.params;
                        }
                        if ((i12 & 4) != 0) {
                            appearance = waiting.appearance;
                        }
                        return waiting.copy(callState, callParams, appearance);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final CallState getCall() {
                        return this.call;
                    }

                    @k
                    /* renamed from: component2, reason: from getter */
                    public final CallParams getParams() {
                        return this.params;
                    }

                    @k
                    /* renamed from: component3, reason: from getter */
                    public final Appearance getAppearance() {
                        return this.appearance;
                    }

                    @k
                    public final Waiting copy(@k CallState call, @k CallParams params, @k Appearance appearance) {
                        return new Waiting(call, params, appearance);
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Waiting)) {
                            return false;
                        }
                        Waiting waiting = (Waiting) other;
                        return L.f(this.call, waiting.call) && L.f(this.params, waiting.params) && L.f(this.appearance, waiting.appearance);
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState
                    @k
                    public Appearance getAppearance() {
                        return this.appearance;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallState getCall() {
                        return this.call;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Incoming, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallParams getParams() {
                        return this.params;
                    }

                    public int hashCode() {
                        return this.appearance.hashCode() + ((this.params.hashCode() + (this.call.hashCode() * 31)) * 31);
                    }

                    @k
                    public final Finished toFinished() {
                        return new Finished(getCall(), getParams(), getAppearance());
                    }

                    @k
                    public final Resolving toResolving(@k IncomingPreconditions preconditions) {
                        return new Resolving(preconditions, getCall(), getParams(), getAppearance());
                    }

                    @k
                    public String toString() {
                        return "Waiting(call=" + this.call + ", params=" + this.params + ", appearance=" + this.appearance + ')';
                    }
                }

                public /* synthetic */ Incoming(C42822w c42822w) {
                    this();
                }

                @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                @k
                public abstract /* synthetic */ CallState getCall();

                @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                @k
                public abstract /* synthetic */ CallParams getParams();

                private Incoming() {
                    super(null);
                }
            }

            /* compiled from: IacState.kt */
            @P
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive;", "()V", "Launching", "Resolving", "Waiting", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing$Launching;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing$Resolving;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing$Waiting;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static abstract class Outgoing extends Alive {
                public static final int $stable = 0;

                /* compiled from: IacState.kt */
                @P
                @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing$Launching;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing;", "call", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "params", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "appearance", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;)V", "getAppearance", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "getCall", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "getParams", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toFinished", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", "toResolving", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing$Resolving;", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Launching extends Outgoing {
                    public static final int $stable = 8;

                    @k
                    private final Appearance appearance;

                    @k
                    private final CallState call;

                    @k
                    private final CallParams params;

                    public Launching(@k CallState callState, @k CallParams callParams, @k Appearance appearance) {
                        super(null);
                        this.call = callState;
                        this.params = callParams;
                        this.appearance = appearance;
                    }

                    public static /* synthetic */ Launching copy$default(Launching launching, CallState callState, CallParams callParams, Appearance appearance, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            callState = launching.call;
                        }
                        if ((i12 & 2) != 0) {
                            callParams = launching.params;
                        }
                        if ((i12 & 4) != 0) {
                            appearance = launching.appearance;
                        }
                        return launching.copy(callState, callParams, appearance);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final CallState getCall() {
                        return this.call;
                    }

                    @k
                    /* renamed from: component2, reason: from getter */
                    public final CallParams getParams() {
                        return this.params;
                    }

                    @k
                    /* renamed from: component3, reason: from getter */
                    public final Appearance getAppearance() {
                        return this.appearance;
                    }

                    @k
                    public final Launching copy(@k CallState call, @k CallParams params, @k Appearance appearance) {
                        return new Launching(call, params, appearance);
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Launching)) {
                            return false;
                        }
                        Launching launching = (Launching) other;
                        return L.f(this.call, launching.call) && L.f(this.params, launching.params) && L.f(this.appearance, launching.appearance);
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState
                    @k
                    public Appearance getAppearance() {
                        return this.appearance;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Outgoing, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallState getCall() {
                        return this.call;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Outgoing, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallParams getParams() {
                        return this.params;
                    }

                    public int hashCode() {
                        return this.appearance.hashCode() + ((this.params.hashCode() + (this.call.hashCode() * 31)) * 31);
                    }

                    @k
                    public final Finished toFinished() {
                        return new Finished(getCall(), getParams(), getAppearance());
                    }

                    @k
                    public final Resolving toResolving() {
                        return new Resolving(new OutgoingPreconditions(OutgoingPreconditions.Step.NotChecked.INSTANCE, getAppearance().getScreen().getId()), getCall(), getParams(), getAppearance());
                    }

                    @k
                    public String toString() {
                        return "Launching(call=" + this.call + ", params=" + this.params + ", appearance=" + this.appearance + ')';
                    }
                }

                /* compiled from: IacState.kt */
                @P
                @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0006\u0010\u001e\u001a\u00020\u001fJ\t\u0010 \u001a\u00020!HÖ\u0001J\u0006\u0010\"\u001a\u00020#R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006$"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing$Resolving;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing;", "preconditions", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/OutgoingPreconditions;", "call", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "params", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "appearance", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/OutgoingPreconditions;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;)V", "getAppearance", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "getCall", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "getParams", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "getPreconditions", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/OutgoingPreconditions;", "component1", "component2", "component3", "component4", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toFinished", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", "toString", "", "toWaiting", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing$Waiting;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Resolving extends Outgoing {
                    public static final int $stable = 8;

                    @k
                    private final Appearance appearance;

                    @k
                    private final CallState call;

                    @k
                    private final CallParams params;

                    @k
                    private final OutgoingPreconditions preconditions;

                    public Resolving(@k OutgoingPreconditions outgoingPreconditions, @k CallState callState, @k CallParams callParams, @k Appearance appearance) {
                        super(null);
                        this.preconditions = outgoingPreconditions;
                        this.call = callState;
                        this.params = callParams;
                        this.appearance = appearance;
                    }

                    public static /* synthetic */ Resolving copy$default(Resolving resolving, OutgoingPreconditions outgoingPreconditions, CallState callState, CallParams callParams, Appearance appearance, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            outgoingPreconditions = resolving.preconditions;
                        }
                        if ((i12 & 2) != 0) {
                            callState = resolving.call;
                        }
                        if ((i12 & 4) != 0) {
                            callParams = resolving.params;
                        }
                        if ((i12 & 8) != 0) {
                            appearance = resolving.appearance;
                        }
                        return resolving.copy(outgoingPreconditions, callState, callParams, appearance);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final OutgoingPreconditions getPreconditions() {
                        return this.preconditions;
                    }

                    @k
                    /* renamed from: component2, reason: from getter */
                    public final CallState getCall() {
                        return this.call;
                    }

                    @k
                    /* renamed from: component3, reason: from getter */
                    public final CallParams getParams() {
                        return this.params;
                    }

                    @k
                    /* renamed from: component4, reason: from getter */
                    public final Appearance getAppearance() {
                        return this.appearance;
                    }

                    @k
                    public final Resolving copy(@k OutgoingPreconditions preconditions, @k CallState call, @k CallParams params, @k Appearance appearance) {
                        return new Resolving(preconditions, call, params, appearance);
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Resolving)) {
                            return false;
                        }
                        Resolving resolving = (Resolving) other;
                        return L.f(this.preconditions, resolving.preconditions) && L.f(this.call, resolving.call) && L.f(this.params, resolving.params) && L.f(this.appearance, resolving.appearance);
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState
                    @k
                    public Appearance getAppearance() {
                        return this.appearance;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Outgoing, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallState getCall() {
                        return this.call;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Outgoing, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallParams getParams() {
                        return this.params;
                    }

                    @k
                    public final OutgoingPreconditions getPreconditions() {
                        return this.preconditions;
                    }

                    public int hashCode() {
                        return this.appearance.hashCode() + ((this.params.hashCode() + ((this.call.hashCode() + (this.preconditions.hashCode() * 31)) * 31)) * 31);
                    }

                    @k
                    public final Finished toFinished() {
                        return new Finished(getCall(), getParams(), getAppearance());
                    }

                    @k
                    public String toString() {
                        return "Resolving(preconditions=" + this.preconditions + ", call=" + this.call + ", params=" + this.params + ", appearance=" + this.appearance + ')';
                    }

                    @k
                    public final Waiting toWaiting() {
                        return new Waiting(getCall(), getParams(), getAppearance());
                    }
                }

                /* compiled from: IacState.kt */
                @P
                @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0006\u0010\u001d\u001a\u00020\u001eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing$Waiting;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Outgoing;", "call", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "params", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "appearance", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;)V", "getAppearance", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "getCall", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "getParams", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toFinished", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", "toString", "", "toTalking", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Talking;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class Waiting extends Outgoing {
                    public static final int $stable = 8;

                    @k
                    private final Appearance appearance;

                    @k
                    private final CallState call;

                    @k
                    private final CallParams params;

                    public Waiting(@k CallState callState, @k CallParams callParams, @k Appearance appearance) {
                        super(null);
                        this.call = callState;
                        this.params = callParams;
                        this.appearance = appearance;
                    }

                    public static /* synthetic */ Waiting copy$default(Waiting waiting, CallState callState, CallParams callParams, Appearance appearance, int i12, Object obj) {
                        if ((i12 & 1) != 0) {
                            callState = waiting.call;
                        }
                        if ((i12 & 2) != 0) {
                            callParams = waiting.params;
                        }
                        if ((i12 & 4) != 0) {
                            appearance = waiting.appearance;
                        }
                        return waiting.copy(callState, callParams, appearance);
                    }

                    @k
                    /* renamed from: component1, reason: from getter */
                    public final CallState getCall() {
                        return this.call;
                    }

                    @k
                    /* renamed from: component2, reason: from getter */
                    public final CallParams getParams() {
                        return this.params;
                    }

                    @k
                    /* renamed from: component3, reason: from getter */
                    public final Appearance getAppearance() {
                        return this.appearance;
                    }

                    @k
                    public final Waiting copy(@k CallState call, @k CallParams params, @k Appearance appearance) {
                        return new Waiting(call, params, appearance);
                    }

                    public boolean equals(@l Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Waiting)) {
                            return false;
                        }
                        Waiting waiting = (Waiting) other;
                        return L.f(this.call, waiting.call) && L.f(this.params, waiting.params) && L.f(this.appearance, waiting.appearance);
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState
                    @k
                    public Appearance getAppearance() {
                        return this.appearance;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Outgoing, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallState getCall() {
                        return this.call;
                    }

                    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive.Outgoing, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                    @k
                    public CallParams getParams() {
                        return this.params;
                    }

                    public int hashCode() {
                        return this.appearance.hashCode() + ((this.params.hashCode() + (this.call.hashCode() * 31)) * 31);
                    }

                    @k
                    public final Finished toFinished() {
                        return new Finished(getCall(), getParams(), getAppearance());
                    }

                    @k
                    public String toString() {
                        return "Waiting(call=" + this.call + ", params=" + this.params + ", appearance=" + this.appearance + ')';
                    }

                    @k
                    public final Talking toTalking() {
                        return new Talking(getCall(), getParams(), getAppearance());
                    }
                }

                public /* synthetic */ Outgoing(C42822w c42822w) {
                    this();
                }

                @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                @k
                public abstract /* synthetic */ CallState getCall();

                @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                @k
                public abstract /* synthetic */ CallParams getParams();

                private Outgoing() {
                    super(null);
                }
            }

            /* compiled from: IacState.kt */
            @P
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive$Talking;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Alive;", "call", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "params", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "appearance", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;)V", "getAppearance", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "getCall", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "getParams", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toFinished", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Talking extends Alive {
                public static final int $stable = 8;

                @k
                private final Appearance appearance;

                @k
                private final CallState call;

                @k
                private final CallParams params;

                public Talking(@k CallState callState, @k CallParams callParams, @k Appearance appearance) {
                    super(null);
                    this.call = callState;
                    this.params = callParams;
                    this.appearance = appearance;
                }

                public static /* synthetic */ Talking copy$default(Talking talking, CallState callState, CallParams callParams, Appearance appearance, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        callState = talking.call;
                    }
                    if ((i12 & 2) != 0) {
                        callParams = talking.params;
                    }
                    if ((i12 & 4) != 0) {
                        appearance = talking.appearance;
                    }
                    return talking.copy(callState, callParams, appearance);
                }

                @k
                /* renamed from: component1, reason: from getter */
                public final CallState getCall() {
                    return this.call;
                }

                @k
                /* renamed from: component2, reason: from getter */
                public final CallParams getParams() {
                    return this.params;
                }

                @k
                /* renamed from: component3, reason: from getter */
                public final Appearance getAppearance() {
                    return this.appearance;
                }

                @k
                public final Talking copy(@k CallState call, @k CallParams params, @k Appearance appearance) {
                    return new Talking(call, params, appearance);
                }

                public boolean equals(@l Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Talking)) {
                        return false;
                    }
                    Talking talking = (Talking) other;
                    return L.f(this.call, talking.call) && L.f(this.params, talking.params) && L.f(this.appearance, talking.appearance);
                }

                @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState
                @k
                public Appearance getAppearance() {
                    return this.appearance;
                }

                @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                @k
                public CallState getCall() {
                    return this.call;
                }

                @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse.Alive, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
                @k
                public CallParams getParams() {
                    return this.params;
                }

                public int hashCode() {
                    return this.appearance.hashCode() + ((this.params.hashCode() + (this.call.hashCode() * 31)) * 31);
                }

                @k
                public final Finished toFinished() {
                    return new Finished(getCall(), getParams(), getAppearance());
                }

                @k
                public String toString() {
                    return "Talking(call=" + this.call + ", params=" + this.params + ", appearance=" + this.appearance + ')';
                }
            }

            public /* synthetic */ Alive(C42822w c42822w) {
                this();
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
            @k
            public abstract /* synthetic */ CallState getCall();

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
            @k
            public abstract /* synthetic */ CallParams getParams();

            private Alive() {
                super(null);
            }
        }

        /* compiled from: IacState.kt */
        @P
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse$Finished;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$InUse;", "call", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "params", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "appearance", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;)V", "getAppearance", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/appearance/Appearance;", "getCall", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/call_state/CallState;", "getParams", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/params/CallParams;", "component1", "component2", "component3", "copy", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toIdle", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/IacState$Idle;", "ui", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/idle/IdleNavigation;", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Finished extends InUse {
            public static final int $stable = 8;

            @k
            private final Appearance appearance;

            @k
            private final CallState call;

            @k
            private final CallParams params;

            public Finished(@k CallState callState, @k CallParams callParams, @k Appearance appearance) {
                super(null);
                this.call = callState;
                this.params = callParams;
                this.appearance = appearance;
            }

            public static /* synthetic */ Finished copy$default(Finished finished, CallState callState, CallParams callParams, Appearance appearance, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    callState = finished.call;
                }
                if ((i12 & 2) != 0) {
                    callParams = finished.params;
                }
                if ((i12 & 4) != 0) {
                    appearance = finished.appearance;
                }
                return finished.copy(callState, callParams, appearance);
            }

            @k
            /* renamed from: component1, reason: from getter */
            public final CallState getCall() {
                return this.call;
            }

            @k
            /* renamed from: component2, reason: from getter */
            public final CallParams getParams() {
                return this.params;
            }

            @k
            /* renamed from: component3, reason: from getter */
            public final Appearance getAppearance() {
                return this.appearance;
            }

            @k
            public final Finished copy(@k CallState call, @k CallParams params, @k Appearance appearance) {
                return new Finished(call, params, appearance);
            }

            public boolean equals(@l Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Finished)) {
                    return false;
                }
                Finished finished = (Finished) other;
                return L.f(this.call, finished.call) && L.f(this.params, finished.params) && L.f(this.appearance, finished.appearance);
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState
            @k
            public Appearance getAppearance() {
                return this.appearance;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
            @k
            public CallState getCall() {
                return this.call;
            }

            @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.IacState.InUse, com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
            @k
            public CallParams getParams() {
                return this.params;
            }

            public int hashCode() {
                return this.appearance.hashCode() + ((this.params.hashCode() + (this.call.hashCode() * 31)) * 31);
            }

            @k
            public final Idle toIdle(@k IdleNavigation ui2) {
                return new Idle(getAppearance(), ui2);
            }

            @k
            public String toString() {
                return "Finished(call=" + this.call + ", params=" + this.params + ", appearance=" + this.appearance + ')';
            }
        }

        public /* synthetic */ InUse(C42822w c42822w) {
            this();
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
        @k
        public abstract /* synthetic */ CallState getCall();

        @k
        public String getCallId() {
            return getCall().getCallId();
        }

        @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.a
        @k
        public abstract /* synthetic */ CallParams getParams();

        private InUse() {
            super(null);
        }
    }

    public /* synthetic */ IacState(C42822w c42822w) {
        this();
    }

    @l
    public final InUse.Alive asAlive() {
        if (this instanceof InUse.Alive) {
            return (InUse.Alive) this;
        }
        return null;
    }

    @l
    public final InUse.Finished asFinished() {
        if (this instanceof InUse.Finished) {
            return (InUse.Finished) this;
        }
        return null;
    }

    @l
    public final InUse asInUse() {
        if (this instanceof InUse) {
            return (InUse) this;
        }
        return null;
    }

    @k
    public abstract Appearance getAppearance();

    @Override // com.avito.android.iac_dialer.impl_module.utils.HasIndex
    public int getIndex() {
        return this.index;
    }

    @Override // com.avito.android.iac_dialer.impl_module.utils.HasIndex
    @k
    public HasIndex.Type getIndexType() {
        return this.indexType;
    }

    @Override // com.avito.android.iac_dialer.impl_module.utils.HasIndex
    public void setIndex(int i12) {
        this.index = i12;
    }

    private IacState() {
        this.index = -1;
        this.indexType = HasIndex.Type.f166506b;
    }
}
