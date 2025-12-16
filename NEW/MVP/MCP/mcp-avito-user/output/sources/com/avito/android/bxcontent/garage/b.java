package com.avito.android.bxcontent.garage;

import com.avito.android.R;
import com.avito.android.bxcontent.garage.i;
import com.avito.android.deeplink_handler.view.a;
import kotlin.Metadata;
import zk0.C50580a;
import zk0.C50581b;

/* compiled from: AddCarToGarageDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzk0/b;", "response", "Lkotlin/G0;", "accept", "(Lzk0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f111099b;

    public b(a aVar) {
        this.f111099b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C50581b c50581b = (C50581b) obj;
        boolean isSuccess = c50581b.getIsSuccess();
        a aVar = this.f111099b;
        if (isSuccess) {
            int i12 = a.f111092l;
            aVar.f111094g.c(new f());
            a.i.C4057a.e(aVar.f111095h, aVar.f111093f.getResources().getString(R.string.serp_add_car_to_garage_success), null, 0, null, 1022);
            aVar.j(i.b.f111115b);
            return;
        }
        C50580a error = c50581b.getError();
        String strValueOf = String.valueOf(error != null ? error.getMessage() : null);
        int i13 = a.f111092l;
        aVar.k(strValueOf, null);
    }
}
