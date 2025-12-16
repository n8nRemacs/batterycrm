package com.avito.android.advert_core.equipments.redesign;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RedesignedEquipmentsOptionViewFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/j;", "Lcom/avito/android/advert_core/equipments/redesign/i;", "<init>", "()V", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements i {
    @Inject
    public j() {
    }

    @Override // com.avito.android.advert_core.equipments.redesign.i
    @Y61.k
    public final TextView a(@Y61.k CharSequence charSequence, @Y61.k LayoutInflater layoutInflater, @Y61.k ViewGroup viewGroup) {
        TextView textView = (TextView) layoutInflater.inflate(R.layout.redesigned_equipments_block_option, viewGroup, false);
        textView.setText(charSequence);
        return textView;
    }
}
