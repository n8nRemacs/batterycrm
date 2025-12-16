package com.avito.android.extended_profile_universal_widget_edit.create.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.extended_profile_universal_widget_edit.create.mvi.entity.UniversalWidgetCreateInternalAction;
import hB.InterfaceC40799b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: UniversalWidgetCreateOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/extended_profile_universal_widget_edit/create/mvi/entity/UniversalWidgetCreateInternalAction;", "LhB/b;", "<init>", "()V", "_avito_extended-profile-universal-widget-edit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class h implements t<UniversalWidgetCreateInternalAction, InterfaceC40799b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40799b b(UniversalWidgetCreateInternalAction universalWidgetCreateInternalAction) {
        UniversalWidgetCreateInternalAction universalWidgetCreateInternalAction2 = universalWidgetCreateInternalAction;
        if (universalWidgetCreateInternalAction2 instanceof UniversalWidgetCreateInternalAction.Error) {
            UniversalWidgetCreateInternalAction.Error error = (UniversalWidgetCreateInternalAction.Error) universalWidgetCreateInternalAction2;
            return new InterfaceC40799b.c(error.f153760b, error.f153761c);
        }
        if (universalWidgetCreateInternalAction2 instanceof UniversalWidgetCreateInternalAction.Success) {
            UniversalWidgetCreateInternalAction.Success success = (UniversalWidgetCreateInternalAction.Success) universalWidgetCreateInternalAction2;
            return new InterfaceC40799b.C11246b(success.f153764b, success.f153765c);
        }
        if (universalWidgetCreateInternalAction2 instanceof UniversalWidgetCreateInternalAction.Close) {
            return InterfaceC40799b.a.f397094a;
        }
        if (universalWidgetCreateInternalAction2 instanceof UniversalWidgetCreateInternalAction.IncorrectValues) {
            return new InterfaceC40799b.d();
        }
        if (universalWidgetCreateInternalAction2 instanceof UniversalWidgetCreateInternalAction.InitState ? true : universalWidgetCreateInternalAction2 instanceof UniversalWidgetCreateInternalAction.Loading) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
