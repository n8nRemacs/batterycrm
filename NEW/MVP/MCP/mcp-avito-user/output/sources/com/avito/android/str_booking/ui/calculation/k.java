package com.avito.android.str_booking.ui.calculation;

import android.content.Context;
import android.view.View;
import com.avito.android.str_booking.mvi.entity.a;
import com.avito.android.str_booking.network.models.sections.CalculationContentItem;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f285975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f285976c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f285977d;

    public /* synthetic */ k(int i12, Object obj, Object obj2) {
        this.f285975b = i12;
        this.f285976c = obj;
        this.f285977d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f285977d;
        Object obj2 = this.f285976c;
        switch (this.f285975b) {
            case 0:
                l lVar = (l) obj2;
                Y41.a<G0> aVar = lVar.f285984g;
                if (aVar != null) {
                    ((f) aVar).invoke();
                }
                com.avito.android.str_booking.ui.payment_details.b bVar = com.avito.android.str_booking.ui.payment_details.b.f286119a;
                Context context = lVar.f285979b.getContext();
                n nVar = (n) obj;
                String str = nVar.f285989a;
                bVar.getClass();
                com.avito.android.str_booking.ui.payment_details.b.a(context, lVar.f285980c, str, nVar.f285990b, null);
                break;
            case 1:
                int i12 = l.f285978i;
                ((Y41.l) obj2).invoke(new a.c(((CalculationContentItem) obj).getId()));
                break;
            default:
                int i13 = l.f285978i;
                com.avito.android.str_booking.ui.payment_details.b bVar2 = com.avito.android.str_booking.ui.payment_details.b.f286119a;
                l lVar2 = (l) obj2;
                Context context2 = lVar2.f285979b.getContext();
                a aVar2 = (a) obj;
                String str2 = aVar2.f285951a;
                bVar2.getClass();
                com.avito.android.str_booking.ui.payment_details.b.a(context2, lVar2.f285980c, str2, aVar2.f285953c, aVar2.f285952b);
                break;
        }
    }
}
