package com.avito.android.loyalty.ui.badges_list;

import Y41.q;
import androidx.compose.foundation.lazy.grid.X;
import androidx.compose.runtime.A;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.loyalty.data.Badge;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BadgesListScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/grid/X;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/grid/X;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class j extends N implements q<X, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Badge f183382l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f183383m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(Badge badge, Y41.l<? super DeepLink, G0> lVar) {
        super(3);
        this.f183382l = badge;
        this.f183383m = lVar;
    }

    @Override // Y41.q
    public final G0 invoke(X x12, A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 81) == 16 && a13.c()) {
            a13.f();
        } else {
            o.b(this.f183382l, BadgePosition.f183354b, this.f183383m, a13, 56);
        }
        return G0.f406611a;
    }
}
