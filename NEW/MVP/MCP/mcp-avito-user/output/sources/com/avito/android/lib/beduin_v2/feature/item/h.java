package com.avito.android.lib.beduin_v2.feature.item;

import com.avito.android.arch.mvi.android.k;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.n;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.lib.beduin_v2.feature.mvi.y;
import kotlin.AbstractC40048c;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.n2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: BeduinItemViewModel.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/item/h;", "Lcom/avito/android/arch/mvi/android/k;", "LeT/a;", "LeT/c;", "Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes14.dex */
public final class h implements k<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C43238h f176191b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> f176192c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final n2<AbstractC40048c> f176193d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43160i<BeduinOneTimeEvent> f176194e;

    public h(@Y61.k C43238h c43238h, @Y61.k n.a aVar) {
        this.f176191b = c43238h;
        y yVarA = aVar.a(c43238h);
        this.f176192c = yVarA;
        this.f176193d = C43175k.U(yVarA, c43238h, com.avito.android.arch.mvi.android.a.f91843a, AbstractC40048c.C11084c.f395217b);
        this.f176194e = yVarA.f176364c;
    }

    @Override // com.avito.android.arch.mvi.android.l
    public final void accept(Object obj) {
        C43259k.d(this.f176191b, null, null, new g(this, (InterfaceC40047a) obj, null), 3);
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final InterfaceC43160i<BeduinOneTimeEvent> getEvents() {
        return this.f176194e;
    }

    @Override // com.avito.android.arch.mvi.android.m
    @Y61.k
    public final n2<AbstractC40048c> getState() {
        return this.f176193d;
    }
}
