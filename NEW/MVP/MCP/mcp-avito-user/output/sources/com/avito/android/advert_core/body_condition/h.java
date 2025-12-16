package com.avito.android.advert_core.body_condition;

import com.avito.android.advert_core.analytics.body_condition.FromPage;
import com.avito.android.deep_linking.links.BodyCondition;
import com.avito.android.deep_linking.links.BodyConditionBottomSheetLink;
import j8.C42218a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsCarBodyConditionPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsCarBodyConditionItem f83039l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i f83040m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(AdvertDetailsCarBodyConditionItem advertDetailsCarBodyConditionItem, i iVar) {
        super(0);
        this.f83039l = advertDetailsCarBodyConditionItem;
        this.f83040m = iVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.avito.android.advert_core.body_condition.f$a, java.lang.Object] */
    @Override // Y41.a
    public final G0 invoke() {
        ?? r02;
        i iVar = this.f83040m;
        String strA = iVar.f83043d.a();
        AdvertDetailsCarBodyConditionItem advertDetailsCarBodyConditionItem = this.f83039l;
        String str = advertDetailsCarBodyConditionItem.f83028e;
        FromPage fromPage = advertDetailsCarBodyConditionItem.f83029f;
        iVar.f83042c.c(new C42218a(str, strA, fromPage));
        BodyCondition bodyCondition = advertDetailsCarBodyConditionItem.f83027d;
        BodyConditionBottomSheetLink bodyConditionBottomSheetLink = bodyCondition != null ? new BodyConditionBottomSheetLink(bodyCondition, fromPage.f82804b) : null;
        if (bodyConditionBottomSheetLink != null && (r02 = iVar.f83044e) != 0) {
            r02.f(bodyConditionBottomSheetLink);
        }
        return G0.f406611a;
    }
}
