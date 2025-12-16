package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.source.AbstractC36538a;
import com.google.android.exoplayer2.source.InterfaceC36559w;
import com.google.android.exoplayer2.source.y;

/* compiled from: MetadataRetriever.java */
/* loaded from: classes6.dex */
public final class Y {

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
                    com.google.android.exoplayer2.O r3 = (com.google.android.exoplayer2.O) r3
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.Y.b.a.handleMessage(android.os.Message):boolean");
            }

            /* compiled from: MetadataRetriever.java */
            /* renamed from: com.google.android.exoplayer2.Y$b$a$a, reason: collision with other inner class name */
            public final class C10566a implements y.c {

                /* compiled from: MetadataRetriever.java */
                /* renamed from: com.google.android.exoplayer2.Y$b$a$a$a, reason: collision with other inner class name */
                public final class C10567a implements InterfaceC36559w.a {
                    public C10567a(a aVar) {
                    }

                    @Override // com.google.android.exoplayer2.source.InterfaceC36559w.a
                    public final void c(InterfaceC36559w interfaceC36559w) {
                        C10566a.this.getClass();
                        throw null;
                    }

                    @Override // com.google.android.exoplayer2.source.N.a
                    public final void g(com.google.android.exoplayer2.source.N n12) {
                        C10566a.this.getClass();
                        throw null;
                    }
                }

                @Override // com.google.android.exoplayer2.source.y.c
                public final void v(AbstractC36538a abstractC36538a, s0 s0Var) {
                }
            }
        }
    }
}
