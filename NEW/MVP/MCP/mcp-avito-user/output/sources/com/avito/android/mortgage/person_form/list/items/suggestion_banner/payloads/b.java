package com.avito.android.mortgage.person_form.list.items.suggestion_banner.payloads;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.suggestion_banner.SuggestionBannerItem;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SuggestBannerPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/suggestion_banner/payloads/b;", "LA00/c;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements A00.c {
    @Inject
    public b() {
    }

    @Override // A00.c
    @l
    public final Object a(@k PersonFormItem personFormItem, @k PersonFormItem personFormItem2) {
        if ((personFormItem instanceof SuggestionBannerItem) && (personFormItem2 instanceof SuggestionBannerItem) && !personFormItem.equals(personFormItem2)) {
            return Collections.singletonList(new a((SuggestionBannerItem) personFormItem2));
        }
        return null;
    }
}
