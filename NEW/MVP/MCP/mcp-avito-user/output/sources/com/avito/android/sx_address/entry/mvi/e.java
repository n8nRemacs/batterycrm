package com.avito.android.sx_address.entry.mvi;

import Y41.l;
import com.avito.android.arch.mvi.q;
import com.avito.android.sx_address.entry.mvi.entity.SxAddressEntryInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: SxAddressEntryFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LDA0/b;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction;", "LDA0/d;", "LDA0/c;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements l<q<DA0.b, SxAddressEntryInternalAction, DA0.d, DA0.c>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c f292959l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f292960m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ j f292961n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ h f292962o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, a aVar, j jVar, h hVar) {
        super(1);
        this.f292959l = cVar;
        this.f292960m = aVar;
        this.f292961n = jVar;
        this.f292962o = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<DA0.b, SxAddressEntryInternalAction, DA0.d, DA0.c> qVar) {
        q<DA0.b, SxAddressEntryInternalAction, DA0.d, DA0.c> qVar2 = qVar;
        qVar2.f92008d = this.f292959l;
        qVar2.f92009e = this.f292960m;
        qVar2.f92011g = this.f292961n;
        qVar2.f92010f = this.f292962o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
