package com.avito.android.suggest_locations;

import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.suggest_locations.adapter.SuggestLocationItem;
import com.avito.android.suggest_locations.analytics.FromBlock;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: SuggestLocationsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "input", "Lkotlin/G0;", "accept", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class A<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f292102b;

    public A(T t12) {
        this.f292102b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        T next;
        String str = (String) obj;
        T t12 = this.f292102b;
        if (!t12.f292174g) {
            SuggestLocationItem suggestLocationItem = t12.f292187t;
            if (suggestLocationItem == null || !str.equals(t12.f292186s)) {
                return;
            }
            String str2 = t12.f292186s;
            FromBlock fromBlock = FromBlock.f292255e;
            t12.f292169b.a(t12.f292172e, suggestLocationItem.f292214b, str2, fromBlock, t12.f292173f, t12.f292171d, t12.f292177j);
            T.c(t12, suggestLocationItem);
            return;
        }
        Iterator<T> it = t12.f292189v.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            String title = ((AddressSuggestion) next).getTitle();
            Locale locale = Locale.ROOT;
            if (title.toLowerCase(locale).equals(t12.f292186s.toLowerCase(locale))) {
                break;
            }
        }
        AddressSuggestion addressSuggestion = next;
        if (addressSuggestion != null) {
            PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType = t12.f292176i;
            if (suggestLocationsFlowType instanceof PublishIntentFactory.SuggestLocationsFlowType.SingleFlow) {
                SuggestLocationsFragment suggestLocationsFragment = t12.f292183p;
                if (suggestLocationsFragment != null) {
                    suggestLocationsFragment.I5(addressSuggestion, ((PublishIntentFactory.SuggestLocationsFlowType.SingleFlow) suggestLocationsFlowType).f231999b);
                    return;
                }
                return;
            }
            SuggestLocationsFragment suggestLocationsFragment2 = t12.f292183p;
            if (suggestLocationsFragment2 != null) {
                suggestLocationsFragment2.H5(addressSuggestion);
            }
        }
    }
}
