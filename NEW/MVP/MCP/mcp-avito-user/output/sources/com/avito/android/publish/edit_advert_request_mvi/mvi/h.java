package com.avito.android.publish.edit_advert_request_mvi.mvi;

import com.avito.android.arch.mvi.q;
import com.avito.android.arch.mvi.r;
import ee0.C40097d;
import ee0.InterfaceC40094a;
import ee0.InterfaceC40095b;
import ee0.InterfaceC40096c;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EditRequestFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lee0/a;", "Lee0/b;", "Lee0/d;", "Lee0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.l<q<InterfaceC40094a, InterfaceC40095b, C40097d, InterfaceC40096c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f235625l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f235626m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f235627n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f235628o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, m mVar, k kVar) {
        super(1);
        this.f235625l = fVar;
        this.f235626m = dVar;
        this.f235627n = mVar;
        this.f235628o = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC40094a, InterfaceC40095b, C40097d, InterfaceC40096c> qVar) {
        q<InterfaceC40094a, InterfaceC40095b, C40097d, InterfaceC40096c> qVar2 = qVar;
        qVar2.f92008d = this.f235625l;
        qVar2.f92009e = this.f235626m;
        qVar2.f92011g = this.f235627n;
        qVar2.f92010f = this.f235628o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        qVar2.f92014j = new r(false, true, 1, null);
        return G0.f406611a;
    }
}
