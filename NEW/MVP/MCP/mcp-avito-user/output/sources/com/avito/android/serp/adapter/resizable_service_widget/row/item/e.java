package com.avito.android.serp.adapter.resizable_service_widget.row.item;

import Y61.l;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.di.B;
import com.avito.android.fresco.SimpleDraweeView;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.search.filter.adapter.select.m;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.text.C43066x;

/* compiled from: ResizableServiceWidgetRowPresenter.kt */
@B
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/resizable_service_widget/row/item/e;", "LTV0/d;", "Lcom/avito/android/serp/adapter/resizable_service_widget/row/item/g;", "Lcom/avito/android/serp/adapter/resizable_service_widget/row/item/ResizableServiceWidgetRowItem;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements TV0.d<g, ResizableServiceWidgetRowItem> {

    /* renamed from: b, reason: collision with root package name */
    @l
    public Y41.l<? super ResizableServiceWidgetRowListItem, G0> f270745b;

    @Inject
    public e() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Integer numA;
        Integer numA2;
        g gVar = (g) eVar;
        d dVar = new d(this);
        LinearLayout linearLayout = gVar.f270748b;
        linearLayout.removeAllViews();
        List<ResizableServiceWidgetRowListItem> list = ((ResizableServiceWidgetRowItem) aVar).f270730d;
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            ResizableServiceWidgetRowListItem resizableServiceWidgetRowListItem = (ResizableServiceWidgetRowListItem) obj;
            boolean z12 = (i13 == C42745f0.J(list) || list.isEmpty()) ? false : true;
            View viewInflate = gVar.f270749c.inflate(R.layout.resizable_service_widget_row_item, (ViewGroup) linearLayout, false);
            int iB2 = z12 ? y6.b(6) : 0;
            ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.weight = resizableServiceWidgetRowListItem.f270734c;
            layoutParams2.setMarginEnd(iB2);
            viewInflate.setLayoutParams(layoutParams2);
            UniversalImage universalImage = resizableServiceWidgetRowListItem.f270733b;
            com.avito.android.image_loader.a aVarB = com.avito.android.image_loader.b.b(universalImage != null ? com.avito.android.advert.item.delivery_suggests.l.g(viewInflate, universalImage) : null);
            View viewFindViewById = viewInflate.findViewById(R.id.resizable_service_widget_row_item_icon);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.fresco.SimpleDraweeView");
            }
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById;
            simpleDraweeView.setVisibility(universalImage != null ? 0 : 8);
            C35949t5.c(simpleDraweeView, aVarB, null, null, null, 14);
            View viewFindViewById2 = viewInflate.findViewById(R.id.resizable_service_widget_row_item_title);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView = (TextView) viewFindViewById2;
            textView.setText(resizableServiceWidgetRowListItem.f270735d);
            String str = resizableServiceWidgetRowListItem.f270736e;
            textView.setMaxLines((str == null || C43066x.K(str)) ? 2 : 1);
            View viewFindViewById3 = viewInflate.findViewById(R.id.resizable_service_widget_row_item_subtitle_1);
            if (viewFindViewById3 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            TextView textView2 = (TextView) viewFindViewById3;
            I5.a(textView2, str, false);
            String str2 = resizableServiceWidgetRowListItem.f270737f;
            textView2.setMaxLines((str2 == null || C43066x.K(str2)) ? 2 : 1);
            View viewFindViewById4 = viewInflate.findViewById(R.id.resizable_service_widget_row_item_subtitle_2);
            if (viewFindViewById4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            I5.a((TextView) viewFindViewById4, str2, false);
            float[] fArr = new float[8];
            for (int i15 = 0; i15 < 8; i15++) {
                fArr[i15] = y6.b(12);
            }
            String str3 = resizableServiceWidgetRowListItem.f270738g;
            int iIntValue = (str3 == null || (numA2 = com.avito.android.lib.util.e.a(str3)) == null) ? R.attr.warmGray4 : numA2.intValue();
            String str4 = resizableServiceWidgetRowListItem.f270739h;
            int iIntValue2 = (str4 == null || (numA = com.avito.android.lib.util.e.a(str4)) == null) ? R.attr.warmGray8 : numA.intValue();
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
            shapeDrawable.getPaint().setColor(C35835l0.d(iIntValue, viewInflate.getContext()));
            viewInflate.setBackground(new RippleDrawable(ColorStateList.valueOf(C35835l0.d(iIntValue2, viewInflate.getContext())), shapeDrawable, null));
            viewInflate.setOnClickListener(new m(17, dVar, resizableServiceWidgetRowListItem));
            linearLayout.addView(viewInflate);
            i13 = i14;
        }
    }
}
