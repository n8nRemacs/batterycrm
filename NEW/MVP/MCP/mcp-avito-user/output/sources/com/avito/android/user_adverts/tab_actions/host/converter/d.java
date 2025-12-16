package com.avito.android.user_adverts.tab_actions.host.converter;

import Y61.k;
import Y61.l;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: UserAdvertSelectedActionsConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/converter/d;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface d {
    @k
    ArrayList a(@k UserAdvertsGroupData userAdvertsGroupData, @k String str, @k UserAdvertActionsInfoDomain userAdvertActionsInfoDomain, @l UserAdvertActionType userAdvertActionType);

    @k
    ArrayList b(@l UserAdvertActionType userAdvertActionType, @k AvailableActionsDomain availableActionsDomain, @k String str);
}
