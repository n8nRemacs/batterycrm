package com.avito.android.advert_core.body_condition;

import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.deep_linking.links.BodyConditionSide;
import com.avito.android.remote.model.AdvertParameters;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertDetailsCarBodyConditionParamsConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/body_condition/c;", "", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface c {
    @Y61.l
    List<AdvertParameters.Parameter> a(@Y61.l BodyCondition bodyCondition);

    @Y61.k
    ArrayList b(@Y61.k BodyConditionSide bodyConditionSide);
}
