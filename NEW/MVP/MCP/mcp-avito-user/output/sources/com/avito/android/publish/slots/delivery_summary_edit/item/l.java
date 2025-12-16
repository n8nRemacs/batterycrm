package com.avito.android.publish.slots.delivery_summary_edit.item;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.constraintlayout.widget.Group;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: DeliverySummaryEditItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/item/l;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/publish/slots/delivery_summary_edit/item/i;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class l extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f243796l = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f243797b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f243798c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ShimmerLayout f243799d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Group f243800e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final ViewGroup f243801f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243802g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243803h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243804i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final DescriptionParameterItem f243805j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final TextView f243806k;

    /* compiled from: DeliverySummaryEditItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ o f243808m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar) {
            super(0);
            this.f243808m = oVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            l lVar = l.this;
            ViewGroup viewGroup = lVar.f243797b;
            View view = lVar.f243798c;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(view.getResources().getString(R.string.error_summary_toast_text));
            o oVar = this.f243808m;
            com.avito.android.component.toast.c.b(cVar, viewGroup, printableTextF, null, Collections.singletonList(new c.a.C3719a(view.getResources().getString(R.string.error_summary_button), false, null, new k(oVar), 6, null)), null, new f.c(oVar.f243820a), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4010);
            return Boolean.TRUE;
        }
    }

    public l(@Y61.k View view, @Y61.k ViewGroup viewGroup) {
        super(view);
        this.f243797b = viewGroup;
        this.f243798c = view;
        View viewFindViewById = view.findViewById(R.id.delivery_summary_skeleton);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.skeleton.shimmer.ShimmerLayout");
        }
        ShimmerLayout shimmerLayout = (ShimmerLayout) viewFindViewById;
        this.f243799d = shimmerLayout;
        this.f243800e = (Group) shimmerLayout.findViewById(R.id.delivery_summary_advert_info_group);
        View viewFindViewById2 = view.findViewById(R.id.delivery_summary_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        this.f243801f = viewGroup2;
        View viewFindViewById3 = viewGroup2.findViewById(R.id.summary_fee_block);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243802g = (DescriptionParameterItem) viewFindViewById3;
        View viewFindViewById4 = viewGroup2.findViewById(R.id.summary_fbs_fee_block);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243803h = (DescriptionParameterItem) viewFindViewById4;
        View viewFindViewById5 = viewGroup2.findViewById(R.id.summary_discount_block);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243804i = (DescriptionParameterItem) viewFindViewById5;
        View viewFindViewById6 = viewGroup2.findViewById(R.id.summary_total_block);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243805j = (DescriptionParameterItem) viewFindViewById6;
        View viewFindViewById7 = viewGroup2.findViewById(R.id.summary_agreement_text);
        if (viewFindViewById7 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById7;
        this.f243806k = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.item.i
    public final void F7(@Y61.l m mVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = mVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243804i;
        D6.G(descriptionParameterItem, z12);
        if (mVar == null || (q12 = mVar.f243809a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.item.i
    public final void K4(boolean z12) {
        Group group = this.f243800e;
        if (group != null) {
            group.setVisibility(8);
        }
        this.f243799d.setVisibility(z12 ? 0 : 8);
        this.f243801f.setVisibility(z12 ? 8 : 0);
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.item.i
    public final void X9(@Y61.l m mVar, @Y61.l w wVar, @Y61.k Y41.l<? super String, G0> lVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = mVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243802g;
        D6.G(descriptionParameterItem, z12);
        if (mVar == null || (q12 = mVar.f243809a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
        DeepLink deepLink = mVar.f243810b;
        if (deepLink == null && mVar.f243811c == null) {
            D6.w(descriptionParameterItem.getIcon());
        } else if (deepLink != null) {
            descriptionParameterItem.setLeftTextIconClickListener(new j(wVar, mVar, 1));
        } else {
            descriptionParameterItem.setLeftTextIconClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g((Object) this, (Object) mVar, (Y41.l) lVar, 9));
        }
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.item.i
    public final void o4(@Y61.k o oVar) {
        D6.C(new a(oVar), this.f243797b);
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.item.i
    public final void qb(@Y61.l m mVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = mVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243805j;
        D6.G(descriptionParameterItem, z12);
        if (mVar == null || (q12 = mVar.f243809a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.item.i
    public final void u2(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f243806k, attributedText, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.item.i
    public final void wp(@Y61.l m mVar, @Y61.l w wVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = mVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243803h;
        D6.G(descriptionParameterItem, z12);
        if (mVar == null || (q12 = mVar.f243809a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
        if (mVar.f243810b != null) {
            descriptionParameterItem.setLeftTextIconClickListener(new j(wVar, mVar, 0));
        }
    }
}
