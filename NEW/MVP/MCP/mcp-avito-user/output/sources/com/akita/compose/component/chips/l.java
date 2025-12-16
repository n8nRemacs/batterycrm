package com.akita.compose.component.chips;

import androidx.compose.foundation.lazy.m0;
import androidx.compose.runtime.internal.C22096n;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Chips.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/m0;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/m0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class l extends N implements Y41.l<m0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<InterfaceC27333b> f60945l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f60946m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, C22096n c22096n) {
        super(1);
        this.f60945l = list;
        this.f60946m = c22096n;
    }

    @Override // Y41.l
    public final G0 invoke(m0 m0Var) {
        List<InterfaceC27333b> list = this.f60945l;
        m0Var.a(list.size(), null, new j(list), new C22096n(-1091073711, new k(list, this.f60946m), true));
        return G0.f406611a;
    }
}
