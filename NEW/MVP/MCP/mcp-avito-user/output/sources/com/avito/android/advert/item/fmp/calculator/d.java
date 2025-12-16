package com.avito.android.advert.item.fmp.calculator;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsFmpCalculatorPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<Integer> f75476l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f75477m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f75478n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFmpCalculatorItem f75479o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l0.h<Integer> f75480p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem, h hVar, k kVar, l0.h hVar2, l0.h hVar3) {
        super(1);
        this.f75476l = hVar2;
        this.f75477m = kVar;
        this.f75478n = hVar;
        this.f75479o = advertDetailsFmpCalculatorItem;
        this.f75480p = hVar3;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [T, java.lang.Integer] */
    @Override // Y41.l
    public final G0 invoke(String str) {
        ?? Y02 = C43066x.y0(str);
        l0.h<Integer> hVar = this.f75476l;
        hVar.f406842b = Y02;
        k kVar = this.f75477m;
        kVar.dH();
        Integer num = hVar.f406842b;
        if (num != null) {
            h.k(this.f75478n, kVar, this.f75479o, Integer.valueOf(num.intValue()), this.f75480p.f406842b);
        }
        return G0.f406611a;
    }
}
