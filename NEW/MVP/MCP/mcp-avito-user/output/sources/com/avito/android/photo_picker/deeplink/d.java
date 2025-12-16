package com.avito.android.photo_picker.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import android.net.Uri;
import com.avito.android.deeplink.PhotoPickerDeepLink;
import com.avito.android.lib.beduin_v2.feature.launchclient.g;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import com.avito.beduin.v2.interaction.launch.flow.j;
import j31.InterfaceC42189a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoPickerDeepLinkTerminalResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/photo_picker/deeplink/d;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_photo-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes14.dex */
public final class d implements g {
    @Inject
    public d() {
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final j a(@k InterfaceC14249c.b bVar) {
        com.avito.beduin.v2.interaction.launch.flow.k[] kVarArr;
        if (bVar instanceof PhotoPickerDeepLink.b.C4033b) {
            List<Uri> list = ((PhotoPickerDeepLink.b.C4033b) bVar).f134093b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList.add(new com.avito.beduin.v2.interaction.launch.flow.k(String.valueOf(i12), ((Uri) obj).toString()));
                i12 = i13;
            }
            kVarArr = (com.avito.beduin.v2.interaction.launch.flow.k[]) arrayList.toArray(new com.avito.beduin.v2.interaction.launch.flow.k[0]);
        } else {
            kVarArr = new com.avito.beduin.v2.interaction.launch.flow.k[0];
        }
        return new j(kVarArr);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @k
    public final ResultStatus b(@k InterfaceC14249c.b bVar) {
        return bVar instanceof PhotoPickerDeepLink.b.C4033b ? ResultStatus.f337439c : ResultStatus.f337440d;
    }
}
