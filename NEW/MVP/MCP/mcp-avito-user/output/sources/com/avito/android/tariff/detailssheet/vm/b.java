package com.avito.android.tariff.detailssheet.vm;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.remote.model.text.AttributedText;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TariffDetailsSheetConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/tariff/detailssheet/vm/b;", "Lcom/avito/android/tariff/detailssheet/vm/a;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.tariff.detailssheet.vm.a
    @Y61.k
    public final d a(@Y61.k XB0.a aVar) {
        AttributedText description = aVar.getDescription();
        DetailsSheetButton button = aVar.getButton();
        return new d(description, button != null ? button.getTitle() : null);
    }
}
