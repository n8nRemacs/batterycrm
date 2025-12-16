package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.analytics.screens.mvi.n;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacFinishedFeedbackScreenInternalAction.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction;", "Lcom/avito/android/analytics/screens/mvi/n;", "SendCloseScreenEvent", "SendDisplayBottomSheetEvent", "UpdateState", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction$SendCloseScreenEvent;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction$SendDisplayBottomSheetEvent;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction$UpdateState;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IacFinishedFeedbackScreenInternalAction extends n {

    /* compiled from: IacFinishedFeedbackScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction$SendCloseScreenEvent;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendCloseScreenEvent implements IacFinishedFeedbackScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        public final boolean f166682b;

        public SendCloseScreenEvent(boolean z12) {
            this.f166682b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendCloseScreenEvent) && this.f166682b == ((SendCloseScreenEvent) obj).f166682b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f166682b);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("SendCloseScreenEvent(delayed="), this.f166682b, ')');
        }
    }

    /* compiled from: IacFinishedFeedbackScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction$SendDisplayBottomSheetEvent;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction;", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class SendDisplayBottomSheetEvent implements IacFinishedFeedbackScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final SendDisplayBottomSheetEvent f166683b = new SendDisplayBottomSheetEvent();

        private SendDisplayBottomSheetEvent() {
        }

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof SendDisplayBottomSheetEvent);
        }

        public final int hashCode() {
            return -1968957688;
        }

        @k
        public final String toString() {
            return "SendDisplayBottomSheetEvent";
        }
    }

    /* compiled from: IacFinishedFeedbackScreenInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction$UpdateState;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class UpdateState implements IacFinishedFeedbackScreenInternalAction {

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Integer f166684b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f166685c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Integer f166686d;

        public UpdateState() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateState)) {
                return false;
            }
            UpdateState updateState = (UpdateState) obj;
            return L.f(this.f166684b, updateState.f166684b) && L.f(this.f166685c, updateState.f166685c) && L.f(this.f166686d, updateState.f166686d);
        }

        public final int hashCode() {
            Integer num = this.f166684b;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Boolean bool = this.f166685c;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num2 = this.f166686d;
            return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateState(rating=");
            sb2.append(this.f166684b);
            sb2.append(", isRatingClickable=");
            sb2.append(this.f166685c);
            sb2.append(", selectedProblemIndex=");
            return s.j(sb2, this.f166686d, ')');
        }

        public UpdateState(Integer num, Boolean bool, Integer num2, int i12, C42822w c42822w) {
            num = (i12 & 1) != 0 ? null : num;
            bool = (i12 & 2) != 0 ? null : bool;
            num2 = (i12 & 4) != 0 ? null : num2;
            this.f166684b = num;
            this.f166685c = bool;
            this.f166686d = num2;
        }
    }
}
