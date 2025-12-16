package com.avito.android.settings.adapter;

import Nv0.InterfaceC14616a;
import com.avito.android.settings.adapter.i0;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InfoSettingsWithProgressItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.settings.adapter.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C34967z extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ A f280815l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0.e f280816m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34967z(A a12, i0.e eVar) {
        super(0);
        this.f280815l = a12;
        this.f280816m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        Y41.l<InterfaceC14616a, G0> lVar = this.f280815l.f280728b;
        this.f280816m.getClass();
        lVar.invoke(new InterfaceC14616a.c("clearSearchHistory"));
        return G0.f406611a;
    }
}
