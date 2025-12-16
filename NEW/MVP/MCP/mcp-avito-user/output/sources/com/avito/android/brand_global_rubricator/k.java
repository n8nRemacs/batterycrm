package com.avito.android.brand_global_rubricator;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.C28452z;
import com.avito.android.deeplink_handler.handler.b;
import js0.d;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BrandGlobalRubricatorPresenterImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/brand_global_rubricator/h;", "item", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/brand_global_rubricator/h;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class k extends N implements Y41.l<h, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l f107454l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f107455m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, int i12) {
        super(1);
        this.f107454l = lVar;
        this.f107455m = i12;
    }

    @Override // Y41.l
    public final G0 invoke(h hVar) {
        h hVar2 = hVar;
        l lVar = this.f107454l;
        InterfaceC28373a interfaceC28373a = lVar.f107458d;
        String f107450a = hVar2.getF107450a();
        int i12 = this.f107455m;
        interfaceC28373a.c(new C28452z(null, null, f107450a, "", "main", null, null, Integer.valueOf(i12), null, null, null, null, null, null, null, 32611, null));
        d.a.a(lVar.f107456b, Integer.valueOf(i12), "rubricatorWidget", hVar2.getF107450a(), null, null, null, null, null, 248);
        b.a.a(lVar.f107457c, hVar2.getF107451b(), null, null, 6);
        return G0.f406611a;
    }
}
