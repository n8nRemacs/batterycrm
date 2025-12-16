package com.avito.android.advert_item_actions;

import Ju.InterfaceC14249c;
import Y61.k;
import com.avito.android.advert_item_actions.AdvertItemActionsDeeplink;
import com.avito.android.lib.beduin_v2.feature.launchclient.g;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertItemActionsDeeplinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_item_actions/a;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_advert-item-actions_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f85819a = new a();

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final j a(@k InterfaceC14249c.b bVar) {
        return new j(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        return bVar instanceof AdvertItemActionsDeeplink.b.c ? ResultStatus.f337439c : bVar.equals(AdvertItemActionsDeeplink.b.C2558b.f85817b) ? ResultStatus.f337441e : ResultStatus.f337440d;
    }
}
