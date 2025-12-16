package io.ktor.utils.io;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: Coroutines.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/s1;", "Lio/ktor/utils/io/a2;", "Lio/ktor/utils/io/e2;", "Lkotlinx/coroutines/T;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.s1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C41693s1 implements a2, e2, kotlinx.coroutines.T {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41619a f401294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.T f401295c;

    public C41693s1(@Y61.k kotlinx.coroutines.T t12, @Y61.k C41619a c41619a) {
        this.f401294b = c41619a;
        this.f401295c = t12;
    }

    @Override // io.ktor.utils.io.e2
    public final X a() {
        return this.f401294b;
    }

    @Override // kotlinx.coroutines.T
    @Y61.k
    /* renamed from: getCoroutineContext */
    public final CoroutineContext getF398827h() {
        return this.f401295c.getF398827h();
    }
}
