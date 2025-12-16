package io.ktor.client.plugins.cookies;

import io.ktor.http.C41530l;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AcceptAllCookiesStorage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/http/l;", "cookie", "", "invoke", "(Lio/ktor/http/l;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class c extends N implements Y41.l<C41530l, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f399348l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j12) {
        super(1);
        this.f399348l = j12;
    }

    @Override // Y41.l
    public final Boolean invoke(C41530l c41530l) {
        Q31.b bVar = c41530l.f400046e;
        if (bVar != null) {
            return Boolean.valueOf(bVar.f13457j < this.f399348l);
        }
        return Boolean.FALSE;
    }
}
