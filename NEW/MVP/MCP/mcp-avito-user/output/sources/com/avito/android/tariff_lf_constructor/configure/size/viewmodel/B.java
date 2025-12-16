package com.avito.android.tariff_lf_constructor.configure.size.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: ConstructorConfigureSizeViewModel.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/conveyor_item/a;", "item", "invoke", "(Lcom/avito/conveyor_item/a;)Lcom/avito/conveyor_item/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class B extends N implements Y41.l<com.avito.conveyor_item.a, com.avito.conveyor_item.a> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f300345l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ E f300346m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(E e12, String str) {
        super(1);
        this.f300345l = str;
        this.f300346m = e12;
    }

    @Override // Y41.l
    public final com.avito.conveyor_item.a invoke(com.avito.conveyor_item.a aVar) {
        com.avito.android.tariff_lf_constructor.configure.size.ui.h hVar;
        com.avito.conveyor_item.a aVar2 = aVar;
        if (!(aVar2 instanceof com.avito.android.tariff_lf_constructor.configure.size.items.size.a)) {
            return aVar2;
        }
        com.avito.android.tariff_lf_constructor.configure.size.items.size.a aVar3 = (com.avito.android.tariff_lf_constructor.configure.size.items.size.a) aVar2;
        String str = aVar3.f300305c;
        String str2 = this.f300345l;
        if (L.f(str, str2) && (hVar = aVar3.f300309g) != null) {
            E.ke(this.f300346m, hVar);
        }
        return com.avito.android.tariff_lf_constructor.configure.size.items.size.a.a(aVar3, null, null, L.f(str, str2), false, 383);
    }
}
