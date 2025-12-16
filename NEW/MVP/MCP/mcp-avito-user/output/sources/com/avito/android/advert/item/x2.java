package com.avito.android.advert.item;

import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;

/* compiled from: StickyButtonVisibilityBeduinTuner.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/x2;", "Lcom/avito/android/advert/item/u2;", "Lcom/avito/android/advert/item/safedeal/trust_factors/button/e;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class x2 extends u2<com.avito.android.advert.item.safedeal.trust_factors.button.e> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final x2 f80760a = new x2();

    @Override // com.avito.android.advert.item.u2
    public final int a(com.avito.konveyor.adapter.b bVar) {
        int[] iArr = new int[2];
        Button button = ((com.avito.android.advert.item.safedeal.trust_factors.button.e) bVar).f79062b;
        button.getLocationOnScreen(iArr);
        return button.getHeight() + iArr[1];
    }
}
