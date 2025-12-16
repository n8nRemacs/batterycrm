package com.avito.android.beduin_shared.model.component.serp;

import Y61.l;
import com.avito.android.beduin_models.BeduinModel;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PhoneButtonModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/model/component/serp/PhoneButtonModel;", "Lcom/avito/android/beduin_models/BeduinModel;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface PhoneButtonModel extends BeduinModel {

    /* compiled from: PhoneButtonModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @l
    String findCallDeeplinkAsString();

    void setListener(@l Y41.a<G0> aVar);
}
