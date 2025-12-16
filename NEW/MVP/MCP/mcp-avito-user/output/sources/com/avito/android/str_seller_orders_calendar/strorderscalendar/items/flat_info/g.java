package com.avito.android.str_seller_orders_calendar.strorderscalendar.items.flat_info;

import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.sequences.C43034q;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.V0;

/* compiled from: FlatInfoItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h f290941l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar) {
        super(0);
        this.f290941l = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        N0 n02 = this.f290941l.f290945e;
        if (n02 != null) {
            Iterator<Object> it = ((C43034q) ((V0) n02).getChildren()).iterator();
            while (it.hasNext()) {
                ((N0) it.next()).c(null);
            }
        }
        return G0.f406611a;
    }
}
