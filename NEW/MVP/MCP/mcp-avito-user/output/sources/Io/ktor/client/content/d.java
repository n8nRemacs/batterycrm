package io.ktor.client.content;

import Y41.q;
import Y61.k;
import Y61.l;
import io.ktor.client.call.UnsupportedContentTypeException;
import io.ktor.http.C41524i;
import io.ktor.http.C41535n0;
import io.ktor.http.T;
import io.ktor.http.content.p;
import io.ktor.utils.io.C41714z1;
import io.ktor.utils.io.W0;
import io.ktor.utils.io.X;
import io.ktor.utils.io.Y;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.D0;
import kotlinx.coroutines.N0;

/* compiled from: ObservableContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/content/d;", "Lio/ktor/http/content/p$d;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d extends p.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final p f398834a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final N0 f398835b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final q<Long, Long, Continuation<? super G0>, Object> f398836c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final W0 f398837d;

    public d(@k p pVar, @k N0 n02, @k q qVar) {
        X x12;
        this.f398834a = pVar;
        this.f398835b = n02;
        this.f398836c = qVar;
        if (pVar instanceof p.a) {
            x12 = Y.a(((p.a) pVar).getF399959a());
        } else {
            if (pVar instanceof p.c) {
                throw new UnsupportedContentTypeException(pVar);
            }
            if (pVar instanceof p.b) {
                W0.f400795a.getClass();
                x12 = W0.a.f400797b.getValue();
            } else if (pVar instanceof p.d) {
                x12 = ((p.d) pVar).e();
            } else {
                if (!(pVar instanceof p.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                x12 = C41714z1.b(D0.f410691b, n02, true, new c(this, null)).x();
            }
        }
        this.f398837d = x12;
    }

    @Override // io.ktor.http.content.p
    @l
    /* renamed from: a */
    public final Long getF399580a() {
        return this.f398834a.getF399580a();
    }

    @Override // io.ktor.http.content.p
    @l
    /* renamed from: b */
    public final C41524i getF399960b() {
        return this.f398834a.getF399960b();
    }

    @Override // io.ktor.http.content.p
    @k
    public final T c() {
        return this.f398834a.c();
    }

    @Override // io.ktor.http.content.p
    @l
    /* renamed from: d */
    public final C41535n0 getF399961c() {
        return this.f398834a.getF399961c();
    }

    @Override // io.ktor.http.content.p.d
    @k
    public final W0 e() {
        return io.ktor.client.utils.b.a(this.f398837d, this.f398835b, this.f398834a.getF399580a(), this.f398836c);
    }
}
