package com.avito.android.passport.profile_add.di;

import Ju.InterfaceC14249c;
import com.avito.android.deep_linking.links.InterfaceC29684j;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import j31.InterfaceC42189a;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileCreateExtendedLinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/di/i;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes15.dex */
public final class i implements com.avito.android.lib.beduin_v2.feature.launchclient.g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final i f212299a = new i();

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final com.avito.beduin.v2.interaction.launch.flow.j a(@Y61.k InterfaceC14249c.b bVar) {
        return new com.avito.beduin.v2.interaction.launch.flow.j(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final ResultStatus b(@Y61.k InterfaceC14249c.b bVar) {
        return ((bVar instanceof InterfaceC29684j.b) && ((InterfaceC29684j.b) bVar).f134006b) ? ResultStatus.f337439c : ResultStatus.f337440d;
    }
}
