package com.avito.android.select.bottom_sheet.blueprints.chips;

import Y41.l;
import dq0.InterfaceC39781c;
import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CheckableChipsItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "selectedId", "Lkotlin/G0;", "invoke", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements l<Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a f265074l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f265075m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, d dVar) {
        super(1);
        this.f265074l = aVar;
        this.f265075m = dVar;
    }

    @Override // Y41.l
    public final G0 invoke(Integer num) {
        Object next;
        l<InterfaceC39781c, G0> lVar;
        int iIntValue = num.intValue();
        Iterator it = this.f265074l.f265061d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (iIntValue == ((com.avito.android.select.variant.a) next).f266834b.hashCode()) {
                break;
            }
        }
        com.avito.android.select.variant.a aVar = (com.avito.android.select.variant.a) next;
        if (aVar != null && (lVar = this.f265075m.f265073c) != null) {
            lVar.invoke(new InterfaceC39781c.j(aVar));
        }
        return G0.f406611a;
    }
}
