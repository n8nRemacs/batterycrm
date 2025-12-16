package com.avito.android.loyalty.ui.badge_details_v3.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.loyalty.ui.badge_details_v3.mvi.entity.BadgeDetailsV3InternalAction;
import com.avito.android.util.R0;
import fX.C40354b;
import fX.InterfaceC40353a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BadgeDetailsV3Actor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/b;", "Lcom/avito/android/arch/mvi/a;", "LfX/a;", "Lcom/avito/android/loyalty/ui/badge_details_v3/mvi/entity/BadgeDetailsV3InternalAction;", "LfX/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.arch.mvi.a<InterfaceC40353a, BadgeDetailsV3InternalAction, C40354b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.loyalty.ui.badge_details_v3.e f183316a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f183317b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f183318c;

    @Inject
    public b(@Y61.k com.avito.android.loyalty.ui.badge_details_v3.e eVar, @com.avito.android.loyalty.di.badge_details_v3.f @Y61.k String str, @Y61.k R0 r02) {
        this.f183316a = eVar;
        this.f183317b = str;
        this.f183318c = r02;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<BadgeDetailsV3InternalAction> b(InterfaceC40353a interfaceC40353a, C40354b c40354b) {
        InterfaceC40353a interfaceC40353a2 = interfaceC40353a;
        if (interfaceC40353a2 instanceof InterfaceC40353a.b) {
            return new C43210w(new BadgeDetailsV3InternalAction.HandleDeeplink(((InterfaceC40353a.b) interfaceC40353a2).f395897a));
        }
        if (interfaceC40353a2 instanceof InterfaceC40353a.c) {
            return C43175k.I(this.f183318c.a(), C43175k.G(new a(this, null)));
        }
        if (interfaceC40353a2 instanceof InterfaceC40353a.C11155a) {
            return new C43210w(new BadgeDetailsV3InternalAction.CollapseItemClicked(((InterfaceC40353a.C11155a) interfaceC40353a2).f395896a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
