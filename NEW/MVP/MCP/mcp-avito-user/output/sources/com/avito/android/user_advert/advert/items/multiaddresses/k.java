package com.avito.android.user_advert.advert.items.multiaddresses;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.user_address.CompositeLocationTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: MultiAddressSingleItemView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/k;", "Landroid/widget/LinearLayout;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends LinearLayout {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f309742b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CompositeLocationTextView f309743c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f309744d;

    public k(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.my_advert_multiaddress_single_item, (ViewGroup) this, true);
        this.f309742b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.address);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.user_address.CompositeLocationTextView");
        }
        CompositeLocationTextView compositeLocationTextView = (CompositeLocationTextView) viewFindViewById;
        compositeLocationTextView.a(R.attr.textM20, R.attr.black);
        this.f309743c = compositeLocationTextView;
        View viewFindViewById2 = viewInflate.findViewById(R.id.details);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f309744d = (TextView) viewFindViewById2;
    }
}
