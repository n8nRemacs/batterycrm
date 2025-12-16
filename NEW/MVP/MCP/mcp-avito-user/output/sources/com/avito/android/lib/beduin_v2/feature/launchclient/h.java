package com.avito.android.lib.beduin_v2.feature.launchclient;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import Y61.k;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeepLinkTerminalResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/launchclient/h;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h implements g {
    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final j a(@k InterfaceC14249c.b bVar) {
        return new j(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        return bVar.equals(AbstractC14250d.c.f9171c) ? ResultStatus.f337439c : bVar.equals(AbstractC14250d.b.f9170c) ? ResultStatus.f337441e : ResultStatus.f337440d;
    }
}
