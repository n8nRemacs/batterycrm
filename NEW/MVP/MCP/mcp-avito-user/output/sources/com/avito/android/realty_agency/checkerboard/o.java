package com.avito.android.realty_agency.checkerboard;

import Zh0.C19563e;
import Zh0.InterfaceC19559a;
import Zh0.InterfaceC19562d;
import androidx.compose.runtime.internal.P;
import cU0.InterfaceC27108f;
import com.avito.android.realty_agency.checkerboard.mvi.w;
import com.avito.beduin.v2.engine.component.z;
import iT.InterfaceC41341a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.i2;

/* compiled from: CheckerboardViewModel.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/realty_agency/checkerboard/o;", "Lcom/avito/android/arch/mvi/android/j;", "LZh0/a;", "LZh0/e;", "LZh0/d;", "LiT/a;", "_avito_realty-agency_checkerboard_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class o extends com.avito.android.arch.mvi.android.j<InterfaceC19559a, C19563e, InterfaceC19562d> implements InterfaceC41341a {

    /* renamed from: N, reason: collision with root package name */
    public final /* synthetic */ InterfaceC41341a f251357N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public o(@Y61.k w wVar, @Y61.k InterfaceC41341a interfaceC41341a) {
        super(wVar, i2.a.f411433c);
        i2.f411430a.getClass();
        this.f251357N = interfaceC41341a;
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final InterfaceC27108f Ed() {
        return this.f251357N.Ed();
    }

    @Override // iT.InterfaceC41341a
    @Y61.k
    public final z H4() {
        return this.f251357N.H4();
    }
}
