package io.ktor.client.plugins;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HttpRequestRetry.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class c0 extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ io.ktor.client.request.d0 f399110l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(io.ktor.client.request.d0 d0Var) {
        super(1);
        this.f399110l = d0Var;
    }

    @Override // Y41.l
    public final G0 invoke(Throwable th2) {
        Throwable th3 = th2;
        kotlinx.coroutines.C c12 = (kotlinx.coroutines.C) this.f399110l.f399711e;
        if (th3 == null) {
            c12.q3();
        } else {
            c12.b(th3);
        }
        return G0.f406611a;
    }
}
