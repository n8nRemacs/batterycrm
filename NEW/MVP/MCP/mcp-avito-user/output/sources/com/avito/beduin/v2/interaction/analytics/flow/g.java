package com.avito.beduin.v2.interaction.analytics.flow;

import Y61.k;
import com.avito.beduin.v2.engine.InterfaceC36238a;
import com.avito.beduin.v2.handler.flow.i;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SendAnalyticsEventInteractionHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/interaction/analytics/flow/g;", "Lcom/avito/beduin/v2/handler/flow/i;", "Lcom/avito/beduin/v2/interaction/analytics/flow/d;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g extends i<d> {

    /* renamed from: c, reason: collision with root package name */
    @k
    public final a f337267c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PU0.b f337268d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f337269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, PU0.b bVar, boolean z12, int i12, C42822w c42822w) {
        super(e.f337263b);
        z12 = (i12 & 4) != 0 ? false : z12;
        this.f337267c = aVar;
        this.f337268d = bVar;
        this.f337269e = z12;
    }

    @Override // com.avito.beduin.v2.handler.flow.i
    public final InterfaceC43160i o(InterfaceC36238a interfaceC36238a, dU0.b bVar) {
        return C43175k.G(new f((d) bVar, this, null));
    }
}
