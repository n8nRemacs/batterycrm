package com.avito.android.mortgage.person_form.suggestion;

import H00.a;
import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SuggestionFragment.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/mortgage/api/model/SuggestionContainer;", "Lcom/avito/android/mortgage/api/model/suggestions/Suggestion;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/mortgage/api/model/SuggestionContainer;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.mortgage.person_form.suggestion.h, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32674h extends N implements Y41.l<SuggestionContainer<? extends Suggestion>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SuggestionFragment f201402l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32674h(SuggestionFragment suggestionFragment) {
        super(1);
        this.f201402l = suggestionFragment;
    }

    @Override // Y41.l
    public final G0 invoke(SuggestionContainer<? extends Suggestion> suggestionContainer) {
        ((I) this.f201402l.f201355o0.getValue()).accept(new a.C0392a(suggestionContainer));
        return G0.f406611a;
    }
}
