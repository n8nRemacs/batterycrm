package com.avito.android.tariff.detailssheet.vm;

import com.avito.android.util.P2;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: TariffDetailsSheetViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class k<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f297444b;

    public k(l lVar) {
        this.f297444b = lVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Throwable th2 = (Throwable) obj;
        l lVar = this.f297444b;
        lVar.f297451O.postValue(new P2.a(lVar.f297447K.a(th2)));
        V2.f318762a.f(th2);
    }
}
