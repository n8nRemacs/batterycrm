package com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items;

import FE.a;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeesByPackageBulletsList.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FeesByPackageState.b f158119l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<FE.a, G0> f158120m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(FeesByPackageState.b bVar, Y41.l<? super FE.a, G0> lVar) {
        super(0);
        this.f158119l = bVar;
        this.f158120m = lVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        FeesByPackageState.d dVar = this.f158119l.f158047c;
        if (dVar != null) {
            this.f158120m.invoke(new a.b(dVar.f158049b));
        }
        return G0.f406611a;
    }
}
