package io.ktor.client.engine.okhttp;

import io.ktor.utils.io.C41714z1;
import io.ktor.utils.io.W0;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.D0;

/* compiled from: OkHttpEngine.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/utils/io/W0;", "invoke", "()Lio/ktor/utils/io/W0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class n extends N implements Y41.a<W0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f398954l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ io.ktor.http.content.p f398955m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(CoroutineContext coroutineContext, io.ktor.http.content.p pVar) {
        super(0);
        this.f398954l = coroutineContext;
        this.f398955m = pVar;
    }

    @Override // Y41.a
    public final W0 invoke() {
        return C41714z1.b(D0.f410691b, this.f398954l, false, new m(this.f398955m, null)).x();
    }
}
