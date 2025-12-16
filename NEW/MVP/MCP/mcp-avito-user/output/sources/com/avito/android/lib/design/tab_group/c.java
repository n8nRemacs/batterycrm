package com.avito.android.lib.design.tab_group;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.tab_group.TabGroup;
import com.avito.android.lib.design.tab_group.b;
import com.avito.android.lib.design.tab_group.layout.d;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: TabGroupExt.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_design-modules_components"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14, types: [int] */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.view.View, android.widget.TextView] */
    @SuppressLint({"InflateParams"})
    public static final void a(@k TabGroup tabGroup, @k List<b> list, @l Integer num) {
        String strValueOf;
        String strValueOf2;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(tabGroup.getContext());
        boolean z12 = false;
        int i12 = 0;
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            b bVar = (b) obj;
            View viewInflate = layoutInflaterFrom.inflate(R.layout.view_avito_tab_re23, (ViewGroup) null, z12);
            TextView textView = (TextView) viewInflate.findViewById(R.id.avito_tab_text);
            com.avito.android.lib.design.text_view.e.a(textView, tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180746g.f180749a);
            textView.setText(bVar.f180722a.k0(textView.getContext()));
            boolean z13 = bVar.f180724c;
            textView.setEnabled(z13);
            textView.setTextColor(tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180746g.f180750b);
            ?? FindViewById = viewInflate.findViewById(R.id.avito_tab_extra_data_spacer);
            Integer num2 = tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180746g.f180757i;
            if (num2 != null) {
                FindViewById.getLayoutParams().width = num2.intValue();
            }
            b.a aVar = bVar.f180723b;
            FindViewById.setVisibility(aVar != null ? true : z12 ? z12 : 8);
            ?? r92 = (TextView) viewInflate.findViewById(R.id.avito_tab_counter);
            com.avito.android.lib.design.text_view.e.a(r92, tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180746g.f180751c);
            boolean z14 = aVar instanceof b.a.c;
            r92.setVisibility((z14 || (aVar instanceof b.a.d)) ? z12 : 8);
            if (z14) {
                b.a.c cVar = (b.a.c) aVar;
                int i14 = cVar.f180726a;
                Integer num3 = cVar.f180728c;
                if (num3 == null || i14 <= num3.intValue()) {
                    strValueOf2 = String.valueOf(i14);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(num3);
                    sb2.append('+');
                    strValueOf2 = sb2.toString();
                }
                r92.setText(strValueOf2);
                b.a.c.AbstractC5311a abstractC5311a = cVar.f180727b;
                r92.setTextColor(L.f(abstractC5311a, b.a.c.AbstractC5311a.C5314c.f180731b) ? tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180746g.f180752d : L.f(abstractC5311a, b.a.c.AbstractC5311a.C5312a.f180730b) ? tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180746g.f180753e : C35835l0.d(cVar.f180727b.getF180729a(), r92.getContext()));
            } else if (aVar instanceof b.a.d) {
                b.a.d dVar = (b.a.d) aVar;
                int i15 = dVar.f180732a;
                Integer num4 = dVar.f180734c;
                if (num4 == null || i15 <= num4.intValue()) {
                    strValueOf = String.valueOf(i15);
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(num4);
                    sb3.append('+');
                    strValueOf = sb3.toString();
                }
                r92.setText(strValueOf);
                r92.setTextColor(tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180746g.f180752d);
            }
            View viewFindViewById = viewInflate.findViewById(R.id.avito_tab_extra_counter_spacer);
            Integer num5 = tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180746g.f180757i;
            if (num5 != null) {
                viewFindViewById.getLayoutParams().width = num5.intValue();
            }
            boolean z15 = aVar instanceof b.a.d;
            viewFindViewById.setVisibility(z15 ? 0 : 8);
            ImageView imageView = (ImageView) viewInflate.findViewById(R.id.avito_tab_point);
            imageView.setImageTintList(ColorStateList.valueOf(tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180746g.f180754f));
            imageView.setVisibility(((aVar instanceof b.a.e) || z15) ? 0 : 8);
            Badge badge = (Badge) viewInflate.findViewById(R.id.avito_tab_badge);
            badge.setStyle(tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180746g.f180756h);
            boolean z16 = aVar instanceof b.a.C5309a;
            badge.setVisibility(z16 ? 0 : 8);
            if (z16) {
                badge.setTitleText(((b.a.C5309a) aVar).f180725a);
            }
            View viewFindViewById2 = viewInflate.findViewById(R.id.avito_tab_compensation);
            viewFindViewById2.getLayoutParams().width = tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180744e;
            viewFindViewById2.setVisibility(aVar == null ? 0 : 8);
            viewInflate.findViewById(R.id.avito_tab_spacing).getLayoutParams().width = i12 != list.size() + (-1) ? tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180745f : 0;
            if (tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180746g.f180755g == 0 && tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180740a != 0) {
                Integer num6 = tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180747h;
                D6.f(viewInflate, 0, 0, 0, tabGroup.getCom.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel.SERIALIZED_NAME_STYLE java.lang.String().f180740a + (num6 != null ? num6.intValue() : D6.j(tabGroup, 2)), 7);
            }
            TabGroup.a aVarK = tabGroup.k();
            aVarK.f180791a = z13;
            aVarK.f180718f = viewInflate.findViewById(R.id.avito_tab_text);
            aVarK.f180793c = viewInflate;
            d.C5316d c5316d = aVarK.f180795e;
            if (c5316d != null) {
                c5316d.a();
            }
            tabGroup.e(aVarK, num != null && i12 == num.intValue());
            i12 = i13;
            z12 = false;
        }
    }
}
