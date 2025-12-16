package DW0;

import aX0.C19833d;
import com.facebook.common.internal.t;
import com.facebook.infer.annotation.Nullsafe;

/* compiled from: ImagePerfMonitor.java */
@Nullsafe
/* loaded from: classes.dex */
public class j implements k {

    /* renamed from: a, reason: collision with root package name */
    @I41.h
    public f f3225a;

    /* renamed from: b, reason: collision with root package name */
    @I41.h
    public com.facebook.drawee.backends.pipeline.info.internal.c f3226b;

    /* renamed from: c, reason: collision with root package name */
    @I41.h
    public com.facebook.drawee.backends.pipeline.info.internal.d f3227c;

    /* renamed from: d, reason: collision with root package name */
    @I41.h
    public com.facebook.drawee.backends.pipeline.info.internal.a f3228d;

    /* renamed from: e, reason: collision with root package name */
    @I41.h
    public C19833d f3229e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3230f;

    public final void b(l lVar, int i12) {
        lVar.f3233c = i12;
    }

    public final void c(boolean z12) {
        this.f3230f = z12;
        if (!z12) {
            if (this.f3226b != null) {
                throw null;
            }
            if (this.f3228d != null) {
                throw null;
            }
            if (this.f3229e != null) {
                throw null;
            }
            return;
        }
        if (this.f3228d == null) {
            this.f3228d = new com.facebook.drawee.backends.pipeline.info.internal.a(null, null, this, null, t.f339828a);
        }
        if (this.f3227c == null) {
            this.f3227c = new com.facebook.drawee.backends.pipeline.info.internal.d(null, null);
        }
        if (this.f3226b == null) {
            this.f3226b = new com.facebook.drawee.backends.pipeline.info.internal.c(null, this);
        }
        if (this.f3225a != null) {
            throw null;
        }
        throw null;
    }

    public final void a(l lVar, int i12) {
    }
}
