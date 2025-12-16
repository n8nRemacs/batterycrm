package com.avito.android.serp.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ViewedStatusResolver.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/o1;", "Lcom/avito/android/serp/adapter/n1;", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o1 implements n1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.d f270448a;

    /* compiled from: ViewedStatusResolver.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/conveyor_item/a;", "T", "it", "apply", "(Lcom/avito/conveyor_item/a;)Lcom/avito/conveyor_item/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) obj;
            if (aVar instanceof m1) {
                ((m1) aVar).setViewed(o1.this.f270448a.a(aVar.getF138301b()));
            }
            return aVar;
        }
    }

    public o1(@Y61.k com.avito.android.advert.viewed.d dVar) {
        this.f270448a = dVar;
    }

    @Override // com.avito.android.serp.adapter.n1
    @Y61.k
    public final <T extends com.avito.conveyor_item.a> io.reactivex.rxjava3.core.z<List<T>> a(@Y61.k List<? extends T> list) {
        return (io.reactivex.rxjava3.core.z<List<T>>) io.reactivex.rxjava3.core.z.X(list).d0(new a()).H0().F();
    }

    @Override // com.avito.android.serp.adapter.n1
    public final <T extends com.avito.conveyor_item.a> void b(@Y61.k List<? extends T> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((com.avito.conveyor_item.a) obj) instanceof m1) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.avito.conveyor_item.a aVar = (com.avito.conveyor_item.a) it.next();
            String f138301b = aVar.getF138301b();
            ((m1) aVar).setViewed(this.f270448a.a(f138301b));
        }
    }
}
