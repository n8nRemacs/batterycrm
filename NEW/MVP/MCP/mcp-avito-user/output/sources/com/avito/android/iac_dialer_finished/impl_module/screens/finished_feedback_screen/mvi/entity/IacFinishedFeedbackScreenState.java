package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_feedback_screen.IacFinishedFeedbackScreenArgument;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: IacFinishedFeedbackScreenState.kt */
@P
@s0
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001&B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011R\u0013\u0010$\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b#\u0010\u0016¨\u0006'"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenState;", "Lcom/avito/android/analytics/screens/mvi/q;", "", "selectedRating", "", "isRatingClickable", "selectedProblemIndex", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenArgument;", "argument", "<init>", "(Ljava/lang/Integer;ZLjava/lang/Integer;Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenArgument;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Z", "component3", "component4", "()Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenArgument;", "copy", "(Ljava/lang/Integer;ZLjava/lang/Integer;Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenArgument;)Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getSelectedRating", "Z", "getSelectedProblemIndex", "Lcom/avito/android/iac_dialer_finished/public_module/screens/finished_feedback_screen/IacFinishedFeedbackScreenArgument;", "getArgument", "getSelectedProblemText", "selectedProblemText", "Companion", "a", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacFinishedFeedbackScreenState extends q {

    @k
    private final IacFinishedFeedbackScreenArgument argument;
    private final boolean isRatingClickable;

    @l
    private final Integer selectedProblemIndex;

    @l
    private final Integer selectedRating;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IacFinishedFeedbackScreenState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenState$a;", "", "<init>", "()V", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenState$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public Companion() {
        }
    }

    public IacFinishedFeedbackScreenState(@l Integer num, boolean z12, @l Integer num2, @k IacFinishedFeedbackScreenArgument iacFinishedFeedbackScreenArgument) {
        this.selectedRating = num;
        this.isRatingClickable = z12;
        this.selectedProblemIndex = num2;
        this.argument = iacFinishedFeedbackScreenArgument;
    }

    public static /* synthetic */ IacFinishedFeedbackScreenState copy$default(IacFinishedFeedbackScreenState iacFinishedFeedbackScreenState, Integer num, boolean z12, Integer num2, IacFinishedFeedbackScreenArgument iacFinishedFeedbackScreenArgument, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = iacFinishedFeedbackScreenState.selectedRating;
        }
        if ((i12 & 2) != 0) {
            z12 = iacFinishedFeedbackScreenState.isRatingClickable;
        }
        if ((i12 & 4) != 0) {
            num2 = iacFinishedFeedbackScreenState.selectedProblemIndex;
        }
        if ((i12 & 8) != 0) {
            iacFinishedFeedbackScreenArgument = iacFinishedFeedbackScreenState.argument;
        }
        return iacFinishedFeedbackScreenState.copy(num, z12, num2, iacFinishedFeedbackScreenArgument);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Integer getSelectedRating() {
        return this.selectedRating;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRatingClickable() {
        return this.isRatingClickable;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Integer getSelectedProblemIndex() {
        return this.selectedProblemIndex;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final IacFinishedFeedbackScreenArgument getArgument() {
        return this.argument;
    }

    @k
    public final IacFinishedFeedbackScreenState copy(@l Integer selectedRating, boolean isRatingClickable, @l Integer selectedProblemIndex, @k IacFinishedFeedbackScreenArgument argument) {
        return new IacFinishedFeedbackScreenState(selectedRating, isRatingClickable, selectedProblemIndex, argument);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacFinishedFeedbackScreenState)) {
            return false;
        }
        IacFinishedFeedbackScreenState iacFinishedFeedbackScreenState = (IacFinishedFeedbackScreenState) other;
        return L.f(this.selectedRating, iacFinishedFeedbackScreenState.selectedRating) && this.isRatingClickable == iacFinishedFeedbackScreenState.isRatingClickable && L.f(this.selectedProblemIndex, iacFinishedFeedbackScreenState.selectedProblemIndex) && L.f(this.argument, iacFinishedFeedbackScreenState.argument);
    }

    @k
    public final IacFinishedFeedbackScreenArgument getArgument() {
        return this.argument;
    }

    @l
    public final Integer getSelectedProblemIndex() {
        return this.selectedProblemIndex;
    }

    @l
    public final String getSelectedProblemText() {
        Integer num = this.selectedProblemIndex;
        if (num != null) {
            return (String) C42745f0.K(num.intValue(), this.argument.getAvailableProblems());
        }
        return null;
    }

    @l
    public final Integer getSelectedRating() {
        return this.selectedRating;
    }

    public int hashCode() {
        Integer num = this.selectedRating;
        int i12 = r.i((num == null ? 0 : num.hashCode()) * 31, 31, this.isRatingClickable);
        Integer num2 = this.selectedProblemIndex;
        return this.argument.hashCode() + ((i12 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    public final boolean isRatingClickable() {
        return this.isRatingClickable;
    }

    @k
    public String toString() {
        return "IacFinishedFeedbackScreenState(selectedRating=" + this.selectedRating + ", isRatingClickable=" + this.isRatingClickable + ", selectedProblemIndex=" + this.selectedProblemIndex + ", argument=" + this.argument + ')';
    }
}
