package io.ktor.websocket;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Delegates.kt */
@s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlin/properties/a", "Lkotlin/properties/e;", "kotlin-stdlib"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.websocket.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41738y extends kotlin.properties.e<Boolean> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C41739z f401639b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41738y(Boolean bool, C41739z c41739z) {
        super(bool);
        this.f401639b = c41739z;
    }

    @Override // kotlin.properties.e
    public final void afterChange(@Y61.k kotlin.reflect.n<?> nVar, Boolean bool, Boolean bool2) {
        boolean zBooleanValue = bool2.booleanValue();
        bool.getClass();
        this.f401639b.f401644e.f401496d = zBooleanValue;
    }
}
