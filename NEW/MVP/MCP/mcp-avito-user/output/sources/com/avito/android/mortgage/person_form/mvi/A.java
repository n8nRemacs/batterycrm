package com.avito.android.mortgage.person_form.mvi;

import kotlin.Metadata;

/* compiled from: PersonFormContentUpdater.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/form/d;", "it", "invoke", "(Lcom/avito/android/mortgage/api/model/items/form/d;)Lcom/avito/android/mortgage/api/model/items/form/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class A extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.mortgage.api.model.items.form.d, com.avito.android.mortgage.api.model.items.form.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H f200859l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f200860m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f200861n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(H h12, String str, boolean z12) {
        super(1);
        this.f200859l = h12;
        this.f200860m = str;
        this.f200861n = z12;
    }

    @Override // Y41.l
    public final com.avito.android.mortgage.api.model.items.form.d invoke(com.avito.android.mortgage.api.model.items.form.d dVar) {
        com.avito.android.mortgage.api.model.items.form.d dVar2 = dVar;
        this.f200859l.getClass();
        return dVar2 instanceof LZ.b ? ((LZ.b) dVar2).j(this.f200860m, this.f200861n) : dVar2;
    }
}
