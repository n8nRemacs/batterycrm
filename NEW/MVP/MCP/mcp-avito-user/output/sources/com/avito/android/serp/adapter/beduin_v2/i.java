package com.avito.android.serp.adapter.beduin_v2;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.BeduinV2;
import com.avito.android.remote.model.serp.SerpBeduinV2Widget;
import com.avito.android.serp.adapter.N0;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BeduinV2SerpItemConverter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/beduin_v2/i;", "Lcom/avito/android/serp/adapter/beduin_v2/h;", "<init>", "()V", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements h {

    /* compiled from: BeduinV2SerpItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/beduin_v2/i$a;", "", "<init>", "()V", "", "WIDGET_ID_PREFIX", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public i() {
    }

    @Override // com.avito.android.serp.adapter.beduin_v2.h
    @l
    public final BeduinV2Item a(@k SerpBeduinV2Widget serpBeduinV2Widget) {
        BeduinV2 beduinV2 = serpBeduinV2Widget.getBeduinV2();
        if (beduinV2 == null) {
            return null;
        }
        String id2 = serpBeduinV2Widget.getId();
        if (id2 == null) {
            id2 = "BeduinV2SerpItem+" + UUID.randomUUID();
        }
        String str = id2;
        return new BeduinV2Item(N0.a(serpBeduinV2Widget.getUniqueId(), str), str, new BeduinV2Content(beduinV2.getJson()), serpBeduinV2Widget.getAnalytics(), serpBeduinV2Widget.getSettings());
    }
}
