package com.avito.android.user_adverts_views_util;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m.C43852a;

/* compiled from: CpxPromoWidgetView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_views_util/CpxPromoWidgetView;", "Landroid/widget/LinearLayout;", "_avito_user-adverts-views_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CpxPromoWidgetView extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f316737e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SimpleDraweeView f316738b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f316739c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f316740d;

    @j
    public CpxPromoWidgetView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public CpxPromoWidgetView(Context context, AttributeSet attributeSet, int i12, int i13, int i14, C42822w c42822w) {
        super(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i12, (i14 & 8) != 0 ? 0 : i13);
        int iB2 = y6.b(4);
        int iB3 = y6.b(8);
        LayoutInflater.from(getContext()).inflate(R.layout.user_adverts_views_util_cpx_promo_widget_view, (ViewGroup) this, true);
        setOrientation(0);
        setBackground(C43852a.a(context, R.drawable.user_adverts_views_util_widget_bg));
        setClipToOutline(true);
        setPadding(iB2, 0, iB3, 0);
        this.f316738b = (SimpleDraweeView) findViewById(R.id.cpx_promo_widget_image);
        this.f316739c = (TextView) findViewById(R.id.cpx_promo_widget_text);
        TextView textView = (TextView) findViewById(R.id.cpx_promo_widget_chevron);
        this.f316740d = textView;
        FV.a.f4720a.getClass();
        textView.setText(FV.a.b(R.attr.textIconChevronRight, context));
    }
}
