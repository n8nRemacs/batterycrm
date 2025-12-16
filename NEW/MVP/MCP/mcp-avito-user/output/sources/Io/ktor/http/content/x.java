package io.ktor.http.content;

import io.ktor.http.C41524i;
import io.ktor.http.M;
import io.ktor.http.content.p;
import io.ktor.utils.io.W0;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43262l0;

/* compiled from: URIFileContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/http/content/x;", "Lio/ktor/http/content/p$d;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class x extends p.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final URI f399995a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C41524i f399996b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f399997c;

    public x(URI uri, C41524i c41524i, Long l12, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            C41524i.c cVar = C41524i.f400031f;
            c41524i = M.a(uri.getPath());
        }
        l12 = (i12 & 4) != 0 ? null : l12;
        this.f399995a = uri;
        this.f399996b = c41524i;
        this.f399997c = l12;
    }

    @Override // io.ktor.http.content.p
    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Long getF399997c() {
        return this.f399997c;
    }

    @Override // io.ktor.http.content.p
    @Y61.k
    /* renamed from: b, reason: from getter */
    public final C41524i getF399996b() {
        return this.f399996b;
    }

    @Override // io.ktor.http.content.p.d
    @Y61.k
    public final W0 e() throws IOException {
        return io.ktor.utils.io.jvm.javaio.o.a(this.f399995a.toURL().openStream(), C43262l0.f411947c, io.ktor.util.cio.b.f400431a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(URL url, C41524i c41524i, int i12, C42822w c42822w) throws URISyntaxException {
        if ((i12 & 2) != 0) {
            C41524i.c cVar = C41524i.f400031f;
            c41524i = M.a(url.getPath());
        }
        this(url.toURI(), c41524i, null, 4, null);
    }
}
