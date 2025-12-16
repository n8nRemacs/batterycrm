package com.avito.android.credits.calculator;

import android.view.View;
import com.avito.android.lib.design.button.Button;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.credits.calculator.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnClickListenerC29614a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f128661b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f128662c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f128663d;

    public /* synthetic */ ViewOnClickListenerC29614a(int i12, Object obj, Object obj2) {
        this.f128661b = i12;
        this.f128663d = obj;
        this.f128662c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f128662c;
        Object obj2 = this.f128663d;
        switch (this.f128661b) {
            case 0:
                int i12 = C29615b.f128664x;
                C29615b c29615b = (C29615b) obj2;
                com.avito.android.credits.p pVar = c29615b.f128709k;
                if (pVar != null) {
                    pVar.q8();
                }
                q.D80(c29615b, c29615b.f128671w, (int[]) obj, new C29616c(c29615b), new C29617d(c29615b));
                break;
            case 1:
                int i13 = C29621h.f128676w;
                C29621h c29621h = (C29621h) obj2;
                com.avito.android.credits.p pVar2 = c29621h.f128709k;
                if (pVar2 != null) {
                    pVar2.q8();
                }
                q.D80(c29621h, c29621h.f128682v, (int[]) obj, new C29619f(c29621h), new C29620g(c29621h));
                break;
            default:
                int i14 = q.f128699p;
                ((Button) obj2).clearFocus();
                com.avito.android.credits.p pVar3 = ((q) obj).f128709k;
                if (pVar3 != null) {
                    pVar3.s7();
                    break;
                }
                break;
        }
    }
}
