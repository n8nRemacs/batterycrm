package com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oB.C;

/* compiled from: TabsWithWidgetsItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "index", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f154946l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TabsWithWidgetsItem f154947m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, TabsWithWidgetsItem tabsWithWidgetsItem) {
        super(1);
        this.f154946l = eVar;
        this.f154947m = tabsWithWidgetsItem;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        int iIntValue = num.intValue();
        e eVar = this.f154946l;
        eVar.f154948b.invoke(new C(this.f154947m, iIntValue));
        return G0.f406611a;
    }
}
