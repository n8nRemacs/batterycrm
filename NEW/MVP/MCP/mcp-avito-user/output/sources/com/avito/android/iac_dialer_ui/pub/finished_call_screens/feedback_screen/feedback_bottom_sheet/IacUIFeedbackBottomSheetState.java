package com.avito.android.iac_dialer_ui.pub.finished_call_screens.feedback_screen.feedback_bottom_sheet;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacUIFeedbackBottomSheet.kt */
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\rJB\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010\u000fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\"\u0010\r¨\u0006#"}, d2 = {"Lcom/avito/android/iac_dialer_ui/pub/finished_call_screens/feedback_screen/feedback_bottom_sheet/IacUIFeedbackBottomSheetState;", "LdL/d;", "", "selectedRating", "", "isRatingClickable", "", "", "availableProblems", "selectedProblemIndex", "<init>", "(Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Z", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/Integer;ZLjava/util/List;Ljava/lang/Integer;)Lcom/avito/android/iac_dialer_ui/pub/finished_call_screens/feedback_screen/feedback_bottom_sheet/IacUIFeedbackBottomSheetState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getSelectedRating", "Z", "Ljava/util/List;", "getAvailableProblems", "getSelectedProblemIndex", "_avito_iac-dialer-ui_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacUIFeedbackBottomSheetState implements dL.d {
    public static final int $stable = 8;

    @Y61.k
    private final List<String> availableProblems;
    private final boolean isRatingClickable;

    @Y61.l
    private final Integer selectedProblemIndex;

    @Y61.l
    private final Integer selectedRating;

    public IacUIFeedbackBottomSheetState(@Y61.l Integer num, boolean z12, @Y61.k List<String> list, @Y61.l Integer num2) {
        this.selectedRating = num;
        this.isRatingClickable = z12;
        this.availableProblems = list;
        this.selectedProblemIndex = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IacUIFeedbackBottomSheetState copy$default(IacUIFeedbackBottomSheetState iacUIFeedbackBottomSheetState, Integer num, boolean z12, List list, Integer num2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            num = iacUIFeedbackBottomSheetState.selectedRating;
        }
        if ((i12 & 2) != 0) {
            z12 = iacUIFeedbackBottomSheetState.isRatingClickable;
        }
        if ((i12 & 4) != 0) {
            list = iacUIFeedbackBottomSheetState.availableProblems;
        }
        if ((i12 & 8) != 0) {
            num2 = iacUIFeedbackBottomSheetState.selectedProblemIndex;
        }
        return iacUIFeedbackBottomSheetState.copy(num, z12, list, num2);
    }

    @Y61.l
    /* renamed from: component1, reason: from getter */
    public final Integer getSelectedRating() {
        return this.selectedRating;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRatingClickable() {
        return this.isRatingClickable;
    }

    @Y61.k
    public final List<String> component3() {
        return this.availableProblems;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final Integer getSelectedProblemIndex() {
        return this.selectedProblemIndex;
    }

    @Y61.k
    public final IacUIFeedbackBottomSheetState copy(@Y61.l Integer selectedRating, boolean isRatingClickable, @Y61.k List<String> availableProblems, @Y61.l Integer selectedProblemIndex) {
        return new IacUIFeedbackBottomSheetState(selectedRating, isRatingClickable, availableProblems, selectedProblemIndex);
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IacUIFeedbackBottomSheetState)) {
            return false;
        }
        IacUIFeedbackBottomSheetState iacUIFeedbackBottomSheetState = (IacUIFeedbackBottomSheetState) other;
        return L.f(this.selectedRating, iacUIFeedbackBottomSheetState.selectedRating) && this.isRatingClickable == iacUIFeedbackBottomSheetState.isRatingClickable && L.f(this.availableProblems, iacUIFeedbackBottomSheetState.availableProblems) && L.f(this.selectedProblemIndex, iacUIFeedbackBottomSheetState.selectedProblemIndex);
    }

    @Y61.k
    public final List<String> getAvailableProblems() {
        return this.availableProblems;
    }

    @Y61.l
    public final Integer getSelectedProblemIndex() {
        return this.selectedProblemIndex;
    }

    @Y61.l
    public final Integer getSelectedRating() {
        return this.selectedRating;
    }

    public int hashCode() {
        Integer num = this.selectedRating;
        int iE2 = H.e(androidx.appcompat.app.r.i((num == null ? 0 : num.hashCode()) * 31, 31, this.isRatingClickable), 31, this.availableProblems);
        Integer num2 = this.selectedProblemIndex;
        return iE2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean isRatingClickable() {
        return this.isRatingClickable;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("IacUIFeedbackBottomSheetState(selectedRating=");
        sb2.append(this.selectedRating);
        sb2.append(", isRatingClickable=");
        sb2.append(this.isRatingClickable);
        sb2.append(", availableProblems=");
        sb2.append(this.availableProblems);
        sb2.append(", selectedProblemIndex=");
        return com.akita.compose.component.accordion.s.j(sb2, this.selectedProblemIndex, ')');
    }
}
