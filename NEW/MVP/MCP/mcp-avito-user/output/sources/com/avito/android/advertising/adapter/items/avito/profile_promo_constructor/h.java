package com.avito.android.advertising.adapter.items.avito.profile_promo_constructor;

import Ca1.ViewOnClickListenerC13236c;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.view.View;
import com.avito.android.advertising.loaders.avito_targeting.AvitoNetworkBanner;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ProfilePromoConstructorViewHolder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/profile_promo_constructor/h;", "LTV0/e;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface h extends TV0.e {

    /* compiled from: ProfilePromoConstructorViewHolder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void FY(@k ViewOnClickListenerC13236c viewOnClickListenerC13236c);

    void N7();

    void Xa(boolean z12);

    void d(@l Y41.a<G0> aVar);

    @k
    /* renamed from: getView */
    View getF87203b();

    void h(@k String str);

    void j1(@l Uri uri);

    void setOnClickListener(@k View.OnClickListener onClickListener);

    void setTitle(@k String str);

    void vG(@l AvitoNetworkBanner.MarkInfo markInfo);
}
