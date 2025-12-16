package com.yandex.mobile.ads.exo.metadata.scte35;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.b41;
import com.yandex.mobile.ads.impl.hg0;
import com.yandex.mobile.ads.impl.o91;
import com.yandex.mobile.ads.impl.or0;
import com.yandex.mobile.ads.impl.pr0;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class a extends b41 {

    /* renamed from: a, reason: collision with root package name */
    private final pr0 f383067a = new pr0();

    /* renamed from: b, reason: collision with root package name */
    private final or0 f383068b = new or0();

    /* renamed from: c, reason: collision with root package name */
    private o91 f383069c;

    @Override // com.yandex.mobile.ads.impl.b41
    public final Metadata a(hg0 hg0Var, ByteBuffer byteBuffer) {
        o91 o91Var = this.f383069c;
        if (o91Var == null || hg0Var.f386131i != o91Var.c()) {
            o91 o91Var2 = new o91(hg0Var.f390953e);
            this.f383069c = o91Var2;
            o91Var2.a(hg0Var.f390953e - hg0Var.f386131i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f383067a.a(iLimit, bArrArray);
        this.f383068b.a(iLimit, bArrArray);
        this.f383068b.d(39);
        long jB2 = (this.f383068b.b(1) << 32) | this.f383068b.b(32);
        this.f383068b.d(20);
        int iB2 = this.f383068b.b(12);
        int iB3 = this.f383068b.b(8);
        this.f383067a.f(14);
        Metadata.Entry entryA = iB3 != 0 ? iB3 != 255 ? iB3 != 4 ? iB3 != 5 ? iB3 != 6 ? null : TimeSignalCommand.a(this.f383067a, jB2, this.f383069c) : SpliceInsertCommand.a(this.f383067a, jB2, this.f383069c) : SpliceScheduleCommand.a(this.f383067a) : PrivateCommand.a(this.f383067a, iB2, jB2) : new SpliceNullCommand();
        return entryA == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(entryA);
    }
}
