package com.avito.android.serp.adapter.beduin_v2;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.serp.adapter.N0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BeduinV2Converter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/beduin_v2/b;", "Lcom/avito/android/serp/adapter/beduin_v2/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.serp.adapter.beduin_v2.a
    @k
    public final BeduinV2Item a(@k BeduinV2Element beduinV2Element) {
        return new BeduinV2Item(N0.a(beduinV2Element.f268995d, beduinV2Element.f268993b), beduinV2Element.f268993b, beduinV2Element.f268994c, null, null);
    }
}
