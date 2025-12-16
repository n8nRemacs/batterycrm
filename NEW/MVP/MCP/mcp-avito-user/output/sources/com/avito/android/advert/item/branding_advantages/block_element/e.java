package com.avito.android.advert.item.branding_advantages.block_element;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.fresco.SimpleDraweeView;
import kotlin.Metadata;

/* compiled from: BrandingAdvantagesBlockElementItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/branding_advantages/block_element/e;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f74208b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f74209c;

    /* renamed from: d, reason: collision with root package name */
    public final SimpleDraweeView f74210d;

    public e(@k View view) {
        super(view);
        this.f74208b = view;
        this.f74209c = (TextView) view.findViewById(R.id.branding_advantages_element_title);
        this.f74210d = (SimpleDraweeView) view.findViewById(R.id.branding_advantages_icon);
    }
}
