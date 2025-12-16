package com.avito.android.cpt.activation.ui.items.dbs;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CptActivationDbsItemView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/cpt/activation/ui/items/dbs/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/cpt/activation/ui/items/dbs/h;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f126375g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f126376b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f126377c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f126378d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DescriptionParameterItem f126379e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final TextView f126380f;

    public i(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f126376b = aVar;
        this.f126377c = (TextView) view.findViewById(R.id.cpt_activation_dbs_title);
        this.f126378d = (DescriptionParameterItem) view.findViewById(R.id.cpt_activation_dbs_fee);
        this.f126379e = (DescriptionParameterItem) view.findViewById(R.id.cpt_activation_dbs_total);
        this.f126380f = (TextView) view.findViewById(R.id.cpt_activation_dbs_additional_info);
    }

    @Override // com.avito.android.cpt.activation.ui.items.dbs.h
    public final void J5(@l String str) {
        I5.a(this.f126379e.getRightTextView(), str, false);
    }

    @Override // com.avito.android.cpt.activation.ui.items.dbs.h
    public final void M3(@k AttributedText attributedText) {
        j.c(this.f126379e.getLeftTextView(), attributedText, this.f126376b);
    }

    @Override // com.avito.android.cpt.activation.ui.items.dbs.h
    public final void R3(@l String str) {
        I5.a(this.f126378d.getRightTextView(), str, false);
    }

    @Override // com.avito.android.cpt.activation.ui.items.dbs.h
    public final void b4(@l AttributedText attributedText, boolean z12, @l Y41.a<G0> aVar) {
        G0 g02 = null;
        DescriptionParameterItem descriptionParameterItem = this.f126378d;
        if (attributedText != null) {
            j.c(descriptionParameterItem.getLeftTextView(), attributedText, this.f126376b);
            if (z12) {
                D6.H(descriptionParameterItem.getIcon());
                descriptionParameterItem.setLeftTextIconClickListener(new com.avito.android.component.user_hat.items.k(5, aVar));
            } else {
                D6.w(descriptionParameterItem.getIcon());
                descriptionParameterItem.setLeftTextIconClickListener(null);
            }
            D6.H(descriptionParameterItem);
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(descriptionParameterItem);
        }
    }

    @Override // com.avito.android.cpt.activation.ui.items.dbs.h
    public final void e(@l AttributedText attributedText) {
        j.a(this.f126377c, attributedText, null);
    }

    @Override // com.avito.android.cpt.activation.ui.items.dbs.h
    public final void p4(@l AttributedText attributedText) {
        j.a(this.f126380f, attributedText, this.f126376b);
    }
}
