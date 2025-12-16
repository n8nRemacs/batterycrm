package com.avito.android.blueprints.publish.select.inline;

import Y61.l;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.toggle.Checkbox;
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
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CheckboxSelectItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/select/inline/k;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/publish/select/inline/h;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class k extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f106486i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f106487b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f106488c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Checkbox f106489d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ImageView f106490e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ComponentContainer f106491f;

    /* renamed from: g, reason: collision with root package name */
    public final int f106492g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.tooltip.k f106493h;

    /* compiled from: CheckboxSelectItemView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f106494a;

        static {
            int[] iArr = new int[TipIconParameters.Position.values().length];
            try {
                iArr[TipIconParameters.Position.INLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f106494a = iArr;
        }
    }

    /* compiled from: CheckboxSelectItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<o, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f106495l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f106495l = str;
        }

        @Override // Y41.l
        public final G0 invoke(o oVar) {
            oVar.b(this.f106495l);
            return G0.f406611a;
        }
    }

    public k(@Y61.k View view) {
        super(view);
        this.f106487b = view;
        View viewFindViewById = view.findViewById(R.id.text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f106488c = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.checkbox);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.toggle.Checkbox");
        }
        this.f106489d = (Checkbox) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.tip_action);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }
        this.f106490e = (ImageView) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.container);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.component_container.ComponentContainer");
        }
        this.f106491f = (ComponentContainer) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.checkbox_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f106492g = view.getResources().getDimensionPixelSize(R.dimen.publish_checkbox_container_vertical_padding);
        ((ViewGroup) viewFindViewById5).setOnClickListener(new com.avito.android.autoteka.presentation.reportGeneration.a(this, 18));
    }

    @Override // com.avito.android.blueprints.publish.select.inline.h
    public final void Bi(@l CharSequence charSequence) {
        this.f106491f.setTitle(charSequence);
    }

    @Override // com.avito.android.blueprints.publish.select.inline.h
    public final void H(@l CharSequence charSequence) {
        ComponentContainer.n(this.f106491f, charSequence, 2);
    }

    @Override // com.avito.android.blueprints.publish.select.inline.h
    public final void NZ(@Y61.k Y41.l<? super Boolean, G0> lVar) {
        this.f106489d.setOnCheckedChangeListener(new j(0, lVar));
    }

    @Override // com.avito.android.blueprints.publish.select.inline.h
    public final void Rd(@l String str) {
        com.avito.android.lib.design.tooltip.k kVar = this.f106493h;
        if (kVar != null) {
            kVar.dismiss();
        }
        this.f106493h = null;
        if (str == null) {
            return;
        }
        Checkbox checkbox = this.f106489d;
        com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(checkbox.getContext(), 0, 0, 6, null);
        kVar2.f181224j = new r.a(new i.a(new b.a()));
        int i12 = kVar2.f181229o;
        kVar2.f181228n = -1;
        kVar2.f181229o = i12;
        p.a(kVar2, new b(str));
        this.f106493h = kVar2.f(checkbox);
    }

    @Override // com.avito.android.blueprints.publish.select.inline.h
    public final void Z1(boolean z12) {
        this.f106489d.setChecked(z12);
    }

    @Override // com.avito.android.blueprints.publish.select.inline.h
    public final void b3(@l String str) {
        this.f106488c.setTextAppearance(C35835l0.j(L.f(str, FontStyleKt.BOLD) ? R.attr.textH5 : R.attr.textBody, this.f106487b.getContext()));
    }

    @Override // com.avito.android.blueprints.publish.select.inline.h
    @Y61.k
    public final Context getContext() {
        return this.f106487b.getContext();
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f106489d.setOnCheckedChangeListener(null);
    }

    @Override // com.avito.android.blueprints.publish.select.inline.h
    public final void qa(@l Y41.a<G0> aVar, @l TipIconParameters.Position position) {
        ImageView imageView = this.f106490e;
        ComponentContainer componentContainer = this.f106491f;
        if (aVar == null) {
            D6.w(imageView);
            imageView.setOnClickListener(new com.avito.android.blueprint.date.interval.j(18, null));
            componentContainer.setTitleTipListener(null);
        } else {
            if ((position == null ? -1 : a.f106494a[position.ordinal()]) != 1) {
                componentContainer.setTitleTipListener(aVar);
            } else {
                D6.H(imageView);
                imageView.setOnClickListener(new com.avito.android.blueprint.date.interval.j(18, aVar));
            }
        }
    }

    @Override // com.avito.android.blueprints.publish.select.inline.h
    public final void setTitle(@l String str) {
        I5.a(this.f106488c, str, false);
    }

    @Override // com.avito.android.blueprints.publish.select.inline.h
    public final void t00(@l Integer num, @l Integer num2) {
        ComponentContainer componentContainer = this.f106491f;
        int paddingStart = componentContainer.getPaddingStart();
        int iB2 = this.f106492g;
        int iB3 = num != null ? y6.b(num.intValue()) : iB2;
        int paddingEnd = componentContainer.getPaddingEnd();
        if (num2 != null) {
            iB2 = y6.b(num2.intValue());
        }
        componentContainer.setPadding(paddingStart, iB3, paddingEnd, iB2);
    }

    @Override // com.avito.android.blueprints.publish.select.inline.h
    public final void u(@l CharSequence charSequence) {
        this.f106491f.q(charSequence);
    }
}
