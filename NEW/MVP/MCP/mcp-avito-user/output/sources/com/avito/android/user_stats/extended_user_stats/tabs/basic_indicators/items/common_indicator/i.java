package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.ui.platform.C22491k0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.O2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: CommonIndicatorItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/common_indicator/i;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/common_indicator/g;", "Lcom/avito/konveyor/adapter/b;", "a", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i extends com.avito.konveyor.adapter.b implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f317454d = 0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f317455b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f317456c;

    /* compiled from: CommonIndicatorItemView.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/items/common_indicator/i$a;", "", "<init>", "()V", "", "SLUG_GENERAL_SPENDING", "Ljava/lang/String;", "SLUG_INCOME", "SLUG_ITEMS_SPENDING", "SLUG_SPENDING", "SLUG_TOTAL_SPENDING", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public i(@Y61.k View view, @Y61.k com.avito.android.util.text.a aVar) {
        super(view);
        this.f317455b = view;
        this.f317456c = aVar;
    }

    public static boolean B80(String str) {
        return L.f(str, "spending") || L.f(str, "totalSpending") || L.f(str, "itemsSpending") || L.f(str, "generalSpending");
    }

    public static void C80(Context context, SpannableString spannableString, String str) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        View viewInflate = View.inflate(context, R.layout.stats_dialog_view, null);
        ((Button) viewInflate.findViewById(R.id.b_close)).setOnClickListener(new S7.a(dVar, 20));
        ((TextView) viewInflate.findViewById(R.id.tv_dialog)).setText(spannableString);
        dVar.G(viewInflate, true);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, str, true, 0, 0, 0, 120);
        dVar.show();
    }

    @Override // com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.g
    public final void dR(@Y61.k final c cVar, @Y61.k com.jakewharton.rxrelay3.c<DeepLink> cVar2) {
        LayoutInflater layoutInflater;
        LinearLayout linearLayout;
        String str;
        int i12;
        SpannableString spannableString;
        int i13;
        TextView textView;
        int i14;
        LinearLayout linearLayout2;
        LayoutInflater layoutInflater2;
        View view = this.f317455b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(view.getContext());
        TextView textView2 = (TextView) view.findViewById(R.id.tv_indicator_title);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_indicator_bonuses);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_indicator_percent);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_indicator_description);
        TextView textView6 = (TextView) view.findViewById(R.id.tv_indicator_count);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.ll_indicator_counts);
        TextView textView7 = (TextView) view.findViewById(R.id.tv_indicator_dialog);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.ic_indicator_help);
        LinearLayout linearLayout4 = (LinearLayout) view.findViewById(R.id.ll_contacts);
        imageButton.setVisibility(cVar.f317441f != null ? 0 : 8);
        int i15 = cVar.f317448m ? R.attr.textH30 : R.attr.textH40;
        Context context = view.getContext();
        if (textView2.getHint() != null) {
            linearLayout = linearLayout4;
            layoutInflater = layoutInflaterFrom;
            str = "     ";
        } else {
            layoutInflater = layoutInflaterFrom;
            linearLayout = linearLayout4;
            str = "";
        }
        String strO = H.o(new StringBuilder(), cVar.f317439d, ' ', str);
        SpannableString spannableString2 = new SpannableString(strO);
        spannableString2.setSpan(new BackgroundColorSpan(C35835l0.d(R.attr.white, context)), 0, strO.length(), 33);
        textView2.setText(spannableString2);
        textView2.setTextAppearance(C35835l0.j(i15, textView2.getContext()));
        Float f12 = cVar.f317444i;
        textView3.setVisibility(f12 != null ? 0 : 8);
        Context context2 = view.getContext();
        if (f12 == null) {
            i12 = i15;
            spannableString = null;
            i13 = R.attr.green800;
        } else {
            String str2 = context2.getString(R.string.user_stats_written_off) + ' ';
            String strA0 = L.d(f12, 0.0f) ? "0" : C43066x.a0(f12.toString(), ".", "", false);
            StringBuilder sb2 = new StringBuilder();
            i12 = i15;
            sb2.append(j.c(f12.floatValue()));
            sb2.append(' ');
            sb2.append(context2.getResources().getQuantityString(R.plurals.user_stats_bonuses, Integer.parseInt(strA0)));
            String string = sb2.toString();
            spannableString = new SpannableString(r.q(str2, string));
            i13 = R.attr.green800;
            spannableString.setSpan(new ForegroundColorSpan(C35835l0.d(R.attr.green800, context2)), str2.length(), string.length() + str2.length(), 33);
        }
        textView3.setText(spannableString, TextView.BufferType.SPANNABLE);
        final int i16 = 0;
        imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.h

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f317452c;

            {
                this.f317452c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        Context context3 = this.f317452c.f317455b.getContext();
                        c cVar3 = cVar;
                        String str3 = cVar3.f317441f;
                        if (str3 == null) {
                            str3 = "";
                        }
                        i.C80(context3, new SpannableString(str3), cVar3.f317439d);
                        break;
                    default:
                        View view3 = this.f317452c.f317455b;
                        Context context4 = view3.getContext();
                        Context context5 = view3.getContext();
                        c cVar4 = cVar;
                        double d12 = cVar4.f317442g;
                        String str4 = d12 > 0.0d ? "+" : "";
                        String str5 = str4 + j.c(d12) + '%';
                        StringBuilder sbB = C22491k0.b(str5, ' ');
                        sbB.append(context5.getString(R.string.user_stats_compared_period));
                        SpannableString spannableString3 = new SpannableString(sbB.toString());
                        boolean zB80 = i.B80(cVar4.f317438c);
                        int i17 = R.attr.gray54;
                        if (!zB80) {
                            if (d12 > 0.0d) {
                                i17 = R.attr.green800;
                            } else if (d12 < 0.0d) {
                                i17 = R.attr.red600;
                            }
                        }
                        spannableString3.setSpan(new ForegroundColorSpan(i17), 0, str5.length(), 33);
                        i.C80(context4, spannableString3, view3.getContext().getString(R.string.user_stats_indicator_dynamics));
                        break;
                }
            }
        });
        String str3 = cVar.f317438c;
        boolean zB80 = B80(str3);
        double d12 = 0.0d;
        double d13 = cVar.f317442g;
        int i17 = R.attr.gray54;
        if (!zB80) {
            if (d13 > 0.0d) {
                i17 = i13;
            } else if (d13 < 0.0d) {
                i17 = R.attr.red600;
            }
        }
        textView4.setTextColor(C35835l0.d(i17, view.getContext()));
        StringBuilder sbR = H.r(d13 > 0.0d ? "+" : "");
        sbR.append(j.c(d13));
        sbR.append('%');
        textView4.setText(sbR.toString());
        boolean z12 = cVar.f317447l;
        if (z12) {
            textView4.setVisibility(d13 == 0.0d ? 8 : 0);
        }
        String str4 = (B80(str3) || L.f(str3, "income")) ? " ₽" : "";
        textView6.setText(j.c(cVar.f317443h) + str4);
        textView6.setTextAppearance(C35835l0.j(i12, textView6.getContext()));
        String str5 = cVar.f317440e;
        textView5.setVisibility((str5 == null || C43066x.K(str5)) ? 8 : 0);
        textView5.setText(str5);
        if (!z12) {
            final int i18 = 1;
            linearLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.h

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i f317452c;

                {
                    this.f317452c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i18) {
                        case 0:
                            Context context3 = this.f317452c.f317455b.getContext();
                            c cVar3 = cVar;
                            String str32 = cVar3.f317441f;
                            if (str32 == null) {
                                str32 = "";
                            }
                            i.C80(context3, new SpannableString(str32), cVar3.f317439d);
                            break;
                        default:
                            View view3 = this.f317452c.f317455b;
                            Context context4 = view3.getContext();
                            Context context5 = view3.getContext();
                            c cVar4 = cVar;
                            double d122 = cVar4.f317442g;
                            String str42 = d122 > 0.0d ? "+" : "";
                            String str52 = str42 + j.c(d122) + '%';
                            StringBuilder sbB = C22491k0.b(str52, ' ');
                            sbB.append(context5.getString(R.string.user_stats_compared_period));
                            SpannableString spannableString3 = new SpannableString(sbB.toString());
                            boolean zB802 = i.B80(cVar4.f317438c);
                            int i172 = R.attr.gray54;
                            if (!zB802) {
                                if (d122 > 0.0d) {
                                    i172 = R.attr.green800;
                                } else if (d122 < 0.0d) {
                                    i172 = R.attr.red600;
                                }
                            }
                            spannableString3.setSpan(new ForegroundColorSpan(i172), 0, str52.length(), 33);
                            i.C80(context4, spannableString3, view3.getContext().getString(R.string.user_stats_indicator_dynamics));
                            break;
                    }
                }
            });
        }
        AttributedText attributedText = cVar.f317446k;
        if (attributedText != null) {
            textView = textView7;
            com.avito.android.util.text.j.c(textView, attributedText, this.f317456c);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            attributedText.setOnDeepLinkClickListener(new com.avito.android.tariff.cpa.configure_info.items.feature.e(cVar2, 14));
        } else {
            textView = textView7;
        }
        textView.setVisibility(attributedText == null ? 8 : 0);
        linearLayout.removeAllViews();
        List<k> list = cVar.f317445j;
        if (O2.a(list)) {
            linearLayout2 = linearLayout;
            i14 = 0;
        } else {
            i14 = 8;
            linearLayout2 = linearLayout;
        }
        linearLayout2.setVisibility(i14);
        if (list != null) {
            for (k kVar : list) {
                if (kVar.f317458b == d12) {
                    layoutInflater2 = layoutInflater;
                } else {
                    layoutInflater2 = layoutInflater;
                    ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater2.inflate(R.layout.common_stats_contact_item, (ViewGroup) null, false);
                    TextView textView8 = (TextView) constraintLayout.findViewById(R.id.tv_contacts_title);
                    TextView textView9 = (TextView) constraintLayout.findViewById(R.id.tv_contacts_title_count);
                    LinearLayout linearLayout5 = (LinearLayout) constraintLayout.findViewById(R.id.ll_contacts_bar);
                    textView8.setText(kVar.f317457a);
                    textView9.setText(j.c(kVar.f317458b) + str4);
                    j.a(layoutInflater2, linearLayout5, cVar.f317443h, kVar.f317458b, null);
                    linearLayout2.addView(constraintLayout);
                }
                layoutInflater = layoutInflater2;
                d12 = 0.0d;
            }
        }
    }
}
