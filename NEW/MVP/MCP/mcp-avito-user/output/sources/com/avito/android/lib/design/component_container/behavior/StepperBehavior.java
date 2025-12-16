package com.avito.android.lib.design.component_container.behavior;

import Y61.k;
import android.content.Context;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.stepper.Stepper;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StepperBehavior.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/lib/design/component_container/behavior/StepperBehavior;", "Lcom/avito/android/lib/design/component_container/a;", "Lcom/avito/android/lib/design/stepper/Stepper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/avito/android/lib/design/component_container/ComponentContainer$State;", VoiceInfo.STATE, "Lkotlin/G0;", "onStateChanged", "(Lcom/avito/android/lib/design/component_container/ComponentContainer$State;)V", "view", "onAttachView", "(Lcom/avito/android/lib/design/stepper/Stepper;)V", "onDetachView", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class StepperBehavior extends com.avito.android.lib.design.component_container.a<Stepper> {

    /* compiled from: StepperBehavior.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ComponentContainer.State.values().length];
            try {
                iArr[ComponentContainer.State.f178866c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComponentContainer.State.f178868e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComponentContainer.State.f178867d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public StepperBehavior(@k Context context) {
        super(context);
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onAttachView(@k Stepper view) {
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onDetachView(@k Stepper view) {
    }

    @Override // com.avito.android.lib.design.component_container.a
    public void onStateChanged(@k ComponentContainer.State state) {
        Stepper.State state2;
        Stepper view;
        int iOrdinal = state.ordinal();
        if (iOrdinal == 0) {
            state2 = Stepper.State.f180596c;
        } else if (iOrdinal == 1) {
            state2 = null;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            state2 = Stepper.State.f180597d;
        }
        if (state2 == null || (view = getView()) == null) {
            return;
        }
        view.setCurrentState(state2);
    }
}
