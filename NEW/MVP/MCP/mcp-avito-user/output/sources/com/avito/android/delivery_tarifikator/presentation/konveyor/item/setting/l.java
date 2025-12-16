package com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting;

import KV.a;
import Rv.C15084a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.select.Select;
import com.avito.android.lib.design.select.state.SelectState;
import com.avito.android.lib.design.tooltip.ImageGravity;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.lib.design.tooltip.state.TooltipState;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: SettingView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/delivery_tarifikator/presentation/konveyor/item/setting/i;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f135425A = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Input f135426b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Input f135427c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Input f135428d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f135429e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f135430f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f135431g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final View f135432h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f135433i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f135434j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final View f135435k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Button f135436l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Select f135437m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f135438n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public b f135439o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public n f135440p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public m f135441q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public SelectState f135442r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public q f135443s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public p f135444t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public p f135445u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public p f135446v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public View.OnClickListener f135447w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public List<Ov.d> f135448x;

    /* renamed from: y, reason: collision with root package name */
    public final int f135449y;

    /* renamed from: z, reason: collision with root package name */
    public final int f135450z;

    /* compiled from: SettingView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            l lVar = l.this;
            q qVar = lVar.f135443s;
            if (qVar != null) {
                qVar.b(str2, lVar.f135448x);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.item_setting_price_input);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById;
        this.f135426b = input;
        View viewFindViewById2 = view.findViewById(R.id.item_setting_day_range_min);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input2 = (Input) viewFindViewById2;
        this.f135427c = input2;
        View viewFindViewById3 = view.findViewById(R.id.item_setting_day_range_max);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input3 = (Input) viewFindViewById3;
        this.f135428d = input3;
        View viewFindViewById4 = view.findViewById(R.id.item_setting_price_input_error);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135429e = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.item_setting_min_days_error_tv);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135430f = (TextView) viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.item_setting_max_days_error_tv);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135431g = (TextView) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.item_setting_day_range_group);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f135432h = viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.item_setting_header_tv);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135433i = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.item_setting_delivery_days_title);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f135434j = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.item_setting_days_help_ic);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f135435k = viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.item_setting_save_btn);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById11;
        this.f135436l = button;
        View viewFindViewById12 = view.findViewById(R.id.item_setting_tariff_select);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.select.Select");
        }
        Select select = (Select) viewFindViewById12;
        this.f135437m = select;
        Object[] objArr = 0 == true ? 1 : 0;
        this.f135442r = new SelectState("", null, false, false, null, null, null, null, objArr, false, false, null, null, false, 0, 32766, null);
        this.f135448x = C42784z0.f406748b;
        this.f135449y = C35835l0.d(R.attr.black, this.itemView.getContext());
        this.f135450z = C35835l0.d(R.attr.gray36, this.itemView.getContext());
        k kVar = new k(0);
        input.setOnFocusChangeListener(kVar);
        input2.setOnFocusChangeListener(kVar);
        input3.setOnFocusChangeListener(kVar);
        final int i12 = 0;
        viewFindViewById10.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f135423c;

            {
                this.f135423c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                l lVar = this.f135423c;
                switch (i12) {
                    case 0:
                        int i13 = l.f135425A;
                        com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(lVar.itemView.getContext(), 0, 0, 6, null);
                        lVar.f135438n = kVar2;
                        a.C0572a c0572a = KV.a.f9464v;
                        Context context = lVar.itemView.getContext();
                        int iJ2 = C35835l0.j(R.attr.tooltipSmall, lVar.itemView.getContext());
                        c0572a.getClass();
                        kVar2.c(a.C0572a.b(iJ2, context));
                        com.avito.android.lib.design.tooltip.k kVar3 = lVar.f135438n;
                        if (kVar3 != null) {
                            kVar3.b(new TooltipState(new r.a(new i.c(new b.c())), false, null, null, lVar.itemView.getContext().getString(R.string.setting_delivery_days_info_text), null, null, null, null, null, false, new o(lVar), lVar.f135434j, TooltipState.State.f181285b, ErrorCodes.PROTOCOL_EXCEPTION, null));
                            break;
                        }
                        break;
                    default:
                        View.OnClickListener onClickListener = lVar.f135447w;
                        if (onClickListener != null) {
                            onClickListener.onClick(view2);
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        button.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.j

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l f135423c;

            {
                this.f135423c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                l lVar = this.f135423c;
                switch (i13) {
                    case 0:
                        int i132 = l.f135425A;
                        com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(lVar.itemView.getContext(), 0, 0, 6, null);
                        lVar.f135438n = kVar2;
                        a.C0572a c0572a = KV.a.f9464v;
                        Context context = lVar.itemView.getContext();
                        int iJ2 = C35835l0.j(R.attr.tooltipSmall, lVar.itemView.getContext());
                        c0572a.getClass();
                        kVar2.c(a.C0572a.b(iJ2, context));
                        com.avito.android.lib.design.tooltip.k kVar3 = lVar.f135438n;
                        if (kVar3 != null) {
                            kVar3.b(new TooltipState(new r.a(new i.c(new b.c())), false, null, null, lVar.itemView.getContext().getString(R.string.setting_delivery_days_info_text), null, null, null, null, null, false, new o(lVar), lVar.f135434j, TooltipState.State.f181285b, ErrorCodes.PROTOCOL_EXCEPTION, null));
                            break;
                        }
                        break;
                    default:
                        View.OnClickListener onClickListener = lVar.f135447w;
                        if (onClickListener != null) {
                            onClickListener.onClick(view2);
                            break;
                        }
                        break;
                }
            }
        });
        SelectState selectStateA = SelectState.a(this.f135442r, null, false, this.itemView.getContext().getString(R.string.setting_select_tariff_dialog_title), null, new a(), 32687);
        this.f135442r = selectStateA;
        select.setState(selectStateA);
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.i
    public final void Aj(@Y61.k e eVar) {
        this.f135443s = eVar.O3();
        this.f135444t = eVar.S4();
        this.f135445u = eVar.T2();
        this.f135446v = eVar.O0();
        this.f135447w = eVar.r3();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B80(com.avito.android.lib.design.input.Input r2, com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c r3) {
        /*
            r1 = this;
            boolean r0 = r3.f135408c
            if (r0 == 0) goto L7
            int r0 = r1.f135449y
            goto L9
        L7:
            int r0 = r1.f135450z
        L9:
            r2.setPrefixColor(r0)
            r2.setPostfixColor(r0)
            java.lang.String r0 = r3.f135407b
            if (r0 == 0) goto L1c
            com.avito.android.lib.design.input.Input$c r0 = com.avito.android.lib.design.input.Input.f179303W
            r0.getClass()
            int[] r0 = com.avito.android.lib.design.input.Input.f179305b0
            if (r0 != 0) goto L23
        L1c:
            com.avito.android.lib.design.input.Input$c r0 = com.avito.android.lib.design.input.Input.f179303W
            r0.getClass()
            int[] r0 = com.avito.android.lib.design.input.Input.f179304a0
        L23:
            r2.setState(r0)
            boolean r3 = r3.f135408c
            r2.setEnabled(r3)
            r2.setClearButton(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.l.B80(com.avito.android.lib.design.input.Input, com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.c):void");
    }

    public final void C80(c cVar, c cVar2) {
        this.f135432h.setVisibility((cVar == null || cVar2 == null) ? 8 : 0);
        if (cVar != null && cVar2 != null) {
            Input input = this.f135427c;
            B80(input, cVar);
            if (!input.f179340l.isFocused()) {
                TextWatcher textWatcher = this.f135440p;
                if (textWatcher != null) {
                    input.h(textWatcher);
                }
                Input.t(input, cVar.f135406a, false, 6);
                n nVar = new n(input, this);
                input.b(nVar);
                this.f135440p = nVar;
            }
            Input input2 = this.f135428d;
            B80(input2, cVar2);
            if (!input2.f179340l.isFocused()) {
                TextWatcher textWatcher2 = this.f135441q;
                if (textWatcher2 != null) {
                    input2.h(textWatcher2);
                }
                Input.t(input2, cVar2.f135406a, false, 6);
                m mVar = new m(input2, this);
                input2.b(mVar);
                this.f135441q = mVar;
            }
        }
        I5.a(this.f135430f, cVar != null ? cVar.f135407b : null, false);
        I5.a(this.f135431g, cVar2 != null ? cVar2.f135407b : null, false);
    }

    public final void D80(c cVar) {
        int i12 = cVar != null ? 0 : 8;
        Input input = this.f135426b;
        input.setVisibility(i12);
        if (cVar != null) {
            B80(input, cVar);
            if (!input.f179340l.isFocused()) {
                TextWatcher textWatcher = this.f135439o;
                if (textWatcher != null) {
                    input.h(textWatcher);
                }
                Input.t(input, cVar.f135406a, false, 6);
                b bVar = new b(input, this);
                input.b(bVar);
                this.f135439o = bVar;
            }
        }
        I5.a(this.f135429e, cVar != null ? cVar.f135407b : null, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.lib.design.tooltip.k kVar = this.f135438n;
        if (kVar != null) {
            com.avito.android.lib.design.tooltip.q qVar = null;
            boolean z12 = false;
            Y41.a aVar = null;
            CharSequence charSequence = null;
            CharSequence charSequence2 = null;
            CharSequence charSequence3 = null;
            Y41.a aVar2 = null;
            Drawable drawable = null;
            ImageGravity imageGravity = null;
            Drawable drawable2 = null;
            boolean z13 = false;
            kVar.b(new TooltipState(qVar, z12, aVar, charSequence, charSequence2, charSequence3, aVar2, drawable, imageGravity, drawable2, z13, null, null, TooltipState.State.f181286c, 8191, null));
        }
        this.f135438n = null;
        b bVar = this.f135439o;
        if (bVar != null) {
            this.f135426b.h(bVar);
        }
        n nVar = this.f135440p;
        if (nVar != null) {
            this.f135427c.h(nVar);
        }
        m mVar = this.f135441q;
        if (mVar != null) {
            this.f135428d.h(mVar);
        }
        this.f135439o = null;
        this.f135440p = null;
        this.f135441q = null;
        this.f135443s = null;
        this.f135444t = null;
        this.f135445u = null;
        this.f135446v = null;
        this.f135447w = null;
    }

    @Override // com.avito.android.delivery_tarifikator.presentation.konveyor.item.setting.i
    public final void ly(@Y61.k d dVar, @Y61.l C15084a.b bVar) {
        this.f135448x = dVar.f135417j;
        if (bVar == null || bVar.f14731a.f318649a) {
            I5.a(this.f135433i, dVar.f135410c, false);
        }
        boolean z12 = dVar.f135418k;
        if (bVar == null || bVar.f14735e.f318649a || bVar.f14736f.f318649a || bVar.f14738h.f318649a) {
            SelectState selectStateA = SelectState.a(this.f135442r, dVar.f135414g, !z12, null, dVar.f135415h, null, 32730);
            this.f135442r = selectStateA;
            this.f135437m.setState(selectStateA);
        }
        if (bVar == null || bVar.f14737g.f318649a || bVar.f14738h.f318649a) {
            boolean z13 = dVar.f135416i;
            int i12 = z13 ? 0 : 8;
            Button button = this.f135436l;
            button.setVisibility(i12);
            if (z13) {
                button.setLoading(z12);
            }
        }
        if (bVar == null || bVar.f14732b.f318649a || bVar.f14733c.f318649a || bVar.f14734d.f318649a || bVar.f14738h.f318649a) {
            c cVar = dVar.f135413f;
            c cVar2 = dVar.f135412e;
            c cVar3 = dVar.f135411d;
            if (z12) {
                D80(cVar3 != null ? c.a(cVar3) : null);
                C80(cVar2 != null ? c.a(cVar2) : null, cVar != null ? c.a(cVar) : null);
            } else {
                D80(cVar3);
                C80(cVar2, cVar);
            }
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f135452b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f135453c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l f135454d;

        public b(Input input, l lVar) {
            this.f135453c = input;
            this.f135454d = lVar;
            this.f135452b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f135453c.getDeformattedText();
            if (L.f(deformattedText, this.f135452b)) {
                return;
            }
            l lVar = this.f135454d;
            p pVar = lVar.f135444t;
            if (pVar != null) {
                pVar.a(C43066x.z0(deformattedText), lVar.f135448x);
            }
            this.f135452b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
