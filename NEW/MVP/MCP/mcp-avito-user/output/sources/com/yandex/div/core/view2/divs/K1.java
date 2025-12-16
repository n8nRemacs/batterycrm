package com.yandex.div.core.view2.divs;

import com.avito.android.R;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div2.DivSeparator;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DivSeparatorBinder.kt */
@com.yandex.div.core.dagger.z
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/divs/K1;", "Lcom/yandex/div/core/view2/N;", "Lcom/yandex/div2/DivSeparator;", "Lcom/yandex/div/core/view2/divs/widgets/q;", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class K1 implements com.yandex.div.core.view2.N<DivSeparator, com.yandex.div.core.view2.divs.widgets.q> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C38006w f368134a;

    @Inject
    public K1(@Y61.k C38006w c38006w) {
        this.f368134a = c38006w;
    }

    public final void a(@Y61.k com.yandex.div.core.view2.divs.widgets.q qVar, @Y61.k DivSeparator divSeparator, @Y61.k C38029k c38029k) {
        DivSeparator div = qVar.getDiv();
        if (divSeparator.equals(div)) {
            return;
        }
        com.yandex.div.json.expressions.e expressionResolver = c38029k.getExpressionResolver();
        qVar.g();
        qVar.setDiv$div_release(divSeparator);
        C38006w c38006w = this.f368134a;
        if (div != null) {
            c38006w.h(c38029k, qVar, div);
        }
        c38006w.d(qVar, divSeparator, div, c38029k);
        C37931a.c(qVar, c38029k, divSeparator.f371912b, divSeparator.f371914d, divSeparator.f371928r, divSeparator.f371923m, divSeparator.f371913c);
        DivSeparator.DelimiterStyle delimiterStyle = divSeparator.f371921k;
        com.yandex.div.json.expressions.b<Integer> bVar = delimiterStyle == null ? null : delimiterStyle.f371942a;
        if (bVar == null) {
            qVar.setDividerColor(0);
        } else {
            qVar.e(bVar.e(expressionResolver, new I1(qVar)));
        }
        com.yandex.div.json.expressions.b<DivSeparator.DelimiterStyle.Orientation> bVar2 = delimiterStyle != null ? delimiterStyle.f371943b : null;
        if (bVar2 == null) {
            qVar.setHorizontal(false);
        } else {
            qVar.e(bVar2.e(expressionResolver, new J1(qVar)));
        }
        qVar.setDividerHeightResource(R.dimen.div_separator_delimiter_height);
        qVar.setDividerGravity(17);
    }
}
