package com.avito.android.important_addresses_selection.presentation.mvi;

import com.avito.android.J0;
import com.avito.android.R;
import com.avito.android.important_addresses_selection.domain.model.ImportantAddressesSelectionData;
import com.avito.android.important_addresses_selection.presentation.items.additionalButton.ImportantAddressesSelectionAdditionalActionItem;
import com.avito.android.important_addresses_selection.presentation.items.address.ImportantAddressesSelectionAddressItem;
import com.avito.android.important_addresses_selection.presentation.items.constraintWarning.ImportantAddressesSelectionConstraintWarningItem;
import com.avito.android.remote.model.text.AttributedText;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ImportantAddressesSelectionViewStateBuilder.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses_selection/presentation/mvi/o;", "Lcom/avito/android/important_addresses_selection/presentation/mvi/n;", "_avito_important-addresses-selection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final J0 f169897a;

    @Inject
    public o(@Y61.k J0 j02) {
        this.f169897a = j02;
    }

    @Override // com.avito.android.important_addresses_selection.presentation.mvi.n
    @Y61.k
    public final SM.c a(@Y61.k SM.c cVar) {
        ArrayList arrayList = new ArrayList();
        ImportantAddressesSelectionData importantAddressesSelectionData = cVar.f14930b;
        String str = importantAddressesSelectionData.f169761c;
        J0 j02 = this.f169897a;
        if (str != null) {
            arrayList.add(new ImportantAddressesSelectionConstraintWarningItem(String.valueOf(j02.a()), str));
        }
        for (ImportantAddressesSelectionData.Address address : (Iterable) importantAddressesSelectionData.f169762d) {
            arrayList.add(new ImportantAddressesSelectionAddressItem(address.f169776b, String.valueOf(j02.a()), address.f169777c, address.f169778d, address.f169779e, address.f169780f));
        }
        String strValueOf = String.valueOf(j02.a());
        ImportantAddressesSelectionData.AdditionalAction additionalAction = importantAddressesSelectionData.f169764f;
        AttributedText attributedText = additionalAction.f169767b;
        ImportantAddressesSelectionData.AdditionalAction.Button button = additionalAction.f169768c;
        String str2 = button.f169770c;
        ImportantAddressesSelectionData.AdditionalAction.Button.ButtonType buttonType = ImportantAddressesSelectionData.AdditionalAction.Button.ButtonType.f169772b;
        ImportantAddressesSelectionData.AdditionalAction.Button.ButtonType buttonType2 = button.f169769b;
        arrayList.add(new ImportantAddressesSelectionAdditionalActionItem(strValueOf, attributedText, str2, buttonType2 == buttonType ? Integer.valueOf(R.attr.ic_addThin16) : null, buttonType2 == ImportantAddressesSelectionData.AdditionalAction.Button.ButtonType.f169773c ? Integer.valueOf(R.attr.ic_arrowRight16) : null, button.f169771d));
        return SM.c.a(cVar, null, new SM.d(arrayList), 1);
    }
}
