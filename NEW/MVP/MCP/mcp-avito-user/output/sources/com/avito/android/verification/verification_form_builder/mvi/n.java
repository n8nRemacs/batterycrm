package com.avito.android.verification.verification_form_builder.mvi;

import TM0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.verification.verification_form_builder.mvi.entity.FormBuilderInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FormBuilderOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/verification/verification_form_builder/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/verification/verification_form_builder/mvi/entity/FormBuilderInternalAction;", "LTM0/b;", "<init>", "()V", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n implements t<FormBuilderInternalAction, TM0.b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final TM0.b b(FormBuilderInternalAction formBuilderInternalAction) {
        FormBuilderInternalAction formBuilderInternalAction2 = formBuilderInternalAction;
        if (formBuilderInternalAction2 instanceof FormBuilderInternalAction.ShowToast) {
            return new b.d(((FormBuilderInternalAction.ShowToast) formBuilderInternalAction2).f325444b);
        }
        if (formBuilderInternalAction2 instanceof FormBuilderInternalAction.CloseAction) {
            return b.C1066b.f15620a;
        }
        if (formBuilderInternalAction2 instanceof FormBuilderInternalAction.BackAction) {
            return b.a.f15619a;
        }
        if (formBuilderInternalAction2 instanceof FormBuilderInternalAction.ShowSelect) {
            return new b.c(((FormBuilderInternalAction.ShowSelect) formBuilderInternalAction2).f325443b);
        }
        return null;
    }
}
