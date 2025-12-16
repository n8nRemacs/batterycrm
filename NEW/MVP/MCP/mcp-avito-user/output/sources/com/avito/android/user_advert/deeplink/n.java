package com.avito.android.user_advert.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.remote.model.CloseReasonsResponse;
import com.avito.android.user_advert.soa_with_price.SoaWithPriceArguments;
import com.avito.android.user_advert.soa_with_price.SoaWithPriceSheetDialogFragment;
import com.avito.android.util.P2;
import jI0.C42260a;
import kotlin.Metadata;

/* compiled from: MyAdvertDeactivateLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/CloseReasonsResponse;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class n<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f310746b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f310747c;

    public n(j jVar, String str) {
        this.f310746b = jVar;
        this.f310747c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        P2 p22 = (P2) obj;
        if (p22 instanceof P2.c) {
            return;
        }
        boolean z12 = p22 instanceof P2.a;
        j jVar = this.f310746b;
        if (z12) {
            jVar.j(new MyAdvertLink.DeactivateV2.b.C4007b(((P2.a) p22).f318719a));
            return;
        }
        if (p22 instanceof P2.b) {
            String str = this.f310747c;
            jVar.f310735h.c(new C42260a(str));
            SoaWithPriceArguments soaWithPriceArguments = new SoaWithPriceArguments(((CloseReasonsResponse) ((P2.b) p22).f318720a).getCloseReasons(), str);
            SoaWithPriceSheetDialogFragment soaWithPriceSheetDialogFragment = new SoaWithPriceSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("arguments", soaWithPriceArguments);
            soaWithPriceSheetDialogFragment.setArguments(bundle);
            jVar.f310736i.w1(soaWithPriceSheetDialogFragment, jVar.f310739l);
        }
    }
}
