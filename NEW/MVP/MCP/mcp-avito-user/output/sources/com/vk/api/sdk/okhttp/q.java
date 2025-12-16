package com.vk.api.sdk.okhttp;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.AbstractC44814y;
import okio.C44802l;
import okio.InterfaceC44803m;
import okio.X;

/* compiled from: ProgressRequestBody.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/okhttp/q;", "Lokhttp3/RequestBody;", "a", "b", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class q extends RequestBody {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f366668c = 0;

    /* compiled from: ProgressRequestBody.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/api/sdk/okhttp/q$a;", "", "<init>", "()V", "", "NOTIFY_INTERVAL", "J", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ProgressRequestBody.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/okhttp/q$b;", "Lokio/y;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public final class b extends AbstractC44814y {

        /* renamed from: f, reason: collision with root package name */
        public long f366669f;

        /* renamed from: g, reason: collision with root package name */
        public final long f366670g;

        public b(@Y61.k q qVar, InterfaceC44803m interfaceC44803m) {
            super(interfaceC44803m);
            this.f366670g = -1L;
        }

        @Override // okio.AbstractC44814y, okio.c0
        public final void write(@Y61.k C44802l c44802l, long j12) {
            super.write(c44802l, j12);
            this.f366669f += j12;
            long j13 = this.f366670g;
            if (j13 < 0) {
                throw null;
            }
            if (j13 < 0) {
                int i12 = q.f366668c;
            } else {
                int i13 = q.f366668c;
            }
        }
    }

    static {
        new a(null);
        TimeUnit.MILLISECONDS.toMillis(160L);
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    @Y61.l
    /* renamed from: contentType */
    public final MediaType get$contentType() {
        throw null;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(@Y61.k InterfaceC44803m interfaceC44803m) {
        new X(new b(this, interfaceC44803m));
        throw null;
    }
}
