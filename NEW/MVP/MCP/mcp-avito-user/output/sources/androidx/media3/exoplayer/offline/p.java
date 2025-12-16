package androidx.media3.exoplayer.offline;

import androidx.media3.common.util.B;
import androidx.media3.common.util.J;
import androidx.media3.exoplayer.offline.l;
import j.P;
import java.io.IOException;

/* compiled from: ProgressiveDownloader.java */
@J
/* loaded from: classes.dex */
public final class p implements l {

    /* renamed from: a, reason: collision with root package name */
    @P
    public l.a f49439a;

    /* renamed from: b, reason: collision with root package name */
    public volatile B<Void, IOException> f49440b;

    /* compiled from: ProgressiveDownloader.java */
    public class a extends B<Void, IOException> {
        public a() {
        }

        @Override // androidx.media3.common.util.B
        public final void a() {
            p.this.getClass();
            throw null;
        }

        @Override // androidx.media3.common.util.B
        public final Void b() {
            p.this.getClass();
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.offline.l
    public final void a(@P l.a aVar) {
        this.f49439a = aVar;
        try {
            this.f49440b = new a();
            throw null;
        } catch (Throwable th2) {
            B<Void, IOException> b12 = this.f49440b;
            b12.getClass();
            b12.f47866c.b();
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.offline.l
    public final void remove() {
        throw null;
    }
}
