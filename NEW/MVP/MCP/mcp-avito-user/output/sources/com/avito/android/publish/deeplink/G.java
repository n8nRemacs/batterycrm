package com.avito.android.publish.deeplink;

import Ju.InterfaceC14249c;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertDeeplinkResultConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/deeplink/G;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes16.dex */
public final class G implements com.avito.android.lib.beduin_v2.feature.launchclient.g {
    @Inject
    public G() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final com.avito.beduin.v2.interaction.launch.flow.j a(@Y61.k InterfaceC14249c.b bVar) {
        return new com.avito.beduin.v2.interaction.launch.flow.j(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final ResultStatus b(@Y61.k InterfaceC14249c.b bVar) {
        if (!(bVar instanceof MyAdvertLink.Edit.Result)) {
            return ResultStatus.f337440d;
        }
        MyAdvertLink.Edit.Result result = (MyAdvertLink.Edit.Result) bVar;
        if (result instanceof MyAdvertLink.Edit.Result.Success) {
            return ResultStatus.f337439c;
        }
        if (result instanceof MyAdvertLink.Edit.Result.a) {
            return ResultStatus.f337440d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
