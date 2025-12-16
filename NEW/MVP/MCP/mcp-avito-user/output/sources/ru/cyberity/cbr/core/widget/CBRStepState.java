package ru.cyberity.cbr.core.widget;

import Y61.k;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.cyberity.cbr.core.R;

/* compiled from: CBRStepState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\t\b\u0086\u0001\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lru/cyberity/cbr/core/widget/CBRStepState;", "", "(Ljava/lang/String;I)V", "toDrawableState", "", "getToDrawableState", "()[I", "INIT", "PENDING", "APPROVED", "REJECTED", "PROCESSING", "Companion", "cyberity-mobile-sdk-ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public enum CBRStepState {
    INIT,
    PENDING,
    APPROVED,
    REJECTED,
    PROCESSING;


    @k
    private static final int[] STATE_INIT = {R.attr.cbr_stateInit};

    @k
    private static final int[] STATE_PENDING = {R.attr.cbr_statePending};

    @k
    private static final int[] STATE_APPROVED = {R.attr.cbr_stateApproved};

    @k
    private static final int[] STATE_REJECTED = {R.attr.cbr_stateRejected};

    @k
    private static final int[] STATE_PROCESSING = {R.attr.cbr_stateProcessing};

    /* compiled from: CBRStepState.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CBRStepState.values().length];
            iArr[CBRStepState.INIT.ordinal()] = 1;
            iArr[CBRStepState.PENDING.ordinal()] = 2;
            iArr[CBRStepState.APPROVED.ordinal()] = 3;
            iArr[CBRStepState.REJECTED.ordinal()] = 4;
            iArr[CBRStepState.PROCESSING.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @k
    public final int[] getToDrawableState() {
        int i12 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i12 == 1) {
            return STATE_INIT;
        }
        if (i12 == 2) {
            return STATE_PENDING;
        }
        if (i12 == 3) {
            return STATE_APPROVED;
        }
        if (i12 == 4) {
            return STATE_REJECTED;
        }
        if (i12 == 5) {
            return STATE_PROCESSING;
        }
        throw new NoWhenBranchMatchedException();
    }
}
