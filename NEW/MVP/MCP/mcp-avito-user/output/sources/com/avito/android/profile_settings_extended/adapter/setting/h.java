package com.avito.android.profile_settings_extended.adapter.setting;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yc0.C50214A;

/* compiled from: SettingItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f229854l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SettingItem f229855m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, SettingItem settingItem) {
        super(0);
        this.f229854l = iVar;
        this.f229855m = settingItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f229854l.f229856b.invoke(new C50214A(this.f229855m));
        return G0.f406611a;
    }
}
