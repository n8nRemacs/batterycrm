package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Delegates.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/properties/a", "Lkotlin/properties/e;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.websocket.x, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41737x extends kotlin.properties.e<Long> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C41739z f401638b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41737x(Long l12, C41739z c41739z) {
        super(l12);
        this.f401638b = c41739z;
    }

    @Override // kotlin.properties.e
    public final void afterChange(@Y61.k kotlin.reflect.n<?> nVar, Long l12, Long l13) {
        long jLongValue = l13.longValue();
        l12.longValue();
        this.f401638b.f401645f.f401442d = jLongValue;
    }
}
