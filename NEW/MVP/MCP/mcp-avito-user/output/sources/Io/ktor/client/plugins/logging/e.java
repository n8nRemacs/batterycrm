package io.ktor.client.plugins.logging;

import io.ktor.http.C41524i;
import io.ktor.http.C41535n0;
import io.ktor.http.T;
import io.ktor.http.content.p;
import io.ktor.utils.io.C41619a;
import io.ktor.utils.io.W0;
import kotlin.Metadata;

/* compiled from: LoggedContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/plugins/logging/e;", "Lio/ktor/http/content/p$d;", "ktor-client-logging"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e extends p.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C41619a f399516a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final C41524i f399517b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f399518c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final C41535n0 f399519d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final T f399520e;

    public e(@Y61.k io.ktor.http.content.p pVar, @Y61.k C41619a c41619a) {
        this.f399516a = c41619a;
        this.f399517b = pVar.getF399517b();
        this.f399518c = pVar.getF399518c();
        this.f399519d = pVar.getF399519d();
        this.f399520e = pVar.getF399520e();
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getF399518c() {
        return this.f399518c;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final C41524i getF399517b() {
        return this.f399517b;
    }

    @Override // io.ktor.http.content.p
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final T getF399520e() {
        return this.f399520e;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: d, reason: from getter */
    public final C41535n0 getF399519d() {
        return this.f399519d;
    }

    @Override // io.ktor.http.content.p.d
    @Y61.k
    public final W0 e() {
        return this.f399516a;
    }
}
