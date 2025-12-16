package com.avito.android.select_districts.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: SelectDistrictsItemsManager.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/select_districts/items/selected/o;", "it", "", "invoke", "(Lcom/avito/android/select_districts/items/selected/o;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class l extends N implements Y41.l<com.avito.android.select_districts.items.selected.o, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.select_districts.items.selectable.c f266936l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.avito.android.select_districts.items.selectable.c cVar) {
        super(1);
        this.f266936l = cVar;
    }

    @Override // Y41.l
    public final Boolean invoke(com.avito.android.select_districts.items.selected.o oVar) {
        com.avito.android.select_districts.items.selected.o oVar2 = oVar;
        com.avito.android.select_districts.items.selectable.c cVar = this.f266936l;
        return Boolean.valueOf(L.f(oVar2.f267003a, cVar != null ? cVar.f266966b : null));
    }
}
