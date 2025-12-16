package com.avito.android.travel_guest_profile.domain.converters;

import com.avito.android.remote.model.Color;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35787f0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: TravelGuestProfileResponseConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/travel_guest_profile/domain/converters/q;", "", "<init>", "()V", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q {
    @Inject
    public q() {
    }

    public static UniversalColor a(ME0.e eVar) {
        Integer numA;
        Integer numA2;
        String value = eVar.getValue();
        Color color = (value == null || (numA2 = C35787f0.a(value)) == null) ? null : new Color(numA2.intValue());
        String valueDark = eVar.getValueDark();
        return new UniversalColor(null, (valueDark == null || (numA = C35787f0.a(valueDark)) == null) ? null : new Color(numA.intValue()), color);
    }
}
