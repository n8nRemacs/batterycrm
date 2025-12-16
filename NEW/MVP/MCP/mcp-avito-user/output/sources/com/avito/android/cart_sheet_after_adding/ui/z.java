package com.avito.android.cart_sheet_after_adding.ui;

import android.os.SystemClock;
import com.avito.android.remote.model.Image;
import gn.InterfaceC40710b;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: CartSheetAfterAddingScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class z extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Object, G0> f115662l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f115663m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ gn.i f115664n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(int i12, Y41.l lVar, gn.i iVar) {
        super(0);
        this.f115662l = lVar;
        this.f115663m = i12;
        this.f115664n = iVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        gn.i iVar = this.f115664n;
        Image image = iVar.f396838b.f396824a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f115662l.invoke(new InterfaceC40710b.c(this.f115663m, iVar.f396837a, iVar.f396841e, iVar.f396839c, image, jElapsedRealtime));
        return G0.f406611a;
    }
}
