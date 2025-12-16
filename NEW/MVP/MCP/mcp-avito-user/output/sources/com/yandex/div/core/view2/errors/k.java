package com.yandex.div.core.view2.errors;

import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.avito.android.R;
import com.yandex.div.core.view2.C38029k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ErrorView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/div/core/view2/errors/o;", "m", "Lkotlin/G0;", "invoke", "(Lcom/yandex/div/core/view2/errors/o;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes7.dex */
final class k extends N implements Y41.l<o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f369083l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar) {
        super(1);
        this.f369083l = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(o oVar) {
        o oVar2 = oVar;
        n nVar = this.f369083l;
        o oVar3 = nVar.f369090f;
        boolean z12 = oVar2.f369092a;
        C38029k c38029k = nVar.f369086b;
        if (oVar3 == null || oVar3.f369092a != z12) {
            com.yandex.div.internal.widget.f fVar = nVar.f369088d;
            if (fVar != null) {
                c38029k.removeView(fVar);
            }
            nVar.f369088d = null;
            b bVar = nVar.f369089e;
            if (bVar != null) {
                c38029k.removeView(bVar);
            }
            nVar.f369089e = null;
        }
        int i12 = oVar2.f369094c;
        int i13 = oVar2.f369093b;
        if (z12) {
            if (nVar.f369089e == null) {
                b bVar2 = new b(c38029k.getContext(), new l(nVar), new m(nVar));
                c38029k.addView(bVar2, new ViewGroup.LayoutParams(-1, -1));
                nVar.f369089e = bVar2;
            }
            b bVar3 = nVar.f369089e;
            if (bVar3 != null) {
                String strR = oVar2.f369096e;
                String str = oVar2.f369095d;
                if (i13 > 0 && i12 > 0) {
                    strR = androidx.appcompat.app.r.r(str, "\n\n", strR);
                } else if (i12 <= 0) {
                    strR = str;
                }
                bVar3.f369062d.setText(strR);
            }
        } else {
            int length = oVar2.b().length();
            int i14 = R.drawable.error_counter_background;
            if (length <= 0) {
                com.yandex.div.internal.widget.f fVar2 = nVar.f369088d;
                if (fVar2 != null) {
                    c38029k.removeView(fVar2);
                }
                nVar.f369088d = null;
            } else if (nVar.f369088d == null) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(c38029k.getContext());
                appCompatTextView.setBackgroundResource(R.drawable.error_counter_background);
                appCompatTextView.setTextSize(12.0f);
                appCompatTextView.setTextColor(-16777216);
                appCompatTextView.setGravity(17);
                appCompatTextView.setElevation(appCompatTextView.getResources().getDimension(R.dimen.div_shadow_elevation));
                appCompatTextView.setOnClickListener(new a(nVar, 2));
                int iA2 = com.yandex.div.internal.util.p.a(24);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(iA2, iA2);
                int iA3 = com.yandex.div.internal.util.p.a(8);
                marginLayoutParams.topMargin = iA3;
                marginLayoutParams.leftMargin = iA3;
                marginLayoutParams.rightMargin = iA3;
                marginLayoutParams.bottomMargin = iA3;
                com.yandex.div.internal.widget.f fVar3 = new com.yandex.div.internal.widget.f(c38029k.getContext(), null, 0, 6, null);
                fVar3.addView(appCompatTextView, marginLayoutParams);
                c38029k.addView(fVar3, -1, -1);
                nVar.f369088d = fVar3;
            }
            com.yandex.div.internal.widget.f fVar4 = nVar.f369088d;
            KeyEvent.Callback childAt = fVar4 == null ? null : fVar4.getChildAt(0);
            AppCompatTextView appCompatTextView2 = childAt instanceof AppCompatTextView ? (AppCompatTextView) childAt : null;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setText(oVar2.b());
                if (i12 > 0 && i13 > 0) {
                    i14 = R.drawable.warning_error_counter_background;
                } else if (i12 > 0) {
                    i14 = R.drawable.warning_counter_background;
                }
                appCompatTextView2.setBackgroundResource(i14);
            }
        }
        nVar.f369090f = oVar2;
        return G0.f406611a;
    }
}
