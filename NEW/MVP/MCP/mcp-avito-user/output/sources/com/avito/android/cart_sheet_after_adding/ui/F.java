package com.avito.android.cart_sheet_after_adding.ui;

import android.os.Build;
import android.view.View;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CartSheetAfterAddingScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class F extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f115490l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f115491m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Y41.a<G0> aVar, View view) {
        super(0);
        this.f115490l = aVar;
        this.f115491m = view;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ((A) this.f115490l).invoke();
        float f12 = M.f115510a;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f115491m.performHapticFeedback(16);
        }
        return G0.f406611a;
    }
}
