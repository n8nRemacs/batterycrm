package com.avito.android.tariff_lf.edit_info.item.prolongation;

import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffProlongationItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class e extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f299048l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a f299049m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f299050n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a aVar, h hVar) {
        super(0);
        this.f299048l = fVar;
        this.f299049m = aVar;
        this.f299050n = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        a aVar = this.f299049m;
        boolean z12 = aVar.f299039f;
        boolean z13 = !z12;
        f fVar = this.f299048l;
        fVar.getClass();
        aVar.f299039f = z13;
        AttributedText attributedText = !z12 ? fVar.f299052c : fVar.f299053d;
        h hVar = this.f299050n;
        hVar.xt(attributedText);
        hVar.pM(z13);
        fVar.f299051b.accept(aVar);
        return G0.f406611a;
    }
}
