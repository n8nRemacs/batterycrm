package com.avito.android.profile_settings_extended.adapter.setting;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yc0.k;

/* compiled from: SettingItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f229852l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f229853m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, DeepLink deepLink) {
        super(0);
        this.f229852l = iVar;
        this.f229853m = deepLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f229852l.f229856b.invoke(new k.a(this.f229853m));
        return G0.f406611a;
    }
}
