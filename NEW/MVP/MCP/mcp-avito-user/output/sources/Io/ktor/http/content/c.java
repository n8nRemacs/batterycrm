package io.ktor.http.content;

import io.ktor.http.C41524i;
import io.ktor.http.C41535n0;
import io.ktor.http.content.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ByteArrayContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/c;", "Lio/ktor/http/content/p$a;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class c extends p.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final byte[] f399959a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C41524i f399960b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final C41535n0 f399961c;

    public c(byte[] bArr, C41524i c41524i, C41535n0 c41535n0, int i12, C42822w c42822w) {
        c41524i = (i12 & 2) != 0 ? null : c41524i;
        c41535n0 = (i12 & 4) != 0 ? null : c41535n0;
        this.f399959a = bArr;
        this.f399960b = c41524i;
        this.f399961c = c41535n0;
    }

    @Override // io.ktor.http.content.p
    @Y61.k
    public final Long a() {
        return Long.valueOf(this.f399959a.length);
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C41524i getF399960b() {
        return this.f399960b;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final C41535n0 getF399961c() {
        return this.f399961c;
    }

    @Override // io.ktor.http.content.p.a
    @Y61.k
    /* renamed from: e, reason: from getter */
    public final byte[] getF399959a() {
        return this.f399959a;
    }
}
