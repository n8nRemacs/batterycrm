package com.avito.android.suggest_locations;

import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.publish.PublishIntentFactory;
import kotlin.Metadata;

/* compiled from: SuggestLocationsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class I<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T f292110b;

    public I(T t12) {
        this.f292110b = t12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        AddressSuggestion addressSuggestion = (AddressSuggestion) obj;
        AddressSuggestion.SuggestType suggestType = addressSuggestion.getSuggestType();
        AddressSuggestion.SuggestType suggestType2 = AddressSuggestion.SuggestType.HISTORICAL;
        T t12 = this.f292110b;
        if (suggestType == suggestType2) {
            SuggestLocationsFragment suggestLocationsFragment = t12.f292183p;
            if (suggestLocationsFragment != null) {
                suggestLocationsFragment.E5(addressSuggestion);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.L.f(t12.f292176i, PublishIntentFactory.SuggestLocationsFlowType.DefaultNoMap.f231996b)) {
            SuggestLocationsFragment suggestLocationsFragment2 = t12.f292183p;
            if (suggestLocationsFragment2 != null) {
                suggestLocationsFragment2.E5(addressSuggestion);
                return;
            }
            return;
        }
        PublishIntentFactory.SuggestLocationsFlowType.Region region = PublishIntentFactory.SuggestLocationsFlowType.Region.f231998b;
        PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType = t12.f292176i;
        if (kotlin.jvm.internal.L.f(suggestLocationsFlowType, region)) {
            SuggestLocationsFragment suggestLocationsFragment3 = t12.f292183p;
            if (suggestLocationsFragment3 != null) {
                suggestLocationsFragment3.E5(addressSuggestion);
                return;
            }
            return;
        }
        if (suggestLocationsFlowType instanceof PublishIntentFactory.SuggestLocationsFlowType.SingleFlow) {
            SuggestLocationsFragment suggestLocationsFragment4 = t12.f292183p;
            if (suggestLocationsFragment4 != null) {
                suggestLocationsFragment4.I5(addressSuggestion, ((PublishIntentFactory.SuggestLocationsFlowType.SingleFlow) suggestLocationsFlowType).f231999b);
                return;
            }
            return;
        }
        SuggestLocationsFragment suggestLocationsFragment5 = t12.f292183p;
        if (suggestLocationsFragment5 != null) {
            suggestLocationsFragment5.H5(addressSuggestion);
        }
    }
}
