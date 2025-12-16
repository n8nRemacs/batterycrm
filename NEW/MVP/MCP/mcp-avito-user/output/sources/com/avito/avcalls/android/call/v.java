package com.avito.avcalls.android.call;

import kotlin.Metadata;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: CallSessionFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/avcalls/android/call/v;", "", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final S f331631a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.signaling.p f331632b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.utils.c f331633c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.avcalls.android.config.f f331634d;

    public v(@Y61.k S s5, @Y61.k com.avito.avcalls.android.signaling.p pVar, @Y61.k com.avito.avcalls.android.utils.c cVar, @Y61.k com.avito.avcalls.android.config.f fVar) {
        this.f331631a = s5;
        this.f331632b = pVar;
        this.f331633c = cVar;
        this.f331634d = fVar;
    }

    public static C43238h a(T t12, String str) {
        return U.a(t12.getF399611e().plus(t1.b()).plus(new kotlinx.coroutines.S(androidx.camera.camera2.internal.G.f("call_coroutine_", str))));
    }

    public static C43238h b(T t12, String str) {
        return U.a(t12.getF399611e().plus(t1.b()).plus(new kotlinx.coroutines.S(androidx.camera.camera2.internal.G.f("call_terminating_coroutine_", str))));
    }
}
