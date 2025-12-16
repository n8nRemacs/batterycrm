package com.avito.android.advert.item.abuse;

import Y61.k;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details.AdvertDetailsStyle;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAbuseView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/abuse/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/abuse/f;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f72526b;

    public g(@k View view) {
        super(view);
        this.f72526b = view.findViewById(R.id.btn_abuse);
    }

    @Override // com.avito.android.advert.item.abuse.f
    public final void U8(@k View.OnClickListener onClickListener) {
        this.f72526b.setOnClickListener(onClickListener);
    }

    @Override // com.avito.android.advert.item.abuse.f
    public final void ws(@k AdvertDetailsStyle advertDetailsStyle) {
        com.avito.android.advert.advert_details_style.b bVarA = com.avito.android.advert.advert_details_style.c.a(advertDetailsStyle);
        bVarA.f68635d.invoke(this.f72526b);
    }
}
