package com.avito.android.repair_calculator;

import Y41.p;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import wm0.C49651a;

/* compiled from: AdvertDetailsRepairCalculatorBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "selectedChip", "", "price", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements p<String, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f254477l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsRepairCalculatorItem f254478m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItem) {
        super(2);
        this.f254477l = gVar;
        this.f254478m = advertDetailsRepairCalculatorItem;
    }

    @Override // Y41.p
    public final G0 invoke(String str, Integer num) {
        String str2 = str;
        int iIntValue = num.intValue();
        String strA = C49651a.a(str2);
        g gVar = this.f254477l;
        AdvertDetailsRepairCalculatorItem advertDetailsRepairCalculatorItem = this.f254478m;
        gVar.f254483d.c(new wm0.e(advertDetailsRepairCalculatorItem.f254466c, advertDetailsRepairCalculatorItem.f254467d, strA));
        b.a.a(gVar.f254481b, gVar.f254482c.a(advertDetailsRepairCalculatorItem, str2, iIntValue), null, null, 6);
        return G0.f406611a;
    }
}
