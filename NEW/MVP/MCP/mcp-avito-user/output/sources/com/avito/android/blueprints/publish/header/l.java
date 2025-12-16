package com.avito.android.blueprints.publish.header;

import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.tooltip.b;
import com.avito.android.lib.design.tooltip.i;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.r;
import com.avito.android.remote.model.search.Theme;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/publish/header/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/publish/header/j;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l extends com.avito.konveyor.adapter.b implements j {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f106220b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final ViewGroup f106221c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextView f106222d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TextView f106223e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final View f106224f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f106225g;

    /* renamed from: h, reason: collision with root package name */
    public final int f106226h;

    /* renamed from: i, reason: collision with root package name */
    public final int f106227i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.lib.design.tooltip.f f106228j;

    /* renamed from: k, reason: collision with root package name */
    public final int f106229k;

    /* renamed from: l, reason: collision with root package name */
    public final int f106230l;

    /* renamed from: m, reason: collision with root package name */
    public final int f106231m;

    /* renamed from: n, reason: collision with root package name */
    public final int f106232n;

    /* renamed from: o, reason: collision with root package name */
    public final int f106233o;

    /* renamed from: p, reason: collision with root package name */
    public final int f106234p;

    /* compiled from: HeaderItemView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/tooltip/k;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/tooltip/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<com.avito.android.lib.design.tooltip.k, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f106235l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l f106236m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f106237n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, l lVar, Y41.a<G0> aVar) {
            super(1);
            this.f106235l = str;
            this.f106236m = lVar;
            this.f106237n = aVar;
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.lib.design.tooltip.k kVar) {
            com.avito.android.lib.design.tooltip.k kVar2 = kVar;
            kVar2.f181224j = new r.d(new i.c(new b.c()));
            int i12 = kVar2.f181229o;
            kVar2.f181228n = -1;
            kVar2.f181229o = i12;
            p.a(kVar2, new k(this.f106235l));
            int i13 = 2;
            kVar2.setOnDismissListener(new com.avito.android.advert.item.service_booking.i(i13, this.f106236m, this.f106237n));
            return G0.f406611a;
        }
    }

    /* compiled from: HeaderItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            l lVar = l.this;
            return Integer.valueOf(lVar.f106222d.getTop() + lVar.f106225g.getTop());
        }
    }

    /* compiled from: HeaderItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<Integer> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Integer invoke() {
            l lVar = l.this;
            return Integer.valueOf(lVar.f106225g.getBottom() - (lVar.f106225g.getHeight() - lVar.f106222d.getBottom()));
        }
    }

    public l(@Y61.k View view, @Y61.l ViewGroup viewGroup, boolean z12) {
        super(view);
        this.f106220b = z12;
        this.f106221c = viewGroup;
        View viewFindViewById = view.findViewById(R.id.header_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        this.f106222d = textView;
        View viewFindViewById2 = view.findViewById(R.id.subtitle_text);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f106223e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.header_divider);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f106224f = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.header_container);
        this.f106225g = viewFindViewById4;
        this.f106226h = viewFindViewById4.getPaddingTop();
        this.f106227i = viewFindViewById4.getPaddingBottom();
        RecyclerView recyclerView = viewGroup instanceof RecyclerView ? (RecyclerView) viewGroup : null;
        this.f106228j = recyclerView != null ? new com.avito.android.lib.design.tooltip.f(recyclerView, textView, 4, 4, new b(), new c()) : null;
        this.f106229k = D6.t(view, R.dimen.publish_container_horizontal_padding);
        this.f106230l = D6.t(view, R.dimen.publish_container_horizontal_padding_redesign);
        this.f106231m = D6.t(view, R.dimen.publish_toolbar_bottom_padding);
        this.f106232n = D6.t(view, R.dimen.publish_toolbar_bottom_padding_redesign);
        this.f106233o = y6.b(0);
        this.f106234p = D6.t(view, R.dimen.publish_toolbar_title_top_padding);
    }

    public final void Ap(@Y61.l String str, @Y61.l String str2) {
        I5.a(this.f106222d, str, false);
    }

    @Override // com.avito.android.blueprints.publish.header.j
    public final void P8(@Y61.l Integer num, @Y61.l Integer num2) {
        View view = this.f106225g;
        D6.f(this.f106225g, 0, num != null ? D6.j(view, num.intValue()) : this.f106226h, 0, num2 != null ? D6.j(view, num2.intValue()) : this.f106227i, 5);
    }

    @Override // com.avito.android.blueprints.publish.header.j
    public final void T6(@Y61.k String str, @Y61.k Y41.a<G0> aVar) {
        com.avito.android.lib.design.tooltip.f fVar = this.f106228j;
        if (fVar != null) {
            fVar.c(new a(str, this, aVar), false);
        }
    }

    @Override // com.avito.android.blueprints.publish.header.j
    public final void V30(@Y61.l AttributedText attributedText, @Y61.k com.avito.android.util.text.a aVar) {
        this.f106225g.setTag(String.valueOf(aVar.c(this.itemView.getContext(), attributedText)));
    }

    @Override // com.avito.android.blueprints.publish.header.j
    public final void eF(@Y61.k HeaderItem headerItem) {
        Integer num = headerItem.f106199g;
        View view = this.f106225g;
        Integer numValueOf = num != null ? Integer.valueOf(D6.j(view, num.intValue())) : null;
        Integer num2 = headerItem.f106200h;
        Integer numValueOf2 = num2 != null ? Integer.valueOf(D6.j(view, num2.intValue())) : null;
        Theme.Companion companion = Theme.INSTANCE;
        Theme theme = headerItem.f106202j;
        boolean zIsAvitoRe23 = companion.isAvitoRe23(theme);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.itemView.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, theme != null ? theme.getResName() : null));
        int i12 = L.f(headerItem.f106203k, Boolean.TRUE) ? R.attr.textH30 : R.attr.textH10;
        if (!zIsAvitoRe23) {
            i12 = R.attr.textH2;
        }
        int i13 = zIsAvitoRe23 ? R.attr.textM20 : R.attr.textM2;
        TextView textView = this.f106223e;
        boolean zY2 = D6.y(textView);
        int iIntValue = this.f106231m;
        int iIntValue2 = zY2 ? this.f106232n : iIntValue;
        this.f106222d.setTextAppearance(C35835l0.j(i12, contextThemeWrapper));
        textView.setTextAppearance(C35835l0.j(i13, contextThemeWrapper));
        if (zIsAvitoRe23) {
            int iIntValue3 = numValueOf != null ? numValueOf.intValue() : this.f106233o;
            if (numValueOf2 != null) {
                iIntValue2 = numValueOf2.intValue();
            }
            int i14 = this.f106230l;
            view.setPadding(i14, iIntValue3, i14, iIntValue2);
            return;
        }
        int iIntValue4 = numValueOf != null ? numValueOf.intValue() : this.f106234p;
        if (numValueOf2 != null) {
            iIntValue = numValueOf2.intValue();
        }
        int i15 = this.f106229k;
        view.setPadding(i15, iIntValue4, i15, iIntValue);
    }

    public final void f(@Y61.l String str) {
        I5.a(this.f106223e, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        com.avito.android.lib.design.tooltip.f fVar = this.f106228j;
        if (fVar != null) {
            fVar.b();
        }
    }

    @Override // com.avito.android.blueprints.publish.header.j
    public final void k(@Y61.l AttributedText attributedText) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f106223e;
        textView.setMovementMethod(linkMovementMethod);
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.blueprints.publish.header.j
    public final void qK(boolean z12) {
        View view = this.f106224f;
        if (z12) {
            D6.H(view);
        } else if (this.f106220b) {
            D6.g(view);
        } else {
            D6.w(view);
        }
    }

    @Override // com.avito.android.blueprints.publish.header.j
    public final void vi(@Y61.l AttributedText attributedText, @Y61.l String str) {
        TextView textView = this.f106222d;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        if (str != null) {
            com.avito.android.lib.design.badge.e.a(textView, textView.getText(), str, "  ", R.style.Legacy_Badge_TextLarge, null, null);
        }
    }

    @Override // com.avito.android.blueprints.publish.header.j
    public final void zD() {
        TextView textView = this.f106222d;
        textView.setTextAppearance(C35835l0.j(R.attr.textH50, textView.getContext()));
    }

    public /* synthetic */ l(boolean z12, ViewGroup viewGroup, View view, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? null : viewGroup, (i12 & 1) != 0 ? false : z12);
    }
}
