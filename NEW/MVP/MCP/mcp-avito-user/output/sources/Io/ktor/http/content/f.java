package io.ktor.http.content;

import io.ktor.http.C41524i;
import io.ktor.http.C41535n0;
import io.ktor.http.content.p;
import io.ktor.utils.io.InterfaceC41649d1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChannelWriterContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/f;", "Lio/ktor/http/content/p$e;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f extends p.e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.p<InterfaceC41649d1, Continuation<? super G0>, Object> f399964a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C41524i f399965b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C41535n0 f399966c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Long f399967d;

    public f() {
        throw null;
    }

    public f(Y41.p pVar, C41524i c41524i, C41535n0 c41535n0, Long l12, int i12, C42822w c42822w) {
        c41535n0 = (i12 & 4) != 0 ? null : c41535n0;
        l12 = (i12 & 8) != 0 ? null : l12;
        this.f399964a = pVar;
        this.f399965b = c41524i;
        this.f399966c = c41535n0;
        this.f399967d = l12;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getF399967d() {
        return this.f399967d;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C41524i getF399965b() {
        return this.f399965b;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final C41535n0 getF399966c() {
        return this.f399966c;
    }

    @Override // io.ktor.http.content.p.e
    @Y61.l
    public final Object e(@Y61.k InterfaceC41649d1 interfaceC41649d1, @Y61.k Continuation<? super G0> continuation) {
        Object objInvoke = this.f399964a.invoke(interfaceC41649d1, continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : G0.f406611a;
    }
}
