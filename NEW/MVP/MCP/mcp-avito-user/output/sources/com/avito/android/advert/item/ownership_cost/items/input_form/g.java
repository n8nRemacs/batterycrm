package com.avito.android.advert.item.ownership_cost.items.input_form;

import android.view.View;
import com.avito.android.R;
import com.avito.android.advert.item.ownership_cost.dialogs.b;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.P2;
import kotlin.Metadata;

/* compiled from: OwnershipCostInputsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/OwnershipCostResponse;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f77992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f77993c;

    public g(h hVar, k kVar) {
        this.f77992b = hVar;
        this.f77993c = kVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        b.a aVar;
        P2 p22 = (P2) obj;
        h hVar = this.f77992b;
        this.f77993c.e6(p22 instanceof P2.c);
        if (!(p22 instanceof P2.a)) {
            if (!(p22 instanceof P2.b) || (aVar = hVar.f78002j) == null) {
                return;
            }
            aVar.b1();
            return;
        }
        b.a aVar2 = hVar.f78002j;
        if (aVar2 != null) {
            ApiError apiError = ((P2.a) p22).f318719a;
            com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
            View viewFindViewById = aVar2.f77890c.findViewById(R.id.avito_bottom_sheet);
            PrintableText printableTextF = com.avito.android.printable_text.b.f(apiError.getF244063c());
            ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
            f.c.f125255c.getClass();
            com.avito.android.component.toast.c.b(cVar, viewFindViewById, printableTextF, null, null, null, f.c.a.b(), 0, toastBarPosition, null, false, false, null, null, 4014);
        }
    }
}
