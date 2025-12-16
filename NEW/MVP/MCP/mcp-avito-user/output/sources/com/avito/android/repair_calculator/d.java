package com.avito.android.repair_calculator;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import wm0.C49651a;
import wm0.C49653c;

/* compiled from: AdvertDetailsRepairCalculatorBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "chipTitle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class d extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f254475l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsRepairCalculatorItem f254476m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItem) {
        super(1);
        this.f254475l = gVar;
        this.f254476m = advertDetailsRepairCalculatorItem;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        String strA = C49651a.a(str);
        g gVar = this.f254475l;
        AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItem = this.f254476m;
        gVar.f254483d.c(new C49653c(advertDetailsRepairCalculatorItem.f254466c, advertDetailsRepairCalculatorItem.f254467d, strA));
        return G0.f406611a;
    }
}
