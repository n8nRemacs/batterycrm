package io.ktor.client.engine.okhttp;

import io.ktor.utils.io.W0;
import java.io.IOException;
import kotlin.C42833p;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.InterfaceC44803m;
import okio.M;
import okio.e0;

/* compiled from: StreamRequestBody.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/client/engine/okhttp/x;", "Lokhttp3/RequestBody;", "ktor-client-okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class x extends RequestBody {

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Long f398987c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final N f398988d;

    /* JADX WARN: Multi-variable type inference failed */
    public x(@Y61.l Long l12, @Y61.k Y41.a<? extends W0> aVar) {
        this.f398987c = l12;
        this.f398988d = (N) aVar;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        Long l12 = this.f398987c;
        if (l12 != null) {
            return l12.longValue();
        }
        return -1L;
    }

    @Override // okhttp3.RequestBody
    @Y61.l
    /* renamed from: contentType */
    public final MediaType getF433472a() {
        return null;
    }

    @Override // okhttp3.RequestBody
    public final boolean isOneShot() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // okhttp3.RequestBody
    public final void writeTo(@Y61.k InterfaceC44803m interfaceC44803m) throws IOException {
        try {
            e0 e0VarG = M.g(io.ktor.utils.io.jvm.javaio.b.b((W0) this.f398988d.invoke()));
            try {
                interfaceC44803m.h2(e0VarG);
                try {
                    e0VarG.close();
                    th = null;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    e0VarG.close();
                } catch (Throwable th4) {
                    C42833p.a(th, th4);
                }
            }
            if (th == null) {
            } else {
                throw th;
            }
        } catch (IOException e12) {
            throw e12;
        } catch (Throwable th5) {
            throw new StreamAdapterIOException(th5);
        }
    }
}
