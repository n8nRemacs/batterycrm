package io.ktor.client.engine;

import io.ktor.http.U;
import io.ktor.http.V;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/http/U;", "Lkotlin/G0;", "invoke", "(Lio/ktor/http/U;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes8.dex */
final class A extends N implements Y41.l<U, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ V f398850l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ io.ktor.http.content.p f398851m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(V v12, io.ktor.http.content.p pVar) {
        super(1);
        this.f398850l = v12;
        this.f398851m = pVar;
    }

    @Override // Y41.l
    public final G0 invoke(U u12) {
        U u13 = u12;
        u13.e(this.f398850l);
        u13.e(this.f398851m.c());
        return G0.f406611a;
    }
}
