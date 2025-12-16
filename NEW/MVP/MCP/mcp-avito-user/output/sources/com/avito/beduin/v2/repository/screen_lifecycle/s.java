package com.avito.beduin.v2.repository.screen_lifecycle;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;

/* compiled from: ScreensConfigChangesStorageImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/repository/screen_lifecycle/s;", "Lcom/avito/beduin/v2/repository/screen_lifecycle/r;", "<init>", "()V", "screen-lifecycle_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ConcurrentHashMap<String, b> f338334a = new ConcurrentHashMap<>();

    @Override // com.avito.beduin.v2.repository.screen_lifecycle.r
    public final void a(@Y61.k String str, @Y61.k b bVar) {
        this.f338334a.put(str, bVar);
    }

    @Override // com.avito.beduin.v2.repository.screen_lifecycle.r
    @Y61.l
    public final b get(@Y61.k String str) {
        return this.f338334a.get(str);
    }

    @Override // com.avito.beduin.v2.repository.screen_lifecycle.r
    public final void remove(@Y61.k String str) {
        this.f338334a.remove(str);
    }
}
