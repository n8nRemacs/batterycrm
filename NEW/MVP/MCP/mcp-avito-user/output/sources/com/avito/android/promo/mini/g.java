package com.avito.android.promo.mini;

import android.view.View;
import com.avito.android.promo.PromoAction;
import com.avito.android.promo.PromoWidgetItem;
import java.util.List;
import kotlin.collections.C42745f0;
import ld0.C43735f;
import ld0.InterfaceC43733d;
import ld0.InterfaceC43734e;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f231656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PromoWidgetItem f231657c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f231658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43734e f231659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f231660f;

    public /* synthetic */ g(InterfaceC43734e interfaceC43734e, Object obj, PromoWidgetItem promoWidgetItem, int i12, int i13) {
        this.f231656b = i13;
        this.f231659e = interfaceC43734e;
        this.f231660f = obj;
        this.f231657c = promoWidgetItem;
        this.f231658d = i12;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i12 = this.f231658d;
        Object obj = this.f231660f;
        PromoWidgetItem promoWidgetItem = this.f231657c;
        InterfaceC43734e interfaceC43734e = this.f231659e;
        switch (this.f231656b) {
            case 0:
                int i13 = h.f231661i;
                PromoAction promoAction = (PromoAction) C42745f0.E((List) obj);
                promoWidgetItem.getClass();
                ((h) interfaceC43734e).f231662b.k(promoAction, promoWidgetItem, i12);
                break;
            default:
                InterfaceC43733d interfaceC43733d = ((C43735f) interfaceC43734e).f413956b;
                promoWidgetItem.getClass();
                interfaceC43733d.k((PromoAction) obj, promoWidgetItem, i12);
                break;
        }
    }
}
