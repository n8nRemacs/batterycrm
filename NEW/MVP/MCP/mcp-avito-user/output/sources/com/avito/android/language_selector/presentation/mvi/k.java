package com.avito.android.language_selector.presentation.mvi;

import androidx.compose.runtime.internal.P;
import androidx.core.os.q;
import com.avito.android.arch.mvi.u;
import com.avito.android.language_selector.presentation.Language;
import com.avito.android.language_selector.presentation.mvi.entity.LanguageSelectorInternalAction;
import eR.C40040a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: LanguageSelectorReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/language_selector/presentation/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/language_selector/presentation/mvi/entity/LanguageSelectorInternalAction;", "LeR/d;", "_avito-global_language-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class k implements u<LanguageSelectorInternalAction, eR.d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.language_selector.presentation.b f174998b;

    @Inject
    public k(@Y61.k com.avito.android.language_selector.presentation.b bVar) {
        this.f174998b = bVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final eR.d a(LanguageSelectorInternalAction languageSelectorInternalAction, eR.d dVar) {
        LanguageSelectorInternalAction languageSelectorInternalAction2 = languageSelectorInternalAction;
        eR.d dVar2 = dVar;
        if (languageSelectorInternalAction2 instanceof LanguageSelectorInternalAction.Init) {
            LanguageSelectorInternalAction.Init init = (LanguageSelectorInternalAction.Init) languageSelectorInternalAction2;
            Locale locale = init.f174981c;
            this.f174998b.getClass();
            Language languageA = com.avito.android.language_selector.presentation.b.a(locale);
            ArrayList arrayList = new ArrayList();
            q qVar = init.f174980b;
            if (!qVar.c()) {
                int iD2 = qVar.d();
                for (int i12 = 0; i12 < iD2; i12++) {
                    Locale localeB = qVar.b(i12);
                    if (localeB != null) {
                        arrayList.add(localeB);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Locale locale2 = (Locale) it.next();
                new com.avito.android.language_selector.presentation.b();
                arrayList2.add(com.avito.android.language_selector.presentation.b.a(locale2));
            }
            return new eR.d(languageA, languageA, eR.e.a(dVar2.f395196d, arrayList2, false, null, languageA, 6));
        }
        boolean z12 = languageSelectorInternalAction2 instanceof LanguageSelectorInternalAction.SelectLanguage;
        Language language = dVar2.f395194b;
        if (z12) {
            Language language2 = ((LanguageSelectorInternalAction.SelectLanguage) languageSelectorInternalAction2).f174985b;
            return eR.d.a(dVar2, language2, eR.e.a(dVar2.f395196d, null, language != language2, null, language2, 5), 1);
        }
        boolean z13 = languageSelectorInternalAction2 instanceof LanguageSelectorInternalAction.SaveNewLanguage.Success;
        eR.e eVar = dVar2.f395196d;
        if (z13) {
            LanguageSelectorInternalAction.SaveNewLanguage.Success success = (LanguageSelectorInternalAction.SaveNewLanguage.Success) languageSelectorInternalAction2;
            eVar.f395199c.getClass();
            eR.e eVarA = eR.e.a(eVar, null, false, new C40040a(false, ""), success.f174984b, 1);
            Language language3 = success.f174984b;
            return new eR.d(language3, language3, eVarA);
        }
        if (!(languageSelectorInternalAction2 instanceof LanguageSelectorInternalAction.ShowSelectLanguageConfirmationDialog)) {
            return dVar2;
        }
        C40040a c40040a = eVar.f395199c;
        LanguageSelectorInternalAction.ShowSelectLanguageConfirmationDialog showSelectLanguageConfirmationDialog = (LanguageSelectorInternalAction.ShowSelectLanguageConfirmationDialog) languageSelectorInternalAction2;
        String strA = language != null ? language.a() : null;
        boolean z14 = showSelectLanguageConfirmationDialog.f174986b;
        if (!z14) {
            strA = null;
        }
        String str = strA != null ? strA : "";
        c40040a.getClass();
        return eR.d.a(dVar2, null, eR.e.a(eVar, null, false, new C40040a(z14, str), null, 11), 3);
    }
}
