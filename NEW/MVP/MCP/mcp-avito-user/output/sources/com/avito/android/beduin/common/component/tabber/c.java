package com.avito.android.beduin.common.component.tabber;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BeduinTabberComponent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/component/tabber/TabberChange;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/beduin/common/component/tabber/TabberChange;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements l<TabberChange, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f102763l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.beduin.common.component.tabber.a f102764m;

    /* compiled from: BeduinTabberComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f102765a;

        static {
            int[] iArr = new int[TabberChange.values().length];
            try {
                iArr[TabberChange.f102751c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f102765a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g gVar, com.avito.android.beduin.common.component.tabber.a aVar) {
        super(1);
        this.f102763l = gVar;
        this.f102764m = aVar;
    }

    @Override // Y41.l
    public final G0 invoke(TabberChange tabberChange) {
        if (a.f102765a[tabberChange.ordinal()] == 1) {
            com.avito.android.beduin.common.component.tabber.a aVar = this.f102764m;
            int selectedTabIndex = aVar.f102757f.getSelectedTabIndex();
            b bVar = new b(aVar.f102757f, aVar);
            g gVar = this.f102763l;
            com.avito.android.beduin.common.shared.tabs.c cVar = gVar.f102768c;
            if (cVar != null) {
                cVar.f103473b = null;
            }
            com.avito.android.beduin.common.shared.tabs.a aVar2 = gVar.f102769d;
            if (aVar2 != null) {
                aVar2.f103467c = null;
            }
            com.avito.android.beduin.common.shared.tabs.d resolvedTabs = gVar.getResolvedTabs();
            if (resolvedTabs != null) {
                resolvedTabs.Qa(selectedTabIndex);
            }
            com.avito.android.beduin.common.shared.tabs.d resolvedTabs2 = gVar.getResolvedTabs();
            if (resolvedTabs2 != null) {
                resolvedTabs2.nc(bVar);
            }
        }
        return G0.f406611a;
    }
}
