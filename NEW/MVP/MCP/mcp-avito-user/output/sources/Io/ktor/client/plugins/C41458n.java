package io.ktor.client.plugins;

import io.ktor.http.C41519f0;
import io.ktor.http.C41524i;
import io.ktor.http.content.p;
import io.ktor.utils.io.W0;
import java.io.InputStream;
import kotlin.Metadata;

/* compiled from: DefaultTransformersJvm.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/n;", "Lio/ktor/http/content/p$d;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.client.plugins.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41458n extends p.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final Long f399593a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41524i f399594b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f399595c;

    public C41458n(io.ktor.client.request.d0 d0Var, C41524i c41524i, Object obj) {
        this.f399595c = obj;
        io.ktor.http.U u12 = d0Var.f399709c;
        C41519f0.f400005a.getClass();
        String strH = u12.h(C41519f0.f400013i);
        this.f399593a = strH != null ? Long.valueOf(Long.parseLong(strH)) : null;
        if (c41524i == null) {
            C41524i.a.f400035a.getClass();
            c41524i = C41524i.a.f400037c;
        }
        this.f399594b = c41524i;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getF399593a() {
        return this.f399593a;
    }

    @Override // io.ktor.http.content.p
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C41524i getF399594b() {
        return this.f399594b;
    }

    @Override // io.ktor.http.content.p.d
    @Y61.k
    public final W0 e() {
        return io.ktor.utils.io.jvm.javaio.o.b((InputStream) this.f399595c);
    }
}
