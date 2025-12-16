package com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert;

import Y41.l;
import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import wZ.C49578b;

/* compiled from: FeesMethodsV2AlertItemView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/alert/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/fees_methods/screen/fees_methods_v2/ui/items/alert/i;", "_avito_fees-methods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f158320i = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f158321b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f158322c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f158323d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final TextView f158324e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final LinearLayout f158325f;

    /* renamed from: g, reason: collision with root package name */
    public final int f158326g;

    /* renamed from: h, reason: collision with root package name */
    public final int f158327h;

    public j(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f158321b = aVar;
        this.f158322c = (Banner) view;
        View viewFindViewById = view.findViewById(R.id.fees_methods_v2_alert_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158323d = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.fees_methods_v2_alert_description);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f158324e = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.fees_methods_v2_alert_actions);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f158325f = (LinearLayout) viewFindViewById3;
        this.f158326g = R.attr.buttonOverlayPrimaryMedium;
        this.f158327h = y6.b(12);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert.i
    public final void Q2(@k l lVar, @Y61.l List list) {
        LinearLayout linearLayout = this.f158325f;
        linearLayout.removeAllViews();
        if (list != null) {
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                C49578b c49578b = (C49578b) obj;
                Button button = new Button(this.itemView.getContext(), null, this.f158326g, 0, 10, null);
                com.avito.android.mnz_common.extensions.i.b(button, c49578b);
                button.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(14, c49578b, lVar));
                linearLayout.addView(button, new LinearLayout.LayoutParams(-2, -2));
                if (i12 > 0) {
                    D6.c(button, null, Integer.valueOf(this.f158327h), null, null, 13);
                }
                i12 = i13;
            }
        }
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert.i
    public final void g(@k AttributedText attributedText) {
        com.avito.android.util.text.j.c(this.f158324e, attributedText, this.f158321b);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert.i
    public final void j0(int i12) {
        this.f158322c.setAppearanceFromAttr(i12);
    }

    @Override // com.avito.android.fees_methods.screen.fees_methods_v2.ui.items.alert.i
    public final void setTitle(@k String str) {
        this.f158323d.setText(str);
    }
}
