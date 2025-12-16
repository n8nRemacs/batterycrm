package com.avito.android.checkout.ui.items.service;

import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.y6;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckoutServiceItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/checkout/ui/items/service/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/checkout/ui/items/service/i;", "_avito_checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f118504i = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f118505b;

    /* renamed from: c, reason: collision with root package name */
    public final SimpleDraweeView f118506c;

    /* renamed from: d, reason: collision with root package name */
    public final DescriptionParameterItem f118507d;

    /* renamed from: e, reason: collision with root package name */
    public final ImageView f118508e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f118509f;

    /* renamed from: g, reason: collision with root package name */
    public final int f118510g;

    /* renamed from: h, reason: collision with root package name */
    public final int f118511h;

    public j(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f118505b = aVar;
        this.f118506c = (SimpleDraweeView) view.findViewById(R.id.checkout_service_icon);
        this.f118507d = (DescriptionParameterItem) view.findViewById(R.id.checkout_service_price);
        this.f118508e = (ImageView) view.findViewById(R.id.checkout_service_action);
        this.f118509f = (TextView) view.findViewById(R.id.checkout_service_description);
        this.f118510g = C35835l0.j(R.attr.textM20, view.getContext());
        this.f118511h = y6.b(12);
    }

    @Override // com.avito.android.checkout.ui.items.service.i
    public final void A5(@l wZ.l lVar) {
        C35949t5.c(this.f118506c, com.avito.android.image_loader.b.b(lVar != null ? lVar.a(this.itemView.getContext()) : null), null, null, null, 14);
    }

    @Override // com.avito.android.checkout.ui.items.service.i
    public final void Ok(@Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2) {
        int i12 = this.f118510g;
        DescriptionParameterItem descriptionParameterItem = this.f118507d;
        descriptionParameterItem.setAppearance(i12);
        com.avito.android.lib.design.text_view.a leftTextView = descriptionParameterItem.getLeftTextView();
        com.avito.android.util.text.a aVar = this.f118505b;
        com.avito.android.util.text.j.a(leftTextView, attributedText, aVar);
        com.avito.android.util.text.j.a(descriptionParameterItem.getRightTextView(), attributedText2, aVar);
    }

    @Override // com.avito.android.checkout.ui.items.service.i
    public final void g(@l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f118509f, attributedText, this.f118505b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    @Override // com.avito.android.checkout.ui.items.service.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mD(@Y61.l com.avito.android.checkout.ui.items.service.a r10, boolean r11, @Y61.k Y41.a<kotlin.G0> r12) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L2d
            android.view.View r1 = r9.itemView     // Catch: java.lang.Exception -> L2d
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = r10.f118484b     // Catch: java.lang.Exception -> L2d
            int r1 = sK0.C48065c.c(r1, r2)     // Catch: java.lang.Exception -> L2d
            java.lang.String r10 = r10.f118483a     // Catch: java.lang.Exception -> L2d
            java.lang.Integer r10 = com.avito.android.lib.util.q.a(r10)     // Catch: java.lang.Exception -> L2d
            if (r10 == 0) goto L26
            android.view.View r2 = r9.itemView     // Catch: java.lang.Exception -> L2d
            android.content.Context r2 = r2.getContext()     // Catch: java.lang.Exception -> L2d
            int r10 = r10.intValue()     // Catch: java.lang.Exception -> L2d
            android.graphics.drawable.Drawable r10 = com.avito.android.util.C35835l0.h(r10, r2)     // Catch: java.lang.Exception -> L2d
            goto L27
        L26:
            r10 = r0
        L27:
            if (r10 == 0) goto L2d
            r10.setTint(r1)     // Catch: java.lang.Exception -> L2d
            goto L2e
        L2d:
            r10 = r0
        L2e:
            int r1 = r9.f118511h
            com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem r2 = r9.f118507d
            android.widget.ImageView r8 = r9.f118508e
            if (r10 != 0) goto L5c
            r8.setOnClickListener(r0)
            if (r11 == 0) goto L4c
            r10 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r10)
            r4 = 0
            r6 = 0
            r3 = 0
            r7 = 11
            com.avito.android.util.D6.c(r2, r3, r4, r5, r6, r7)
            com.avito.android.util.D6.w(r8)
            goto L78
        L4c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r6 = 0
            r3 = 0
            r7 = 11
            com.avito.android.util.D6.c(r2, r3, r4, r5, r6, r7)
            com.avito.android.util.D6.g(r8)
            goto L78
        L5c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r4 = 0
            r6 = 0
            r3 = 0
            r7 = 11
            com.avito.android.util.D6.c(r2, r3, r4, r5, r6, r7)
            r8.setImageDrawable(r10)
            com.avito.android.calltracking.item.m r10 = new com.avito.android.calltracking.item.m
            r11 = 13
            r10.<init>(r11, r12)
            r8.setOnClickListener(r10)
            com.avito.android.util.D6.H(r8)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.checkout.ui.items.service.j.mD(com.avito.android.checkout.ui.items.service.a, boolean, Y41.a):void");
    }

    @Override // com.avito.android.checkout.ui.items.service.i
    public final void y5(boolean z12) {
        DescriptionParameterItem descriptionParameterItem = this.f118507d;
        SimpleDraweeView simpleDraweeView = this.f118506c;
        if (z12) {
            simpleDraweeView.setAlpha(0.32f);
            descriptionParameterItem.setAlpha(0.32f);
        } else {
            simpleDraweeView.setAlpha(1.0f);
            descriptionParameterItem.setAlpha(1.0f);
        }
    }
}
