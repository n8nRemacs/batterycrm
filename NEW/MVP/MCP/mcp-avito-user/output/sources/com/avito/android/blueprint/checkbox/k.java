package com.avito.android.blueprint.checkbox;

import Ba.ViewOnClickListenerC13121a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.Checkbox;
import com.avito.android.lib.design.toggle.ToggleState;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.o;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.category_parameters.TipIconParameters;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishCheckboxView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprint/checkbox/k;", "LHj/c;", "Lcom/avito/android/blueprint/checkbox/j;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends Hj.c implements j {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f105399r = 0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f105400m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final TextView f105401n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final Checkbox f105402o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ImageView f105403p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.tooltip.k f105404q;

    /* compiled from: PublishCheckboxView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f105405l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f105405l = str;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            oVar.b(this.f105405l);
            return G0.f406611a;
        }
    }

    public k(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view, R.layout.view_publish_checkbox_content, aVar);
        this.f105400m = view;
        View viewFindViewById = this.f7656e.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f105401n = (TextView) viewFindViewById;
        View viewFindViewById2 = this.f7656e.findViewById(R.id.checkbox);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        this.f105402o = (Checkbox) viewFindViewById2;
        View viewFindViewById3 = this.f7656e.findViewById(R.id.tip_action);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f105403p = (ImageView) viewFindViewById3;
        View viewFindViewById4 = this.f7656e.findViewById(R.id.checkbox_container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ((ViewGroup) viewFindViewById4).setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 17));
    }

    @Override // com.avito.android.blueprint.checkbox.j
    public final void Rd(@Y61.l String str) {
        com.avito.android.lib.design.tooltip.k kVar = this.f105404q;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f105404q = null;
        if (str == null) {
            return;
        }
        Checkbox checkbox = this.f105402o;
        com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(checkbox.getContext(), 0, 0, 6, null);
        kVar2.f181224j = new r.a(new i.a(new b.a()));
        int i12 = kVar2.f181229o;
        kVar2.f181228n = -1;
        kVar2.f181229o = i12;
        p.a(kVar2, new a(str));
        this.f105404q = kVar2.f(checkbox);
    }

    @Override // com.avito.android.blueprint.checkbox.j
    public final void b3(@Y61.l String str) {
        this.f105401n.setTextAppearance(C35835l0.j(L.f(str, FontStyleKt.BOLD) ? R.attr.textH5 : R.attr.textBody, this.f105400m.getContext()));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f105402o.setOnCheckedChangeListener(null);
    }

    @Override // com.avito.android.blueprint.checkbox.j
    public final void kt(@Y61.k ToggleState toggleState) {
        this.f105402o.setState(toggleState);
    }

    @Override // com.avito.android.blueprint.checkbox.j
    public final void qa(@Y61.l Y41.a<G0> aVar, @Y61.l TipIconParameters.Position position) {
        ImageView imageView = this.f105403p;
        if (aVar == null) {
            D6.w(imageView);
        } else {
            D6.H(imageView);
        }
        imageView.setOnClickListener(new ViewOnClickListenerC13121a(21, aVar));
    }

    @Override // com.avito.android.blueprint.checkbox.j
    public final void setTitle(@Y61.l String str) {
        I5.a(this.f105401n, str, false);
    }
}
