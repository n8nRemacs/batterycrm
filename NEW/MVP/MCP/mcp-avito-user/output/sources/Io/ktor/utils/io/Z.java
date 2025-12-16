package io.ktor.utils.io;

import kotlin.Metadata;

/* compiled from: ByteChannel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/Z;", "Lio/ktor/utils/io/a;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Z extends C41619a {

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Throwable, Throwable> f400816p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Y41.l lVar) {
        super(false, null, 0, 6, null);
        this.f400816p = lVar;
    }

    @Override // io.ktor.utils.io.C41619a, io.ktor.utils.io.InterfaceC41649d1
    public final boolean h(@Y61.l Throwable th2) {
        return super.h(this.f400816p.invoke(th2));
    }
}
