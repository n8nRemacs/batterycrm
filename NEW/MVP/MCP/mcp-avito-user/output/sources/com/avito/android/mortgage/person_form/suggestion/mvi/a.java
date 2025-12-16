package com.avito.android.mortgage.person_form.suggestion.mvi;

import H00.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.items.form.SuggestFormSuggestType;
import com.avito.android.mortgage.api.model.suggestions.FioSuggestion;
import com.avito.android.mortgage.api.model.suggestions.OrganizationSuggestion;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import com.avito.android.mortgage.person_form.suggestion.mvi.entity.SuggestionInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;
import kotlin.text.InterfaceC43057n;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SuggestionActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage/person_form/suggestion/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LH00/a;", "Lcom/avito/android/mortgage/person_form/suggestion/mvi/entity/SuggestionInternalAction;", "LH00/c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<H00.a, SuggestionInternalAction, H00.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.mortgage.person_form.suggestion.mvi.domain.b f201420a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public N0 f201421b;

    /* compiled from: SuggestionActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.person_form.suggestion.mvi.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C5968a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201422a;

        static {
            int[] iArr = new int[SuggestFormSuggestType.values().length];
            try {
                iArr[SuggestFormSuggestType.FULL_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuggestFormSuggestType.ORGANIZATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuggestFormSuggestType.FMS_UNIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SuggestFormSuggestType.ADDRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f201422a = iArr;
        }
    }

    @Inject
    public a(@Y61.k com.avito.android.mortgage.person_form.suggestion.mvi.domain.b bVar) {
        this.f201420a = bVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<SuggestionInternalAction> b(H00.a aVar, H00.c cVar) {
        C43210w c43210w;
        H00.a aVar2 = aVar;
        H00.c cVar2 = cVar;
        suggestionContainer = null;
        SuggestionContainer<? extends Suggestion> suggestionContainer = null;
        if (aVar2 instanceof a.C0392a) {
            return C43175k.h(new b(aVar2, cVar2, this, null));
        }
        boolean z12 = aVar2 instanceof a.b;
        SuggestionContainer<? extends Suggestion> suggestionContainer2 = cVar2.f6920h;
        String str = cVar2.f6916d;
        String str2 = cVar2.f6914b;
        if (z12) {
            c43210w = new C43210w(new SuggestionInternalAction.BackClicked(str2, str, suggestionContainer2));
        } else {
            if (!(aVar2 instanceof a.c)) {
                if (aVar2 instanceof a.d) {
                    return C43175k.h(new c(aVar2, cVar2, this, null));
                }
                throw new NoWhenBranchMatchedException();
            }
            if (suggestionContainer2 == null) {
                int i12 = C5968a.f201422a[cVar2.f6918f.ordinal()];
                if (i12 == 1) {
                    List listF0 = C43066x.f0(str, new String[]{" "}, 3, 2);
                    String str3 = (String) C42745f0.K(0, listF0);
                    String str4 = str3 == null ? "" : str3;
                    String str5 = (String) C42745f0.K(1, listF0);
                    String str6 = str5 == null ? "" : str5;
                    String str7 = (String) C42745f0.K(2, listF0);
                    suggestionContainer = new SuggestionContainer<>(new FioSuggestion(str6, str7 == null ? "" : str7, str4, false, 8, null), str);
                } else if (i12 == 2) {
                    com.avito.android.mortgage.person_form.suggestion.mvi.domain.a.f201447a.getClass();
                    String strA0 = C43066x.a0(str, ",", "", false);
                    C43059p c43059p = com.avito.android.mortgage.person_form.suggestion.mvi.domain.a.f201448b;
                    InterfaceC43057n interfaceC43057nB = C43059p.b(c43059p, strA0);
                    String value = interfaceC43057nB != null ? interfaceC43057nB.getValue() : null;
                    suggestionContainer = new SuggestionContainer<>(new OrganizationSuggestion(value == null ? "" : value, null, "", "", C43066x.A0(c43059p.f(strA0, "")).toString(), "", ""), str);
                } else if (i12 != 3 && i12 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                suggestionContainer2 = suggestionContainer;
            }
            c43210w = new C43210w(new SuggestionInternalAction.FillByHandsClicked(str2, suggestionContainer2));
        }
        return c43210w;
    }
}
