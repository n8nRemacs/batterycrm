package com.avito.android.favorites;

import kotlin.Metadata;

/* compiled from: FavoritesView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class B1 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x1 f156196l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(x1 x1Var) {
        super(2);
        this.f156196l = x1Var;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.avito.android.favorites.compose.only_active_switch.i.a(this.f156196l.f157600d, null, a13, 0);
        }
        return kotlin.G0.f406611a;
    }
}
