package com.avito.android.language_selector.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.language_selector.presentation.mvi.entity.LanguageSelectorInternalAction;
import eR.InterfaceC40042c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LanguageSelectorOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction;", "LeR/c;", "<init>", "()V", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements t<LanguageSelectorInternalAction, InterfaceC40042c> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40042c b(LanguageSelectorInternalAction languageSelectorInternalAction) {
        LanguageSelectorInternalAction languageSelectorInternalAction2 = languageSelectorInternalAction;
        if (languageSelectorInternalAction2 instanceof LanguageSelectorInternalAction.BackButtonClickHappened) {
            return InterfaceC40042c.a.f395190a;
        }
        if (!(languageSelectorInternalAction2 instanceof LanguageSelectorInternalAction.SaveNewLanguage.Failed)) {
            return null;
        }
        String message = ((LanguageSelectorInternalAction.SaveNewLanguage.Failed) languageSelectorInternalAction2).f174982b.getMessage();
        if (message == null) {
            message = "";
        }
        return new InterfaceC40042c.b(message);
    }
}
