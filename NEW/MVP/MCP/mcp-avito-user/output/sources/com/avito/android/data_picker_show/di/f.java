package com.avito.android.data_picker_show.di;

import Ju.InterfaceC14249c;
import com.avito.android.data_picker_show.DataPickerShowLink;
import com.avito.beduin.v2.interaction.launch.flow.ResultStatus;
import j31.InterfaceC42189a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: DataPickerShowLinkResultConverter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/data_picker_show/di/f;", "Lcom/avito/android/lib/beduin_v2/feature/launchclient/g;", "<init>", "()V", "_avito_data-picker-show_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@C11.a
@InterfaceC42189a
/* loaded from: classes12.dex */
public final class f implements com.avito.android.lib.beduin_v2.feature.launchclient.g {
    @Inject
    public f() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.avito.beduin.v2.interaction.launch.flow.j a(@Y61.k Ju.InterfaceC14249c.b r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.avito.android.data_picker_show.DataPickerShowLink.b.C3965b
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L4d
            com.avito.android.data_picker_show.DataPickerShowLink$b$b r8 = (com.avito.android.data_picker_show.DataPickerShowLink.b.C3965b) r8
            java.util.List<java.lang.String> r8 = r8.f132470b
            if (r8 == 0) goto L4b
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.C42745f0.q(r8, r3)
            r0.<init>(r3)
            java.util.Iterator r8 = r8.iterator()
            r3 = r2
        L1e:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L40
            java.lang.Object r4 = r8.next()
            int r5 = r3 + 1
            if (r3 < 0) goto L3c
            java.lang.String r4 = (java.lang.String) r4
            com.avito.beduin.v2.interaction.launch.flow.k r6 = new com.avito.beduin.v2.interaction.launch.flow.k
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r6.<init>(r3, r4)
            r0.add(r6)
            r3 = r5
            goto L1e
        L3c:
            kotlin.collections.C42745f0.H0()
            throw r1
        L40:
            com.avito.beduin.v2.interaction.launch.flow.k[] r8 = new com.avito.beduin.v2.interaction.launch.flow.k[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            r1 = r8
            com.avito.beduin.v2.interaction.launch.flow.k[] r1 = (com.avito.beduin.v2.interaction.launch.flow.k[]) r1
            if (r1 != 0) goto L4d
        L4b:
            com.avito.beduin.v2.interaction.launch.flow.k[] r1 = new com.avito.beduin.v2.interaction.launch.flow.k[r2]
        L4d:
            com.avito.beduin.v2.interaction.launch.flow.j r8 = new com.avito.beduin.v2.interaction.launch.flow.j
            if (r1 != 0) goto L53
            com.avito.beduin.v2.interaction.launch.flow.k[] r1 = new com.avito.beduin.v2.interaction.launch.flow.k[r2]
        L53:
            r8.<init>(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.data_picker_show.di.f.a(Ju.c$b):com.avito.beduin.v2.interaction.launch.flow.j");
    }

    @Override // com.avito.android.lib.beduin_v2.feature.launchclient.g
    @Y61.k
    public final ResultStatus b(@Y61.k InterfaceC14249c.b bVar) {
        return bVar instanceof DataPickerShowLink.b.C3965b ? ResultStatus.f337439c : ResultStatus.f337440d;
    }
}
