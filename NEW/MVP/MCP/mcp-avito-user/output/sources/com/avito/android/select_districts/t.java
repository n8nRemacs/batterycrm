package com.avito.android.select_districts;

import android.view.View;
import com.avito.android.select_districts.o;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SelectDistrictsViewRenderer_Factory_Impl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/select_districts/t;", "Lcom/avito/android/select_districts/o$a;", "a", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements o.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f267120b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final s f267121a;

    /* compiled from: SelectDistrictsViewRenderer_Factory_Impl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/select_districts/t$a;", "", "<init>", "()V", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public t(@Y61.k s sVar) {
        this.f267121a = sVar;
    }

    @Override // com.avito.android.select_districts.o.a
    @Y61.k
    public final o a(@Y61.k View view, @Y61.k Y41.l<? super String, G0> lVar, @Y61.k Y41.a<G0> aVar, @Y61.k Y41.a<G0> aVar2, @Y61.k Y41.a<G0> aVar3, @Y61.k Y41.a<G0> aVar4) {
        s sVar = this.f267121a;
        com.avito.konveyor.adapter.j jVar = sVar.f267118a.get();
        com.avito.android.recycler.data_aware.c cVar = (com.avito.android.recycler.data_aware.c) sVar.f267119b.get();
        s.f267117c.getClass();
        return new o(view, lVar, aVar, aVar2, aVar3, aVar4, jVar, cVar);
    }
}
