package com.avito.android.campaigns_sale.konveyor.editBlock;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.campaigns_sale.network.remote.model.HeaderTooltip;
import com.avito.android.campaigns_sale.network.remote.model.TooltipButton;
import com.avito.android.campaigns_sale.view.images_row.ImagesRowView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.input.Input;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SaleEditBlockItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/campaigns_sale/konveyor/editBlock/p;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class p extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f114000u = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f114001b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f114002c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ImageButton f114003d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageButton f114004e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ImageButton f114005f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f114006g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f114007h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f114008i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f114009j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f114010k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f114011l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Chips f114012m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final ImagesRowView f114013n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Button f114014o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Button f114015p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Button f114016q;

    /* renamed from: r, reason: collision with root package name */
    public final Context f114017r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Integer, G0> f114018s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app.coldstart.d f114019t;

    /* compiled from: SaleEditBlockItemView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "visible", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Input f114020l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Input input) {
            super(1);
            this.f114020l = input;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                this.f114020l.f();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SaleEditBlockItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<com.avito.android.lib.design.tooltip.o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ HeaderTooltip f114025l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.tooltip.k f114026m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ N f114027n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(HeaderTooltip headerTooltip, com.avito.android.lib.design.tooltip.k kVar, Y41.a<G0> aVar) {
            super(1);
            this.f114025l = headerTooltip;
            this.f114026m = kVar;
            this.f114027n = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.tooltip.o oVar) {
            com.avito.android.lib.design.tooltip.o oVar2 = oVar;
            HeaderTooltip headerTooltip = this.f114025l;
            oVar2.i(headerTooltip.getTitle());
            oVar2.b(headerTooltip.getText());
            TooltipButton button = headerTooltip.getButton();
            oVar2.d(button != null ? button.getText() : null);
            oVar2.c(new com.avito.android.body_condition.h((Y41.a) this.f114027n, this.f114026m));
            return G0.f406611a;
        }
    }

    public p(@Y61.k View view) {
        super(view);
        this.f114001b = view;
        View viewFindViewById = view.findViewById(R.id.discount_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        this.f114002c = input;
        View viewFindViewById2 = view.findViewById(R.id.header_help_icon);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f114003d = (ImageButton) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.items_help_icon);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f114004e = (ImageButton) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.header_action_icon);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        this.f114005f = (ImageButton) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.input_validation_text);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114006g = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.skeleton_root);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f114007h = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.items_info_text);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114008i = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.warning_text);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114009j = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.items_error_text);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114010k = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.input_bonus_text);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f114011l = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.chips_container);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        Chips chips = (Chips) viewFindViewById11;
        this.f114012m = chips;
        View viewFindViewById12 = view.findViewById(R.id.images_row);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.campaigns_sale.view.images_row.ImagesRowView");
        }
        this.f114013n = (ImagesRowView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.choose_button);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f114014o = (Button) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.choose_all_button);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f114015p = (Button) viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.edit_button);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f114016q = (Button) viewFindViewById15;
        this.f114017r = view.getContext();
        this.f114019t = new com.avito.android.app.coldstart.d(this, 10);
        input.setOnFocusChangeListener(new com.avito.android.beduin.common.component.input.single_line.e(this, input, 1));
        input.b(new c(input, this));
        input.setClearButtonClickListener(new com.avito.android.body_condition.h(7, this, input));
        K2.b(input, new a(input));
        chips.setChipsSelectedListener(new b());
    }

    public final void B80(@Y61.l String str) {
        int[] iArr;
        I5.a(this.f114006g, str, false);
        if (str != null) {
            Input.f179303W.getClass();
            iArr = Input.f179305b0;
        } else {
            Input.f179303W.getClass();
            iArr = Input.f179304a0;
        }
        this.f114002c.setState(iArr);
    }

    public final void C80(@Y61.l Integer num) {
        String string;
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        Input.t(this.f114002c, string, false, 6);
    }

    public final void D80(HeaderTooltip headerTooltip, View view, Y41.a<G0> aVar, Y41.a<G0> aVar2) {
        com.avito.android.lib.design.tooltip.k kVar = new com.avito.android.lib.design.tooltip.k(this.f114017r, 0, 0, 6, null);
        com.avito.android.lib.design.tooltip.p.a(kVar, new d(headerTooltip, kVar, aVar));
        kVar.setOnDismissListener(aVar2 != null ? new o(0, aVar2) : null);
        kVar.f(view);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f114003d.removeCallbacks(this.f114019t);
    }

    /* compiled from: SaleEditBlockItemView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/campaigns_sale/konveyor/editBlock/p$b", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Chips.c {
        public b() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            com.avito.android.campaigns_sale.konveyor.editBlock.a aVar = hVar instanceof com.avito.android.campaigns_sale.konveyor.editBlock.a ? (com.avito.android.campaigns_sale.konveyor.editBlock.a) hVar : null;
            if (aVar != null) {
                int i12 = aVar.f113968b;
                Integer numValueOf = Integer.valueOf(i12);
                p pVar = p.this;
                pVar.C80(numValueOf);
                Input input = pVar.f114002c;
                if (input.f179340l.isFocused()) {
                    K2.f(input, 3);
                    return;
                }
                Y41.l<? super Integer, G0> lVar = pVar.f114018s;
                if (lVar != null) {
                    ((h) lVar).invoke(Integer.valueOf(i12));
                }
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f114022b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f114023c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f114024d;

        public c(Input input, p pVar) {
            this.f114023c = input;
            this.f114024d = pVar;
            this.f114022b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f114023c.getDeformattedText();
            if (L.f(deformattedText, this.f114022b)) {
                return;
            }
            Y41.l<? super Integer, G0> lVar = this.f114024d.f114018s;
            if (lVar != null) {
                lVar.invoke(C43066x.y0(deformattedText));
            }
            this.f114022b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
