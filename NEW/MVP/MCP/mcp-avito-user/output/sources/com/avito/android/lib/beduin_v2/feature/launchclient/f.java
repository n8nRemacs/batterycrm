package com.avito.android.lib.beduin_v2.feature.launchclient;

import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Bundle;
import com.avito.android.beduin.v2.page.m;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.j;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DeepLinkTerminalResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/launchclient/f;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_design-modules_beduin-v2_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final f f176219a = new f();

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final j a(@k InterfaceC14249c.b bVar) {
        Bundle bundle;
        com.avito.beduin.v2.interaction.launch.flow.k kVar;
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr = null;
        if ((bVar instanceof m) && (bundle = ((m) bVar).f105170b) != null) {
            Set<String> setKeySet = bundle.keySet();
            ArrayList arrayList = new ArrayList();
            for (String str : setKeySet) {
                String string = bundle.getString(str);
                if (string != null) {
                    if (str == null) {
                        str = "";
                    }
                    kVar = new com.avito.beduin.v2.interaction.launch.flow.k(str, string);
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    arrayList.add(kVar);
                }
            }
            kVarArr = (com.avito.beduin.v2.interaction.launch.flow.k[]) arrayList.toArray(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
        }
        if (kVarArr == null) {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        return bVar instanceof m.c ? ResultStatus.f337439c : bVar instanceof m.b ? ResultStatus.f337441e : ResultStatus.f337440d;
    }
}
