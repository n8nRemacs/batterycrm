package com.avito.android.advert.item.gig.duties;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailDutiesItemViewWithIcon.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert/item/gig/duties/a;", "Landroid/widget/LinearLayout;", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "getTextView", "()Landroid/widget/TextView;", "textView", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends LinearLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    public final TextView textView;

    public a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        LayoutInflater.from(context).inflate(R.layout.advert_details_gig_duties_item, (ViewGroup) this, true);
        this.textView = (TextView) findViewById(R.id.text_view_gig_slot_item_with_check);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(48);
    }

    @k
    public final TextView getTextView() {
        return this.textView;
    }
}
