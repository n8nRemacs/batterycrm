package androidx.media3.extractor.text.pgs;

import androidx.media3.extractor.text.e;
import java.util.List;

/* compiled from: PgsSubtitle.java */
/* loaded from: classes.dex */
final class b implements e {

    /* renamed from: b, reason: collision with root package name */
    public final List<androidx.media3.common.text.a> f51316b;

    public b(List<androidx.media3.common.text.a> list) {
        this.f51316b = list;
    }

    @Override // androidx.media3.extractor.text.e
    public final long a(int i12) {
        return 0L;
    }

    @Override // androidx.media3.extractor.text.e
    public final int b() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.e
    public final int c(long j12) {
        return -1;
    }

    @Override // androidx.media3.extractor.text.e
    public final List<androidx.media3.common.text.a> d(long j12) {
        return this.f51316b;
    }
}
