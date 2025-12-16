package com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.logic.processing.appearance.screen;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacActionProcessing;
import com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.utils.b;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenArgument;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OnScreenArgumentWithoutActionAction.kt */
@P
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/appearance/screen/OnScreenArgumentWithoutActionAction;", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacAction;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction;", "argument", "<init>", "(Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction;)V", "Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;", "Lkotlin/G0;", "process", "(Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/core/IacActionProcessing;)V", "component1", "()Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction;", "copy", "(Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction;)Lcom/avito/android/iac_dialer/impl_module/active_call_processing/iac_dialer/logic/processing/appearance/screen/OnScreenArgumentWithoutActionAction;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/IacCallScreenArgument$WithoutAction;", "getArgument", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class OnScreenArgumentWithoutActionAction implements IacAction {
    public static final int $stable = 0;

    @k
    private final IacCallScreenArgument.WithoutAction argument;

    public OnScreenArgumentWithoutActionAction(@k IacCallScreenArgument.WithoutAction withoutAction) {
        this.argument = withoutAction;
    }

    public static /* synthetic */ OnScreenArgumentWithoutActionAction copy$default(OnScreenArgumentWithoutActionAction onScreenArgumentWithoutActionAction, IacCallScreenArgument.WithoutAction withoutAction, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            withoutAction = onScreenArgumentWithoutActionAction.argument;
        }
        return onScreenArgumentWithoutActionAction.copy(withoutAction);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final IacCallScreenArgument.WithoutAction getArgument() {
        return this.argument;
    }

    @k
    public final OnScreenArgumentWithoutActionAction copy(@k IacCallScreenArgument.WithoutAction argument) {
        return new OnScreenArgumentWithoutActionAction(argument);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OnScreenArgumentWithoutActionAction) && L.f(this.argument, ((OnScreenArgumentWithoutActionAction) other).argument);
    }

    @k
    public final IacCallScreenArgument.WithoutAction getArgument() {
        return this.argument;
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    @k
    public String getName() {
        return b.a.a(this);
    }

    public int hashCode() {
        return this.argument.hashCode();
    }

    @k
    public String toString() {
        return "OnScreenArgumentWithoutActionAction(argument=" + this.argument + ')';
    }

    @Override // com.avito.android.iac_dialer.impl_module.active_call_processing.iac_dialer.core.IacAction
    public void process(@k IacActionProcessing iacActionProcessing) {
    }
}
