package com.avito.android.auto_loans_composite_broker.v2;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.docking_badge.DockingBadgeContainer;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.H2;
import com.avito.android.util.I5;
import com.avito.android.util.K2;
import com.google.android.material.slider.Slider;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsCompositeBrokerV2View.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/auto_loans_composite_broker/v2/z;", "Lcom/avito/android/auto_loans_composite_broker/v2/t;", "Lcom/avito/konveyor/adapter/b;", "_avito_auto-loans-composite-broker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class z extends com.avito.konveyor.adapter.b implements t {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f95655x = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f95656b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f95657c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f95658d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final DockingBadgeContainer f95659e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Input f95660f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Slider f95661g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final TextView f95662h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final TextView f95663i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Chips f95664j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f95665k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final TextView f95666l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Button f95667m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f95668n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final TextView f95669o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final FrameLayout f95670p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Me.n f95671q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f95672r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super Integer, ? super Boolean, G0> f95673s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public H2 f95674t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final HashSet<AttributedText> f95675u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f95676v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f95677w;

    /* compiled from: AdvertDetailsCompositeBrokerV2View.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isOpen", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<Boolean, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f95681l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ z f95682m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f95683n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f95684o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.a<G0> aVar, z zVar, Y41.l<? super Integer, G0> lVar, Y41.a<G0> aVar2) {
            super(1);
            this.f95681l = aVar;
            this.f95682m = zVar;
            this.f95683n = lVar;
            this.f95684o = aVar2;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            if (bool.booleanValue()) {
                z zVar = this.f95682m;
                if (zVar.f95660f.hasFocus()) {
                    this.f95683n.invoke(Integer.valueOf(-zVar.f95658d.getTop()));
                    this.f95684o.invoke();
                }
            } else {
                this.f95681l.invoke();
            }
            return G0.f406611a;
        }
    }

    public z(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f95656b = aVar;
        this.f95657c = (TextView) view.findViewById(R.id.calculator_title);
        this.f95658d = (TextView) view.findViewById(R.id.calculator_subtitle);
        this.f95659e = (DockingBadgeContainer) view.findViewById(R.id.calculator_badges);
        this.f95660f = (Input) view.findViewById(R.id.calculator_loan_input);
        this.f95661g = (Slider) view.findViewById(R.id.calculator_slider);
        this.f95662h = (TextView) view.findViewById(R.id.calculator_min_loan);
        this.f95663i = (TextView) view.findViewById(R.id.calculator_max_loan);
        this.f95664j = (Chips) view.findViewById(R.id.term_chips);
        this.f95665k = (TextView) view.findViewById(R.id.calculator_monthly_payment_title);
        this.f95666l = (TextView) view.findViewById(R.id.calculator_monthly_payment_value);
        this.f95667m = (Button) view.findViewById(R.id.calculator_button);
        this.f95668n = (TextView) view.findViewById(R.id.calculator_privacy_info);
        this.f95669o = (TextView) view.findViewById(R.id.how_get_loan_label);
        View viewFindViewById = view.findViewById(R.id.calculator_icon_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        this.f95670p = frameLayout;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(frameLayout.getContext());
        Resources resources = view.getContext().getResources();
        this.f95671q = new Me.n(layoutInflaterFrom, resources.getDimensionPixelSize(R.dimen.composite_broker_v2_icon_size), resources.getDimensionPixelSize(R.dimen.composite_broker_v2_icon_overlay), resources.getDimensionPixelSize(R.dimen.composite_broker_v2_icon_border));
        this.f95675u = new HashSet<>();
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void CM(@Y61.k Y41.p<? super Integer, ? super Boolean, G0> pVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.l<? super Integer, G0> lVar) {
        this.f95673s = pVar;
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: com.avito.android.auto_loans_composite_broker.v2.w
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z12) {
                int i12 = z.f95655x;
                if (z12) {
                    return;
                }
                K2.d(this.f95651b.itemView, false);
            }
        };
        Input input = this.f95660f;
        input.setOnFocusChangeListener(onFocusChangeListener);
        input.b(new a(input, this));
        H2 h22 = this.f95674t;
        if (h22 != null) {
            h22.dispose();
        }
        this.f95674t = K2.b(this.itemView, new b(aVar, this, lVar, aVar2));
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void FD(int i12, int i13, @Y61.k Y41.a aVar) {
        Slider slider = this.f95661g;
        slider.setValueFrom(i12);
        slider.setValueTo(i13);
        slider.A();
        slider.y(new Slider.a() { // from class: com.avito.android.auto_loans_composite_broker.v2.u
            @Override // com.google.android.material.slider.Slider.a, com.google.android.material.slider.a
            public final /* bridge */ /* synthetic */ void a(Slider slider2, float f12, boolean z12) {
                b(f12, z12);
            }

            @Override // com.google.android.material.slider.Slider.a
            public final void b(float f12, boolean z12) {
                z zVar = this.f95647a;
                if (zVar.f95677w) {
                    return;
                }
                Integer numY0 = C43066x.y0(zVar.f95660f.getDeformattedText());
                int i14 = (int) f12;
                if (numY0 != null && numY0.intValue() == i14) {
                    return;
                }
                zVar.f95676v = true;
                Y41.p<? super Integer, ? super Boolean, G0> pVar = zVar.f95673s;
                if (pVar != null) {
                    ((i) pVar).invoke(Integer.valueOf(i14), Boolean.TRUE);
                }
                zVar.f95676v = false;
            }
        });
        slider.z(new x(aVar));
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void Gh(@Y61.k String str) {
        I5.a(this.f95665k, str, false);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void Il(@Y61.k Y41.l lVar, @Y61.l AttributedText attributedText) {
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new v(this, lVar, 1));
            this.f95675u.add(attributedText);
        }
        com.avito.android.util.text.j.a(this.f95668n, attributedText, this.f95656b);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void Io(@Y61.k ArrayList arrayList, @Y61.k Me.s sVar, @Y61.k Y41.p pVar) {
        Chips chips = this.f95664j;
        chips.setData(arrayList);
        chips.q(sVar, true);
        D6.H(chips);
        chips.setChipsSelectedListener(new y(pVar, this));
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void Vt(int i12) {
        this.f95661g.setValue(i12);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void Wm(int i12) {
        Input.t(this.f95660f, String.valueOf(i12), true, 2);
        Vt(i12);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void Zw(@Y61.k Me.s sVar) {
        Chips chips = this.f95664j;
        int i12 = Chips.f178664L;
        chips.q(sVar, true);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void bS(@Y61.k Y41.l lVar, @Y61.l AttributedText attributedText) {
        if (attributedText != null) {
            attributedText.setOnDeepLinkClickListener(new v(this, lVar, 0));
            this.f95675u.add(attributedText);
        }
        com.avito.android.util.text.j.a(this.f95669o, attributedText, this.f95656b);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void d(@Y61.k Y41.a<G0> aVar) {
        this.f95672r = aVar;
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void f(@Y61.l String str) {
        I5.a(this.f95658d, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f95672r;
        if (aVar != null) {
            ((h) aVar).invoke();
        }
        this.f95672r = null;
        this.f95673s = null;
        Slider slider = this.f95661g;
        slider.A();
        slider.B();
        Iterator<AttributedText> it = this.f95675u.iterator();
        while (it.hasNext()) {
            it.next().setOnDeepLinkClickListener(null);
        }
        H2 h22 = this.f95674t;
        if (h22 != null) {
            h22.dispose();
        }
        this.f95660f.setOnFocusChangeListener(null);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void ov(@Y61.k String str) {
        I5.a(this.f95666l, this.itemView.getContext().getString(R.string.composite_broker_v2_credit_bottom_limit, str), false);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void r1(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        Button button = this.f95667m;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(7, this, aVar));
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void setTitle(@Y61.k String str) {
        I5.a(this.f95657c, str, false);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void t0(@Y61.l List<DockingBadgeItem> list) {
        DockingBadgeContainer dockingBadgeContainer = this.f95659e;
        if (list == null) {
            D6.w(dockingBadgeContainer);
        } else {
            D6.H(dockingBadgeContainer);
            dockingBadgeContainer.setBadgeItems(list);
        }
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void tU(@Y61.l List<UniversalImage> list) {
        this.f95671q.b(this.f95670p, list, com.avito.android.lib.util.darkTheme.c.b(this.itemView.getContext()), null);
    }

    @Override // com.avito.android.auto_loans_composite_broker.v2.t
    public final void yI(@Y61.k String str, @Y61.k String str2) {
        I5.a(this.f95662h, this.itemView.getContext().getString(R.string.composite_broker_rub_template, str), false);
        I5.a(this.f95663i, this.itemView.getContext().getString(R.string.composite_broker_rub_template, str2), false);
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f95678b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f95679c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ z f95680d;

        public a(Input input, z zVar) {
            this.f95679c = input;
            this.f95680d = zVar;
            this.f95678b = input.getDeformattedText();
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            String deformattedText = this.f95679c.getDeformattedText();
            if (L.f(deformattedText, this.f95678b)) {
                return;
            }
            z zVar = this.f95680d;
            if (!zVar.f95676v) {
                zVar.f95677w = true;
                Y41.p<? super Integer, ? super Boolean, G0> pVar = zVar.f95673s;
                if (pVar != null) {
                    Integer numY0 = C43066x.y0(deformattedText);
                    ((i) pVar).invoke(Integer.valueOf(numY0 != null ? numY0.intValue() : 0), Boolean.FALSE);
                }
                zVar.f95677w = false;
            }
            this.f95678b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
