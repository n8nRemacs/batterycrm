package com.avito.android.advert_core.discount.item.discount;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import com.avito.android.R;
import com.avito.android.advert_core.discount.item.discount.h;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.UniversalColorKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: DiscountItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/discount/item/discount/h;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert_core/discount/item/discount/f;", "a", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f83375g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f83376b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.text_view.a f83377c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.text_view.a f83378d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ImageView f83379e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.tooltip.k f83380f;

    /* compiled from: DiscountItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/advert_core/discount/item/discount/h$a;", "", "<init>", "()V", "", "BOLD_VALUE_TOP_MARGIN_DP", "I", "REGULAR_VALUE_TOP_MARGIN_DP", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DiscountItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f83381l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f83381l = str;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            oVar.b(this.f83381l);
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    public h(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.discount_item);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        DescriptionParameterItem descriptionParameterItem = (DescriptionParameterItem) viewFindViewById;
        this.f83376b = descriptionParameterItem;
        this.f83377c = descriptionParameterItem.getLeftTextView();
        this.f83378d = descriptionParameterItem.getRightTextView();
        this.f83379e = descriptionParameterItem.getIcon();
    }

    @Override // com.avito.android.advert_core.discount.item.discount.f
    public final void B8() {
        DescriptionParameterItem descriptionParameterItem = this.f83376b;
        descriptionParameterItem.setOnClickListener(null);
        D6.w(descriptionParameterItem.getIcon());
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.lib.design.tooltip.k kVar = this.f83380f;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f83380f = null;
    }

    @Override // com.avito.android.advert_core.discount.item.discount.f
    public final void r2(@k final String str) {
        this.f83376b.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.advert_core.discount.item.discount.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = h.f83375g;
                h hVar = this.f83373b;
                com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(hVar.itemView.getContext(), 0, 0, 6, null);
                kVar.f181224j = new r.d(new i.b(new b.a()));
                p.a(kVar, new h.b(str));
                hVar.f83380f = kVar.f(hVar.f83379e);
            }
        });
        D6.H(this.f83379e);
    }

    @Override // com.avito.android.advert_core.discount.item.discount.f
    public final void setTitle(@k String str) {
        I5.a(this.f83376b.getLeftTextView(), str, false);
    }

    @Override // com.avito.android.advert_core.discount.item.discount.f
    public final void tX(@k String str, @l String str2, boolean z12, boolean z13) {
        com.avito.android.lib.design.text_view.a aVar = this.f83378d;
        if (z13 && z12) {
            this.f83377c.setTextAppearance(C35835l0.j(R.attr.textH50, this.itemView.getContext()));
            aVar.setTextAppearance(C35835l0.j(R.attr.textH50, this.itemView.getContext()));
            D6.c(this.f83376b, null, Integer.valueOf(D6.i(16, this.itemView.getContext())), null, null, 13);
        } else if (z12) {
            aVar.setTextAppearance(C35835l0.j(R.attr.textHeadingLarge, this.itemView.getContext()));
            D6.c(this.f83376b, null, Integer.valueOf(D6.i(12, this.itemView.getContext())), null, null, 13);
        } else {
            aVar.setTextAppearance(C35835l0.j(R.attr.textM20, this.itemView.getContext()));
            D6.c(this.f83376b, null, Integer.valueOf(D6.i(16, this.itemView.getContext())), null, null, 13);
        }
        aVar.setTextColor(C48063a.f437606a.a(this.itemView.getContext(), UniversalColorKt.universalColorOf(str2, C35835l0.d(R.attr.black, this.itemView.getContext()))));
        I5.a(aVar, str, false);
    }
}
