package com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.toggle.RadioButton;
import com.avito.android.printable_text.PrintableText;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ReasonView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/reasonslist/reason/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/stages_transition/item/reasonslist/reason/g;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f122935b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RadioButton f122936c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f122937d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public Y41.a<G0> f122938e;

    public i(@k View view) {
        super(view);
        this.f122935b = view.getContext();
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.reason_select);
        this.f122936c = radioButton;
        this.f122937d = (TextView) view.findViewById(R.id.reason_label);
        final int i12 = 0;
        view.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f122934c;

            {
                this.f122934c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        Y41.a<G0> aVar = this.f122934c.f122938e;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f122934c.f122938e;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        radioButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f122934c;

            {
                this.f122934c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        Y41.a<G0> aVar = this.f122934c.f122938e;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f122934c.f122938e;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.g
    public final void A3(@k PrintableText printableText) {
        this.f122937d.setText(printableText.k0(this.f122935b));
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.g
    public final void a(@k Y41.a<G0> aVar) {
        this.f122938e = aVar;
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.reasonslist.reason.g
    public final void setChecked(boolean z12) {
        RadioButton radioButton = this.f122936c;
        if (radioButton.isChecked() == z12) {
            return;
        }
        radioButton.setChecked(z12);
    }
}
