package com.avito.android.user_advert.advert;

import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MyAdvertDetailsView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.o1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final /* synthetic */ class C35442o1 implements InterfaceC43172j, kotlin.jvm.internal.D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.konveyor.adapter.a f310575b;

    public C35442o1(com.avito.konveyor.adapter.a aVar) {
        this.f310575b = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        int i12 = C35436m1.f310544u;
        this.f310575b.c((UV0.a) obj);
        kotlin.G0 g02 = kotlin.G0.f406611a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g02;
    }

    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof InterfaceC43172j) && (obj instanceof kotlin.jvm.internal.D)) {
            return getFunctionDelegate().equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @Y61.k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new C42801a(2, this.f310575b, com.avito.konveyor.adapter.a.class, "onDataSourceChanged", "onDataSourceChanged(Lcom/avito/konveyor/data_source/DataSource;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
