package com.avito.android.mortgage.root.list.items.realty_object_details;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.messenger.channels.mvi.view.ViewOnClickListenerC31873b;
import com.avito.android.mortgage.root.list.items.realty_object_details.b;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.K2;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyObjectDetailsView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object_details/s;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/mortgage/root/list/items/realty_object_details/q;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class s extends com.avito.konveyor.adapter.b implements q {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f202801b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Chips f202802c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super b.a, G0> f202803d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f202804e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f202805f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Chips f202806g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f202807h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Input f202808i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f202809j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Input f202810k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super DetailsBlockOption, G0> f202811l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f202812m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public N f202813n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super Boolean, G0> f202814o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public N f202815p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f202816q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final c f202817r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f202818s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final d f202819t;

    public s(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.is_avito_item_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202801b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.is_avito_item_options);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        Chips chips = (Chips) viewFindViewById2;
        this.f202802c = chips;
        View viewFindViewById3 = view.findViewById(R.id.menu);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
        }
        ImageButton imageButton = (ImageButton) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.details_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f202805f = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.details_options);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.chips.Chips");
        }
        Chips chips2 = (Chips) viewFindViewById5;
        this.f202806g = chips2;
        View viewFindViewById6 = view.findViewById(R.id.first_field_container);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f202807h = (ComponentContainer) viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.first_field);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input = (Input) viewFindViewById7;
        this.f202808i = input;
        View viewFindViewById8 = view.findViewById(R.id.second_field_container);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f202809j = (ComponentContainer) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.second_field);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        Input input2 = (Input) viewFindViewById9;
        this.f202810k = input2;
        this.f202816q = input.hasFocus();
        c cVar = new c(input, this);
        input.b(cVar);
        this.f202817r = cVar;
        this.f202818s = input2.hasFocus();
        d dVar = new d(input2, this);
        input2.b(dVar);
        this.f202819t = dVar;
        chips.setChipsSelectedListener(new a());
        imageButton.setOnClickListener(new ViewOnClickListenerC31873b(this, 23));
        chips2.setChipsSelectedListener(new b());
        final int i12 = 0;
        input.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: com.avito.android.mortgage.root.list.items.realty_object_details.r

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ s f202800c;

            {
                this.f202800c = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z12) {
                switch (i12) {
                    case 0:
                        s sVar = this.f202800c;
                        Y41.l<? super Boolean, G0> lVar = sVar.f202812m;
                        if (lVar != null) {
                            lVar.invoke(Boolean.valueOf(z12));
                        }
                        sVar.f202816q = z12;
                        break;
                    default:
                        s sVar2 = this.f202800c;
                        Y41.l<? super Boolean, G0> lVar2 = sVar2.f202814o;
                        if (lVar2 != null) {
                            lVar2.invoke(Boolean.valueOf(z12));
                        }
                        sVar2.f202818s = z12;
                        break;
                }
            }
        });
        FormatterType.f179288e.getClass();
        input2.setFormatterType(FormatterType.f179291h);
        final int i13 = 1;
        input2.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: com.avito.android.mortgage.root.list.items.realty_object_details.r

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ s f202800c;

            {
                this.f202800c = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z12) {
                switch (i13) {
                    case 0:
                        s sVar = this.f202800c;
                        Y41.l<? super Boolean, G0> lVar = sVar.f202812m;
                        if (lVar != null) {
                            lVar.invoke(Boolean.valueOf(z12));
                        }
                        sVar.f202816q = z12;
                        break;
                    default:
                        s sVar2 = this.f202800c;
                        Y41.l<? super Boolean, G0> lVar2 = sVar2.f202814o;
                        if (lVar2 != null) {
                            lVar2.invoke(Boolean.valueOf(z12));
                        }
                        sVar2.f202818s = z12;
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void EW(@Y61.l String str) {
        Input input = this.f202810k;
        if (L.f(input.getDeformattedText(), str)) {
            return;
        }
        d dVar = this.f202819t;
        input.h(dVar);
        Input.t(input, str, false, 4);
        input.b(dVar);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void Ko(@Y61.l Y41.l<? super Boolean, G0> lVar) {
        this.f202812m = lVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void RD(@Y61.k String str) {
        this.f202808i.setHint(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void Rk(@Y61.k String str) {
        this.f202810k.setHint(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void Xo(@Y61.k List<b.a> list) {
        this.f202802c.setData(list);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void YU(@Y61.k Y41.l<? super b.a, G0> lVar) {
        this.f202803d = lVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void Z20(@Y61.k String str) {
        this.f202807h.setTitle(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void aj(@Y61.k String str) {
        this.f202809j.setTitle(str);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void au(@Y61.l Y41.l<? super Boolean, G0> lVar) {
        this.f202814o = lVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void cO(@Y61.k Y41.a<G0> aVar) {
        this.f202804e = aVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void h40(@Y61.k Y41.l<? super DetailsBlockOption, G0> lVar) {
        this.f202811l = lVar;
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f202811l = null;
        this.f202812m = null;
        this.f202813n = null;
        this.f202814o = null;
        this.f202815p = null;
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void oK(@Y61.l String str) {
        Input input = this.f202808i;
        if (L.f(input.getDeformattedText(), str)) {
            return;
        }
        c cVar = this.f202817r;
        input.h(cVar);
        Input.t(input, str, false, 4);
        input.b(cVar);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void pt(int i12) {
        Chips chips = this.f202802c;
        if (i12 < 0) {
            chips.j();
        } else {
            Integer num = (Integer) C42745f0.G(chips.n());
            if (num == null || i12 != num.intValue()) {
                chips.p(i12, false);
            }
        }
        K2.d(this.itemView, true);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void qG(@Y61.l String str) {
        ComponentContainer componentContainer = this.f202807h;
        if (str != null) {
            ComponentContainer.n(componentContainer, str, 2);
        } else {
            componentContainer.k();
        }
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void qH(boolean z12) {
        this.f202806g.setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void rY(@Y61.k ArrayList arrayList) {
        this.f202806g.setData(arrayList);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void ug(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f202801b, attributedText, null);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void vq(@Y61.k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f202805f, attributedText, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void wQ(@Y61.l Y41.l<? super String, G0> lVar) {
        this.f202813n = (N) lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void wW(@Y61.l Y41.l<? super String, G0> lVar) {
        this.f202815p = (N) lVar;
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void yy(int i12) {
        Chips chips = this.f202806g;
        if (i12 < 0) {
            chips.j();
        } else {
            Integer num = (Integer) C42745f0.G(chips.n());
            if (num == null || i12 != num.intValue()) {
                chips.p(i12, false);
            }
        }
        K2.d(this.itemView, true);
    }

    @Override // com.avito.android.mortgage.root.list.items.realty_object_details.q
    public final void zO(@Y61.l String str) {
        ComponentContainer componentContainer = this.f202809j;
        if (str != null) {
            ComponentContainer.n(componentContainer, str, 2);
        } else {
            componentContainer.k();
        }
    }

    /* compiled from: RealtyObjectDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/root/list/items/realty_object_details/s$a", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Chips.c {
        public a() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            Y41.l<? super b.a, G0> lVar = s.this.f202803d;
            if (lVar != null) {
                ((f) lVar).invoke((b.a) hVar);
            }
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void a(@Y61.k com.avito.android.lib.design.chips.h hVar) {
        }
    }

    /* compiled from: RealtyObjectDetailsView.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/mortgage/root/list/items/realty_object_details/s$b", "Lcom/avito/android/lib/design/chips/Chips$c;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Chips.c {
        public b() {
        }

        @Override // com.avito.android.lib.design.chips.Chips.c
        public final void b(@Y61.k com.avito.android.lib.design.chips.h hVar) {
            Y41.l<? super DetailsBlockOption, G0> lVar = s.this.f202811l;
            if (lVar != null) {
                ((h) lVar).invoke((DetailsBlockOption) hVar);
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
        public String f202822b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f202823c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s f202824d;

        public c(Input input, s sVar) {
            this.f202823c = input;
            this.f202824d = sVar;
            this.f202822b = input.getDeformattedText();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            ?? r02;
            String deformattedText = this.f202823c.getDeformattedText();
            if (L.f(deformattedText, this.f202822b)) {
                return;
            }
            s sVar = this.f202824d;
            if (sVar.f202816q && (r02 = sVar.f202813n) != 0) {
                r02.invoke(deformattedText);
            }
            this.f202822b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }

    /* compiled from: InputExtensions.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/avito/android/lib/design/input/l", "Landroid/text/TextWatcher;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements TextWatcher {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f202825b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Input f202826c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s f202827d;

        public d(Input input, s sVar) {
            this.f202826c = input;
            this.f202827d = sVar;
            this.f202825b = input.getDeformattedText();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Y61.l Editable editable) {
            ?? r02;
            String deformattedText = this.f202826c.getDeformattedText();
            if (L.f(deformattedText, this.f202825b)) {
                return;
            }
            s sVar = this.f202827d;
            if (sVar.f202818s && (r02 = sVar.f202815p) != 0) {
                r02.invoke(deformattedText);
            }
            this.f202825b = deformattedText;
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Y61.l CharSequence charSequence, int i12, int i13, int i14) {
        }
    }
}
