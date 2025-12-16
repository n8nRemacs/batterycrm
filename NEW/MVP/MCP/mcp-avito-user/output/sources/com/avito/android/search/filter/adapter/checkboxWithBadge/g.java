package com.avito.android.search.filter.adapter.checkboxWithBadge;

import Y61.k;
import com.avito.android.search.filter.InterfaceC34581l;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckBoxWithBadgeItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/checkboxWithBadge/g;", "Lcom/avito/android/search/filter/adapter/checkboxWithBadge/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f262131b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l41.g<com.avito.android.search.filter.converter.common.b> f262132c;

    @Inject
    public g(@k com.avito.android.deeplink_handler.handler.composite.a aVar, @k InterfaceC34581l interfaceC34581l) {
        this.f262131b = aVar;
        this.f262132c = interfaceC34581l.getF263707a();
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((i) eVar, (com.avito.android.search.filter.converter.common.c) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        com.avito.android.search.filter.converter.common.c cVar = (com.avito.android.search.filter.converter.common.c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.search.filter.converter.util.a) {
                obj = obj2;
            }
        }
        com.avito.android.search.filter.converter.util.a aVar2 = (com.avito.android.search.filter.converter.util.a) (obj instanceof com.avito.android.search.filter.converter.util.a ? obj : null);
        if (aVar2 == null) {
            k(iVar, cVar);
            return;
        }
        Boolean bool = aVar2.f262989a;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            iVar.j5();
            iVar.setChecked(zBooleanValue);
            iVar.S1(new f(cVar, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(@Y61.k com.avito.android.search.filter.adapter.checkboxWithBadge.i r4, @Y61.k com.avito.android.search.filter.converter.common.c r5) {
        /*
            r3 = this;
            r4.j5()
            java.lang.String r0 = r5.f262961c
            r4.setText(r0)
            java.lang.String r0 = r5.f262962d
            r4.setTitle(r0)
            r0 = 0
            com.avito.android.remote.model.category_parameters.Badge r1 = r5.f262970l
            if (r1 == 0) goto L2e
            java.lang.String r2 = r1.getTitle()
            r4.n4(r2)
            java.lang.String r2 = r1.getTitleColor()
            if (r2 == 0) goto L22
            r4.S70(r2)
        L22:
            java.lang.String r1 = r1.getBackgroundColor()
            if (r1 == 0) goto L2e
            r4.Pi(r1)
            kotlin.G0 r1 = kotlin.G0.f406611a
            goto L2f
        L2e:
            r1 = r0
        L2f:
            if (r1 != 0) goto L34
            r4.w0()
        L34:
            com.avito.android.deep_linking.links.DeepLink r1 = r5.f262971m
            if (r1 == 0) goto L47
            r4.ta()
            com.avito.android.publish.slots.delivery_addresses.f r0 = new com.avito.android.publish.slots.delivery_addresses.f
            r2 = 28
            r0.<init>(r2, r3, r1)
            r4.Cv(r0)
            kotlin.G0 r0 = kotlin.G0.f406611a
        L47:
            if (r0 != 0) goto L4c
            r4.pR()
        L4c:
            boolean r0 = r5.f262964f
            r4.zj(r0)
            boolean r0 = r5.f262963e
            r4.setChecked(r0)
            com.avito.android.search.filter.adapter.checkboxWithBadge.e r0 = new com.avito.android.search.filter.adapter.checkboxWithBadge.e
            r0.<init>(r5, r3)
            r4.S1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.search.filter.adapter.checkboxWithBadge.g.k(com.avito.android.search.filter.adapter.checkboxWithBadge.i, com.avito.android.search.filter.converter.common.c):void");
    }
}
