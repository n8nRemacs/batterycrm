package com.avito.android.mortgage.person_form.mvi;

import com.avito.android.mortgage.api.model.SuggestionContainer;
import com.avito.android.mortgage.api.model.items.form.SuggestFormContentItemValue;
import com.avito.android.mortgage.api.model.suggestions.Suggestion;
import kotlin.Metadata;

/* compiled from: PersonFormContentUpdater.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/d;", "it", "invoke", "(Lcom/avito/android/mortgage/api/model/items/form/d;)Lcom/avito/android/mortgage/api/model/items/form/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class F extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.mortgage.api.model.items.form.d, com.avito.android.mortgage.api.model.items.form.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f200870l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SuggestionContainer<? extends Suggestion> f200871m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(H h12, SuggestionContainer<? extends Suggestion> suggestionContainer) {
        super(1);
        this.f200870l = h12;
        this.f200871m = suggestionContainer;
    }

    @Override // Y41.l
    public final com.avito.android.mortgage.api.model.items.form.d invoke(com.avito.android.mortgage.api.model.items.form.d dVar) {
        com.avito.android.mortgage.api.model.items.form.d dVar2 = dVar;
        SuggestionContainer<? extends Suggestion> suggestionContainer = this.f200871m;
        String value = suggestionContainer != null ? suggestionContainer.getValue() : null;
        Suggestion suggestionC = suggestionContainer != null ? suggestionContainer.c() : null;
        this.f200870l.getClass();
        if (!(dVar2 instanceof SuggestFormContentItemValue)) {
            return dVar2;
        }
        SuggestFormContentItemValue suggestFormContentItemValue = (SuggestFormContentItemValue) dVar2;
        if (value == null) {
            value = "";
        }
        return suggestFormContentItemValue.l(value, suggestionC, true);
    }
}
