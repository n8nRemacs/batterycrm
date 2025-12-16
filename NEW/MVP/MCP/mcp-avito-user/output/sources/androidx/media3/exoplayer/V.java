package androidx.media3.exoplayer;

import android.os.Handler;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.AbstractC23150a;
import androidx.media3.exoplayer.source.InterfaceC23174z;

/* compiled from: MetadataRetriever.java */
@androidx.media3.common.util.J
/* loaded from: classes.dex */
public final class V {

    /* compiled from: MetadataRetriever.java */
    public static final class b {

        /* compiled from: MetadataRetriever.java */
        public final class a implements Handler.Callback {
            /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
            
                throw null;
             */
            @Override // android.os.Handler.Callback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean handleMessage(android.os.Message r3) {
                /*
                    r2 = this;
                    int r0 = r3.what
                    r1 = 0
                    if (r0 == 0) goto L17
                    r3 = 1
                    if (r0 == r3) goto L14
                    r3 = 2
                    if (r0 == r3) goto L12
                    r3 = 3
                    if (r0 == r3) goto L10
                    r3 = 0
                    return r3
                L10:
                    r3 = 0
                    throw r3
                L12:
                    r3 = 0
                    throw r3
                L14:
                    r3 = 0
                    throw r3     // Catch: java.lang.Exception -> L16
                L16:
                    throw r1
                L17:
                    java.lang.Object r3 = r3.obj
                    androidx.media3.common.z r3 = (androidx.media3.common.z) r3
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.V.b.a.handleMessage(android.os.Message):boolean");
            }

            /* compiled from: MetadataRetriever.java */
            /* renamed from: androidx.media3.exoplayer.V$b$a$a, reason: collision with other inner class name */
            public final class C1821a implements A.c {

                /* compiled from: MetadataRetriever.java */
                /* renamed from: androidx.media3.exoplayer.V$b$a$a$a, reason: collision with other inner class name */
                public final class C1822a implements InterfaceC23174z.a {
                    public C1822a(a aVar) {
                    }

                    @Override // androidx.media3.exoplayer.source.InterfaceC23174z.a
                    public final void e(InterfaceC23174z interfaceC23174z) {
                        C1821a.this.getClass();
                        throw null;
                    }

                    @Override // androidx.media3.exoplayer.source.Q.a
                    public final void g(androidx.media3.exoplayer.source.Q q12) {
                        C1821a.this.getClass();
                        throw null;
                    }
                }

                @Override // androidx.media3.exoplayer.source.A.c
                public final void m(AbstractC23150a abstractC23150a, androidx.media3.common.P p12) {
                }
            }
        }
    }
}
