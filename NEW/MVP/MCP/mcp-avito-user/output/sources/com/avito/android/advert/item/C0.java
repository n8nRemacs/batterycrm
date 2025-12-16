package com.avito.android.advert.item;

import android.os.Bundle;
import com.avito.android.beduin.v2.page.m;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/v2/page/m$c;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin/v2/page/m$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class C0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28136i0 f71601b;

    public C0(C28136i0 c28136i0) {
        this.f71601b = c28136i0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Bundle bundle = ((m.c) obj).f105170b;
        if (bundle != null) {
            boolean z12 = Boolean.parseBoolean(bundle.getString("needReload"));
            String string = bundle.getString("userAddressId");
            Integer numY0 = string != null ? C43066x.y0(string) : null;
            C28136i0 c28136i0 = this.f71601b;
            if (z12) {
                C28136i0.v2(c28136i0);
            } else if (numY0 != null) {
                c28136i0.f76332b1 = true;
                c28136i0.w2(false);
                c28136i0.y2(numY0);
            }
        }
    }
}
