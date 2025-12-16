package com.avito.android.cart_sheet_after_adding.ui;

import android.os.Build;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CartSheetAfterAddingScreen.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class G extends kotlin.jvm.internal.N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f115492l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f115493m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(View view, Y41.l lVar) {
        super(1);
        this.f115492l = lVar;
        this.f115493m = view;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        ((B) this.f115492l).invoke(Integer.valueOf(num.intValue()));
        float f12 = M.f115510a;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f115493m.performHapticFeedback(16);
        }
        return G0.f406611a;
    }
}
