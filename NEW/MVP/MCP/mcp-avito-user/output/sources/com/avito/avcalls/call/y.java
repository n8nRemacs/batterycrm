package com.avito.avcalls.call;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: CallSessionFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/call/y;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final V f332846a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.signaling.p f332847b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.utils.c f332848c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.config.f f332849d;

    public y(@Y61.k V v12, @Y61.k com.avito.avcalls.signaling.p pVar, @Y61.k com.avito.avcalls.utils.c cVar, @Y61.k com.avito.avcalls.config.f fVar) {
        this.f332846a = v12;
        this.f332847b = pVar;
        this.f332848c = cVar;
        this.f332849d = fVar;
    }

    public static C43238h a(kotlinx.coroutines.T t12, String str) {
        return kotlinx.coroutines.U.a(t12.getF399611e().plus(t1.b()).plus(new kotlinx.coroutines.S(androidx.camera.camera2.internal.G.f("call_coroutine_", str))));
    }

    public static C43238h b(kotlinx.coroutines.T t12, String str) {
        return kotlinx.coroutines.U.a(t12.getF399611e().plus(t1.b()).plus(new kotlinx.coroutines.S(androidx.camera.camera2.internal.G.f("call_terminating_coroutine_", str))));
    }
}
