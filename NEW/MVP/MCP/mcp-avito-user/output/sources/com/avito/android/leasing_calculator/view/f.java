package com.avito.android.leasing_calculator.view;

import com.avito.android.remote.model.LeasingApplicationCreationResponse;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: LeasingApplicationPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/LeasingApplicationCreationResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class f<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f175142b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f175143c;

    public f(b bVar, h hVar) {
        this.f175142b = bVar;
        this.f175143c = hVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        LeasingApplicationCreationResponse.Error error;
        String message;
        com.avito.android.advert.item.leasing_calculator.j jVar;
        String message2;
        com.avito.android.advert.item.leasing_calculator.j jVar2;
        P2 p22 = (P2) obj;
        List<Character> list = b.f175126g;
        b bVar = this.f175142b;
        bVar.getClass();
        boolean z12 = p22 instanceof P2.c;
        h hVar = this.f175143c;
        if (z12) {
            hVar.setLoading(true);
            return;
        }
        if (!(p22 instanceof P2.b)) {
            if (p22 instanceof P2.a) {
                hVar.setLoading(false);
                hVar.c(com.avito.android.error.z.k(((P2.a) p22).f318719a));
                return;
            }
            return;
        }
        LeasingApplicationCreationResponse leasingApplicationCreationResponse = (LeasingApplicationCreationResponse) ((P2.b) p22).f318720a;
        if (leasingApplicationCreationResponse instanceof LeasingApplicationCreationResponse.Ok) {
            LeasingApplicationCreationResponse.Ok ok2 = (LeasingApplicationCreationResponse.Ok) leasingApplicationCreationResponse;
            String title = ok2.getTitle();
            if (title == null || C43066x.K(title)) {
                message2 = ok2.getMessage();
            } else {
                message2 = ok2.getTitle() + b.f175127h + ok2.getMessage();
            }
            if (message2 != null && !C43066x.K(message2) && (jVar2 = bVar.f175132e) != null) {
                jVar2.f77396a.f77367d.j(message2);
            }
        } else if ((leasingApplicationCreationResponse instanceof LeasingApplicationCreationResponse.Error) && (message = (error = (LeasingApplicationCreationResponse.Error) leasingApplicationCreationResponse).getMessage()) != null && !C43066x.K(message) && (jVar = bVar.f175132e) != null) {
            String message3 = error.getMessage();
            if (message3 == null) {
                message3 = "";
            }
            jVar.f77396a.f77367d.o1(message3);
        }
        com.avito.android.advert.item.leasing_calculator.j jVar3 = bVar.f175132e;
        if (jVar3 != null) {
            jVar3.f77397b.a(true);
        }
    }
}
