package com.avito.android.auto_select.contact_me.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.auto_select.contact_me.model.AutoSelectContactMeBottomSheetOpenArguments;
import com.avito.android.auto_select.contact_me.mvi.entity.AutoSelectContactMeInternalAction;
import gf.C40672c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutoSelectContactMeReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/auto_select/contact_me/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/auto_select/contact_me/mvi/entity/AutoSelectContactMeInternalAction;", "Lgf/c;", "<init>", "()V", "_avito_auto-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k implements u<AutoSelectContactMeInternalAction, C40672c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C40672c a(AutoSelectContactMeInternalAction autoSelectContactMeInternalAction, C40672c c40672c) {
        AutoSelectContactMeInternalAction autoSelectContactMeInternalAction2 = autoSelectContactMeInternalAction;
        C40672c c40672c2 = c40672c;
        if (!(autoSelectContactMeInternalAction2 instanceof AutoSelectContactMeInternalAction.Init)) {
            return autoSelectContactMeInternalAction2 instanceof AutoSelectContactMeInternalAction.ContactClicked ? new C40672c(c40672c2.f396674b, c40672c2.f396675c, ((AutoSelectContactMeInternalAction.ContactClicked) autoSelectContactMeInternalAction2).f96006b) : c40672c2;
        }
        AutoSelectContactMeBottomSheetOpenArguments autoSelectContactMeBottomSheetOpenArguments = ((AutoSelectContactMeInternalAction.Init) autoSelectContactMeInternalAction2).f96008b;
        return new C40672c(autoSelectContactMeBottomSheetOpenArguments.f95988c, autoSelectContactMeBottomSheetOpenArguments.f95990e, null, 4, null);
    }
}
