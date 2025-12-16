package com.avito.android.extended_profile_serp;

import bB.InterfaceC25487a;
import cU0.InterfaceC27108f;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import iT.C41343c;
import iT.InterfaceC41341a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.i2;

/* compiled from: ExtendedProfileSerpViewModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_serp/d0;", "Lcom/avito/android/arch/mvi/android/j;", "LbB/a;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpState;", "LbB/b;", "LiT/a;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d0 extends com.avito.android.arch.mvi.android.j<InterfaceC25487a, ExtendedProfileSerpState, bB.b> implements InterfaceC41341a {

    /* renamed from: N, reason: collision with root package name */
    public final /* synthetic */ C41343c f152650N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public d0(@Y61.k com.avito.android.extended_profile_serp.mvi.t tVar, @Y61.k C41343c c41343c) {
        super(tVar, i2.a.f411433c);
        i2.f411430a.getClass();
        this.f152650N = c41343c;
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final InterfaceC27108f Ed() {
        return this.f152650N.f398527c;
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final com.avito.beduin.v2.engine.component.z H4() {
        return this.f152650N.f398526b;
    }
}
