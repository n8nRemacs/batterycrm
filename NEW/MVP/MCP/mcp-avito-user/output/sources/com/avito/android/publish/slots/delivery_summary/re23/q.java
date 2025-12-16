package com.avito.android.publish.slots.delivery_summary.re23;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.list_item.ListItemSwitcher;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.slots.delivery_summary.item.t;
import com.avito.android.publish.slots.delivery_summary.item.x;
import com.avito.android.publish.slots.delivery_summary.item.z;
import com.avito.android.publish.slots.delivery_summary.view.DeliverySummarySnippet;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.O2;
import hf0.C40928a;
import java.util.Collections;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDeliverySummaryAddItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary/re23/q;", "LHj/c;", "Lcom/avito/android/publish/slots/delivery_summary/re23/n;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class q extends Hj.c implements n {

    /* renamed from: F, reason: collision with root package name */
    public static final /* synthetic */ int f243712F = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final TextView f243713A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243714B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243715C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final TextView f243716D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final ListItemSwitcher f243717E;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f243718m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f243719n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f243720o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f243721p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final DeliverySummarySnippet f243722q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final TextView f243723r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243724s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f243725t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243726u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243727v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final TextView f243728w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243729x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243730y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final TextView f243731z;

    /* compiled from: PublishDeliverySummaryAddItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.publish.slots.delivery_summary_edit.item.o f243733m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.publish.slots.delivery_summary_edit.item.o oVar) {
            super(0);
            this.f243733m = oVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            q qVar = q.this;
            ViewGroup viewGroup = qVar.f243718m;
            View view = qVar.f7656e;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(view.getResources().getString(R.string.error_summary_toast_text));
            com.avito.android.publish.slots.delivery_summary_edit.item.o oVar = this.f243733m;
            com.avito.android.component.toast.c.b(cVar, viewGroup, printableTextF, null, Collections.singletonList(new c.a.C3719a(view.getResources().getString(R.string.error_summary_button), false, null, new p(oVar), 6, null)), null, new f.c(oVar.f243820a), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4010);
            return Boolean.TRUE;
        }
    }

    public q(@Y61.k ViewGroup viewGroup, @Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view, R.layout.publish_delivery_summary_add_item_content, aVar);
        this.f243718m = viewGroup;
        this.f243719n = aVar;
        View viewFindViewById = this.f7656e.findViewById(R.id.delivery_summary_skeleton);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f243720o = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = this.f7656e.findViewById(R.id.delivery_summary_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        this.f243721p = viewGroup2;
        View viewFindViewById3 = viewGroup2.findViewById(R.id.summary_snippet);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.publish.slots.delivery_summary.view.DeliverySummarySnippet");
        }
        this.f243722q = (DeliverySummarySnippet) viewFindViewById3;
        View viewFindViewById4 = viewGroup2.findViewById(R.id.summary_delivery_title);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243723r = (TextView) viewFindViewById4;
        View viewFindViewById5 = viewGroup2.findViewById(R.id.summary_delivery_fee_block);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243724s = (DescriptionParameterItem) viewFindViewById5;
        View viewFindViewById6 = viewGroup2.findViewById(R.id.summary_delivery_fee_details_recycler);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.f243725t = (RecyclerView) viewFindViewById6;
        View viewFindViewById7 = viewGroup2.findViewById(R.id.summary_delivery_discount_block);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243726u = (DescriptionParameterItem) viewFindViewById7;
        View viewFindViewById8 = viewGroup2.findViewById(R.id.summary_delivery_total_block);
        if (viewFindViewById8 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243727v = (DescriptionParameterItem) viewFindViewById8;
        View viewFindViewById9 = viewGroup2.findViewById(R.id.summary_dbs_title);
        if (viewFindViewById9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243728w = (TextView) viewFindViewById9;
        View viewFindViewById10 = viewGroup2.findViewById(R.id.summary_dbs_fee_block);
        if (viewFindViewById10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243729x = (DescriptionParameterItem) viewFindViewById10;
        View viewFindViewById11 = viewGroup2.findViewById(R.id.summary_dbs_total_block);
        if (viewFindViewById11 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243730y = (DescriptionParameterItem) viewFindViewById11;
        View viewFindViewById12 = viewGroup2.findViewById(R.id.summary_dbs_additional_info);
        if (viewFindViewById12 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243731z = (TextView) viewFindViewById12;
        View viewFindViewById13 = viewGroup2.findViewById(R.id.summary_cnc_title);
        if (viewFindViewById13 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f243713A = (TextView) viewFindViewById13;
        View viewFindViewById14 = viewGroup2.findViewById(R.id.summary_cnc_fee_block);
        if (viewFindViewById14 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243714B = (DescriptionParameterItem) viewFindViewById14;
        View viewFindViewById15 = viewGroup2.findViewById(R.id.summary_cnc_total_block);
        if (viewFindViewById15 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243715C = (DescriptionParameterItem) viewFindViewById15;
        View viewFindViewById16 = viewGroup2.findViewById(R.id.summary_agreement_text);
        if (viewFindViewById16 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById16;
        this.f243716D = textView;
        View viewFindViewById17 = viewGroup2.findViewById(R.id.add_fee_to_price_switcher);
        if (viewFindViewById17 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.list_item.ListItemSwitcher");
        }
        this.f243717E = (ListItemSwitcher) viewFindViewById17;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void H9(@Y61.l x xVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = xVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243730y;
        D6.G(descriptionParameterItem, z12);
        if (xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void Jd(@Y61.l x xVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = xVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243726u;
        D6.G(descriptionParameterItem, z12);
        if (xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void O6(@Y61.k Y41.l lVar, @Y61.l List list) {
        boolean zA2 = O2.a(list);
        RecyclerView recyclerView = this.f243725t;
        D6.G(recyclerView, zA2);
        if (list != null) {
            C40928a c40928a = new C40928a(lVar, list);
            recyclerView.l(new hf0.d(), -1);
            recyclerView.setAdapter(c40928a);
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void Oa(@Y61.l AttributedText attributedText) {
        boolean z12 = attributedText != null;
        TextView textView = this.f243731z;
        D6.G(textView, z12);
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void RT(@Y61.l com.avito.android.publish.slots.delivery_summary.view.a aVar) {
        if (aVar != null) {
            this.f243722q.setState(aVar);
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void W5(@Y61.l AttributedText attributedText) {
        boolean z12 = attributedText != null;
        TextView textView = this.f243713A;
        D6.G(textView, z12);
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void ab(@Y61.l AttributedText attributedText) {
        boolean z12 = attributedText != null;
        TextView textView = this.f243728w;
        D6.G(textView, z12);
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void ac(@Y61.l x xVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = xVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243727v;
        D6.G(descriptionParameterItem, z12);
        if (xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void bb(@Y61.l x xVar, @Y61.l w wVar, @Y61.k Y41.l<? super String, G0> lVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = xVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243724s;
        D6.G(descriptionParameterItem, z12);
        if (xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
        DeepLink deepLink = xVar.f243635b;
        if (deepLink == null && xVar.f243636c == null) {
            D6.w(descriptionParameterItem.getIcon());
        } else if (deepLink != null) {
            descriptionParameterItem.setLeftTextIconClickListener(new t(wVar, xVar, 4));
        } else {
            descriptionParameterItem.setLeftTextIconClickListener(new o(this, xVar, lVar, 0));
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void cb(@Y61.l z zVar, @Y61.k Y41.l<? super Boolean, G0> lVar) {
        boolean z12 = zVar != null;
        ListItemSwitcher listItemSwitcher = this.f243717E;
        D6.G(listItemSwitcher, z12);
        if (zVar == null) {
            return;
        }
        listItemSwitcher.setTitle(this.f243719n.c(this.f7656e.getContext(), zVar.f243656c));
        listItemSwitcher.setOnClickListener(new com.avito.android.publish.slots.delivery_addresses.f(2, (Object) lVar, (Object) this));
        listItemSwitcher.setChecked(zVar.f243658e);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void f9(@Y61.l x xVar, @Y61.l w wVar, @Y61.k Y41.l<? super String, G0> lVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = xVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243714B;
        D6.G(descriptionParameterItem, z12);
        if (xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
        DeepLink deepLink = xVar.f243635b;
        if (deepLink == null && xVar.f243636c == null) {
            D6.w(descriptionParameterItem.getIcon());
        } else if (deepLink != null) {
            descriptionParameterItem.setLeftTextIconClickListener(new t(wVar, xVar, 5));
        } else {
            descriptionParameterItem.setLeftTextIconClickListener(new o(this, xVar, lVar, 1));
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f243725t.setAdapter(null);
        this.f243724s.setLeftTextIconClickListener(null);
        this.f243729x.setLeftTextIconClickListener(null);
        this.f243714B.setLeftTextIconClickListener(null);
        this.f243717E.setOnClickListener(null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void l8(@Y61.l AttributedText attributedText) {
        boolean z12 = attributedText != null;
        TextView textView = this.f243723r;
        D6.G(textView, z12);
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void nX(@Y61.k com.avito.android.publish.slots.delivery_summary_edit.item.o oVar) {
        D6.C(new a(oVar), this.f243718m);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void setLoading(boolean z12) {
        this.f243720o.setVisibility(z12 ? 0 : 8);
        this.f243721p.setVisibility(z12 ? 8 : 0);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void u2(@Y61.l AttributedText attributedText) {
        boolean z12 = attributedText != null;
        TextView textView = this.f243716D;
        D6.G(textView, z12);
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void xb(@Y61.l x xVar, @Y61.l w wVar, @Y61.k Y41.l<? super String, G0> lVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = xVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243729x;
        D6.G(descriptionParameterItem, z12);
        if (xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
        DeepLink deepLink = xVar.f243635b;
        if (deepLink == null && xVar.f243636c == null) {
            D6.w(descriptionParameterItem.getIcon());
        } else if (deepLink != null) {
            descriptionParameterItem.setLeftTextIconClickListener(new t(wVar, xVar, 6));
        } else {
            descriptionParameterItem.setLeftTextIconClickListener(new o(this, xVar, lVar, 2));
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary.re23.n
    public final void y8(@Y61.l x xVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = xVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243715C;
        D6.G(descriptionParameterItem, z12);
        if (xVar == null || (q12 = xVar.f243634a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }
}
