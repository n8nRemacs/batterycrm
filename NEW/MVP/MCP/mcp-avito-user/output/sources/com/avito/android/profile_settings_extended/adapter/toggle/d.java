package com.avito.android.profile_settings_extended.adapter.toggle;

import Y41.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yc0.C50215B;

/* compiled from: ToggleItemPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements l<Boolean, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f229878l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ToggleItem f229879m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, ToggleItem toggleItem) {
        super(1);
        this.f229878l = eVar;
        this.f229879m = toggleItem;
    }

    @Override // Y41.l
    public final G0 invoke(Boolean bool) {
        bool.getClass();
        e eVar = this.f229878l;
        eVar.f229880b.invoke(new C50215B(this.f229879m));
        return G0.f406611a;
    }
}
