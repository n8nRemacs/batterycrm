package com.avito.android.search.filter.adapter.bottom_sheet_group;

import com.avito.android.R;
import com.avito.android.search.filter.InterfaceC34581l;
import com.avito.android.search.filter.converter.ParameterElement;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetGroupItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/adapter/bottom_sheet_group/h;", "Lcom/avito/android/search/filter/adapter/bottom_sheet_group/c;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f262017b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.b> f262018c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.b> f262019d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final l41.g<ParameterElement.b> f262020e;

    @Inject
    public h(@Y61.k InterfaceC34581l interfaceC34581l, @Y61.k l lVar) {
        this.f262017b = lVar;
        this.f262018c = interfaceC34581l.getF263715i();
        this.f262019d = interfaceC34581l.getF263710d();
        this.f262020e = interfaceC34581l.getF263718l();
    }

    public static final void k(h hVar, j jVar, Boolean bool, String str) {
        l lVar = hVar.f262017b;
        lVar.a(str);
        jVar.JP(lVar.b(str, bool != null ? bool.booleanValue() : false));
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        G0 g02;
        j jVar = (j) eVar;
        ParameterElement.b bVar = (ParameterElement.b) aVar;
        Boolean bool = bVar.f262736h;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        l lVar = this.f262017b;
        String str = bVar.f262731c;
        boolean zB2 = lVar.b(str, zBooleanValue);
        jVar.setTitle(bVar.f262732d);
        String str2 = bVar.f262734f;
        if (str2 != null) {
            jVar.o(str2);
        }
        jVar.T9();
        String str3 = bVar.f262735g;
        if (str3 == null || str3.length() == 0) {
            jVar.Mz(R.attr.ic_arrowDown20, new d(this, bVar, jVar, str));
        } else {
            jVar.Mz(R.attr.ic_close16, new e(jVar, this, bVar));
        }
        jVar.a(new f(this, bVar, jVar, str));
        if (str3 != null) {
            jVar.m(str3);
            g02 = G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            jVar.m("");
        }
        jVar.JP(zB2);
        List<Cp0.e> list = bVar.f262733e;
        if (list != null) {
            for (Cp0.e eVar2 : list) {
                jVar.WV(eVar2.f2698c, eVar2.f2700e, new g(eVar2, this, bVar, jVar, str));
            }
        }
    }
}
