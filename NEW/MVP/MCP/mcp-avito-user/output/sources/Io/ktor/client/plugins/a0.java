package io.ktor.client.plugins;

import io.ktor.client.plugins.U;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HttpRequestRetry.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lio/ktor/client/plugins/U$f;", "Lio/ktor/client/request/c0;", "<anonymous parameter 0>", "Lio/ktor/client/statement/d;", "response", "", "invoke", "(Lio/ktor/client/plugins/U$f;Lio/ktor/client/request/c0;Lio/ktor/client/statement/d;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class a0 extends kotlin.jvm.internal.N implements Y41.q<U.f, io.ktor.client.request.c0, io.ktor.client.statement.d, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final a0 f399080l = new a0();

    public a0() {
        super(3);
    }

    @Override // Y41.q
    public final Boolean invoke(U.f fVar, io.ktor.client.request.c0 c0Var, io.ktor.client.statement.d dVar) {
        int i12 = dVar.getF399774d().f400093b;
        boolean z12 = false;
        if (500 <= i12 && i12 < 600) {
            z12 = true;
        }
        return Boolean.valueOf(z12);
    }
}
