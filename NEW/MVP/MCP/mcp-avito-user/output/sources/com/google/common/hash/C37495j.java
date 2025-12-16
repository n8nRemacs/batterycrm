package com.google.common.hash;

import com.google.common.hash.q;
import com.google.common.hash.t;
import java.io.Serializable;
import java.util.zip.Checksum;

/* compiled from: ChecksumHashFunction.java */
@InterfaceC37497l
@aZ0.j
/* renamed from: com.google.common.hash.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C37495j extends AbstractC37489d implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: b, reason: collision with root package name */
    public final t.b f360262b;

    /* renamed from: c, reason: collision with root package name */
    public final int f360263c = 32;

    /* renamed from: d, reason: collision with root package name */
    public final String f360264d;

    /* compiled from: ChecksumHashFunction.java */
    /* renamed from: com.google.common.hash.j$b */
    public final class b extends AbstractC37486a {

        /* renamed from: b, reason: collision with root package name */
        public final Checksum f360265b;

        public b(Checksum checksum, a aVar) {
            checksum.getClass();
            this.f360265b = checksum;
        }

        @Override // com.google.common.hash.s
        public final q e() {
            long value = this.f360265b.getValue();
            if (C37495j.this.f360263c == 32) {
                char[] cArr = q.f360281b;
                return new q.b((int) value);
            }
            char[] cArr2 = q.f360281b;
            return new q.c(value);
        }

        @Override // com.google.common.hash.AbstractC37486a
        public final void j(byte b12) {
            this.f360265b.update(b12);
        }

        @Override // com.google.common.hash.AbstractC37486a
        public final void l(int i12, byte[] bArr) {
            this.f360265b.update(bArr, 0, i12);
        }
    }

    public C37495j(t.b bVar, String str) {
        this.f360262b = bVar;
        str.getClass();
        this.f360264d = str;
    }

    @Override // com.google.common.hash.r
    public final s a() {
        return new b(this.f360262b.get(), null);
    }

    @Override // com.google.common.hash.r
    public final int b() {
        return this.f360263c;
    }

    public final String toString() {
        return this.f360264d;
    }
}
