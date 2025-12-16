package com.avito.android.advert.item.select.teaser;

import Y61.k;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutoTeaserBenefitsBinder.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/teaser/h;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f79656a;

    /* renamed from: b, reason: collision with root package name */
    public final LayoutInflater f79657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f79658c = R.layout.auto_select_teaser_benefit_title;

    /* renamed from: d, reason: collision with root package name */
    public final int f79659d = R.layout.auto_select_teaser_benefit_description;

    public h(@k ViewGroup viewGroup) {
        this.f79656a = viewGroup;
        this.f79657b = LayoutInflater.from(viewGroup.getContext());
    }
}
