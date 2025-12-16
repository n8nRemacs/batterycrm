package io.ktor.client.call;

import Y61.k;
import Y61.l;
import io.ktor.client.request.c0;
import io.ktor.utils.io.Y;
import kotlin.Metadata;

/* compiled from: SavedCall.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/call/h;", "Lio/ktor/client/call/b;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h extends b {

    /* renamed from: g, reason: collision with root package name */
    @k
    public final byte[] f398817g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f398818h;

    public h(@k io.ktor.client.a aVar, @k c0 c0Var, @k io.ktor.client.statement.d dVar, @k byte[] bArr) {
        super(aVar);
        this.f398817g = bArr;
        this.f398805c = new i(this, c0Var);
        this.f398806d = new j(this, bArr, dVar);
        this.f398818h = true;
    }

    @Override // io.ktor.client.call.b
    /* renamed from: c, reason: from getter */
    public final boolean getF398818h() {
        return this.f398818h;
    }

    @Override // io.ktor.client.call.b
    @l
    public final Object e() {
        return Y.a(this.f398817g);
    }
}
