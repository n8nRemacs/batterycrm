package com.avito.android.blueprints.job_multigeo_address;

import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.button.Button;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: JobMultiGeoView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/blueprints/job_multigeo_address/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/blueprints/job_multigeo_address/n;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f106023n = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f106024b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f106025c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final LinearLayout f106026d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Badge f106027e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final TextView f106028f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final TextView f106029g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f106030h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Button f106031i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final TextView f106032j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f106033k;

    /* renamed from: l, reason: collision with root package name */
    public final LayoutInflater f106034l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f106035m;

    public o(@Y61.k View view) {
        super(view);
        this.f106024b = view;
        this.f106025c = (TextView) view.findViewById(R.id.mg_title);
        View viewFindViewById = view.findViewById(R.id.mg_title_container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f106026d = (LinearLayout) viewFindViewById;
        this.f106027e = (Badge) view.findViewById(R.id.mg_label);
        this.f106028f = (TextView) view.findViewById(R.id.mg_subtitle);
        this.f106029g = (TextView) view.findViewById(R.id.mg_description);
        this.f106030h = (ViewGroup) view.findViewById(R.id.mg_items_container);
        this.f106031i = (Button) view.findViewById(R.id.mg_button);
        this.f106032j = (TextView) view.findViewById(R.id.mg_warning_text);
        this.f106033k = (TextView) view.findViewById(R.id.mg_error_text);
        this.f106034l = LayoutInflater.from(view.getContext());
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void HS(@Y61.l Boolean bool) {
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        this.f106026d.setVisibility(!zBooleanValue ? 0 : 8);
        this.f106025c.setVisibility(zBooleanValue ? 8 : 0);
        View view = this.f106024b;
        view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), 0);
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void Ia(@Y61.l String str) {
        boolean z12 = true ^ (str == null || C43066x.K(str));
        Badge badge = this.f106027e;
        D6.G(badge, z12);
        if (str == null) {
            str = "";
        }
        badge.setTitleText(str);
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void JF(boolean z12) {
        this.f106031i.setEnabled(z12);
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void KG(@Y61.l List<ParameterElement.q.a> list, @Y61.l String str, @Y61.l Integer num, @Y61.k Y41.l<? super ParameterElement.q.a, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.k JobMultiGeoLink.FlowType flowType) {
        ViewGroup viewGroup = this.f106030h;
        viewGroup.removeAllViews();
        D6.G(viewGroup, list != null ? !list.isEmpty() : false);
        LayoutInflater layoutInflater = this.f106034l;
        if (list != null) {
            int i12 = 0;
            for (ParameterElement.q.a aVar2 : list) {
                int i13 = i12 + 1;
                layoutInflater.inflate(R.layout.job_multigeo_address_item_layout, viewGroup, true);
                View childAt = viewGroup.getChildAt(i12);
                if (childAt != null) {
                    TextView textView = (TextView) childAt.findViewById(R.id.mg_address_title);
                    if (textView != null) {
                        I5.a(textView, aVar2.f117524c, false);
                    }
                    childAt.setOnClickListener(new com.avito.android.advertising.adapter.items.buzzoola.media_x2.d(29, lVar, aVar2));
                }
                i12 = i13;
            }
        }
        if (num != null) {
            layoutInflater.inflate(R.layout.job_multigeo_address_show_all_layout, viewGroup, true);
            View childAt2 = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (childAt2 != null) {
                childAt2.setOnClickListener(new com.avito.android.blueprint.date.interval.j(11, aVar));
                if (flowType == JobMultiGeoLink.FlowType.f206968c) {
                    View viewFindViewById = childAt2.findViewById(R.id.mg_show_all_icon);
                    if (viewFindViewById != null) {
                        D6.w(viewFindViewById);
                    }
                    TextView textView2 = (TextView) childAt2.findViewById(R.id.mg_show_all_title);
                    if (textView2 != null) {
                        I5.a(textView2, str == null ? childAt2.getContext().getString(R.string.multigeo_bottomsheet_default_title) : str, false);
                    }
                } else {
                    View viewFindViewById2 = childAt2.findViewById(R.id.mg_show_all_icon);
                    if (viewFindViewById2 != null) {
                        D6.H(viewFindViewById2);
                    }
                    TextView textView3 = (TextView) childAt2.findViewById(R.id.mg_show_all_title);
                    if (textView3 != null) {
                        I5.a(textView3, childAt2.getContext().getResources().getQuantityString(R.plurals.n_addresses, num.intValue(), num), false);
                    }
                }
            }
        }
        if (flowType == JobMultiGeoLink.FlowType.f206968c) {
            return;
        }
        if (O2.a(list)) {
            D6.c(this.f106031i, null, Integer.valueOf(y6.b(18)), null, null, 13);
        } else {
            D6.c(this.f106031i, null, Integer.valueOf(y6.b(22)), null, null, 13);
        }
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void KX(@Y61.k Y41.a<G0> aVar) {
        this.f106031i.setOnClickListener(new com.avito.android.blueprint.date.interval.j(10, aVar));
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void RO(@Y61.l AttributedText attributedText) {
        TextView textView = this.f106032j;
        com.avito.android.util.text.j.a(textView, attributedText, null);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void Re(@Y61.l String str) {
        I5.a(this.f106033k, str, false);
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void V3(@Y61.l CharSequence charSequence) {
        I5.a(this.f106025c, charSequence, false);
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void h5(@Y61.k Y41.a<G0> aVar) {
        this.f106035m = aVar;
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void j(@Y61.l String str) {
        I5.a(this.f106028f, str, false);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f106035m;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void kZ(@Y61.l String str) {
        com.avito.android.lib.design.button.b.a(this.f106031i, str, false);
    }

    @Override // com.avito.android.blueprints.job_multigeo_address.n
    public final void q(@Y61.l AttributedText attributedText) {
        MovementMethod linkMovementMethod = LinkMovementMethod.getInstance();
        TextView textView = this.f106029g;
        textView.setMovementMethod(linkMovementMethod);
        com.avito.android.util.text.j.a(textView, attributedText, null);
    }
}
