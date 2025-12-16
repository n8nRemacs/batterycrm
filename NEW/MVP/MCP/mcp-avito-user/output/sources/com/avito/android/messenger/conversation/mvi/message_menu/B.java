package com.avito.android.messenger.conversation.mvi.message_menu;

import Fc1.D3;
import android.view.View;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.messenger.conversation.mvi.message_menu.AbstractC32118b;
import com.avito.android.messenger.conversation.mvi.message_menu.l;
import com.avito.android.util.C35835l0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: MessageMenuView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/bottom_sheet/o;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/bottom_sheet/o;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class B extends N implements Y41.l<com.avito.android.lib.design.bottom_sheet.o, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f191558l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l.a.c.b f191559m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(t tVar, l.a.c.b bVar) {
        super(1);
        this.f191558l = tVar;
        this.f191559m = bVar;
    }

    @Override // Y41.l
    public final G0 invoke(com.avito.android.lib.design.bottom_sheet.o oVar) {
        com.avito.android.lib.design.bottom_sheet.o oVar2 = oVar;
        t tVar = this.f191558l;
        oVar2.S(tVar.f191815h);
        for (AbstractC32118b abstractC32118b : this.f191559m.f191778e) {
            if (abstractC32118b instanceof AbstractC32118b.c) {
                w wVar = new w((AbstractC32118b.c) abstractC32118b);
                int iJ2 = C35835l0.j(R.attr.textBodySmallDense, oVar2.getContext());
                com.avito.android.lib.design.text_view.a aVar = new com.avito.android.lib.design.text_view.a(oVar2.getContext(), null, 0, 0, 14, null);
                aVar.setId(View.generateViewId());
                aVar.setTag("hint");
                aVar.setTextAppearance(iJ2);
                wVar.invoke(aVar);
                aVar.setTextColor(C35835l0.d(R.attr.gray48, oVar2.getContext()));
                wVar.invoke(aVar);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                float f12 = oVar2.f178560E;
                int iB2 = kotlin.math.b.b(16 * f12);
                int iB3 = kotlin.math.b.b(8 * f12);
                layoutParams.setMargins(iB2, iB3, iB2, iB3);
                LinearLayout linearLayout = (LinearLayout) oVar2.findViewById(R.id.menu_content);
                if (linearLayout != null) {
                    linearLayout.addView(aVar, layoutParams);
                }
            } else if (abstractC32118b instanceof AbstractC32118b.C5660b) {
                com.avito.android.lib.design.bottom_sheet.o.V(oVar2, new x((AbstractC32118b.C5660b) abstractC32118b));
            } else if (abstractC32118b instanceof AbstractC32118b.d) {
                oVar2.X(new y((AbstractC32118b.d) abstractC32118b));
            } else if (abstractC32118b instanceof AbstractC32118b.a) {
                AbstractC32118b.a aVar2 = (AbstractC32118b.a) abstractC32118b;
                com.avito.android.lib.design.bottom_sheet.o.W(oVar2, oVar2.getContext().getString(aVar2.f191561b), Integer.valueOf(aVar2.f191562c), null, null, null, new z(tVar, (AbstractC32118b.a) abstractC32118b), 28);
            }
        }
        oVar2.R(new A(tVar));
        oVar2.setOnCancelListener(new D3(tVar, 15));
        com.avito.android.lib.util.g.a(oVar2);
        return G0.f406611a;
    }
}
