package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.C23110a;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.y;

/* compiled from: StartOffsetExtractorInput.java */
/* loaded from: classes.dex */
final class c extends y {

    /* renamed from: b, reason: collision with root package name */
    public final long f50602b;

    public c(C23191j c23191j, long j12) {
        super(c23191j);
        C23110a.b(c23191j.f50583d >= j12);
        this.f50602b = j12;
    }

    @Override // androidx.media3.extractor.y, androidx.media3.extractor.q
    public final long g() {
        return super.g() - this.f50602b;
    }

    @Override // androidx.media3.extractor.y, androidx.media3.extractor.q
    public final long getLength() {
        return super.getLength() - this.f50602b;
    }

    @Override // androidx.media3.extractor.y, androidx.media3.extractor.q
    public final long getPosition() {
        return super.getPosition() - this.f50602b;
    }
}
