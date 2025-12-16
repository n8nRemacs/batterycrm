package com.avito.android.language_selector.presentation.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.language_selector.presentation.Language;
import com.avito.android.language_selector.presentation.mvi.entity.LanguageSelectorInternalAction;
import eR.InterfaceC40041b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: LanguageSelectorActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LeR/b;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction;", "LeR/d;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40041b, LanguageSelectorInternalAction, eR.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.language_selector.domain.a f174970a;

    @Inject
    public b(@Y61.k com.avito.android.language_selector.domain.a aVar) {
        this.f174970a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<LanguageSelectorInternalAction> b(InterfaceC40041b interfaceC40041b, eR.d dVar) {
        C43210w c43210w;
        InterfaceC43160i<LanguageSelectorInternalAction> interfaceC43160iG;
        InterfaceC40041b interfaceC40041b2 = interfaceC40041b;
        eR.d dVar2 = dVar;
        if (interfaceC40041b2 instanceof InterfaceC40041b.d) {
            interfaceC43160iG = new C43210w(new LanguageSelectorInternalAction.SelectLanguage(((InterfaceC40041b.d) interfaceC40041b2).f395188a));
        } else {
            if (interfaceC40041b2.equals(InterfaceC40041b.a.f395185a)) {
                c43210w = new C43210w(LanguageSelectorInternalAction.BackButtonClickHappened.f174979b);
            } else if (interfaceC40041b2.equals(InterfaceC40041b.e.f395189a)) {
                c43210w = new C43210w(new LanguageSelectorInternalAction.ShowSelectLanguageConfirmationDialog(true));
            } else if (interfaceC40041b2.equals(InterfaceC40041b.C11081b.f395186a)) {
                Language language = dVar2.f395195c;
                if (language == null) {
                    return new C43207v(new LanguageSelectorInternalAction[0]);
                }
                interfaceC43160iG = C43175k.G(new a(this, language, null));
            } else {
                if (!interfaceC40041b2.equals(InterfaceC40041b.c.f395187a)) {
                    throw new NoWhenBranchMatchedException();
                }
                c43210w = new C43210w(new LanguageSelectorInternalAction.ShowSelectLanguageConfirmationDialog(false));
            }
            interfaceC43160iG = c43210w;
        }
        return interfaceC43160iG;
    }
}
