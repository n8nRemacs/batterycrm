package com.avito.android.delivery_tarifikator.presentation.main_screen;

import Tv.C15410a;
import Tv.InterfaceC15412c;
import com.avito.android.delivery_tarifikator.presentation.main_screen.TarifikatorMainFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TarifikatorMainFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class h extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C15410a f135602l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ TarifikatorMainFragment f135603m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C15410a c15410a, TarifikatorMainFragment tarifikatorMainFragment) {
        super(0);
        this.f135602l = c15410a;
        this.f135603m = tarifikatorMainFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        InterfaceC15412c interfaceC15412c = this.f135602l.f15978e;
        if (interfaceC15412c != null) {
            TarifikatorMainFragment.a aVar = TarifikatorMainFragment.f135523E0;
            this.f135603m.r5().accept(interfaceC15412c);
        }
        return G0.f406611a;
    }
}
