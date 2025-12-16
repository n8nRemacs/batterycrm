package com.avito.android.car_navigator.presentation;

import Dm.InterfaceC13414a;
import Y41.l;
import com.avito.android.car_navigator.presentation.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CarNavigatorWebViewController.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/car_navigator/presentation/k;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/car_navigator/presentation/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class f extends N implements l<k, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f115245l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.f115245l = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(k kVar) {
        k kVar2 = kVar;
        boolean zEquals = kVar2.equals(k.b.f115266a);
        g gVar = this.f115245l;
        if (zEquals) {
            gVar.f115247b.invoke(new InterfaceC13414a.C0189a(false, 1, null));
        } else if (kVar2.equals(k.a.f115265a)) {
            gVar.f115247b.invoke(new InterfaceC13414a.C0189a(true));
        }
        return G0.f406611a;
    }
}
