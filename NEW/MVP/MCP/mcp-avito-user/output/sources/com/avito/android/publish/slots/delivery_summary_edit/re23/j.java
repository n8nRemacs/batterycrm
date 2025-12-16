package com.avito.android.publish.slots.delivery_summary_edit.re23;

import Y61.k;
import Y61.l;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.publish.slots.delivery_summary_edit.item.m;
import com.avito.android.publish.slots.delivery_summary_edit.item.o;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import java.util.Collections;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PublishDeliverySummaryEditItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/slots/delivery_summary_edit/re23/j;", "LHj/c;", "Lcom/avito/android/publish/slots/delivery_summary_edit/re23/h;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j extends Hj.c implements h {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f243845t = 0;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final ViewGroup f243846m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final View f243847n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final ViewGroup f243848o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final ViewGroup f243849p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f243850q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f243851r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f243852s;

    /* compiled from: PublishDeliverySummaryEditItemView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ o f243854m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar) {
            super(0);
            this.f243854m = oVar;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            j jVar = j.this;
            ViewGroup viewGroup = jVar.f243846m;
            View view = jVar.f7656e;
            PrintableText printableTextF = com.avito.android.printable_text.b.f(view.getResources().getString(R.string.error_summary_toast_text));
            o oVar = this.f243854m;
            com.avito.android.component.toast.c.b(cVar, viewGroup, printableTextF, null, Collections.singletonList(new c.a.C3719a(view.getResources().getString(R.string.error_summary_button), false, null, new i(oVar), 6, null)), null, new f.c(oVar.f243820a), 0, ToastBarPosition.f181044b, null, false, false, null, null, 4010);
            return Boolean.TRUE;
        }
    }

    public j(@k ViewGroup viewGroup, @k View view, @k com.avito.android.util.text.a aVar) {
        super(view, R.layout.publish_delivery_summary_edit_item_content, aVar);
        this.f243846m = viewGroup;
        this.f243847n = view;
        View viewFindViewById = this.f7656e.findViewById(R.id.delivery_summary_skeleton);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        this.f243848o = (ViewGroup) viewFindViewById;
        View viewFindViewById2 = this.f7656e.findViewById(R.id.delivery_summary_container);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById2;
        this.f243849p = viewGroup2;
        View viewFindViewById3 = viewGroup2.findViewById(R.id.summary_fee_block);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243850q = (DescriptionParameterItem) viewFindViewById3;
        View viewFindViewById4 = viewGroup2.findViewById(R.id.summary_discount_block);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243851r = (DescriptionParameterItem) viewFindViewById4;
        View viewFindViewById5 = viewGroup2.findViewById(R.id.summary_total_block);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem");
        }
        this.f243852s = (DescriptionParameterItem) viewFindViewById5;
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.re23.h
    public final void Dc() {
        View view = this.f243847n;
        view.setPadding(0, 0, 0, 0);
        D6.w(view);
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.re23.h
    public final void F7(@l m mVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = mVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243851r;
        D6.G(descriptionParameterItem, z12);
        if (mVar == null || (q12 = mVar.f243809a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.re23.h
    public final void K4(boolean z12) {
        this.f243848o.setVisibility(z12 ? 0 : 8);
        this.f243849p.setVisibility(z12 ? 8 : 0);
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.re23.h
    public final void X9(@l m mVar, @l w wVar, @k Y41.l<? super String, G0> lVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = mVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243850q;
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
            descriptionParameterItem.setLeftTextIconClickListener(new com.avito.android.publish.slots.delivery_summary_edit.item.j(wVar, mVar, 2));
        } else {
            descriptionParameterItem.setLeftTextIconClickListener(new com.avito.android.job.cv_info_actualization.ui.items.radio.g((Object) this, (Object) mVar, (Y41.l) lVar, 10));
        }
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f243850q.setLeftTextIconClickListener(null);
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.re23.h
    public final void o4(@k o oVar) {
        D6.C(new a(oVar), this.f243846m);
    }

    @Override // com.avito.android.publish.slots.delivery_summary_edit.re23.h
    public final void qb(@l m mVar) {
        Q<AttributedText, AttributedText> q12;
        boolean z12 = mVar != null;
        DescriptionParameterItem descriptionParameterItem = this.f243852s;
        D6.G(descriptionParameterItem, z12);
        if (mVar == null || (q12 = mVar.f243809a) == null) {
            return;
        }
        com.avito.android.util.text.j.c(descriptionParameterItem.getLeftTextView(), q12.f406619b, null);
        com.avito.android.util.text.j.c(descriptionParameterItem.getRightTextView(), q12.f406620c, null);
    }
}
