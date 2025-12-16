package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.dynamic_item;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: DynamicView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/dynamic_item/g;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/dynamic_item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f317990i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f317991b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f317992c;

    /* renamed from: d, reason: collision with root package name */
    public final SimpleDraweeView f317993d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f317994e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f317995f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f317996g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f317997h;

    public g(@k View view) {
        super(view);
        this.f317991b = view;
        this.f317992c = (ConstraintLayout) view.findViewById(R.id.cl_dynamic_item);
        this.f317993d = (SimpleDraweeView) view.findViewById(R.id.sdv_dynamic_item);
        this.f317994e = (TextView) view.findViewById(R.id.tv_title_dynamic_item);
        this.f317995f = (TextView) view.findViewById(R.id.tv_value_dynamic_item);
        this.f317996g = (TextView) view.findViewById(R.id.tv_address_dynamic_item);
        this.f317997h = (TextView) view.findViewById(R.id.tv_price_dynamic_item);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.dynamic_item.f
    public final void He(@k DynamicItemData dynamicItemData, @k l<? super RJ0.a, G0> lVar) {
        TextView textView;
        View view = this.f317991b;
        Context context = view.getContext();
        boolean z12 = dynamicItemData.f317982k;
        int i12 = z12 ? R.attr.warmGray54 : R.attr.black;
        int iD2 = C35835l0.d(i12, context);
        TextView textView2 = this.f317994e;
        textView2.setTextColor(iD2);
        int iD3 = C35835l0.d(i12, context);
        TextView textView3 = this.f317996g;
        textView3.setTextColor(iD3);
        int iD4 = C35835l0.d(i12, context);
        TextView textView4 = this.f317997h;
        textView4.setTextColor(iD4);
        String str = dynamicItemData.f317978g;
        boolean z13 = str == null || str.length() == 0;
        textView3.setVisibility(!z13 ? 0 : 8);
        if (z13) {
            textView = textView4;
            break;
        }
        String str2 = dynamicItemData.f317979h;
        if (str2 == null || str2.length() == 0) {
            textView = textView4;
            textView3.setText(str);
        } else {
            List<UniversalColor> list = dynamicItemData.f317980i;
            String strQ = ", ";
            if (list != null) {
                for (UniversalColor universalColor : list) {
                    strQ = r.q(strQ, "  ");
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r.r(str, strQ, str2));
            Context context2 = view.getContext();
            if (list != null) {
                Iterator it = list.iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    UniversalColor universalColor2 = (UniversalColor) next;
                    Drawable drawable = androidx.core.content.d.getDrawable(context2, R.drawable.round_metro);
                    if (drawable == null) {
                        textView = textView4;
                        break;
                    }
                    int length = (i13 * 2) + (str != null ? str.length() : 0) + 2;
                    drawable.mutate();
                    drawable.setTint(C48063a.f437606a.a(context2, universalColor2));
                    drawable.setBounds(0, -D6.i(4, context2), D6.i(8, context2), D6.i(8, context2));
                    spannableStringBuilder.setSpan(new ImageSpan(drawable), length, length + 1, 18);
                    i13 = i14;
                    it = it;
                    textView4 = textView4;
                }
            }
            textView = textView4;
            textView3.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        }
        textView2.setText(z12 ? context.getString(R.string.user_stats_dynamic_item_id) + ' ' + dynamicItemData.f317974c : dynamicItemData.f317975d);
        this.f317995f.setText(dynamicItemData.f317976e);
        textView.setText(z12 ? context.getString(R.string.user_stats_dynamic_item_deleted) : dynamicItemData.f317977f);
        ConstraintLayout constraintLayout = this.f317992c;
        if (z12 || dynamicItemData.f317983l == null) {
            constraintLayout.setOnClickListener(null);
        } else {
            constraintLayout.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(21, lVar, dynamicItemData));
        }
        C35949t5.c(this.f317993d, com.avito.android.image_loader.b.b(dynamicItemData.f317981j), androidx.core.content.d.getDrawable(context, R.drawable.ic_empty), null, null, 12);
    }
}
