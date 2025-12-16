package com.avito.android.comparison.menu_bottom_sheet;

import Rq.InterfaceC15071a;
import Y41.l;
import Y61.k;
import com.avito.android.calltracking.item.m;
import com.avito.android.lib.design.list_item.ListItem;
import com.avito.android.util.D6;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComparisonBottomSheetPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/menu_bottom_sheet/e;", "Lcom/avito/android/comparison/menu_bottom_sheet/b;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<InterfaceC15071a.j, G0> f124102a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<InterfaceC15071a.b, G0> f124103b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<InterfaceC15071a.h, G0> f124104c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@k l<? super InterfaceC15071a.j, G0> lVar, @k l<? super InterfaceC15071a.b, G0> lVar2, @k l<? super InterfaceC15071a.h, G0> lVar3) {
        this.f124102a = lVar;
        this.f124103b = lVar2;
        this.f124104c = lVar3;
    }

    @Override // com.avito.android.comparison.menu_bottom_sheet.b
    public final void a(@k h hVar, @k ArrayList arrayList) {
        G0 g02;
        Object next;
        Object next2;
        G0 g03;
        Iterator it = arrayList.iterator();
        while (true) {
            g02 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((a) next).f124095b == ActionType.f124090b) {
                    break;
                }
            }
        }
        a aVar = (a) next;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            } else {
                next2 = it2.next();
                if (((a) next2).f124095b == ActionType.f124091c) {
                    break;
                }
            }
        }
        a aVar2 = (a) next2;
        c cVar = new c(aVar, this);
        ListItem listItem = hVar.f124108a;
        if (aVar != null) {
            D6.G(listItem, true);
            listItem.setTitle(aVar.f124094a);
            listItem.setOnClickListener(new m(26, cVar));
            g03 = G0.f406611a;
        } else {
            g03 = null;
        }
        if (g03 == null) {
            D6.w(listItem);
        }
        d dVar = new d(aVar2, this);
        ListItem listItem2 = hVar.f124109b;
        if (aVar2 != null) {
            D6.G(listItem2, true);
            listItem2.setTitle(aVar2.f124094a);
            listItem2.setOnClickListener(new m(25, dVar));
            g02 = G0.f406611a;
        }
        if (g02 == null) {
            D6.w(listItem2);
        }
    }
}
