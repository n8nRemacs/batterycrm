package com.avito.android.select.group_clearance_select.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.n;
import com.avito.android.select.group_clearance_select.a;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GroupClearanceInternalAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "LeaveWithoutChanges", "OnSubmitClicked", "ResetSelectionAndLeave", "SetClearances", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction$LeaveWithoutChanges;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction$OnSubmitClicked;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction$ResetSelectionAndLeave;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction$SetClearances;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GroupClearanceInternalAction extends n {

    /* compiled from: GroupClearanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction$LeaveWithoutChanges;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LeaveWithoutChanges implements GroupClearanceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final LeaveWithoutChanges f265516b = new LeaveWithoutChanges();

        private LeaveWithoutChanges() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof LeaveWithoutChanges);
        }

        public final int hashCode() {
            return 1017705769;
        }

        @k
        public final String toString() {
            return "LeaveWithoutChanges";
        }
    }

    /* compiled from: GroupClearanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction$OnSubmitClicked;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OnSubmitClicked implements GroupClearanceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Object f265517b;

        public OnSubmitClicked(@k Map<String, Long> map) {
            this.f265517b = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSubmitClicked) && this.f265517b.equals(((OnSubmitClicked) obj).f265517b);
        }

        public final int hashCode() {
            return this.f265517b.hashCode();
        }

        @k
        public final String toString() {
            return H.n(new StringBuilder("OnSubmitClicked(selected="), this.f265517b, ')');
        }
    }

    /* compiled from: GroupClearanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction$ResetSelectionAndLeave;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ResetSelectionAndLeave implements GroupClearanceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final ResetSelectionAndLeave f265518b = new ResetSelectionAndLeave();

        private ResetSelectionAndLeave() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof ResetSelectionAndLeave);
        }

        public final int hashCode() {
            return -116639194;
        }

        @k
        public final String toString() {
            return "ResetSelectionAndLeave";
        }
    }

    /* compiled from: GroupClearanceInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction$SetClearances;", "Lcom/avito/android/select/group_clearance_select/mvi/entity/GroupClearanceInternalAction;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SetClearances implements GroupClearanceInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final a f265519b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Object f265520c;

        public SetClearances(@l a aVar, @k List<? extends a> list) {
            this.f265519b = aVar;
            this.f265520c = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SetClearances)) {
                return false;
            }
            SetClearances setClearances = (SetClearances) obj;
            return L.f(this.f265519b, setClearances.f265519b) && L.f(this.f265520c, setClearances.f265520c);
        }

        public final int hashCode() {
            a aVar = this.f265519b;
            return this.f265520c.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetClearances(selected=");
            sb2.append(this.f265519b);
            sb2.append(", clearanceTypes=");
            return H.n(sb2, this.f265520c, ')');
        }
    }
}
