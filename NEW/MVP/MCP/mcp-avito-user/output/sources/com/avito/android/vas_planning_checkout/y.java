package com.avito.android.vas_planning_checkout;

import android.content.res.Resources;
import android.view.View;
import com.avito.android.R;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.vas_planning_checkout.A;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: VasPlanCheckoutView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/vas_planning_checkout/A$a;", "event", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/vas_planning_checkout/A$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class y extends N implements Y41.l<A.a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f323030l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar) {
        super(1);
        this.f323030l = zVar;
    }

    @Override // Y41.l
    public final G0 invoke(A.a aVar) throws Resources.NotFoundException {
        A.a aVar2 = aVar;
        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
        z zVar = this.f323030l;
        View view = zVar.f323031a;
        String string = aVar2.f322744a;
        if (string.length() == 0) {
            string = zVar.f323034d.getString(R.string.something_went_wrong);
        }
        com.avito.android.component.toast.c.b(cVar, view, com.avito.android.printable_text.b.f(string), null, null, null, new f.c(aVar2.f322745b), 0, ToastBarPosition.f181046d, null, false, false, null, null, 4014);
        return G0.f406611a;
    }
}
