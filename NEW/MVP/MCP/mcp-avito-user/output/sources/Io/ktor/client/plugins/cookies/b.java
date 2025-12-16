package io.ktor.client.plugins.cookies;

import io.ktor.http.C41530l;
import io.ktor.http.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: AcceptAllCookiesStorage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/ktor/http/l;", "it", "", "invoke", "(Lio/ktor/http/l;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class b extends N implements Y41.l<C41530l, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C41530l f399346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ T0 f399347m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C41530l c41530l, T0 t02) {
        super(1);
        this.f399346l = c41530l;
        this.f399347m = t02;
    }

    @Override // Y41.l
    public final Boolean invoke(C41530l c41530l) {
        C41530l c41530l2 = c41530l;
        return Boolean.valueOf(L.f(c41530l2.f400042a, this.f399346l.f400042a) && g.a(c41530l2, this.f399347m));
    }
}
