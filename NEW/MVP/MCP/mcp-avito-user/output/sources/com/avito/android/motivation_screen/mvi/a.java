package com.avito.android.motivation_screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.motivation_screen.models.MotivationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InternalActionToUiStateMapper.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/motivation_screen/mvi/a;", "", "<init>", "()V", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: InternalActionToUiStateMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.motivation_screen.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C6147a {
        static {
            int[] iArr = new int[MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState internalProgressStepState = MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState.f206325b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState internalProgressStepState2 = MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState.f206325b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState internalProgressStepState3 = MotivationInternalAction.ContentLoaded.InternalProgressStep.InternalProgressStepState.f206325b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public a() {
    }
}
