package com.avito.android.str_booking.ui.calculation;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.util.q;
import com.avito.android.str_booking.network.models.sections.CalculationContentItem;
import com.avito.android.str_booking.network.models.sections.CollapsedCalculationContentItem;
import com.avito.android.str_booking.network.models.sections.Icon;
import com.avito.android.str_booking.ui.calculation.l;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ly0.InterfaceC43849a;

/* compiled from: StrBookingCalculationView.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_booking/ui/calculation/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/str_booking/ui/calculation/i;", "Lly0/a;", "a", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l extends com.avito.konveyor.adapter.b implements i, InterfaceC43849a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f285978i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f285979b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f285980c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f285981d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f285982e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f285983f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f285984g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f285985h;

    /* compiled from: StrBookingCalculationView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/str_booking/ui/calculation/l$a;", "", "<init>", "()V", "", "COLLAPSED_ITEM_START_MARGIN", "I", "DOTS_OFFSET", "EMPTY_MARGIN", "TOP_MARGIN", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: StrBookingCalculationView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f285986l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f285986l = str;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            oVar.b(this.f285986l);
            return G0.f406611a;
        }
    }

    /* compiled from: StrBookingCalculationView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f285987l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f285988m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(1);
            this.f285987l = str;
            this.f285988m = str2;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            o oVar2 = oVar;
            oVar2.i(this.f285987l);
            oVar2.b(this.f285988m);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public l(@Y61.k View view, @Y61.k com.avito.konveyor.adapter.d dVar) {
        super(view);
        this.f285979b = view;
        this.f285980c = dVar;
        View viewFindViewById = view.findViewById(R.id.str_booking_calculation_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f285981d = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.str_booking_calculation_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f285982e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.str_booking_detalisation_content);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f285983f = (TextView) viewFindViewById3;
    }

    public static void B80(View view, boolean z12) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(z12 ? y6.b(8) : 0, y6.b(6), 0, 0);
        view.setLayoutParams(layoutParams);
    }

    @Override // ly0.InterfaceC43849a
    public final void Bq(int i12, @Y61.k String str, @Y61.l String str2) {
        View view = this.f285979b;
        View viewFindViewById = view.findViewById(R.id.str_booking_calculation_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById;
        if (i12 <= -1 || i12 >= linearLayout.getChildCount()) {
            return;
        }
        View childAt = linearLayout.getChildAt(i12);
        com.avito.android.lib.design.tooltip.k kVar = this.f285985h;
        if (kVar != null) {
            kVar.dismiss();
        }
        com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(view.getContext(), 0, 0, 6, null);
        i.c cVar = new i.c(new b.c());
        cVar.f181212c = Integer.valueOf(y6.b(24));
        r.d dVar = new r.d(cVar);
        dVar.j(y6.b(-6));
        kVar2.f181224j = dVar;
        p.a(kVar2, new c(str, str2));
        this.f285985h = kVar2.f(childAt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.widget.TextView] */
    @Override // com.avito.android.str_booking.ui.calculation.i
    public final void Qo(@Y61.k d dVar, @Y61.k Y41.l<? super com.avito.android.str_booking.mvi.entity.a, G0> lVar) {
        ?? descriptionParameterItem;
        String name;
        I5.a(this.f285982e, dVar.f285960b, false);
        LinearLayout linearLayout = this.f285981d;
        linearLayout.removeAllViews();
        List<CalculationContentItem> list = dVar.f285962d;
        if (list != null) {
            for (CalculationContentItem calculationContentItem : list) {
                final View viewInflate = LayoutInflater.from(this.f285979b.getContext()).inflate(R.layout.str_booking_calculation_item, (ViewGroup) linearLayout, false);
                View viewFindViewById = viewInflate.findViewById(R.id.str_booking_calculation_icon);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ImageView imageView = (ImageView) viewFindViewById;
                View viewFindViewById2 = viewInflate.findViewById(R.id.str_booking_calculation_text);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
                }
                final DescriptionParameterItem descriptionParameterItem2 = (DescriptionParameterItem) viewFindViewById2;
                descriptionParameterItem2.setDotsOffset(y6.b(4));
                kotlin.c.b(descriptionParameterItem2.getLeftTextView(), calculationContentItem.getTitle());
                kotlin.c.b(descriptionParameterItem2.getRightTextView(), calculationContentItem.getValue());
                Drawable drawableH = calculationContentItem.getHint() != null ? C35835l0.h(R.attr.ic_help16, viewInflate.getContext()) : !calculationContentItem.d().isEmpty() ? !L.f(calculationContentItem.getCollapsed(), Boolean.FALSE) ? C35835l0.h(R.attr.ic_arrowExpandLess16, viewInflate.getContext()) : C35835l0.h(R.attr.ic_arrowExpandMore16, viewInflate.getContext()) : null;
                if (drawableH != null) {
                    descriptionParameterItem2.setLeftTextIconDrawable(drawableH);
                }
                final String hint = calculationContentItem.getHint();
                descriptionParameterItem2.setLeftTextIconClickListener(hint != null ? new View.OnClickListener() { // from class: com.avito.android.str_booking.ui.calculation.j
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i12 = l.f285978i;
                        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(viewInflate.getContext(), 0, 0, 6, null);
                        p.a(kVar, new l.b(hint));
                        kVar.f(descriptionParameterItem2.getIcon());
                    }
                } : null);
                Icon icon = calculationContentItem.getIcon();
                if (icon != null && (name = icon.getName()) != null) {
                    Integer numA = q.a(name);
                    Drawable drawableH2 = numA != null ? C35835l0.h(numA.intValue(), viewInflate.getContext()) : null;
                    if (drawableH2 != null) {
                        imageView.setImageDrawable(drawableH2);
                        D6.H(imageView);
                    } else {
                        D6.w(imageView);
                    }
                }
                B80(viewInflate, false);
                if (!calculationContentItem.d().isEmpty()) {
                    View viewFindViewById3 = viewInflate.findViewById(R.id.proxy_click_view);
                    if (viewFindViewById3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                    }
                    viewFindViewById3.setOnClickListener(new k(1, lVar, calculationContentItem));
                }
                linearLayout.addView(viewInflate);
                if (L.f(calculationContentItem.getCollapsed(), Boolean.FALSE)) {
                    List<CollapsedCalculationContentItem> listD = calculationContentItem.d();
                    ArrayList arrayList = new ArrayList(C42745f0.q(listD, 10));
                    for (CollapsedCalculationContentItem collapsedCalculationContentItem : listD) {
                        if (collapsedCalculationContentItem.getValue() == null) {
                            descriptionParameterItem = new TextView(this.itemView.getContext());
                            com.avito.android.util.text.j.a(descriptionParameterItem, collapsedCalculationContentItem.getTitle(), null);
                        } else {
                            descriptionParameterItem = new DescriptionParameterItem(this.itemView.getContext(), null, 0, 0, 14, null);
                            descriptionParameterItem.setDotsOffset(y6.b(4));
                            com.avito.android.util.text.j.a(descriptionParameterItem.getLeftTextView(), collapsedCalculationContentItem.getTitle(), null);
                            com.avito.android.util.text.j.a(descriptionParameterItem.getRightTextView(), collapsedCalculationContentItem.getValue(), null);
                        }
                        B80(descriptionParameterItem, true);
                        arrayList.add(descriptionParameterItem);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        linearLayout.addView((View) it.next());
                    }
                }
            }
        }
        com.avito.android.str_booking.ui.calculation.a aVar = dVar.f285964f;
        String str = aVar != null ? aVar.f285951a : null;
        TextView textView = this.f285983f;
        if (str != null) {
            I5.a(textView, aVar.f285951a, false);
            return;
        }
        n nVar = dVar.f285963e;
        if ((nVar != null ? nVar.f285989a : null) != null) {
            I5.a(textView, nVar.f285989a, false);
        } else {
            D6.w(textView);
        }
    }

    @Override // com.avito.android.str_booking.ui.calculation.i
    public final void Uv() {
        this.f285983f.setOnClickListener(null);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.lib.design.tooltip.k kVar = this.f285985h;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f285985h = null;
    }

    @Override // com.avito.android.str_booking.ui.calculation.i
    public final void mT(@Y61.k n nVar) {
        this.f285983f.setOnClickListener(new k(0, this, nVar));
    }

    @Override // com.avito.android.str_booking.ui.calculation.i
    public final void nx(@Y61.k com.avito.android.str_booking.ui.calculation.a aVar) {
        this.f285983f.setOnClickListener(new k(2, this, aVar));
    }

    @Override // com.avito.android.str_booking.ui.calculation.i
    public final void y80(@Y61.k Y41.a<G0> aVar) {
        this.f285984g = aVar;
    }
}
