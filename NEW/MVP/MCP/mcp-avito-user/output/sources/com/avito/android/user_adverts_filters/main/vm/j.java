package com.avito.android.user_adverts_filters.main.vm;

import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.flow.InterfaceC43172j;
import rJ0.InterfaceC47554a;

/* compiled from: UserAdvertsFiltersMainMviViewModel.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class j implements InterfaceC43172j, D {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f316443b;

    public j(e eVar) {
        this.f316443b = eVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43172j
    public final Object emit(Object obj, Continuation continuation) {
        this.f316443b.accept((InterfaceC47554a) obj);
        G0 g02 = G0.f406611a;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return g02;
    }

    public final boolean equals(@Y61.l Object obj) {
        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.D
    @Y61.k
    public final InterfaceC43072x<?> getFunctionDelegate() {
        return new C42801a(2, this.f316443b, e.class, "accept", "accept(Lcom/avito/android/user_adverts_filters/main/mvi_main/entity/MainFiltersAction;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
