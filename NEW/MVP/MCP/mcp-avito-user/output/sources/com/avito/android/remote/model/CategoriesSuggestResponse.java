package com.avito.android.remote.model;

import Y61.k;
import Y61.l;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: CategoriesSuggestResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0006R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/model/CategoriesSuggestResponse;", "", "suggests", "", "Lcom/avito/android/remote/model/WizardParameter;", "selectedCategory", "(Ljava/util/List;Lcom/avito/android/remote/model/WizardParameter;)V", "getSelectedCategory", "()Lcom/avito/android/remote/model/WizardParameter;", "getSuggests", "()Ljava/util/List;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CategoriesSuggestResponse {

    @c("selectedCategory")
    @l
    private final WizardParameter selectedCategory;

    @c("list")
    @k
    private final List<WizardParameter> suggests;

    public CategoriesSuggestResponse(@k List<WizardParameter> list, @l WizardParameter wizardParameter) {
        this.suggests = list;
        this.selectedCategory = wizardParameter;
    }

    @l
    public final WizardParameter getSelectedCategory() {
        return this.selectedCategory;
    }

    @k
    public final List<WizardParameter> getSuggests() {
        return this.suggests;
    }
}
