package com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic;

import Y41.l;
import Y61.k;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.ChartMobileColsItemPromotionsItemData;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.c;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ChartDynamicView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/position_in_search/stats/screen/old_position_in_search/view/items/chart_dynamic/h;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f220933n = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f220934b;

    /* renamed from: c, reason: collision with root package name */
    public double f220935c;

    /* renamed from: d, reason: collision with root package name */
    public final float f220936d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ShimmerLayout f220937e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final HorizontalScrollView f220938f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final TextView f220939g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final TextView f220940h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final LinearLayout f220941i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final LinearLayout f220942j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final TextView f220943k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final View f220944l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final LinearLayout f220945m;

    /* compiled from: ChartDynamicView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[ChartMobileColsItemPromotionsItemData.Type.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ChartMobileColsItemPromotionsItemData.Type type = ChartMobileColsItemPromotionsItemData.Type.f220402b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ChartMobileColsItemPromotionsItemData.Type type2 = ChartMobileColsItemPromotionsItemData.Type.f220402b;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ChartMobileColsItemPromotionsItemData.Type type3 = ChartMobileColsItemPromotionsItemData.Type.f220402b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ChartMobileColsItemPromotionsItemData.Type type4 = ChartMobileColsItemPromotionsItemData.Type.f220402b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f220934b = aVar;
        this.f220936d = y6.b(48);
        this.f220937e = (ShimmerLayout) view.findViewById(R.id.sl_chart_dynamic_loading);
        this.f220938f = (HorizontalScrollView) view.findViewById(R.id.hsv_chart_dynamic);
        this.f220939g = (TextView) view.findViewById(R.id.tv_title_chart_dynamic);
        this.f220940h = (TextView) view.findViewById(R.id.tv_description_chart_dynamic);
        this.f220941i = (LinearLayout) view.findViewById(R.id.ll_chart_dynamic);
        this.f220942j = (LinearLayout) view.findViewById(R.id.ll_view_line);
        this.f220943k = (TextView) view.findViewById(R.id.tv_view_line);
        this.f220944l = view.findViewById(R.id.v_view_line);
        this.f220945m = (LinearLayout) view.findViewById(R.id.ll_chart_dynamic_legend_y);
    }

    public final void B80(c cVar) {
        float[] fArrC80;
        AttributedText attributedText;
        c.a aVar = cVar.f220920e;
        boolean z12 = true;
        if (aVar instanceof c.a.b) {
            E80(true);
            return;
        }
        if (aVar instanceof c.a.C6673a) {
            boolean z13 = false;
            E80(false);
            this.f220939g.setText(cVar.f220918c);
            TextView textView = this.f220940h;
            AttributedText attributedText2 = cVar.f220919d;
            com.avito.android.util.text.a aVar2 = this.f220934b;
            j.a(textView, attributedText2, aVar2);
            c.a.C6673a c6673a = (c.a.C6673a) cVar.f220920e;
            V80.e eVar = c6673a.f220921a;
            long j12 = eVar != null ? eVar.f16946a.f16951b : 100L;
            LinearLayout linearLayout = this.f220945m;
            linearLayout.removeAllViews();
            List<AttributedText> list = eVar != null ? eVar.f16946a.f16950a : null;
            if (list != null) {
                for (AttributedText attributedText3 : list) {
                    TextView textView2 = new TextView(this.itemView.getContext());
                    j.c(textView2, attributedText3, aVar2);
                    textView2.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
                    linearLayout.addView(textView2);
                }
            }
            linearLayout.setPadding(y6.b(8), y6.b(14), y6.b(8), 0);
            l<DeepLink, G0> lVar = c6673a.f220924d;
            l<DeepLink, G0> lVar2 = c6673a.f220923c;
            int iB2 = y6.b(16);
            this.f220935c = (((C35835l0.g(this.itemView.getContext()).x - com.avito.android.authorization.auto_recovery.phone_confirm.b.b(this.itemView, R.dimen.position_in_search_stats_chart_legend_width)) - iB2) - y6.b(4)) / ((eVar != null ? eVar.f16947b.size() : 0) > 7 ? 9 : 7);
            LinearLayout linearLayout2 = this.f220941i;
            linearLayout2.removeAllViews();
            View view = new View(this.itemView.getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(iB2, 0));
            linearLayout2.addView(view);
            if (eVar != null) {
                int i12 = 0;
                for (Object obj : eVar.f16947b) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    V80.g gVar = (V80.g) obj;
                    boolean z14 = i12 == 0 ? z12 : z13;
                    View viewInflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.position_in_search_stats_chart_dynamic_item, (ViewGroup) null, z13);
                    View viewFindViewById = viewInflate.findViewById(R.id.v_left_border);
                    if (viewFindViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    View viewFindViewById2 = viewInflate.findViewById(R.id.fl_position_container);
                    if (viewFindViewById2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                    }
                    ViewGroup viewGroup = (FrameLayout) viewFindViewById2;
                    View viewFindViewById3 = viewInflate.findViewById(R.id.ll_vases_chart_dynamic);
                    if (viewFindViewById3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                    }
                    LinearLayout linearLayout3 = (LinearLayout) viewFindViewById3;
                    View viewFindViewById4 = viewInflate.findViewById(R.id.tv_date_item_chart_dynamic);
                    l<DeepLink, G0> lVar3 = lVar2;
                    if (viewFindViewById4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView3 = (TextView) viewFindViewById4;
                    l<DeepLink, G0> lVar4 = lVar;
                    View viewFindViewById5 = viewInflate.findViewById(R.id.tv_week_item_chart_dynamic);
                    if (viewFindViewById5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView4 = (TextView) viewFindViewById5;
                    viewFindViewById.setVisibility(z14 ? 0 : 8);
                    j.c(textView3, gVar.f16952a, aVar2);
                    textView3.setPadding(0, y6.b(8), 0, 0);
                    AttributedText attributedText4 = gVar.f16955d;
                    if (attributedText4 != null) {
                        j.c(textView4, attributedText4, aVar2);
                    }
                    View viewFindViewById6 = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.position_in_search_stats_chart_dynamic_position, viewGroup, false).findViewById(R.id.tv_position_chart_dynamic);
                    if (viewFindViewById6 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView5 = (TextView) viewFindViewById6;
                    V80.a aVar3 = gVar.f16953b;
                    if (aVar3 != null && (attributedText = aVar3.f16933b) != null) {
                        j.c(textView5, attributedText, aVar2);
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(((int) this.f220935c) - y6.b(z14 ? 2 : 1), y6.b(20));
                    com.avito.android.util.text.a aVar4 = aVar2;
                    c.a.C6673a c6673a2 = c6673a;
                    V80.e eVar2 = eVar;
                    layoutParams.setMargins(0, (int) D80(aVar3 != null ? aVar3.f16934c : 0L, j12, false), 0, 0);
                    textView5.setLayoutParams(layoutParams);
                    if (aVar3 != null) {
                        UniversalColor universalColor = aVar3.f16932a;
                        Context context = this.itemView.getContext();
                        C48063a.f437606a.getClass();
                        textView5.setBackgroundTintList(C48063a.e(context, universalColor));
                    }
                    viewGroup.addView(textView5);
                    linearLayout3.removeAllViews();
                    ArrayList arrayList = new ArrayList();
                    ArrayList<ChartMobileColsItemPromotionsItemData> arrayList2 = gVar.f16954c;
                    if (arrayList2 != null) {
                        for (ChartMobileColsItemPromotionsItemData chartMobileColsItemPromotionsItemData : arrayList2) {
                            View viewInflate2 = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.position_in_search_stats_chart_dynamic_promo, (ViewGroup) linearLayout3, false);
                            String str = chartMobileColsItemPromotionsItemData.f220400c;
                            if (str != null) {
                                View viewFindViewById7 = viewInflate2.findViewById(R.id.sdv_position_chart_dynamic_promo);
                                if (viewFindViewById7 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.drawee.view.SimpleDraweeView");
                                }
                                SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById7;
                                D6.H(simpleDraweeView);
                                simpleDraweeView.setImageURI(Uri.parse(str));
                            }
                            GradientDrawable gradientDrawableE = com.avito.android.advert.item.delivery_suggests.l.e(0);
                            UniversalColor universalColor2 = chartMobileColsItemPromotionsItemData.f220398a;
                            if (universalColor2 != null) {
                                gradientDrawableE.setColor(C48063a.f437606a.a(this.itemView.getContext(), universalColor2));
                            }
                            int iOrdinal = chartMobileColsItemPromotionsItemData.f220401d.ordinal();
                            if (iOrdinal == 0) {
                                fArrC80 = C80(true, false);
                            } else if (iOrdinal == 1) {
                                fArrC80 = C80(false, true);
                            } else if (iOrdinal == 2) {
                                fArrC80 = C80(false, false);
                            } else if (iOrdinal == 3) {
                                fArrC80 = C80(true, true);
                            } else {
                                if (iOrdinal != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                fArrC80 = C80(false, false);
                            }
                            gradientDrawableE.setCornerRadii(fArrC80);
                            viewInflate2.setBackground(gradientDrawableE);
                            ConstraintLayout.b bVar = new ConstraintLayout.b(y6.b(1) + ((int) this.f220935c), (int) com.avito.android.authorization.auto_recovery.phone_confirm.b.b(this.itemView, R.dimen.position_in_search_stats_chart_promo));
                            bVar.setMargins(0, 0, 0, y6.b(2));
                            viewInflate2.setLayoutParams(bVar);
                            viewInflate2.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(22, lVar3, chartMobileColsItemPromotionsItemData));
                            arrayList.add(viewInflate2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        linearLayout3.addView((View) it.next());
                    }
                    linearLayout2.addView(viewInflate);
                    c6673a = c6673a2;
                    lVar2 = lVar3;
                    i12 = i13;
                    lVar = lVar4;
                    aVar2 = aVar4;
                    eVar = eVar2;
                    z12 = true;
                    z13 = false;
                }
            }
            final l<DeepLink, G0> lVar5 = lVar;
            com.avito.android.util.text.a aVar5 = aVar2;
            c.a.C6673a c6673a3 = c6673a;
            V80.e eVar3 = eVar;
            com.avito.android.inline_filters.dialog.group.item.double_input.e eVar4 = new com.avito.android.inline_filters.dialog.group.item.double_input.e(this, 20);
            HorizontalScrollView horizontalScrollView = this.f220938f;
            horizontalScrollView.post(eVar4);
            DeepLink deepLink = eVar3 != null ? eVar3.f16949d : null;
            final l0.e eVar5 = new l0.e();
            final l0.e eVar6 = new l0.e();
            final l0.a aVar6 = new l0.a();
            final DeepLink deepLink2 = deepLink;
            horizontalScrollView.setOnTouchListener(new View.OnTouchListener() { // from class: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.g
                /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
                @Override // android.view.View.OnTouchListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
                    /*
                        r6 = this;
                        int r7 = com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.h.f220933n
                        int r7 = r8.getActionMasked()
                        r0 = 0
                        kotlin.jvm.internal.l0$e r1 = r1
                        kotlin.jvm.internal.l0$e r2 = r2
                        kotlin.jvm.internal.l0$a r3 = r3
                        if (r7 == 0) goto L44
                        r4 = 1
                        if (r7 == r4) goto L41
                        r5 = 2
                        if (r7 == r5) goto L19
                        r8 = 3
                        if (r7 == r8) goto L41
                        goto L52
                    L19:
                        boolean r7 = r3.f406838b
                        if (r7 != 0) goto L52
                        float r7 = r8.getX()
                        float r1 = r1.f406839b
                        float r7 = r7 - r1
                        float r7 = java.lang.Math.abs(r7)
                        float r8 = r8.getY()
                        float r1 = r2.f406839b
                        float r8 = r8 - r1
                        float r8 = java.lang.Math.abs(r8)
                        int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
                        if (r7 <= 0) goto L52
                        r3.f406838b = r4
                        Y41.l r7 = r4
                        com.avito.android.deep_linking.links.DeepLink r8 = r5
                        r7.invoke(r8)
                        goto L52
                    L41:
                        r3.f406838b = r0
                        goto L52
                    L44:
                        float r7 = r8.getX()
                        r1.f406839b = r7
                        float r7 = r8.getY()
                        r2.f406839b = r7
                        r3.f406838b = r0
                    L52:
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.position_in_search.stats.screen.old_position_in_search.view.items.chart_dynamic.g.onTouch(android.view.View, android.view.MotionEvent):boolean");
                }
            });
            V80.b bVar2 = eVar3 != null ? eVar3.f16948c : null;
            l<DeepLink, G0> lVar6 = c6673a3.f220922b;
            int i14 = bVar2 != null ? 0 : 8;
            LinearLayout linearLayout4 = this.f220942j;
            linearLayout4.setVisibility(i14);
            if (bVar2 == null) {
                return;
            }
            TextView textView6 = this.f220943k;
            j.c(textView6, bVar2.f16939e, aVar5);
            Integer num = bVar2.f16937c;
            if (num != null) {
                FV.a.f4720a.f(textView6, num.intValue(), y6.b(4));
            }
            Context context2 = this.itemView.getContext();
            C48063a c48063a = C48063a.f437606a;
            UniversalColor universalColor3 = bVar2.f16935a;
            c48063a.getClass();
            ColorStateList colorStateListE = C48063a.e(context2, universalColor3);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(colorStateListE);
            gradientDrawable.setCornerRadii(C80(true, true));
            textView6.setBackground(gradientDrawable);
            textView6.setPadding(y6.b(6), y6.b(3), y6.b(6), y6.b(3));
            textView6.setTextColor(C35835l0.d(R.attr.white, this.itemView.getContext()));
            float fD80 = D80(bVar2.f16940f, j12, true);
            ConstraintLayout.b bVar3 = new ConstraintLayout.b(-1, -2);
            bVar3.f44197j = R.id.hsv_chart_dynamic;
            bVar3.setMargins(0, (int) fD80, 0, 0);
            linearLayout4.setLayoutParams(bVar3);
            linearLayout4.setOnClickListener(new com.avito.android.newcars_mark_model_filter.presentation.recycler.brand.j(21, lVar6, bVar2));
            ColorStateList colorStateListE2 = C48063a.e(this.itemView.getContext(), bVar2.f16938d);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setColor(colorStateListE2);
            gradientDrawable2.setCornerRadii(C80(true, true));
            this.f220944l.setBackground(gradientDrawable2);
        }
    }

    public final float[] C80(boolean z12, boolean z13) {
        float f12 = this.f220936d;
        return new float[]{z12 ? f12 : 0.0f, z12 ? f12 : 0.0f, z13 ? f12 : 0.0f, z13 ? f12 : 0.0f, z13 ? f12 : 0.0f, z13 ? f12 : 0.0f, z12 ? f12 : 0.0f, z12 ? f12 : 0.0f};
    }

    public final float D80(long j12, long j13, boolean z12) {
        float f12 = j12 / j13;
        return ((this.itemView.getContext().getResources().getDimension(R.dimen.position_in_search_stats_column_height) * f12) - (y6.b(20) * f12)) + (z12 ? y6.b(8) : 0.0f);
    }

    public final void E80(boolean z12) {
        this.f220937e.setVisibility(z12 ? 0 : 8);
        this.f220938f.setVisibility(!z12 ? 0 : 8);
        this.f220942j.setVisibility(!z12 ? 0 : 8);
        this.f220945m.setVisibility(z12 ? 8 : 0);
    }
}
