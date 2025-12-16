package io.ktor.utils.io.core;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ByteReadPacket.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lio/ktor/utils/io/core/n;", "Lio/ktor/utils/io/core/x;", "a", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: io.ktor.utils.io.core.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41641n extends x {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f400901i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final C41641n f400902j;

    /* compiled from: ByteReadPacket.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/core/n$a;", "", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: io.ktor.utils.io.core.n$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        io.ktor.utils.io.core.internal.b.f400881j.getClass();
        f400902j = new C41641n(io.ktor.utils.io.core.internal.b.f400886o, 0L, io.ktor.utils.io.core.internal.b.f400885n);
    }

    public C41641n(@Y61.k io.ktor.utils.io.core.internal.b bVar, long j12, @Y61.k io.ktor.utils.io.pool.h<io.ktor.utils.io.core.internal.b> hVar) {
        super(bVar, j12, hVar);
        if (this.f400913h) {
            return;
        }
        this.f400913h = true;
    }

    @Y61.k
    public final C41641n G() {
        io.ktor.utils.io.core.internal.b bVarN = n();
        io.ktor.utils.io.core.internal.b bVarH = bVarN.h();
        io.ktor.utils.io.core.internal.b bVarI = bVarN.i();
        if (bVarI != null) {
            io.ktor.utils.io.core.internal.b bVar = bVarH;
            while (true) {
                io.ktor.utils.io.core.internal.b bVarH2 = bVarI.h();
                bVar.m(bVarH2);
                bVarI = bVarI.i();
                if (bVarI == null) {
                    break;
                }
                bVar = bVarH2;
            }
        }
        return new C41641n(bVarH, o(), this.f400907b);
    }

    @Override // io.ktor.utils.io.core.x
    @Y61.l
    public final io.ktor.utils.io.core.internal.b i() {
        return null;
    }

    @Override // io.ktor.utils.io.core.x
    public final int j(@Y61.k ByteBuffer byteBuffer, int i12, int i13) {
        return 0;
    }

    @Y61.k
    public final String toString() {
        return "ByteReadPacket(" + o() + " bytes remaining)";
    }

    public C41641n(@Y61.k io.ktor.utils.io.core.internal.b bVar, @Y61.k io.ktor.utils.io.pool.h<io.ktor.utils.io.core.internal.b> hVar) {
        this(bVar, C41636i.a(bVar), hVar);
    }

    @Override // io.ktor.utils.io.core.x
    public final void b() {
    }
}
