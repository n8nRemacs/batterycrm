package com.avito.android.select.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.select.mvi.entity.SelectInternalAction;
import dq0.InterfaceC39782d;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SelectOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/select/mvi/p;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/select/mvi/entity/SelectInternalAction;", "Ldq0/d;", "<init>", "()V", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class p implements com.avito.android.arch.mvi.t<SelectInternalAction, InterfaceC39782d> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39782d b(SelectInternalAction selectInternalAction) {
        InterfaceC39782d cVar;
        SelectInternalAction selectInternalAction2 = selectInternalAction;
        if (selectInternalAction2 instanceof SelectInternalAction.RequestSearchFocus) {
            return InterfaceC39782d.b.f394130a;
        }
        if (selectInternalAction2 instanceof SelectInternalAction.HideKeyboard) {
            return InterfaceC39782d.a.f394129a;
        }
        if (selectInternalAction2 instanceof SelectInternalAction.Submit) {
            SelectInternalAction.Submit submit = (SelectInternalAction.Submit) selectInternalAction2;
            cVar = new InterfaceC39782d.C11040d(submit.f265590b, submit.f265591c);
        } else {
            if (!(selectInternalAction2 instanceof SelectInternalAction.Reset)) {
                return null;
            }
            cVar = new InterfaceC39782d.c(((SelectInternalAction.Reset) selectInternalAction2).f265589b);
        }
        return cVar;
    }
}
