package com.avito.android.advert.item.fmp.calculator;

import Y41.p;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.text.C43066x;

/* compiled from: AdvertDetailsFmpCalculatorPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "hasFocus", "", "value", "Lkotlin/G0;", "invoke", "(ZLjava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements p<Boolean, String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l0.h<Integer> f75481l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f75482m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k f75483n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFmpCalculatorItem f75484o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l0.h<Integer> f75485p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem, h hVar, k kVar, l0.h hVar2, l0.h hVar3) {
        super(2);
        this.f75481l = hVar2;
        this.f75482m = hVar;
        this.f75483n = kVar;
        this.f75484o = advertDetailsFmpCalculatorItem;
        this.f75485p = hVar3;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.Integer] */
    @Override // Y41.p
    public final G0 invoke(Boolean bool, String str) {
        String str2 = str;
        if (!bool.booleanValue()) {
            Integer numY0 = C43066x.y0(str2);
            h hVar = this.f75482m;
            AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem = this.f75484o;
            int iO2 = h.O(numY0, advertDetailsFmpCalculatorItem);
            k kVar = this.f75483n;
            if (numY0 != null && iO2 == numY0.intValue()) {
                kVar.dH();
            } else {
                kVar.N50();
                kVar.sk(String.valueOf(iO2));
            }
            ?? ValueOf = Integer.valueOf(iO2);
            this.f75481l.f406842b = ValueOf;
            h.k(hVar, kVar, advertDetailsFmpCalculatorItem, ValueOf, this.f75485p.f406842b);
        }
        return G0.f406611a;
    }
}
