package com.facebook.soloader;

import com.facebook.soloader.G;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* compiled from: ExoSoSource.java */
/* loaded from: classes16.dex */
public final class q extends G {

    /* compiled from: ExoSoSource.java */
    public final class b extends G.f {

        /* renamed from: b, reason: collision with root package name */
        public final c[] f340881b;

        /* compiled from: ExoSoSource.java */
        public final class a extends G.d {

            /* renamed from: b, reason: collision with root package name */
            public int f340882b;

            public a(a aVar) {
            }

            @Override // com.facebook.soloader.G.d
            public final boolean a() {
                return this.f340882b < b.this.f340881b.length;
            }

            @Override // com.facebook.soloader.G.d
            public final G.e b() throws IOException {
                c[] cVarArr = b.this.f340881b;
                int i12 = this.f340882b;
                this.f340882b = i12 + 1;
                c cVar = cVarArr[i12];
                FileInputStream fileInputStream = new FileInputStream(cVar.f340884d);
                try {
                    return new G.e(cVar, fileInputStream);
                } catch (Throwable th2) {
                    fileInputStream.close();
                    throw th2;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
        
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r10 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(com.facebook.soloader.q r17, com.facebook.soloader.q r18) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.q.b.<init>(com.facebook.soloader.q, com.facebook.soloader.q):void");
        }

        @Override // com.facebook.soloader.G.f
        public final G.b a() {
            return new G.b(this.f340881b);
        }

        @Override // com.facebook.soloader.G.f
        public final G.d b() {
            return new a(null);
        }
    }

    /* compiled from: ExoSoSource.java */
    public static final class c extends G.a {

        /* renamed from: d, reason: collision with root package name */
        public final File f340884d;

        public c(File file, String str, String str2) {
            super(str, str2);
            this.f340884d = file;
        }
    }

    @Override // com.facebook.soloader.G
    public final G.f k() {
        return new b(this, this);
    }
}
