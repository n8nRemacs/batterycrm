package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item;

import Y41.l;
import Y61.k;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.remote.model.Image;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: VasItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/vas_item/g;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/reports_constructor/items/vas_item/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f318136g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f318137b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f318138c;

    /* renamed from: d, reason: collision with root package name */
    public final ConstraintLayout f318139d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f318140e;

    /* renamed from: f, reason: collision with root package name */
    public final LinearLayout f318141f;

    public g(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f318137b = view;
        this.f318138c = aVar;
        this.f318139d = (ConstraintLayout) view.findViewById(R.id.cl_vas_item_total);
        this.f318140e = (TextView) view.findViewById(R.id.tv_vas_item_total);
        this.f318141f = (LinearLayout) view.findViewById(R.id.ll_vas_item_total);
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.vas_item.f
    public final void GI(@k VasItemData vasItemData, @k l<? super RJ0.a, G0> lVar) {
        TextView textView = this.f318140e;
        textView.setText(this.f318138c.c(textView.getContext(), vasItemData.f318125c));
        int i12 = vasItemData.f318126d ? R.attr.ic_arrowUp16 : R.attr.ic_arrowDown16;
        View view = this.f318137b;
        Drawable drawableH = C35835l0.h(i12, view.getContext());
        ColorStateList colorStateList = androidx.core.content.d.getColorStateList(view.getContext(), R.color.common_black);
        if (drawableH != null) {
            drawableH.setTintList(colorStateList);
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableH, (Drawable) null);
        textView.setCompoundDrawablePadding(D6.j(view, 2));
        LinearLayout linearLayout = this.f318141f;
        linearLayout.removeAllViews();
        List<Image> list = vasItemData.f318127e;
        if (list != null) {
            int i13 = 0;
            for (Object obj : list) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                Image image = (Image) obj;
                SimpleDraweeView simpleDraweeView = new SimpleDraweeView(linearLayout.getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(D6.j(view, 16), D6.j(view, 16));
                if (i13 != list.size() - 1) {
                    layoutParams.setMargins(0, 0, D6.j(view, -4), 0);
                }
                simpleDraweeView.setLayoutParams(layoutParams);
                C35949t5.c(simpleDraweeView, com.avito.android.image_loader.b.b(image), androidx.core.content.d.getDrawable(this.itemView.getContext(), R.drawable.user_stats_round_placeholder), null, null, 12);
                linearLayout.addView(simpleDraweeView);
                i13 = i14;
            }
        }
        this.f318139d.setOnClickListener(new com.avito.android.tariff.cpx.configure.levels.d(23, lVar, vasItemData));
    }
}
