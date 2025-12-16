package com.avito.android.advert.item.advertnumber;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.util.I5;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsAdvertNumberView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/advertnumber/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/advertnumber/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f72725b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f72726c;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.advert_number);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f72725b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.advert_stats);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f72726c = (TextView) viewFindViewById2;
    }

    @Override // com.avito.android.advert.item.advertnumber.f
    public final void IJ(@l String str) {
        I5.a(this.f72726c, str, false);
    }

    @Override // com.avito.android.advert.item.advertnumber.f
    public final void SF(@k String str) {
        I5.a(this.f72725b, str, false);
    }
}
