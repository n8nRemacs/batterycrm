package io.ktor.client.plugins.cache.storage;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UnlimitedCacheStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lio/ktor/client/plugins/cache/storage/b;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class w extends N implements Y41.a<Set<b>> {

    /* renamed from: l, reason: collision with root package name */
    public static final w f399300l = new w();

    public w() {
        super(0);
    }

    @Override // Y41.a
    public final Set<b> invoke() {
        return new io.ktor.util.collections.d();
    }
}
