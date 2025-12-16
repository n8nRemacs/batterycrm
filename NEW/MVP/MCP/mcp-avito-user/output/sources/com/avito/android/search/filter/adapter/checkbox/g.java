package com.avito.android.search.filter.adapter.checkbox;

import Y61.k;
import com.avito.android.search.filter.InterfaceC34581l;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CheckBoxItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/checkbox/g;", "Lcom/avito/android/search/filter/adapter/checkbox/d;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l41.g<com.avito.android.search.filter.converter.common.b> f262118b;

    @Inject
    public g(@k InterfaceC34581l interfaceC34581l) {
        this.f262118b = interfaceC34581l.getF263707a();
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        com.avito.android.search.filter.converter.common.b bVar = (com.avito.android.search.filter.converter.common.b) aVar;
        iVar.j5();
        iVar.setText(bVar.f262952c);
        iVar.setChecked(bVar.f262953d);
        iVar.S1(new e(bVar, this));
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        i iVar = (i) eVar;
        com.avito.android.search.filter.converter.common.b bVar = (com.avito.android.search.filter.converter.common.b) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof com.avito.android.search.filter.converter.util.a) {
                obj = obj2;
            }
        }
        com.avito.android.search.filter.converter.util.a aVar2 = (com.avito.android.search.filter.converter.util.a) (obj instanceof com.avito.android.search.filter.converter.util.a ? obj : null);
        if (aVar2 == null) {
            iVar.j5();
            iVar.setText(bVar.f262952c);
            iVar.setChecked(bVar.f262953d);
            iVar.S1(new e(bVar, this));
            return;
        }
        Boolean bool = aVar2.f262989a;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            iVar.j5();
            iVar.setChecked(zBooleanValue);
            iVar.S1(new f(bVar, this));
        }
    }
}
