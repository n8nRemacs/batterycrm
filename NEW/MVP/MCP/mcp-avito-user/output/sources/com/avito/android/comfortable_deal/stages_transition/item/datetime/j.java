package com.avito.android.comfortable_deal.stages_transition.item.datetime;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DateTimeView.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comfortable_deal/stages_transition/item/datetime/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/comfortable_deal/stages_transition/item/datetime/h;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f122885b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f122886c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Input f122887d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Input f122888e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public Y41.a<G0> f122889f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public Y41.a<G0> f122890g;

    public j(@k View view) {
        super(view);
        this.f122885b = view.getContext();
        this.f122886c = (TextView) view.findViewById(R.id.date_time_label);
        Input input = (Input) view.findViewById(R.id.date_select);
        this.f122887d = input;
        Input input2 = (Input) view.findViewById(R.id.time_select);
        this.f122888e = input2;
        final int i12 = 0;
        input.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.stages_transition.item.datetime.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f122884c;

            {
                this.f122884c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i12) {
                    case 0:
                        Y41.a<G0> aVar = this.f122884c.f122889f;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f122884c.f122890g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
        final int i13 = 1;
        input2.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.comfortable_deal.stages_transition.item.datetime.i

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ j f122884c;

            {
                this.f122884c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i13) {
                    case 0:
                        Y41.a<G0> aVar = this.f122884c.f122889f;
                        if (aVar != null) {
                            aVar.invoke();
                            break;
                        }
                        break;
                    default:
                        Y41.a<G0> aVar2 = this.f122884c.f122890g;
                        if (aVar2 != null) {
                            aVar2.invoke();
                            break;
                        }
                        break;
                }
            }
        });
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.datetime.h
    public final void A3(@l PrintableText printableText) {
        String strK0 = printableText != null ? printableText.k0(this.f122885b) : null;
        TextView textView = this.f122886c;
        textView.setText(strK0);
        D6.G(textView, printableText != null);
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.datetime.h
    public final void S6(@l String str) {
        Input.t(this.f122888e, str, false, 6);
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.datetime.h
    public final void b0(@l String str) {
        Input.t(this.f122887d, str, false, 6);
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.datetime.h
    public final void d50(@k Y41.a<G0> aVar) {
        this.f122890g = aVar;
    }

    @Override // com.avito.android.comfortable_deal.stages_transition.item.datetime.h
    public final void rU(@k Y41.a<G0> aVar) {
        this.f122889f = aVar;
    }
}
