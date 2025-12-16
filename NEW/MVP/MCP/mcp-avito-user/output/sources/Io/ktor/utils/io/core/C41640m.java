package io.ktor.utils.io.core;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BytePacketBuilder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/utils/io/core/m;", "Lio/ktor/utils/io/core/E;", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.core.m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41640m extends E {
    public C41640m() {
        this(null, 1, null);
    }

    @Override // io.ktor.utils.io.core.E, java.lang.Appendable
    public final Appendable append(char c12) {
        super.append(c12);
        return this;
    }

    @Override // io.ktor.utils.io.core.E
    /* renamed from: b */
    public final E append(char c12) {
        super.append(c12);
        return this;
    }

    @Override // io.ktor.utils.io.core.E
    /* renamed from: c */
    public final E append(int i12, int i13, CharSequence charSequence) {
        return (C41640m) super.append(i12, i13, charSequence);
    }

    @Override // io.ktor.utils.io.core.E
    /* renamed from: d */
    public final E append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Y61.k
    public final String toString() {
        return "BytePacketBuilder(" + k() + " bytes written)";
    }

    @Y61.k
    public final C41641n y() {
        int iK2 = k();
        io.ktor.utils.io.core.internal.b bVarN = n();
        if (bVarN != null) {
            return new C41641n(bVarN, iK2, this.f400862b);
        }
        C41641n.f400901i.getClass();
        return C41641n.f400902j;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C41640m(io.ktor.utils.io.pool.h hVar, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            io.ktor.utils.io.core.internal.b.f400881j.getClass();
            hVar = io.ktor.utils.io.core.internal.b.f400884m;
        }
        super(hVar);
    }

    @Override // io.ktor.utils.io.core.E, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // io.ktor.utils.io.core.E, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i12, int i13) {
        return (C41640m) super.append(i12, i13, charSequence);
    }

    @Override // io.ktor.utils.io.core.E
    public final void i() {
    }

    @Override // io.ktor.utils.io.core.E
    public final void j(@Y61.k ByteBuffer byteBuffer, int i12, int i13) {
    }
}
