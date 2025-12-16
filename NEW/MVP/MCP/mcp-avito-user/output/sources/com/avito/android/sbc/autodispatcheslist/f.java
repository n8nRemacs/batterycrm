package com.avito.android.sbc.autodispatcheslist;

import Xo0.InterfaceC17032a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.sbc.autodispatches.InterfaceC34468d;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: SbcAutoDispatchesListInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/autodispatcheslist/f;", "Lcom/avito/android/sbc/autodispatcheslist/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC34468d f259100a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC17032a f259101b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f259102c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.f f259103d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final AutoDispatchListInfo f259104e;

    @Inject
    public f(@k InterfaceC34468d interfaceC34468d, @k InterfaceC17032a interfaceC17032a, @k R0 r02, @k com.avito.android.server_time.f fVar, @k AutoDispatchListInfo autoDispatchListInfo) {
        this.f259100a = interfaceC34468d;
        this.f259101b = interfaceC17032a;
        this.f259102c = r02;
        this.f259103d = fVar;
        this.f259104e = autoDispatchListInfo;
    }

    @Override // com.avito.android.sbc.autodispatcheslist.c
    @k
    public final C43137a0 a(@l Long l12) {
        return new C43137a0(new e(2, null), C43175k.I(this.f259102c.a(), C43175k.G(new d(this, l12, null))));
    }
}
