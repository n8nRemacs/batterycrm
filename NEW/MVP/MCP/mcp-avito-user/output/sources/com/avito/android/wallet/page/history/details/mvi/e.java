package com.avito.android.wallet.page.history.details.mvi;

import SO0.a;
import SO0.d;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.description_list.parameter_line.item.DescriptionParameterItem;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.y6;
import com.avito.android.wallet.page.history.details.mvi.PaymentHistoryDetailsFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: PaymentHistoryDetailsFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class e extends H implements Y41.l<SO0.c, G0> {
    public final void f(@Y61.k SO0.c cVar) {
        final int i12 = 0;
        PaymentHistoryDetailsFragment paymentHistoryDetailsFragment = (PaymentHistoryDetailsFragment) this.receiver;
        PaymentHistoryDetailsFragment.a aVar = PaymentHistoryDetailsFragment.f327856q0;
        Dialog dialog = paymentHistoryDetailsFragment.getDialog();
        TextView textView = null;
        final d dVar = dialog instanceof d ? (d) dialog : null;
        if (dVar == null) {
            return;
        }
        SO0.d dVar2 = cVar.f14967c;
        boolean z12 = dVar2 instanceof d.a;
        LinearLayout linearLayout = dVar.f327930H;
        D6.G(linearLayout, z12);
        boolean z13 = dVar2 instanceof d.C1014d;
        D6.G(dVar.f327933K, z13);
        boolean z14 = dVar2 instanceof d.b;
        D6.G(dVar.f327931I, z14);
        D6.G(dVar.f327934L, dVar2 instanceof d.c);
        TextView textView2 = dVar.f327928F;
        D6.G(textView2, z12);
        TextView textView3 = dVar.f327929G;
        D6.G(textView3, z12);
        if (!z12) {
            if (!z13) {
                if (z14) {
                    ViewStub viewStub = (ViewStub) dVar.findViewById(R.id.error_view_stub);
                    if (viewStub != null) {
                        View viewInflate = viewStub.inflate();
                        if (viewInflate == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
                        }
                        dVar.f327931I = (LinearLayout) viewInflate;
                        dVar.f327932J = (TextView) dVar.findViewById(R.id.error_text_view);
                        final int i13 = 2;
                        ((Button) dVar.findViewById(R.id.error_refresh_button)).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.wallet.page.history.details.mvi.a
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                d dVar3 = dVar;
                                switch (i13) {
                                    case 0:
                                        int i14 = d.f327926M;
                                        dVar3.r();
                                        break;
                                    case 1:
                                        dVar3.f327927E.invoke(a.b.f14951a);
                                        break;
                                    default:
                                        dVar3.f327927E.invoke(a.d.f14953a);
                                        break;
                                }
                            }
                        });
                    }
                    TextView textView4 = dVar.f327932J;
                    if (textView4 == null) {
                        return;
                    }
                    textView4.setText(((d.b) dVar2).f14979a.getMessage());
                    return;
                }
                return;
            }
            d.C1014d c1014d = (d.C1014d) dVar2;
            ViewStub viewStub2 = (ViewStub) dVar.findViewById(R.id.refund_view_stub);
            if (viewStub2 == null) {
                return;
            }
            View viewInflate2 = viewStub2.inflate();
            if (viewInflate2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
            }
            LinearLayout linearLayout2 = (LinearLayout) viewInflate2;
            dVar.f327933K = linearLayout2;
            View viewFindViewById = linearLayout2.findViewById(R.id.confirm_refund_title);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            ((TextView) viewFindViewById).setText(c1014d.f14981a);
            LinearLayout linearLayout3 = dVar.f327933K;
            if (linearLayout3 != null) {
                View viewFindViewById2 = linearLayout3.findViewById(R.id.confirm_refund_subtitle);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                textView = (TextView) viewFindViewById2;
            }
            if (textView != null) {
                textView.setText(c1014d.f14982b);
            }
            ((Button) dVar.findViewById(R.id.confirm_refund_primary_button)).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.wallet.page.history.details.mvi.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar3 = dVar;
                    switch (i12) {
                        case 0:
                            int i14 = d.f327926M;
                            dVar3.r();
                            break;
                        case 1:
                            dVar3.f327927E.invoke(a.b.f14951a);
                            break;
                        default:
                            dVar3.f327927E.invoke(a.d.f14953a);
                            break;
                    }
                }
            });
            ((Button) dVar.findViewById(R.id.confirm_refund_secondary_button)).setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.wallet.page.history.details.mvi.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar3 = dVar;
                    switch (i) {
                        case 0:
                            int i14 = d.f327926M;
                            dVar3.r();
                            break;
                        case 1:
                            dVar3.f327927E.invoke(a.b.f14951a);
                            break;
                        default:
                            dVar3.f327927E.invoke(a.d.f14953a);
                            break;
                    }
                }
            });
            return;
        }
        d.a aVar2 = (d.a) dVar2;
        I5.a(textView2, aVar2.f14973a, false);
        I5.a(textView3, aVar2.f14974b, false);
        linearLayout.removeAllViews();
        for (TO0.a aVar3 : aVar2.f14975c) {
            DescriptionParameterItem descriptionParameterItem = new DescriptionParameterItem(dVar.getContext(), null, 0, 0, 14, null);
            descriptionParameterItem.setAppearance(C35835l0.j(R.attr.textM20, descriptionParameterItem.getContext()));
            descriptionParameterItem.leftTextView.setText(aVar3.f15636a);
            descriptionParameterItem.rightTextView.setText(aVar3.f15637b);
            descriptionParameterItem.setPadding(0, y6.b(24), 0, 0);
            descriptionParameterItem.getLeftTextView().setTextColor(C35835l0.d(R.attr.black, descriptionParameterItem.getContext()));
            if (aVar3.f15638c != null) {
                I5.c(descriptionParameterItem.getRightTextView(), new c(dVar, aVar3));
                descriptionParameterItem.getRightTextView().setTextColor(C35835l0.d(R.attr.blue600, descriptionParameterItem.getContext()));
            } else {
                descriptionParameterItem.getRightTextView().setTextColor(C35835l0.d(R.attr.black, descriptionParameterItem.getContext()));
            }
            descriptionParameterItem.getLeftTextView().setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 20.0f));
            descriptionParameterItem.getRightTextView().setLayoutParams(new LinearLayout.LayoutParams(0, -2, 80.0f));
            linearLayout.addView(descriptionParameterItem);
            D6.c(descriptionParameterItem, Integer.valueOf(y6.b(16)), null, Integer.valueOf(y6.b(16)), null, 10);
        }
        String str = aVar2.f14978f;
        if (str != null && str.length() != 0) {
            com.avito.android.lib.design.text_view.a aVar4 = new com.avito.android.lib.design.text_view.a(dVar.getContext(), null, 0, 0, 14, null);
            aVar4.setText(str);
            aVar4.setTextAppearance(C35835l0.j(R.attr.textM10, aVar4.getContext()));
            aVar4.setTextColor(C35835l0.d(R.attr.gray54, aVar4.getContext()));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = y6.b(16);
            layoutParams.rightMargin = y6.b(16);
            layoutParams.topMargin = y6.b(12);
            aVar4.setLayoutParams(layoutParams);
            linearLayout.addView(aVar4);
        }
        final TO0.c cVar2 = aVar2.f14977e;
        final TO0.b bVar = aVar2.f14976d;
        boolean z15 = cVar2.f15643c;
        if (bVar == null && !z15) {
            D6.f(dVar.f327930H, 0, 0, 0, y6.b(20), 7);
            return;
        }
        int iB2 = y6.b(26);
        View space = new Space(dVar.getContext());
        space.setLayoutParams(new ViewGroup.LayoutParams(-1, iB2));
        linearLayout.addView(space);
        LinearLayout linearLayout4 = new LinearLayout(dVar.getContext());
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(17);
        D6.f(linearLayout4, y6.b(10), 0, y6.b(10), 0, 10);
        if (bVar != null) {
            Button button = new Button(dVar.getContext(), null, 0, 0, 14, null);
            button.setId(R.id.receipt_button);
            button.setAppearanceFromAttr(R.attr.buttonSecondaryLarge);
            button.setText(bVar.f15639a);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.wallet.page.history.details.mvi.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar3 = dVar;
                    Object obj = bVar;
                    switch (i) {
                        case 0:
                            int i14 = d.f327926M;
                            TO0.c cVar3 = (TO0.c) obj;
                            ((PaymentHistoryDetailsFragment.b) dVar3.f327927E).invoke(new a.e(cVar3.f15641a, cVar3.f15642b));
                            break;
                        default:
                            int i15 = d.f327926M;
                            dVar3.f327927E.invoke(new a.c(((TO0.b) obj).f15640b));
                            break;
                    }
                }
            });
            button.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayout4.addView(button);
        }
        if (z15) {
            i = bVar == null ? 0 : 1;
            Button button2 = new Button(dVar.getContext(), null, 0, 0, 14, null);
            button2.setId(R.id.refund_button);
            button2.setAppearanceFromAttr(R.attr.buttonSecondaryLarge);
            button2.setText(button2.getContext().getString(R.string.refund_button_text));
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.wallet.page.history.details.mvi.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d dVar3 = dVar;
                    Object obj = cVar2;
                    switch (i12) {
                        case 0:
                            int i14 = d.f327926M;
                            TO0.c cVar3 = (TO0.c) obj;
                            ((PaymentHistoryDetailsFragment.b) dVar3.f327927E).invoke(new a.e(cVar3.f15641a, cVar3.f15642b));
                            break;
                        default:
                            int i15 = d.f327926M;
                            dVar3.f327927E.invoke(new a.c(((TO0.b) obj).f15640b));
                            break;
                    }
                }
            });
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            if (i != 0) {
                layoutParams2.setMargins(y6.b(6), 0, 0, 0);
            }
            button2.setLayoutParams(layoutParams2);
            linearLayout4.addView(button2);
        }
        linearLayout.addView(linearLayout4);
        D6.f(dVar.f327930H, 0, 0, 0, y6.b(16), 7);
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(SO0.c cVar) {
        f(cVar);
        return G0.f406611a;
    }
}
