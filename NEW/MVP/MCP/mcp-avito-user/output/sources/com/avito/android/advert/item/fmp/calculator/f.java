package com.avito.android.advert.item.fmp.calculator;

import com.avito.android.remote.fmp.AnalyticsEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsFmpCalculatorPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "chipsItem", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsFmpCalculatorItem f75486l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0.h<Integer> f75487m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f75488n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ k f75489o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l0.h<Integer> f75490p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem, h hVar, k kVar, l0.h hVar2, l0.h hVar3) {
        super(1);
        this.f75486l = advertDetailsFmpCalculatorItem;
        this.f75487m = hVar2;
        this.f75488n = hVar;
        this.f75489o = kVar;
        this.f75490p = hVar3;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Integer] */
    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        AdvertDetailsFmpCalculatorItem advertDetailsFmpCalculatorItem = this.f75486l;
        List<AnalyticsEvent> list = advertDetailsFmpCalculatorItem.f75463l;
        h hVar = this.f75488n;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                hVar.f75498d.c(j.a((AnalyticsEvent) it.next()));
            }
        }
        l0.h<Integer> hVar2 = this.f75487m;
        Integer num2 = hVar2.f406842b;
        int iO2 = h.O(num2, advertDetailsFmpCalculatorItem);
        k kVar = this.f75489o;
        if (num2 != null && iO2 == num2.intValue()) {
            kVar.dH();
        } else {
            kVar.N50();
            kVar.sk(String.valueOf(iO2));
        }
        hVar2.f406842b = Integer.valueOf(iO2);
        ?? ValueOf = Integer.valueOf(iIntValue);
        this.f75490p.f406842b = ValueOf;
        h.k(hVar, kVar, advertDetailsFmpCalculatorItem, hVar2.f406842b, ValueOf);
        return G0.f406611a;
    }
}
