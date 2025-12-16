package r40;

import Y61.k;
import java.io.IOException;
import kotlin.G0;
import kotlin.Metadata;
import okhttp3.internal.Util;
import okio.AbstractC44814y;
import okio.c0;

/* compiled from: CacheRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr40/i;", "Lr40/c;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class i implements InterfaceC47489c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f429590a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Y41.a<G0> f429591b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f429592c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f429593d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f429594e;

    /* compiled from: CacheRequest.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"r40/i$a", "Lokio/y;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends AbstractC44814y {
        public a(c0 c0Var) {
            super(c0Var);
        }

        @Override // okio.AbstractC44814y, okio.c0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            i iVar = i.this;
            synchronized (iVar) {
                if (iVar.f429594e) {
                    return;
                }
                iVar.f429594e = true;
                G0 g02 = G0.f406611a;
                super.close();
                i.this.f429591b.invoke();
            }
        }
    }

    public i(@k c0 c0Var, @k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        this.f429590a = c0Var;
        this.f429591b = aVar;
        this.f429592c = aVar2;
        this.f429593d = new a(c0Var);
    }

    @Override // r40.InterfaceC47489c
    public final void abort() throws IOException {
        synchronized (this) {
            if (this.f429594e) {
                return;
            }
            this.f429594e = true;
            G0 g02 = G0.f406611a;
            Util.closeQuietly(this.f429590a);
            try {
                this.f429592c.invoke();
            } catch (IOException unused) {
            }
        }
    }

    @Override // r40.InterfaceC47489c
    @k
    /* renamed from: body, reason: from getter */
    public final a getF429593d() {
        return this.f429593d;
    }
}
