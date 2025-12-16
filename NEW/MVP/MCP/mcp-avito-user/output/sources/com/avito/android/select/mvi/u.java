package com.avito.android.select.mvi;

import com.avito.android.lib.design.toggle.State;
import com.avito.android.remote.model.ParcelableEntity;
import dq0.C39783e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;

/* compiled from: SelectReducer.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/lib/design/toggle/State;", "toggleState", "", "Lcom/avito/conveyor_item/a;", "items", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/toggle/State;Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class u extends N implements Y41.p<State, List<? extends com.avito.conveyor_item.a>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r f265652l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C39783e f265653m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r rVar, C39783e c39783e) {
        super(2);
        this.f265652l = rVar;
        this.f265653m = c39783e;
    }

    @Override // Y41.p
    public final G0 invoke(State state, List<? extends com.avito.conveyor_item.a> list) {
        C39783e c39783e;
        State state2 = state;
        this.f265652l.getClass();
        List<? extends com.avito.conveyor_item.a> list2 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c39783e = this.f265653m;
            if (!zHasNext) {
                break;
            }
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it.next();
            arrayList.add(r.c(aVar.getF76444c(), c39783e.f394140g));
        }
        int iOrdinal = state2.ordinal();
        if (iOrdinal == 0) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ParcelableEntity<String> parcelableEntity = (ParcelableEntity) it2.next();
                if (parcelableEntity != null) {
                    c39783e.f394139f.add(parcelableEntity);
                }
            }
        } else if (iOrdinal == 1) {
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ParcelableEntity parcelableEntity2 = (ParcelableEntity) it3.next();
                if (parcelableEntity2 != null) {
                    c39783e.f394139f.remove(parcelableEntity2);
                }
            }
        }
        return G0.f406611a;
    }
}
