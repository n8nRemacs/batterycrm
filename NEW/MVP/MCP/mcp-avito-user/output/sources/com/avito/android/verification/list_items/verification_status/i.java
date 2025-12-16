package com.avito.android.verification.list_items.verification_status;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VerificationStatusItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/verification/list_items/verification_status/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/verification/list_items/verification_status/h;", "_avito_verification-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f324879h = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Banner f324880b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public TextView f324881c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public TextView f324882d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public TextView f324883e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public ImageView f324884f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Button f324885g;

    public i(@k View view) {
        super(view);
        this.f324880b = (Banner) view.findViewById(R.id.verification_status_item);
    }

    @Override // com.avito.android.verification.list_items.verification_status.h
    public final void c(@k Y41.a<G0> aVar) {
        Button button = this.f324885g;
        if (button != null) {
            button.setOnClickListener(new com.avito.android.vas_planning_checkout.item.checkout.i(10, aVar));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    @Override // com.avito.android.verification.list_items.verification_status.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dQ(@Y61.k com.avito.android.verification.list_items.verification_status.a r7) {
        /*
            r6 = this;
            com.avito.android.verification.list_items.verification_status.VerificationStatusItemState r0 = r7.f324865d
            com.avito.android.verification.list_items.verification_status.VerificationStatusItemStyle r1 = r0.f324856c
            int r1 = r1.f324862b
            com.avito.android.lib.design.banner.Banner r2 = r6.f324880b
            r3 = 2131563244(0x7f0d12ec, float:1.875194E38)
            r2.i(r3, r1)
            android.view.View r1 = r6.itemView
            r2 = 2131373312(0x7f0a2d00, float:1.8366712E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r6.f324881c = r1
            android.view.View r1 = r6.itemView
            r2 = 2131373308(0x7f0a2cfc, float:1.8366704E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            r6.f324882d = r1
            android.view.View r1 = r6.itemView
            r2 = 2131373311(0x7f0a2cff, float:1.836671E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            r6.f324883e = r1
            android.view.View r1 = r6.itemView
            r2 = 2131373310(0x7f0a2cfe, float:1.8366708E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r6.f324884f = r1
            android.view.View r1 = r6.itemView
            r2 = 2131373309(0x7f0a2cfd, float:1.8366706E38)
            android.view.View r1 = r1.findViewById(r2)
            com.avito.android.lib.design.button.Button r1 = (com.avito.android.lib.design.button.Button) r1
            r6.f324885g = r1
            android.widget.TextView r1 = r6.f324881c
            if (r1 != 0) goto L62
            goto L67
        L62:
            java.lang.String r2 = r7.f324864c
            r1.setText(r2)
        L67:
            android.widget.TextView r1 = r6.f324882d
            r2 = 0
            if (r1 == 0) goto L71
            com.avito.android.remote.model.text.AttributedText r3 = r7.f324866e
            com.avito.android.util.text.j.a(r1, r3, r2)
        L71:
            android.widget.TextView r1 = r6.f324883e
            if (r1 == 0) goto L7a
            com.avito.android.remote.model.text.AttributedText r3 = r7.f324867f
            com.avito.android.util.text.j.a(r1, r3, r2)
        L7a:
            com.avito.android.lib.design.button.Button r1 = r6.f324885g
            r3 = 1
            if (r1 == 0) goto L8e
            java.lang.String r4 = r7.f324868g
            if (r4 == 0) goto L85
            r5 = r3
            goto L86
        L85:
            r5 = 0
        L86:
            com.avito.android.util.D6.G(r1, r5)
            if (r4 == 0) goto L8e
            r1.setText(r4)
        L8e:
            com.avito.android.verification.list_items.verification_status.VerificationStatusItemIcon r0 = r0.f324855b
            if (r0 == 0) goto La1
            android.widget.ImageView r1 = r6.f324884f
            if (r1 == 0) goto L9e
            int r0 = r0.f324848b
            r1.setImageResource(r0)
            kotlin.G0 r0 = kotlin.G0.f406611a
            goto L9f
        L9e:
            r0 = r2
        L9f:
            if (r0 != 0) goto Laa
        La1:
            android.widget.ImageView r0 = r6.f324884f
            if (r0 == 0) goto Laa
            r0.setImageDrawable(r2)
            kotlin.G0 r0 = kotlin.G0.f406611a
        Laa:
            boolean r7 = r7.f324870i
            r7 = r7 ^ r3
            com.avito.android.lib.design.button.Button r0 = r6.f324885g
            if (r0 != 0) goto Lb2
            goto Lb5
        Lb2:
            r0.setEnabled(r7)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.verification.list_items.verification_status.i.dQ(com.avito.android.verification.list_items.verification_status.a):void");
    }
}
