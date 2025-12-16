package com.avito.android.profile_settings_extended.adapter.about;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import yc0.InterfaceC50217a;

/* compiled from: AboutItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f229109l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AboutItem f229110m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, AboutItem aboutItem) {
        super(0);
        this.f229109l = gVar;
        this.f229110m = aboutItem;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f229109l;
        gVar.f229115b.invoke(new InterfaceC50217a.C12908a(this.f229110m));
        return G0.f406611a;
    }
}
