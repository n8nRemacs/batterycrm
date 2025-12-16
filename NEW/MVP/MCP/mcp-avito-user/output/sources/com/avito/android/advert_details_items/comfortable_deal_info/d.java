package com.avito.android.advert_details_items.comfortable_deal_info;

import Y41.l;
import com.avito.android.comfortable_deal_info.deeplink.ComfortableDealInfoLink;
import com.avito.android.comfortable_deal_info.dto.Screen;
import com.avito.android.deeplink_handler.handler.b;
import java.util.ArrayList;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: ComfortableDealInfoPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "currentIndex", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f84582l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ f f84583m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ArrayList arrayList, f fVar) {
        super(1);
        this.f84582l = arrayList;
        this.f84583m = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        String str;
        int iIntValue = num.intValue();
        ArrayList arrayList = this.f84582l;
        Screen screen = (Screen) C42745f0.K(iIntValue, arrayList);
        f fVar = this.f84583m;
        if (screen != null && (str = screen.f123488e) != null) {
            fVar.f84587c.c(new a(str));
        }
        b.a.a(fVar.f84586b, new ComfortableDealInfoLink(iIntValue, arrayList), null, null, 6);
        return G0.f406611a;
    }
}
