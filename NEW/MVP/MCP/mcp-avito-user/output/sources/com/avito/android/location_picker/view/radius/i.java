package com.avito.android.location_picker.view.radius;

import Y61.k;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RadiusListItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/view/radius/i;", "Lcom/avito/android/location_picker/view/radius/g;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Chips f182795a;

    public i(@k Chips chips) {
        View viewFindViewById = chips.findViewById(R.id.chips);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        this.f182795a = (Chips) viewFindViewById;
    }
}
