package bT;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinV2AnalyticsClient.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LbT/a;", "Lcom/avito/beduin/v2/interaction/analytics/flow/a;", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bT.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C25553a implements com.avito.beduin.v2.interaction.analytics.flow.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f57074a;

    @Inject
    public C25553a(@k InterfaceC28373a interfaceC28373a) {
        this.f57074a = interfaceC28373a;
    }

    @Override // com.avito.beduin.v2.interaction.analytics.flow.a
    public final void a(int i12, int i13, @k com.avito.beduin.v2.interaction.analytics.flow.b[] bVarArr) {
        int iF2 = P0.f(bVarArr.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (com.avito.beduin.v2.interaction.analytics.flow.b bVar : bVarArr) {
            linkedHashMap.put(bVar.f337258a, bVar.f337259b);
        }
        this.f57074a.c(new ParametrizedClickStreamEvent(i12, i13, linkedHashMap, null, 8, null));
    }
}
