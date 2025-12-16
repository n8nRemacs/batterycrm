package com.avito.android.upload_doc.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import com.avito.android.deep_linking.links.GigUploadDocDeeplink;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.j;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: GigUploadDocDeeplinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/upload_doc/deeplink/g;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_gig_upload-doc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes4.dex */
public final class g implements com.avito.android.lib.beduin_v2.feature.launchclient.g {
    @Inject
    public g() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final j a(@k InterfaceC14249c.b bVar) {
        return new j(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        if (!(bVar instanceof GigUploadDocDeeplink.b)) {
            return ResultStatus.f337440d;
        }
        GigUploadDocDeeplink.b bVar2 = (GigUploadDocDeeplink.b) bVar;
        if (bVar2 instanceof GigUploadDocDeeplink.b.C4002b) {
            return ResultStatus.f337439c;
        }
        if (bVar2 instanceof GigUploadDocDeeplink.b.a) {
            return ResultStatus.f337440d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
