package io.ktor.client.content;

import Y61.k;
import io.ktor.http.C41524i;
import io.ktor.http.M;
import io.ktor.http.content.p;
import io.ktor.util.cio.f;
import io.ktor.utils.io.W0;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: LocalFileContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/content/a;", "Lio/ktor/http/content/p$d;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class a extends p.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final File f398829a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C41524i f398830b;

    public a(File file, C41524i c41524i, int i12, C42822w c42822w) {
        if ((i12 & 2) != 0) {
            C41524i.c cVar = C41524i.f400031f;
            c41524i = M.d(M.b(C43066x.n0('.', file.getName(), "")));
        }
        this.f398829a = file;
        this.f398830b = c41524i;
    }

    @Override // io.ktor.http.content.p
    @k
    /* renamed from: a */
    public final Long getF399580a() {
        return Long.valueOf(this.f398829a.length());
    }

    @Override // io.ktor.http.content.p
    @k
    /* renamed from: b, reason: from getter */
    public final C41524i getF398830b() {
        return this.f398830b;
    }

    @Override // io.ktor.http.content.p.d
    @k
    public final W0 e() {
        return f.a(this.f398829a);
    }
}
