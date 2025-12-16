package androidx.media3.extractor.text;

import androidx.media3.common.util.J;
import j.P;
import java.util.List;

/* compiled from: SubtitleOutputBuffer.java */
@J
/* loaded from: classes.dex */
public abstract class i extends androidx.media3.decoder.f implements e {

    /* renamed from: e, reason: collision with root package name */
    @P
    public e f51301e;

    /* renamed from: f, reason: collision with root package name */
    public long f51302f;

    @Override // androidx.media3.extractor.text.e
    public final long a(int i12) {
        e eVar = this.f51301e;
        eVar.getClass();
        return eVar.a(i12) + this.f51302f;
    }

    @Override // androidx.media3.extractor.text.e
    public final int b() {
        e eVar = this.f51301e;
        eVar.getClass();
        return eVar.b();
    }

    @Override // androidx.media3.extractor.text.e
    public final int c(long j12) {
        e eVar = this.f51301e;
        eVar.getClass();
        return eVar.c(j12 - this.f51302f);
    }

    @Override // androidx.media3.extractor.text.e
    public final List<androidx.media3.common.text.a> d(long j12) {
        e eVar = this.f51301e;
        eVar.getClass();
        return eVar.d(j12 - this.f51302f);
    }

    public final void i(long j12, e eVar, long j13) {
        this.f48341c = j12;
        this.f51301e = eVar;
        if (j13 != Long.MAX_VALUE) {
            j12 = j13;
        }
        this.f51302f = j12;
    }
}
