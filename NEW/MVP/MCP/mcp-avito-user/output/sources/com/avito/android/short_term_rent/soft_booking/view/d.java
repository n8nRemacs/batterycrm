package com.avito.android.short_term_rent.soft_booking.view;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.avito.android.short_term_rent.utils.p;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements View.OnScrollChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f282887b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f282888c;

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i12, int i13, int i14, int i15) {
        Y41.a<G0> aVar;
        switch (this.f282887b) {
            case 0:
                g gVar = this.f282888c;
                j jVar = gVar.f282897a;
                ScrollView scrollViewO = jVar.o();
                LinearLayout linearLayoutB = jVar.b();
                if (scrollViewO.getScrollY() / linearLayoutB.getTop() >= 0.2f && scrollViewO.getScrollY() / linearLayoutB.getBottom() <= 1.0f && (aVar = gVar.f282909m) != null) {
                    aVar.invoke();
                    break;
                }
                break;
            default:
                g gVar2 = this.f282888c;
                if (!gVar2.f282904h) {
                    p pVar = p.f283035a;
                    j jVar2 = gVar2.f282897a;
                    LinearLayout linearLayoutQ = jVar2.q();
                    ScrollView scrollViewO2 = jVar2.o();
                    pVar.getClass();
                    float y12 = 0.0f;
                    for (View view2 = linearLayoutQ; !(view2 instanceof ScrollView); view2 = (View) view2.getParent()) {
                        y12 += view2.getY();
                    }
                    float height = y12 + linearLayoutQ.getHeight();
                    int scrollY = scrollViewO2.getScrollY();
                    float height2 = scrollViewO2.getHeight() + scrollY;
                    float f12 = height2 - y12;
                    boolean z12 = height2 > y12;
                    boolean z13 = ((float) scrollY) < height;
                    if (z12 && z13 && f12 > 0.0f && f12 / r8 >= 0.5d) {
                        Y41.a<G0> aVar2 = gVar2.f282905i;
                        if (aVar2 != null) {
                            aVar2.invoke();
                        }
                        gVar2.f282904h = true;
                        break;
                    }
                }
                break;
        }
    }
}
