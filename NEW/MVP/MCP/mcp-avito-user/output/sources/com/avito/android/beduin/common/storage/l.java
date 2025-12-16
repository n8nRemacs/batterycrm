package com.avito.android.beduin.common.storage;

import java.util.LinkedHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: BeduinStorageUpdateRelay.kt */
@Singleton
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/beduin/common/storage/l;", "Lcom/avito/android/lib/beduin_v2/repository/beduin_v1_in_memory/g;", "Lcom/avito/android/beduin/common/storage/r;", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.g, r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e2 f103498a = f2.b(0, 1, null, 5);

    @Inject
    public l() {
    }

    @Override // com.avito.android.lib.beduin_v2.repository.beduin_v1_in_memory.g
    @Y61.k
    public final k a(@Y61.k String str) {
        return new k(new j(this.f103498a, str));
    }

    @Override // com.avito.android.beduin.common.storage.r
    public final void b(@Y61.l LinkedHashMap linkedHashMap, @Y61.k String str) {
        this.f103498a.K5(new Q(str, linkedHashMap));
    }
}
