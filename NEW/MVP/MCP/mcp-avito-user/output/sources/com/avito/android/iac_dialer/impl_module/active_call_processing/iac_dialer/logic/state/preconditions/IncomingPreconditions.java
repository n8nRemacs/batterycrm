package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.state.preconditions;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Preconditions.kt */
@P
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u0017\u0010\u001b\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions;", "LdL/d;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;", "step", "", "screenId", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;I)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;", "component2", "()I", "copy", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;I)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions;", "", "toString", "()Ljava/lang/String;", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;", "getStep", "I", "getScreenId", "isResolved", "Z", "()Z", "Step", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IncomingPreconditions implements dL.d {
    public static final int $stable = 0;
    private final boolean isResolved;
    private final int screenId;

    @k
    private final Step step;

    /* compiled from: Preconditions.kt */
    @P
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;", "LdL/d;", "<init>", "()V", "MicPermissionRequesting", "NotChecked", "Resolved", "RoutedToSystemSettingsForPermissions", "WaitingForScreenToRequestPermissions", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step$MicPermissionRequesting;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step$NotChecked;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step$Resolved;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step$RoutedToSystemSettingsForPermissions;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step$WaitingForScreenToRequestPermissions;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Step implements dL.d {
        public static final int $stable = 0;

        /* compiled from: Preconditions.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step$MicPermissionRequesting;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class MicPermissionRequesting extends Step {
            public static final int $stable = 0;

            @k
            public static final MicPermissionRequesting INSTANCE = new MicPermissionRequesting();

            private MicPermissionRequesting() {
                super(null);
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof MicPermissionRequesting);
            }

            public int hashCode() {
                return 1385730111;
            }

            @k
            public String toString() {
                return "MicPermissionRequesting";
            }
        }

        /* compiled from: Preconditions.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step$NotChecked;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class NotChecked extends Step {
            public static final int $stable = 0;

            @k
            public static final NotChecked INSTANCE = new NotChecked();

            private NotChecked() {
                super(null);
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof NotChecked);
            }

            public int hashCode() {
                return 195751006;
            }

            @k
            public String toString() {
                return "NotChecked";
            }
        }

        /* compiled from: Preconditions.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step$Resolved;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Resolved extends Step {
            public static final int $stable = 0;

            @k
            public static final Resolved INSTANCE = new Resolved();

            private Resolved() {
                super(null);
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof Resolved);
            }

            public int hashCode() {
                return 1733126530;
            }

            @k
            public String toString() {
                return "Resolved";
            }
        }

        /* compiled from: Preconditions.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step$RoutedToSystemSettingsForPermissions;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RoutedToSystemSettingsForPermissions extends Step {
            public static final int $stable = 0;

            @k
            public static final RoutedToSystemSettingsForPermissions INSTANCE = new RoutedToSystemSettingsForPermissions();

            private RoutedToSystemSettingsForPermissions() {
                super(null);
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof RoutedToSystemSettingsForPermissions);
            }

            public int hashCode() {
                return 763463885;
            }

            @k
            public String toString() {
                return "RoutedToSystemSettingsForPermissions";
            }
        }

        /* compiled from: Preconditions.kt */
        @P
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u0007\u001a\u00020\bHÖ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001¨\u0006\u000b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step$WaitingForScreenToRequestPermissions;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/state/preconditions/IncomingPreconditions$Step;", "()V", "equals", "", PluralsKeys.OTHER, "", "hashCode", "", "toString", "", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class WaitingForScreenToRequestPermissions extends Step {
            public static final int $stable = 0;

            @k
            public static final WaitingForScreenToRequestPermissions INSTANCE = new WaitingForScreenToRequestPermissions();

            private WaitingForScreenToRequestPermissions() {
                super(null);
            }

            public boolean equals(@l Object other) {
                return this == other || (other instanceof WaitingForScreenToRequestPermissions);
            }

            public int hashCode() {
                return -1444252222;
            }

            @k
            public String toString() {
                return "WaitingForScreenToRequestPermissions";
            }
        }

        public /* synthetic */ Step(C42822w c42822w) {
            this();
        }

        private Step() {
        }
    }

    public IncomingPreconditions(@k Step step, int i12) {
        this.step = step;
        this.screenId = i12;
        this.isResolved = L.f(step, Step.Resolved.INSTANCE);
    }

    public static /* synthetic */ IncomingPreconditions copy$default(IncomingPreconditions incomingPreconditions, Step step, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            step = incomingPreconditions.step;
        }
        if ((i13 & 2) != 0) {
            i12 = incomingPreconditions.screenId;
        }
        return incomingPreconditions.copy(step, i12);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final Step getStep() {
        return this.step;
    }

    /* renamed from: component2, reason: from getter */
    public final int getScreenId() {
        return this.screenId;
    }

    @k
    public final IncomingPreconditions copy(@k Step step, int screenId) {
        return new IncomingPreconditions(step, screenId);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IncomingPreconditions)) {
            return false;
        }
        IncomingPreconditions incomingPreconditions = (IncomingPreconditions) other;
        return L.f(this.step, incomingPreconditions.step) && this.screenId == incomingPreconditions.screenId;
    }

    public final int getScreenId() {
        return this.screenId;
    }

    @k
    public final Step getStep() {
        return this.step;
    }

    public int hashCode() {
        return Integer.hashCode(this.screenId) + (this.step.hashCode() * 31);
    }

    /* renamed from: isResolved, reason: from getter */
    public final boolean getIsResolved() {
        return this.isResolved;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IncomingPreconditions(step=");
        sb2.append(this.step);
        sb2.append(", screenId=");
        return r.t(sb2, this.screenId, ')');
    }
}
