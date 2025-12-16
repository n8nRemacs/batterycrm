package com.avito.android.advert_core.auto_select_parameters_v2.advantage;

import com.avito.android.analytics.event.auto_select.FromPage;
import hc.C40911a;
import java.util.LinkedHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectExpandableAdvantagePresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f82966l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AutoSelectExpandableAdvantageItem f82967m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ h f82968n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, AutoSelectExpandableAdvantageItem autoSelectExpandableAdvantageItem, h hVar) {
        super(0);
        this.f82966l = dVar;
        this.f82967m = autoSelectExpandableAdvantageItem;
        this.f82968n = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f82966l;
        AutoSelectExpandableAdvantageItem autoSelectExpandableAdvantageItem = this.f82967m;
        String str = autoSelectExpandableAdvantageItem.f82954f;
        Boolean bool = Boolean.TRUE;
        LinkedHashMap linkedHashMap = dVar.f82964e;
        boolean zBooleanValue = ((Boolean) linkedHashMap.getOrDefault(str, bool)).booleanValue();
        boolean z12 = !zBooleanValue;
        if (zBooleanValue) {
            C40911a.f397284g.getClass();
            dVar.f82962c.c(new C40911a(FromPage.f90013c, autoSelectExpandableAdvantageItem.f82951c, dVar.f82963d, autoSelectExpandableAdvantageItem.f82953e));
        }
        linkedHashMap.put(autoSelectExpandableAdvantageItem.f82954f, Boolean.valueOf(z12));
        this.f82968n.y5(z12);
        return G0.f406611a;
    }
}
