package io.ktor.http.content;

import io.ktor.http.C41516e;
import io.ktor.http.C41517e0;
import io.ktor.http.C41519f0;
import io.ktor.http.O;
import io.ktor.http.Q;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: Multipart.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lio/ktor/http/e;", "invoke", "()Lio/ktor/http/e;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class u extends N implements Y41.a<C41516e> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ t f399989l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar) {
        super(0);
        this.f399989l = tVar;
    }

    @Override // Y41.a
    public final C41516e invoke() {
        t tVar = this.f399989l;
        C41519f0.f400005a.getClass();
        String str = tVar.f399986b.get(C41519f0.f400011g);
        if (str == null) {
            return null;
        }
        C41516e.f400000d.getClass();
        int i12 = Q.f399893c;
        O o12 = (O) C42745f0.Q(C41517e0.a(str));
        return new C41516e(o12.f399881a, o12.f399882b);
    }
}
